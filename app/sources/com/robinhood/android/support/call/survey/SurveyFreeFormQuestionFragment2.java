package com.robinhood.android.support.call.survey;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentSurveyFreeformQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyFreeFormQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.survey.SurveyFreeFormQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SurveyFreeFormQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSurveyFreeformQuestionBinding> {
    public static final SurveyFreeFormQuestionFragment2 INSTANCE = new SurveyFreeFormQuestionFragment2();

    SurveyFreeFormQuestionFragment2() {
        super(1, FragmentSurveyFreeformQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentSurveyFreeformQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSurveyFreeformQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSurveyFreeformQuestionBinding.bind(p0);
    }
}
