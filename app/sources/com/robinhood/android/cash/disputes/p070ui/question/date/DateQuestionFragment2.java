package com.robinhood.android.cash.disputes.p070ui.question.date;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentDateQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.date.DateQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DateQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDateQuestionBinding> {
    public static final DateQuestionFragment2 INSTANCE = new DateQuestionFragment2();

    DateQuestionFragment2() {
        super(1, FragmentDateQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentDateQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDateQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDateQuestionBinding.bind(p0);
    }
}
