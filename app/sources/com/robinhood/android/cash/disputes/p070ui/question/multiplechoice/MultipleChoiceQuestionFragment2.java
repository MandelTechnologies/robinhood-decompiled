package com.robinhood.android.cash.disputes.p070ui.question.multiplechoice;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentMultipleChoiceQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultipleChoiceQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.multiplechoice.MultipleChoiceQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MultipleChoiceQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentMultipleChoiceQuestionBinding> {
    public static final MultipleChoiceQuestionFragment2 INSTANCE = new MultipleChoiceQuestionFragment2();

    MultipleChoiceQuestionFragment2() {
        super(1, FragmentMultipleChoiceQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentMultipleChoiceQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMultipleChoiceQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMultipleChoiceQuestionBinding.bind(p0);
    }
}
