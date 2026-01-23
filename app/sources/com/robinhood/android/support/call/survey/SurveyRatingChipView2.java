package com.robinhood.android.support.call.survey;

import android.view.View;
import com.robinhood.shared.support.databinding.MergeSurveyRatingChipViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyRatingChipView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.survey.SurveyRatingChipView$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SurveyRatingChipView2 extends FunctionReferenceImpl implements Function1<View, MergeSurveyRatingChipViewBinding> {
    public static final SurveyRatingChipView2 INSTANCE = new SurveyRatingChipView2();

    SurveyRatingChipView2() {
        super(1, MergeSurveyRatingChipViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/MergeSurveyRatingChipViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSurveyRatingChipViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSurveyRatingChipViewBinding.bind(p0);
    }
}
