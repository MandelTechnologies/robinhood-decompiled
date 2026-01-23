package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.view.View;
import com.robinhood.android.investorprofile.databinding.FragmentQuestionnaireStringQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireStringQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.QuestionnaireStringQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class QuestionnaireStringQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentQuestionnaireStringQuestionBinding> {
    public static final QuestionnaireStringQuestionFragment2 INSTANCE = new QuestionnaireStringQuestionFragment2();

    QuestionnaireStringQuestionFragment2() {
        super(1, FragmentQuestionnaireStringQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investorprofile/databinding/FragmentQuestionnaireStringQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentQuestionnaireStringQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentQuestionnaireStringQuestionBinding.bind(p0);
    }
}
