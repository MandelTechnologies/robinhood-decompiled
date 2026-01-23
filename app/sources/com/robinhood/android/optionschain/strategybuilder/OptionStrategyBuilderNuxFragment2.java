package com.robinhood.android.optionschain.strategybuilder;

import android.view.View;
import com.robinhood.android.optionschain.databinding.FragmentOptionStrategyBuilderNuxBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderNuxFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderNuxFragment$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderNuxFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionStrategyBuilderNuxBinding> {
    public static final OptionStrategyBuilderNuxFragment2 INSTANCE = new OptionStrategyBuilderNuxFragment2();

    OptionStrategyBuilderNuxFragment2() {
        super(1, FragmentOptionStrategyBuilderNuxBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/FragmentOptionStrategyBuilderNuxBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionStrategyBuilderNuxBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionStrategyBuilderNuxBinding.bind(p0);
    }
}
