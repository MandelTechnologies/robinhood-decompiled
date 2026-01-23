package com.robinhood.android.equitydetail.p123ui.tradebar;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.data.prefs.HasVisitedEquityTradeFlowPref;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderExperiment;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderExperiment2;
import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderKillswitchExperiment;
import com.robinhood.android.equities.contracts.tradeladder.TradeLadderContract;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.experiments.TradeEquitiesSduiAccountSwitcherExperiment;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsLogging;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.PriceBookExistenceStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore2;
import com.robinhood.models.api.AccountType;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.bonfire.StockDetailTradeBar;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import com.robinhood.models.p355ui.PriceBookExistence;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.bonfire.UiStockDetail;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.shared.equities.models.instrumentdetails.store.FundamentalStore;
import com.robinhood.shared.equities.store.subzero.SubzeroModule2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import hippo.model.p469v1.UXFlagDto;
import hippo.model.p469v1.UXFlagNameDto;
import hippo.service.p470v1.GetUXFlagsRequestDto;
import hippo.service.p470v1.GetUXFlagsResponseDto;
import hippo.service.p470v1.UXFlagsService;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: InstrumentDetailTradeBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B£\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\b\b\u0001\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u000e\u0010[\u001a\u00020M2\u0006\u0010\\\u001a\u00020]J\u000e\u0010^\u001a\u00020M2\u0006\u0010_\u001a\u00020`J\u000e\u0010a\u001a\u00020M2\u0006\u0010b\u001a\u00020cJ\b\u0010d\u001a\u00020MH\u0002J\u0006\u0010e\u001a\u00020MJ\b\u0010f\u001a\u00020MH\u0002J\u0006\u0010g\u001a\u00020MJ\u000e\u0010h\u001a\u00020M2\u0006\u0010i\u001a\u00020jJ\u001a\u0010k\u001a\u00020M2\u0006\u0010l\u001a\u00020m2\b\u0010n\u001a\u0004\u0018\u00010oH\u0002J\u001a\u0010p\u001a\u00020M2\u0006\u0010l\u001a\u00020q2\b\u0010n\u001a\u0004\u0018\u00010oH\u0002J \u0010r\u001a\u00020M2\u0006\u0010s\u001a\u00020q2\u0006\u0010n\u001a\u00020o2\u0006\u0010l\u001a\u00020qH\u0002J\u0010\u0010t\u001a\u00020M2\b\u0010s\u001a\u0004\u0018\u00010qJ\u0006\u0010u\u001a\u00020MJ\b\u0010v\u001a\u00020MH\u0016J\b\u0010w\u001a\u00020MH\u0016J\b\u0010x\u001a\u00020MH\u0002J8\u0010y\u001a\u00020M2\u0006\u0010\\\u001a\u00020]2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020{2\u0006\u0010}\u001a\u00020{2\u0006\u0010~\u001a\u00020{2\u0006\u0010\u007f\u001a\u00020{H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001c\u0010K\u001a\u0010\u0012\f\u0012\n N*\u0004\u0018\u00010M0M0LX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010O\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010U\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006\u0080\u0001"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "fundamentalsStore", "Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "priceBookExistenceStore", "Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "subzeroFtuxSeenCountPref", "Lcom/robinhood/prefs/IntPreference;", "uxFlagsService", "Lhippo/service/v1/UXFlagsService;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/prefs/IntPreference;Lhippo/service/v1/UXFlagsService;Lcom/robinhood/android/udf/DuxoBundle;)V", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getFundamentalsStore", "()Lcom/robinhood/shared/equities/models/instrumentdetails/store/FundamentalStore;", "getInstrumentAccountSwitcherStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "getOptionChainStore", "()Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "getOptionPositionStore", "()Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "getOptionUpgradePromotionStore", "()Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "getPerformanceLogger", "()Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getPriceBookExistenceStore", "()Lcom/robinhood/librobinhood/data/store/PriceBookExistenceStore;", "getPositionStore", "()Lcom/robinhood/librobinhood/data/store/PositionStore;", "getStockDetailStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "getQuoteStore", "()Lcom/robinhood/librobinhood/data/store/QuoteStore;", "getBuySellStore", "()Lcom/robinhood/android/common/buysell/BuySellStore;", "getUxFlagsService", "()Lhippo/service/v1/UXFlagsService;", "accountSwitcherRefreshSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "hasVisitedEquityTradeFlowPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasVisitedEquityTradeFlowPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasVisitedEquityTradeFlowPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "tradingTrendsDetailsLogging", "Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "getTradingTrendsDetailsLogging", "()Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "setTradingTrendsDetailsLogging", "(Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;)V", "setInstrument", "instrument", "Lcom/robinhood/models/db/Instrument;", "setDisplayType", "displayType", "Lcom/robinhood/android/equitydetail/ui/tradebar/DisplayType;", "setAnalyticsData", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/equitydetail/ui/tradebar/AnalyticsData;", "logTradeBarAppearance", "logTradeBarLoaded", "logUpgradeHookButtonAppearEvent", "onClientDrivenTradeButtonClicked", "onExpandedActionClick", "actionItem", "Lcom/robinhood/android/equitydetail/ui/tradebar/ActionItem;", "logExpandedActionBuyClick", "instrumentId", "Ljava/util/UUID;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "logExpandedActionSellClick", "", "onExpandedActionOptionsClick", "accountNumber", "setAccountNumber", "refreshAccountSwitcher", "onCreate", "onStart", "logTradeButtonClick", "logActionButtonAppearances", "buyEnabled", "", "buyToCloseEnabled", "optionsEnabled", "sellEnabled", "shortEnabled", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailTradeBarDuxo extends BaseDuxo4<InstrumentDetailTradeBarViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final PublishSubject<Unit> accountSwitcherRefreshSubject;
    private final AnalyticsLogger analytics;
    private final BuySellStore buySellStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final FundamentalStore fundamentalsStore;

    @HasVisitedEquityTradeFlowPref
    public BooleanPreference hasVisitedEquityTradeFlowPref;
    private final InstrumentAccountSwitcherStore instrumentAccountSwitcherStore;
    private final OptionChainStore optionChainStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionUpgradePromotionStore optionUpgradePromotionStore;
    private final PerformanceLogger performanceLogger;
    private final PositionStore positionStore;
    private final PriceBookExistenceStore priceBookExistenceStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final StockDetailStore stockDetailStore;
    private final IntPreference subzeroFtuxSeenCountPref;
    public TradingTrendsDetailsLogging tradingTrendsDetailsLogging;
    private final UXFlagsService uxFlagsService;

    public final AccountProvider getAccountProvider() {
        return this.accountProvider;
    }

    public final AnalyticsLogger getAnalytics() {
        return this.analytics;
    }

    public final EventLogger getEventLogger() {
        return this.eventLogger;
    }

    public final ExperimentsStore getExperimentsStore() {
        return this.experimentsStore;
    }

    public final FundamentalStore getFundamentalsStore() {
        return this.fundamentalsStore;
    }

    public final InstrumentAccountSwitcherStore getInstrumentAccountSwitcherStore() {
        return this.instrumentAccountSwitcherStore;
    }

    public final OptionChainStore getOptionChainStore() {
        return this.optionChainStore;
    }

    public final OptionPositionStore getOptionPositionStore() {
        return this.optionPositionStore;
    }

    public final OptionUpgradePromotionStore getOptionUpgradePromotionStore() {
        return this.optionUpgradePromotionStore;
    }

    public final PerformanceLogger getPerformanceLogger() {
        return this.performanceLogger;
    }

    public final PriceBookExistenceStore getPriceBookExistenceStore() {
        return this.priceBookExistenceStore;
    }

    public final PositionStore getPositionStore() {
        return this.positionStore;
    }

    public final StockDetailStore getStockDetailStore() {
        return this.stockDetailStore;
    }

    public final QuoteStore getQuoteStore() {
        return this.quoteStore;
    }

    public final BuySellStore getBuySellStore() {
        return this.buySellStore;
    }

    public final UXFlagsService getUxFlagsService() {
        return this.uxFlagsService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailTradeBarDuxo(AccountProvider accountProvider, AnalyticsLogger analytics, EventLogger eventLogger, ExperimentsStore experimentsStore, FundamentalStore fundamentalsStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, OptionChainStore optionChainStore, OptionPositionStore optionPositionStore, OptionUpgradePromotionStore optionUpgradePromotionStore, PerformanceLogger performanceLogger, PriceBookExistenceStore priceBookExistenceStore, PositionStore positionStore, StockDetailStore stockDetailStore, QuoteStore quoteStore, BuySellStore buySellStore, RegionGateProvider regionGateProvider, @SubzeroModule2 IntPreference subzeroFtuxSeenCountPref, UXFlagsService uxFlagsService, DuxoBundle duxoBundle) {
        super(new InstrumentDetailTradeBarViewState(null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435455, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(fundamentalsStore, "fundamentalsStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(priceBookExistenceStore, "priceBookExistenceStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(subzeroFtuxSeenCountPref, "subzeroFtuxSeenCountPref");
        Intrinsics.checkNotNullParameter(uxFlagsService, "uxFlagsService");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.fundamentalsStore = fundamentalsStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.optionChainStore = optionChainStore;
        this.optionPositionStore = optionPositionStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.performanceLogger = performanceLogger;
        this.priceBookExistenceStore = priceBookExistenceStore;
        this.positionStore = positionStore;
        this.stockDetailStore = stockDetailStore;
        this.quoteStore = quoteStore;
        this.buySellStore = buySellStore;
        this.regionGateProvider = regionGateProvider;
        this.subzeroFtuxSeenCountPref = subzeroFtuxSeenCountPref;
        this.uxFlagsService = uxFlagsService;
        PublishSubject<Unit> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.accountSwitcherRefreshSubject = publishSubjectCreate;
    }

    public final BooleanPreference getHasVisitedEquityTradeFlowPref() {
        BooleanPreference booleanPreference = this.hasVisitedEquityTradeFlowPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasVisitedEquityTradeFlowPref");
        return null;
    }

    public final void setHasVisitedEquityTradeFlowPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasVisitedEquityTradeFlowPref = booleanPreference;
    }

    public final TradingTrendsDetailsLogging getTradingTrendsDetailsLogging() {
        TradingTrendsDetailsLogging tradingTrendsDetailsLogging = this.tradingTrendsDetailsLogging;
        if (tradingTrendsDetailsLogging != null) {
            return tradingTrendsDetailsLogging;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tradingTrendsDetailsLogging");
        return null;
    }

    public final void setTradingTrendsDetailsLogging(TradingTrendsDetailsLogging tradingTrendsDetailsLogging) {
        Intrinsics.checkNotNullParameter(tradingTrendsDetailsLogging, "<set-?>");
        this.tradingTrendsDetailsLogging = tradingTrendsDetailsLogging;
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setInstrument$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setInstrument$1 */
    static final class C156321 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
        final /* synthetic */ Instrument $instrument;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156321(Instrument instrument, Continuation<? super C156321> continuation) {
            super(2, continuation);
            this.$instrument = instrument;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156321 c156321 = new C156321(this.$instrument, continuation);
            c156321.L$0 = obj;
            return c156321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
            return ((C156321) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, this.$instrument, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268419069, null);
        }
    }

    public final void setInstrument(Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        applyMutation(new C156321(instrument, null));
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setDisplayType$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setDisplayType$1 */
    static final class C156311 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
        final /* synthetic */ DisplayType $displayType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156311(DisplayType displayType, Continuation<? super C156311> continuation) {
            super(2, continuation);
            this.$displayType = displayType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156311 c156311 = new C156311(this.$displayType, continuation);
            c156311.L$0 = obj;
            return c156311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
            return ((C156311) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, this.$displayType, null, null, false, null, false, 264241151, null);
        }
    }

    public final void setDisplayType(DisplayType displayType) {
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        applyMutation(new C156311(displayType, null));
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setAnalyticsData$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setAnalyticsData$1 */
    static final class C156301 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
        final /* synthetic */ AnalyticsData $data;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156301(AnalyticsData analyticsData, Continuation<? super C156301> continuation) {
            super(2, continuation);
            this.$data = analyticsData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156301 c156301 = new C156301(this.$data, continuation);
            c156301.L$0 = obj;
            return c156301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
            return ((C156301) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, this.$data, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435454, null);
        }
    }

    public final void setAnalyticsData(AnalyticsData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        applyMutation(new C156301(data, null));
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeBarAppearance$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeBarAppearance$1 */
    static final class C156201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156201(Continuation<? super C156201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instrument instrument;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
            if (instrumentDetailTradeBarViewState != null && (instrument = instrumentDetailTradeBarViewState.getInstrument()) != null) {
                if (instrumentDetailTradeBarViewState.getActionButtonCount() > 1) {
                    AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(InstrumentDetailTradeBarDuxo.this.getAnalytics(), instrumentDetailTradeBarViewState.getButtonGroupTitle(instrument), TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                } else if (instrumentDetailTradeBarViewState.getActionButtonCount() == 1) {
                    InstrumentDetailTradeBarDuxo.this.logActionButtonAppearances(instrument, instrumentDetailTradeBarViewState.getBuyToOpenEnabled(), instrumentDetailTradeBarViewState.getBuyToCloseEnabled(), instrumentDetailTradeBarViewState.getOptionsEnabled(), instrumentDetailTradeBarViewState.getSellEnabled(), instrumentDetailTradeBarViewState.getShortEnabled());
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    private final void logTradeBarAppearance() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156201(null), 3, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeBarLoaded$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeBarLoaded$1 */
    static final class C156211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156211(Continuation<? super C156211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instrument instrument;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
            if (instrumentDetailTradeBarViewState != null && (instrument = instrumentDetailTradeBarViewState.getInstrument()) != null) {
                InstrumentDetailTradeBarDuxo.this.getPerformanceLogger().completeMetric(PerformanceMetricEventData.Name.HOME_INSTRUMENT_ROW_TRADE_BAR, instrument.getId());
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public final void logTradeBarLoaded() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156211(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logUpgradeHookButtonAppearEvent() {
        AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(this.analytics, "options_upgrade", "sign_up", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onClientDrivenTradeButtonClicked$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onClientDrivenTradeButtonClicked$1 */
    static final class C156231 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156231(Continuation<? super C156231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156231(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instrument instrument;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
            if (instrumentDetailTradeBarViewState != null && (instrument = instrumentDetailTradeBarViewState.getInstrument()) != null) {
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(InstrumentDetailTradeBarDuxo.this.getAnalytics(), instrumentDetailTradeBarViewState.getButtonGroupTitle(instrument), TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                InstrumentDetailTradeBarDuxo.this.logActionButtonAppearances(instrument, instrumentDetailTradeBarViewState.getBuyToOpenEnabled(), instrumentDetailTradeBarViewState.getBuyToCloseEnabled(), instrumentDetailTradeBarViewState.getOptionsEnabled(), instrumentDetailTradeBarViewState.getSellEnabled(), instrumentDetailTradeBarViewState.getShortEnabled());
                InstrumentDetailTradeBarDuxo.this.logTradeButtonClick();
                EventLogger eventLogger = InstrumentDetailTradeBarDuxo.this.getEventLogger();
                UserInteractionEventData.Action action = UserInteractionEventData.Action.TRADE;
                AnalyticsData analyticsData = instrumentDetailTradeBarViewState.getAnalyticsData();
                Screen screen = analyticsData != null ? analyticsData.getScreen() : null;
                AnalyticsData analyticsData2 = instrumentDetailTradeBarViewState.getAnalyticsData();
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, analyticsData2 != null ? analyticsData2.getContext() : null, false, 40, null);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public final void onClientDrivenTradeButtonClicked() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156231(null), 3, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1 */
    static final class C156261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActionItem $actionItem;
        int label;

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActionItem.values().length];
                try {
                    iArr[ActionItem.BUY_TO_OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ActionItem.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ActionItem.SELL_SHORT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ActionItem.BUY_TO_CLOSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ActionItem.OPTIONS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ActionItem.LADDER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156261(ActionItem actionItem, Continuation<? super C156261> continuation) {
            super(2, continuation);
            this.$actionItem = actionItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156261(this.$actionItem, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instrument instrument;
            String accountNumber;
            String accountNumber2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
            if (instrumentDetailTradeBarViewState != null && (instrument = instrumentDetailTradeBarViewState.getInstrument()) != null) {
                Account account = instrumentDetailTradeBarViewState.getAccount();
                switch (WhenMappings.$EnumSwitchMapping$0[this.$actionItem.ordinal()]) {
                    case 1:
                        InstrumentDetailTradeBarDuxo.this.logExpandedActionBuyClick(instrument.getId(), account != null ? account.getBrokerageAccountType() : null);
                        InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass1(null));
                        break;
                    case 2:
                        InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo = InstrumentDetailTradeBarDuxo.this;
                        String string2 = instrument.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        instrumentDetailTradeBarDuxo.logExpandedActionSellClick(string2, account != null ? account.getBrokerageAccountType() : null);
                        InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass2(null));
                        break;
                    case 3:
                        int i2 = InstrumentDetailTradeBarDuxo.this.subzeroFtuxSeenCountPref.get();
                        if (i2 >= 2 || !instrumentDetailTradeBarViewState.isEquitySubzeroEnabled()) {
                            InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo2 = InstrumentDetailTradeBarDuxo.this;
                            String string3 = instrument.getId().toString();
                            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                            instrumentDetailTradeBarDuxo2.logExpandedActionSellClick(string3, account != null ? account.getBrokerageAccountType() : null);
                            InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass3(null));
                            break;
                        } else {
                            Account account2 = instrumentDetailTradeBarViewState.getAccount();
                            if (account2 == null || (accountNumber = account2.getAccountNumber()) == null) {
                                return Unit.INSTANCE;
                            }
                            String str = "robinhood://microgram_launch?id=app-subzero-onboarding&deeplink=robinhood%3A%2F%2F%3Faccount_number%3D" + accountNumber + "%26instrument_id%3D" + instrument.getId() + "%26entry_point%3DSTOCK_DETAIL_PAGE";
                            if (instrumentDetailTradeBarViewState.getAccount().getType() != AccountType.CASH) {
                                InstrumentDetailTradeBarDuxo.this.subzeroFtuxSeenCountPref.set(2);
                                InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass6(str, null));
                                break;
                            } else if (i2 == 0) {
                                InstrumentDetailTradeBarDuxo.this.subzeroFtuxSeenCountPref.set(1);
                                InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass4(str, null));
                                break;
                            } else {
                                InstrumentDetailTradeBarDuxo.this.subzeroFtuxSeenCountPref.set(2);
                                InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass5(null));
                                break;
                            }
                        }
                        break;
                    case 4:
                        InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo3 = InstrumentDetailTradeBarDuxo.this;
                        String string4 = instrument.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                        instrumentDetailTradeBarDuxo3.logExpandedActionSellClick(string4, account != null ? account.getBrokerageAccountType() : null);
                        InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass7(null));
                        break;
                    case 5:
                        if (account == null || (accountNumber2 = account.getAccountNumber()) == null) {
                            return Unit.INSTANCE;
                        }
                        InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo4 = InstrumentDetailTradeBarDuxo.this;
                        BrokerageAccountType brokerageAccountType = account.getBrokerageAccountType();
                        String string5 = instrument.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                        instrumentDetailTradeBarDuxo4.onExpandedActionOptionsClick(accountNumber2, brokerageAccountType, string5);
                        break;
                        break;
                    case 6:
                        InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass8(instrument, null));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, new UiEvent(EquityOrderSide.BUY), null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434943, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass2) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, new UiEvent(EquityOrderSide.SELL), null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434943, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass3) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, new UiEvent(EquityOrderSide.SELL_SHORT), null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434943, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$4", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            final /* synthetic */ String $deeplink;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(String str, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$deeplink = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$deeplink, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass4) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, new UiEvent(this.$deeplink), false, 201326591, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$5", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass5) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, new UiEvent(EquityOrderSide.SELL_SHORT), null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434943, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$6", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            final /* synthetic */ String $deeplink;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(String str, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$deeplink = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$deeplink, continuation);
                anonymousClass6.L$0 = obj;
                return anonymousClass6;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass6) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, new UiEvent(this.$deeplink), false, 201326591, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$7", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(continuation);
                anonymousClass7.L$0 = obj;
                return anonymousClass7;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass7) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, new UiEvent(EquityOrderSide.BUY), null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434943, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$8", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            final /* synthetic */ Instrument $instrument;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(Instrument instrument, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$instrument = instrument;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.$instrument, continuation);
                anonymousClass8.L$0 = obj;
                return anonymousClass8;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass8) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) this.L$0;
                String string2 = this.$instrument.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return InstrumentDetailTradeBarViewState.copy$default(instrumentDetailTradeBarViewState, null, null, null, null, null, null, null, false, null, null, null, new UiEvent(new TradeLadderContract(string2, "sdp", false, 4, null)), false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268433407, null);
            }
        }
    }

    public final void onExpandedActionClick(ActionItem actionItem) {
        Intrinsics.checkNotNullParameter(actionItem, "actionItem");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156261(actionItem, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156272(actionItem, null), 3, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {338}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2 */
    static final class C156272 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActionItem $actionItem;
        int label;

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActionItem.values().length];
                try {
                    iArr[ActionItem.OPTIONS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ActionItem.LADDER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ActionItem.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ActionItem.BUY_TO_OPEN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ActionItem.SELL_SHORT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ActionItem.BUY_TO_CLOSE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156272(ActionItem actionItem, Continuation<? super C156272> continuation) {
            super(2, continuation);
            this.$actionItem = actionItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156272(this.$actionItem, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156272) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirstOrNull;
            UserInteractionEventData.Action action;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                Flow<AnalyticsData> flow = new Flow<AnalyticsData>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super AnalyticsData> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionClick$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                AnalyticsData analyticsData = ((InstrumentDetailTradeBarViewState) obj).getAnalyticsData();
                                if (analyticsData != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(analyticsData, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                this.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(flow, this);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objFirstOrNull = obj;
            }
            AnalyticsData analyticsData = (AnalyticsData) objFirstOrNull;
            switch (WhenMappings.$EnumSwitchMapping$0[this.$actionItem.ordinal()]) {
                case 1:
                    action = UserInteractionEventData.Action.TRADE_BAR_VIEW_ALL_OPTIONS;
                    break;
                case 2:
                    action = UserInteractionEventData.Action.VIEW_EQUITY_TRADING_LADDER;
                    break;
                case 3:
                    action = UserInteractionEventData.Action.TRADE_BAR_SELL;
                    break;
                case 4:
                    action = UserInteractionEventData.Action.TRADE_BAR_BUY;
                    break;
                case 5:
                    action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                    break;
                case 6:
                    action = UserInteractionEventData.Action.TRADE_BAR_BUY;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            UserInteractionEventData.Action action2 = action;
            EventLogger eventLogger = InstrumentDetailTradeBarDuxo.this.getEventLogger();
            Screen screen = analyticsData != null ? analyticsData.getScreen() : null;
            Context context = analyticsData != null ? analyticsData.getContext() : null;
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            ActionItem actionItem = this.$actionItem;
            ActionItem actionItem2 = ActionItem.LADDER;
            if (actionItem == actionItem2) {
                str = "equity_trade_buy_sell_ladder";
            } else {
                str = "";
            }
            EventLogger.DefaultImpls.logTap$default(eventLogger, action2, screen, new Component(componentType, str, null, 4, null), null, context, this.$actionItem == actionItem2, 8, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExpandedActionBuyClick(UUID instrumentId, BrokerageAccountType brokerageAccountType) {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.BUTTON, "equity_trade_buy", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, brokerageAccountType != null ? new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), false, 41, null);
        PerformanceLogger.DefaultImpls.beginMetric$default(this.performanceLogger, PerformanceMetricEventData.Name.BUY_EQUITY_TRADE_FLOW, PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL, instrumentId, null, 8, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156182(null), 3, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logExpandedActionBuyClick$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {391}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logExpandedActionBuyClick$2 */
    static final class C156182 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156182(Continuation<? super C156182> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156182(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instrument instrument;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
            if (instrumentDetailTradeBarViewState != null && (instrument = instrumentDetailTradeBarViewState.getInstrument()) != null) {
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(InstrumentDetailTradeBarDuxo.this.getAnalytics(), instrumentDetailTradeBarViewState.getButtonGroupTitle(instrument), "buy", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExpandedActionSellClick(String instrumentId, BrokerageAccountType brokerageAccountType) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, instrumentId, null, 10, null), new Component(Component.ComponentType.BUTTON, "equity_trade_sell", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, brokerageAccountType != null ? new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), false, 41, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156192(null), 3, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logExpandedActionSellClick$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {417}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logExpandedActionSellClick$2 */
    static final class C156192 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156192(Continuation<? super C156192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156192(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Instrument instrument;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                obj = FlowKt.firstOrNull(stateFlow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
            if (instrumentDetailTradeBarViewState != null && (instrument = instrumentDetailTradeBarViewState.getInstrument()) != null) {
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(InstrumentDetailTradeBarDuxo.this.getAnalytics(), instrumentDetailTradeBarViewState.getButtonGroupTitle(instrument), "sell", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpandedActionOptionsClick(String accountNumber, BrokerageAccountType brokerageAccountType, String instrumentId) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        int i4 = 0;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, instrumentId, null, 10, null), new Component(Component.ComponentType.BUTTON, "equity_trade_buy_sell_trade_options", null, 4, null), null, new Context(i, i2, i3, null, null, str, str2, null, i4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, null, false, false, null, null, null, null, 1022, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), false, 41, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156281(accountNumber, null), 3, null);
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionOptionsClick$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {445}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionOptionsClick$1 */
    static final class C156281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156281(String str, Continuation<? super C156281> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156281(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirstOrNull;
            OptionChain activeOptionChain;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                this.label = 1;
                objFirstOrNull = FlowKt.firstOrNull(stateFlow, this);
                if (objFirstOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objFirstOrNull = obj;
            }
            InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) objFirstOrNull;
            if (instrumentDetailTradeBarViewState == null) {
                return Unit.INSTANCE;
            }
            if (!instrumentDetailTradeBarViewState.getHasAccessToOptions() && instrumentDetailTradeBarViewState.getIgnoreOptionsAccess()) {
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(InstrumentDetailTradeBarDuxo.this.getAnalytics(), "options_upgrade", "sign_up", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass1(this.$accountNumber, null));
                return Unit.INSTANCE;
            }
            Instrument instrument = instrumentDetailTradeBarViewState.getInstrument();
            if (instrument != null && (activeOptionChain = instrumentDetailTradeBarViewState.getActiveOptionChain()) != null) {
                AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(InstrumentDetailTradeBarDuxo.this.getAnalytics(), instrumentDetailTradeBarViewState.getButtonGroupTitle(instrument), "options", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                PerformanceLogger performanceLogger = InstrumentDetailTradeBarDuxo.this.getPerformanceLogger();
                PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.TRADE_OPTIONS_STRATEGY_BUILDER;
                PerformanceMetricEventData.Source source = PerformanceMetricEventData.Source.SOURCE_STOCK_DETAIL;
                PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, source, activeOptionChain.getId(), null, 8, null);
                PerformanceLogger performanceLogger2 = InstrumentDetailTradeBarDuxo.this.getPerformanceLogger();
                PerformanceMetricEventData.Name name2 = PerformanceMetricEventData.Name.OPTIONS_CHAIN;
                UUID id = activeOptionChain.getId();
                String string2 = activeOptionChain.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                performanceLogger2.beginMetric(name2, source, id, new PerformanceMetricEventData.Context(false, false, false, new PerformanceMetricEventData.Context.Options(null, null, false, string2, instrument.getSymbol(), null, null, 99, null), null, null, null, null, null, null, null, null, 4087, null));
                InstrumentDetailTradeBarDuxo.this.applyMutation(new AnonymousClass2(new OptionChainIntentKey(instrument.getId(), new OptionChainIdLaunchMode.SingleChainId(activeOptionChain.getId()), (ImmutableList) null, (OptionOrderFilter) null, this.$accountNumber, (String) null, 44, (DefaultConstructorMarker) null), null));
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionOptionsClick$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionOptionsClick$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            final /* synthetic */ String $accountNumber;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountNumber, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                OptionOnboarding.OptionOnboardingSource legacy;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) this.L$0;
                OptionOnboarding2.AccountNumber accountNumber = new OptionOnboarding2.AccountNumber(this.$accountNumber);
                Instrument instrument = instrumentDetailTradeBarViewState.getInstrument();
                if (instrument != null) {
                    legacy = new OptionOnboarding.OptionOnboardingSource.ServerDriven("trade_bar", instrument.getSymbol(), instrument.getId(), instrument.getTradableChainId());
                } else {
                    legacy = new OptionOnboarding.OptionOnboardingSource.Legacy("trade_bar");
                }
                return InstrumentDetailTradeBarViewState.copy$default(instrumentDetailTradeBarViewState, null, null, null, null, null, null, null, false, null, null, new UiEvent(new OptionOnboarding(accountNumber, legacy, null, 4, null)), null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434431, null);
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionOptionsClick$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onExpandedActionOptionsClick$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
            final /* synthetic */ OptionChainIntentKey $fragmentKey;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionChainIntentKey optionChainIntentKey, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$fragmentKey = optionChainIntentKey;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$fragmentKey, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                return ((AnonymousClass2) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, new UiEvent(this.$fragmentKey), null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268434431, null);
            }
        }
    }

    public final void setAccountNumber(String accountNumber) {
        if (accountNumber == null) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156291(null), 3, null);
        } else {
            this.instrumentAccountSwitcherStore.setActiveAccountNumber(accountNumber);
        }
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setAccountNumber$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {531}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setAccountNumber$1 */
    static final class C156291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156291(Continuation<? super C156291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(InstrumentDetailTradeBarDuxo.this.getInstrumentAccountSwitcherStore().streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(InstrumentDetailTradeBarDuxo.this.getAccountProvider().streamIndividualAccountNumberOptional()), Integer.MAX_VALUE, null, 2, null), new AnonymousClass1(null));
                this.label = 1;
                obj = FlowKt.first(flowCombine, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Tuples2 tuples2 = (Tuples2) obj;
            String str = (String) tuples2.component1();
            String str2 = (String) tuples2.component2();
            if (str == null) {
                InstrumentDetailTradeBarDuxo.this.getInstrumentAccountSwitcherStore().setActiveAccountNumber(str2);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "<destruct>", "Lcom/robinhood/utils/Optional;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setAccountNumber$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$setAccountNumber$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Optional<? extends String>, Optional<? extends String>, Continuation<? super Tuples2<? extends String, ? extends String>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<String> optional, Optional<String> optional2, Continuation<? super Tuples2<String, String>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = optional;
                anonymousClass1.L$1 = optional2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Optional<? extends String> optional2, Continuation<? super Tuples2<? extends String, ? extends String>> continuation) {
                return invoke2((Optional<String>) optional, (Optional<String>) optional2, (Continuation<? super Tuples2<String, String>>) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Tuples4.m3642to((String) ((Optional) this.L$0).component1(), (String) ((Optional) this.L$1).component1());
            }
        }
    }

    public final void refreshAccountSwitcher() {
        this.accountSwitcherRefreshSubject.onNext(Unit.INSTANCE);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        final StateFlow<InstrumentDetailTradeBarViewState> stateFlow = getStateFlow();
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Instrument>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$mapNotNull$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Instrument> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C156002(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$mapNotNull$1$2 */
            public static final class C156002<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$mapNotNull$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C156002.this.emit(null, this);
                    }
                }

                public C156002(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Instrument instrument = ((InstrumentDetailTradeBarViewState) obj).getInstrument();
                        if (instrument != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(instrument, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
        AccountProvider.DefaultImpls.refresh$default(this.accountProvider, false, 1, null);
        Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.accountProvider.streamAllAccounts()), Integer.MAX_VALUE, null, 2, null)), FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C155982(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$1$2 */
            public static final class C155982<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C155982.this.emit(null, this);
                    }
                }

                public C155982(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Boolean boolBoxBoolean = boxing.boxBoolean(!((Instrument) obj).isIpoAccessPreIpo());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), new InstrumentDetailTradeBarDuxo4(null)));
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C156241(flowDistinctUntilChanged2, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C156252(FlowKt.distinctUntilChanged(FlowKt.transformLatest(flowDistinctUntilChanged2, new InstrumentDetailTradeBarDuxo$onCreate$$inlined$flatMapLatest$2(null, FlowKt.distinctUntilChanged(FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.instrumentAccountSwitcherStore.streamActiveAccountNumber()), Integer.MAX_VALUE, null, 2, null), new InstrumentDetailTradeBarDuxo$onCreate$$inlined$flatMapLatest$1(null, this))), this))), FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C155992(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$2$2 */
            public static final class C155992<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$2$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C155992.this.emit(null, this);
                    }
                }

                public C155992(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        UUID id = ((Instrument) obj).getId();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }), flowDistinctUntilChanged, flowDistinctUntilChanged2, null));
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {568}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$1 */
    static final class C156241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Boolean> $accountSwitchVisibleFlow;
        int label;
        final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C156241(Flow<Boolean> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super C156241> continuation) {
            super(2, continuation);
            this.$accountSwitchVisibleFlow = flow;
            this.this$0 = instrumentDetailTradeBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C156241(this.$accountSwitchVisibleFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.$accountSwitchVisibleFlow);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isVisible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$1$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499731 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                final /* synthetic */ boolean $isVisible;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499731(boolean z, Continuation<? super C499731> continuation) {
                    super(2, continuation);
                    this.$isVisible = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499731 c499731 = new C499731(this.$isVisible, continuation);
                    c499731.L$0 = obj;
                    return c499731;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                    return ((C499731) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, this.$isVisible, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268431359, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499731(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2 */
    static final class C156252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Optional<Account>> $accountFlow;
        final /* synthetic */ Flow<Boolean> $accountSwitchVisibleFlow;
        final /* synthetic */ Flow<Instrument> $instrumentFlow;
        final /* synthetic */ Flow<UUID> $instrumentIdFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C156252(Flow<? extends Optional<Account>> flow, Flow<UUID> flow2, Flow<Instrument> flow3, Flow<Boolean> flow4, Continuation<? super C156252> continuation) {
            super(2, continuation);
            this.$accountFlow = flow;
            this.$instrumentIdFlow = flow2;
            this.$instrumentFlow = flow3;
            this.$accountSwitchVisibleFlow = flow4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C156252 c156252 = InstrumentDetailTradeBarDuxo.this.new C156252(this.$accountFlow, this.$instrumentIdFlow, this.$instrumentFlow, this.$accountSwitchVisibleFlow, continuation);
            c156252.L$0 = obj;
            return c156252;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {596}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object next;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.subzeroFtuxSeenCountPref.get() < 2) {
                        UXFlagsService uxFlagsService = this.this$0.getUxFlagsService();
                        GetUXFlagsRequestDto getUXFlagsRequestDto = new GetUXFlagsRequestDto((List<? extends UXFlagNameDto>) CollectionsKt.listOf(UXFlagNameDto.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE));
                        this.label = 1;
                        obj = uxFlagsService.GetUXFlags(getUXFlagsRequestDto, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Iterator<T> it = ((GetUXFlagsResponseDto) obj).getResults().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((UXFlagDto) next).getName() == UXFlagNameDto.EQUITY_SHORT_SELLING_NEW_USER_EXPERIENCE) {
                        break;
                    }
                }
                UXFlagDto uXFlagDto = (UXFlagDto) next;
                if (Boolean.parseBoolean(uXFlagDto != null ? uXFlagDto.getValue() : null)) {
                    this.this$0.subzeroFtuxSeenCountPref.set(2);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$accountFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.$accountFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.$accountFlow, this.$instrumentIdFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(this.$accountFlow, this.$instrumentFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(this.$accountFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(this.$instrumentFlow, this.$accountFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(this.$accountFlow, this.$instrumentIdFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(this.$instrumentIdFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(this.$instrumentFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass13(this.$instrumentIdFlow, this.$accountSwitchVisibleFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass14(this.$instrumentFlow, InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass15(InstrumentDetailTradeBarDuxo.this, this.$instrumentIdFlow, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass16(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass17(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass18(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass19(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass20(InstrumentDetailTradeBarDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {611}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Flow<? extends Optional<Account>> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$accountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Optional<? extends Account>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Account> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<Account>) optional, continuation);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$2$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499771 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499771(Account account, Continuation<? super C499771> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499771 c499771 = new C499771(this.$account, continuation);
                        c499771.L$0 = obj;
                        return c499771;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((C499771) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, this.$account, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435451, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499771((Account) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Optional<Account>> flow = this.$accountFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {619}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getAccountProvider().streamAllAccounts()), Integer.MAX_VALUE, null, 2, null);
                    final InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo.onCreate.2.3.1

                        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$3$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$3$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C499791 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                            final /* synthetic */ List<Account> $allAccounts;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C499791(List<Account> list, Continuation<? super C499791> continuation) {
                                super(2, continuation);
                                this.$allAccounts = list;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C499791 c499791 = new C499791(this.$allAccounts, continuation);
                                c499791.L$0 = obj;
                                return c499791;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                                return ((C499791) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, this.$allAccounts, null, false, false, false, false, false, null, null, null, false, null, false, 268402687, null);
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<Account>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<Account> list, Continuation<? super Unit> continuation) {
                            instrumentDetailTradeBarDuxo.applyMutation(new C499791(list, null));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowBuffer$default.collect(flowCollector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {632}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(Flow<? extends Optional<Account>> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$accountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(this.$accountFlow, new C15610xf013f690(null, this.this$0)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasPositions", "", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ Boolean $hasPositions;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Boolean bool, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$hasPositions = bool;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$hasPositions, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) this.L$0;
                        Boolean bool = this.$hasPositions;
                        Intrinsics.checkNotNull(bool);
                        return InstrumentDetailTradeBarViewState.copy$default(instrumentDetailTradeBarViewState, null, null, null, null, null, null, null, bool.booleanValue(), null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435327, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Boolean) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {652}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            final /* synthetic */ Flow<UUID> $instrumentIdFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass5(Flow<? extends Optional<Account>> flow, Flow<UUID> flow2, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.$instrumentIdFlow = flow2;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$accountFlow, this.$instrumentIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(this.$accountFlow, this.$instrumentIdFlow, new AnonymousClass1(null)), new C15611x4731e76f(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "account", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;", "instrumentId"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Optional<? extends Account>, UUID, Continuation<? super Tuples2<? extends String, ? extends UUID>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Account> optional, UUID uuid, Continuation<? super Tuples2<String, UUID>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = optional;
                    anonymousClass1.L$1 = uuid;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, UUID uuid, Continuation<? super Tuples2<? extends String, ? extends UUID>> continuation) {
                    return invoke2((Optional<Account>) optional, uuid, (Continuation<? super Tuples2<String, UUID>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Optional optional = (Optional) this.L$0;
                    UUID uuid = (UUID) this.L$1;
                    Account account = (Account) optional.getOrNull();
                    return Tuples4.m3642to(account != null ? account.getAccountNumber() : null, uuid);
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "position", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Position, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Position position, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(position, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5$3$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$5$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ Position $position;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Position position, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$position = position;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, this.$position, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435199, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Position) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {669}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass6(Flow<? extends Optional<Account>> flow, Flow<Instrument> flow2, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.$instrumentFlow = flow2;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$accountFlow, this.$instrumentFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDebounce = FlowKt.debounce(FlowKt.transformLatest(FlowKt.combine(this.$accountFlow, this.$instrumentFlow, new AnonymousClass1(this.this$0, null)), new C15612x9e4fd84e(null)), 200L);
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDebounce, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/common/buysell/BuySellData;", "account", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Optional<? extends Account>, Instrument, Continuation<? super Flow<? extends BuySellData>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Account> optional, Instrument instrument, Continuation<? super Flow<BuySellData>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = optional;
                    anonymousClass1.L$1 = instrument;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, Instrument instrument, Continuation<? super Flow<? extends BuySellData>> continuation) {
                    return invoke2((Optional<Account>) optional, instrument, (Continuation<? super Flow<BuySellData>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Optional optional = (Optional) this.L$0;
                    Instrument instrument = (Instrument) this.L$1;
                    BuySellStore buySellStore = this.this$0.getBuySellStore();
                    UUID id = instrument.getId();
                    Account account = (Account) optional.getOrNull();
                    return buySellStore.getBuySellData(id, account != null ? account.getAccountNumber() : null);
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<BuySellData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BuySellData buySellData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(buySellData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6$3$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$6$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ BuySellData $buySellData;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(BuySellData buySellData, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$buySellData = buySellData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$buySellData, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, this.$buySellData, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435447, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((BuySellData) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {687}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass7(Flow<? extends Optional<Account>> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$accountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Optional<Account>> flow = this.$accountFlow;
                    Flow flowOnStart = FlowKt.onStart(FlowKt.transformLatest(FlowKt.combine(new Flow<Account>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Account> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Object orNull = ((Optional) obj).getOrNull();
                                    if (orNull != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.getExperimentsStore(), new Experiment[]{Experiments.SdpOptionsUpsellAllowNullRiskTolerance.INSTANCE}, false, null, 6, null), new AnonymousClass2(this.this$0, null)), new C15613xf56dc92d(null)), new AnonymousClass4(null));
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOnStart, anonymousClass5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;", "account", "Lcom/robinhood/models/db/Account;", "isInExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<Account, Boolean, Continuation<? super Flow<? extends OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(3, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                public final Object invoke(Account account, boolean z, Continuation<? super Flow<? extends OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp>> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = account;
                    anonymousClass2.Z$0 = z;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Account account, Boolean bool, Continuation<? super Flow<? extends OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp>> continuation) {
                    return invoke(account, bool.booleanValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return this.this$0.getOptionUpgradePromotionStore().streamShouldShowOptionsUpgradeOnSdp(((Account) this.L$0).getAccountNumber(), this.Z$0 ? boxing.boxBoolean(true) : null);
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$4", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {686}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<FlowCollector<? super OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp>, Continuation<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(FlowCollector<? super OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp> flowCollector, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp = OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp.CLIENT_DEFAULT;
                        this.label = 1;
                        if (flowCollector.emit(showOptionsUpgradeOnSdp, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "shouldShowOptionsTradeButton", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore$ShowOptionsUpgradeOnSdp;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$5", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$5, reason: invalid class name */
            static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.this$0, continuation);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass5) create(showOptionsUpgradeOnSdp, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$5$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$7$5$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp $shouldShowOptionsTradeButton;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp showOptionsUpgradeOnSdp, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$shouldShowOptionsTradeButton = showOptionsUpgradeOnSdp;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$shouldShowOptionsTradeButton, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, this.$shouldShowOptionsTradeButton, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435423, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((OptionUpgradePromotionStore.ShowOptionsUpgradeOnSdp) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {707}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass8(Flow<Instrument> flow, Flow<? extends Optional<Account>> flow2, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.$accountFlow = flow2;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$instrumentFlow, this.$accountFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(this.$instrumentFlow, this.$accountFlow, new AnonymousClass1(this.this$0, null)), new C15615x4c8bba0c(null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionChain;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<destruct>", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Instrument, Optional<? extends Account>, Continuation<? super Flow<? extends Optional<? extends UiOptionChain>>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Instrument instrument, Optional<Account> optional, Continuation<? super Flow<? extends Optional<UiOptionChain>>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = instrument;
                    anonymousClass1.L$1 = optional;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Instrument instrument, Optional<? extends Account> optional, Continuation<? super Flow<? extends Optional<? extends UiOptionChain>>> continuation) {
                    return invoke2(instrument, (Optional<Account>) optional, (Continuation<? super Flow<? extends Optional<UiOptionChain>>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    String accountNumber;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Instrument instrument = (Instrument) this.L$0;
                    Account account = (Account) ((Optional) this.L$1).component1();
                    UUID tradableChainId = instrument.getTradableChainId();
                    if (tradableChainId != null) {
                        InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo = this.this$0;
                        if (account != null && (accountNumber = account.getAccountNumber()) != null) {
                            instrumentDetailTradeBarDuxo.getOptionPositionStore().refresh(false, tradableChainId, accountNumber);
                        }
                        Flow flowOnStart = FlowKt.onStart(Operators.toOptionals(instrumentDetailTradeBarDuxo.getOptionChainStore().getStreamUiOptionChain().asFlow(tradableChainId)), new InstrumentDetailTradeBarDuxo2(null));
                        if (flowOnStart != null) {
                            return flowOnStart;
                        }
                    }
                    return FlowKt.flowOf(Optional2.INSTANCE);
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiOptionChain;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends UiOptionChain>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<UiOptionChain> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends UiOptionChain> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<UiOptionChain>) optional, continuation);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$3$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$8$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ UiOptionChain $optionChain;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(UiOptionChain uiOptionChain, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$optionChain = uiOptionChain;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionChain, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) this.L$0;
                        UiOptionChain uiOptionChain = this.$optionChain;
                        return InstrumentDetailTradeBarViewState.copy$default(instrumentDetailTradeBarViewState, null, null, null, null, uiOptionChain != null ? uiOptionChain.getOptionChain() : null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435439, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((UiOptionChain) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {730}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Optional<Account>> $accountFlow;
            final /* synthetic */ Flow<UUID> $instrumentIdFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass9(Flow<? extends Optional<Account>> flow, Flow<UUID> flow2, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$accountFlow = flow;
                this.$instrumentIdFlow = flow2;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$accountFlow, this.$instrumentIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.combine(this.$accountFlow, this.$instrumentIdFlow, new AnonymousClass1(this.this$0, null)), new C15616xa3a9aaeb(null));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "accountOptional", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Account;", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function3<Optional<? extends Account>, UUID, Continuation<? super Flow<? extends List<? extends UiOptionInstrumentPosition>>>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(3, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<Account> optional, UUID uuid, Continuation<? super Flow<? extends List<UiOptionInstrumentPosition>>> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = optional;
                    anonymousClass1.L$1 = uuid;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends Account> optional, UUID uuid, Continuation<? super Flow<? extends List<? extends UiOptionInstrumentPosition>>> continuation) {
                    return invoke2((Optional<Account>) optional, uuid, (Continuation<? super Flow<? extends List<UiOptionInstrumentPosition>>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Flow<List<UiOptionInstrumentPosition>> flowEmptyFlow;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Optional optional = (Optional) this.L$0;
                    UUID uuid = (UUID) this.L$1;
                    Account account = (Account) optional.getOrNull();
                    if (account == null || (flowEmptyFlow = this.this$0.getOptionPositionStore().getUiOptionPositionsForEquityInstrument(account.getAccountNumber(), uuid)) == null) {
                        flowEmptyFlow = FlowKt.emptyFlow();
                    }
                    return FlowKt.onStart(flowEmptyFlow, new C499801(null));
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {728}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499801 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends UiOptionInstrumentPosition>>, Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    int label;

                    C499801(Continuation<? super C499801> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499801 c499801 = new C499801(continuation);
                        c499801.L$0 = obj;
                        return c499801;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends UiOptionInstrumentPosition>> flowCollector, Continuation<? super Unit> continuation) {
                        return invoke2((FlowCollector<? super List<UiOptionInstrumentPosition>>) flowCollector, continuation);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(FlowCollector<? super List<UiOptionInstrumentPosition>> flowCollector, Continuation<? super Unit> continuation) {
                        return ((C499801) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            List listEmptyList = CollectionsKt.emptyList();
                            this.label = 1;
                            if (flowCollector.emit(listEmptyList, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionPositions", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<List<? extends UiOptionInstrumentPosition>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends UiOptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<UiOptionInstrumentPosition>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<UiOptionInstrumentPosition> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$3$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$9$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ List<UiOptionInstrumentPosition> $optionPositions;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(List<UiOptionInstrumentPosition> list, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$optionPositions = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$optionPositions, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, this.$optionPositions, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, false, 268435391, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$10", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {740}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $instrumentIdFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(Flow<UUID> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$instrumentIdFlow = flow;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$instrumentIdFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$instrumentIdFlow, new C15601xe906fb39(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fundamental", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$10$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$10$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Fundamental, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Fundamental fundamental, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(fundamental, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$10$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$10$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ Fundamental $fundamental;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(Fundamental fundamental, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$fundamental = fundamental;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fundamental, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, this.$fundamental.getVolume(), null, false, null, false, 260046847, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((Fundamental) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {757}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(Flow<Instrument> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.$instrumentFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Instrument> flow = this.$instrumentFlow;
                    final Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Instrument>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Instrument> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$filter$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (((Instrument) obj).isIpoAccess()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, new C15603x4024ec18(null, this.this$0));
                    Flow<Optional<? extends StockDetailTradeBar>> flow2 = new Flow<Optional<? extends StockDetailTradeBar>>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Optional<? extends StockDetailTradeBar>> flowCollector, Continuation continuation) {
                            Object objCollect = flowTransformLatest.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$map$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                Optional optionalAsOptional;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    UiStockDetail uiStockDetail = (UiStockDetail) obj;
                                    if (uiStockDetail instanceof UiStockDetail.IpoAccess) {
                                        optionalAsOptional = Optional3.asOptional(((UiStockDetail.IpoAccess) uiStockDetail).getTradeBar());
                                    } else {
                                        if (!(uiStockDetail instanceof UiStockDetail.Empty)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        optionalAsOptional = Optional2.INSTANCE;
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow2, anonymousClass4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/StockDetailTradeBar;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$4", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$4, reason: invalid class name */
            static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Optional<? extends StockDetailTradeBar>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Optional<StockDetailTradeBar> optional, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass4) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Optional<? extends StockDetailTradeBar> optional, Continuation<? super Unit> continuation) {
                    return invoke2((Optional<StockDetailTradeBar>) optional, continuation);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$4$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$11$4$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ StockDetailTradeBar $stockDetailTradeBar;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(StockDetailTradeBar stockDetailTradeBar, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$stockDetailTradeBar = stockDetailTradeBar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stockDetailTradeBar, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, this.$stockDetailTradeBar, false, null, false, 251658239, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((StockDetailTradeBar) ((Optional) this.L$0).component1(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {767}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<InstrumentDetailTradeBarViewState> stateFlow = this.this$0.getStateFlow();
                    Flow flowTake = FlowKt.take(new Flow<InstrumentDetailTradeBarViewState>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super InstrumentDetailTradeBarViewState> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12$invokeSuspend$$inlined$filter$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState = (InstrumentDetailTradeBarViewState) obj;
                                    if (instrumentDetailTradeBarViewState.getOptionsEnabled() && !instrumentDetailTradeBarViewState.getHasAccessToOptions() && instrumentDetailTradeBarViewState.getIgnoreOptionsAccess()) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, 1);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$12$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.logUpgradeHookButtonAppearEvent();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$13", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {778}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$13, reason: invalid class name */
        static final class AnonymousClass13 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $accountSwitchVisibleFlow;
            final /* synthetic */ Flow<UUID> $instrumentIdFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass13(Flow<UUID> flow, Flow<Boolean> flow2, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.$instrumentIdFlow = flow;
                this.$accountSwitchVisibleFlow = flow2;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.$instrumentIdFlow, this.$accountSwitchVisibleFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(this.$instrumentIdFlow, this.$accountSwitchVisibleFlow, null, 2, null), new C15606xee60cdd6(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrumentAccountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$13$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$13$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InstrumentAccountSwitcher, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentAccountSwitcher instrumentAccountSwitcher, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(instrumentAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$13$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$13$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ InstrumentAccountSwitcher $instrumentAccountSwitcher;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(InstrumentAccountSwitcher instrumentAccountSwitcher, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$instrumentAccountSwitcher = instrumentAccountSwitcher;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrumentAccountSwitcher, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, this.$instrumentAccountSwitcher, null, null, false, false, false, false, false, null, null, null, false, null, false, 268419071, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((InstrumentAccountSwitcher) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$14", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {790}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$14, reason: invalid class name */
        static final class AnonymousClass14 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Instrument> $instrumentFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass14(Flow<Instrument> flow, InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.$instrumentFlow = flow;
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.$instrumentFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$instrumentFlow, new C15607x457ebeb5(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "priceBookExistence", "Lcom/robinhood/models/ui/PriceBookExistence;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$14$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$14$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PriceBookExistence, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PriceBookExistence priceBookExistence, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(priceBookExistence, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$14$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$14$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ PriceBookExistence $priceBookExistence;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PriceBookExistence priceBookExistence, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$priceBookExistence = priceBookExistence;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$priceBookExistence, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, this.$priceBookExistence.getExists(), null, null, null, false, null, false, 266338303, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((PriceBookExistence) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {803}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15, reason: invalid class name */
        static final class AnonymousClass15 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<UUID> $instrumentIdFlow;
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass15(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Flow<UUID> flow, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
                this.$instrumentIdFlow = flow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, this.$instrumentIdFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountSwitcherRefreshSubject), Integer.MAX_VALUE, null, 2, null);
                    final Flow<UUID> flow = this.$instrumentIdFlow;
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(new Flow<UUID>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, flow), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ Flow $instrumentIdFlow$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$invokeSuspend$$inlined$map$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {51, 50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, Flow flow) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$instrumentIdFlow$inlined = flow;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
                            
                                if (r7.emit(r8, r0) == r1) goto L22;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                FlowCollector flowCollector;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                    Flow flow = this.$instrumentIdFlow$inlined;
                                    anonymousClass1.L$0 = flowCollector2;
                                    anonymousClass1.label = 1;
                                    Object objFirstOrNull = FlowKt.firstOrNull(flow, anonymousClass1);
                                    if (objFirstOrNull != coroutine_suspended) {
                                        obj2 = objFirstOrNull;
                                        flowCollector = flowCollector2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                    return Unit.INSTANCE;
                                }
                                FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                                ResultKt.throwOnFailure(obj2);
                                flowCollector = flowCollector3;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                    }), new C15608x9c9caf94(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherRefreshState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$3", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<InstrumentAccountSwitcherStore2, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InstrumentAccountSwitcherStore2 instrumentAccountSwitcherStore2, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(instrumentAccountSwitcherStore2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$3$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$15$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ InstrumentAccountSwitcherStore2 $state;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(InstrumentAccountSwitcherStore2 instrumentAccountSwitcherStore2, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$state = instrumentAccountSwitcherStore2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((InstrumentDetailTradeBarViewState) this.L$0).mutateAccountSwitcherRefreshState(this.$state);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((InstrumentAccountSwitcherStore2) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$16", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {813}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$16, reason: invalid class name */
        static final class AnonymousClass16 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass16(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, OptionsRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isOptionsRegionSupported", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$16$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$16$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$16$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$16$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499741 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ boolean $isOptionsRegionSupported;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499741(boolean z, Continuation<? super C499741> continuation) {
                        super(2, continuation);
                        this.$isOptionsRegionSupported = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499741 c499741 = new C499741(this.$isOptionsRegionSupported, continuation);
                        c499741.L$0 = obj;
                        return c499741;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((C499741) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, this.$isOptionsRegionSupported, false, false, false, null, null, null, false, null, false, 268173311, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499741(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {830}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17, reason: invalid class name */
        static final class AnonymousClass17 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass17(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass17(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.combine(ExperimentsProvider.DefaultImpls.coStreamVariant$default(this.this$0.getExperimentsStore(), EquityTradeLadderExperiment.INSTANCE, EquityTradeLadderExperiment.Variants.CONTROL, false, 4, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.getExperimentsStore(), new Experiment[]{EquityTradeLadderExperiment2.INSTANCE}, false, null, 6, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.getExperimentsStore(), new Experiment[]{EquityTradeLadderKillswitchExperiment.INSTANCE}, false, null, 6, null), new AnonymousClass1(null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/equities/contracts/tradeladder/EquityTradeLadderExperiment$Variants;", "internationalEnabled", "killswitch"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function4<EquityTradeLadderExperiment.Variants, Boolean, Boolean, Continuation<? super Boolean>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ boolean Z$0;
                /* synthetic */ boolean Z$1;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(4, continuation);
                }

                public final Object invoke(EquityTradeLadderExperiment.Variants variants, boolean z, boolean z2, Continuation<? super Boolean> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = variants;
                    anonymousClass1.Z$0 = z;
                    anonymousClass1.Z$1 = z2;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(EquityTradeLadderExperiment.Variants variants, Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
                    return invoke(variants, bool.booleanValue(), bool2.booleanValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return boxing.boxBoolean((EquityTradeLadderExperiment.INSTANCE.isEnabled((EquityTradeLadderExperiment.Variants) this.L$0) || this.Z$0) && !this.Z$1);
                }
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "ladderEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17$2$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$17$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ boolean $ladderEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$ladderEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ladderEnabled, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((AnonymousClass1) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, this.$ladderEnabled, false, false, null, null, null, false, null, false, 267911167, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$18", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {845}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$18, reason: invalid class name */
        static final class AnonymousClass18 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass18(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(ExperimentsKt.streamWithExperiment(this.this$0.regionGateProvider, this.this$0.getExperimentsStore(), SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, true)), Integer.MAX_VALUE, null, 2, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$18$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$18$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$18$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$18$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499751 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ boolean $isEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499751(boolean z, Continuation<? super C499751> continuation) {
                        super(2, continuation);
                        this.$isEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499751 c499751 = new C499751(this.$isEnabled, continuation);
                        c499751.L$0 = obj;
                        return c499751;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((C499751) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, this.$isEnabled, false, null, null, null, false, null, false, 267386879, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499751(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$19", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {856}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$19, reason: invalid class name */
        static final class AnonymousClass19 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass19(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass19(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.this$0.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null)), Integer.MAX_VALUE, null, 2, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$19$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$19$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$19$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499761 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ boolean $isEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499761(boolean z, Continuation<? super C499761> continuation) {
                        super(2, continuation);
                        this.$isEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499761 c499761 = new C499761(this.$isEnabled, continuation);
                        c499761.L$0 = obj;
                        return c499761;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((C499761) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, this.$isEnabled, null, false, 234881023, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499761(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: InstrumentDetailTradeBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$20", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {866}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$20, reason: invalid class name */
        static final class AnonymousClass20 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass20(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = instrumentDetailTradeBarDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.this$0.getExperimentsStore(), new Experiment[]{TradeEquitiesSduiAccountSwitcherExperiment.INSTANCE}, false, null, 6, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: InstrumentDetailTradeBarDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "useSduiAccountSwitcher", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$20$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$20$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ InstrumentDetailTradeBarDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = instrumentDetailTradeBarDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: InstrumentDetailTradeBarDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$20$1$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$onCreate$2$20$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499781 extends ContinuationImpl7 implements Function2<InstrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState>, Object> {
                    final /* synthetic */ boolean $useSduiAccountSwitcher;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499781(boolean z, Continuation<? super C499781> continuation) {
                        super(2, continuation);
                        this.$useSduiAccountSwitcher = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499781 c499781 = new C499781(this.$useSduiAccountSwitcher, continuation);
                        c499781.L$0 = obj;
                        return c499781;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InstrumentDetailTradeBarViewState instrumentDetailTradeBarViewState, Continuation<? super InstrumentDetailTradeBarViewState> continuation) {
                        return ((C499781) create(instrumentDetailTradeBarViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return InstrumentDetailTradeBarViewState.copy$default((InstrumentDetailTradeBarViewState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, false, false, null, null, null, false, false, false, false, false, null, null, null, false, null, this.$useSduiAccountSwitcher, 134217727, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499781(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<Long> observableTimer = Observable.timer(1L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTimer, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentDetailTradeBarDuxo.onStart$lambda$7(this.f$0, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(InstrumentDetailTradeBarDuxo instrumentDetailTradeBarDuxo, Long l) {
        instrumentDetailTradeBarDuxo.logTradeBarAppearance();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logTradeButtonClick() {
        if (getTradingTrendsDetailsLogging().getDetailsOpen()) {
            getTradingTrendsDetailsLogging().logTradeBarTap();
        } else {
            if (getHasVisitedEquityTradeFlowPref().get()) {
                return;
            }
            getHasVisitedEquityTradeFlowPref().set(true);
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C156221(null), 3, null);
        }
    }

    /* compiled from: InstrumentDetailTradeBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeButtonClick$1", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {895}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeButtonClick$1 */
    static final class C156221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156221(Continuation<? super C156221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InstrumentDetailTradeBarDuxo.this.new C156221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<InstrumentDetailTradeBarViewState> stateFlow = InstrumentDetailTradeBarDuxo.this.getStateFlow();
                Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeButtonClick$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeButtonClick$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeButtonClick$1$invokeSuspend$$inlined$map$1$2", m3645f = "InstrumentDetailTradeBarDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarDuxo$logTradeButtonClick$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Boolean boolBoxBoolean = boxing.boxBoolean(((InstrumentDetailTradeBarViewState) obj).getHasPositions());
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                this.label = 1;
                obj = FlowKt.first(flow, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                InstrumentDetailTradeBarDuxo.this.getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_FIRST_EQUITY_TRADE_ATTEMPT);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logActionButtonAppearances(Instrument instrument, boolean buyEnabled, boolean buyToCloseEnabled, boolean optionsEnabled, boolean sellEnabled, boolean shortEnabled) {
        TradeButtonLogger.logButtonAppearances(this.analytics, instrument, buyEnabled, buyToCloseEnabled, optionsEnabled, sellEnabled, shortEnabled);
    }
}
