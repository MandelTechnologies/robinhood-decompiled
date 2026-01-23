package com.robinhood.android.equity.ordercheck.p122ui;

import android.view.View;
import com.robinhood.android.equityvalidation.databinding.FragmentEquityOrderChecksAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderChecksAlertFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksAlertFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityOrderChecksAlertFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEquityOrderChecksAlertBinding> {
    public static final EquityOrderChecksAlertFragment2 INSTANCE = new EquityOrderChecksAlertFragment2();

    EquityOrderChecksAlertFragment2() {
        super(1, FragmentEquityOrderChecksAlertBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equityvalidation/databinding/FragmentEquityOrderChecksAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEquityOrderChecksAlertBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEquityOrderChecksAlertBinding.bind(p0);
    }
}
