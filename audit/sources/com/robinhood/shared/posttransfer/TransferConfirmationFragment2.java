package com.robinhood.shared.posttransfer;

import android.view.View;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferConfirmationBinding> {
    public static final TransferConfirmationFragment2 INSTANCE = new TransferConfirmationFragment2();

    TransferConfirmationFragment2() {
        super(1, FragmentTransferConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferConfirmationBinding.bind(p0);
    }
}
