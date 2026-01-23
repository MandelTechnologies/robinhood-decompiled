package com.robinhood.android.support.call.survey;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentSurveyYesNoQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyYesNoQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.survey.SurveyYesNoQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SurveyYesNoQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSurveyYesNoQuestionBinding> {
    public static final SurveyYesNoQuestionFragment2 INSTANCE = new SurveyYesNoQuestionFragment2();

    SurveyYesNoQuestionFragment2() {
        super(1, FragmentSurveyYesNoQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentSurveyYesNoQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSurveyYesNoQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSurveyYesNoQuestionBinding.bind(p0);
    }
}
