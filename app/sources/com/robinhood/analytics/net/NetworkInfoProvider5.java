package com.robinhood.analytics.net;

import com.robinhood.rosetta.eventlogging.NetworkConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkInfoProvider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.net.TimeoutLazyNetworkInfoProvider$connection$2, reason: use source file name */
/* loaded from: classes17.dex */
/* synthetic */ class NetworkInfoProvider5 extends FunctionReferenceImpl implements Function0<NetworkConnection> {
    NetworkInfoProvider5(Object obj) {
        super(0, obj, NetworkInfoProvider.class, "determineConnection", "determineConnection()Lcom/robinhood/rosetta/eventlogging/NetworkConnection;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NetworkConnection invoke() {
        return ((NetworkInfoProvider) this.receiver).determineConnection();
    }
}
