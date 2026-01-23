package com.robinhood.android.advancedorderbottomsheet;

import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import equity_trading_tax_lots.proto.p460v1.AvailableSelectionStrategyOption;
import kotlin.Metadata;

/* compiled from: EquityAdvancedOrderDropdownEditCallbacks.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;", "", "orderMarketHoursSelected", "", "orderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "hideSheet", "", "orderTimeInForceSelected", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "strategySelected", "availableSelectionStrategyOption", "Lequity_trading_tax_lots/proto/v1/AvailableSelectionStrategyOption;", "lib-advanced-order-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface EquityAdvancedOrderDropdownEditCallbacks {
    void orderMarketHoursSelected(OrderMarketHours orderMarketHours, boolean hideSheet);

    void orderTimeInForceSelected(OrderTimeInForce orderTimeInForce, boolean hideSheet);

    void strategySelected(AvailableSelectionStrategyOption availableSelectionStrategyOption, boolean hideSheet);
}
