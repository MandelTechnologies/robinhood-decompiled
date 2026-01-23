package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.view.View;
import com.robinhood.android.directdeposit.databinding.FragmentRoutingAccountActionsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchAccountInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.accountinfo.AchAccountInfoFragment$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class AchAccountInfoFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRoutingAccountActionsBinding> {
    public static final AchAccountInfoFragment2 INSTANCE = new AchAccountInfoFragment2();

    AchAccountInfoFragment2() {
        super(1, FragmentRoutingAccountActionsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directdeposit/databinding/FragmentRoutingAccountActionsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRoutingAccountActionsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRoutingAccountActionsBinding.bind(p0);
    }
}
