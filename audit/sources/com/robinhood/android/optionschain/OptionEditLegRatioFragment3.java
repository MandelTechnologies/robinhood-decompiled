package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.optionschain.databinding.FragmentOptionEditLegRatioBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionEditLegRatioFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionEditLegRatioFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionEditLegRatioFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentOptionEditLegRatioBinding> {
    public static final OptionEditLegRatioFragment3 INSTANCE = new OptionEditLegRatioFragment3();

    OptionEditLegRatioFragment3() {
        super(1, FragmentOptionEditLegRatioBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/FragmentOptionEditLegRatioBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionEditLegRatioBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionEditLegRatioBinding.bind(p0);
    }
}
