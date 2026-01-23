package com.robinhood.android.optionchain;

import android.view.View;
import com.robinhood.android.optionchain.databinding.MergeOptionChainDisclosureBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainDisclosureView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionchain.OptionChainDisclosureView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class OptionChainDisclosureView2 extends FunctionReferenceImpl implements Function1<View, MergeOptionChainDisclosureBinding> {
    public static final OptionChainDisclosureView2 INSTANCE = new OptionChainDisclosureView2();

    OptionChainDisclosureView2() {
        super(1, MergeOptionChainDisclosureBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionchain/databinding/MergeOptionChainDisclosureBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionChainDisclosureBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionChainDisclosureBinding.bind(p0);
    }
}
