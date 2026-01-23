package com.robinhood.shared.posttransfer;

import android.view.View;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferConfirmationWithDisclaimerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfirmationWithDisclaimerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferConfirmationWithDisclaimerFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferConfirmationWithDisclaimerFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferConfirmationWithDisclaimerBinding> {
    public static final TransferConfirmationWithDisclaimerFragment2 INSTANCE = new TransferConfirmationWithDisclaimerFragment2();

    TransferConfirmationWithDisclaimerFragment2() {
        super(1, FragmentTransferConfirmationWithDisclaimerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferConfirmationWithDisclaimerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferConfirmationWithDisclaimerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferConfirmationWithDisclaimerBinding.bind(p0);
    }
}
