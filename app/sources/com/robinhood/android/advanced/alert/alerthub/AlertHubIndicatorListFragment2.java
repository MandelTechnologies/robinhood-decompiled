package com.robinhood.android.advanced.alert.alerthub;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.FragmentAlertHubIndicatorListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlertHubIndicatorListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AlertHubIndicatorListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAlertHubIndicatorListBinding> {
    public static final AlertHubIndicatorListFragment2 INSTANCE = new AlertHubIndicatorListFragment2();

    AlertHubIndicatorListFragment2() {
        super(1, FragmentAlertHubIndicatorListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubIndicatorListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAlertHubIndicatorListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAlertHubIndicatorListBinding.bind(p0);
    }
}
