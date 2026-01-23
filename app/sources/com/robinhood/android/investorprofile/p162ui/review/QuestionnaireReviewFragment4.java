package com.robinhood.android.investorprofile.p162ui.review;

import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment$ComposeContent$1$3$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireReviewFragment4 extends AdaptedFunctionReference implements Function1<Throwable, Unit> {
    QuestionnaireReviewFragment4(Object obj) {
        super(1, obj, ActivityErrorHandler.class, "handleError", "handleError(Ljava/lang/Throwable;Z)Z", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        AbsErrorHandler.handleError$default((ActivityErrorHandler) this.receiver, p0, false, 2, null);
    }
}
