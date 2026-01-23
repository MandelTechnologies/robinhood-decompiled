package com.robinhood.shared.stepupverification.challenge.sms;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SmsChallengeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$4$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class SmsChallengeComposable3 extends FunctionReferenceImpl implements Function0<Unit> {
    SmsChallengeComposable3(Object obj) {
        super(0, obj, SmsChallengeDuxo.class, "resendCode", "resendCode()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SmsChallengeDuxo) this.receiver).resendCode();
    }
}
