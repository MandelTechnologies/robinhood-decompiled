package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.optionschain.databinding.MergeOptionStrategyBuilderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionStrategyBuilderView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderView4 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyBuilderViewBinding> {
    public static final OptionStrategyBuilderView4 INSTANCE = new OptionStrategyBuilderView4();

    OptionStrategyBuilderView4() {
        super(1, MergeOptionStrategyBuilderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/MergeOptionStrategyBuilderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyBuilderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyBuilderViewBinding.bind(p0);
    }
}
