package com.robinhood.android.account.p060ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AccountOverviewInvestmentScheduleCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.AccountOverviewInvestmentScheduleCardKt$RecurringSection$1$1$1, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AccountOverviewInvestmentScheduleCard2 extends FunctionReferenceImpl implements Function0<Unit> {
    AccountOverviewInvestmentScheduleCard2(Object obj) {
        super(0, obj, AccountOverviewInvestmentScheduleCard3.class, "onInvestmentScheduleLearnMoreClicked", "onInvestmentScheduleLearnMoreClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AccountOverviewInvestmentScheduleCard3) this.receiver).onInvestmentScheduleLearnMoreClicked();
    }
}
