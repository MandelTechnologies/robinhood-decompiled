package com.robinhood.android.paycheckhub.p213ui;

import android.view.View;
import com.robinhood.android.paycheckhub.databinding.FragmentManageDirectDepositBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManageDirectDepositFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.ManageDirectDepositFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class ManageDirectDepositFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentManageDirectDepositBinding> {
    public static final ManageDirectDepositFragment2 INSTANCE = new ManageDirectDepositFragment2();

    ManageDirectDepositFragment2() {
        super(1, FragmentManageDirectDepositBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/paycheckhub/databinding/FragmentManageDirectDepositBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentManageDirectDepositBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentManageDirectDepositBinding.bind(p0);
    }
}
