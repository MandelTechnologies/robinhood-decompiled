package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentQuestionListBinding> {
    public static final QuestionListFragment2 INSTANCE = new QuestionListFragment2();

    QuestionListFragment2() {
        super(1, FragmentQuestionListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentQuestionListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentQuestionListBinding.bind(p0);
    }
}
