package com.robinhood.android.odyssey.lib.template.address;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdAddressTypeAheadBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdAddressTypeAheadFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.address.SdAddressTypeAheadFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdAddressTypeAheadFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdAddressTypeAheadBinding> {
    public static final SdAddressTypeAheadFragment2 INSTANCE = new SdAddressTypeAheadFragment2();

    SdAddressTypeAheadFragment2() {
        super(1, FragmentSdAddressTypeAheadBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdAddressTypeAheadBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdAddressTypeAheadBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdAddressTypeAheadBinding.bind(p0);
    }
}
