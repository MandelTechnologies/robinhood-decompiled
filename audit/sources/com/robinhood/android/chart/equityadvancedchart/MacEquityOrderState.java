package com.robinhood.android.chart.equityadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.equities.equitytrade.EquityInstrumentBuyingPower;
import com.robinhood.android.equities.equitytrade.EquityOrderState;
import com.robinhood.android.equities.equitytrade.EquityTradeButtonState;
import com.robinhood.android.equities.tradesettings.utils.TimeInForceUtils;
import com.robinhood.android.equityadvancedorder.C15237R;
import com.robinhood.android.equityadvancedorder.utils.MarketHours3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState3;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState5;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MacEquityOrderState.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\u0006\u0010!\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0010\u0010j\u001a\u00020a2\u0006\u0010k\u001a\u00020#H\u0002J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0005HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010o\u001a\u00020\tHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010q\u001a\u00020\rHÆ\u0003J\t\u0010r\u001a\u00020\u000fHÆ\u0003J\t\u0010s\u001a\u00020\u0011HÆ\u0003J\t\u0010t\u001a\u00020\u0013HÆ\u0003J\t\u0010u\u001a\u00020\rHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010w\u001a\u00020\rHÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010y\u001a\u00020\rHÆ\u0003J\t\u0010z\u001a\u00020\rHÆ\u0003J\t\u0010{\u001a\u00020\rHÆ\u0003J\t\u0010|\u001a\u00020\u001eHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010 HÆ\u0003J\t\u0010~\u001a\u00020\rHÆ\u0003J\t\u0010\u007f\u001a\u00020#HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020#HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020&HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020&HÆ\u0003Jú\u0001\u0010\u0083\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&HÆ\u0001J\u0016\u0010\u0084\u0001\u001a\u00020\r2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001HÖ\u0003J\u000b\u0010\u0087\u0001\u001a\u00030\u0088\u0001HÖ\u0001J\n\u0010\u0089\u0001\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b<\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b?\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bB\u00105R\u0014\u0010\u001b\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0014\u0010\u001c\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00105R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0014\u0010!\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u00105R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0014\u0010$\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0014\u0010%\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0014\u0010'\u001a\u00020&X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0016\u0010P\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bU\u00105R\u0014\u0010V\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u00105R\u0014\u0010X\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u00105R\u0014\u0010Z\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u00105R\u0014\u0010\\\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u00105R\u0011\u0010^\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b_\u00105R\u0011\u0010`\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\be\u0010cR\u0013\u0010f\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bg\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010a8F¢\u0006\u0006\u001a\u0004\bi\u0010c¨\u0006\u008a\u0001"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;", "Lcom/robinhood/android/equities/equitytrade/EquityOrderState;", "account", "Lcom/robinhood/models/db/Account;", "orderTradeAmount", "Lcom/robinhood/shared/trading/orderstate/Quantity;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "instrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "autoSendSwitchState", "", "nextMarketHours", "Lcom/robinhood/models/db/MarketHours;", "brokebackOrderExpireDateString", "", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "autoSendKillSwitchEnabled", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "tradingOnChart", "autoSendConfirmMarketOrderSide", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "nbboLoading", "confirmBuy", "confirmSell", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "shortingEnabled", "longOrderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "shortOrderMarketHours", "longTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "shortTimeInForce", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/shared/trading/orderstate/Quantity;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Position;ZLcom/robinhood/models/db/MarketHours;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;ZLcom/robinhood/nbbo/models/db/NbboSummary;ZLcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;ZZZLcom/robinhood/android/common/buysell/BuySellData;Lcom/robinhood/shared/equities/subzero/ShortingInfo;ZLcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getOrderTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/Quantity;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getAutoSendSwitchState", "()Z", "getNextMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getBrokebackOrderExpireDateString", "()Ljava/lang/String;", "getQuote", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getAutoSendKillSwitchEnabled", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getTradingOnChart", "getAutoSendConfirmMarketOrderSide", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "getNbboLoading", "getConfirmBuy", "getConfirmSell", "getBuySellData", "()Lcom/robinhood/android/common/buysell/BuySellData;", "getShortingInfo", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "getShortingEnabled", "getLongOrderMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getShortOrderMarketHours", "getLongTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getShortTimeInForce", "selectedPrice", "Ljava/math/BigDecimal;", "getSelectedPrice", "()Ljava/math/BigDecimal;", "showNbbo", "getShowNbbo", "autoSendOrders", "getAutoSendOrders", "hideBuy", "getHideBuy", "hideSell", "getHideSell", "loading", "getLoading", "marketSellEnabled", "getMarketSellEnabled", "longTradingHoursDisplayTitle", "Lcom/robinhood/utils/resource/StringResource;", "getLongTradingHoursDisplayTitle", "()Lcom/robinhood/utils/resource/StringResource;", "shortTradingHoursDisplayTitle", "getShortTradingHoursDisplayTitle", "longTimeInForceDisplayTitle", "getLongTimeInForceDisplayTitle", "shortTimeInForceDisplayTitle", "getShortTimeInForceDisplayTitle", "getTradingSessionTitle", "tradingSession", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MacEquityOrderState implements EquityOrderState {
    public static final int $stable = 8;
    private final Account account;
    private final BwTradeSide autoSendConfirmMarketOrderSide;
    private final boolean autoSendKillSwitchEnabled;
    private final boolean autoSendSwitchState;
    private final String brokebackOrderExpireDateString;
    private final BuySellData buySellData;
    private final boolean confirmBuy;
    private final boolean confirmSell;
    private final Instrument instrument;
    private final InstrumentBuyingPower instrumentBuyingPower;
    private final OrderMarketHours longOrderMarketHours;
    private final OrderTimeInForce longTimeInForce;
    private final boolean marketSellEnabled;
    private final boolean nbboLoading;
    private final NbboSummary nbboSummary;
    private final MarketHours nextMarketHours;
    private final Quantity orderTradeAmount;
    private final Position position;
    private final QuoteDto quote;
    private final OrderMarketHours shortOrderMarketHours;
    private final OrderTimeInForce shortTimeInForce;
    private final boolean shortingEnabled;
    private final ShortingInfo shortingInfo;
    private final boolean tradingOnChart;

    /* compiled from: MacEquityOrderState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderTimeInForce.values().length];
            try {
                iArr[OrderTimeInForce.GFD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderTimeInForce.GTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderMarketHours.values().length];
            try {
                iArr2[OrderMarketHours.EXTENDED_HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderMarketHours.REGULAR_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderMarketHours.HYPER_EXTENDED_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderMarketHours.ALL_DAY_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderMarketHours.REGULAR_CURB_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ MacEquityOrderState copy$default(MacEquityOrderState macEquityOrderState, Account account, Quantity quantity, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, Position position, boolean z, MarketHours marketHours, String str, QuoteDto quoteDto, boolean z2, NbboSummary nbboSummary, boolean z3, BwTradeSide bwTradeSide, boolean z4, boolean z5, boolean z6, BuySellData buySellData, ShortingInfo shortingInfo, boolean z7, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, int i, Object obj) {
        OrderTimeInForce orderTimeInForce3;
        OrderTimeInForce orderTimeInForce4;
        Account account2 = (i & 1) != 0 ? macEquityOrderState.account : account;
        Quantity quantity2 = (i & 2) != 0 ? macEquityOrderState.orderTradeAmount : quantity;
        InstrumentBuyingPower instrumentBuyingPower2 = (i & 4) != 0 ? macEquityOrderState.instrumentBuyingPower : instrumentBuyingPower;
        Instrument instrument2 = (i & 8) != 0 ? macEquityOrderState.instrument : instrument;
        Position position2 = (i & 16) != 0 ? macEquityOrderState.position : position;
        boolean z8 = (i & 32) != 0 ? macEquityOrderState.autoSendSwitchState : z;
        MarketHours marketHours2 = (i & 64) != 0 ? macEquityOrderState.nextMarketHours : marketHours;
        String str2 = (i & 128) != 0 ? macEquityOrderState.brokebackOrderExpireDateString : str;
        QuoteDto quoteDto2 = (i & 256) != 0 ? macEquityOrderState.quote : quoteDto;
        boolean z9 = (i & 512) != 0 ? macEquityOrderState.autoSendKillSwitchEnabled : z2;
        NbboSummary nbboSummary2 = (i & 1024) != 0 ? macEquityOrderState.nbboSummary : nbboSummary;
        boolean z10 = (i & 2048) != 0 ? macEquityOrderState.tradingOnChart : z3;
        BwTradeSide bwTradeSide2 = (i & 4096) != 0 ? macEquityOrderState.autoSendConfirmMarketOrderSide : bwTradeSide;
        boolean z11 = (i & 8192) != 0 ? macEquityOrderState.nbboLoading : z4;
        Account account3 = account2;
        boolean z12 = (i & 16384) != 0 ? macEquityOrderState.confirmBuy : z5;
        boolean z13 = (i & 32768) != 0 ? macEquityOrderState.confirmSell : z6;
        BuySellData buySellData2 = (i & 65536) != 0 ? macEquityOrderState.buySellData : buySellData;
        ShortingInfo shortingInfo2 = (i & 131072) != 0 ? macEquityOrderState.shortingInfo : shortingInfo;
        boolean z14 = (i & 262144) != 0 ? macEquityOrderState.shortingEnabled : z7;
        OrderMarketHours orderMarketHours3 = (i & 524288) != 0 ? macEquityOrderState.longOrderMarketHours : orderMarketHours;
        OrderMarketHours orderMarketHours4 = (i & 1048576) != 0 ? macEquityOrderState.shortOrderMarketHours : orderMarketHours2;
        OrderTimeInForce orderTimeInForce5 = (i & 2097152) != 0 ? macEquityOrderState.longTimeInForce : orderTimeInForce;
        if ((i & 4194304) != 0) {
            orderTimeInForce4 = orderTimeInForce5;
            orderTimeInForce3 = macEquityOrderState.shortTimeInForce;
        } else {
            orderTimeInForce3 = orderTimeInForce2;
            orderTimeInForce4 = orderTimeInForce5;
        }
        return macEquityOrderState.copy(account3, quantity2, instrumentBuyingPower2, instrument2, position2, z8, marketHours2, str2, quoteDto2, z9, nbboSummary2, z10, bwTradeSide2, z11, z12, z13, buySellData2, shortingInfo2, z14, orderMarketHours3, orderMarketHours4, orderTimeInForce4, orderTimeInForce3);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getTradingOnChart() {
        return this.tradingOnChart;
    }

    /* renamed from: component13, reason: from getter */
    public final BwTradeSide getAutoSendConfirmMarketOrderSide() {
        return this.autoSendConfirmMarketOrderSide;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getConfirmBuy() {
        return this.confirmBuy;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getConfirmSell() {
        return this.confirmSell;
    }

    /* renamed from: component17, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component18, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Quantity getOrderTradeAmount() {
        return this.orderTradeAmount;
    }

    /* renamed from: component20, reason: from getter */
    public final OrderMarketHours getLongOrderMarketHours() {
        return this.longOrderMarketHours;
    }

    /* renamed from: component21, reason: from getter */
    public final OrderMarketHours getShortOrderMarketHours() {
        return this.shortOrderMarketHours;
    }

    /* renamed from: component22, reason: from getter */
    public final OrderTimeInForce getLongTimeInForce() {
        return this.longTimeInForce;
    }

    /* renamed from: component23, reason: from getter */
    public final OrderTimeInForce getShortTimeInForce() {
        return this.shortTimeInForce;
    }

    /* renamed from: component3, reason: from getter */
    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    /* renamed from: component4, reason: from getter */
    public final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component5, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAutoSendSwitchState() {
        return this.autoSendSwitchState;
    }

    /* renamed from: component7, reason: from getter */
    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    /* renamed from: component9, reason: from getter */
    public final QuoteDto getQuote() {
        return this.quote;
    }

    public final MacEquityOrderState copy(Account account, Quantity orderTradeAmount, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, Position position, boolean autoSendSwitchState, MarketHours nextMarketHours, String brokebackOrderExpireDateString, QuoteDto quote, boolean autoSendKillSwitchEnabled, NbboSummary nbboSummary, boolean tradingOnChart, BwTradeSide autoSendConfirmMarketOrderSide, boolean nbboLoading, boolean confirmBuy, boolean confirmSell, BuySellData buySellData, ShortingInfo shortingInfo, boolean shortingEnabled, OrderMarketHours longOrderMarketHours, OrderMarketHours shortOrderMarketHours, OrderTimeInForce longTimeInForce, OrderTimeInForce shortTimeInForce) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(orderTradeAmount, "orderTradeAmount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(nextMarketHours, "nextMarketHours");
        Intrinsics.checkNotNullParameter(brokebackOrderExpireDateString, "brokebackOrderExpireDateString");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(buySellData, "buySellData");
        Intrinsics.checkNotNullParameter(longOrderMarketHours, "longOrderMarketHours");
        Intrinsics.checkNotNullParameter(shortOrderMarketHours, "shortOrderMarketHours");
        Intrinsics.checkNotNullParameter(longTimeInForce, "longTimeInForce");
        Intrinsics.checkNotNullParameter(shortTimeInForce, "shortTimeInForce");
        return new MacEquityOrderState(account, orderTradeAmount, instrumentBuyingPower, instrument, position, autoSendSwitchState, nextMarketHours, brokebackOrderExpireDateString, quote, autoSendKillSwitchEnabled, nbboSummary, tradingOnChart, autoSendConfirmMarketOrderSide, nbboLoading, confirmBuy, confirmSell, buySellData, shortingInfo, shortingEnabled, longOrderMarketHours, shortOrderMarketHours, longTimeInForce, shortTimeInForce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MacEquityOrderState)) {
            return false;
        }
        MacEquityOrderState macEquityOrderState = (MacEquityOrderState) other;
        return Intrinsics.areEqual(this.account, macEquityOrderState.account) && Intrinsics.areEqual(this.orderTradeAmount, macEquityOrderState.orderTradeAmount) && Intrinsics.areEqual(this.instrumentBuyingPower, macEquityOrderState.instrumentBuyingPower) && Intrinsics.areEqual(this.instrument, macEquityOrderState.instrument) && Intrinsics.areEqual(this.position, macEquityOrderState.position) && this.autoSendSwitchState == macEquityOrderState.autoSendSwitchState && Intrinsics.areEqual(this.nextMarketHours, macEquityOrderState.nextMarketHours) && Intrinsics.areEqual(this.brokebackOrderExpireDateString, macEquityOrderState.brokebackOrderExpireDateString) && Intrinsics.areEqual(this.quote, macEquityOrderState.quote) && this.autoSendKillSwitchEnabled == macEquityOrderState.autoSendKillSwitchEnabled && Intrinsics.areEqual(this.nbboSummary, macEquityOrderState.nbboSummary) && this.tradingOnChart == macEquityOrderState.tradingOnChart && this.autoSendConfirmMarketOrderSide == macEquityOrderState.autoSendConfirmMarketOrderSide && this.nbboLoading == macEquityOrderState.nbboLoading && this.confirmBuy == macEquityOrderState.confirmBuy && this.confirmSell == macEquityOrderState.confirmSell && Intrinsics.areEqual(this.buySellData, macEquityOrderState.buySellData) && Intrinsics.areEqual(this.shortingInfo, macEquityOrderState.shortingInfo) && this.shortingEnabled == macEquityOrderState.shortingEnabled && this.longOrderMarketHours == macEquityOrderState.longOrderMarketHours && this.shortOrderMarketHours == macEquityOrderState.shortOrderMarketHours && this.longTimeInForce == macEquityOrderState.longTimeInForce && this.shortTimeInForce == macEquityOrderState.shortTimeInForce;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getHideBuy() {
        return false;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getHideSell() {
        return false;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getLoading() {
        return false;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public BigDecimal getSelectedPrice() {
        return null;
    }

    public int hashCode() {
        int iHashCode = ((this.account.hashCode() * 31) + this.orderTradeAmount.hashCode()) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        int iHashCode2 = (((iHashCode + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31) + this.instrument.hashCode()) * 31;
        Position position = this.position;
        int iHashCode3 = (((((((((((iHashCode2 + (position == null ? 0 : position.hashCode())) * 31) + Boolean.hashCode(this.autoSendSwitchState)) * 31) + this.nextMarketHours.hashCode()) * 31) + this.brokebackOrderExpireDateString.hashCode()) * 31) + this.quote.hashCode()) * 31) + Boolean.hashCode(this.autoSendKillSwitchEnabled)) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode4 = (((iHashCode3 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + Boolean.hashCode(this.tradingOnChart)) * 31;
        BwTradeSide bwTradeSide = this.autoSendConfirmMarketOrderSide;
        int iHashCode5 = (((((((((iHashCode4 + (bwTradeSide == null ? 0 : bwTradeSide.hashCode())) * 31) + Boolean.hashCode(this.nbboLoading)) * 31) + Boolean.hashCode(this.confirmBuy)) * 31) + Boolean.hashCode(this.confirmSell)) * 31) + this.buySellData.hashCode()) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        return ((((((((((iHashCode5 + (shortingInfo != null ? shortingInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.shortingEnabled)) * 31) + this.longOrderMarketHours.hashCode()) * 31) + this.shortOrderMarketHours.hashCode()) * 31) + this.longTimeInForce.hashCode()) * 31) + this.shortTimeInForce.hashCode();
    }

    public String toString() {
        return "MacEquityOrderState(account=" + this.account + ", orderTradeAmount=" + this.orderTradeAmount + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", instrument=" + this.instrument + ", position=" + this.position + ", autoSendSwitchState=" + this.autoSendSwitchState + ", nextMarketHours=" + this.nextMarketHours + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", quote=" + this.quote + ", autoSendKillSwitchEnabled=" + this.autoSendKillSwitchEnabled + ", nbboSummary=" + this.nbboSummary + ", tradingOnChart=" + this.tradingOnChart + ", autoSendConfirmMarketOrderSide=" + this.autoSendConfirmMarketOrderSide + ", nbboLoading=" + this.nbboLoading + ", confirmBuy=" + this.confirmBuy + ", confirmSell=" + this.confirmSell + ", buySellData=" + this.buySellData + ", shortingInfo=" + this.shortingInfo + ", shortingEnabled=" + this.shortingEnabled + ", longOrderMarketHours=" + this.longOrderMarketHours + ", shortOrderMarketHours=" + this.shortOrderMarketHours + ", longTimeInForce=" + this.longTimeInForce + ", shortTimeInForce=" + this.shortTimeInForce + ")";
    }

    public MacEquityOrderState(Account account, Quantity orderTradeAmount, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, Position position, boolean z, MarketHours nextMarketHours, String brokebackOrderExpireDateString, QuoteDto quote, boolean z2, NbboSummary nbboSummary, boolean z3, BwTradeSide bwTradeSide, boolean z4, boolean z5, boolean z6, BuySellData buySellData, ShortingInfo shortingInfo, boolean z7, OrderMarketHours longOrderMarketHours, OrderMarketHours shortOrderMarketHours, OrderTimeInForce longTimeInForce, OrderTimeInForce shortTimeInForce) {
        boolean sellEnabled;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(orderTradeAmount, "orderTradeAmount");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(nextMarketHours, "nextMarketHours");
        Intrinsics.checkNotNullParameter(brokebackOrderExpireDateString, "brokebackOrderExpireDateString");
        Intrinsics.checkNotNullParameter(quote, "quote");
        Intrinsics.checkNotNullParameter(buySellData, "buySellData");
        Intrinsics.checkNotNullParameter(longOrderMarketHours, "longOrderMarketHours");
        Intrinsics.checkNotNullParameter(shortOrderMarketHours, "shortOrderMarketHours");
        Intrinsics.checkNotNullParameter(longTimeInForce, "longTimeInForce");
        Intrinsics.checkNotNullParameter(shortTimeInForce, "shortTimeInForce");
        this.account = account;
        this.orderTradeAmount = orderTradeAmount;
        this.instrumentBuyingPower = instrumentBuyingPower;
        this.instrument = instrument;
        this.position = position;
        this.autoSendSwitchState = z;
        this.nextMarketHours = nextMarketHours;
        this.brokebackOrderExpireDateString = brokebackOrderExpireDateString;
        this.quote = quote;
        this.autoSendKillSwitchEnabled = z2;
        this.nbboSummary = nbboSummary;
        this.tradingOnChart = z3;
        this.autoSendConfirmMarketOrderSide = bwTradeSide;
        this.nbboLoading = z4;
        this.confirmBuy = z5;
        this.confirmSell = z6;
        this.buySellData = buySellData;
        this.shortingInfo = shortingInfo;
        this.shortingEnabled = z7;
        this.longOrderMarketHours = longOrderMarketHours;
        this.shortOrderMarketHours = shortOrderMarketHours;
        this.longTimeInForce = longTimeInForce;
        this.shortTimeInForce = shortTimeInForce;
        if (getAllowShorting()) {
            sellEnabled = getBuySellData().getSellToOpenMarketSessionActive();
        } else {
            sellEnabled = getSellEnabled();
        }
        this.marketSellEnabled = sellEnabled;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getAllowShorting() {
        return EquityOrderState.DefaultImpls.getAllowShorting(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public EquityTradeButtonState getBuyButtonState() {
        return EquityOrderState.DefaultImpls.getBuyButtonState(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState, com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public boolean getBuyEnabled() {
        return EquityOrderState.DefaultImpls.getBuyEnabled(this);
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public EquityInstrumentBuyingPower getOrderBuyingPower() {
        return EquityOrderState.DefaultImpls.getOrderBuyingPower(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState, com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public InstrumentOrderState5 getOrderInstrument() {
        return EquityOrderState.DefaultImpls.getOrderInstrument(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState, com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public InstrumentOrderState3 getOrderPosition() {
        return EquityOrderState.DefaultImpls.getOrderPosition(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public EquityTradeButtonState getSellButtonState() {
        return EquityOrderState.DefaultImpls.getSellButtonState(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState, com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public boolean getSellEnabled() {
        return EquityOrderState.DefaultImpls.getSellEnabled(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public EquityOrderSide getSellOrderSide() {
        return EquityOrderState.DefaultImpls.getSellOrderSide(this);
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState, com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public Account getAccount() {
        return this.account;
    }

    @Override // com.robinhood.shared.trading.orderstate.InstrumentOrderState
    public Quantity getOrderTradeAmount() {
        return this.orderTradeAmount;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public Instrument getInstrument() {
        return this.instrument;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public Position getPosition() {
        return this.position;
    }

    public final boolean getAutoSendSwitchState() {
        return this.autoSendSwitchState;
    }

    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    public final QuoteDto getQuote() {
        return this.quote;
    }

    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final boolean getTradingOnChart() {
        return this.tradingOnChart;
    }

    public final BwTradeSide getAutoSendConfirmMarketOrderSide() {
        return this.autoSendConfirmMarketOrderSide;
    }

    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getConfirmBuy() {
        return this.confirmBuy;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getConfirmSell() {
        return this.confirmSell;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public BuySellData getBuySellData() {
        return this.buySellData;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getShortingEnabled() {
        return this.shortingEnabled;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public OrderMarketHours getLongOrderMarketHours() {
        return this.longOrderMarketHours;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public OrderMarketHours getShortOrderMarketHours() {
        return this.shortOrderMarketHours;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public OrderTimeInForce getLongTimeInForce() {
        return this.longTimeInForce;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public OrderTimeInForce getShortTimeInForce() {
        return this.shortTimeInForce;
    }

    public final boolean getShowNbbo() {
        return this.tradingOnChart || this.autoSendConfirmMarketOrderSide != null;
    }

    @Override // com.robinhood.android.equities.equitytrade.EquityOrderState
    public boolean getAutoSendOrders() {
        return this.autoSendSwitchState && !this.autoSendKillSwitchEnabled;
    }

    public final boolean getMarketSellEnabled() {
        return this.marketSellEnabled;
    }

    public final StringResource getLongTradingHoursDisplayTitle() {
        return getTradingSessionTitle(getLongOrderMarketHours());
    }

    public final StringResource getShortTradingHoursDisplayTitle() {
        return getTradingSessionTitle(getShortOrderMarketHours());
    }

    public final StringResource getLongTimeInForceDisplayTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[getLongTimeInForce().ordinal()];
        if (i == 1) {
            return TimeInForceUtils.getGfdTitle$default(TimeInForceUtils.INSTANCE, null, getLongOrderMarketHours(), getBuySellData().getTradingSession().getCurrentMarketHours(), this.nextMarketHours, null, 16, null);
        }
        if (i != 2) {
            return null;
        }
        return TimeInForceUtils.getGtcTitle$default(TimeInForceUtils.INSTANCE, this.brokebackOrderExpireDateString, null, null, 6, null);
    }

    public final StringResource getShortTimeInForceDisplayTitle() {
        StringResource extendedHoursCloseTime;
        int i = WhenMappings.$EnumSwitchMapping$1[getShortOrderMarketHours().ordinal()];
        if (i == 1) {
            extendedHoursCloseTime = MarketHours3.getExtendedHoursCloseTime(getBuySellData().getTradingSession().getCurrentMarketHours());
        } else {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    throw new IllegalStateException("Unsupported trading session");
                }
                throw new NoWhenBranchMatchedException();
            }
            extendedHoursCloseTime = MarketHours3.getRegularHoursCloseTime(getBuySellData().getTradingSession().getCurrentMarketHours());
        }
        return new StringResource.Join(CollectionsKt.listOf((Object[]) new StringResource[]{extendedHoursCloseTime, StringResource.INSTANCE.invoke(C41827R.string.localdate_format_today, new Object[0])}), PlaceholderUtils.XXShortPlaceholderText);
    }

    private final StringResource getTradingSessionTitle(OrderMarketHours tradingSession) {
        int i = WhenMappings.$EnumSwitchMapping$1[tradingSession.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_market_hours_row_title, new Object[0]);
            }
            if (i != 3) {
                if (i == 4) {
                    return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_all_day_hours_row_title, new Object[0]);
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Index options curb hours is not supported for equities");
            }
        }
        return StringResource.INSTANCE.invoke(C15237R.string.order_create_bottom_sheet_extended_hours_row_title, new Object[0]);
    }
}
