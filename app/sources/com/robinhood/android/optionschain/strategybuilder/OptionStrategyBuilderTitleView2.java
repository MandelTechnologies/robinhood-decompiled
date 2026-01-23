package com.robinhood.android.optionschain.strategybuilder;

import android.view.View;
import com.robinhood.android.optionschain.databinding.MergeOptionStrategyBuilderTitleViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderTitleView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderTitleView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderTitleView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyBuilderTitleViewBinding> {
    public static final OptionStrategyBuilderTitleView2 INSTANCE = new OptionStrategyBuilderTitleView2();

    OptionStrategyBuilderTitleView2() {
        super(1, MergeOptionStrategyBuilderTitleViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderTitleViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyBuilderTitleViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyBuilderTitleViewBinding.bind(p0);
    }
}
