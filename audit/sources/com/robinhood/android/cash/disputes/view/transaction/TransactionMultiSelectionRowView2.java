package com.robinhood.android.cash.disputes.view.transaction;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.MergeTransactionMultiSelectionRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionMultiSelectionRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.view.transaction.TransactionMultiSelectionRowView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class TransactionMultiSelectionRowView2 extends FunctionReferenceImpl implements Function1<View, MergeTransactionMultiSelectionRowViewBinding> {
    public static final TransactionMultiSelectionRowView2 INSTANCE = new TransactionMultiSelectionRowView2();

    TransactionMultiSelectionRowView2() {
        super(1, MergeTransactionMultiSelectionRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/MergeTransactionMultiSelectionRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTransactionMultiSelectionRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTransactionMultiSelectionRowViewBinding.bind(p0);
    }
}
