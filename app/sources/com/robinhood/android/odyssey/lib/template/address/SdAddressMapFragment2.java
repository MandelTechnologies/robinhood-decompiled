package com.robinhood.android.odyssey.lib.template.address;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdAddressMapBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdAddressMapFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressMapFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdAddressMapFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdAddressMapBinding> {
    public static final SdAddressMapFragment2 INSTANCE = new SdAddressMapFragment2();

    SdAddressMapFragment2() {
        super(1, FragmentSdAddressMapBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressMapBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdAddressMapBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdAddressMapBinding.bind(p0);
    }
}
