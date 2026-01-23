package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentAchTransferInstantDepositCleanupBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferInstantDepositFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AchTransferInstantDepositFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAchTransferInstantDepositCleanupBinding> {
    public static final AchTransferInstantDepositFragment2 INSTANCE = new AchTransferInstantDepositFragment2();

    AchTransferInstantDepositFragment2() {
        super(1, FragmentAchTransferInstantDepositCleanupBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentAchTransferInstantDepositCleanupBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAchTransferInstantDepositCleanupBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAchTransferInstantDepositCleanupBinding.bind(p0);
    }
}
