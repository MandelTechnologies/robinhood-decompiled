package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.optionschain.databinding.MergeOptionChainListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainListView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionChainListView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionChainListView3 extends FunctionReferenceImpl implements Function1<View, MergeOptionChainListBinding> {
    public static final OptionChainListView3 INSTANCE = new OptionChainListView3();

    OptionChainListView3() {
        super(1, MergeOptionChainListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/MergeOptionChainListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionChainListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionChainListBinding.bind(p0);
    }
}
