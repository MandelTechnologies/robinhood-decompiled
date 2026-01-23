package com.robinhood.android.chart.equityadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IntervalDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.QuoteDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.TimeSpanDto;
import com.robinhood.android.chart.blackwidowadvancedchart.models.BwTradeSide;
import com.robinhood.android.chart.blackwidowadvancedchart.models.SpanIntervalData;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p320db.Position;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.shared.trading.orderstate.InstrumentOrderState4;
import com.robinhood.shared.trading.orderstate.Quantity;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvanceChartOrderDataState.kt */
@Metadata(m3635d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\r\u0012\b\b\u0002\u0010 \u001a\u00020\r\u0012\b\b\u0002\u0010!\u001a\u00020\r\u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010(\u001a\u00020\r\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00100\u001a\u00020\r\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00103\u001a\u00020\r\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u00106\u001a\u00020\r¢\u0006\u0004\b7\u00108J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010t\u001a\u00020\rHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dHÆ\u0003J\t\u0010~\u001a\u00020\rHÆ\u0003J\t\u0010\u007f\u001a\u00020\rHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010$HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\rHÆ\u0003J\u0012\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\rHÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u000105HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\rHÆ\u0003J\u0080\u0003\u0010\u008f\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\r2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\r2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u00020\r2\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\r2\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\b\b\u0002\u00106\u001a\u00020\rHÆ\u0001J\u0015\u0010\u0090\u0001\u001a\u00020\r2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0092\u0001\u001a\u00030\u0093\u0001HÖ\u0001J\n\u0010\u0094\u0001\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bI\u0010HR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\u001f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bU\u0010DR\u0011\u0010 \u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bV\u0010DR\u0011\u0010!\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010DR\u0011\u0010\"\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bW\u0010DR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010DR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010(\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b]\u0010DR\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0013\u0010+\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b`\u0010NR\u0013\u0010,\u001a\u0004\u0018\u00010-¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u00100\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b0\u0010DR\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u00103\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bg\u0010DR\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0011\u00106\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bj\u0010DR\u0011\u0010k\u001a\u00020l8F¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityAdvanceChartOrderDataState;", "", "activeInstrumentId", "Ljava/util/UUID;", "buyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "orderInstrument", "Lcom/robinhood/models/db/Instrument;", "instrumentTradeAmount", "Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "instrumentPosition", "Lcom/robinhood/models/db/Position;", "autoSendSwitchState", "", "nextMarketHours", "Lcom/robinhood/models/db/MarketHours;", "longOrderMarketHours", "Lcom/robinhood/models/db/OrderMarketHours;", "shortOrderMarketHours", "longOrderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "shortOrderTimeInForce", "brokebackOrderExpireDateString", "", "quote", "Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "activeRhsAccount", "Lcom/robinhood/models/db/Account;", "activeRhsAccountFeatures", "", "Lcom/robinhood/librobinhood/data/store/AccountFeature;", "autoSendKillSwitchEnabled", "equitiesSubzeroMember", "isScrubbing", "tradingOnChart", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "nbboLoading", "autoSendConfirmMarketOrderSide", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "shouldShowOptionsPromo", "activeIndictors", "", "activeTemplate", "spanIntervalData", "Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "chartCursorPrice", "Ljava/math/BigDecimal;", "isInEtfSupportedRegion", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;", "shortingExperimentEnabled", "shortingInfo", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "showShowAutoSendUpsell", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;Lcom/robinhood/models/db/Position;ZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderMarketHours;Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/models/db/OrderTimeInForce;Ljava/lang/String;Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;Lcom/robinhood/models/db/Account;Ljava/util/Set;ZZZZLcom/robinhood/nbbo/models/db/NbboSummary;ZLcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;ZLjava/util/List;Ljava/lang/String;Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;Ljava/math/BigDecimal;ZLcom/robinhood/android/common/buysell/BuySellData;ZLcom/robinhood/shared/equities/subzero/ShortingInfo;Z)V", "getActiveInstrumentId", "()Ljava/util/UUID;", "getBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getOrderInstrument", "()Lcom/robinhood/models/db/Instrument;", "getInstrumentTradeAmount", "()Lcom/robinhood/shared/trading/orderstate/InstrumentTradeAmount;", "getInstrumentPosition", "()Lcom/robinhood/models/db/Position;", "getAutoSendSwitchState", "()Z", "getNextMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getLongOrderMarketHours", "()Lcom/robinhood/models/db/OrderMarketHours;", "getShortOrderMarketHours", "getLongOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getShortOrderTimeInForce", "getBrokebackOrderExpireDateString", "()Ljava/lang/String;", "getQuote", "()Lblack_widow/contracts/mobile_app_chart/proto/v1/QuoteDto;", "getActiveRhsAccount", "()Lcom/robinhood/models/db/Account;", "getActiveRhsAccountFeatures", "()Ljava/util/Set;", "getAutoSendKillSwitchEnabled", "getEquitiesSubzeroMember", "getTradingOnChart", "getNbboSummary", "()Lcom/robinhood/nbbo/models/db/NbboSummary;", "getNbboLoading", "getAutoSendConfirmMarketOrderSide", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/BwTradeSide;", "getShouldShowOptionsPromo", "getActiveIndictors", "()Ljava/util/List;", "getActiveTemplate", "getSpanIntervalData", "()Lcom/robinhood/android/chart/blackwidowadvancedchart/models/SpanIntervalData;", "getChartCursorPrice", "()Ljava/math/BigDecimal;", "getBuySellData", "()Lcom/robinhood/android/common/buysell/BuySellData;", "getShortingExperimentEnabled", "getShortingInfo", "()Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "getShowShowAutoSendUpsell", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/LegendAdvancedChartsContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "equals", "other", "hashCode", "", "toString", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EquityAdvanceChartOrderDataState {
    public static final int $stable = 8;
    private final List<String> activeIndictors;
    private final UUID activeInstrumentId;
    private final Account activeRhsAccount;
    private final Set<AccountFeature> activeRhsAccountFeatures;
    private final String activeTemplate;
    private final BwTradeSide autoSendConfirmMarketOrderSide;
    private final boolean autoSendKillSwitchEnabled;
    private final boolean autoSendSwitchState;
    private final String brokebackOrderExpireDateString;
    private final BuySellData buySellData;
    private final InstrumentBuyingPower buyingPower;
    private final BigDecimal chartCursorPrice;
    private final boolean equitiesSubzeroMember;
    private final Position instrumentPosition;
    private final InstrumentOrderState4 instrumentTradeAmount;
    private final boolean isInEtfSupportedRegion;
    private final boolean isScrubbing;
    private final OrderMarketHours longOrderMarketHours;
    private final OrderTimeInForce longOrderTimeInForce;
    private final boolean nbboLoading;
    private final NbboSummary nbboSummary;
    private final MarketHours nextMarketHours;
    private final Instrument orderInstrument;
    private final QuoteDto quote;
    private final OrderMarketHours shortOrderMarketHours;
    private final OrderTimeInForce shortOrderTimeInForce;
    private final boolean shortingExperimentEnabled;
    private final ShortingInfo shortingInfo;
    private final boolean shouldShowOptionsPromo;
    private final boolean showShowAutoSendUpsell;
    private final SpanIntervalData spanIntervalData;
    private final boolean tradingOnChart;

    public EquityAdvanceChartOrderDataState() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, false, false, false, null, false, null, false, null, null, null, null, false, null, false, null, false, -1, null);
    }

    public static /* synthetic */ EquityAdvanceChartOrderDataState copy$default(EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState, UUID uuid, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, InstrumentOrderState4 instrumentOrderState4, Position position, boolean z, MarketHours marketHours, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, String str, QuoteDto quoteDto, Account account, Set set, boolean z2, boolean z3, boolean z4, boolean z5, NbboSummary nbboSummary, boolean z6, BwTradeSide bwTradeSide, boolean z7, List list, String str2, SpanIntervalData spanIntervalData, BigDecimal bigDecimal, boolean z8, BuySellData buySellData, boolean z9, ShortingInfo shortingInfo, boolean z10, int i, Object obj) {
        boolean z11;
        ShortingInfo shortingInfo2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        NbboSummary nbboSummary2;
        boolean z16;
        BwTradeSide bwTradeSide2;
        boolean z17;
        List list2;
        String str3;
        SpanIntervalData spanIntervalData2;
        BigDecimal bigDecimal2;
        boolean z18;
        BuySellData buySellData2;
        boolean z19;
        Set set2;
        InstrumentBuyingPower instrumentBuyingPower2;
        Instrument instrument2;
        InstrumentOrderState4 instrumentOrderState42;
        Position position2;
        boolean z20;
        MarketHours marketHours2;
        OrderMarketHours orderMarketHours3;
        OrderMarketHours orderMarketHours4;
        OrderTimeInForce orderTimeInForce3;
        OrderTimeInForce orderTimeInForce4;
        String str4;
        QuoteDto quoteDto2;
        Account account2;
        UUID uuid2 = (i & 1) != 0 ? equityAdvanceChartOrderDataState.activeInstrumentId : uuid;
        InstrumentBuyingPower instrumentBuyingPower3 = (i & 2) != 0 ? equityAdvanceChartOrderDataState.buyingPower : instrumentBuyingPower;
        Instrument instrument3 = (i & 4) != 0 ? equityAdvanceChartOrderDataState.orderInstrument : instrument;
        InstrumentOrderState4 instrumentOrderState43 = (i & 8) != 0 ? equityAdvanceChartOrderDataState.instrumentTradeAmount : instrumentOrderState4;
        Position position3 = (i & 16) != 0 ? equityAdvanceChartOrderDataState.instrumentPosition : position;
        boolean z21 = (i & 32) != 0 ? equityAdvanceChartOrderDataState.autoSendSwitchState : z;
        MarketHours marketHours3 = (i & 64) != 0 ? equityAdvanceChartOrderDataState.nextMarketHours : marketHours;
        OrderMarketHours orderMarketHours5 = (i & 128) != 0 ? equityAdvanceChartOrderDataState.longOrderMarketHours : orderMarketHours;
        OrderMarketHours orderMarketHours6 = (i & 256) != 0 ? equityAdvanceChartOrderDataState.shortOrderMarketHours : orderMarketHours2;
        OrderTimeInForce orderTimeInForce5 = (i & 512) != 0 ? equityAdvanceChartOrderDataState.longOrderTimeInForce : orderTimeInForce;
        OrderTimeInForce orderTimeInForce6 = (i & 1024) != 0 ? equityAdvanceChartOrderDataState.shortOrderTimeInForce : orderTimeInForce2;
        String str5 = (i & 2048) != 0 ? equityAdvanceChartOrderDataState.brokebackOrderExpireDateString : str;
        QuoteDto quoteDto3 = (i & 4096) != 0 ? equityAdvanceChartOrderDataState.quote : quoteDto;
        Account account3 = (i & 8192) != 0 ? equityAdvanceChartOrderDataState.activeRhsAccount : account;
        UUID uuid3 = uuid2;
        Set set3 = (i & 16384) != 0 ? equityAdvanceChartOrderDataState.activeRhsAccountFeatures : set;
        boolean z22 = (i & 32768) != 0 ? equityAdvanceChartOrderDataState.autoSendKillSwitchEnabled : z2;
        boolean z23 = (i & 65536) != 0 ? equityAdvanceChartOrderDataState.equitiesSubzeroMember : z3;
        boolean z24 = (i & 131072) != 0 ? equityAdvanceChartOrderDataState.isScrubbing : z4;
        boolean z25 = (i & 262144) != 0 ? equityAdvanceChartOrderDataState.tradingOnChart : z5;
        NbboSummary nbboSummary3 = (i & 524288) != 0 ? equityAdvanceChartOrderDataState.nbboSummary : nbboSummary;
        boolean z26 = (i & 1048576) != 0 ? equityAdvanceChartOrderDataState.nbboLoading : z6;
        BwTradeSide bwTradeSide3 = (i & 2097152) != 0 ? equityAdvanceChartOrderDataState.autoSendConfirmMarketOrderSide : bwTradeSide;
        boolean z27 = (i & 4194304) != 0 ? equityAdvanceChartOrderDataState.shouldShowOptionsPromo : z7;
        List list3 = (i & 8388608) != 0 ? equityAdvanceChartOrderDataState.activeIndictors : list;
        String str6 = (i & 16777216) != 0 ? equityAdvanceChartOrderDataState.activeTemplate : str2;
        SpanIntervalData spanIntervalData3 = (i & 33554432) != 0 ? equityAdvanceChartOrderDataState.spanIntervalData : spanIntervalData;
        BigDecimal bigDecimal3 = (i & 67108864) != 0 ? equityAdvanceChartOrderDataState.chartCursorPrice : bigDecimal;
        boolean z28 = (i & 134217728) != 0 ? equityAdvanceChartOrderDataState.isInEtfSupportedRegion : z8;
        BuySellData buySellData3 = (i & 268435456) != 0 ? equityAdvanceChartOrderDataState.buySellData : buySellData;
        boolean z29 = (i & 536870912) != 0 ? equityAdvanceChartOrderDataState.shortingExperimentEnabled : z9;
        ShortingInfo shortingInfo3 = (i & 1073741824) != 0 ? equityAdvanceChartOrderDataState.shortingInfo : shortingInfo;
        if ((i & Integer.MIN_VALUE) != 0) {
            shortingInfo2 = shortingInfo3;
            z11 = equityAdvanceChartOrderDataState.showShowAutoSendUpsell;
            z13 = z23;
            z14 = z24;
            z15 = z25;
            nbboSummary2 = nbboSummary3;
            z16 = z26;
            bwTradeSide2 = bwTradeSide3;
            z17 = z27;
            list2 = list3;
            str3 = str6;
            spanIntervalData2 = spanIntervalData3;
            bigDecimal2 = bigDecimal3;
            z18 = z28;
            buySellData2 = buySellData3;
            z19 = z29;
            set2 = set3;
            instrumentBuyingPower2 = instrumentBuyingPower3;
            instrument2 = instrument3;
            instrumentOrderState42 = instrumentOrderState43;
            position2 = position3;
            z20 = z21;
            marketHours2 = marketHours3;
            orderMarketHours3 = orderMarketHours5;
            orderMarketHours4 = orderMarketHours6;
            orderTimeInForce3 = orderTimeInForce5;
            orderTimeInForce4 = orderTimeInForce6;
            str4 = str5;
            quoteDto2 = quoteDto3;
            account2 = account3;
            z12 = z22;
        } else {
            z11 = z10;
            shortingInfo2 = shortingInfo3;
            z12 = z22;
            z13 = z23;
            z14 = z24;
            z15 = z25;
            nbboSummary2 = nbboSummary3;
            z16 = z26;
            bwTradeSide2 = bwTradeSide3;
            z17 = z27;
            list2 = list3;
            str3 = str6;
            spanIntervalData2 = spanIntervalData3;
            bigDecimal2 = bigDecimal3;
            z18 = z28;
            buySellData2 = buySellData3;
            z19 = z29;
            set2 = set3;
            instrumentBuyingPower2 = instrumentBuyingPower3;
            instrument2 = instrument3;
            instrumentOrderState42 = instrumentOrderState43;
            position2 = position3;
            z20 = z21;
            marketHours2 = marketHours3;
            orderMarketHours3 = orderMarketHours5;
            orderMarketHours4 = orderMarketHours6;
            orderTimeInForce3 = orderTimeInForce5;
            orderTimeInForce4 = orderTimeInForce6;
            str4 = str5;
            quoteDto2 = quoteDto3;
            account2 = account3;
        }
        return equityAdvanceChartOrderDataState.copy(uuid3, instrumentBuyingPower2, instrument2, instrumentOrderState42, position2, z20, marketHours2, orderMarketHours3, orderMarketHours4, orderTimeInForce3, orderTimeInForce4, str4, quoteDto2, account2, set2, z12, z13, z14, z15, nbboSummary2, z16, bwTradeSide2, z17, list2, str3, spanIntervalData2, bigDecimal2, z18, buySellData2, z19, shortingInfo2, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
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
    public final Account getActiveRhsAccount() {
        return this.activeRhsAccount;
    }

    public final Set<AccountFeature> component15() {
        return this.activeRhsAccountFeatures;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getEquitiesSubzeroMember() {
        return this.equitiesSubzeroMember;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsScrubbing() {
        return this.isScrubbing;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getTradingOnChart() {
        return this.tradingOnChart;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: component20, reason: from getter */
    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    /* renamed from: component22, reason: from getter */
    public final BwTradeSide getAutoSendConfirmMarketOrderSide() {
        return this.autoSendConfirmMarketOrderSide;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getShouldShowOptionsPromo() {
        return this.shouldShowOptionsPromo;
    }

    public final List<String> component24() {
        return this.activeIndictors;
    }

    /* renamed from: component25, reason: from getter */
    public final String getActiveTemplate() {
        return this.activeTemplate;
    }

    /* renamed from: component26, reason: from getter */
    public final SpanIntervalData getSpanIntervalData() {
        return this.spanIntervalData;
    }

    /* renamed from: component27, reason: from getter */
    public final BigDecimal getChartCursorPrice() {
        return this.chartCursorPrice;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
    }

    /* renamed from: component29, reason: from getter */
    public final BuySellData getBuySellData() {
        return this.buySellData;
    }

    /* renamed from: component3, reason: from getter */
    public final Instrument getOrderInstrument() {
        return this.orderInstrument;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getShortingExperimentEnabled() {
        return this.shortingExperimentEnabled;
    }

    /* renamed from: component31, reason: from getter */
    public final ShortingInfo getShortingInfo() {
        return this.shortingInfo;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getShowShowAutoSendUpsell() {
        return this.showShowAutoSendUpsell;
    }

    /* renamed from: component4, reason: from getter */
    public final InstrumentOrderState4 getInstrumentTradeAmount() {
        return this.instrumentTradeAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final Position getInstrumentPosition() {
        return this.instrumentPosition;
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

    public final EquityAdvanceChartOrderDataState copy(UUID activeInstrumentId, InstrumentBuyingPower buyingPower, Instrument orderInstrument, InstrumentOrderState4 instrumentTradeAmount, Position instrumentPosition, boolean autoSendSwitchState, MarketHours nextMarketHours, OrderMarketHours longOrderMarketHours, OrderMarketHours shortOrderMarketHours, OrderTimeInForce longOrderTimeInForce, OrderTimeInForce shortOrderTimeInForce, String brokebackOrderExpireDateString, QuoteDto quote, Account activeRhsAccount, Set<? extends AccountFeature> activeRhsAccountFeatures, boolean autoSendKillSwitchEnabled, boolean equitiesSubzeroMember, boolean isScrubbing, boolean tradingOnChart, NbboSummary nbboSummary, boolean nbboLoading, BwTradeSide autoSendConfirmMarketOrderSide, boolean shouldShowOptionsPromo, List<String> activeIndictors, String activeTemplate, SpanIntervalData spanIntervalData, BigDecimal chartCursorPrice, boolean isInEtfSupportedRegion, BuySellData buySellData, boolean shortingExperimentEnabled, ShortingInfo shortingInfo, boolean showShowAutoSendUpsell) {
        Intrinsics.checkNotNullParameter(activeRhsAccountFeatures, "activeRhsAccountFeatures");
        return new EquityAdvanceChartOrderDataState(activeInstrumentId, buyingPower, orderInstrument, instrumentTradeAmount, instrumentPosition, autoSendSwitchState, nextMarketHours, longOrderMarketHours, shortOrderMarketHours, longOrderTimeInForce, shortOrderTimeInForce, brokebackOrderExpireDateString, quote, activeRhsAccount, activeRhsAccountFeatures, autoSendKillSwitchEnabled, equitiesSubzeroMember, isScrubbing, tradingOnChart, nbboSummary, nbboLoading, autoSendConfirmMarketOrderSide, shouldShowOptionsPromo, activeIndictors, activeTemplate, spanIntervalData, chartCursorPrice, isInEtfSupportedRegion, buySellData, shortingExperimentEnabled, shortingInfo, showShowAutoSendUpsell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityAdvanceChartOrderDataState)) {
            return false;
        }
        EquityAdvanceChartOrderDataState equityAdvanceChartOrderDataState = (EquityAdvanceChartOrderDataState) other;
        return Intrinsics.areEqual(this.activeInstrumentId, equityAdvanceChartOrderDataState.activeInstrumentId) && Intrinsics.areEqual(this.buyingPower, equityAdvanceChartOrderDataState.buyingPower) && Intrinsics.areEqual(this.orderInstrument, equityAdvanceChartOrderDataState.orderInstrument) && Intrinsics.areEqual(this.instrumentTradeAmount, equityAdvanceChartOrderDataState.instrumentTradeAmount) && Intrinsics.areEqual(this.instrumentPosition, equityAdvanceChartOrderDataState.instrumentPosition) && this.autoSendSwitchState == equityAdvanceChartOrderDataState.autoSendSwitchState && Intrinsics.areEqual(this.nextMarketHours, equityAdvanceChartOrderDataState.nextMarketHours) && this.longOrderMarketHours == equityAdvanceChartOrderDataState.longOrderMarketHours && this.shortOrderMarketHours == equityAdvanceChartOrderDataState.shortOrderMarketHours && this.longOrderTimeInForce == equityAdvanceChartOrderDataState.longOrderTimeInForce && this.shortOrderTimeInForce == equityAdvanceChartOrderDataState.shortOrderTimeInForce && Intrinsics.areEqual(this.brokebackOrderExpireDateString, equityAdvanceChartOrderDataState.brokebackOrderExpireDateString) && Intrinsics.areEqual(this.quote, equityAdvanceChartOrderDataState.quote) && Intrinsics.areEqual(this.activeRhsAccount, equityAdvanceChartOrderDataState.activeRhsAccount) && Intrinsics.areEqual(this.activeRhsAccountFeatures, equityAdvanceChartOrderDataState.activeRhsAccountFeatures) && this.autoSendKillSwitchEnabled == equityAdvanceChartOrderDataState.autoSendKillSwitchEnabled && this.equitiesSubzeroMember == equityAdvanceChartOrderDataState.equitiesSubzeroMember && this.isScrubbing == equityAdvanceChartOrderDataState.isScrubbing && this.tradingOnChart == equityAdvanceChartOrderDataState.tradingOnChart && Intrinsics.areEqual(this.nbboSummary, equityAdvanceChartOrderDataState.nbboSummary) && this.nbboLoading == equityAdvanceChartOrderDataState.nbboLoading && this.autoSendConfirmMarketOrderSide == equityAdvanceChartOrderDataState.autoSendConfirmMarketOrderSide && this.shouldShowOptionsPromo == equityAdvanceChartOrderDataState.shouldShowOptionsPromo && Intrinsics.areEqual(this.activeIndictors, equityAdvanceChartOrderDataState.activeIndictors) && Intrinsics.areEqual(this.activeTemplate, equityAdvanceChartOrderDataState.activeTemplate) && Intrinsics.areEqual(this.spanIntervalData, equityAdvanceChartOrderDataState.spanIntervalData) && Intrinsics.areEqual(this.chartCursorPrice, equityAdvanceChartOrderDataState.chartCursorPrice) && this.isInEtfSupportedRegion == equityAdvanceChartOrderDataState.isInEtfSupportedRegion && Intrinsics.areEqual(this.buySellData, equityAdvanceChartOrderDataState.buySellData) && this.shortingExperimentEnabled == equityAdvanceChartOrderDataState.shortingExperimentEnabled && Intrinsics.areEqual(this.shortingInfo, equityAdvanceChartOrderDataState.shortingInfo) && this.showShowAutoSendUpsell == equityAdvanceChartOrderDataState.showShowAutoSendUpsell;
    }

    public int hashCode() {
        UUID uuid = this.activeInstrumentId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        InstrumentBuyingPower instrumentBuyingPower = this.buyingPower;
        int iHashCode2 = (iHashCode + (instrumentBuyingPower == null ? 0 : instrumentBuyingPower.hashCode())) * 31;
        Instrument instrument = this.orderInstrument;
        int iHashCode3 = (iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        InstrumentOrderState4 instrumentOrderState4 = this.instrumentTradeAmount;
        int iHashCode4 = (iHashCode3 + (instrumentOrderState4 == null ? 0 : instrumentOrderState4.hashCode())) * 31;
        Position position = this.instrumentPosition;
        int iHashCode5 = (((iHashCode4 + (position == null ? 0 : position.hashCode())) * 31) + Boolean.hashCode(this.autoSendSwitchState)) * 31;
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
        int iHashCode12 = (iHashCode11 + (quoteDto == null ? 0 : quoteDto.hashCode())) * 31;
        Account account = this.activeRhsAccount;
        int iHashCode13 = (((((((((((iHashCode12 + (account == null ? 0 : account.hashCode())) * 31) + this.activeRhsAccountFeatures.hashCode()) * 31) + Boolean.hashCode(this.autoSendKillSwitchEnabled)) * 31) + Boolean.hashCode(this.equitiesSubzeroMember)) * 31) + Boolean.hashCode(this.isScrubbing)) * 31) + Boolean.hashCode(this.tradingOnChart)) * 31;
        NbboSummary nbboSummary = this.nbboSummary;
        int iHashCode14 = (((iHashCode13 + (nbboSummary == null ? 0 : nbboSummary.hashCode())) * 31) + Boolean.hashCode(this.nbboLoading)) * 31;
        BwTradeSide bwTradeSide = this.autoSendConfirmMarketOrderSide;
        int iHashCode15 = (((iHashCode14 + (bwTradeSide == null ? 0 : bwTradeSide.hashCode())) * 31) + Boolean.hashCode(this.shouldShowOptionsPromo)) * 31;
        List<String> list = this.activeIndictors;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.activeTemplate;
        int iHashCode17 = (iHashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SpanIntervalData spanIntervalData = this.spanIntervalData;
        int iHashCode18 = (iHashCode17 + (spanIntervalData == null ? 0 : spanIntervalData.hashCode())) * 31;
        BigDecimal bigDecimal = this.chartCursorPrice;
        int iHashCode19 = (((iHashCode18 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + Boolean.hashCode(this.isInEtfSupportedRegion)) * 31;
        BuySellData buySellData = this.buySellData;
        int iHashCode20 = (((iHashCode19 + (buySellData == null ? 0 : buySellData.hashCode())) * 31) + Boolean.hashCode(this.shortingExperimentEnabled)) * 31;
        ShortingInfo shortingInfo = this.shortingInfo;
        return ((iHashCode20 + (shortingInfo != null ? shortingInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.showShowAutoSendUpsell);
    }

    public String toString() {
        return "EquityAdvanceChartOrderDataState(activeInstrumentId=" + this.activeInstrumentId + ", buyingPower=" + this.buyingPower + ", orderInstrument=" + this.orderInstrument + ", instrumentTradeAmount=" + this.instrumentTradeAmount + ", instrumentPosition=" + this.instrumentPosition + ", autoSendSwitchState=" + this.autoSendSwitchState + ", nextMarketHours=" + this.nextMarketHours + ", longOrderMarketHours=" + this.longOrderMarketHours + ", shortOrderMarketHours=" + this.shortOrderMarketHours + ", longOrderTimeInForce=" + this.longOrderTimeInForce + ", shortOrderTimeInForce=" + this.shortOrderTimeInForce + ", brokebackOrderExpireDateString=" + this.brokebackOrderExpireDateString + ", quote=" + this.quote + ", activeRhsAccount=" + this.activeRhsAccount + ", activeRhsAccountFeatures=" + this.activeRhsAccountFeatures + ", autoSendKillSwitchEnabled=" + this.autoSendKillSwitchEnabled + ", equitiesSubzeroMember=" + this.equitiesSubzeroMember + ", isScrubbing=" + this.isScrubbing + ", tradingOnChart=" + this.tradingOnChart + ", nbboSummary=" + this.nbboSummary + ", nbboLoading=" + this.nbboLoading + ", autoSendConfirmMarketOrderSide=" + this.autoSendConfirmMarketOrderSide + ", shouldShowOptionsPromo=" + this.shouldShowOptionsPromo + ", activeIndictors=" + this.activeIndictors + ", activeTemplate=" + this.activeTemplate + ", spanIntervalData=" + this.spanIntervalData + ", chartCursorPrice=" + this.chartCursorPrice + ", isInEtfSupportedRegion=" + this.isInEtfSupportedRegion + ", buySellData=" + this.buySellData + ", shortingExperimentEnabled=" + this.shortingExperimentEnabled + ", shortingInfo=" + this.shortingInfo + ", showShowAutoSendUpsell=" + this.showShowAutoSendUpsell + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EquityAdvanceChartOrderDataState(UUID uuid, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, InstrumentOrderState4 instrumentOrderState4, Position position, boolean z, MarketHours marketHours, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, String str, QuoteDto quoteDto, Account account, Set<? extends AccountFeature> activeRhsAccountFeatures, boolean z2, boolean z3, boolean z4, boolean z5, NbboSummary nbboSummary, boolean z6, BwTradeSide bwTradeSide, boolean z7, List<String> list, String str2, SpanIntervalData spanIntervalData, BigDecimal bigDecimal, boolean z8, BuySellData buySellData, boolean z9, ShortingInfo shortingInfo, boolean z10) {
        Intrinsics.checkNotNullParameter(activeRhsAccountFeatures, "activeRhsAccountFeatures");
        this.activeInstrumentId = uuid;
        this.buyingPower = instrumentBuyingPower;
        this.orderInstrument = instrument;
        this.instrumentTradeAmount = instrumentOrderState4;
        this.instrumentPosition = position;
        this.autoSendSwitchState = z;
        this.nextMarketHours = marketHours;
        this.longOrderMarketHours = orderMarketHours;
        this.shortOrderMarketHours = orderMarketHours2;
        this.longOrderTimeInForce = orderTimeInForce;
        this.shortOrderTimeInForce = orderTimeInForce2;
        this.brokebackOrderExpireDateString = str;
        this.quote = quoteDto;
        this.activeRhsAccount = account;
        this.activeRhsAccountFeatures = activeRhsAccountFeatures;
        this.autoSendKillSwitchEnabled = z2;
        this.equitiesSubzeroMember = z3;
        this.isScrubbing = z4;
        this.tradingOnChart = z5;
        this.nbboSummary = nbboSummary;
        this.nbboLoading = z6;
        this.autoSendConfirmMarketOrderSide = bwTradeSide;
        this.shouldShowOptionsPromo = z7;
        this.activeIndictors = list;
        this.activeTemplate = str2;
        this.spanIntervalData = spanIntervalData;
        this.chartCursorPrice = bigDecimal;
        this.isInEtfSupportedRegion = z8;
        this.buySellData = buySellData;
        this.shortingExperimentEnabled = z9;
        this.shortingInfo = shortingInfo;
        this.showShowAutoSendUpsell = z10;
    }

    public final UUID getActiveInstrumentId() {
        return this.activeInstrumentId;
    }

    public final InstrumentBuyingPower getBuyingPower() {
        return this.buyingPower;
    }

    public final Instrument getOrderInstrument() {
        return this.orderInstrument;
    }

    public /* synthetic */ EquityAdvanceChartOrderDataState(UUID uuid, InstrumentBuyingPower instrumentBuyingPower, Instrument instrument, InstrumentOrderState4 instrumentOrderState4, Position position, boolean z, MarketHours marketHours, OrderMarketHours orderMarketHours, OrderMarketHours orderMarketHours2, OrderTimeInForce orderTimeInForce, OrderTimeInForce orderTimeInForce2, String str, QuoteDto quoteDto, Account account, Set set, boolean z2, boolean z3, boolean z4, boolean z5, NbboSummary nbboSummary, boolean z6, BwTradeSide bwTradeSide, boolean z7, List list, String str2, SpanIntervalData spanIntervalData, BigDecimal bigDecimal, boolean z8, BuySellData buySellData, boolean z9, ShortingInfo shortingInfo, boolean z10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        InstrumentOrderState4 quantity;
        UUID uuid2 = (i & 1) != 0 ? null : uuid;
        InstrumentBuyingPower instrumentBuyingPower2 = (i & 2) != 0 ? null : instrumentBuyingPower;
        Instrument instrument2 = (i & 4) != 0 ? null : instrument;
        if ((i & 8) != 0) {
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            quantity = new Quantity(ONE);
        } else {
            quantity = instrumentOrderState4;
        }
        this(uuid2, instrumentBuyingPower2, instrument2, quantity, (i & 16) != 0 ? null : position, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : marketHours, (i & 128) != 0 ? null : orderMarketHours, (i & 256) != 0 ? null : orderMarketHours2, (i & 512) != 0 ? OrderTimeInForce.GFD : orderTimeInForce, (i & 1024) != 0 ? OrderTimeInForce.GFD : orderTimeInForce2, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : quoteDto, (i & 8192) != 0 ? null : account, (i & 16384) != 0 ? SetsKt.emptySet() : set, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? false : z3, (i & 131072) != 0 ? false : z4, (i & 262144) != 0 ? false : z5, (i & 524288) != 0 ? null : nbboSummary, (i & 1048576) != 0 ? false : z6, (i & 2097152) != 0 ? null : bwTradeSide, (i & 4194304) != 0 ? false : z7, (i & 8388608) != 0 ? null : list, (i & 16777216) != 0 ? null : str2, (i & 33554432) != 0 ? null : spanIntervalData, (i & 67108864) != 0 ? null : bigDecimal, (i & 134217728) != 0 ? false : z8, (i & 268435456) != 0 ? null : buySellData, (i & 536870912) != 0 ? false : z9, (i & 1073741824) != 0 ? null : shortingInfo, (i & Integer.MIN_VALUE) != 0 ? false : z10);
    }

    public final InstrumentOrderState4 getInstrumentTradeAmount() {
        return this.instrumentTradeAmount;
    }

    public final Position getInstrumentPosition() {
        return this.instrumentPosition;
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

    public final Account getActiveRhsAccount() {
        return this.activeRhsAccount;
    }

    public final Set<AccountFeature> getActiveRhsAccountFeatures() {
        return this.activeRhsAccountFeatures;
    }

    public final boolean getAutoSendKillSwitchEnabled() {
        return this.autoSendKillSwitchEnabled;
    }

    public final boolean getEquitiesSubzeroMember() {
        return this.equitiesSubzeroMember;
    }

    public final boolean isScrubbing() {
        return this.isScrubbing;
    }

    public final boolean getTradingOnChart() {
        return this.tradingOnChart;
    }

    public final NbboSummary getNbboSummary() {
        return this.nbboSummary;
    }

    public final boolean getNbboLoading() {
        return this.nbboLoading;
    }

    public final BwTradeSide getAutoSendConfirmMarketOrderSide() {
        return this.autoSendConfirmMarketOrderSide;
    }

    public final boolean getShouldShowOptionsPromo() {
        return this.shouldShowOptionsPromo;
    }

    public final List<String> getActiveIndictors() {
        return this.activeIndictors;
    }

    public final String getActiveTemplate() {
        return this.activeTemplate;
    }

    public final SpanIntervalData getSpanIntervalData() {
        return this.spanIntervalData;
    }

    public final BigDecimal getChartCursorPrice() {
        return this.chartCursorPrice;
    }

    public final boolean isInEtfSupportedRegion() {
        return this.isInEtfSupportedRegion;
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

    public final boolean getShowShowAutoSendUpsell() {
        return this.showShowAutoSendUpsell;
    }

    public final LegendAdvancedChartsContext getLoggingContext() {
        String label;
        String label2;
        BigDecimal amount;
        String string2;
        IntervalDto currentInterval;
        TimeSpanDto currentSpan;
        SpanIntervalData spanIntervalData = this.spanIntervalData;
        String str = "";
        if (spanIntervalData == null || (currentSpan = spanIntervalData.getCurrentSpan()) == null || (label = currentSpan.getLabel()) == null) {
            label = "";
        }
        SpanIntervalData spanIntervalData2 = this.spanIntervalData;
        if (spanIntervalData2 == null || (currentInterval = spanIntervalData2.getCurrentInterval()) == null || (label2 = currentInterval.getLabel()) == null) {
            label2 = "";
        }
        String str2 = this.activeTemplate;
        if (str2 == null) {
            str2 = "";
        }
        List<String> listEmptyList = this.activeIndictors;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        UUID uuid = this.activeInstrumentId;
        if (uuid != null && (string2 = uuid.toString()) != null) {
            str = string2;
        }
        InstrumentOrderState4 instrumentOrderState4 = this.instrumentTradeAmount;
        Quantity quantity = instrumentOrderState4 instanceof Quantity ? (Quantity) instrumentOrderState4 : null;
        return new LegendAdvancedChartsContext(label, label2, str2, listEmptyList, str, (quantity == null || (amount = quantity.getAmount()) == null) ? 0.0d : amount.doubleValue(), this.autoSendSwitchState && !this.autoSendKillSwitchEnabled, null, null, null, null, 0.0d, null, null, 16256, null);
    }
}
