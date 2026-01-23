package com.robinhood.android.optionsstrategybuilder.pickers;

import android.view.View;
import com.robinhood.android.optionsstrategybuilder.databinding.FragmentBottomSheetSelectorBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderSelectorBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.pickers.OptionStrategyBuilderSelectorBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionStrategyBuilderSelectorBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentBottomSheetSelectorBinding> {
    public static final OptionStrategyBuilderSelectorBottomSheet2 INSTANCE = new OptionStrategyBuilderSelectorBottomSheet2();

    OptionStrategyBuilderSelectorBottomSheet2() {
        super(1, FragmentBottomSheetSelectorBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentBottomSheetSelectorBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBottomSheetSelectorBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBottomSheetSelectorBinding.bind(p0);
    }
}
