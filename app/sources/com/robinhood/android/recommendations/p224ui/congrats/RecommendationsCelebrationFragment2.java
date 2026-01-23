package com.robinhood.android.recommendations.p224ui.congrats;

import android.view.View;
import com.robinhood.android.recommendations.databinding.FragmentRecommendationsCelebrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsCelebrationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.congrats.RecommendationsCelebrationFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RecommendationsCelebrationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecommendationsCelebrationBinding> {
    public static final RecommendationsCelebrationFragment2 INSTANCE = new RecommendationsCelebrationFragment2();

    RecommendationsCelebrationFragment2() {
        super(1, FragmentRecommendationsCelebrationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/FragmentRecommendationsCelebrationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecommendationsCelebrationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecommendationsCelebrationBinding.bind(p0);
    }
}
