package com.robinhood.android.address.p062ui;

import android.view.View;
import com.robinhood.android.address.p062ui.databinding.FragmentManualAddress1Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManualAddress1Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.address.ui.ManualAddress1Fragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class ManualAddress1Fragment2 extends FunctionReferenceImpl implements Function1<View, FragmentManualAddress1Binding> {
    public static final ManualAddress1Fragment2 INSTANCE = new ManualAddress1Fragment2();

    ManualAddress1Fragment2() {
        super(1, FragmentManualAddress1Binding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/address/ui/databinding/FragmentManualAddress1Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentManualAddress1Binding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentManualAddress1Binding.bind(p0);
    }
}
