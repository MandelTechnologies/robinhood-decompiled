package com.robinhood.android.support.call.survey;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentSurveyCompleteBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyCompleteFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.survey.SurveyCompleteFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SurveyCompleteFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSurveyCompleteBinding> {
    public static final SurveyCompleteFragment2 INSTANCE = new SurveyCompleteFragment2();

    SurveyCompleteFragment2() {
        super(1, FragmentSurveyCompleteBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentSurveyCompleteBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSurveyCompleteBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSurveyCompleteBinding.bind(p0);
    }
}
