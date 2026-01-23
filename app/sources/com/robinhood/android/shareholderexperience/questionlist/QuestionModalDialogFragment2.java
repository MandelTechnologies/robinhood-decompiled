package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionModalDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionModalDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionModalDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionModalDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentQuestionModalDialogBinding> {
    public static final QuestionModalDialogFragment2 INSTANCE = new QuestionModalDialogFragment2();

    QuestionModalDialogFragment2() {
        super(1, FragmentQuestionModalDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionModalDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentQuestionModalDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentQuestionModalDialogBinding.bind(p0);
    }
}
