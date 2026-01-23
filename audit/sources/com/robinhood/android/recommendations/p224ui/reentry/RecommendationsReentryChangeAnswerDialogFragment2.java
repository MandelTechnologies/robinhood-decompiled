package com.robinhood.android.recommendations.p224ui.reentry;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsReentryConfirmAnswerDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsReentryChangeAnswerDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryChangeAnswerDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsReentryChangeAnswerDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsReentryConfirmAnswerDialogBinding> {
    public static final RecommendationsReentryChangeAnswerDialogFragment2 INSTANCE = new RecommendationsReentryChangeAnswerDialogFragment2();

    RecommendationsReentryChangeAnswerDialogFragment2() {
        super(1, FragmentRecommendationsReentryConfirmAnswerDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsReentryConfirmAnswerDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsReentryConfirmAnswerDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsReentryConfirmAnswerDialogBinding.bind(p0);
    }
}
