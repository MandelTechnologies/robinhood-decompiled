package com.robinhood.android.transfers.recurring.p270ui;

import android.view.View;
import com.robinhood.android.transfers.recurring.databinding.MergeRowRecurringInvestmentHookBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutomaticDepositRecurringInvestmentHookViewRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositRecurringInvestmentHookViewRow$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class AutomaticDepositRecurringInvestmentHookViewRow2 extends FunctionReferenceImpl implements Function1<View, MergeRowRecurringInvestmentHookBinding> {
    public static final AutomaticDepositRecurringInvestmentHookViewRow2 INSTANCE = new AutomaticDepositRecurringInvestmentHookViewRow2();

    AutomaticDepositRecurringInvestmentHookViewRow2() {
        super(1, MergeRowRecurringInvestmentHookBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/recurring/databinding/MergeRowRecurringInvestmentHookBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRowRecurringInvestmentHookBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRowRecurringInvestmentHookBinding.bind(p0);
    }
}
