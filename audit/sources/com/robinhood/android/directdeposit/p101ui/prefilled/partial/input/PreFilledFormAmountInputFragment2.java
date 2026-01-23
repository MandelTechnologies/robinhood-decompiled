package com.robinhood.android.directdeposit.p101ui.prefilled.partial.input;

import android.view.View;
import com.robinhood.android.directdeposit.databinding.FragmentPreFilledFormAmountInputBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormAmountInputFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.prefilled.partial.input.PreFilledFormAmountInputFragment$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class PreFilledFormAmountInputFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPreFilledFormAmountInputBinding> {
    public static final PreFilledFormAmountInputFragment2 INSTANCE = new PreFilledFormAmountInputFragment2();

    PreFilledFormAmountInputFragment2() {
        super(1, FragmentPreFilledFormAmountInputBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directdeposit/databinding/FragmentPreFilledFormAmountInputBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPreFilledFormAmountInputBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPreFilledFormAmountInputBinding.bind(p0);
    }
}
