package com.robinhood.android.transfers.p271ui.max.accounts;

import android.view.View;
import com.robinhood.android.transfers.databinding.FragmentTransferAccountSelectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountSelectionFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TransferAccountSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferAccountSelectionBinding> {
    public static final TransferAccountSelectionFragment2 INSTANCE = new TransferAccountSelectionFragment2();

    TransferAccountSelectionFragment2() {
        super(1, FragmentTransferAccountSelectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/FragmentTransferAccountSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferAccountSelectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferAccountSelectionBinding.bind(p0);
    }
}
