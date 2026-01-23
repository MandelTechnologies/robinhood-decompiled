package com.robinhood.android.cash.transaction.p079ui.dispute;

import android.view.View;
import com.robinhood.android.cash.transaction.databinding.MergeTransactionDisputeViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionDisputesView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.dispute.TransactionDisputesView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class TransactionDisputesView2 extends FunctionReferenceImpl implements Function1<View, MergeTransactionDisputeViewBinding> {
    public static final TransactionDisputesView2 INSTANCE = new TransactionDisputesView2();

    TransactionDisputesView2() {
        super(1, MergeTransactionDisputeViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/transaction/databinding/MergeTransactionDisputeViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTransactionDisputeViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTransactionDisputeViewBinding.bind(p0);
    }
}
