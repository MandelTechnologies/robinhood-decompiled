package com.robinhood.shared.posttransfer;

import android.view.View;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferDetailConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferDetailConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferDetailConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferDetailConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferDetailConfirmationBinding> {
    public static final TransferDetailConfirmationFragment2 INSTANCE = new TransferDetailConfirmationFragment2();

    TransferDetailConfirmationFragment2() {
        super(1, FragmentTransferDetailConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferDetailConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferDetailConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferDetailConfirmationBinding.bind(p0);
    }
}
