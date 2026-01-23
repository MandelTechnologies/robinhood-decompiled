package com.robinhood.android.taxcertification;

import android.view.View;
import com.robinhood.android.taxcertification.databinding.FragmentUnconfirmedTaxAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnconfirmedTaxAlertFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.taxcertification.UnconfirmedTaxAlertFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class UnconfirmedTaxAlertFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentUnconfirmedTaxAlertBinding> {
    public static final UnconfirmedTaxAlertFragment2 INSTANCE = new UnconfirmedTaxAlertFragment2();

    UnconfirmedTaxAlertFragment2() {
        super(1, FragmentUnconfirmedTaxAlertBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/taxcertification/databinding/FragmentUnconfirmedTaxAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentUnconfirmedTaxAlertBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentUnconfirmedTaxAlertBinding.bind(p0);
    }
}
