package com.twilio.conversations.twilsock;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TwilsockWrapper.kt */
@Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.twilio.conversations.twilsock.TwilsockWrapper$createTwilsock$1$1$4, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class TwilsockWrapper2 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    TwilsockWrapper2(Object obj) {
        super(2, obj, TwilsockWrapper.class, "notifyTargetedMessageReceived", "notifyTargetedMessageReceived(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((TwilsockWrapper) this.receiver).notifyTargetedMessageReceived(p0, p1);
    }
}
