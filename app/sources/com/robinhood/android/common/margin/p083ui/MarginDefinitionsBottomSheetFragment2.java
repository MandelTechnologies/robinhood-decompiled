package com.robinhood.android.common.margin.p083ui;

import android.view.View;
import com.robinhood.android.common.margin.databinding.MarginDefinitionsBottomSheetFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginDefinitionsBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.MarginDefinitionsBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class MarginDefinitionsBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, MarginDefinitionsBottomSheetFragmentBinding> {
    public static final MarginDefinitionsBottomSheetFragment2 INSTANCE = new MarginDefinitionsBottomSheetFragment2();

    MarginDefinitionsBottomSheetFragment2() {
        super(1, MarginDefinitionsBottomSheetFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/margin/databinding/MarginDefinitionsBottomSheetFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MarginDefinitionsBottomSheetFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MarginDefinitionsBottomSheetFragmentBinding.bind(p0);
    }
}
