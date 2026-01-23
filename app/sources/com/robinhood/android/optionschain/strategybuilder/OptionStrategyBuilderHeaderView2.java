package com.robinhood.android.optionschain.strategybuilder;

import android.view.View;
import com.robinhood.android.optionschain.databinding.MergeOptionStrategyBuilderHeaderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderHeaderView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyBuilderHeaderViewBinding> {
    public static final OptionStrategyBuilderHeaderView2 INSTANCE = new OptionStrategyBuilderHeaderView2();

    OptionStrategyBuilderHeaderView2() {
        super(1, MergeOptionStrategyBuilderHeaderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderHeaderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyBuilderHeaderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyBuilderHeaderViewBinding.bind(p0);
    }
}
