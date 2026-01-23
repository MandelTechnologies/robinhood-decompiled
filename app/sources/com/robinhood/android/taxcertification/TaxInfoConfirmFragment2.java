package com.robinhood.android.taxcertification;

import android.view.View;
import com.robinhood.android.taxcertification.databinding.FragmentTaxInfoConfirmBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxInfoConfirmFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.TaxInfoConfirmFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TaxInfoConfirmFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTaxInfoConfirmBinding> {
    public static final TaxInfoConfirmFragment2 INSTANCE = new TaxInfoConfirmFragment2();

    TaxInfoConfirmFragment2() {
        super(1, FragmentTaxInfoConfirmBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/taxcertification/databinding/FragmentTaxInfoConfirmBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTaxInfoConfirmBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTaxInfoConfirmBinding.bind(p0);
    }
}
