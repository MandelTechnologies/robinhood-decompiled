package com.robinhood.android.retirement.p239ui.signup.swipeys;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: RetirementSignUpScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class RetirementSignUpScreenKt$Swipeys$3$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    RetirementSignUpScreenKt$Swipeys$3$1(Object obj) {
        super(1, obj, RetirementSignUpScreenCallbacks.class, "onSwipe", "onSwipe(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((RetirementSignUpScreenCallbacks) this.receiver).onSwipe(i);
    }
}
