package com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip;

import android.view.View;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip.EquityOrderTypeTooltipDuxo_MembersInjector;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.EquityOrderTypeTooltipStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.TaxLotEligibilityStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityOrderTypeTooltipDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&Bõ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "equityOrderTypeTooltipStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeTooltipStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "taxLotEligibilityStore", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "hostView", "Landroid/view/View;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "hasShownBuySellOrderTypeOnboardingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOrderTypeOnboardingTooltipPref", "hasShownMarketBuysOnboardingTooltipPref", "hasShownTaxLotsOnboardingTooltipPref", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityOrderTypeTooltipDuxo_Factory implements Factory<EquityOrderTypeTooltipDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EquityOrderTypeTooltipStore> equityOrderTypeTooltipStore;
    private final Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasShownAdtOrderTypeOnboardingTooltipPref;
    private final Provider<BooleanPreference> hasShownBuySellOrderTypeOnboardingTooltipPref;
    private final Provider<BooleanPreference> hasShownMarketBuysOnboardingTooltipPref;
    private final Provider<BooleanPreference> hasShownTaxLotsOnboardingTooltipPref;
    private final Provider<View> hostView;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<TaxLotEligibilityStore> taxLotEligibilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityOrderTypeTooltipDuxo_Factory create(Provider<AccountProvider> provider, Provider<InstrumentStore> provider2, Provider<EquityOrderTypeTooltipStore> provider3, Provider<EquityTradingSeenStatusStore> provider4, Provider<TraderMarketHoursManager> provider5, Provider<ExperimentsStore> provider6, Provider<RegionGateProvider> provider7, Provider<EventLogger> provider8, Provider<TaxLotEligibilityStore> provider9, Provider<View> provider10, Provider<DispatcherProvider> provider11, Provider<RxFactory> provider12, Provider<RxGlobalErrorHandler> provider13, Provider<BooleanPreference> provider14, Provider<BooleanPreference> provider15, Provider<BooleanPreference> provider16, Provider<BooleanPreference> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final EquityOrderTypeTooltipDuxo newInstance(AccountProvider accountProvider, InstrumentStore instrumentStore, EquityOrderTypeTooltipStore equityOrderTypeTooltipStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TraderMarketHoursManager traderMarketHoursManager, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, EventLogger eventLogger, TaxLotEligibilityStore taxLotEligibilityStore, View view) {
        return INSTANCE.newInstance(accountProvider, instrumentStore, equityOrderTypeTooltipStore, equityTradingSeenStatusStore, traderMarketHoursManager, experimentsStore, regionGateProvider, eventLogger, taxLotEligibilityStore, view);
    }

    public EquityOrderTypeTooltipDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<InstrumentStore> instrumentStore, Provider<EquityOrderTypeTooltipStore> equityOrderTypeTooltipStore, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<EventLogger> eventLogger, Provider<TaxLotEligibilityStore> taxLotEligibilityStore, Provider<View> hostView, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<BooleanPreference> hasShownBuySellOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownAdtOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownMarketBuysOnboardingTooltipPref, Provider<BooleanPreference> hasShownTaxLotsOnboardingTooltipPref) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(equityOrderTypeTooltipStore, "equityOrderTypeTooltipStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        Intrinsics.checkNotNullParameter(hasShownBuySellOrderTypeOnboardingTooltipPref, "hasShownBuySellOrderTypeOnboardingTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownAdtOrderTypeOnboardingTooltipPref, "hasShownAdtOrderTypeOnboardingTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownMarketBuysOnboardingTooltipPref, "hasShownMarketBuysOnboardingTooltipPref");
        Intrinsics.checkNotNullParameter(hasShownTaxLotsOnboardingTooltipPref, "hasShownTaxLotsOnboardingTooltipPref");
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.equityOrderTypeTooltipStore = equityOrderTypeTooltipStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.marketHoursManager = marketHoursManager;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.eventLogger = eventLogger;
        this.taxLotEligibilityStore = taxLotEligibilityStore;
        this.hostView = hostView;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
        this.hasShownBuySellOrderTypeOnboardingTooltipPref = hasShownBuySellOrderTypeOnboardingTooltipPref;
        this.hasShownAdtOrderTypeOnboardingTooltipPref = hasShownAdtOrderTypeOnboardingTooltipPref;
        this.hasShownMarketBuysOnboardingTooltipPref = hasShownMarketBuysOnboardingTooltipPref;
        this.hasShownTaxLotsOnboardingTooltipPref = hasShownTaxLotsOnboardingTooltipPref;
    }

    @Override // javax.inject.Provider
    public EquityOrderTypeTooltipDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        EquityOrderTypeTooltipStore equityOrderTypeTooltipStore = this.equityOrderTypeTooltipStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderTypeTooltipStore, "get(...)");
        EquityTradingSeenStatusStore equityTradingSeenStatusStore = this.equityTradingSeenStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSeenStatusStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        TaxLotEligibilityStore taxLotEligibilityStore = this.taxLotEligibilityStore.get();
        Intrinsics.checkNotNullExpressionValue(taxLotEligibilityStore, "get(...)");
        View view = this.hostView.get();
        Intrinsics.checkNotNullExpressionValue(view, "get(...)");
        EquityOrderTypeTooltipDuxo equityOrderTypeTooltipDuxoNewInstance = companion.newInstance(accountProvider, instrumentStore, equityOrderTypeTooltipStore, equityTradingSeenStatusStore, traderMarketHoursManager, experimentsStore, regionGateProvider, eventLogger, taxLotEligibilityStore, view);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(equityOrderTypeTooltipDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(equityOrderTypeTooltipDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(equityOrderTypeTooltipDuxoNewInstance, rxGlobalErrorHandler);
        EquityOrderTypeTooltipDuxo_MembersInjector.Companion companion3 = EquityOrderTypeTooltipDuxo_MembersInjector.INSTANCE;
        BooleanPreference booleanPreference = this.hasShownBuySellOrderTypeOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        companion3.injectHasShownBuySellOrderTypeOnboardingTooltipPref(equityOrderTypeTooltipDuxoNewInstance, booleanPreference);
        BooleanPreference booleanPreference2 = this.hasShownAdtOrderTypeOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        companion3.injectHasShownAdtOrderTypeOnboardingTooltipPref(equityOrderTypeTooltipDuxoNewInstance, booleanPreference2);
        BooleanPreference booleanPreference3 = this.hasShownMarketBuysOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        companion3.injectHasShownMarketBuysOnboardingTooltipPref(equityOrderTypeTooltipDuxoNewInstance, booleanPreference3);
        BooleanPreference booleanPreference4 = this.hasShownTaxLotsOnboardingTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference4, "get(...)");
        companion3.injectHasShownTaxLotsOnboardingTooltipPref(equityOrderTypeTooltipDuxoNewInstance, booleanPreference4);
        return equityOrderTypeTooltipDuxoNewInstance;
    }

    /* compiled from: EquityOrderTypeTooltipDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jö\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007JX\u0010&\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "equityOrderTypeTooltipStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderTypeTooltipStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "taxLotEligibilityStore", "Lcom/robinhood/librobinhood/data/store/TaxLotEligibilityStore;", "hostView", "Landroid/view/View;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "hasShownBuySellOrderTypeOnboardingTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasShownAdtOrderTypeOnboardingTooltipPref", "hasShownMarketBuysOnboardingTooltipPref", "hasShownTaxLotsOnboardingTooltipPref", "newInstance", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityOrderTypeTooltipDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<InstrumentStore> instrumentStore, Provider<EquityOrderTypeTooltipStore> equityOrderTypeTooltipStore, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<EventLogger> eventLogger, Provider<TaxLotEligibilityStore> taxLotEligibilityStore, Provider<View> hostView, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler, Provider<BooleanPreference> hasShownBuySellOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownAdtOrderTypeOnboardingTooltipPref, Provider<BooleanPreference> hasShownMarketBuysOnboardingTooltipPref, Provider<BooleanPreference> hasShownTaxLotsOnboardingTooltipPref) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(equityOrderTypeTooltipStore, "equityOrderTypeTooltipStore");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            Intrinsics.checkNotNullParameter(hasShownBuySellOrderTypeOnboardingTooltipPref, "hasShownBuySellOrderTypeOnboardingTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownAdtOrderTypeOnboardingTooltipPref, "hasShownAdtOrderTypeOnboardingTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownMarketBuysOnboardingTooltipPref, "hasShownMarketBuysOnboardingTooltipPref");
            Intrinsics.checkNotNullParameter(hasShownTaxLotsOnboardingTooltipPref, "hasShownTaxLotsOnboardingTooltipPref");
            return new EquityOrderTypeTooltipDuxo_Factory(accountProvider, instrumentStore, equityOrderTypeTooltipStore, equityTradingSeenStatusStore, marketHoursManager, experimentsStore, regionGateProvider, eventLogger, taxLotEligibilityStore, hostView, dispatcherProvider, rxFactory, rxGlobalErrorHandler, hasShownBuySellOrderTypeOnboardingTooltipPref, hasShownAdtOrderTypeOnboardingTooltipPref, hasShownMarketBuysOnboardingTooltipPref, hasShownTaxLotsOnboardingTooltipPref);
        }

        @JvmStatic
        public final EquityOrderTypeTooltipDuxo newInstance(AccountProvider accountProvider, InstrumentStore instrumentStore, EquityOrderTypeTooltipStore equityOrderTypeTooltipStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TraderMarketHoursManager marketHoursManager, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, EventLogger eventLogger, TaxLotEligibilityStore taxLotEligibilityStore, View hostView) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(equityOrderTypeTooltipStore, "equityOrderTypeTooltipStore");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(taxLotEligibilityStore, "taxLotEligibilityStore");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new EquityOrderTypeTooltipDuxo(accountProvider, instrumentStore, equityOrderTypeTooltipStore, equityTradingSeenStatusStore, marketHoursManager, experimentsStore, regionGateProvider, eventLogger, taxLotEligibilityStore, hostView);
        }
    }
}
