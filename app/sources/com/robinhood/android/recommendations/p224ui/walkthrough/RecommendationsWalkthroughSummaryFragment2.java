package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsWalkthroughSummaryBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsWalkthroughSummaryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughSummaryFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsWalkthroughSummaryFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsWalkthroughSummaryBinding> {
    public static final RecommendationsWalkthroughSummaryFragment2 INSTANCE = new RecommendationsWalkthroughSummaryFragment2();

    RecommendationsWalkthroughSummaryFragment2() {
        super(1, FragmentRecommendationsWalkthroughSummaryBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughSummaryBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsWalkthroughSummaryBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsWalkthroughSummaryBinding.bind(p0);
    }
}
