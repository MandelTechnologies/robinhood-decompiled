package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsLearnMoreDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsLearnMoreDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.learnmore.RecommendationsLearnMoreDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsLearnMoreDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsLearnMoreDialogBinding> {
    public static final RecommendationsLearnMoreDialogFragment2 INSTANCE = new RecommendationsLearnMoreDialogFragment2();

    RecommendationsLearnMoreDialogFragment2() {
        super(1, FragmentRecommendationsLearnMoreDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsLearnMoreDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsLearnMoreDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsLearnMoreDialogBinding.bind(p0);
    }
}
