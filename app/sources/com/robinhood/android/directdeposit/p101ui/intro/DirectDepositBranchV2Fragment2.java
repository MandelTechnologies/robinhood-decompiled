package com.robinhood.android.directdeposit.p101ui.intro;

import android.view.View;
import com.robinhood.android.directdeposit.databinding.FragmentDirectDepositBranchV2Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositBranchV2Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.intro.DirectDepositBranchV2Fragment$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectDepositBranchV2Fragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDirectDepositBranchV2Binding> {
    public static final DirectDepositBranchV2Fragment2 INSTANCE = new DirectDepositBranchV2Fragment2();

    DirectDepositBranchV2Fragment2() {
        super(1, FragmentDirectDepositBranchV2Binding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directdeposit/databinding/FragmentDirectDepositBranchV2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDirectDepositBranchV2Binding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDirectDepositBranchV2Binding.bind(p0);
    }
}
