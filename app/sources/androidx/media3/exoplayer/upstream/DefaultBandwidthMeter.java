package androidx.media3.exoplayer.upstream;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.transfers.DebitCardBottomSheetFragment;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes4.dex */
public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static DefaultBandwidthMeter singletonInstance;
    private long bitrateEstimate;
    private final Clock clock;
    private final BandwidthMeter.EventListener.EventDispatcher eventDispatcher;
    private final ImmutableMap<Integer, Long> initialBitrateEstimates;
    private long lastReportedBitrateEstimate;
    private int networkType;
    private int networkTypeOverride;
    private boolean networkTypeOverrideSet;
    private final boolean resetOnNetworkTypeChange;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI = ImmutableList.m1003of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_2G = ImmutableList.m1003of(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_3G = ImmutableList.m1003of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_4G = ImmutableList.m1003of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA = ImmutableList.m1003of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final ImmutableList<Long> DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA = ImmutableList.m1003of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public TransferListener getTransferListener() {
        return this;
    }

    @Override // androidx.media3.datasource.TransferListener
    public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    public static final class Builder {
        private Clock clock;
        private final Context context;
        private Map<Integer, Long> initialBitrateEstimates;
        private boolean resetOnNetworkTypeChange;
        private int slidingWindowMaxWeight;

        public Builder(Context context) {
            this.context = context == null ? null : context.getApplicationContext();
            this.initialBitrateEstimates = getInitialBitrateEstimatesForCountry(Util.getCountryCode(context));
            this.slidingWindowMaxWeight = 2000;
            this.clock = Clock.DEFAULT;
            this.resetOnNetworkTypeChange = true;
        }

        public DefaultBandwidthMeter build() {
            return new DefaultBandwidthMeter(this.context, this.initialBitrateEstimates, this.slidingWindowMaxWeight, this.clock, this.resetOnNetworkTypeChange);
        }

        private static Map<Integer, Long> getInitialBitrateEstimatesForCountry(String str) {
            int[] initialBitrateCountryGroupAssignment = DefaultBandwidthMeter.getInitialBitrateCountryGroupAssignment(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
            map.put(2, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            map.put(3, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_2G.get(initialBitrateCountryGroupAssignment[1]));
            map.put(4, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_3G.get(initialBitrateCountryGroupAssignment[2]));
            map.put(5, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_4G.get(initialBitrateCountryGroupAssignment[3]));
            map.put(10, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_NSA.get(initialBitrateCountryGroupAssignment[4]));
            map.put(9, DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_5G_SA.get(initialBitrateCountryGroupAssignment[5]));
            map.put(7, immutableList.get(initialBitrateCountryGroupAssignment[0]));
            return map;
        }
    }

    public static synchronized DefaultBandwidthMeter getSingletonInstance(Context context) {
        try {
            if (singletonInstance == null) {
                singletonInstance = new Builder(context).build();
            }
        } catch (Throwable th) {
            throw th;
        }
        return singletonInstance;
    }

    private DefaultBandwidthMeter(Context context, Map<Integer, Long> map, int i, Clock clock, boolean z) {
        this.initialBitrateEstimates = ImmutableMap.copyOf((Map) map);
        this.eventDispatcher = new BandwidthMeter.EventListener.EventDispatcher();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock;
        this.resetOnNetworkTypeChange = z;
        if (context != null) {
            NetworkTypeObserver networkTypeObserver = NetworkTypeObserver.getInstance(context);
            int networkType = networkTypeObserver.getNetworkType();
            this.networkType = networkType;
            this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(networkType);
            networkTypeObserver.register(new NetworkTypeObserver.Listener() { // from class: androidx.media3.exoplayer.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0
                @Override // androidx.media3.common.util.NetworkTypeObserver.Listener
                public final void onNetworkTypeChanged(int i2) throws Throwable {
                    this.f$0.onNetworkTypeChanged(i2);
                }
            });
            return;
        }
        this.networkType = 0;
        this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(0);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.eventDispatcher.addListener(handler, eventListener);
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    public void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        try {
            if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                if (this.streamCount == 0) {
                    this.sampleStartTimeMs = this.clock.elapsedRealtime();
                }
                this.streamCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    public synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
            this.sampleBytesTransferred += i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0072, TRY_ENTER, TryCatch #1 {all -> 0x0072, blocks: (B:3:0x0001, B:7:0x0009, B:11:0x0011, B:13:0x002e, B:23:0x0060, B:22:0x0055), top: B:38:0x0001 }] */
    @Override // androidx.media3.datasource.TransferListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) throws Throwable {
        Throwable th;
        DefaultBandwidthMeter defaultBandwidthMeter;
        try {
            try {
                if (isTransferAtFullNetworkSpeed(dataSpec, z)) {
                    Assertions.checkState(this.streamCount > 0);
                    long jElapsedRealtime = this.clock.elapsedRealtime();
                    int i = (int) (jElapsedRealtime - this.sampleStartTimeMs);
                    this.totalElapsedTimeMs += i;
                    long j = this.totalBytesTransferred;
                    long j2 = this.sampleBytesTransferred;
                    this.totalBytesTransferred = j + j2;
                    if (i > 0) {
                        this.slidingPercentile.addSample((int) Math.sqrt(j2), (j2 * 8000.0f) / i);
                        if (this.totalElapsedTimeMs < 2000) {
                            try {
                                if (this.totalBytesTransferred >= 524288) {
                                    this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                                }
                                defaultBandwidthMeter = this;
                                defaultBandwidthMeter.maybeNotifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
                                defaultBandwidthMeter.sampleStartTimeMs = jElapsedRealtime;
                                defaultBandwidthMeter.sampleBytesTransferred = 0L;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                    } else {
                        defaultBandwidthMeter = this;
                    }
                    defaultBandwidthMeter.streamCount--;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void onNetworkTypeChanged(int i) throws Throwable {
        Throwable th;
        try {
            try {
                int i2 = this.networkType;
                if (i2 != 0) {
                    try {
                        if (!this.resetOnNetworkTypeChange) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (this.networkTypeOverrideSet) {
                    i = this.networkTypeOverride;
                }
                if (i2 == i) {
                    return;
                }
                this.networkType = i;
                if (i == 1 || i == 0 || i == 8) {
                    return;
                }
                this.bitrateEstimate = getInitialBitrateEstimateForNetworkType(i);
                long jElapsedRealtime = this.clock.elapsedRealtime();
                maybeNotifyBandwidthSample(this.streamCount > 0 ? (int) (jElapsedRealtime - this.sampleStartTimeMs) : 0, this.sampleBytesTransferred, this.bitrateEstimate);
                this.sampleStartTimeMs = jElapsedRealtime;
                this.sampleBytesTransferred = 0L;
                this.totalBytesTransferred = 0L;
                this.totalElapsedTimeMs = 0L;
                this.slidingPercentile.reset();
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private void maybeNotifyBandwidthSample(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.lastReportedBitrateEstimate) {
            return;
        }
        this.lastReportedBitrateEstimate = j2;
        this.eventDispatcher.bandwidthSample(i, j, j2);
    }

    private long getInitialBitrateEstimateForNetworkType(int i) {
        Long l = this.initialBitrateEstimates.get(Integer.valueOf(i));
        if (l == null) {
            l = this.initialBitrateEstimates.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean isTransferAtFullNetworkSpeed(DataSpec dataSpec, boolean z) {
        return z && !dataSpec.isFlagSet(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] getInitialBitrateCountryGroupAssignment(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals(CountryCode.COUNTRY_CODE_AS)) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals(CountryCode.COUNTRY_CODE_AT)) {
                    c = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals(CountryCode.COUNTRY_CODE_AU)) {
                    c = '\f';
                    break;
                }
                break;
            case DebitCardBottomSheetFragment.editExpirationDateRequestCode /* 2102 */:
                if (str.equals("AW")) {
                    c = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals(CountryCode.COUNTRY_CODE_BE)) {
                    c = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals(CountryCode.COUNTRY_CODE_BG)) {
                    c = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals(CountryCode.COUNTRY_CODE_BN)) {
                    c = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c = '\"';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = TickerInputView.CURRENCY_SYMBOL;
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c = TickerInputView.PERCENT_SYMBOL;
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c = '&';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals(CountryCode.COUNTRY_CODE_CK)) {
                    c = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals(CountryCode.COUNTRY_CODE_CN)) {
                    c = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals(CountryCode.COUNTRY_CODE_CY)) {
                    c = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals(CountryCode.COUNTRY_CODE_CZ)) {
                    c = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals(CountryCode.COUNTRY_CODE_DE)) {
                    c = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals(CountryCode.COUNTRY_CODE_DK)) {
                    c = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c = '<';
                    break;
                }
                break;
            case 2208:
                if (str.equals(CountryCode.COUNTRY_CODE_EE)) {
                    c = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c = '>';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals(CountryCode.COUNTRY_CODE_ES)) {
                    c = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals(CountryCode.COUNTRY_CODE_FI)) {
                    c = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals(CountryCode.COUNTRY_CODE_FJ)) {
                    c = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals(CountryCode.COUNTRY_CODE_FM)) {
                    c = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals(CountryCode.COUNTRY_CODE_FR)) {
                    c = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals(CountryCode.COUNTRY_CODE_GB)) {
                    c = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_LT;
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = Matrix.MATRIX_TYPE_RANDOM_REGULAR;
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals(CountryCode.COUNTRY_CODE_GR)) {
                    c = Matrix.MATRIX_TYPE_RANDOM_UT;
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals(CountryCode.COUNTRY_CODE_GU)) {
                    c = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals(CountryCode.COUNTRY_CODE_HK)) {
                    c = Matrix.MATRIX_TYPE_ZERO;
                    break;
                }
                break;
            case 2314:
                if (str.equals(CountryCode.COUNTRY_CODE_HR)) {
                    c = '[';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = '\\';
                    break;
                }
                break;
            case 2317:
                if (str.equals(CountryCode.COUNTRY_CODE_HU)) {
                    c = ']';
                    break;
                }
                break;
            case 2331:
                if (str.equals(CountryCode.COUNTRY_CODE_ID)) {
                    c = '^';
                    break;
                }
                break;
            case 2332:
                if (str.equals(CountryCode.COUNTRY_CODE_IE)) {
                    c = '_';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = '`';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = 'a';
                    break;
                }
                break;
            case 2341:
                if (str.equals(CountryCode.COUNTRY_CODE_IN)) {
                    c = 'b';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'c';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'd';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c = 'e';
                    break;
                }
                break;
            case 2346:
                if (str.equals(CountryCode.COUNTRY_CODE_IS)) {
                    c = 'f';
                    break;
                }
                break;
            case 2347:
                if (str.equals(CountryCode.COUNTRY_CODE_IT)) {
                    c = 'g';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'h';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'i';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'j';
                    break;
                }
                break;
            case 2374:
                if (str.equals(CountryCode.COUNTRY_CODE_JP)) {
                    c = 'k';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'l';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c = 'm';
                    break;
                }
                break;
            case 2397:
                if (str.equals(CountryCode.COUNTRY_CODE_KH)) {
                    c = 'n';
                    break;
                }
                break;
            case 2398:
                if (str.equals(CountryCode.COUNTRY_CODE_KI)) {
                    c = 'o';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'p';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals(CountryCode.COUNTRY_CODE_KR)) {
                    c = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals(CountryCode.COUNTRY_CODE_LA)) {
                    c = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals(CountryCode.COUNTRY_CODE_LI)) {
                    c = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals(CountryCode.COUNTRY_CODE_LT)) {
                    c = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals(CountryCode.COUNTRY_CODE_LU)) {
                    c = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals(CountryCode.COUNTRY_CODE_LV)) {
                    c = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals(CountryCode.COUNTRY_CODE_MH)) {
                    c = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals(CountryCode.COUNTRY_CODE_MN)) {
                    c = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals(CountryCode.COUNTRY_CODE_MO)) {
                    c = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals(CountryCode.COUNTRY_CODE_MP)) {
                    c = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals(CountryCode.COUNTRY_CODE_MT)) {
                    c = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals(CountryCode.COUNTRY_CODE_MY)) {
                    c = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals(CountryCode.COUNTRY_CODE_NC)) {
                    c = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 154;
                    break;
                }
                break;
            case 2488:
                if (str.equals("NF")) {
                    c = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals(CountryCode.COUNTRY_CODE_NL)) {
                    c = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals(CountryCode.COUNTRY_CODE_NO)) {
                    c = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = 160;
                    break;
                }
                break;
            case 2500:
                if (str.equals(CountryCode.COUNTRY_CODE_NR)) {
                    c = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals(CountryCode.COUNTRY_CODE_NU)) {
                    c = 162;
                    break;
                }
                break;
            case 2508:
                if (str.equals(CountryCode.COUNTRY_CODE_NZ)) {
                    c = 163;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = 167;
                    break;
                }
                break;
            case 2551:
                if (str.equals(CountryCode.COUNTRY_CODE_PG)) {
                    c = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals(CountryCode.COUNTRY_CODE_PH)) {
                    c = 169;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals(CountryCode.COUNTRY_CODE_PL)) {
                    c = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = 174;
                    break;
                }
                break;
            case 2564:
                if (str.equals(CountryCode.COUNTRY_CODE_PT)) {
                    c = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals(CountryCode.COUNTRY_CODE_PW)) {
                    c = 176;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c = 177;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals(CountryCode.COUNTRY_CODE_RO)) {
                    c = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = 182;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = 183;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals(CountryCode.COUNTRY_CODE_SB)) {
                    c = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals(CountryCode.COUNTRY_CODE_SE)) {
                    c = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals(CountryCode.COUNTRY_CODE_SG)) {
                    c = 189;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals(CountryCode.COUNTRY_CODE_SI)) {
                    c = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals(CountryCode.COUNTRY_CODE_SK)) {
                    c = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals(CountryCode.COUNTRY_CODE_TH)) {
                    c = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals(CountryCode.COUNTRY_CODE_TL)) {
                    c = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals(CountryCode.COUNTRY_CODE_TO)) {
                    c = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = 215;
                    break;
                }
                break;
            case 2690:
                if (str.equals(CountryCode.COUNTRY_CODE_TV)) {
                    c = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals(CountryCode.COUNTRY_CODE_TW)) {
                    c = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals(CountryCode.COUNTRY_CODE_US)) {
                    c = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 223;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c = 224;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 225;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 226;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 227;
                    break;
                }
                break;
            case 2739:
                if (str.equals(CountryCode.COUNTRY_CODE_VI)) {
                    c = 228;
                    break;
                }
                break;
            case 2744:
                if (str.equals(CountryCode.COUNTRY_CODE_VN)) {
                    c = 229;
                    break;
                }
                break;
            case 2751:
                if (str.equals(CountryCode.COUNTRY_CODE_VU)) {
                    c = 230;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 231;
                    break;
                }
                break;
            case 2780:
                if (str.equals(CountryCode.COUNTRY_CODE_WS)) {
                    c = 232;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 233;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 234;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 235;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 236;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 237;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 238;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 4:
            case 17:
            case 29:
            case '2':
            case '9':
            case 'q':
            case 't':
            case 202:
            case 225:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 2, 3, 4, 1};
            case 2:
            case 204:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 3:
            case ')':
                return new int[]{2, 4, 3, 4, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 6:
            case 165:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '\b':
            case '?':
            case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 2, 2, 2, 1, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
            case '=':
            case ']':
            case 'f':
            case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
            case 188:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 3, 1, 1, 3, 0};
            case '\r':
                return new int[]{2, 2, 3, 4, 2, 2};
            case 14:
            case '3':
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
            case 144:
            case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
            case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
            case 224:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case '7':
            case 128:
            case SDK_ASSET_ICON_EXTERNAL_VALUE:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 16:
            case 'j':
            case SDK_ASSET_ICON_PIN_VALUE:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 2, 4, 2};
            case 19:
                return new int[]{0, 0, 1, 0, 1, 2};
            case 20:
            case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
            case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
            case SDK_ASSET_ICON_CLOCK_VALUE:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 21:
            case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 3, 1, 3, 4, 2};
            case 23:
            case 'T':
            case '\\':
            case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
            case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
            case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 25:
            case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
            case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 27:
                return new int[]{3, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 30:
                return new int[]{1, 1, 1, 1, 2, 4};
            case 31:
                return new int[]{3, 2, 1, 1, 2, 2};
            case ' ':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '!':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '\"':
                return new int[]{1, 2, 3, 3, 2, 2};
            case '#':
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '$':
            case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                return new int[]{0, 2, 1, 2, 3, 3};
            case '%':
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                return new int[]{3, 3, 2, 2, 2, 2};
            case '&':
                return new int[]{4, 2, 4, 2, 2, 2};
            case '\'':
            case '>':
            case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                return new int[]{3, 4, 3, 3, 2, 2};
            case '(':
                return new int[]{0, 1, 0, 0, 0, 2};
            case '+':
            case SDK_ASSET_ICON_INCOME_VALUE:
                return new int[]{0, 1, 2, 2, 2, 2};
            case ',':
            case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                return new int[]{4, 3, 3, 4, 2, 2};
            case '-':
                return new int[]{2, 0, 1, 1, 3, 1};
            case '.':
                return new int[]{2, 3, 3, 2, 2, 2};
            case '/':
            case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                return new int[]{2, 4, 4, 4, 2, 2};
            case '0':
            case 'o':
            case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
            case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                return new int[]{4, 2, 4, 4, 2, 2};
            case '1':
                return new int[]{2, 3, 0, 1, 2, 2};
            case '4':
                return new int[]{1, 0, 1, 0, 0, 2};
            case '5':
                return new int[]{0, 0, 2, 0, 1, 2};
            case '6':
                return new int[]{0, 1, 4, 2, 2, 1};
            case '8':
                return new int[]{0, 0, 2, 0, 0, 2};
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ';':
            case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                return new int[]{3, 3, 4, 4, 2, 2};
            case '<':
                return new int[]{1, 3, 2, 1, 2, 2};
            case '@':
                return new int[]{0, 0, 0, 0, 1, 0};
            case 'A':
                return new int[]{4, 3, 4, 4, 4, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 2, 2, 3, 2, 2};
            case SDK_ASSET_ICON_HOME_VALUE:
            case 155:
            case 192:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{4, 2, 4, 0, 2, 2};
            case 'F':
                return new int[]{0, 2, 2, 0, 2, 2};
            case SDK_ASSET_ICON_GUIDE_VALUE:
                return new int[]{1, 1, 1, 1, 0, 2};
            case SDK_ASSET_ICON_GLOBE_VALUE:
                return new int[]{3, 4, 0, 0, 2, 2};
            case 'I':
                return new int[]{1, 1, 3, 2, 2, 2};
            case 'J':
                return new int[]{2, 2, 0, 0, 2, 2};
            case 'K':
                return new int[]{1, 1, 0, 2, 2, 2};
            case 'L':
                return new int[]{3, 2, 3, 3, 2, 2};
            case 'M':
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'N':
                return new int[]{3, 3, 3, 2, 2, 2};
            case 'O':
            case 'a':
            case 'h':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'P':
            case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 'Q':
            case SDK_ASSET_ICON_CANCEL_VALUE:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 'R':
                return new int[]{3, 4, 4, 2, 2, 2};
            case 'S':
                return new int[]{2, 1, 1, 3, 2, 2};
            case 'U':
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'V':
                return new int[]{2, 1, 2, 1, 2, 2};
            case 'W':
                return new int[]{2, 2, 4, 3, 3, 2};
            case 'X':
                return new int[]{4, 4, 1, 2, 2, 2};
            case 'Y':
                return new int[]{3, 1, 1, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 0, 1, 1, 0};
            case '[':
            case 's':
                return new int[]{1, 0, 0, 0, 0, 2};
            case '^':
                return new int[]{3, 1, 3, 3, 2, 4};
            case '_':
                return new int[]{1, 1, 1, 1, 1, 2};
            case '`':
                return new int[]{1, 2, 2, 3, 4, 2};
            case 'b':
                return new int[]{1, 1, 3, 2, 2, 3};
            case 'c':
                return new int[]{3, 2, 2, 0, 2, 2};
            case 'd':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'e':
                return new int[]{4, 2, 3, 3, 4, 3};
            case 'g':
                return new int[]{0, 1, 1, 2, 1, 2};
            case 'i':
                return new int[]{2, 4, 3, 1, 2, 2};
            case 'k':
                return new int[]{0, 3, 2, 3, 4, 2};
            case 'l':
                return new int[]{3, 2, 1, 1, 1, 2};
            case 'm':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'n':
                return new int[]{1, 0, 4, 2, 2, 2};
            case 'p':
            case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 'r':
                return new int[]{0, 2, 2, 4, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 3, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 1, 1, 2, 2, 2};
            case 'x':
                return new int[]{2, 2, 1, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
            case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                return new int[]{3, 2, 3, 3, 4, 2};
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                return new int[]{4, 3, 3, 3, 2, 2};
            case '}':
                return new int[]{0, 1, 0, 1, 0, 2};
            case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                return new int[]{4, 0, 3, 2, 1, 3};
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 131:
                return new int[]{1, 0, 0, 0, 2, 2};
            case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                return new int[]{2, 0, 0, 1, 3, 2};
            case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                return new int[]{1, 2, 2, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
            case 211:
            case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
            case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                return new int[]{2, 0, 2, 2, 2, 2};
            case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                return new int[]{0, 2, 4, 4, 3, 1};
            case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                return new int[]{2, 1, 2, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                return new int[]{3, 1, 0, 2, 2, 2};
            case 147:
                return new int[]{3, 2, 1, 3, 4, 2};
            case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                return new int[]{3, 2, 2, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                return new int[]{2, 4, 4, 4, 3, 2};
            case 150:
                return new int[]{1, 0, 4, 1, 1, 0};
            case 151:
            case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                return new int[]{3, 1, 2, 2, 2, 2};
            case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                return new int[]{3, 4, 3, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 156:
                return new int[]{3, 4, 2, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                return new int[]{2, 1, 4, 3, 0, 4};
            case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                return new int[]{0, 0, 3, 0, 0, 2};
            case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                return new int[]{2, 2, 4, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                return new int[]{0, 0, 1, 2, 4, 2};
            case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                return new int[]{2, 3, 1, 2, 4, 2};
            case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 167:
                return new int[]{2, 2, 3, 1, 2, 2};
            case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                return new int[]{2, 1, 2, 3, 2, 1};
            case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                return new int[]{3, 3, 3, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                return new int[]{1, 0, 2, 2, 4, 4};
            case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                return new int[]{2, 0, 2, 1, 2, 0};
            case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                return new int[]{3, 4, 1, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                return new int[]{2, 2, 4, 1, 2, 2};
            case f2773x8d9721ad:
                return new int[]{1, 4, 4, 4, 4, 2};
            case f2780x600b66fe:
                return new int[]{0, 3, 2, 3, 1, 2};
            case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                return new int[]{0, 0, 1, 1, 3, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 182:
                return new int[]{1, 0, 0, 1, 3, 3};
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                return new int[]{3, 3, 2, 0, 2, 2};
            case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                return new int[]{3, 1, 1, 2, 2, 0};
            case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                return new int[]{4, 2, 4, 3, 2, 2};
            case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                return new int[]{2, 3, 3, 3, 1, 1};
            case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                return new int[]{0, 1, 1, 1, 2, 2};
            case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                return new int[]{4, 4, 3, 2, 2, 2};
            case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                return new int[]{2, 2, 3, 4, 4, 2};
            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                return new int[]{2, 4, 4, 1, 2, 2};
            case 200:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 201:
                return new int[]{2, 3, 2, 1, 2, 2};
            case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                return new int[]{3, 2, 1, 2, 2, 2};
            case SDK_ASSET_ICON_COMMENT_VALUE:
                return new int[]{3, 4, 1, 0, 2, 2};
            case SDK_ASSET_ICON_OVERRIDE_VALUE:
                return new int[]{3, 1, 1, 1, 2, 2};
            case SDK_ASSET_ICON_PAUSE_VALUE:
                return new int[]{3, 2, 4, 3, 2, 2};
            case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                return new int[]{2, 4, 1, 0, 2, 2};
            case SDK_ASSET_ICON_PROGRESS_VALUE:
                return new int[]{0, 0, 0, 0, 0, 0};
            case SDK_ASSET_ICON_QUESTION_VALUE:
                return new int[]{3, 4, 2, 1, 3, 2};
            case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                return new int[]{3, 3, 2, 3, 4, 2};
            case SDK_ASSET_ICON_SUBMIT_VALUE:
                return new int[]{2, 2, 4, 1, 3, 1};
            case SDK_ASSET_ICON_SUBTRACT_VALUE:
                return new int[]{2, 1, 1, 2, 1, 2};
            case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                return new int[]{1, 2, 3, 4, 3, 2};
            case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                return new int[]{2, 2, 1, 1, 2, 4};
            case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                return new int[]{0, 2, 1, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                return new int[]{0, 0, 1, 2, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                return new int[]{1, 2, 1, 1, 2, 2};
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                return new int[]{2, 4, 2, 1, 1, 2};
            case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                return new int[]{4, 4, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }
}
