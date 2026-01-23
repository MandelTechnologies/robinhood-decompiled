package com.robinhood.android.shareholderexperience.answer;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.MergeAnswerCardViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnswerCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.answer.AnswerCardView$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class AnswerCardView2 extends FunctionReferenceImpl implements Function1<View, MergeAnswerCardViewBinding> {
    public static final AnswerCardView2 INSTANCE = new AnswerCardView2();

    AnswerCardView2() {
        super(1, MergeAnswerCardViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/MergeAnswerCardViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeAnswerCardViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeAnswerCardViewBinding.bind(p0);
    }
}
