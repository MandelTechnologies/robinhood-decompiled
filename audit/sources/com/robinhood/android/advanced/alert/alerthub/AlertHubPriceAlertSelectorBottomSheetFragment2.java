package com.robinhood.android.advanced.alert.alerthub;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.FragmentAlertHubPriceAlertSelectorBottomsheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubPriceAlertSelectorBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubPriceAlertSelectorBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AlertHubPriceAlertSelectorBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAlertHubPriceAlertSelectorBottomsheetBinding> {
    public static final AlertHubPriceAlertSelectorBottomSheetFragment2 INSTANCE = new AlertHubPriceAlertSelectorBottomSheetFragment2();

    AlertHubPriceAlertSelectorBottomSheetFragment2() {
        super(1, FragmentAlertHubPriceAlertSelectorBottomsheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubPriceAlertSelectorBottomsheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAlertHubPriceAlertSelectorBottomsheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAlertHubPriceAlertSelectorBottomsheetBinding.bind(p0);
    }
}
