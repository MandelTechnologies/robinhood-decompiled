package com.robinhood.analytics.net;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.card.p311db.Card;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/analytics/net/NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/net/RealNetworkInfoProvider;", "realProvider", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/analytics/net/NetworkInfoProvider;", "Ljavax/inject/Provider;", "Companion", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory implements Factory<NetworkInfoProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Clock> clock;
    private final Provider<NetworkInfoProvider3> realProvider;

    @JvmStatic
    public static final NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory create(Provider<Clock> provider, Provider<NetworkInfoProvider3> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final NetworkInfoProvider provideNetworkInfoProvider(Clock clock, NetworkInfoProvider3 networkInfoProvider3) {
        return INSTANCE.provideNetworkInfoProvider(clock, networkInfoProvider3);
    }

    public NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory(Provider<Clock> clock, Provider<NetworkInfoProvider3> realProvider) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(realProvider, "realProvider");
        this.clock = clock;
        this.realProvider = realProvider;
    }

    @Override // javax.inject.Provider
    public NetworkInfoProvider get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        NetworkInfoProvider3 networkInfoProvider3 = this.realProvider.get();
        Intrinsics.checkNotNullExpressionValue(networkInfoProvider3, "get(...)");
        return companion.provideNetworkInfoProvider(clock, networkInfoProvider3);
    }

    /* compiled from: NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/analytics/net/NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/net/RealNetworkInfoProvider;", "realProvider", "Lcom/robinhood/analytics/net/NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/analytics/net/NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory;", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "provideNetworkInfoProvider", "(Lj$/time/Clock;Lcom/robinhood/analytics/net/RealNetworkInfoProvider;)Lcom/robinhood/analytics/net/NetworkInfoProvider;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory create(Provider<Clock> clock, Provider<NetworkInfoProvider3> realProvider) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(realProvider, "realProvider");
            return new NetworkInfoProviderModule_ProvideNetworkInfoProviderFactory(clock, realProvider);
        }

        @JvmStatic
        public final NetworkInfoProvider provideNetworkInfoProvider(Clock clock, NetworkInfoProvider3 realProvider) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(realProvider, "realProvider");
            Object objCheckNotNull = Preconditions.checkNotNull(NetworkInfoProvider2.INSTANCE.provideNetworkInfoProvider(clock, realProvider), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (NetworkInfoProvider) objCheckNotNull;
        }
    }
}
