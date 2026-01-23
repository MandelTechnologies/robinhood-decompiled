package com.robinhood.shared.trading.orderstate;

import com.robinhood.models.p320db.Account;
import kotlin.Metadata;

/* compiled from: InstrumentOrderState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "", "account", "Lcom/robinhood/models/db/Account;", "getAccount", "()Lcom/robinhood/models/db/Account;", "orderInstrument", "Lcom/robinhood/shared/trading/orderstate/OrderInstrument;", "getOrderInstrument", "()Lcom/robinhood/shared/trading/orderstate/OrderInstrument;", "orderTradeAmount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "getOrderTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "orderBuyingPower", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderBuyingPower;", "getOrderBuyingPower", "()Lcom/robinhood/shared/trading/orderstate/InstrumentOrderBuyingPower;", "orderPosition", "Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "getOrderPosition", "()Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "buyEnabled", "", "getBuyEnabled", "()Z", "sellEnabled", "getSellEnabled", "lib-order-state_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface InstrumentOrderState {
    Account getAccount();

    boolean getBuyEnabled();

    InstrumentOrderState2 getOrderBuyingPower();

    InstrumentOrderState5 getOrderInstrument();

    InstrumentOrderState3 getOrderPosition();

    InstrumentOrderState4 getOrderTradeAmount();

    boolean getSellEnabled();
}
