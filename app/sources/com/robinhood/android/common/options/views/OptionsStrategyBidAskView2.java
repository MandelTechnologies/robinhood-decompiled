package com.robinhood.android.common.options.views;

import android.view.View;
import com.robinhood.android.common.options.databinding.MergeOptionStrategyBidAskViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsStrategyBidAskView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.views.OptionsStrategyBidAskView$bindings$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class OptionsStrategyBidAskView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionStrategyBidAskViewBinding> {
    public static final OptionsStrategyBidAskView2 INSTANCE = new OptionsStrategyBidAskView2();

    OptionsStrategyBidAskView2() {
        super(1, MergeOptionStrategyBidAskViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/databinding/MergeOptionStrategyBidAskViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionStrategyBidAskViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionStrategyBidAskViewBinding.bind(p0);
    }
}
