package com.robinhood.android.cash.disputes.view.transaction;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.MergeTransactionSingleSelectionRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionSingleSelectionRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.view.transaction.TransactionSingleSelectionRowView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class TransactionSingleSelectionRowView2 extends FunctionReferenceImpl implements Function1<View, MergeTransactionSingleSelectionRowViewBinding> {
    public static final TransactionSingleSelectionRowView2 INSTANCE = new TransactionSingleSelectionRowView2();

    TransactionSingleSelectionRowView2() {
        super(1, MergeTransactionSingleSelectionRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/MergeTransactionSingleSelectionRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeTransactionSingleSelectionRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeTransactionSingleSelectionRowViewBinding.bind(p0);
    }
}
