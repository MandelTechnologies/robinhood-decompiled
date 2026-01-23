package com.robinhood.android.common.options.views;

import android.view.View;
import com.robinhood.android.common.options.databinding.MergeOptionStrategyGreeksViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyGreeksView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.views.OptionStrategyGreeksView$bindings$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class OptionStrategyGreeksView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyGreeksViewBinding> {
    public static final OptionStrategyGreeksView2 INSTANCE = new OptionStrategyGreeksView2();

    OptionStrategyGreeksView2() {
        super(1, MergeOptionStrategyGreeksViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyGreeksViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyGreeksViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyGreeksViewBinding.bind(p0);
    }
}
