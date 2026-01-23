package com.robinhood.android.chart.equityadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.EquitiesOrderSideDto;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position5;
import com.robinhood.shared.trading.orderstate.Quantity;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: EquityAdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0012*\u00020\u001dH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0012*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001bH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"TIMEOUT", "Lkotlin/time/Duration;", "J", "SELL_ALL_ORDER", "", "BUY_ALL_ORDER", "PRICE_ROW_OPTION_ENTRY_POINT", "PRICE_ROW", "EDIT_ORDER", "PRICE_ROW_SELL", "PRICE_ROW_BUY", "CHART_SETTINGS_BOTTOM_SHEET_AUTO_SEND", "toEquityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;", "refId", "Ljava/util/UUID;", "tradeSide", "Lcom/robinhood/models/db/EquityOrderSide;", "limitPrice", "Ljava/math/BigDecimal;", "stopPrice", "existingOrder", "Lcom/robinhood/models/db/Order;", "checkOverrides", "", "autoSend", "", "toEquityTradeSide", "Lblack_widow/contracts/mobile_app_chart/proto/v1/EquitiesOrderSideDto;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "allowShorting", "lib-equity-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxoKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class EquityAdvanceChartOrderDuxo5 {
    public static final String BUY_ALL_ORDER = "BuyAllOrder";
    private static final String CHART_SETTINGS_BOTTOM_SHEET_AUTO_SEND = "ChartSettingsBottomSheetAutoSend";
    public static final String EDIT_ORDER = "EditOrder";
    public static final String PRICE_ROW = "PriceRow";
    public static final String PRICE_ROW_BUY = "PriceRowBuy";
    public static final String PRICE_ROW_OPTION_ENTRY_POINT = "PriceRowOptionEntryPoint";
    public static final String PRICE_ROW_SELL = "PriceRowSell";
    public static final String SELL_ALL_ORDER = "SellAllOrder";
    private static final long TIMEOUT;

    /* compiled from: EquityAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EquitiesOrderSideDto.values().length];
            try {
                iArr2[EquitiesOrderSideDto.EQUITIES_ORDER_SIDE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EquitiesOrderSideDto.EQUITIES_ORDER_SIDE_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EquitiesOrderSideDto.EQUITIES_ORDER_SIDE_SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EquitiesOrderSideDto.EQUITIES_ORDER_SIDE_SELL_SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BwTradeSide.values().length];
            try {
                iArr3[BwTradeSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BwTradeSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        TIMEOUT = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
    }

    public static final EquityOrderIntent toEquityOrderIntent(MacEquityOrderState macEquityOrderState, UUID refId, EquityOrderSide tradeSide, BigDecimal bigDecimal, BigDecimal bigDecimal2, Order order, List<String> checkOverrides, boolean z) {
        OrderTimeInForce longTimeInForce;
        OrderMarketHours longOrderMarketHours;
        Intrinsics.checkNotNullParameter(macEquityOrderState, "<this>");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(checkOverrides, "checkOverrides");
        Account account = macEquityOrderState.getAccount();
        Instrument instrument = macEquityOrderState.getInstrument();
        Quantity orderTradeAmount = macEquityOrderState.getOrderTradeAmount();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[tradeSide.ordinal()];
        if (i != 1) {
            if (i == 2) {
                longTimeInForce = macEquityOrderState.getLongTimeInForce();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                longTimeInForce = macEquityOrderState.getShortTimeInForce();
            }
        } else if (Position5.isShortPositionOrPending(macEquityOrderState.getPosition())) {
            longTimeInForce = macEquityOrderState.getShortTimeInForce();
        } else {
            longTimeInForce = macEquityOrderState.getLongTimeInForce();
        }
        int i2 = iArr[tradeSide.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                longOrderMarketHours = macEquityOrderState.getLongOrderMarketHours();
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                longOrderMarketHours = macEquityOrderState.getShortOrderMarketHours();
            }
        } else if (Position5.isShortPositionOrPending(macEquityOrderState.getPosition())) {
            longOrderMarketHours = macEquityOrderState.getShortOrderMarketHours();
        } else {
            longOrderMarketHours = macEquityOrderState.getLongOrderMarketHours();
        }
        return new EquityOrderIntent(refId, tradeSide, bigDecimal, bigDecimal2, account, instrument, orderTradeAmount, longTimeInForce, longOrderMarketHours, order, null, macEquityOrderState.getBuySellData().getTradingSession(), macEquityOrderState.getBuySellData().getClock(), checkOverrides, EquityOrderFlowSource.BW_ADVANCED_CHART, true, z, null, macEquityOrderState.getPosition(), macEquityOrderState.getShortingInfo(), 131072, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSide toEquityTradeSide(EquitiesOrderSideDto equitiesOrderSideDto) {
        int i = WhenMappings.$EnumSwitchMapping$1[equitiesOrderSideDto.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return EquityOrderSide.BUY;
        }
        if (i == 3) {
            return EquityOrderSide.SELL;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return EquityOrderSide.SELL_SHORT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EquityOrderSide toEquityTradeSide(BwTradeSide bwTradeSide, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$2[bwTradeSide.ordinal()];
        if (i == 1) {
            return EquityOrderSide.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            return EquityOrderSide.SELL_SHORT;
        }
        return EquityOrderSide.SELL;
    }
}
