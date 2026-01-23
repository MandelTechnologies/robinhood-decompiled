package com.robinhood.android.equity.ordercheck.p122ui;

import android.view.View;
import com.robinhood.android.equityvalidation.databinding.MergeEquityOrderChecksBreakdownRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderChecksBreakdownRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksBreakdownRowView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityOrderChecksBreakdownRowView2 extends FunctionReferenceImpl implements Function1<View, MergeEquityOrderChecksBreakdownRowViewBinding> {
    public static final EquityOrderChecksBreakdownRowView2 INSTANCE = new EquityOrderChecksBreakdownRowView2();

    EquityOrderChecksBreakdownRowView2() {
        super(1, MergeEquityOrderChecksBreakdownRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEquityOrderChecksBreakdownRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEquityOrderChecksBreakdownRowViewBinding.bind(p0);
    }
}
