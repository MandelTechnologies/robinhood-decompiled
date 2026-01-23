package com.robinhood.android.retirement.p239ui.signup.swipeys;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RetirementSignUpScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class RetirementSignUpScreenKt$SwipeyContentColumn$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    RetirementSignUpScreenKt$SwipeyContentColumn$1$1$1(Object obj) {
        super(0, obj, RetirementSignUpScreenCallbacks.class, "onCtaClicked", "onCtaClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((RetirementSignUpScreenCallbacks) this.receiver).onCtaClicked();
    }
}
