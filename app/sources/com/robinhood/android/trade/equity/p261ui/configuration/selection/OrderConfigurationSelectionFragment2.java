package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import android.view.View;
import com.robinhood.android.trade.equity.databinding.FragmentOrderConfigurationSelectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionFragment$bindings$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class OrderConfigurationSelectionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOrderConfigurationSelectionBinding> {
    public static final OrderConfigurationSelectionFragment2 INSTANCE = new OrderConfigurationSelectionFragment2();

    OrderConfigurationSelectionFragment2() {
        super(1, FragmentOrderConfigurationSelectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/equity/databinding/FragmentOrderConfigurationSelectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOrderConfigurationSelectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOrderConfigurationSelectionBinding.bind(p0);
    }
}
