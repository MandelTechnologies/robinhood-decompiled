package com.robinhood.android.address.p062ui;

import android.view.View;
import com.robinhood.android.address.p062ui.databinding.FragmentAddressSelectorBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.address.ui.AddressSelectionFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AddressSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAddressSelectorBinding> {
    public static final AddressSelectionFragment2 INSTANCE = new AddressSelectionFragment2();

    AddressSelectionFragment2() {
        super(1, FragmentAddressSelectorBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/address/ui/databinding/FragmentAddressSelectorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAddressSelectorBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAddressSelectorBinding.bind(p0);
    }
}
