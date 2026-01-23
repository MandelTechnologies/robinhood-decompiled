package com.robinhood.android.isa.contributions;

import com.robinhood.android.isa.models.isa.p163db.entity.IsaContribution;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions;
import com.robinhood.android.isa.models.isa.p163db.entity.IsaContributions4;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IsaContributionConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationDataState;", "Lcom/robinhood/android/isa/contributions/IsaContributionConfirmationViewState;", "<init>", "()V", "reduce", "dataState", "lib-isa-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.isa.contributions.IsaContributionConfirmationStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IsaContributionConfirmationDuxo3 implements StateProvider<IsaContributionConfirmationDataState, IsaContributionConfirmationViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public IsaContributionConfirmationViewState reduce(IsaContributionConfirmationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        PaymentTransfer transfer = dataState.getTransfer();
        String originatingAccountId = transfer != null ? transfer.getOriginatingAccountId() : null;
        IsaContributions contributions = dataState.getContributions();
        IsaContribution isaContributionFindCurrentTaxYear = contributions != null ? IsaContributions4.findCurrentTaxYear(contributions) : null;
        Money contributed = isaContributionFindCurrentTaxYear != null ? isaContributionFindCurrentTaxYear.getContributed() : null;
        Money allowance = isaContributionFindCurrentTaxYear != null ? isaContributionFindCurrentTaxYear.getAllowance() : null;
        String taxYearLabel = isaContributionFindCurrentTaxYear != null ? isaContributionFindCurrentTaxYear.getTaxYearLabel() : null;
        Boolean boolValueOf = (contributed == null || allowance == null) ? null : Boolean.valueOf(Intrinsics.areEqual(contributed.getDecimalValue(), allowance.getDecimalValue()));
        PaymentTransfer transfer2 = dataState.getTransfer();
        Money money = transfer2 != null ? Money3.toMoney(transfer2.getAmount(), transfer2.getCurrency().getMoneyCurrency()) : null;
        Float fValueOf = (contributed == null || money == null || allowance == null) ? null : Float.valueOf(BigDecimals7.safeDivide(contributed.minus(money).getDecimalValue(), allowance.getDecimalValue()).floatValue());
        Float fValueOf2 = (contributed == null || allowance == null) ? null : Float.valueOf(BigDecimals7.safeDivide(contributed.getDecimalValue(), allowance.getDecimalValue()).floatValue());
        return new IsaContributionConfirmationViewState(originatingAccountId, money != null ? Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null, contributed != null ? Money.format$default(contributed, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null, taxYearLabel, fValueOf, fValueOf2, boolValueOf);
    }
}
