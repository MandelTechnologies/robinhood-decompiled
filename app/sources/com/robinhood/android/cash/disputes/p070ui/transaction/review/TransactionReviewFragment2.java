package com.robinhood.android.cash.disputes.p070ui.transaction.review;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentTransactionReviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionReviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.transaction.review.TransactionReviewFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class TransactionReviewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransactionReviewBinding> {
    public static final TransactionReviewFragment2 INSTANCE = new TransactionReviewFragment2();

    TransactionReviewFragment2() {
        super(1, FragmentTransactionReviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentTransactionReviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransactionReviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransactionReviewBinding.bind(p0);
    }
}
