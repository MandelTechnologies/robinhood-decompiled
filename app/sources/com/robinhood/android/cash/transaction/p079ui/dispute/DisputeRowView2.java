package com.robinhood.android.cash.transaction.p079ui.dispute;

import android.view.View;
import com.robinhood.android.cash.transaction.databinding.MergeDisputeRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisputeRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.dispute.DisputeRowView$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class DisputeRowView2 extends FunctionReferenceImpl implements Function1<View, MergeDisputeRowViewBinding> {
    public static final DisputeRowView2 INSTANCE = new DisputeRowView2();

    DisputeRowView2() {
        super(1, MergeDisputeRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/transaction/databinding/MergeDisputeRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeDisputeRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeDisputeRowViewBinding.bind(p0);
    }
}
