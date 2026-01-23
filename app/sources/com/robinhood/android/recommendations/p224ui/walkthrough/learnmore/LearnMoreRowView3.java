package com.robinhood.android.recommendations.p224ui.walkthrough.learnmore;

import android.view.View;
import com.robinhood.android.recommendations.databinding.MergeLearnMoreRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LearnMoreRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.ui.walkthrough.learnmore.LearnMoreRowView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class LearnMoreRowView3 extends FunctionReferenceImpl implements Function1<View, MergeLearnMoreRowViewBinding> {
    public static final LearnMoreRowView3 INSTANCE = new LearnMoreRowView3();

    LearnMoreRowView3() {
        super(1, MergeLearnMoreRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/recommendations/databinding/MergeLearnMoreRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeLearnMoreRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeLearnMoreRowViewBinding.bind(p0);
    }
}
