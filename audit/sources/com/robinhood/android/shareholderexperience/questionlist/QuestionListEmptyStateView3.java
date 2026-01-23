package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.MergeQuestionListEmptyStateViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListEmptyStateView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListEmptyStateView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionListEmptyStateView3 extends FunctionReferenceImpl implements Function1<View, MergeQuestionListEmptyStateViewBinding> {
    public static final QuestionListEmptyStateView3 INSTANCE = new QuestionListEmptyStateView3();

    QuestionListEmptyStateView3() {
        super(1, MergeQuestionListEmptyStateViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListEmptyStateViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeQuestionListEmptyStateViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeQuestionListEmptyStateViewBinding.bind(p0);
    }
}
