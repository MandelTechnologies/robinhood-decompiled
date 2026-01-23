package com.robinhood.android.equity.ordercheck.p122ui;

import android.view.View;
import com.robinhood.android.equityvalidation.databinding.MergeEquityOrderChecksBreakdownSectionViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderChecksBreakdownSectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksBreakdownSectionView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EquityOrderChecksBreakdownSectionView2 extends FunctionReferenceImpl implements Function1<View, MergeEquityOrderChecksBreakdownSectionViewBinding> {
    public static final EquityOrderChecksBreakdownSectionView2 INSTANCE = new EquityOrderChecksBreakdownSectionView2();

    EquityOrderChecksBreakdownSectionView2() {
        super(1, MergeEquityOrderChecksBreakdownSectionViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksBreakdownSectionViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEquityOrderChecksBreakdownSectionViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEquityOrderChecksBreakdownSectionViewBinding.bind(p0);
    }
}
