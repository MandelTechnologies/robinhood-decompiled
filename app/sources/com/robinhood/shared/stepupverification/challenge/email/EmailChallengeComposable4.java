package com.robinhood.shared.stepupverification.challenge.email;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EmailChallengeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$5$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class EmailChallengeComposable4 extends FunctionReferenceImpl implements Function0<Unit> {
    EmailChallengeComposable4(Object obj) {
        super(0, obj, EmailChallengeDuxo.class, "fallback", "fallback()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EmailChallengeDuxo) this.receiver).fallback();
    }
}
