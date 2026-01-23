package com.robinhood.android.cash.disputes.p070ui.transaction;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentTransactionSelectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.transaction.TransactionSelectionFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class TransactionSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransactionSelectionBinding> {
    public static final TransactionSelectionFragment2 INSTANCE = new TransactionSelectionFragment2();

    TransactionSelectionFragment2() {
        super(1, FragmentTransactionSelectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentTransactionSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransactionSelectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransactionSelectionBinding.bind(p0);
    }
}
