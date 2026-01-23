package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.optionschain.databinding.FragmentOptionChainBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionChainFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionChainBinding> {
    public static final OptionChainFragment$binding$2 INSTANCE = new OptionChainFragment$binding$2();

    OptionChainFragment$binding$2() {
        super(1, FragmentOptionChainBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/FragmentOptionChainBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionChainBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionChainBinding.bind(p0);
    }
}
