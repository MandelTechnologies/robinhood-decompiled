package com.robinhood.android.history.p153ui.transaction;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentTransactionDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.transaction.TransactionDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class TransactionDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransactionDetailBinding> {
    public static final TransactionDetailFragment2 INSTANCE = new TransactionDetailFragment2();

    TransactionDetailFragment2() {
        super(1, FragmentTransactionDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentTransactionDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransactionDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransactionDetailBinding.bind(p0);
    }
}
