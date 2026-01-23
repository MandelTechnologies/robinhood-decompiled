package com.twilio.twilsock.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Twilsock.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class TwilsockImpl$createInitRequest$1 extends FunctionReferenceImpl implements Function1<TwilsockRequest, Unit> {
    TwilsockImpl$createInitRequest$1(Object obj) {
        super(1, obj, TwilsockImpl.class, "onRequestFinished", "onRequestFinished(Lcom/twilio/twilsock/client/TwilsockRequest;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TwilsockRequest twilsockRequest) {
        invoke2(twilsockRequest);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TwilsockRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((TwilsockImpl) this.receiver).onRequestFinished(p0);
    }
}
