package com.robinhood.android.rhymigration.p245ui.address;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyConfirmAddressBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyConfirmAddressFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.address.RhyConfirmAddressFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyConfirmAddressFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyConfirmAddressBinding> {
    public static final RhyConfirmAddressFragment2 INSTANCE = new RhyConfirmAddressFragment2();

    RhyConfirmAddressFragment2() {
        super(1, FragmentRhyConfirmAddressBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyConfirmAddressBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyConfirmAddressBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyConfirmAddressBinding.bind(p0);
    }
}
