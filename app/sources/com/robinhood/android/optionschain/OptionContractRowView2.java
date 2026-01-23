package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.optionschain.databinding.IncludeOptionContractRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionContractRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionContractRowView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionContractRowView2 extends FunctionReferenceImpl implements Function1<View, IncludeOptionContractRowBinding> {
    public static final OptionContractRowView2 INSTANCE = new OptionContractRowView2();

    OptionContractRowView2() {
        super(1, IncludeOptionContractRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/IncludeOptionContractRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeOptionContractRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeOptionContractRowBinding.bind(p0);
    }
}
