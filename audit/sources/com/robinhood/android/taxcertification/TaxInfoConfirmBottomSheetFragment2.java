package com.robinhood.android.taxcertification;

import android.view.View;
import com.robinhood.android.taxcertification.databinding.FragmentTaxInfoConfirmBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxInfoConfirmBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.TaxInfoConfirmBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TaxInfoConfirmBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTaxInfoConfirmBottomSheetBinding> {
    public static final TaxInfoConfirmBottomSheetFragment2 INSTANCE = new TaxInfoConfirmBottomSheetFragment2();

    TaxInfoConfirmBottomSheetFragment2() {
        super(1, FragmentTaxInfoConfirmBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTaxInfoConfirmBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTaxInfoConfirmBottomSheetBinding.bind(p0);
    }
}
