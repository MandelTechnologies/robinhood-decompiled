package com.robinhood.android.matcha.p177ui.history.pending.row;

import android.view.View;
import com.robinhood.android.matcha.databinding.MergeMatchaTransactionRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.pending.row.TransactionRowView$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class TransactionRowView3 extends FunctionReferenceImpl implements Function1<View, MergeMatchaTransactionRowViewBinding> {
    public static final TransactionRowView3 INSTANCE = new TransactionRowView3();

    TransactionRowView3() {
        super(1, MergeMatchaTransactionRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/MergeMatchaTransactionRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeMatchaTransactionRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeMatchaTransactionRowViewBinding.bind(p0);
    }
}
