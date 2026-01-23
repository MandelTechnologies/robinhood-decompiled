package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo$sam$io_reactivex_functions_Function$0, reason: use source file name */
/* loaded from: classes11.dex */
final class DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo2 implements Function {
    private final /* synthetic */ Function1 function;

    DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo2(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // io.reactivex.functions.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.function.invoke(obj);
    }
}
