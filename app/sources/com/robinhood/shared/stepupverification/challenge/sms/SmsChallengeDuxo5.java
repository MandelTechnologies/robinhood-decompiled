package com.robinhood.shared.stepupverification.challenge.sms;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SmsChallengeDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeDuxo$submitCode$1$4$challengeErrorResponseHandled$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class SmsChallengeDuxo5 extends FunctionReferenceImpl implements Function0<Unit> {
    SmsChallengeDuxo5(Object obj) {
        super(0, obj, SmsChallengeDuxo.class, "proceed", "proceed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SmsChallengeDuxo) this.receiver).proceed();
    }
}
