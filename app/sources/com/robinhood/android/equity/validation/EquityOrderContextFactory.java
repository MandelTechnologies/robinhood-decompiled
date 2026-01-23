package com.robinhood.android.equity.validation;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.taxlotsmodelsapi.TaxLotSelectionType;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.models.api.ApiFeeItem;
import com.robinhood.models.api.OrderRequest2;
import com.robinhood.models.api.bonfire.OrderEntryPoint;
import com.robinhood.models.api.bonfire.OrderInputFormat;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.DirectOrderRequestDrafter;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.OrderTrailingPeg;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: EquityOrderContextFactory.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderContextFactory;", "", "<init>", "()V", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/Instrument;", "instrument", "Lcom/robinhood/models/db/TradingSession;", "tradingSession", "Lcom/robinhood/models/db/Position;", "position", "Lcom/robinhood/models/db/Quote;", "quote", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "requestInputs", "j$/time/Instant", "now", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "instrumentBuyingPower", "Lcom/robinhood/models/db/Order;", "orderPendingReplacement", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/TradingSession;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;Lj$/time/Instant;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/db/Order;)Lcom/robinhood/android/equity/validation/EquityOrderContext;", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "Lcom/robinhood/models/api/bonfire/OrderEntryPoint;", "toEntryPoint$lib_equity_validation_externalDebug", "(Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;)Lcom/robinhood/models/api/bonfire/OrderEntryPoint;", "toEntryPoint", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityOrderContextFactory {
    public static final int $stable = 0;
    public static final EquityOrderContextFactory INSTANCE = new EquityOrderContextFactory();

    /* compiled from: EquityOrderContextFactory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderFlowSource.values().length];
            try {
                iArr[EquityOrderFlowSource.SDP_TRADE_BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderFlowSource.LEVEL_2_MARKET_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderFlowSource.ANALYST_REPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EquityOrderFlowSource.ADVANCED_CHART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EquityOrderFlowSource.BW_ADVANCED_CHART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EquityOrderFlowSource.LADDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EquityOrderFlowSource.OPTION_EXERCISE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EquityOrderFlowSource.RECURRING_FLOW_COMPLETION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EquityOrderFlowSource.ORDER_SUBMIT_NOTIFICATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EquityOrderFlowSource.ORDER_DETAIL_IPO_EDIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EquityOrderFlowSource.ORDER_DETAIL_EXTEND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EquityOrderFlowSource.INSTRUMENT_ROW.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EquityOrderFlowSource.DEEPLINK_INSTRUMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EquityOrderFlowSource.DEEPLINK_IPO_ENTER_ORDER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EquityOrderFlowSource.DEEPLINK_IPO_PLACE_PRE_IPO_ORDER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EquityOrderFlowSource.EQUITY_ORDER_WITH_SYMBOL_ACTIVITY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EquityOrderFlowSource.FRACTIONAL_NUX_BOTTOM_SHEET.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[EquityOrderFlowSource.CANCEL_NEW_HISTORY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[EquityOrderFlowSource.REDESIGN_PORTFOLIO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[EquityOrderFlowSource.WATCHLIST_TAB.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[EquityOrderFlowSource.WATCHLIST_ROW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[EquityOrderFlowSource.MAINTENANCE_CALL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EquityOrderContextFactory() {
    }

    public final EquityOrderContext create(Account account, Instrument instrument, TradingSession tradingSession, Position position, Quote quote, EquityOrderRequestInputs requestInputs, Instant now, InstrumentBuyingPower instrumentBuyingPower, Order orderPendingReplacement) {
        OrderInputFormat orderInputFormat;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        Intrinsics.checkNotNullParameter(requestInputs, "requestInputs");
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
        EquityOrderRequestInputs.StaticInputs staticInputs = requestInputs.getStaticInputs();
        DirectOrderRequestDrafter directOrderRequestDrafter = DirectOrderRequestDrafter.INSTANCE;
        boolean zIsPreIpo = staticInputs.isPreIpo();
        boolean overrideToExecuteInMarketHoursOnly = requestInputs.getOverrideToExecuteInMarketHoursOnly();
        OrderMarketHours overrideMarketHours = requestInputs.getOverrideMarketHours();
        List<String> checkOverrides = requestInputs.getCheckOverrides();
        BigDecimal limitPrice = requestInputs.getLimitPrice();
        if (limitPrice == null) {
            limitPrice = orderPendingReplacement != null ? orderPendingReplacement.getPrice() : null;
        }
        OrderRequest2 quantityOrAmount = requestInputs.getQuantityOrAmount();
        UUID uuid = staticInputs.getUuid();
        EquityOrderSide side = staticInputs.getSide();
        BigDecimal stopPrice = requestInputs.getStopPrice();
        OrderTrailingPeg orderTrailingPegGenerate = OrderTrailingPeg.INSTANCE.generate(requestInputs.getTrailAmount(), requestInputs.getTrailPercentage());
        BigDecimal presetPercentLimit = requestInputs.getPresetPercentLimit();
        OrderTimeInForce timeInForce = requestInputs.getTimeInForce();
        Order.Configuration orderConfiguration = requestInputs.getOrderConfiguration();
        BigDecimal estimatedTotalFeesAndTaxes = requestInputs.getEstimatedTotalFeesAndTaxes();
        List<ApiFeeItem> estimatedFees = requestInputs.getEstimatedFees();
        BigDecimal borrowFeeApr = requestInputs.getBorrowFeeApr();
        boolean marketBuysEnabled = requestInputs.getMarketBuysEnabled();
        TaxLotSelectionType taxLotSelectionType = requestInputs.getTaxLotSelectionType();
        List<TaxLotSelection> taxLotsSelections = requestInputs.getTaxLotsSelections();
        boolean subzeroEnabled = requestInputs.getSubzeroEnabled();
        OrderPositionEffect positionEffect = requestInputs.getPositionEffect();
        OrderRequest2 quantityOrAmount2 = requestInputs.getQuantityOrAmount();
        if (quantityOrAmount2 instanceof OrderRequest2.DollarAmount) {
            orderInputFormat = OrderInputFormat.DOLLARS;
        } else {
            if (!(quantityOrAmount2 instanceof OrderRequest2.ShareQuantity)) {
                throw new NoWhenBranchMatchedException();
            }
            orderInputFormat = OrderInputFormat.SHARES;
        }
        return new EquityOrderContext(directOrderRequestDrafter.create(account, instrument, tradingSession, zIsPreIpo, overrideToExecuteInMarketHoursOnly, overrideMarketHours, checkOverrides, limitPrice, quantityOrAmount, quote, uuid, side, stopPrice, orderTrailingPegGenerate, presetPercentLimit, timeInForce, orderConfiguration, estimatedTotalFeesAndTaxes, estimatedFees, borrowFeeApr, now, marketBuysEnabled, taxLotSelectionType, taxLotsSelections, subzeroEnabled, positionEffect, orderPendingReplacement, orderInputFormat, toEntryPoint$lib_equity_validation_externalDebug(staticInputs.getFlowSource())), new EquityOrderContext.RequestContext(account, instrument, position, quote, instrumentBuyingPower, requestInputs.getOverrideFlipIpoAccessShares()));
    }

    public final OrderEntryPoint toEntryPoint$lib_equity_validation_externalDebug(EquityOrderFlowSource equityOrderFlowSource) {
        Intrinsics.checkNotNullParameter(equityOrderFlowSource, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[equityOrderFlowSource.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return OrderEntryPoint.STOCK_DETAIL_PAGE;
            case 4:
            case 5:
                return OrderEntryPoint.MOBILE_CHARTS;
            case 6:
                return OrderEntryPoint.LADDER;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
