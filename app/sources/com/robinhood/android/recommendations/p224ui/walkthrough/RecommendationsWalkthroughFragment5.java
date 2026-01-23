package com.robinhood.android.recommendations.p224ui.walkthrough;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsWalkthroughBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsWalkthroughFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.RecommendationsWalkthroughFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsWalkthroughFragment5 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsWalkthroughBinding> {
    public static final RecommendationsWalkthroughFragment5 INSTANCE = new RecommendationsWalkthroughFragment5();

    RecommendationsWalkthroughFragment5() {
        super(1, FragmentRecommendationsWalkthroughBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsWalkthroughBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsWalkthroughBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsWalkthroughBinding.bind(p0);
    }
}
