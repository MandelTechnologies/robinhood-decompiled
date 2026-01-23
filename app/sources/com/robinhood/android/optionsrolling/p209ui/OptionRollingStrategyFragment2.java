package com.robinhood.android.optionsrolling.p209ui;

import android.view.View;
import com.robinhood.android.optionsrolling.databinding.FragmentOptionRollingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionRollingStrategyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsrolling.ui.OptionRollingStrategyFragment$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionRollingStrategyFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionRollingBinding> {
    public static final OptionRollingStrategyFragment2 INSTANCE = new OptionRollingStrategyFragment2();

    OptionRollingStrategyFragment2() {
        super(1, FragmentOptionRollingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsrolling/databinding/FragmentOptionRollingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionRollingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionRollingBinding.bind(p0);
    }
}
