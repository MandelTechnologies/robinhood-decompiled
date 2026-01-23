package com.robinhood.android.support.call.survey;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentSurveyMultipleChoiceQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyMultipleChoiceQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.survey.SurveyMultipleChoiceQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SurveyMultipleChoiceQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSurveyMultipleChoiceQuestionBinding> {
    public static final SurveyMultipleChoiceQuestionFragment2 INSTANCE = new SurveyMultipleChoiceQuestionFragment2();

    SurveyMultipleChoiceQuestionFragment2() {
        super(1, FragmentSurveyMultipleChoiceQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentSurveyMultipleChoiceQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSurveyMultipleChoiceQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSurveyMultipleChoiceQuestionBinding.bind(p0);
    }
}
