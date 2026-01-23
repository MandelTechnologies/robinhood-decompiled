package com.robinhood.android.trade.equity.util;

import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;

/* compiled from: EquityOrderContextHolder.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/util/EquityOrderContextHolder;", "", "equityOrderContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "getEquityOrderContext", "()Lcom/robinhood/android/equity/validation/EquityOrderContext;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "getConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface EquityOrderContextHolder {
    EquityOrderConfiguration getConfiguration();

    EquityOrderContext getEquityOrderContext();
}
