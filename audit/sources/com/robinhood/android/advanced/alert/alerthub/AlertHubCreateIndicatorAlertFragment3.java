package com.robinhood.android.advanced.alert.alerthub;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.FragmentAlertHubCreateIndicatorAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AlertHubCreateIndicatorAlertFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentAlertHubCreateIndicatorAlertBinding> {
    public static final AlertHubCreateIndicatorAlertFragment3 INSTANCE = new AlertHubCreateIndicatorAlertFragment3();

    AlertHubCreateIndicatorAlertFragment3() {
        super(1, FragmentAlertHubCreateIndicatorAlertBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubCreateIndicatorAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAlertHubCreateIndicatorAlertBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAlertHubCreateIndicatorAlertBinding.bind(p0);
    }
}
