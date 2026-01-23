package com.robinhood.android.trade.equity.p261ui.dollar;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BuySellOrderOnboardingStore;
import com.robinhood.librobinhood.data.store.EquityOrderDefaultStore;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuickTradeAmountsStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.SuitabilityStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;

/* compiled from: EquityDollarOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001BB«\u0003\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0004\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0004\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0004\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0004\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityTradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quickTradeStore", "Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "buySellOrderOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOnboardingBottomSheetPref", "buySellOrderOnboardingStore", "Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "twentyFourHourMarketOnboardingBottomSheetManager", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityDollarOrderDuxo_Factory implements Factory<EquityDollarOrderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<BooleanPreference> buySellOrderOnboardingSeenPref;
    private final Provider<BuySellOrderOnboardingStore> buySellOrderOnboardingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityOrderCheckValidator> equityOrderCheckValidator;
    private final Provider<EquityOrderDefaultStore> equityOrderDefaultStore;
    private final Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore;
    private final Provider<EquityTradingSessionChangedStore> equityTradingSessionChangedStore;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref;
    private final Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<NbboSummaryStore> nbboSummaryStore;
    private final Provider<EquityOrderManager> orderManager;
    private final Provider<OrderStore> orderStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuickTradeAmountsStore> quickTradeStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<EquityDollarOrderStateProvider> stateProvider;
    private final Provider<SuitabilityStore> suitabilityStore;
    private final Provider<TwentyFourHourMarketOnboardingBottomSheetManager> twentyFourHourMarketOnboardingBottomSheetManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityDollarOrderDuxo_Factory create(Provider<AnalyticsLogger> provider, Provider<EquityOrderManager> provider2, Provider<AccountProvider> provider3, Provider<BackupWithholdingStore> provider4, Provider<EquityOrderCheckValidator> provider5, Provider<EquityTradingSessionChangedStore> provider6, Provider<TraderEventLogger> provider7, Provider<RegionGateProvider> provider8, Provider<InstrumentStore> provider9, Provider<InstrumentAccountSwitcherStore> provider10, Provider<PositionStore> provider11, Provider<QuickTradeAmountsStore> provider12, Provider<QuoteStore> provider13, Provider<EquityOrderDefaultStore> provider14, Provider<TraderMarketHoursManager> provider15, Provider<NbboSummaryStore> provider16, Provider<InstrumentBuyingPowerStore> provider17, Provider<SuitabilityStore> provider18, Provider<OrderStore> provider19, Provider<BooleanPreference> provider20, Provider<BooleanPreference> provider21, Provider<BuySellOrderOnboardingStore> provider22, Provider<EquityTradingSeenStatusStore> provider23, Provider<TwentyFourHourMarketOnboardingBottomSheetManager> provider24, Provider<PerformanceLogger> provider25, Provider<ExperimentsStore> provider26, Provider<MicrogramComponent.Factory> provider27, Provider<EquityDollarOrderStateProvider> provider28, Provider<DuxoBundle> provider29, Provider<SavedStateHandle> provider30) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30);
    }

    @JvmStatic
    public static final EquityDollarOrderDuxo newInstance(AnalyticsLogger analyticsLogger, EquityOrderManager equityOrderManager, AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityTradingSessionChangedStore equityTradingSessionChangedStore, TraderEventLogger traderEventLogger, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, PositionStore positionStore, QuickTradeAmountsStore quickTradeAmountsStore, QuoteStore quoteStore, EquityOrderDefaultStore equityOrderDefaultStore, TraderMarketHoursManager traderMarketHoursManager, NbboSummaryStore nbboSummaryStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, SuitabilityStore suitabilityStore, OrderStore orderStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BuySellOrderOnboardingStore buySellOrderOnboardingStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager, PerformanceLogger performanceLogger, ExperimentsStore experimentsStore, MicrogramComponent.Factory factory, EquityDollarOrderStateProvider equityDollarOrderStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(analyticsLogger, equityOrderManager, accountProvider, backupWithholdingStore, equityOrderCheckValidator, equityTradingSessionChangedStore, traderEventLogger, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, positionStore, quickTradeAmountsStore, quoteStore, equityOrderDefaultStore, traderMarketHoursManager, nbboSummaryStore, instrumentBuyingPowerStore, suitabilityStore, orderStore, booleanPreference, booleanPreference2, buySellOrderOnboardingStore, equityTradingSeenStatusStore, twentyFourHourMarketOnboardingBottomSheetManager, performanceLogger, experimentsStore, factory, equityDollarOrderStateProvider, duxoBundle, savedStateHandle);
    }

    public EquityDollarOrderDuxo_Factory(Provider<AnalyticsLogger> analytics, Provider<EquityOrderManager> orderManager, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<EquityTradingSessionChangedStore> equityTradingSessionChangedStore, Provider<TraderEventLogger> eventLogger, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentStore> instrumentStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<PositionStore> positionStore, Provider<QuickTradeAmountsStore> quickTradeStore, Provider<QuoteStore> quoteStore, Provider<EquityOrderDefaultStore> equityOrderDefaultStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<NbboSummaryStore> nbboSummaryStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<SuitabilityStore> suitabilityStore, Provider<OrderStore> orderStore, Provider<BooleanPreference> buySellOrderOnboardingSeenPref, Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref, Provider<BuySellOrderOnboardingStore> buySellOrderOnboardingStore, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<TwentyFourHourMarketOnboardingBottomSheetManager> twentyFourHourMarketOnboardingBottomSheetManager, Provider<PerformanceLogger> performanceLogger, Provider<ExperimentsStore> experimentsStore, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<EquityDollarOrderStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quickTradeStore, "quickTradeStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.analytics = analytics;
        this.orderManager = orderManager;
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.equityTradingSessionChangedStore = equityTradingSessionChangedStore;
        this.eventLogger = eventLogger;
        this.regionGateProvider = regionGateProvider;
        this.instrumentStore = instrumentStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.positionStore = positionStore;
        this.quickTradeStore = quickTradeStore;
        this.quoteStore = quoteStore;
        this.equityOrderDefaultStore = equityOrderDefaultStore;
        this.marketHoursManager = marketHoursManager;
        this.nbboSummaryStore = nbboSummaryStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.suitabilityStore = suitabilityStore;
        this.orderStore = orderStore;
        this.buySellOrderOnboardingSeenPref = buySellOrderOnboardingSeenPref;
        this.hasShownAdtOnboardingBottomSheetPref = hasShownAdtOnboardingBottomSheetPref;
        this.buySellOrderOnboardingStore = buySellOrderOnboardingStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.twentyFourHourMarketOnboardingBottomSheetManager = twentyFourHourMarketOnboardingBottomSheetManager;
        this.performanceLogger = performanceLogger;
        this.experimentsStore = experimentsStore;
        this.microgramComponentFactory = microgramComponentFactory;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public EquityDollarOrderDuxo get() {
        Companion companion = INSTANCE;
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        EquityOrderManager equityOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        EquityOrderCheckValidator equityOrderCheckValidator = this.equityOrderCheckValidator.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderCheckValidator, "get(...)");
        EquityTradingSessionChangedStore equityTradingSessionChangedStore = this.equityTradingSessionChangedStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSessionChangedStore, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.instrumentAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        QuickTradeAmountsStore quickTradeAmountsStore = this.quickTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(quickTradeAmountsStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        EquityOrderDefaultStore equityOrderDefaultStore = this.equityOrderDefaultStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderDefaultStore, "get(...)");
        EquityOrderDefaultStore equityOrderDefaultStore2 = equityOrderDefaultStore;
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager2 = traderMarketHoursManager;
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(nbboSummaryStore, "get(...)");
        NbboSummaryStore nbboSummaryStore2 = nbboSummaryStore;
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore2 = instrumentBuyingPowerStore;
        SuitabilityStore suitabilityStore = this.suitabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(suitabilityStore, "get(...)");
        SuitabilityStore suitabilityStore2 = suitabilityStore;
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        OrderStore orderStore2 = orderStore;
        BooleanPreference booleanPreference = this.buySellOrderOnboardingSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.hasShownAdtOnboardingBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        BuySellOrderOnboardingStore buySellOrderOnboardingStore = this.buySellOrderOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellOrderOnboardingStore, "get(...)");
        BuySellOrderOnboardingStore buySellOrderOnboardingStore2 = buySellOrderOnboardingStore;
        EquityTradingSeenStatusStore equityTradingSeenStatusStore = this.equityTradingSeenStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSeenStatusStore, "get(...)");
        EquityTradingSeenStatusStore equityTradingSeenStatusStore2 = equityTradingSeenStatusStore;
        TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager = this.twentyFourHourMarketOnboardingBottomSheetManager.get();
        Intrinsics.checkNotNullExpressionValue(twentyFourHourMarketOnboardingBottomSheetManager, "get(...)");
        TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager2 = twentyFourHourMarketOnboardingBottomSheetManager;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        MicrogramComponent.Factory factory2 = factory;
        EquityDollarOrderStateProvider equityDollarOrderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(equityDollarOrderStateProvider, "get(...)");
        EquityDollarOrderStateProvider equityDollarOrderStateProvider2 = equityDollarOrderStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(analyticsLogger, equityOrderManager, accountProvider, backupWithholdingStore, equityOrderCheckValidator, equityTradingSessionChangedStore, traderEventLogger, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, positionStore, quickTradeAmountsStore, quoteStore, equityOrderDefaultStore2, traderMarketHoursManager2, nbboSummaryStore2, instrumentBuyingPowerStore2, suitabilityStore2, orderStore2, booleanPreference2, booleanPreference4, buySellOrderOnboardingStore2, equityTradingSeenStatusStore2, twentyFourHourMarketOnboardingBottomSheetManager2, performanceLogger2, experimentsStore2, factory2, equityDollarOrderStateProvider2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: EquityDollarOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¬\u0003\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00072\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00072\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00072\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0007H\u0007Jø\u0001\u0010B\u001a\u00020C2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0007¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo_Factory;", "analytics", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/AnalyticsLogger;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityTradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quickTradeStore", "Lcom/robinhood/librobinhood/data/store/QuickTradeAmountsStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "buySellOrderOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOnboardingBottomSheetPref", "buySellOrderOnboardingStore", "Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "twentyFourHourMarketOnboardingBottomSheetManager", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "stateProvider", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/trade/equity/ui/dollar/EquityDollarOrderDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityDollarOrderDuxo_Factory create(Provider<AnalyticsLogger> analytics, Provider<EquityOrderManager> orderManager, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<EquityTradingSessionChangedStore> equityTradingSessionChangedStore, Provider<TraderEventLogger> eventLogger, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentStore> instrumentStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<PositionStore> positionStore, Provider<QuickTradeAmountsStore> quickTradeStore, Provider<QuoteStore> quoteStore, Provider<EquityOrderDefaultStore> equityOrderDefaultStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<NbboSummaryStore> nbboSummaryStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<SuitabilityStore> suitabilityStore, Provider<OrderStore> orderStore, Provider<BooleanPreference> buySellOrderOnboardingSeenPref, Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref, Provider<BuySellOrderOnboardingStore> buySellOrderOnboardingStore, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<TwentyFourHourMarketOnboardingBottomSheetManager> twentyFourHourMarketOnboardingBottomSheetManager, Provider<PerformanceLogger> performanceLogger, Provider<ExperimentsStore> experimentsStore, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<EquityDollarOrderStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quickTradeStore, "quickTradeStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EquityDollarOrderDuxo_Factory(analytics, orderManager, accountProvider, backupWithholdingStore, equityOrderCheckValidator, equityTradingSessionChangedStore, eventLogger, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, positionStore, quickTradeStore, quoteStore, equityOrderDefaultStore, marketHoursManager, nbboSummaryStore, instrumentBuyingPowerStore, suitabilityStore, orderStore, buySellOrderOnboardingSeenPref, hasShownAdtOnboardingBottomSheetPref, buySellOrderOnboardingStore, equityTradingSeenStatusStore, twentyFourHourMarketOnboardingBottomSheetManager, performanceLogger, experimentsStore, microgramComponentFactory, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final EquityDollarOrderDuxo newInstance(AnalyticsLogger analytics, EquityOrderManager orderManager, AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityTradingSessionChangedStore equityTradingSessionChangedStore, TraderEventLogger eventLogger, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, PositionStore positionStore, QuickTradeAmountsStore quickTradeStore, QuoteStore quoteStore, EquityOrderDefaultStore equityOrderDefaultStore, TraderMarketHoursManager marketHoursManager, NbboSummaryStore nbboSummaryStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, SuitabilityStore suitabilityStore, OrderStore orderStore, BooleanPreference buySellOrderOnboardingSeenPref, BooleanPreference hasShownAdtOnboardingBottomSheetPref, BuySellOrderOnboardingStore buySellOrderOnboardingStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager, PerformanceLogger performanceLogger, ExperimentsStore experimentsStore, MicrogramComponent.Factory microgramComponentFactory, EquityDollarOrderStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quickTradeStore, "quickTradeStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EquityDollarOrderDuxo(analytics, orderManager, accountProvider, backupWithholdingStore, equityOrderCheckValidator, equityTradingSessionChangedStore, eventLogger, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, positionStore, quickTradeStore, quoteStore, equityOrderDefaultStore, marketHoursManager, nbboSummaryStore, instrumentBuyingPowerStore, suitabilityStore, orderStore, buySellOrderOnboardingSeenPref, hasShownAdtOnboardingBottomSheetPref, buySellOrderOnboardingStore, equityTradingSeenStatusStore, twentyFourHourMarketOnboardingBottomSheetManager, performanceLogger, experimentsStore, microgramComponentFactory, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
