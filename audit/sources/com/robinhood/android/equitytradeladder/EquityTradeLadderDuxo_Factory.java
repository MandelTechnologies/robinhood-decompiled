package com.robinhood.android.equitytradeladder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.equities.equityupsell.EquityUpsellService;
import com.robinhood.android.equities.ladderftux.EquityTradeLadderFtuxManager;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equitytradeladder.bin.EquityTradeLadderBinManager;
import com.robinhood.android.equitytradeladder.marketsession.StreamMarketSessionChangeStateUseCase;
import com.robinhood.android.equitytradeladder.prefs.EquityPostTradeLadderFtuxState;
import com.robinhood.android.equitytradeladder.provider.LadderNuxScreenProvider;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.store.subzero.SubzeroOnboardingHandler;
import com.robinhood.websocket.p413md.MdWebsocketSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: EquityTradeLadderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GB¶\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\u0017\u0010#\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\b\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0003\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0003\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0003\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0002H\u0016¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010FR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010FR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010FR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010FR%\u0010#\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\b\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010FR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010FR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010FR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010FR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010FR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010FR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010FR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010FR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010FR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010FR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010FR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010FR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010FR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010F¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountSwitcherStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "equityTradeService", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;", "equityTradeLadderBinManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "ladderFtuxManager", "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "ladderNuxScreenProvider", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/websocket/md/MdWebsocketSource;", "mdWebsocketSource", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "streamMarketSessionChangeState", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "buySellStore", "", "skipWebsocketFallback", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "subzeroOnboardingHandler", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "equityUpsellService", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradeLadderDuxo_Factory implements Factory<EquityTradeLadderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InstrumentAccountSwitcherStore> accountSwitcherStore;
    private final Provider<BuySellStore> buySellStore;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityTradeLadderBinManager> equityTradeLadderBinManager;
    private final Provider<EquityTradeService> equityTradeService;
    private final Provider<EquityUpsellService> equityUpsellService;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<EquityTradeLadderFtuxManager> ladderFtuxManager;
    private final Provider<LadderNuxScreenProvider> ladderNuxScreenProvider;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MdWebsocketSource> mdWebsocketSource;
    private final Provider<NbboSummaryStore> nbboSummaryStore;
    private final Provider<OrderStore> orderStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<PositionStore> positionStore;
    private final Provider<EnumPreference<EquityPostTradeLadderFtuxState>> postTradeLadderFtuxStatePref;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ShortingInfoStore> shortingInfoStore;
    private final Provider<Boolean> skipWebsocketFallback;
    private final Provider<EquityTradeLadderStateProvider> stateProvider;
    private final Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeState;
    private final Provider<SubzeroOnboardingHandler> subzeroOnboardingHandler;
    private final Provider<TradeSettingsStore> tradeSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityTradeLadderDuxo_Factory create(Provider<InstrumentAccountSwitcherStore> provider, Provider<AccountProvider> provider2, Provider<Clock> provider3, Provider<EquityTradeService> provider4, Provider<EquityTradeLadderBinManager> provider5, Provider<ExperimentsStore> provider6, Provider<InstrumentBuyingPowerStore> provider7, Provider<InstrumentStore> provider8, Provider<EquityTradeLadderFtuxManager> provider9, Provider<LadderNuxScreenProvider> provider10, Provider<TraderMarketHoursManager> provider11, Provider<MdWebsocketSource> provider12, Provider<NbboSummaryStore> provider13, Provider<OrderStore> provider14, Provider<EnumPreference<EquityPostTradeLadderFtuxState>> provider15, Provider<PositionStore> provider16, Provider<QuoteStore> provider17, Provider<RegionGateProvider> provider18, Provider<StreamMarketSessionChangeStateUseCase> provider19, Provider<TradeSettingsStore> provider20, Provider<BuySellStore> provider21, Provider<Boolean> provider22, Provider<ShortingInfoStore> provider23, Provider<SubzeroOnboardingHandler> provider24, Provider<EventLogger> provider25, Provider<EquityUpsellService> provider26, Provider<PerformanceLogger> provider27, Provider<DuxoBundle> provider28, Provider<EquityTradeLadderStateProvider> provider29, Provider<SavedStateHandle> provider30) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30);
    }

    @JvmStatic
    public static final EquityTradeLadderDuxo newInstance(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, AccountProvider accountProvider, Clock clock, EquityTradeService equityTradeService, EquityTradeLadderBinManager equityTradeLadderBinManager, ExperimentsStore experimentsStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, EquityTradeLadderFtuxManager equityTradeLadderFtuxManager, LadderNuxScreenProvider ladderNuxScreenProvider, TraderMarketHoursManager traderMarketHoursManager, MdWebsocketSource mdWebsocketSource, NbboSummaryStore nbboSummaryStore, OrderStore orderStore, EnumPreference<EquityPostTradeLadderFtuxState> enumPreference, PositionStore positionStore, QuoteStore quoteStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase, TradeSettingsStore tradeSettingsStore, BuySellStore buySellStore, boolean z, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EventLogger eventLogger, EquityUpsellService equityUpsellService, PerformanceLogger performanceLogger, DuxoBundle duxoBundle, EquityTradeLadderStateProvider equityTradeLadderStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(instrumentAccountSwitcherStore, accountProvider, clock, equityTradeService, equityTradeLadderBinManager, experimentsStore, instrumentBuyingPowerStore, instrumentStore, equityTradeLadderFtuxManager, ladderNuxScreenProvider, traderMarketHoursManager, mdWebsocketSource, nbboSummaryStore, orderStore, enumPreference, positionStore, quoteStore, regionGateProvider, streamMarketSessionChangeStateUseCase, tradeSettingsStore, buySellStore, z, shortingInfoStore, subzeroOnboardingHandler, eventLogger, equityUpsellService, performanceLogger, duxoBundle, equityTradeLadderStateProvider, savedStateHandle);
    }

    public EquityTradeLadderDuxo_Factory(Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<AccountProvider> accountProvider, Provider<Clock> clock, Provider<EquityTradeService> equityTradeService, Provider<EquityTradeLadderBinManager> equityTradeLadderBinManager, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<InstrumentStore> instrumentStore, Provider<EquityTradeLadderFtuxManager> ladderFtuxManager, Provider<LadderNuxScreenProvider> ladderNuxScreenProvider, Provider<TraderMarketHoursManager> marketHoursManager, Provider<MdWebsocketSource> mdWebsocketSource, Provider<NbboSummaryStore> nbboSummaryStore, Provider<OrderStore> orderStore, Provider<EnumPreference<EquityPostTradeLadderFtuxState>> postTradeLadderFtuxStatePref, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<RegionGateProvider> regionGateProvider, Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeState, Provider<TradeSettingsStore> tradeSettingsStore, Provider<BuySellStore> buySellStore, Provider<Boolean> skipWebsocketFallback, Provider<ShortingInfoStore> shortingInfoStore, Provider<SubzeroOnboardingHandler> subzeroOnboardingHandler, Provider<EventLogger> eventLogger, Provider<EquityUpsellService> equityUpsellService, Provider<PerformanceLogger> performanceLogger, Provider<DuxoBundle> duxoBundle, Provider<EquityTradeLadderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
        Intrinsics.checkNotNullParameter(equityTradeLadderBinManager, "equityTradeLadderBinManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
        Intrinsics.checkNotNullParameter(ladderNuxScreenProvider, "ladderNuxScreenProvider");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(mdWebsocketSource, "mdWebsocketSource");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(skipWebsocketFallback, "skipWebsocketFallback");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountSwitcherStore = accountSwitcherStore;
        this.accountProvider = accountProvider;
        this.clock = clock;
        this.equityTradeService = equityTradeService;
        this.equityTradeLadderBinManager = equityTradeLadderBinManager;
        this.experimentsStore = experimentsStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.instrumentStore = instrumentStore;
        this.ladderFtuxManager = ladderFtuxManager;
        this.ladderNuxScreenProvider = ladderNuxScreenProvider;
        this.marketHoursManager = marketHoursManager;
        this.mdWebsocketSource = mdWebsocketSource;
        this.nbboSummaryStore = nbboSummaryStore;
        this.orderStore = orderStore;
        this.postTradeLadderFtuxStatePref = postTradeLadderFtuxStatePref;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.regionGateProvider = regionGateProvider;
        this.streamMarketSessionChangeState = streamMarketSessionChangeState;
        this.tradeSettingsStore = tradeSettingsStore;
        this.buySellStore = buySellStore;
        this.skipWebsocketFallback = skipWebsocketFallback;
        this.shortingInfoStore = shortingInfoStore;
        this.subzeroOnboardingHandler = subzeroOnboardingHandler;
        this.eventLogger = eventLogger;
        this.equityUpsellService = equityUpsellService;
        this.performanceLogger = performanceLogger;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public EquityTradeLadderDuxo get() {
        Companion companion = INSTANCE;
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.accountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        EquityTradeService equityTradeService = this.equityTradeService.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeService, "get(...)");
        EquityTradeLadderBinManager equityTradeLadderBinManager = this.equityTradeLadderBinManager.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeLadderBinManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        EquityTradeLadderFtuxManager equityTradeLadderFtuxManager = this.ladderFtuxManager.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeLadderFtuxManager, "get(...)");
        LadderNuxScreenProvider ladderNuxScreenProvider = this.ladderNuxScreenProvider.get();
        Intrinsics.checkNotNullExpressionValue(ladderNuxScreenProvider, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        MdWebsocketSource mdWebsocketSource = this.mdWebsocketSource.get();
        Intrinsics.checkNotNullExpressionValue(mdWebsocketSource, "get(...)");
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(nbboSummaryStore, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        OrderStore orderStore2 = orderStore;
        EnumPreference<EquityPostTradeLadderFtuxState> enumPreference = this.postTradeLadderFtuxStatePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        EnumPreference<EquityPostTradeLadderFtuxState> enumPreference2 = enumPreference;
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        PositionStore positionStore2 = positionStore;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        QuoteStore quoteStore2 = quoteStore;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase = this.streamMarketSessionChangeState.get();
        Intrinsics.checkNotNullExpressionValue(streamMarketSessionChangeStateUseCase, "get(...)");
        StreamMarketSessionChangeStateUseCase streamMarketSessionChangeStateUseCase2 = streamMarketSessionChangeStateUseCase;
        TradeSettingsStore tradeSettingsStore = this.tradeSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(tradeSettingsStore, "get(...)");
        TradeSettingsStore tradeSettingsStore2 = tradeSettingsStore;
        BuySellStore buySellStore = this.buySellStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellStore, "get(...)");
        BuySellStore buySellStore2 = buySellStore;
        Boolean bool = this.skipWebsocketFallback.get();
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        boolean zBooleanValue = bool.booleanValue();
        ShortingInfoStore shortingInfoStore = this.shortingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(shortingInfoStore, "get(...)");
        ShortingInfoStore shortingInfoStore2 = shortingInfoStore;
        SubzeroOnboardingHandler subzeroOnboardingHandler = this.subzeroOnboardingHandler.get();
        Intrinsics.checkNotNullExpressionValue(subzeroOnboardingHandler, "get(...)");
        SubzeroOnboardingHandler subzeroOnboardingHandler2 = subzeroOnboardingHandler;
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        EventLogger eventLogger2 = eventLogger;
        EquityUpsellService equityUpsellService = this.equityUpsellService.get();
        Intrinsics.checkNotNullExpressionValue(equityUpsellService, "get(...)");
        EquityUpsellService equityUpsellService2 = equityUpsellService;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        EquityTradeLadderStateProvider equityTradeLadderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(equityTradeLadderStateProvider, "get(...)");
        EquityTradeLadderStateProvider equityTradeLadderStateProvider2 = equityTradeLadderStateProvider;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(instrumentAccountSwitcherStore, accountProvider, clock, equityTradeService, equityTradeLadderBinManager, experimentsStore, instrumentBuyingPowerStore, instrumentStore, equityTradeLadderFtuxManager, ladderNuxScreenProvider, traderMarketHoursManager, mdWebsocketSource, nbboSummaryStore, orderStore2, enumPreference2, positionStore2, quoteStore2, regionGateProvider2, streamMarketSessionChangeStateUseCase2, tradeSettingsStore2, buySellStore2, zBooleanValue, shortingInfoStore2, subzeroOnboardingHandler2, eventLogger2, equityUpsellService2, performanceLogger2, duxoBundle2, equityTradeLadderStateProvider2, savedStateHandle);
    }

    /* compiled from: EquityTradeLadderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¾\u0003\u0010D\u001a\u00020C2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\u0017\u0010$\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\"0!¢\u0006\u0002\b#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0004H\u0007¢\u0006\u0004\bD\u0010EJ\u008a\u0002\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\"0!¢\u0006\u0002\b#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bG\u0010H¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountSwitcherStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/equities/equitytrade/EquityTradeService;", "equityTradeService", "Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;", "equityTradeLadderBinManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;", "ladderFtuxManager", "Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;", "ladderNuxScreenProvider", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/websocket/md/MdWebsocketSource;", "mdWebsocketSource", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/android/equitytradeladder/prefs/EquityPostTradeLadderFtuxState;", "Lkotlin/jvm/JvmSuppressWildcards;", "postTradeLadderFtuxStatePref", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;", "streamMarketSessionChangeState", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "buySellStore", "", "skipWebsocketFallback", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;", "subzeroOnboardingHandler", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;", "equityUpsellService", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo_Factory;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/android/lib/account/AccountProvider;Lj$/time/Clock;Lcom/robinhood/android/equities/equitytrade/EquityTradeService;Lcom/robinhood/android/equitytradeladder/bin/EquityTradeLadderBinManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/equities/ladderftux/EquityTradeLadderFtuxManager;Lcom/robinhood/android/equitytradeladder/provider/LadderNuxScreenProvider;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/websocket/md/MdWebsocketSource;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/equitytradeladder/marketsession/StreamMarketSessionChangeStateUseCase;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lcom/robinhood/android/common/buysell/BuySellStore;ZLcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/shared/equities/store/subzero/SubzeroOnboardingHandler;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/equities/equityupsell/EquityUpsellService;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equitytradeladder/EquityTradeLadderStateProvider;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDuxo;", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityTradeLadderDuxo_Factory create(Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<AccountProvider> accountProvider, Provider<Clock> clock, Provider<EquityTradeService> equityTradeService, Provider<EquityTradeLadderBinManager> equityTradeLadderBinManager, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<InstrumentStore> instrumentStore, Provider<EquityTradeLadderFtuxManager> ladderFtuxManager, Provider<LadderNuxScreenProvider> ladderNuxScreenProvider, Provider<TraderMarketHoursManager> marketHoursManager, Provider<MdWebsocketSource> mdWebsocketSource, Provider<NbboSummaryStore> nbboSummaryStore, Provider<OrderStore> orderStore, Provider<EnumPreference<EquityPostTradeLadderFtuxState>> postTradeLadderFtuxStatePref, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<RegionGateProvider> regionGateProvider, Provider<StreamMarketSessionChangeStateUseCase> streamMarketSessionChangeState, Provider<TradeSettingsStore> tradeSettingsStore, Provider<BuySellStore> buySellStore, Provider<Boolean> skipWebsocketFallback, Provider<ShortingInfoStore> shortingInfoStore, Provider<SubzeroOnboardingHandler> subzeroOnboardingHandler, Provider<EventLogger> eventLogger, Provider<EquityUpsellService> equityUpsellService, Provider<PerformanceLogger> performanceLogger, Provider<DuxoBundle> duxoBundle, Provider<EquityTradeLadderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
            Intrinsics.checkNotNullParameter(equityTradeLadderBinManager, "equityTradeLadderBinManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
            Intrinsics.checkNotNullParameter(ladderNuxScreenProvider, "ladderNuxScreenProvider");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(mdWebsocketSource, "mdWebsocketSource");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(skipWebsocketFallback, "skipWebsocketFallback");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EquityTradeLadderDuxo_Factory(accountSwitcherStore, accountProvider, clock, equityTradeService, equityTradeLadderBinManager, experimentsStore, instrumentBuyingPowerStore, instrumentStore, ladderFtuxManager, ladderNuxScreenProvider, marketHoursManager, mdWebsocketSource, nbboSummaryStore, orderStore, postTradeLadderFtuxStatePref, positionStore, quoteStore, regionGateProvider, streamMarketSessionChangeState, tradeSettingsStore, buySellStore, skipWebsocketFallback, shortingInfoStore, subzeroOnboardingHandler, eventLogger, equityUpsellService, performanceLogger, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final EquityTradeLadderDuxo newInstance(InstrumentAccountSwitcherStore accountSwitcherStore, AccountProvider accountProvider, Clock clock, EquityTradeService equityTradeService, EquityTradeLadderBinManager equityTradeLadderBinManager, ExperimentsStore experimentsStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, InstrumentStore instrumentStore, EquityTradeLadderFtuxManager ladderFtuxManager, LadderNuxScreenProvider ladderNuxScreenProvider, TraderMarketHoursManager marketHoursManager, MdWebsocketSource mdWebsocketSource, NbboSummaryStore nbboSummaryStore, OrderStore orderStore, EnumPreference<EquityPostTradeLadderFtuxState> postTradeLadderFtuxStatePref, PositionStore positionStore, QuoteStore quoteStore, RegionGateProvider regionGateProvider, StreamMarketSessionChangeStateUseCase streamMarketSessionChangeState, TradeSettingsStore tradeSettingsStore, BuySellStore buySellStore, boolean skipWebsocketFallback, ShortingInfoStore shortingInfoStore, SubzeroOnboardingHandler subzeroOnboardingHandler, EventLogger eventLogger, EquityUpsellService equityUpsellService, PerformanceLogger performanceLogger, DuxoBundle duxoBundle, EquityTradeLadderStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(equityTradeService, "equityTradeService");
            Intrinsics.checkNotNullParameter(equityTradeLadderBinManager, "equityTradeLadderBinManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(ladderFtuxManager, "ladderFtuxManager");
            Intrinsics.checkNotNullParameter(ladderNuxScreenProvider, "ladderNuxScreenProvider");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(mdWebsocketSource, "mdWebsocketSource");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(postTradeLadderFtuxStatePref, "postTradeLadderFtuxStatePref");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(streamMarketSessionChangeState, "streamMarketSessionChangeState");
            Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
            Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(subzeroOnboardingHandler, "subzeroOnboardingHandler");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(equityUpsellService, "equityUpsellService");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EquityTradeLadderDuxo(accountSwitcherStore, accountProvider, clock, equityTradeService, equityTradeLadderBinManager, experimentsStore, instrumentBuyingPowerStore, instrumentStore, ladderFtuxManager, ladderNuxScreenProvider, marketHoursManager, mdWebsocketSource, nbboSummaryStore, orderStore, postTradeLadderFtuxStatePref, positionStore, quoteStore, regionGateProvider, streamMarketSessionChangeState, tradeSettingsStore, buySellStore, skipWebsocketFallback, shortingInfoStore, subzeroOnboardingHandler, eventLogger, equityUpsellService, performanceLogger, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
