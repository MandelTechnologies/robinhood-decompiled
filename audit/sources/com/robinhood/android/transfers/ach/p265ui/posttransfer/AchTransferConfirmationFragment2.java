package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentAchTransferConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AchTransferConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAchTransferConfirmationBinding> {
    public static final AchTransferConfirmationFragment2 INSTANCE = new AchTransferConfirmationFragment2();

    AchTransferConfirmationFragment2() {
        super(1, FragmentAchTransferConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAchTransferConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAchTransferConfirmationBinding.bind(p0);
    }
}
