package com.robinhood.analytics.net;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealNetworkInfoProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/analytics/net/RealNetworkInfoProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/net/RealNetworkInfoProvider;", "connectivityManager", "Ljavax/inject/Provider;", "Landroid/net/ConnectivityManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RealNetworkInfoProvider_Factory implements Factory<NetworkInfoProvider3> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ConnectivityManager> connectivityManager;
    private final Provider<WifiManager> wifiManager;

    @JvmStatic
    public static final RealNetworkInfoProvider_Factory create(Provider<ConnectivityManager> provider, Provider<WifiManager> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final NetworkInfoProvider3 newInstance(ConnectivityManager connectivityManager, WifiManager wifiManager) {
        return INSTANCE.newInstance(connectivityManager, wifiManager);
    }

    public RealNetworkInfoProvider_Factory(Provider<ConnectivityManager> connectivityManager, Provider<WifiManager> wifiManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
        this.connectivityManager = connectivityManager;
        this.wifiManager = wifiManager;
    }

    @Override // javax.inject.Provider
    public NetworkInfoProvider3 get() {
        Companion companion = INSTANCE;
        ConnectivityManager connectivityManager = this.connectivityManager.get();
        Intrinsics.checkNotNullExpressionValue(connectivityManager, "get(...)");
        WifiManager wifiManager = this.wifiManager.get();
        Intrinsics.checkNotNullExpressionValue(wifiManager, "get(...)");
        return companion.newInstance(connectivityManager, wifiManager);
    }

    /* compiled from: RealNetworkInfoProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/analytics/net/RealNetworkInfoProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/analytics/net/RealNetworkInfoProvider_Factory;", "connectivityManager", "Ljavax/inject/Provider;", "Landroid/net/ConnectivityManager;", "wifiManager", "Landroid/net/wifi/WifiManager;", "newInstance", "Lcom/robinhood/analytics/net/RealNetworkInfoProvider;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealNetworkInfoProvider_Factory create(Provider<ConnectivityManager> connectivityManager, Provider<WifiManager> wifiManager) {
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
            return new RealNetworkInfoProvider_Factory(connectivityManager, wifiManager);
        }

        @JvmStatic
        public final NetworkInfoProvider3 newInstance(ConnectivityManager connectivityManager, WifiManager wifiManager) {
            Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
            Intrinsics.checkNotNullParameter(wifiManager, "wifiManager");
            return new NetworkInfoProvider3(connectivityManager, wifiManager);
        }
    }
}
