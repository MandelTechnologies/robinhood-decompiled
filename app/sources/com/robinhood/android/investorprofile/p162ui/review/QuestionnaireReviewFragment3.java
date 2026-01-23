package com.robinhood.android.investorprofile.p162ui.review;

import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: QuestionnaireReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireReviewFragment3 extends FunctionReferenceImpl implements Function1<String, Unit> {
    QuestionnaireReviewFragment3(Object obj) {
        super(1, obj, QuestionnaireReviewFragment.Callbacks.class, "onConfirmSuccessful", "onConfirmSuccessful(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((QuestionnaireReviewFragment.Callbacks) this.receiver).onConfirmSuccessful(str);
    }
}
