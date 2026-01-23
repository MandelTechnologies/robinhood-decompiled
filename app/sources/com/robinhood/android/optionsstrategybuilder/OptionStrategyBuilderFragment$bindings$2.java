package com.robinhood.android.optionsstrategybuilder;

import android.view.View;
import com.robinhood.android.optionsstrategybuilder.databinding.FragmentOptionStrategyBuilderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderFragment$bindings$2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionStrategyBuilderBinding> {
    public static final OptionStrategyBuilderFragment$bindings$2 INSTANCE = new OptionStrategyBuilderFragment$bindings$2();

    OptionStrategyBuilderFragment$bindings$2() {
        super(1, FragmentOptionStrategyBuilderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentOptionStrategyBuilderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionStrategyBuilderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionStrategyBuilderBinding.bind(p0);
    }
}
