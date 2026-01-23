package com.robinhood.android.advanced.alert.view;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.ViewAlertHubIndicatorListItemBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubIndicatorListItemView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.view.AlertHubIndicatorListItemView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AlertHubIndicatorListItemView2 extends FunctionReferenceImpl implements Function1<View, ViewAlertHubIndicatorListItemBinding> {
    public static final AlertHubIndicatorListItemView2 INSTANCE = new AlertHubIndicatorListItemView2();

    AlertHubIndicatorListItemView2() {
        super(1, ViewAlertHubIndicatorListItemBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/ViewAlertHubIndicatorListItemBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewAlertHubIndicatorListItemBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ViewAlertHubIndicatorListItemBinding.bind(p0);
    }
}
