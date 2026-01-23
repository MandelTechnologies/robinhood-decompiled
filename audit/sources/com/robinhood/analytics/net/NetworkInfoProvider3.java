package com.robinhood.analytics.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import com.robinhood.rosetta.eventlogging.Bandwidth;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.utils.net.wifi.WifiManagers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/analytics/net/RealNetworkInfoProvider;", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "connectivityManager", "Landroid/net/ConnectivityManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "<init>", "(Landroid/net/ConnectivityManager;Landroid/net/wifi/WifiManager;)V", "determineConnection", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.net.RealNetworkInfoProvider, reason: use source file name */
/* loaded from: classes17.dex */
public final class NetworkInfoProvider3 implements NetworkInfoProvider {
    private final ConnectivityManager connectivityManager;
    private final WifiManager wifiManager;

    /* compiled from: NetworkInfoProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.analytics.net.RealNetworkInfoProvider$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkConnection.ConnectionType.values().length];
            try {
                iArr[NetworkConnection.ConnectionType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkInfoProvider3(ConnectivityManager connectivityManager, WifiManager wifiManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
        this.connectivityManager = connectivityManager;
        this.wifiManager = wifiManager;
    }

    @Override // com.robinhood.analytics.net.NetworkInfoProvider
    public NetworkConnection determineConnection() {
        NetworkConnection.ConnectionType connectionType;
        ConnectivityManager connectivityManager = this.connectivityManager;
        WifiManager wifiManager = this.wifiManager;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return new NetworkConnection(NetworkConnection.ConnectionType.NOT_CONNECTED, false, 0.0f, null, null, 30, null);
        }
        boolean zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return new NetworkConnection(NetworkConnection.ConnectionType.NOT_CONNECTED, zIsActiveNetworkMetered, 0.0f, null, null, 28, null);
            }
            if (networkCapabilities.hasTransport(1)) {
                connectionType = NetworkConnection.ConnectionType.WIFI;
            } else if (networkCapabilities.hasTransport(0)) {
                connectionType = NetworkConnection.ConnectionType.CELLULAR;
            } else if (networkCapabilities.hasTransport(2)) {
                connectionType = NetworkConnection.ConnectionType.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(3)) {
                connectionType = NetworkConnection.ConnectionType.ETHERNET;
            } else if (networkCapabilities.hasTransport(4)) {
                connectionType = NetworkConnection.ConnectionType.VPN;
            } else if (networkCapabilities.hasTransport(5)) {
                connectionType = NetworkConnection.ConnectionType.WIFI_AWARE;
            } else {
                connectionType = networkCapabilities.hasTransport(6) ? NetworkConnection.ConnectionType.LOWPAN : NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
            }
            NetworkConnection.ConnectionType connectionType2 = connectionType;
            return new NetworkConnection(connectionType2, zIsActiveNetworkMetered, WhenMappings.$EnumSwitchMapping$0[connectionType2.ordinal()] == 1 ? WifiManagers.getSignalLevelFloat(wifiManager) : 0.0f, new Bandwidth(networkCapabilities.getLinkUpstreamBandwidthKbps(), networkCapabilities.getLinkDownstreamBandwidthKbps(), null, 4, null), null, 16, null);
        } catch (Throwable unused) {
            return new NetworkConnection(NetworkConnection.ConnectionType.CONNECTION_TYPE_UNSPECIFIED, zIsActiveNetworkMetered, 0.0f, null, null, 28, null);
        }
    }
}
