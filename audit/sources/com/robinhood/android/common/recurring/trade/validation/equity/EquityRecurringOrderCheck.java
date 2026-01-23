package com.robinhood.android.common.recurring.trade.validation.equity;

import com.robinhood.android.common.recurring.trade.RecurringOrderViewState;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderContext;
import com.robinhood.android.common.recurring.trade.validation.RecurringOrderValidationFailureResolver;
import com.robinhood.android.lib.trade.validation.Validator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityRecurringOrderCheck.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\n\u001a\u00020\u0002J,\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/validation/equity/EquityRecurringOrderCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderContext;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailureResolver;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/common/recurring/trade/validation/RecurringOrderValidationFailure;", "input", "equityData", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderViewState$InvestmentTargetData$Equity;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class EquityRecurringOrderCheck implements Validator.Check<RecurringOrderContext, RecurringOrderValidationFailureResolver> {
    public static final int $stable = 0;

    public abstract Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> check(RecurringOrderContext input, RecurringOrderViewState.InvestmentTargetData.Equity equityData);

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public final Validator.Failure<RecurringOrderContext, RecurringOrderValidationFailureResolver> check(RecurringOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        RecurringOrderViewState.InvestmentTargetData investmentTargetData = input.getInvestmentTargetData();
        if ((investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Crypto) || Intrinsics.areEqual(investmentTargetData, RecurringOrderViewState.InvestmentTargetData.BrokerageCash.INSTANCE)) {
            return null;
        }
        if (investmentTargetData instanceof RecurringOrderViewState.InvestmentTargetData.Equity) {
            return check(input, (RecurringOrderViewState.InvestmentTargetData.Equity) investmentTargetData);
        }
        throw new NoWhenBranchMatchedException();
    }
}
