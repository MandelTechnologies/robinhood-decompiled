package com.robinhood.android.equities.equitytrade;

import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState3;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState5;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: EquityOrderState.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010 \u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u0004\u0018\u00010#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0012\u0010,\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0012\u0010.\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010)R\u0012\u00100\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010)R\u0012\u00102\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0012\u00104\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u0004\u0018\u00010;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010>\u001a\u0004\u0018\u00010?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010)R\u0014\u0010L\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010)R\u0014\u0010N\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010)R\u0014\u0010P\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0014\u0010V\u001a\u00020W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/EquityOrderState;", "Lcom/robinhood/shared/trading/orderstate/InstrumentOrderState;", "account", "Lcom/robinhood/models/db/Account;", "getAccount", "()Lcom/robinhood/models/db/Account;", "orderTradeAmount", "Lcom/robinhood/shared/trading/orderstate/Quantity;", "getOrderTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/Quantity;", "instrument", "Lcom/robinhood/models/db/Instrument;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "getPosition", "()Lcom/robinhood/models/db/Position;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "longOrderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "getLongOrderMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "shortOrderMarketHours", "getShortOrderMarketHours", "longTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "getLongTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "shortTimeInForce", "getShortTimeInForce", "selectedPrice", "Ljava/math/BigDecimal;", "getSelectedPrice", "()Ljava/math/BigDecimal;", "autoSendOrders", "", "getAutoSendOrders", "()Z", "confirmBuy", "getConfirmBuy", "hideBuy", "getHideBuy", "hideSell", "getHideSell", "confirmSell", "getConfirmSell", "loading", "getLoading", "shortingEnabled", "getShortingEnabled", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;", "getBuySellData", "()Lcom/robinhood/android/common/buysell/BuySellData;", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "getShortingInfo", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "orderPosition", "Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "getOrderPosition", "()Lcom/robinhood/shared/trading/orderstate/InstrumentPosition;", "orderBuyingPower", "Lcom/robinhood/android/equities/equitytrade/EquityInstrumentBuyingPower;", "getOrderBuyingPower", "()Lcom/robinhood/android/equities/equitytrade/EquityInstrumentBuyingPower;", "orderInstrument", "Lcom/robinhood/shared/trading/orderstate/OrderInstrument;", "getOrderInstrument", "()Lcom/robinhood/shared/trading/orderstate/OrderInstrument;", "allowShorting", "getAllowShorting", "buyEnabled", "getBuyEnabled", "sellEnabled", "getSellEnabled", "buyButtonState", "Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;", "getBuyButtonState", "()Lcom/robinhood/android/equities/equitytrade/EquityTradeButtonState;", "sellButtonState", "getSellButtonState", "sellOrderSide", "Lcom/robinhood/models/db/EquityOrderSide;", "getSellOrderSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EquityOrderState extends InstrumentOrderState {
    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    Account getAccount();

    boolean getAllowShorting();

    boolean getAutoSendOrders();

    EquityTradeButtonState getBuyButtonState();

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    boolean getBuyEnabled();

    BuySellData getBuySellData();

    boolean getConfirmBuy();

    boolean getConfirmSell();

    boolean getHideBuy();

    boolean getHideSell();

    Instrument getInstrument();

    InstrumentBuyingPower getInstrumentBuyingPower();

    boolean getLoading();

    OrderMarketHours getLongOrderMarketHours();

    OrderTimeInForce getLongTimeInForce();

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    EquityInstrumentBuyingPower getOrderBuyingPower();

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    InstrumentOrderState5 getOrderInstrument();

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    InstrumentOrderState3 getOrderPosition();

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    Quantity getOrderTradeAmount();

    Position getPosition();

    BigDecimal getSelectedPrice();

    EquityTradeButtonState getSellButtonState();

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    boolean getSellEnabled();

    EquityOrderSide getSellOrderSide();

    OrderMarketHours getShortOrderMarketHours();

    OrderTimeInForce getShortTimeInForce();

    boolean getShortingEnabled();

    ShortingInfo getShortingInfo();

    /* compiled from: EquityOrderState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static InstrumentOrderState3 getOrderPosition(EquityOrderState equityOrderState) {
            Position position = equityOrderState.getPosition();
            if (position != null) {
                return new EquityPosition(position);
            }
            return null;
        }

        public static EquityInstrumentBuyingPower getOrderBuyingPower(EquityOrderState equityOrderState) {
            return new EquityInstrumentBuyingPower(equityOrderState.getInstrumentBuyingPower());
        }

        public static InstrumentOrderState5 getOrderInstrument(EquityOrderState equityOrderState) {
            return new EquityInstrument(equityOrderState.getInstrument());
        }

        public static boolean getAllowShorting(EquityOrderState equityOrderState) {
            return equityOrderState.getShortingEnabled() && equityOrderState.getBuySellData().getIsSellToOpenEnabled();
        }

        public static boolean getBuyEnabled(EquityOrderState equityOrderState) {
            return ((!equityOrderState.getBuySellData().getIsBuyToOpenEnabled() && !equityOrderState.getBuySellData().getIsBuyToCloseEnabled()) || equityOrderState.getInstrument().isOtc() || equityOrderState.getLoading()) ? false : true;
        }

        public static boolean getSellEnabled(EquityOrderState equityOrderState) {
            boolean isSellToCloseEnabled;
            if (equityOrderState.getAllowShorting()) {
                isSellToCloseEnabled = equityOrderState.getBuySellData().getSellToOpenAnySessionActive();
            } else {
                isSellToCloseEnabled = equityOrderState.getBuySellData().getIsSellToCloseEnabled();
            }
            return (!isSellToCloseEnabled || equityOrderState.getInstrument().isOtc() || equityOrderState.getLoading()) ? false : true;
        }

        public static EquityTradeButtonState getBuyButtonState(EquityOrderState equityOrderState) {
            int i;
            boolean buyEnabled = equityOrderState.getBuyEnabled();
            boolean hideBuy = equityOrderState.getHideBuy();
            StringResource.Companion companion = StringResource.INSTANCE;
            if (equityOrderState.getConfirmBuy()) {
                i = C14697R.string.market_submit_label;
            } else {
                i = C14697R.string.market_buy_label;
            }
            return new EquityTradeButtonState(buyEnabled, false, hideBuy, equityOrderState.getConfirmBuy(), companion.invoke(i, new Object[0]), 2, null);
        }

        public static EquityTradeButtonState getSellButtonState(EquityOrderState equityOrderState) {
            boolean sellEnabled;
            int i;
            if (equityOrderState.getAllowShorting()) {
                sellEnabled = equityOrderState.getBuySellData().getSellToOpenMarketSessionActive();
            } else {
                sellEnabled = equityOrderState.getSellEnabled();
            }
            boolean z = sellEnabled;
            boolean hideSell = equityOrderState.getHideSell();
            StringResource.Companion companion = StringResource.INSTANCE;
            if (equityOrderState.getConfirmSell()) {
                i = C14697R.string.market_submit_label;
            } else {
                i = equityOrderState.getAllowShorting() ? C14697R.string.market_sell_short_label : C14697R.string.market_sell_label;
            }
            return new EquityTradeButtonState(z, true, hideSell, equityOrderState.getConfirmSell(), companion.invoke(i, new Object[0]));
        }

        public static EquityOrderSide getSellOrderSide(EquityOrderState equityOrderState) {
            if (equityOrderState.getAllowShorting()) {
                return EquityOrderSide.SELL_SHORT;
            }
            return EquityOrderSide.SELL;
        }
    }
}
