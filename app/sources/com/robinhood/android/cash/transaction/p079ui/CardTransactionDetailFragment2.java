package com.robinhood.android.cash.transaction.p079ui;

import android.view.View;
import com.robinhood.android.cash.transaction.databinding.FragmentCardTransactionDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CardTransactionDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.CardTransactionDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class CardTransactionDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCardTransactionDetailBinding> {
    public static final CardTransactionDetailFragment2 INSTANCE = new CardTransactionDetailFragment2();

    CardTransactionDetailFragment2() {
        super(1, FragmentCardTransactionDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/transaction/databinding/FragmentCardTransactionDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCardTransactionDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCardTransactionDetailBinding.bind(p0);
    }
}
