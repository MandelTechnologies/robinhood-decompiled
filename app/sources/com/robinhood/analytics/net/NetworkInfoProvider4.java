package com.robinhood.analytics.net;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.NetworkConnection;
import com.robinhood.utils.lazy.TimeoutLazy;
import com.robinhood.utils.lazy.TimeoutLazy3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: NetworkInfoProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\r\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/analytics/net/TimeoutLazyNetworkInfoProvider;", "Lcom/robinhood/analytics/net/NetworkInfoProvider;", "j$/time/Clock", Card.Icon.CLOCK, "delegate", "<init>", "(Lj$/time/Clock;Lcom/robinhood/analytics/net/NetworkInfoProvider;)V", "Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "determineConnection", "()Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", "connection$delegate", "Lcom/robinhood/utils/lazy/TimeoutLazy;", "getConnection", "connection", "lib-analytics_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.net.TimeoutLazyNetworkInfoProvider, reason: use source file name */
/* loaded from: classes17.dex */
final class NetworkInfoProvider4 implements NetworkInfoProvider {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NetworkInfoProvider4.class, "connection", "getConnection()Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", 0))};

    /* renamed from: connection$delegate, reason: from kotlin metadata */
    private final TimeoutLazy connection;

    public NetworkInfoProvider4(Clock clock, NetworkInfoProvider delegate) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.connection = TimeoutLazy3.timeoutLazy(clock, durationOfSeconds, new NetworkInfoProvider5(delegate));
    }

    private final NetworkConnection getConnection() {
        return (NetworkConnection) TimeoutLazy3.getValue(this.connection, this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.analytics.net.NetworkInfoProvider
    public NetworkConnection determineConnection() {
        return getConnection();
    }
}
