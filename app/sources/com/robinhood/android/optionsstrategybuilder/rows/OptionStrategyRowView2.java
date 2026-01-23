package com.robinhood.android.optionsstrategybuilder.rows;

import android.view.View;
import com.robinhood.android.optionsstrategybuilder.databinding.IncludeStrategyContractRowBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.rows.OptionStrategyRowView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyRowView2 extends FunctionReferenceImpl implements Function1<View, IncludeStrategyContractRowBinding> {
    public static final OptionStrategyRowView2 INSTANCE = new OptionStrategyRowView2();

    OptionStrategyRowView2() {
        super(1, IncludeStrategyContractRowBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsstrategybuilder/databinding/IncludeStrategyContractRowBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeStrategyContractRowBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeStrategyContractRowBinding.bind(p0);
    }
}
