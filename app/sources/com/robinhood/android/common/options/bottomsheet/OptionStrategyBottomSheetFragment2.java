package com.robinhood.android.common.options.bottomsheet;

import android.view.View;
import com.robinhood.android.common.options.bottomsheet.databinding.FragmentStrategyBuilderSpreadBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class OptionStrategyBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentStrategyBuilderSpreadBinding> {
    public static final OptionStrategyBottomSheetFragment2 INSTANCE = new OptionStrategyBottomSheetFragment2();

    OptionStrategyBottomSheetFragment2() {
        super(1, FragmentStrategyBuilderSpreadBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/bottomsheet/databinding/FragmentStrategyBuilderSpreadBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentStrategyBuilderSpreadBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentStrategyBuilderSpreadBinding.bind(p0);
    }
}
