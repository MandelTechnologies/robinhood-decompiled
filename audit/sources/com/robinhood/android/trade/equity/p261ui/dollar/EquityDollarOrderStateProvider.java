package com.robinhood.android.trade.equity.p261ui.dollar;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityDollarOrderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDataState;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderViewState;", "<init>", "()V", "reduce", "dataState", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EquityDollarOrderStateProvider implements StateProvider<EquityDollarOrderDataState, EquityDollarOrderViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EquityDollarOrderViewState reduce(EquityDollarOrderDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new EquityDollarOrderViewState(dataState.getConfiguration(), dataState.getQuantityOrAmount(), dataState.getOverrideCharArray(), dataState.getIsReviewButtonLoading(), dataState.getFormState(), dataState.getLoadingNbbo(), dataState.getApiQuickTradeAmounts(), dataState.getInstrumentAccountSwitcher(), dataState.getAllAccounts(), dataState.getLoadingAccountSwitcher(), dataState.getAccount(), dataState.getInstrument(), dataState.getTradingSession(), dataState.getPosition(), dataState.getQuote(), dataState.getNbboSummary(), dataState.getCheckOverrides(), dataState.isCancelPendingCryptoOrdersLoading(), dataState.getStaticInputs(), dataState.isBackupWithheld(), dataState.getWithholdingStatus(), dataState.getMlpExperimentMember(), dataState.getSessionChangeAlertContent(), dataState.getEquityOrderContext(), dataState.getMicrogramOrderSummary(), dataState.getMicrogramState(), dataState.getHasSalesTaxes(), dataState.getUseSduiAccountSwitcher());
    }
}
