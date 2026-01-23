package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.MergeQuestionCardViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionCardView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionCardView3 extends FunctionReferenceImpl implements Function1<View, MergeQuestionCardViewBinding> {
    public static final QuestionCardView3 INSTANCE = new QuestionCardView3();

    QuestionCardView3() {
        super(1, MergeQuestionCardViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionCardViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeQuestionCardViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeQuestionCardViewBinding.bind(p0);
    }
}
