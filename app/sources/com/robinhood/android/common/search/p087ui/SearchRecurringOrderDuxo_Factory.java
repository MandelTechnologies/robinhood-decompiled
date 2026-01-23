package com.robinhood.android.common.search.p087ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentPositionStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.store.search.SearchStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchRecurringOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bç\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo;", "searchStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/search/SearchStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SearchRecurringOrderDuxo_Factory implements Factory<SearchRecurringOrderDuxo> {
    private final Provider<CryptoHoldingStore> cryptoHoldingStore;
    private final Provider<CuratedListItemsStore> curatedListItemsStore;
    private final Provider<CuratedListStore> curatedListStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentPositionStore> instrumentPositionStore;
    private final Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<ListDisclosuresStore> listDisclosuresStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<SearchStore> searchStore;
    private final Provider<SweepsInterestStore> sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final SearchRecurringOrderDuxo_Factory create(Provider<SearchStore> provider, Provider<InstrumentPositionStore> provider2, Provider<TraderRecurringTradabilityStore> provider3, Provider<PositionStore> provider4, Provider<ExperimentsStore> provider5, Provider<InstrumentStore> provider6, Provider<EventLogger> provider7, Provider<CryptoHoldingStore> provider8, Provider<CuratedListStore> provider9, Provider<CuratedListItemsStore> provider10, Provider<ListDisclosuresStore> provider11, Provider<SweepsInterestStore> provider12, Provider<SavedStateHandle> provider13, Provider<DispatcherProvider> provider14, Provider<RxFactory> provider15, Provider<RxGlobalErrorHandler> provider16) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    @JvmStatic
    public static final SearchRecurringOrderDuxo newInstance(SearchStore searchStore, InstrumentPositionStore instrumentPositionStore, TraderRecurringTradabilityStore traderRecurringTradabilityStore, PositionStore positionStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, EventLogger eventLogger, CryptoHoldingStore cryptoHoldingStore, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListDisclosuresStore listDisclosuresStore, SweepsInterestStore sweepsInterestStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(searchStore, instrumentPositionStore, traderRecurringTradabilityStore, positionStore, experimentsStore, instrumentStore, eventLogger, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listDisclosuresStore, sweepsInterestStore, savedStateHandle);
    }

    public SearchRecurringOrderDuxo_Factory(Provider<SearchStore> searchStore, Provider<InstrumentPositionStore> instrumentPositionStore, Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<PositionStore> positionStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<EventLogger> eventLogger, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<ListDisclosuresStore> listDisclosuresStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(listDisclosuresStore, "listDisclosuresStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.searchStore = searchStore;
        this.instrumentPositionStore = instrumentPositionStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.positionStore = positionStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.eventLogger = eventLogger;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.listDisclosuresStore = listDisclosuresStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public SearchRecurringOrderDuxo get() {
        Companion companion = INSTANCE;
        SearchStore searchStore = this.searchStore.get();
        Intrinsics.checkNotNullExpressionValue(searchStore, "get(...)");
        InstrumentPositionStore instrumentPositionStore = this.instrumentPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentPositionStore, "get(...)");
        TraderRecurringTradabilityStore traderRecurringTradabilityStore = this.instrumentRecurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(traderRecurringTradabilityStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        CryptoHoldingStore cryptoHoldingStore = this.cryptoHoldingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHoldingStore, "get(...)");
        CuratedListStore curatedListStore = this.curatedListStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListStore, "get(...)");
        CuratedListItemsStore curatedListItemsStore = this.curatedListItemsStore.get();
        Intrinsics.checkNotNullExpressionValue(curatedListItemsStore, "get(...)");
        ListDisclosuresStore listDisclosuresStore = this.listDisclosuresStore.get();
        Intrinsics.checkNotNullExpressionValue(listDisclosuresStore, "get(...)");
        SweepsInterestStore sweepsInterestStore = this.sweepsInterestStore.get();
        Intrinsics.checkNotNullExpressionValue(sweepsInterestStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SearchRecurringOrderDuxo searchRecurringOrderDuxoNewInstance = companion.newInstance(searchStore, instrumentPositionStore, traderRecurringTradabilityStore, positionStore, experimentsStore, instrumentStore, eventLogger, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listDisclosuresStore, sweepsInterestStore, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(searchRecurringOrderDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(searchRecurringOrderDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(searchRecurringOrderDuxoNewInstance, rxGlobalErrorHandler);
        return searchRecurringOrderDuxoNewInstance;
    }

    /* compiled from: SearchRecurringOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jè\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0007H\u0007Jp\u0010'\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0007¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo_Factory;", "searchStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/search/SearchStore;", "instrumentPositionStore", "Lcom/robinhood/librobinhood/data/store/InstrumentPositionStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listDisclosuresStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore;", "sweepsInterestStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SearchRecurringOrderDuxo_Factory create(Provider<SearchStore> searchStore, Provider<InstrumentPositionStore> instrumentPositionStore, Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<PositionStore> positionStore, Provider<ExperimentsStore> experimentsStore, Provider<InstrumentStore> instrumentStore, Provider<EventLogger> eventLogger, Provider<CryptoHoldingStore> cryptoHoldingStore, Provider<CuratedListStore> curatedListStore, Provider<CuratedListItemsStore> curatedListItemsStore, Provider<ListDisclosuresStore> listDisclosuresStore, Provider<SweepsInterestStore> sweepsInterestStore, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(listDisclosuresStore, "listDisclosuresStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new SearchRecurringOrderDuxo_Factory(searchStore, instrumentPositionStore, instrumentRecurringTradabilityStore, positionStore, experimentsStore, instrumentStore, eventLogger, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listDisclosuresStore, sweepsInterestStore, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final SearchRecurringOrderDuxo newInstance(SearchStore searchStore, InstrumentPositionStore instrumentPositionStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, PositionStore positionStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, EventLogger eventLogger, CryptoHoldingStore cryptoHoldingStore, CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListDisclosuresStore listDisclosuresStore, SweepsInterestStore sweepsInterestStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(searchStore, "searchStore");
            Intrinsics.checkNotNullParameter(instrumentPositionStore, "instrumentPositionStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
            Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
            Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
            Intrinsics.checkNotNullParameter(listDisclosuresStore, "listDisclosuresStore");
            Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new SearchRecurringOrderDuxo(searchStore, instrumentPositionStore, instrumentRecurringTradabilityStore, positionStore, experimentsStore, instrumentStore, eventLogger, cryptoHoldingStore, curatedListStore, curatedListItemsStore, listDisclosuresStore, sweepsInterestStore, savedStateHandle);
        }
    }
}
