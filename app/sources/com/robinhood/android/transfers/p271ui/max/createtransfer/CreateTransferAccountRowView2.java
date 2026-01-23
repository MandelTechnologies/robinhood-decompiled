package com.robinhood.android.transfers.p271ui.max.createtransfer;

import android.view.View;
import com.robinhood.android.transfers.databinding.MergeCreateTransferAccountRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferAccountRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.createtransfer.CreateTransferAccountRowView$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferAccountRowView2 extends FunctionReferenceImpl implements Function1<View, MergeCreateTransferAccountRowViewBinding> {
    public static final CreateTransferAccountRowView2 INSTANCE = new CreateTransferAccountRowView2();

    CreateTransferAccountRowView2() {
        super(1, MergeCreateTransferAccountRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/MergeCreateTransferAccountRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCreateTransferAccountRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCreateTransferAccountRowViewBinding.bind(p0);
    }
}
