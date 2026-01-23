package com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading;

import android.view.View;
import com.robinhood.shared.crypto.transfer.databinding.FragmentWalletEnrollmentLoadingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletEnrollmentLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading.WalletEnrollmentLoadingFragment$bindings$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class WalletEnrollmentLoadingFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWalletEnrollmentLoadingBinding> {
    public static final WalletEnrollmentLoadingFragment2 INSTANCE = new WalletEnrollmentLoadingFragment2();

    WalletEnrollmentLoadingFragment2() {
        super(1, FragmentWalletEnrollmentLoadingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/crypto/transfer/databinding/FragmentWalletEnrollmentLoadingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWalletEnrollmentLoadingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWalletEnrollmentLoadingBinding.bind(p0);
    }
}
