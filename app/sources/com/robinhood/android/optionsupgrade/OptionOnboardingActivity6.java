package com.robinhood.android.optionsupgrade;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.Continuation3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingActivity$goToNextScreenWithSuvHandler$2$3, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionOnboardingActivity6 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    OptionOnboardingActivity6(Object obj) {
        super(1, obj, Continuation3.class, "resumeWithException", "resumeWithException(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Continuation continuation = (Continuation) this.receiver;
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(p0)));
    }
}
