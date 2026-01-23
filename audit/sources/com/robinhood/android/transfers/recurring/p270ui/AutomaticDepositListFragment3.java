package com.robinhood.android.transfers.recurring.p270ui;

import android.view.View;
import com.robinhood.android.transfers.recurring.databinding.FragmentAutomaticDepositListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomaticDepositListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AutomaticDepositListFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentAutomaticDepositListBinding> {
    public static final AutomaticDepositListFragment3 INSTANCE = new AutomaticDepositListFragment3();

    AutomaticDepositListFragment3() {
        super(1, FragmentAutomaticDepositListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/recurring/databinding/FragmentAutomaticDepositListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAutomaticDepositListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAutomaticDepositListBinding.bind(p0);
    }
}
