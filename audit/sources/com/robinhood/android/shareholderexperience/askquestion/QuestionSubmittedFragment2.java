package com.robinhood.android.shareholderexperience.askquestion;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionSubmittedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionSubmittedFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.askquestion.QuestionSubmittedFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionSubmittedFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentQuestionSubmittedBinding> {
    public static final QuestionSubmittedFragment2 INSTANCE = new QuestionSubmittedFragment2();

    QuestionSubmittedFragment2() {
        super(1, FragmentQuestionSubmittedBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionSubmittedBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentQuestionSubmittedBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentQuestionSubmittedBinding.bind(p0);
    }
}
