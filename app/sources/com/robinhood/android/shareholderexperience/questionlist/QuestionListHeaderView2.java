package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.MergeQuestionListHeaderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionListHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionListHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeQuestionListHeaderViewBinding> {
    public static final QuestionListHeaderView2 INSTANCE = new QuestionListHeaderView2();

    QuestionListHeaderView2() {
        super(1, MergeQuestionListHeaderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListHeaderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeQuestionListHeaderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeQuestionListHeaderViewBinding.bind(p0);
    }
}
