package com.robinhood.android.margin.p174ui.instant;

import android.view.View;
import com.robinhood.android.margin.databinding.FragmentInstantUpgradeConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantUpgradeConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeConfirmationFragment$bindings$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class InstantUpgradeConfirmationFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstantUpgradeConfirmationBinding> {
    public static final InstantUpgradeConfirmationFragment2 INSTANCE = new InstantUpgradeConfirmationFragment2();

    InstantUpgradeConfirmationFragment2() {
        super(1, FragmentInstantUpgradeConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/margin/databinding/FragmentInstantUpgradeConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstantUpgradeConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstantUpgradeConfirmationBinding.bind(p0);
    }
}
