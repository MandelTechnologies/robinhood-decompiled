package com.robinhood.android.equitytradeladder.bin;

import com.robinhood.android.equitytradeladder.prefs.EquityTradeLadderZoomLevelPref;
import com.robinhood.prefs.StringToLongMapPreference;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: EquityTradeLadderBinManager.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;", "", "zoomLevelPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "<init>", "(Lcom/robinhood/prefs/StringToLongMapPreference;)V", "pennyStockThreshold", "Ljava/math/BigDecimal;", "highPriceStockThreshold", "toPrefKey", "", "Lcom/robinhood/android/equitytradeladder/bin/BinIntervals;", "getSavedScale", "", "intervals", "defaultScale", "saveScale", "", "scale", "getOptimalBinConfiguration", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager$BinConfiguration;", "previousClosePrice", "getDefaultConfiguration", "updateConfigurationScale", "currentConfig", "newScale", "BinConfiguration", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderBinManager {
    public static final int HIGH_PRICE_DEFAULT_INTERVAL = 6;
    private static final String HIGH_PRICE_PREF_KEY = "high";
    private static final String PENNY_PREF_KEY = "penny";
    public static final int PENNY_STOCK_DEFAULT_INTERVAL = 1;
    public static final int STANDARD_DEFAULT_INTERVAL = 3;
    private static final String STANDARD_PREF_KEY = "standard";
    private final BigDecimal highPriceStockThreshold;
    private final BigDecimal pennyStockThreshold;
    private final StringToLongMapPreference zoomLevelPref;
    public static final int $stable = 8;

    /* compiled from: EquityTradeLadderBinManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityTradeLadderBinManager2.values().length];
            try {
                iArr[EquityTradeLadderBinManager2.PENNY_STOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityTradeLadderBinManager2.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityTradeLadderBinManager2.HIGH_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EquityTradeLadderBinManager(@EquityTradeLadderZoomLevelPref StringToLongMapPreference zoomLevelPref) {
        Intrinsics.checkNotNullParameter(zoomLevelPref, "zoomLevelPref");
        this.zoomLevelPref = zoomLevelPref;
        this.pennyStockThreshold = new BigDecimal("1.00");
        this.highPriceStockThreshold = new BigDecimal("500.00");
    }

    /* compiled from: EquityTradeLadderBinManager.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager$BinConfiguration;", "", "scale", "", "intervals", "Lcom/robinhood/android/equitytradeladder/bin/BinIntervals;", "<init>", "(ILcom/robinhood/android/equitytradeladder/bin/BinIntervals;)V", "getScale", "()I", "getIntervals", "()Lcom/robinhood/android/equitytradeladder/bin/BinIntervals;", "increment", "Ljava/math/BigDecimal;", "getIncrement", "()Ljava/math/BigDecimal;", "availableIntervals", "", "getAvailableIntervals", "()Ljava/util/List;", "getIncrementForScale", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BinConfiguration {
        public static final int $stable = 0;
        private final EquityTradeLadderBinManager2 intervals;
        private final int scale;

        public static /* synthetic */ BinConfiguration copy$default(BinConfiguration binConfiguration, int i, EquityTradeLadderBinManager2 equityTradeLadderBinManager2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = binConfiguration.scale;
            }
            if ((i2 & 2) != 0) {
                equityTradeLadderBinManager2 = binConfiguration.intervals;
            }
            return binConfiguration.copy(i, equityTradeLadderBinManager2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getScale() {
            return this.scale;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityTradeLadderBinManager2 getIntervals() {
            return this.intervals;
        }

        public final BinConfiguration copy(int scale, EquityTradeLadderBinManager2 intervals) {
            Intrinsics.checkNotNullParameter(intervals, "intervals");
            return new BinConfiguration(scale, intervals);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BinConfiguration)) {
                return false;
            }
            BinConfiguration binConfiguration = (BinConfiguration) other;
            return this.scale == binConfiguration.scale && this.intervals == binConfiguration.intervals;
        }

        public int hashCode() {
            return (Integer.hashCode(this.scale) * 31) + this.intervals.hashCode();
        }

        public String toString() {
            return "BinConfiguration(scale=" + this.scale + ", intervals=" + this.intervals + ")";
        }

        public BinConfiguration(int i, EquityTradeLadderBinManager2 intervals) {
            Intrinsics.checkNotNullParameter(intervals, "intervals");
            this.scale = i;
            this.intervals = intervals;
        }

        public final int getScale() {
            return this.scale;
        }

        public final EquityTradeLadderBinManager2 getIntervals() {
            return this.intervals;
        }

        public final BigDecimal getIncrement() {
            return getIncrementForScale(this.scale);
        }

        public final List<BigDecimal> getAvailableIntervals() {
            return this.intervals.getIntervals();
        }

        public final BigDecimal getIncrementForScale(int scale) {
            return this.intervals.getIntervals().get(RangesKt.coerceIn(scale - 1, 0, r0.size() - 1));
        }
    }

    private final String toPrefKey(EquityTradeLadderBinManager2 equityTradeLadderBinManager2) {
        int i = WhenMappings.$EnumSwitchMapping$0[equityTradeLadderBinManager2.ordinal()];
        if (i == 1) {
            return PENNY_PREF_KEY;
        }
        if (i == 2) {
            return STANDARD_PREF_KEY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "high";
    }

    private final int getSavedScale(EquityTradeLadderBinManager2 intervals, int defaultScale) {
        return RangesKt.coerceIn((int) this.zoomLevelPref.get(toPrefKey(intervals), defaultScale), 1, intervals.getIntervals().size());
    }

    private final void saveScale(EquityTradeLadderBinManager2 intervals, int scale) {
        this.zoomLevelPref.set(toPrefKey(intervals), scale);
    }

    public final BinConfiguration getOptimalBinConfiguration(BigDecimal previousClosePrice) {
        EquityTradeLadderBinManager2 equityTradeLadderBinManager2;
        Intrinsics.checkNotNullParameter(previousClosePrice, "previousClosePrice");
        if (previousClosePrice.compareTo(this.pennyStockThreshold) < 0) {
            equityTradeLadderBinManager2 = EquityTradeLadderBinManager2.PENNY_STOCK;
        } else {
            equityTradeLadderBinManager2 = previousClosePrice.compareTo(this.highPriceStockThreshold) < 0 ? EquityTradeLadderBinManager2.STANDARD : EquityTradeLadderBinManager2.HIGH_PRICE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[equityTradeLadderBinManager2.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 6;
            }
        }
        return new BinConfiguration(getSavedScale(equityTradeLadderBinManager2, i2), equityTradeLadderBinManager2);
    }

    public static /* synthetic */ BinConfiguration getDefaultConfiguration$default(EquityTradeLadderBinManager equityTradeLadderBinManager, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        return equityTradeLadderBinManager.getDefaultConfiguration(i);
    }

    public final BinConfiguration getDefaultConfiguration(int defaultScale) {
        EquityTradeLadderBinManager2 equityTradeLadderBinManager2 = EquityTradeLadderBinManager2.STANDARD;
        return new BinConfiguration(getSavedScale(equityTradeLadderBinManager2, defaultScale), equityTradeLadderBinManager2);
    }

    public final BinConfiguration updateConfigurationScale(BinConfiguration currentConfig, int newScale) {
        Intrinsics.checkNotNullParameter(currentConfig, "currentConfig");
        int iCoerceIn = RangesKt.coerceIn(newScale, 1, currentConfig.getIntervals().getIntervals().size());
        saveScale(currentConfig.getIntervals(), iCoerceIn);
        return BinConfiguration.copy$default(currentConfig, iCoerceIn, null, 2, null);
    }
}
