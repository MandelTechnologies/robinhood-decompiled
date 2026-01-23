package com.robinhood.android.optionschain.rolling;

import android.view.View;
import com.robinhood.android.optionschain.databinding.MergeOptionChainRollingHeaderViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainRollingHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.rolling.OptionChainRollingHeaderView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionChainRollingHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionChainRollingHeaderViewBinding> {
    public static final OptionChainRollingHeaderView2 INSTANCE = new OptionChainRollingHeaderView2();

    OptionChainRollingHeaderView2() {
        super(1, MergeOptionChainRollingHeaderViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/MergeOptionChainRollingHeaderViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionChainRollingHeaderViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionChainRollingHeaderViewBinding.bind(p0);
    }
}
