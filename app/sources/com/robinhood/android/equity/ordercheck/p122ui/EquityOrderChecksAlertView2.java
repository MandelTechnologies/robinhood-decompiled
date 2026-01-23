package com.robinhood.android.equity.ordercheck.p122ui;

import android.view.View;
import com.robinhood.android.equityvalidation.databinding.MergeEquityOrderChecksAlertViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderChecksAlertView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksAlertView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityOrderChecksAlertView2 extends FunctionReferenceImpl implements Function1<View, MergeEquityOrderChecksAlertViewBinding> {
    public static final EquityOrderChecksAlertView2 INSTANCE = new EquityOrderChecksAlertView2();

    EquityOrderChecksAlertView2() {
        super(1, MergeEquityOrderChecksAlertViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksAlertViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEquityOrderChecksAlertViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEquityOrderChecksAlertViewBinding.bind(p0);
    }
}
