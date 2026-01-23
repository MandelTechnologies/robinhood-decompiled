package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionschain/OptionChainListDuxo;", "equityQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "hostView", "Landroid/view/View;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionChainListDuxo_Factory implements Factory<OptionChainListDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<QuoteStore> equityQuoteStore;
    private final Provider<View> hostView;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionChainCustomizationStore> optionChainCustomizationStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionsWatchlistStore> optionsWatchlistStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionChainListDuxo_Factory create(Provider<QuoteStore> provider, Provider<IndexStore> provider2, Provider<OptionChainCustomizationStore> provider3, Provider<OptionInstrumentStore> provider4, Provider<OptionMarketHoursStore> provider5, Provider<OptionQuoteStore> provider6, Provider<OptionPositionStore> provider7, Provider<OptionSettingsStore> provider8, Provider<OptionsWatchlistStore> provider9, Provider<PerformanceLogger> provider10, Provider<View> provider11, Provider<DispatcherProvider> provider12, Provider<RxFactory> provider13, Provider<RxGlobalErrorHandler> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final OptionChainListDuxo newInstance(QuoteStore quoteStore, IndexStore indexStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionPositionStore optionPositionStore, OptionSettingsStore optionSettingsStore, OptionsWatchlistStore optionsWatchlistStore, PerformanceLogger performanceLogger, View view) {
        return INSTANCE.newInstance(quoteStore, indexStore, optionChainCustomizationStore, optionInstrumentStore, optionMarketHoursStore, optionQuoteStore, optionPositionStore, optionSettingsStore, optionsWatchlistStore, performanceLogger, view);
    }

    public OptionChainListDuxo_Factory(Provider<QuoteStore> equityQuoteStore, Provider<IndexStore> indexStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<PerformanceLogger> performanceLogger, Provider<View> hostView, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.equityQuoteStore = equityQuoteStore;
        this.indexStore = indexStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionPositionStore = optionPositionStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.performanceLogger = performanceLogger;
        this.hostView = hostView;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OptionChainListDuxo get() {
        Companion companion = INSTANCE;
        QuoteStore quoteStore = this.equityQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        OptionChainCustomizationStore optionChainCustomizationStore = this.optionChainCustomizationStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsWatchlistStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        View view = this.hostView.get();
        Intrinsics.checkNotNullExpressionValue(view, "get(...)");
        OptionChainListDuxo optionChainListDuxoNewInstance = companion.newInstance(quoteStore, indexStore, optionChainCustomizationStore, optionInstrumentStore, optionMarketHoursStore, optionQuoteStore, optionPositionStore, optionSettingsStore, optionsWatchlistStore, performanceLogger, view);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(optionChainListDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(optionChainListDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(optionChainListDuxoNewInstance, rxGlobalErrorHandler);
        return optionChainListDuxoNewInstance;
    }

    /* compiled from: OptionChainListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007J`\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionschain/OptionChainListDuxo_Factory;", "equityQuoteStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "hostView", "Landroid/view/View;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/optionschain/OptionChainListDuxo;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionChainListDuxo_Factory create(Provider<QuoteStore> equityQuoteStore, Provider<IndexStore> indexStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<PerformanceLogger> performanceLogger, Provider<View> hostView, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OptionChainListDuxo_Factory(equityQuoteStore, indexStore, optionChainCustomizationStore, optionInstrumentStore, optionMarketHoursStore, optionQuoteStore, optionPositionStore, optionSettingsStore, optionsWatchlistStore, performanceLogger, hostView, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OptionChainListDuxo newInstance(QuoteStore equityQuoteStore, IndexStore indexStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionQuoteStore optionQuoteStore, OptionPositionStore optionPositionStore, OptionSettingsStore optionSettingsStore, OptionsWatchlistStore optionsWatchlistStore, PerformanceLogger performanceLogger, View hostView) {
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new OptionChainListDuxo(equityQuoteStore, indexStore, optionChainCustomizationStore, optionInstrumentStore, optionMarketHoursStore, optionQuoteStore, optionPositionStore, optionSettingsStore, optionsWatchlistStore, performanceLogger, hostView);
        }
    }
}
