package com.robinhood.android.trade.options.configuration;

import android.view.View;
import com.robinhood.android.trade.options.databinding.FragmentOptionConfigurationSelectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionConfigurationSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OptionConfigurationSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionConfigurationSelectionBinding> {
    public static final OptionConfigurationSelectionFragment2 INSTANCE = new OptionConfigurationSelectionFragment2();

    OptionConfigurationSelectionFragment2() {
        super(1, FragmentOptionConfigurationSelectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/options/databinding/FragmentOptionConfigurationSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionConfigurationSelectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionConfigurationSelectionBinding.bind(p0);
    }
}
