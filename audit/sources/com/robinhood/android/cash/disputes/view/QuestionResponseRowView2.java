package com.robinhood.android.cash.disputes.view;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.MergeQuestionResponseRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionResponseRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.view.QuestionResponseRowView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class QuestionResponseRowView2 extends FunctionReferenceImpl implements Function1<View, MergeQuestionResponseRowViewBinding> {
    public static final QuestionResponseRowView2 INSTANCE = new QuestionResponseRowView2();

    QuestionResponseRowView2() {
        super(1, MergeQuestionResponseRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/MergeQuestionResponseRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeQuestionResponseRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeQuestionResponseRowViewBinding.bind(p0);
    }
}
