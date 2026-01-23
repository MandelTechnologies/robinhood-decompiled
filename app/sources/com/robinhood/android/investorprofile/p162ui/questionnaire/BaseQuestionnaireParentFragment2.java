package com.robinhood.android.investorprofile.p162ui.questionnaire;

import android.view.View;
import com.robinhood.android.investorprofile.databinding.FragmentBaseQuestionnaireParentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseQuestionnaireParentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.BaseQuestionnaireParentFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class BaseQuestionnaireParentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentBaseQuestionnaireParentBinding> {
    public static final BaseQuestionnaireParentFragment2 INSTANCE = new BaseQuestionnaireParentFragment2();

    BaseQuestionnaireParentFragment2() {
        super(1, FragmentBaseQuestionnaireParentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/investorprofile/databinding/FragmentBaseQuestionnaireParentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBaseQuestionnaireParentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBaseQuestionnaireParentBinding.bind(p0);
    }
}
