package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionConfirmDeleteDialogBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionConfirmDeleteDialogFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionConfirmDeleteDialogFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionConfirmDeleteDialogFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentQuestionConfirmDeleteDialogBinding> {
    public static final QuestionConfirmDeleteDialogFragment2 INSTANCE = new QuestionConfirmDeleteDialogFragment2();

    QuestionConfirmDeleteDialogFragment2() {
        super(1, FragmentQuestionConfirmDeleteDialogBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionConfirmDeleteDialogBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentQuestionConfirmDeleteDialogBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentQuestionConfirmDeleteDialogBinding.bind(p0);
    }
}
