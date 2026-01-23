package com.robinhood.android.withdrawableamount.p279ui;

import android.view.View;
import com.robinhood.android.withdrawableamount.databinding.FragmentWithdrawableAmountDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WithdrawableAmountDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$bindings$2, reason: use source file name */
/* loaded from: classes16.dex */
/* synthetic */ class WithdrawableAmountDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWithdrawableAmountDetailBinding> {
    public static final WithdrawableAmountDetailFragment2 INSTANCE = new WithdrawableAmountDetailFragment2();

    WithdrawableAmountDetailFragment2() {
        super(1, FragmentWithdrawableAmountDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/withdrawableamount/databinding/FragmentWithdrawableAmountDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWithdrawableAmountDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWithdrawableAmountDetailBinding.bind(p0);
    }
}
