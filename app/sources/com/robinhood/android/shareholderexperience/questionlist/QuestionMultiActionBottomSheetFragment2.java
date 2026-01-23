package com.robinhood.android.shareholderexperience.questionlist;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentQuestionMultiActionBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionMultiActionBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.questionlist.QuestionMultiActionBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class QuestionMultiActionBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentQuestionMultiActionBottomSheetBinding> {
    public static final QuestionMultiActionBottomSheetFragment2 INSTANCE = new QuestionMultiActionBottomSheetFragment2();

    QuestionMultiActionBottomSheetFragment2() {
        super(1, FragmentQuestionMultiActionBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentQuestionMultiActionBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentQuestionMultiActionBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentQuestionMultiActionBottomSheetBinding.bind(p0);
    }
}
