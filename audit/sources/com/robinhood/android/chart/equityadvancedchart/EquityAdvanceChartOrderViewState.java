package com.robinhood.android.chart.equityadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.OptionChainState;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.TradeRowState;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.equities.equitytrade.C14697R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableSet;

/* compiled from: EquityAdvanceChartOrderViewState.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\r\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0010$\u001a\u00020\r\u0012\b\u0010%\u001a\u0004\u0018\u00010&\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020\r\u0012\b\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010t\u001a\u00020\rHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010|\u001a\u00020\rHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\t\u0010~\u001a\u00020\rHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\rHÆ\u0003J\u0010\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020#0\"HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J¢\u0002\u0010\u0087\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\r2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010$\u001a\u00020\r2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+HÆ\u0001J\u0016\u0010\u0088\u0001\u001a\u00020\r2\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u0001HÖ\u0003J\u000b\u0010\u008b\u0001\u001a\u00030\u008c\u0001HÖ\u0001J\n\u0010\u008d\u0001\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u001d\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010 \u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bL\u00109R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010$\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bO\u00109R\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010)\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bT\u00109R\u0013\u0010*\u001a\u0004\u0018\u00010+¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0016\u0010W\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010CR\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010[\u001a\u0004\u0018\u00010\\8F¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0013\u0010_\u001a\u0004\u0018\u00010`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u00109R\u0016\u0010e\u001a\u0004\u0018\u00010f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u00109R\u0016\u0010k\u001a\u0004\u0018\u00010l8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006\u008e\u0001"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderViewState;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderViewState;", "activeAccount", "Lcom/robinhood/models/db/Account;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "orderInstrument", "Lcom/robinhood/models/db/Instrument;", "instrumentPosition", "Lcom/robinhood/models/db/Position;", "instrumentTradeAmount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "autoSendSwitchState", "", "nextMarketHours", "Lcom/robinhood/models/db/MarketHours;", "longOrderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "shortOrderMarketHours", "longOrderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "shortOrderTimeInForce", "brokebackOrderExpireDateString", "", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "autoSendKillSwitchEnabled", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "tradingOnChart", "autoSendConfirmMarketOrderSide", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "nbboLoading", "activeRhsAccountFeatures", "Lkotlinx/collections/immutable/ImmutableSet;", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "shouldShowOptionsPromo", "chartCursorPrice", "Ljava/math/BigDecimal;", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;", "shortingExperimentEnabled", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Position;Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;ZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;ZLcom/robinhood/nbbo/models/db/NbboSummary;ZLcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;ZLkotlinx/collections/immutable/ImmutableSet;ZLjava/math/BigDecimal;Lcom/robinhood/android/common/buysell/BuySellData;ZLcom/robinhood/shared/equities/subzero/ShortingInfo;)V", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getOrderInstrument", "()Lcom/robinhood/models/db/Instrument;", "getInstrumentPosition", "()Lcom/robinhood/models/db/Position;", "getInstrumentTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "getAutoSendSwitchState", "()Z", "getNextMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getLongOrderMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getShortOrderMarketHours", "getLongOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getShortOrderTimeInForce", "getBrokebackOrderExpireDateString", "()Ljava/lang/String;", "getQuote", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getAutoSendKillSwitchEnabled", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getTradingOnChart", "getAutoSendConfirmMarketOrderSide", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "getNbboLoading", "getActiveRhsAccountFeatures", "()Lkotlinx/collections/immutable/ImmutableSet;", "getShouldShowOptionsPromo", "getChartCursorPrice", "()Ljava/math/BigDecimal;", "getBuySellData", "()Lcom/robinhood/android/common/buysell/BuySellData;", "getShortingExperimentEnabled", "getShortingInfo", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "symbol", "getSymbol", "optionChainId", "Ljava/util/UUID;", "optionChainState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/OptionChainState;", "getOptionChainState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/OptionChainState;", "chartOptionChainKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getChartOptionChainKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "allowFractional", "getAllowFractional", "instrumentOrderState", "Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;", "getInstrumentOrderState", "()Lcom/robinhood/android/chart/equityadvancedchart/MacEquityOrderState;", "autoSendOrders", "getAutoSendOrders", "tradeRowState", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "getTradeRowState", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/TradeRowState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EquityAdvanceChartOrderViewState implements AdvanceChartOrderViewState {
    public static final int $stable = 8;
    private final Account activeAccount;
    private final ImmutableSet<AccountFeature> activeRhsAccountFeatures;
    private final BwTradeSide autoSendConfirmMarketOrderSide;
    private final boolean autoSendKillSwitchEnabled;
    private final boolean autoSendSwitchState;
    private final String brokebackOrderExpireDateString;
    private final BuySellData buySellData;
    private final BigDecimal chartCursorPrice;
    private final InstrumentBuyingPower instrumentBuyingPower;
    private final Position instrumentPosition;
    private final InstrumentOrderState4 instrumentTradeAmount;
    private final OrderMarketHours longOrderMarketHours;
    private final OrderTimeInForce longOrderTimeInForce;
    private final boolean nbboLoading;
    private final NbboSummary nbboSummary;
    private final MarketHours nextMarketHours;
    private final UUID optionChainId;
    private final Instrument orderInstrument;
    private final QuoteDto quote;
    private final OrderMarketHours shortOrderMarketHours;
    private final OrderTimeInForce shortOrderTimeInForce;
    private final boolean shortingExperimentEnabled;
    private final ShortingInfo shortingInfo;
    private final boolean shouldShowOptionsPromo;
    private final boolean tradingOnChart;

    public static /* synthetic */ EquityAdvanceChartOrderViewState copy$default(EquityAdvanceChartOrderViewState equityAdvanceChartOrderViewState, Account account, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, Position position, InstrumentOrderState4 instrumentOrderState4, boolean z, MarketHours marketHours, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, String str, QuoteDto quoteDto, boolean z2, NbboSummary nbboSummary, boolean z3, BwTradeSide bwTradeSide, boolean z4, ImmutableSet immutableSet, boolean z5, BigDecimal bigDecimal, BuySellData buySellData, boolean z6, ShortingInfo shortingInfo, int i, Object obj) {
        ShortingInfo shortingInfo2;
        boolean z7;
        Account account2 = (i & 1) != 0 ? equityAdvanceChartOrderViewState.activeAccount : account;
        InstrumentBuyingPower instrumentBuyingPower2 = (i & 2) != 0 ? equityAdvanceChartOrderViewState.instrumentBuyingPower : instrumentBuyingPower;
        Instrument instrument2 = (i & 4) != 0 ? equityAdvanceChartOrderViewState.orderInstrument : instrument;
        Position position2 = (i & 8) != 0 ? equityAdvanceChartOrderViewState.instrumentPosition : position;
        InstrumentOrderState4 instrumentOrderState42 = (i & 16) != 0 ? equityAdvanceChartOrderViewState.instrumentTradeAmount : instrumentOrderState4;
        boolean z8 = (i & 32) != 0 ? equityAdvanceChartOrderViewState.autoSendSwitchState : z;
        MarketHours marketHours2 = (i & 64) != 0 ? equityAdvanceChartOrderViewState.nextMarketHours : marketHours;
        OrderMarketHours orderMarketHours3 = (i & 128) != 0 ? equityAdvanceChartOrderViewState.longOrderMarketHours : orderMarketHours;
        OrderMarketHours orderMarketHours4 = (i & 256) != 0 ? equityAdvanceChartOrderViewState.shortOrderMarketHours : orderMarketHours2;
        OrderTimeInForce orderTimeInForce3 = (i & 512) != 0 ? equityAdvanceChartOrderViewState.longOrderTimeInForce : orderTimeInForce;
        OrderTimeInForce orderTimeInForce4 = (i & 1024) != 0 ? equityAdvanceChartOrderViewState.shortOrderTimeInForce : orderTimeInForce2;
        String str2 = (i & 2048) != 0 ? equityAdvanceChartOrderViewState.brokebackOrderExpireDateString : str;
        QuoteDto quoteDto2 = (i & 4096) != 0 ? equityAdvanceChartOrderViewState.quote : quoteDto;
        boolean z9 = (i & 8192) != 0 ? equityAdvanceChartOrderViewState.autoSendKillSwitchEnabled : z2;
        Account account3 = account2;
        NbboSummary nbboSummary2 = (i & 16384) != 0 ? equityAdvanceChartOrderViewState.nbboSummary : nbboSummary;
        boolean z10 = (i & 32768) != 0 ? equityAdvanceChartOrderViewState.tradingOnChart : z3;
        BwTradeSide bwTradeSide2 = (i & 65536) != 0 ? equityAdvanceChartOrderViewState.autoSendConfirmMarketOrderSide : bwTradeSide;
        boolean z11 = (i & 131072) != 0 ? equityAdvanceChartOrderViewState.nbboLoading : z4;
        ImmutableSet immutableSet2 = (i & 262144) != 0 ? equityAdvanceChartOrderViewState.activeRhsAccountFeatures : immutableSet;
        boolean z12 = (i & 524288) != 0 ? equityAdvanceChartOrderViewState.shouldShowOptionsPromo : z5;
        BigDecimal bigDecimal2 = (i & 1048576) != 0 ? equityAdvanceChartOrderViewState.chartCursorPrice : bigDecimal;
        BuySellData buySellData2 = (i & 2097152) != 0 ? equityAdvanceChartOrderViewState.buySellData : buySellData;
        boolean z13 = (i & 4194304) != 0 ? equityAdvanceChartOrderViewState.shortingExperimentEnabled : z6;
        if ((i & 8388608) != 0) {
            z7 = z13;
            shortingInfo2 = equityAdvanceChartOrderViewState.shortingInfo;
        } else {
            shortingInfo2 = shortingInfo;
            z7 = z13;
        }
        return equityAdvanceChartOrderViewState.copy(account3, instrumentBuyingPower2, instrument2, position2, instrumentOrderState42, z8, marketHours2, orderMarketHours3, orderMarketHours4, orderTimeInForce3, orderTimeInForce4, str2, quoteDto2, z9, nbboSummary2, z10, bwTradeSide2, z11, immutableSet2, z12, bigDecimal2, buySellData2, z7, shortingInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    /* renamed from: component10, reason: from getter */
    public final OrderTimeInForce getLongOrderTimeInForce() {
        return this.longOrderTimeInForce;
    }

    /* renamed from: component11, reason: from getter */
    public final OrderTimeInForce getShortOrderTimeInForce() {
        return this.shortOrderTimeInForce;
    }

    /* renamed from: component12, reason: from getter */
    public final String getBrokebackOrderExpireDateString() {
        return this.brokebackOrderExpireDateString;
    }

    /* renamed from: component13, reason: from getter */
    public final QuoteDto getQuote() {
        return this.quote;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    /* renamed from: component15, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getTradingOnChart() {
        return this.tradingOnChart;
    }

    /* renamed from: component17, reason: from getter */
    public final BwTradeSide getAutoSendConfirmMarketOrderSide() {
        return this.autoSendConfirmMarketOrderSide;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    public final ImmutableSet<AccountFeature> component19() {
        return this.activeRhsAccountFeatures;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShouldShowOptionsPromo() {
        return this.shouldShowOptionsPromo;
    }

    /* renamed from: component21, reason: from getter */
    public final BigDecimal getChartCursorPrice() {
        return this.chartCursorPrice;
    }

    /* renamed from: component22, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    /* renamed from: component24, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final Instrument getOrderInstrument() {
        return this.orderInstrument;
    }

    /* renamed from: component4, reason: from getter */
    public final Position getInstrumentPosition() {
        return this.instrumentPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final InstrumentOrderState4 getInstrumentTradeAmount() {
        return this.instrumentTradeAmount;
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
    public final OrderMarketHours getLongOrderMarketHours() {
        return this.longOrderMarketHours;
    }

    /* renamed from: component9, reason: from getter */
    public final OrderMarketHours getShortOrderMarketHours() {
        return this.shortOrderMarketHours;
    }

    public final EquityAdvanceChartOrderViewState copy(Account activeAccount, InstrumentBuyingPower instrumentBuyingPower, Instrument orderInstrument, Position instrumentPosition, InstrumentOrderState4 instrumentTradeAmount, boolean autoSendSwitchState, MarketHours nextMarketHours, OrderMarketHours longOrderMarketHours, OrderMarketHours shortOrderMarketHours, OrderTimeInForce longOrderTimeInForce, OrderTimeInForce shortOrderTimeInForce, String brokebackOrderExpireDateString, QuoteDto quote, boolean autoSendKillSwitchEnabled, NbboSummary nbboSummary, boolean tradingOnChart, BwTradeSide autoSendConfirmMarketOrderSide, boolean nbboLoading, ImmutableSet<? extends AccountFeature> activeRhsAccountFeatures, boolean shouldShowOptionsPromo, BigDecimal chartCursorPrice, BuySellData buySellData, boolean shortingExperimentEnabled, ShortingInfo shortingInfo) {
        Intrinsics.checkNotNullParameter(activeRhsAccountFeatures, "activeRhsAccountFeatures");
        return new EquityAdvanceChartOrderViewState(activeAccount, instrumentBuyingPower, orderInstrument, instrumentPosition, instrumentTradeAmount, autoSendSwitchState, nextMarketHours, longOrderMarketHours, shortOrderMarketHours, longOrderTimeInForce, shortOrderTimeInForce, brokebackOrderExpireDateString, quote, autoSendKillSwitchEnabled, nbboSummary, tradingOnChart, autoSendConfirmMarketOrderSide, nbboLoading, activeRhsAccountFeatures, shouldShowOptionsPromo, chartCursorPrice, buySellData, shortingExperimentEnabled, shortingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityAdvanceChartOrderViewState)) {
            return false;
        }
        EquityAdvanceChartOrderViewState equityAdvanceChartOrderViewState = (EquityAdvanceChartOrderViewState) other;
        return Intrinsics.areEqual(this.activeAccount, equityAdvanceChartOrderViewState.activeAccount) && Intrinsics.areEqual(this.instrumentBuyingPower, equityAdvanceChartOrderViewState.instrumentBuyingPower) && Intrinsics.areEqual(this.orderInstrument, equityAdvanceChartOrderViewState.orderInstrument) && Intrinsics.areEqual(this.instrumentPosition, equityAdvanceChartOrderViewState.instrumentPosition) && Intrinsics.areEqual(this.instrumentTradeAmount, equityAdvanceChartOrderViewState.instrumentTradeAmount) && this.autoSendSwitchState == equityAdvanceChartOrderViewState.autoSendSwitchState && Intrinsics.areEqual(this.nextMarketHours, equityAdvanceChartOrderViewState.nextMarketHours) && this.longOrderMarketHours == equityAdvanceChartOrderViewState.longOrderMarketHours && this.shortOrderMarketHours == equityAdvanceChartOrderViewState.shortOrderMarketHours && this.longOrderTimeInForce == equityAdvanceChartOrderViewState.longOrderTimeInForce && this.shortOrderTimeInForce == equityAdvanceChartOrderViewState.shortOrderTimeInForce && Intrinsics.areEqual(this.brokebackOrderExpireDateString, equityAdvanceChartOrderViewState.brokebackOrderExpireDateString) && Intrinsics.areEqual(this.quote, equityAdvanceChartOrderViewState.quote) && this.autoSendKillSwitchEnabled == equityAdvanceChartOrderViewState.autoSendKillSwitchEnabled && Intrinsics.areEqual(this.nbboSummary, equityAdvanceChartOrderViewState.nbboSummary) && this.tradingOnChart == equityAdvanceChartOrderViewState.tradingOnChart && this.autoSendConfirmMarketOrderSide == equityAdvanceChartOrderViewState.autoSendConfirmMarketOrderSide && this.nbboLoading == equityAdvanceChartOrderViewState.nbboLoading && Intrinsics.areEqual(this.activeRhsAccountFeatures, equityAdvanceChartOrderViewState.activeRhsAccountFeatures) && this.shouldShowOptionsPromo == equityAdvanceChartOrderViewState.shouldShowOptionsPromo && Intrinsics.areEqual(this.chartCursorPrice, equityAdvanceChartOrderViewState.chartCursorPrice) && Intrinsics.areEqual(this.buySellData, equityAdvanceChartOrderViewState.buySellData) && this.shortingExperimentEnabled == equityAdvanceChartOrderViewState.shortingExperimentEnabled && Intrinsics.areEqual(this.shortingInfo, equityAdvanceChartOrderViewState.shortingInfo);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public boolean getAllowFractional() {
        return false;
    }

    public int hashCode() {
        Account account = this.activeAccount;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        int iHashCode2 = (iHashCode + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31;
        Instrument instrument = this.orderInstrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Position position = this.instrumentPosition;
        int iHashCode4 = (iHashCode3 + (position == null ? 0 : position.hashCode())) * 31;
        InstrumentOrderState4 instrumentOrderState4 = this.instrumentTradeAmount;
        int iHashCode5 = (((iHashCode4 + (instrumentOrderState4 == null ? 0 : instrumentOrderState4.hashCode())) * 31) + Boolean.hashCode(this.autoSendSwitchState)) * 31;
        MarketHours marketHours = this.nextMarketHours;
        int iHashCode6 = (iHashCode5 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        OrderMarketHours orderMarketHours = this.longOrderMarketHours;
        int iHashCode7 = (iHashCode6 + (orderMarketHours == null ? 0 : orderMarketHours.hashCode())) * 31;
        OrderMarketHours orderMarketHours2 = this.shortOrderMarketHours;
        int iHashCode8 = (iHashCode7 + (orderMarketHours2 == null ? 0 : orderMarketHours2.hashCode())) * 31;
        OrderTimeInForce orderTimeInForce = this.longOrderTimeInForce;
        int iHashCode9 = (iHashCode8 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31;
        OrderTimeInForce orderTimeInForce2 = this.shortOrderTimeInForce;
        int iHashCode10 = (iHashCode9 + (orderTimeInForce2 == null ? 0 : orderTimeInForce2.hashCode())) * 31;
        String str = this.brokebackOrderExpireDateString;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        QuoteDto quoteDto = this.quote;
        int iHashCode12 = (((iHashCode11 + (quoteDto == null ? 0 : quoteDto.hashCode())) * 31) + Boolean.hashCode(this.autoSendKillSwitchEnabled)) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode13 = (((iHashCode12 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + Boolean.hashCode(this.tradingOnChart)) * 31;
        BwTradeSide bwTradeSide = this.autoSendConfirmMarketOrderSide;
        int iHashCode14 = (((((((iHashCode13 + (bwTradeSide == null ? 0 : bwTradeSide.hashCode())) * 31) + Boolean.hashCode(this.nbboLoading)) * 31) + this.activeRhsAccountFeatures.hashCode()) * 31) + Boolean.hashCode(this.shouldShowOptionsPromo)) * 31;
        BigDecimal bigDecimal = this.chartCursorPrice;
        int iHashCode15 = (iHashCode14 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BuySellData buySellData = this.buySellData;
        int iHashCode16 = (((iHashCode15 + (buySellData == null ? 0 : buySellData.hashCode())) * 31) + Boolean.hashCode(this.shortingExperimentEnabled)) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        return iHashCode16 + (shortingInfo != null ? shortingInfo.hashCode() : 0);
    }

    public String toString() {
        return "EquityAdvanceChartOrderViewState(activeAccount=" + this.activeAccount + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", orderInstrument=" + this.orderInstrument + ", instrumentPosition=" + this.instrumentPosition + ", instrumentTradeAmount=" + this.instrumentTradeAmount + ", autoSendSwitchState=" + this.autoSendSwitchState + ", nextMarketHours=" + this.nextMarketHours + ", longOrderMarketHours=" + this.longOrderMarketHours + ", shortOrderMarketHours=" + this.shortOrderMarketHours + ", longOrderTimeInForce=" + this.longOrderTimeInForce + ", shortOrderTimeInForce=" + this.shortOrderTimeInForce + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", quote=" + this.quote + ", autoSendKillSwitchEnabled=" + this.autoSendKillSwitchEnabled + ", nbboSummary=" + this.nbboSummary + ", tradingOnChart=" + this.tradingOnChart + ", autoSendConfirmMarketOrderSide=" + this.autoSendConfirmMarketOrderSide + ", nbboLoading=" + this.nbboLoading + ", activeRhsAccountFeatures=" + this.activeRhsAccountFeatures + ", shouldShowOptionsPromo=" + this.shouldShowOptionsPromo + ", chartCursorPrice=" + this.chartCursorPrice + ", buySellData=" + this.buySellData + ", shortingExperimentEnabled=" + this.shortingExperimentEnabled + ", shortingInfo=" + this.shortingInfo + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityAdvanceChartOrderViewState(Account account, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, Position position, InstrumentOrderState4 instrumentOrderState4, boolean z, MarketHours marketHours, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, String str, QuoteDto quoteDto, boolean z2, NbboSummary nbboSummary, boolean z3, BwTradeSide bwTradeSide, boolean z4, ImmutableSet<? extends AccountFeature> activeRhsAccountFeatures, boolean z5, BigDecimal bigDecimal, BuySellData buySellData, boolean z6, ShortingInfo shortingInfo) {
        Intrinsics.checkNotNullParameter(activeRhsAccountFeatures, "activeRhsAccountFeatures");
        this.activeAccount = account;
        this.instrumentBuyingPower = instrumentBuyingPower;
        this.orderInstrument = instrument;
        this.instrumentPosition = position;
        this.instrumentTradeAmount = instrumentOrderState4;
        this.autoSendSwitchState = z;
        this.nextMarketHours = marketHours;
        this.longOrderMarketHours = orderMarketHours;
        this.shortOrderMarketHours = orderMarketHours2;
        this.longOrderTimeInForce = orderTimeInForce;
        this.shortOrderTimeInForce = orderTimeInForce2;
        this.brokebackOrderExpireDateString = str;
        this.quote = quoteDto;
        this.autoSendKillSwitchEnabled = z2;
        this.nbboSummary = nbboSummary;
        this.tradingOnChart = z3;
        this.autoSendConfirmMarketOrderSide = bwTradeSide;
        this.nbboLoading = z4;
        this.activeRhsAccountFeatures = activeRhsAccountFeatures;
        this.shouldShowOptionsPromo = z5;
        this.chartCursorPrice = bigDecimal;
        this.buySellData = buySellData;
        this.shortingExperimentEnabled = z6;
        this.shortingInfo = shortingInfo;
        this.optionChainId = instrument != null ? instrument.getTradableChainId() : null;
    }

    public final Account getActiveAccount() {
        return this.activeAccount;
    }

    public final InstrumentBuyingPower getInstrumentBuyingPower() {
        return this.instrumentBuyingPower;
    }

    public final Instrument getOrderInstrument() {
        return this.orderInstrument;
    }

    public final Position getInstrumentPosition() {
        return this.instrumentPosition;
    }

    public final InstrumentOrderState4 getInstrumentTradeAmount() {
        return this.instrumentTradeAmount;
    }

    public final boolean getAutoSendSwitchState() {
        return this.autoSendSwitchState;
    }

    public final MarketHours getNextMarketHours() {
        return this.nextMarketHours;
    }

    public final OrderMarketHours getLongOrderMarketHours() {
        return this.longOrderMarketHours;
    }

    public final OrderMarketHours getShortOrderMarketHours() {
        return this.shortOrderMarketHours;
    }

    public final OrderTimeInForce getLongOrderTimeInForce() {
        return this.longOrderTimeInForce;
    }

    public final OrderTimeInForce getShortOrderTimeInForce() {
        return this.shortOrderTimeInForce;
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

    public final ImmutableSet<AccountFeature> getActiveRhsAccountFeatures() {
        return this.activeRhsAccountFeatures;
    }

    public final boolean getShouldShowOptionsPromo() {
        return this.shouldShowOptionsPromo;
    }

    public final BigDecimal getChartCursorPrice() {
        return this.chartCursorPrice;
    }

    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    public final boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public String getSymbol() {
        Instrument instrument = this.orderInstrument;
        if (instrument != null) {
            return instrument.getSymbol();
        }
        return null;
    }

    public final OptionChainState getOptionChainState() {
        Account account = this.activeAccount;
        if (account != null && this.orderInstrument != null && this.optionChainId != null) {
            if (OptionLevel.INSTANCE.canTradeOptions(account.getOptionLevel())) {
                return new OptionChainState(new OptionChainIntentKey(this.orderInstrument.getId(), new OptionChainIdLaunchMode.SingleChainId(this.optionChainId), (ImmutableList) null, (OptionOrderFilter) null, this.activeAccount.getAccountNumber(), (String) null, 44, (DefaultConstructorMarker) null));
            }
            if (this.activeRhsAccountFeatures.contains(AccountFeature.OPTIONS_CAN_UPGRADE) && this.shouldShowOptionsPromo) {
                return new OptionChainState(new OptionOnboarding(new OptionOnboarding2.AccountNumber(this.activeAccount.getAccountNumber()), new OptionOnboarding.OptionOnboardingSource.Legacy("mac"), null, 4, null));
            }
        }
        return null;
    }

    public final IntentKey getChartOptionChainKey() {
        Account account = this.activeAccount;
        if (account == null || this.orderInstrument == null || this.optionChainId == null || !OptionLevel.INSTANCE.canTradeOptions(account.getOptionLevel())) {
            return null;
        }
        return new OptionChainIntentKey(this.orderInstrument.getId(), new OptionChainIdLaunchMode.SingleChainId(this.optionChainId), this.chartCursorPrice, (OptionOrderFilter) null, this.activeAccount.getAccountNumber(), (String) null, 40, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public MacEquityOrderState getInstrumentOrderState() {
        Account account;
        String str;
        Account account2;
        ShortingInfo shortingInfo;
        OrderMarketHours orderMarketHours;
        OrderMarketHours orderMarketHours2;
        OrderTimeInForce orderTimeInForce;
        OrderTimeInForce orderTimeInForce2;
        QuoteDto quoteDto = this.quote;
        if (quoteDto == null || (account = this.activeAccount) == null) {
            return null;
        }
        boolean z = this.autoSendSwitchState;
        MarketHours marketHours = this.nextMarketHours;
        if (marketHours == null || (str = this.brokebackOrderExpireDateString) == null) {
            return null;
        }
        boolean z2 = this.autoSendKillSwitchEnabled;
        NbboSummary nbboSummary = this.nbboSummary;
        boolean z3 = this.tradingOnChart;
        BwTradeSide bwTradeSide = this.autoSendConfirmMarketOrderSide;
        boolean z4 = this.nbboLoading;
        InstrumentOrderState4 instrumentOrderState4 = this.instrumentTradeAmount;
        Quantity quantity = instrumentOrderState4 instanceof Quantity ? (Quantity) instrumentOrderState4 : null;
        if (quantity == null) {
            return null;
        }
        InstrumentBuyingPower instrumentBuyingPower = this.instrumentBuyingPower;
        Instrument instrument = this.orderInstrument;
        if (instrument == null) {
            return null;
        }
        Position position = this.instrumentPosition;
        boolean z5 = true;
        boolean z6 = bwTradeSide == BwTradeSide.SELL;
        boolean z7 = bwTradeSide == BwTradeSide.BUY;
        BuySellData buySellData = this.buySellData;
        if (buySellData == null) {
            return null;
        }
        if (this.shortingExperimentEnabled) {
            account2 = account;
            if (buySellData.getInstrument().getShortSaleTradability() != Tradability.TRADABLE || this.activeAccount.getBrokerageAccountType().isRetirement() || Position5.isLongPositionOrPending(this.instrumentPosition)) {
            }
            shortingInfo = this.shortingInfo;
            orderMarketHours = this.longOrderMarketHours;
            if (orderMarketHours != null || (orderMarketHours2 = this.shortOrderMarketHours) == null || (orderTimeInForce = this.longOrderTimeInForce) == null || (orderTimeInForce2 = this.shortOrderTimeInForce) == null) {
                return null;
            }
            return new MacEquityOrderState(account2, quantity, instrumentBuyingPower, instrument, position, z, marketHours, str, quoteDto, z2, nbboSummary, z3, bwTradeSide, z4, z7, z6, buySellData, shortingInfo, z5, orderMarketHours, orderMarketHours2, orderTimeInForce, orderTimeInForce2);
        }
        account2 = account;
        z5 = false;
        shortingInfo = this.shortingInfo;
        orderMarketHours = this.longOrderMarketHours;
        if (orderMarketHours != null) {
            return null;
        }
        return new MacEquityOrderState(account2, quantity, instrumentBuyingPower, instrument, position, z, marketHours, str, quoteDto, z2, nbboSummary, z3, bwTradeSide, z4, z7, z6, buySellData, shortingInfo, z5, orderMarketHours, orderMarketHours2, orderTimeInForce, orderTimeInForce2);
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public boolean getAutoSendOrders() {
        MacEquityOrderState instrumentOrderState = getInstrumentOrderState();
        return instrumentOrderState != null && instrumentOrderState.getAutoSendOrders();
    }

    @Override // com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderViewState
    public TradeRowState getTradeRowState() {
        MacEquityOrderState instrumentOrderState = getInstrumentOrderState();
        if (instrumentOrderState != null) {
            return new TradeRowState(StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C11048R.plurals.general_number_of_shares, instrumentOrderState.getOrderTradeAmount().getAmount().intValue()), Formats.getShareQuantityFormat().format(instrumentOrderState.getOrderTradeAmount().getAmount())), this.tradingOnChart, instrumentOrderState.getBuyButtonState().getText(), instrumentOrderState.getBuyButtonState().getEnabled(), instrumentOrderState.getBuyButtonState().getConfirm(), instrumentOrderState.getSellButtonState().getText(), instrumentOrderState.getSellButtonState().getEnabled(), instrumentOrderState.getSellButtonState().getConfirm());
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new TradeRowState(companion.invoke(new StringResource.PluralsResource(C11048R.plurals.general_number_of_shares, 1), 1), false, companion.invoke(C14697R.string.market_buy_label, new Object[0]), false, false, companion.invoke(C14697R.string.market_sell_label, new Object[0]), false, false);
    }
}
