package com.robinhood.analytics.net;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.time.annotation.ElapsedRealtime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: NetworkInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/analytics/net/NetworkInfoProviderModule;", "", "<init>", "()V", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/net/RealNetworkInfoProvider;", "realProvider", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "provideNetworkInfoProvider", "(Lj$/time/Clock;Lcom/robinhood/analytics/net/RealNetworkInfoProvider;)Lcom/robinhood/analytics/net/NetworkInfoProvider;", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.net.NetworkInfoProviderModule, reason: use source file name */
/* loaded from: classes17.dex */
public final class NetworkInfoProvider2 {
    public static final NetworkInfoProvider2 INSTANCE = new NetworkInfoProvider2();

    private NetworkInfoProvider2() {
    }

    public final NetworkInfoProvider provideNetworkInfoProvider(@ElapsedRealtime Clock clock, NetworkInfoProvider3 realProvider) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(realProvider, "realProvider");
        return new NetworkInfoProvider4(clock, realProvider);
    }
}
