package com.robinhood.equities.history;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.pnl.ProfitAndLossDetailStore;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.DirectIpoShownOrderNotAllocatedStore;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.equities.store.subzero.EquitySsrStore;
import com.robinhood.shared.history.equities.EquityHistoryLogger;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.InvestmentScheduleEventStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OrderDetailView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0091\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00100R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00100R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00100R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00100R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00100R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00100R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/equities/history/OrderDetailView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/equities/history/OrderDetailView;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/store/base/BackupWithholdingStore;", "backupWithholdingStore", "Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;", "directIpoShownOrderNotAllocatedStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "investmentScheduleEventStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "equityHistoryLogger", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;", "equitySsrStore", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "instance", "", "injectMembers", "(Lcom/robinhood/equities/history/OrderDetailView;)V", "Ljavax/inject/Provider;", "Companion", "lib-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class OrderDetailView_MembersInjector implements MembersInjector<OrderDetailView> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<Clock> clock;
    private final Provider<DirectIpoShownOrderNotAllocatedStore> directIpoShownOrderNotAllocatedStore;
    private final Provider<DocumentStore> documentStore;
    private final Provider<EquityHistoryLogger> equityHistoryLogger;
    private final Provider<EquitySsrStore> equitySsrStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<IacInfoBannerStore> iacInfoBannerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<InvestmentScheduleEventStore> investmentScheduleEventStore;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<Navigator> navigator;
    private final Provider<OrderStore> orderStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<ProfitAndLossDetailStore> profitAndLossDetailStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<RxFactory> rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OrderDetailView> create(Provider<RegionGateProvider> provider, Provider<ExperimentsStore> provider2, Provider<AccountProvider> provider3, Provider<BackupWithholdingStore> provider4, Provider<DirectIpoShownOrderNotAllocatedStore> provider5, Provider<DocumentStore> provider6, Provider<InstrumentStore> provider7, Provider<InvestmentScheduleEventStore> provider8, Provider<OrderStore> provider9, Provider<PositionStore> provider10, Provider<ProfitAndLossDetailStore> provider11, Provider<Navigator> provider12, Provider<MarketHoursStore> provider13, Provider<EventLogger> provider14, Provider<EquityHistoryLogger> provider15, Provider<RxFactory> provider16, Provider<Clock> provider17, Provider<IacInfoBannerStore> provider18, Provider<EquitySsrStore> provider19) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19);
    }

    @JvmStatic
    public static final void injectAccountProvider(OrderDetailView orderDetailView, AccountProvider accountProvider) {
        INSTANCE.injectAccountProvider(orderDetailView, accountProvider);
    }

    @JvmStatic
    public static final void injectBackupWithholdingStore(OrderDetailView orderDetailView, BackupWithholdingStore backupWithholdingStore) {
        INSTANCE.injectBackupWithholdingStore(orderDetailView, backupWithholdingStore);
    }

    @JvmStatic
    public static final void injectClock(OrderDetailView orderDetailView, Clock clock) {
        INSTANCE.injectClock(orderDetailView, clock);
    }

    @JvmStatic
    public static final void injectDirectIpoShownOrderNotAllocatedStore(OrderDetailView orderDetailView, DirectIpoShownOrderNotAllocatedStore directIpoShownOrderNotAllocatedStore) {
        INSTANCE.injectDirectIpoShownOrderNotAllocatedStore(orderDetailView, directIpoShownOrderNotAllocatedStore);
    }

    @JvmStatic
    public static final void injectDocumentStore(OrderDetailView orderDetailView, DocumentStore documentStore) {
        INSTANCE.injectDocumentStore(orderDetailView, documentStore);
    }

    @JvmStatic
    public static final void injectEquityHistoryLogger(OrderDetailView orderDetailView, EquityHistoryLogger equityHistoryLogger) {
        INSTANCE.injectEquityHistoryLogger(orderDetailView, equityHistoryLogger);
    }

    @JvmStatic
    public static final void injectEquitySsrStore(OrderDetailView orderDetailView, EquitySsrStore equitySsrStore) {
        INSTANCE.injectEquitySsrStore(orderDetailView, equitySsrStore);
    }

    @JvmStatic
    public static final void injectEventLogger(OrderDetailView orderDetailView, EventLogger eventLogger) {
        INSTANCE.injectEventLogger(orderDetailView, eventLogger);
    }

    @JvmStatic
    public static final void injectExperimentsStore(OrderDetailView orderDetailView, ExperimentsStore experimentsStore) {
        INSTANCE.injectExperimentsStore(orderDetailView, experimentsStore);
    }

    @JvmStatic
    public static final void injectIacInfoBannerStore(OrderDetailView orderDetailView, IacInfoBannerStore iacInfoBannerStore) {
        INSTANCE.injectIacInfoBannerStore(orderDetailView, iacInfoBannerStore);
    }

    @JvmStatic
    public static final void injectInstrumentStore(OrderDetailView orderDetailView, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(orderDetailView, instrumentStore);
    }

    @JvmStatic
    public static final void injectInvestmentScheduleEventStore(OrderDetailView orderDetailView, InvestmentScheduleEventStore investmentScheduleEventStore) {
        INSTANCE.injectInvestmentScheduleEventStore(orderDetailView, investmentScheduleEventStore);
    }

    @JvmStatic
    public static final void injectMarketHoursStore(OrderDetailView orderDetailView, MarketHoursStore marketHoursStore) {
        INSTANCE.injectMarketHoursStore(orderDetailView, marketHoursStore);
    }

    @JvmStatic
    public static final void injectNavigator(OrderDetailView orderDetailView, Navigator navigator) {
        INSTANCE.injectNavigator(orderDetailView, navigator);
    }

    @JvmStatic
    public static final void injectOrderStore(OrderDetailView orderDetailView, OrderStore orderStore) {
        INSTANCE.injectOrderStore(orderDetailView, orderStore);
    }

    @JvmStatic
    public static final void injectPositionStore(OrderDetailView orderDetailView, PositionStore positionStore) {
        INSTANCE.injectPositionStore(orderDetailView, positionStore);
    }

    @JvmStatic
    public static final void injectProfitAndLossDetailStore(OrderDetailView orderDetailView, ProfitAndLossDetailStore profitAndLossDetailStore) {
        INSTANCE.injectProfitAndLossDetailStore(orderDetailView, profitAndLossDetailStore);
    }

    @JvmStatic
    public static final void injectRegionGateProvider(OrderDetailView orderDetailView, RegionGateProvider regionGateProvider) {
        INSTANCE.injectRegionGateProvider(orderDetailView, regionGateProvider);
    }

    @JvmStatic
    public static final void injectRxFactory(OrderDetailView orderDetailView, RxFactory rxFactory) {
        INSTANCE.injectRxFactory(orderDetailView, rxFactory);
    }

    public OrderDetailView_MembersInjector(Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentsStore, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<DirectIpoShownOrderNotAllocatedStore> directIpoShownOrderNotAllocatedStore, Provider<DocumentStore> documentStore, Provider<InstrumentStore> instrumentStore, Provider<InvestmentScheduleEventStore> investmentScheduleEventStore, Provider<OrderStore> orderStore, Provider<PositionStore> positionStore, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<Navigator> navigator, Provider<MarketHoursStore> marketHoursStore, Provider<EventLogger> eventLogger, Provider<EquityHistoryLogger> equityHistoryLogger, Provider<RxFactory> rxFactory, Provider<Clock> clock, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<EquitySsrStore> equitySsrStore) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(directIpoShownOrderNotAllocatedStore, "directIpoShownOrderNotAllocatedStore");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(equityHistoryLogger, "equityHistoryLogger");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(equitySsrStore, "equitySsrStore");
        this.regionGateProvider = regionGateProvider;
        this.experimentsStore = experimentsStore;
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.directIpoShownOrderNotAllocatedStore = directIpoShownOrderNotAllocatedStore;
        this.documentStore = documentStore;
        this.instrumentStore = instrumentStore;
        this.investmentScheduleEventStore = investmentScheduleEventStore;
        this.orderStore = orderStore;
        this.positionStore = positionStore;
        this.profitAndLossDetailStore = profitAndLossDetailStore;
        this.navigator = navigator;
        this.marketHoursStore = marketHoursStore;
        this.eventLogger = eventLogger;
        this.equityHistoryLogger = equityHistoryLogger;
        this.rxFactory = rxFactory;
        this.clock = clock;
        this.iacInfoBannerStore = iacInfoBannerStore;
        this.equitySsrStore = equitySsrStore;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OrderDetailView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        companion.injectRegionGateProvider(instance, regionGateProvider);
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        companion.injectExperimentsStore(instance, experimentsStore);
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        companion.injectAccountProvider(instance, accountProvider);
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        companion.injectBackupWithholdingStore(instance, backupWithholdingStore);
        DirectIpoShownOrderNotAllocatedStore directIpoShownOrderNotAllocatedStore = this.directIpoShownOrderNotAllocatedStore.get();
        Intrinsics.checkNotNullExpressionValue(directIpoShownOrderNotAllocatedStore, "get(...)");
        companion.injectDirectIpoShownOrderNotAllocatedStore(instance, directIpoShownOrderNotAllocatedStore);
        DocumentStore documentStore = this.documentStore.get();
        Intrinsics.checkNotNullExpressionValue(documentStore, "get(...)");
        companion.injectDocumentStore(instance, documentStore);
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion.injectInstrumentStore(instance, instrumentStore);
        InvestmentScheduleEventStore investmentScheduleEventStore = this.investmentScheduleEventStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleEventStore, "get(...)");
        companion.injectInvestmentScheduleEventStore(instance, investmentScheduleEventStore);
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        companion.injectOrderStore(instance, orderStore);
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        companion.injectPositionStore(instance, positionStore);
        ProfitAndLossDetailStore profitAndLossDetailStore = this.profitAndLossDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(profitAndLossDetailStore, "get(...)");
        companion.injectProfitAndLossDetailStore(instance, profitAndLossDetailStore);
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        companion.injectNavigator(instance, navigator);
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        companion.injectMarketHoursStore(instance, marketHoursStore);
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        companion.injectEventLogger(instance, eventLogger);
        EquityHistoryLogger equityHistoryLogger = this.equityHistoryLogger.get();
        Intrinsics.checkNotNullExpressionValue(equityHistoryLogger, "get(...)");
        companion.injectEquityHistoryLogger(instance, equityHistoryLogger);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion.injectRxFactory(instance, rxFactory);
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        companion.injectClock(instance, clock);
        IacInfoBannerStore iacInfoBannerStore = this.iacInfoBannerStore.get();
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerStore, "get(...)");
        companion.injectIacInfoBannerStore(instance, iacInfoBannerStore);
        EquitySsrStore equitySsrStore = this.equitySsrStore.get();
        Intrinsics.checkNotNullExpressionValue(equitySsrStore, "get(...)");
        companion.injectEquitySsrStore(instance, equitySsrStore);
    }

    /* compiled from: OrderDetailView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b'\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009f\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u0002002\u0006\u0010/\u001a\u00020,2\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\bU\u0010V¨\u0006W"}, m3636d2 = {"Lcom/robinhood/equities/history/OrderDetailView_MembersInjector$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/store/base/BackupWithholdingStore;", "backupWithholdingStore", "Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;", "directIpoShownOrderNotAllocatedStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/store/base/InvestmentScheduleEventStore;", "investmentScheduleEventStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;", "profitAndLossDetailStore", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "marketHoursStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "equityHistoryLogger", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "iacInfoBannerStore", "Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;", "equitySsrStore", "Ldagger/MembersInjector;", "Lcom/robinhood/equities/history/OrderDetailView;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;", "instance", "", "injectRegionGateProvider", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "injectExperimentsStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "injectAccountProvider", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/android/lib/account/AccountProvider;)V", "injectBackupWithholdingStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/store/base/BackupWithholdingStore;)V", "injectDirectIpoShownOrderNotAllocatedStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/librobinhood/data/store/DirectIpoShownOrderNotAllocatedStore;)V", "injectDocumentStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/librobinhood/data/store/DocumentStore;)V", "injectInstrumentStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "injectInvestmentScheduleEventStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/store/base/InvestmentScheduleEventStore;)V", "injectOrderStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/librobinhood/data/store/OrderStore;)V", "injectPositionStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/librobinhood/data/store/PositionStore;)V", "injectProfitAndLossDetailStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/android/portfolio/pnl/ProfitAndLossDetailStore;)V", "injectNavigator", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/android/navigation/Navigator;)V", "injectMarketHoursStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/android/markethours/data/store/MarketHoursStore;)V", "injectEventLogger", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/analytics/EventLogger;)V", "injectEquityHistoryLogger", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/shared/history/equities/EquityHistoryLogger;)V", "injectRxFactory", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/coroutines/rx/RxFactory;)V", "injectClock", "(Lcom/robinhood/equities/history/OrderDetailView;Lj$/time/Clock;)V", "injectIacInfoBannerStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;)V", "injectEquitySsrStore", "(Lcom/robinhood/equities/history/OrderDetailView;Lcom/robinhood/shared/equities/store/subzero/EquitySsrStore;)V", "lib-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OrderDetailView> create(Provider<RegionGateProvider> regionGateProvider, Provider<ExperimentsStore> experimentsStore, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<DirectIpoShownOrderNotAllocatedStore> directIpoShownOrderNotAllocatedStore, Provider<DocumentStore> documentStore, Provider<InstrumentStore> instrumentStore, Provider<InvestmentScheduleEventStore> investmentScheduleEventStore, Provider<OrderStore> orderStore, Provider<PositionStore> positionStore, Provider<ProfitAndLossDetailStore> profitAndLossDetailStore, Provider<Navigator> navigator, Provider<MarketHoursStore> marketHoursStore, Provider<EventLogger> eventLogger, Provider<EquityHistoryLogger> equityHistoryLogger, Provider<RxFactory> rxFactory, Provider<Clock> clock, Provider<IacInfoBannerStore> iacInfoBannerStore, Provider<EquitySsrStore> equitySsrStore) {
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(directIpoShownOrderNotAllocatedStore, "directIpoShownOrderNotAllocatedStore");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(equityHistoryLogger, "equityHistoryLogger");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            Intrinsics.checkNotNullParameter(equitySsrStore, "equitySsrStore");
            return new OrderDetailView_MembersInjector(regionGateProvider, experimentsStore, accountProvider, backupWithholdingStore, directIpoShownOrderNotAllocatedStore, documentStore, instrumentStore, investmentScheduleEventStore, orderStore, positionStore, profitAndLossDetailStore, navigator, marketHoursStore, eventLogger, equityHistoryLogger, rxFactory, clock, iacInfoBannerStore, equitySsrStore);
        }

        @JvmStatic
        public final void injectRegionGateProvider(OrderDetailView instance, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            instance.setRegionGateProvider(regionGateProvider);
        }

        @JvmStatic
        public final void injectExperimentsStore(OrderDetailView instance, ExperimentsStore experimentsStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            instance.setExperimentsStore(experimentsStore);
        }

        @JvmStatic
        public final void injectAccountProvider(OrderDetailView instance, AccountProvider accountProvider) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            instance.setAccountProvider(accountProvider);
        }

        @JvmStatic
        public final void injectBackupWithholdingStore(OrderDetailView instance, BackupWithholdingStore backupWithholdingStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            instance.setBackupWithholdingStore(backupWithholdingStore);
        }

        @JvmStatic
        public final void injectDirectIpoShownOrderNotAllocatedStore(OrderDetailView instance, DirectIpoShownOrderNotAllocatedStore directIpoShownOrderNotAllocatedStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(directIpoShownOrderNotAllocatedStore, "directIpoShownOrderNotAllocatedStore");
            instance.setDirectIpoShownOrderNotAllocatedStore(directIpoShownOrderNotAllocatedStore);
        }

        @JvmStatic
        public final void injectDocumentStore(OrderDetailView instance, DocumentStore documentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(documentStore, "documentStore");
            instance.setDocumentStore(documentStore);
        }

        @JvmStatic
        public final void injectInstrumentStore(OrderDetailView instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }

        @JvmStatic
        public final void injectInvestmentScheduleEventStore(OrderDetailView instance, InvestmentScheduleEventStore investmentScheduleEventStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(investmentScheduleEventStore, "investmentScheduleEventStore");
            instance.setInvestmentScheduleEventStore(investmentScheduleEventStore);
        }

        @JvmStatic
        public final void injectOrderStore(OrderDetailView instance, OrderStore orderStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            instance.setOrderStore(orderStore);
        }

        @JvmStatic
        public final void injectPositionStore(OrderDetailView instance, PositionStore positionStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            instance.setPositionStore(positionStore);
        }

        @JvmStatic
        public final void injectProfitAndLossDetailStore(OrderDetailView instance, ProfitAndLossDetailStore profitAndLossDetailStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(profitAndLossDetailStore, "profitAndLossDetailStore");
            instance.setProfitAndLossDetailStore(profitAndLossDetailStore);
        }

        @JvmStatic
        public final void injectNavigator(OrderDetailView instance, Navigator navigator) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            instance.setNavigator(navigator);
        }

        @JvmStatic
        public final void injectMarketHoursStore(OrderDetailView instance, MarketHoursStore marketHoursStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            instance.setMarketHoursStore(marketHoursStore);
        }

        @JvmStatic
        public final void injectEventLogger(OrderDetailView instance, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            instance.setEventLogger(eventLogger);
        }

        @JvmStatic
        public final void injectEquityHistoryLogger(OrderDetailView instance, EquityHistoryLogger equityHistoryLogger) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(equityHistoryLogger, "equityHistoryLogger");
            instance.setEquityHistoryLogger(equityHistoryLogger);
        }

        @JvmStatic
        public final void injectRxFactory(OrderDetailView instance, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            instance.setRxFactory(rxFactory);
        }

        @JvmStatic
        public final void injectClock(OrderDetailView instance, Clock clock) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(clock, "clock");
            instance.setClock(clock);
        }

        @JvmStatic
        public final void injectIacInfoBannerStore(OrderDetailView instance, IacInfoBannerStore iacInfoBannerStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
            instance.setIacInfoBannerStore(iacInfoBannerStore);
        }

        @JvmStatic
        public final void injectEquitySsrStore(OrderDetailView instance, EquitySsrStore equitySsrStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(equitySsrStore, "equitySsrStore");
            instance.setEquitySsrStore(equitySsrStore);
        }
    }
}
