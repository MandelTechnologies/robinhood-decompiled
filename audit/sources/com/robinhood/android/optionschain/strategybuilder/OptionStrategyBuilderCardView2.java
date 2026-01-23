package com.robinhood.android.optionschain.strategybuilder;

import android.view.View;
import com.robinhood.android.optionschain.databinding.MergeOptionStrategyBuilderCardViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderCardView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.strategybuilder.OptionStrategyBuilderCardView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderCardView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyBuilderCardViewBinding> {
    public static final OptionStrategyBuilderCardView2 INSTANCE = new OptionStrategyBuilderCardView2();

    OptionStrategyBuilderCardView2() {
        super(1, MergeOptionStrategyBuilderCardViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderCardViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyBuilderCardViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyBuilderCardViewBinding.bind(p0);
    }
}
