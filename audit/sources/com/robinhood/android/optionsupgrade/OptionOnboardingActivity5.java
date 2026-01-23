package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.Continuation3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreenWithSuvHandler$2$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingActivity5 extends FunctionReferenceImpl implements Function1<Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress>, Unit> {
    OptionOnboardingActivity5(Object obj) {
        super(1, obj, Continuation3.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress> tuples2) {
        invoke2(tuples2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Tuples2<? extends ScreenArgs, ? extends OptionOnboardingProgress> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((Continuation) this.receiver).resumeWith(Result.m28550constructorimpl(p0));
    }
}
