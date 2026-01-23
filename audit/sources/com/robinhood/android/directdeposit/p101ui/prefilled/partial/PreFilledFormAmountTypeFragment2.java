package com.robinhood.android.directdeposit.p101ui.prefilled.partial;

import android.view.View;
import com.robinhood.android.directdeposit.databinding.FragmentPreFilledFormAmountTypeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormAmountTypeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.prefilled.partial.PreFilledFormAmountTypeFragment$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class PreFilledFormAmountTypeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPreFilledFormAmountTypeBinding> {
    public static final PreFilledFormAmountTypeFragment2 INSTANCE = new PreFilledFormAmountTypeFragment2();

    PreFilledFormAmountTypeFragment2() {
        super(1, FragmentPreFilledFormAmountTypeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directdeposit/databinding/FragmentPreFilledFormAmountTypeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPreFilledFormAmountTypeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPreFilledFormAmountTypeBinding.bind(p0);
    }
}
