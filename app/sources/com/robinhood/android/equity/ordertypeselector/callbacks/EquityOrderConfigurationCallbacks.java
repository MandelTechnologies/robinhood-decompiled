package com.robinhood.android.equity.ordertypeselector.callbacks;

import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;

/* compiled from: EquityOrderConfigurationCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equity/ordertypeselector/callbacks/EquityOrderConfigurationCallbacks;", "", "onOrderConfigurationResult", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "lib-equity-order-type-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityOrderConfigurationCallbacks {
    void onOrderConfigurationResult(EquityOrderConfiguration configuration);
}
