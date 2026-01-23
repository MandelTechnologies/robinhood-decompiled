package com.robinhood.android.optionsstrategybuilder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.librobinhood.data.store.OptionStrategyBuilderStore;
import com.robinhood.librobinhood.data.store.OptionTooltipStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationTourStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.internal.Factory;
import dispatch.core.DispatcherProvider;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStrategyBuilderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B»\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004¢\u0006\u0004\b0\u00101J\b\u00102\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo;", "aggregateOptionPositionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "educationTourStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "showSettleOnOpenTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionStrategyBuilderDuxo_Factory implements Factory<OptionStrategyBuilderDuxo> {
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<EducationTourStore> educationTourStore;
    private final Provider<QuoteStore> equityQuoteStore;
    private final Provider<EventLogger> eventLogger;
    private final Provider<IndexStore> indexStore;
    private final Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore;
    private final Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore;
    private final Provider<OptionChainCustomizationStore> optionChainCustomizationStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSideBySideChainStore> optionSideBySideChainStore;
    private final Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore;
    private final Provider<OptionTooltipStore> optionTooltipStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<RxFactory> rxFactory;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandler;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> showSettleOnOpenTooltipPref;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionStrategyBuilderDuxo_Factory create(Provider<AggregateOptionPositionStore> provider, Provider<EducationTourStore> provider2, Provider<QuoteStore> provider3, Provider<EventLogger> provider4, Provider<IndexStore> provider5, Provider<OptionAccountSwitcherStore> provider6, Provider<OptionChainCustomizationStore> provider7, Provider<OptionChainCustomizationDiscoveryStore> provider8, Provider<OptionInstrumentStore> provider9, Provider<OptionMarketHoursStore> provider10, Provider<OptionPositionStore> provider11, Provider<OptionQuoteStore> provider12, Provider<OptionSettingsStore> provider13, Provider<OptionSideBySideChainStore> provider14, Provider<OptionStrategyBuilderStore> provider15, Provider<OptionTooltipStore> provider16, Provider<PerformanceLogger> provider17, Provider<BooleanPreference> provider18, Provider<SavedStateHandle> provider19, Provider<DispatcherProvider> provider20, Provider<RxFactory> provider21, Provider<RxGlobalErrorHandler> provider22) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22);
    }

    @JvmStatic
    public static final OptionStrategyBuilderDuxo newInstance(AggregateOptionPositionStore aggregateOptionPositionStore, EducationTourStore educationTourStore, QuoteStore quoteStore, EventLogger eventLogger, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionStrategyBuilderStore optionStrategyBuilderStore, OptionTooltipStore optionTooltipStore, PerformanceLogger performanceLogger, BooleanPreference booleanPreference, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(aggregateOptionPositionStore, educationTourStore, quoteStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionInstrumentStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainStore, optionStrategyBuilderStore, optionTooltipStore, performanceLogger, booleanPreference, savedStateHandle);
    }

    public OptionStrategyBuilderDuxo_Factory(Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<EducationTourStore> educationTourStore, Provider<QuoteStore> equityQuoteStore, Provider<EventLogger> eventLogger, Provider<IndexStore> indexStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore, Provider<OptionTooltipStore> optionTooltipStore, Provider<PerformanceLogger> performanceLogger, Provider<BooleanPreference> showSettleOnOpenTooltipPref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(educationTourStore, "educationTourStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
        Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
        Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
        Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.educationTourStore = educationTourStore;
        this.equityQuoteStore = equityQuoteStore;
        this.eventLogger = eventLogger;
        this.indexStore = indexStore;
        this.optionAccountSwitcherStore = optionAccountSwitcherStore;
        this.optionChainCustomizationStore = optionChainCustomizationStore;
        this.optionChainCustomizationDiscoveryStore = optionChainCustomizationDiscoveryStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionSideBySideChainStore = optionSideBySideChainStore;
        this.optionStrategyBuilderStore = optionStrategyBuilderStore;
        this.optionTooltipStore = optionTooltipStore;
        this.performanceLogger = performanceLogger;
        this.showSettleOnOpenTooltipPref = showSettleOnOpenTooltipPref;
        this.savedStateHandle = savedStateHandle;
        this.dispatcherProvider = dispatcherProvider;
        this.rxFactory = rxFactory;
        this.rxGlobalErrorHandler = rxGlobalErrorHandler;
    }

    @Override // javax.inject.Provider
    public OptionStrategyBuilderDuxo get() {
        Companion companion = INSTANCE;
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        EducationTourStore educationTourStore = this.educationTourStore.get();
        Intrinsics.checkNotNullExpressionValue(educationTourStore, "get(...)");
        QuoteStore quoteStore = this.equityQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        IndexStore indexStore = this.indexStore.get();
        Intrinsics.checkNotNullExpressionValue(indexStore, "get(...)");
        OptionAccountSwitcherStore optionAccountSwitcherStore = this.optionAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(optionAccountSwitcherStore, "get(...)");
        OptionChainCustomizationStore optionChainCustomizationStore = this.optionChainCustomizationStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationStore, "get(...)");
        OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore = this.optionChainCustomizationDiscoveryStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainCustomizationDiscoveryStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSideBySideChainStore optionSideBySideChainStore = this.optionSideBySideChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSideBySideChainStore, "get(...)");
        OptionSideBySideChainStore optionSideBySideChainStore2 = optionSideBySideChainStore;
        OptionStrategyBuilderStore optionStrategyBuilderStore = this.optionStrategyBuilderStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyBuilderStore, "get(...)");
        OptionStrategyBuilderStore optionStrategyBuilderStore2 = optionStrategyBuilderStore;
        OptionTooltipStore optionTooltipStore = this.optionTooltipStore.get();
        Intrinsics.checkNotNullExpressionValue(optionTooltipStore, "get(...)");
        OptionTooltipStore optionTooltipStore2 = optionTooltipStore;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        BooleanPreference booleanPreference = this.showSettleOnOpenTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OptionStrategyBuilderDuxo optionStrategyBuilderDuxoNewInstance = companion.newInstance(aggregateOptionPositionStore, educationTourStore, quoteStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionInstrumentStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainStore2, optionStrategyBuilderStore2, optionTooltipStore2, performanceLogger2, booleanPreference2, savedStateHandle);
        OldBaseDuxo_MembersInjector.Companion companion2 = OldBaseDuxo_MembersInjector.INSTANCE;
        DispatcherProvider dispatcherProvider = this.dispatcherProvider.get();
        Intrinsics.checkNotNullExpressionValue(dispatcherProvider, "get(...)");
        companion2.injectDispatcherProvider(optionStrategyBuilderDuxoNewInstance, dispatcherProvider);
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        companion2.injectRxFactory(optionStrategyBuilderDuxoNewInstance, rxFactory);
        RxGlobalErrorHandler rxGlobalErrorHandler = this.rxGlobalErrorHandler.get();
        Intrinsics.checkNotNullExpressionValue(rxGlobalErrorHandler, "get(...)");
        companion2.injectRxGlobalErrorHandler(optionStrategyBuilderDuxoNewInstance, rxGlobalErrorHandler);
        return optionStrategyBuilderDuxoNewInstance;
    }

    /* compiled from: OptionStrategyBuilderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¼\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u0007H\u0007J \u0001\u00103\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo_Factory;", "aggregateOptionPositionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "educationTourStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationTourStore;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "optionAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/OptionAccountSwitcherStore;", "optionChainCustomizationStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationStore;", "optionChainCustomizationDiscoveryStore", "Lcom/robinhood/librobinhood/data/store/OptionChainCustomizationDiscoveryStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "optionStrategyBuilderStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyBuilderStore;", "optionTooltipStore", "Lcom/robinhood/librobinhood/data/store/OptionTooltipStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "showSettleOnOpenTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "newInstance", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo;", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionStrategyBuilderDuxo_Factory create(Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<EducationTourStore> educationTourStore, Provider<QuoteStore> equityQuoteStore, Provider<EventLogger> eventLogger, Provider<IndexStore> indexStore, Provider<OptionAccountSwitcherStore> optionAccountSwitcherStore, Provider<OptionChainCustomizationStore> optionChainCustomizationStore, Provider<OptionChainCustomizationDiscoveryStore> optionChainCustomizationDiscoveryStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionSideBySideChainStore> optionSideBySideChainStore, Provider<OptionStrategyBuilderStore> optionStrategyBuilderStore, Provider<OptionTooltipStore> optionTooltipStore, Provider<PerformanceLogger> performanceLogger, Provider<BooleanPreference> showSettleOnOpenTooltipPref, Provider<SavedStateHandle> savedStateHandle, Provider<DispatcherProvider> dispatcherProvider, Provider<RxFactory> rxFactory, Provider<RxGlobalErrorHandler> rxGlobalErrorHandler) {
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(educationTourStore, "educationTourStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
            Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            Intrinsics.checkNotNullParameter(rxGlobalErrorHandler, "rxGlobalErrorHandler");
            return new OptionStrategyBuilderDuxo_Factory(aggregateOptionPositionStore, educationTourStore, equityQuoteStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionInstrumentStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainStore, optionStrategyBuilderStore, optionTooltipStore, performanceLogger, showSettleOnOpenTooltipPref, savedStateHandle, dispatcherProvider, rxFactory, rxGlobalErrorHandler);
        }

        @JvmStatic
        public final OptionStrategyBuilderDuxo newInstance(AggregateOptionPositionStore aggregateOptionPositionStore, EducationTourStore educationTourStore, QuoteStore equityQuoteStore, EventLogger eventLogger, IndexStore indexStore, OptionAccountSwitcherStore optionAccountSwitcherStore, OptionChainCustomizationStore optionChainCustomizationStore, OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore, OptionInstrumentStore optionInstrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionSideBySideChainStore optionSideBySideChainStore, OptionStrategyBuilderStore optionStrategyBuilderStore, OptionTooltipStore optionTooltipStore, PerformanceLogger performanceLogger, BooleanPreference showSettleOnOpenTooltipPref, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(educationTourStore, "educationTourStore");
            Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(indexStore, "indexStore");
            Intrinsics.checkNotNullParameter(optionAccountSwitcherStore, "optionAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationStore, "optionChainCustomizationStore");
            Intrinsics.checkNotNullParameter(optionChainCustomizationDiscoveryStore, "optionChainCustomizationDiscoveryStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "optionSideBySideChainStore");
            Intrinsics.checkNotNullParameter(optionStrategyBuilderStore, "optionStrategyBuilderStore");
            Intrinsics.checkNotNullParameter(optionTooltipStore, "optionTooltipStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(showSettleOnOpenTooltipPref, "showSettleOnOpenTooltipPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionStrategyBuilderDuxo(aggregateOptionPositionStore, educationTourStore, equityQuoteStore, eventLogger, indexStore, optionAccountSwitcherStore, optionChainCustomizationStore, optionChainCustomizationDiscoveryStore, optionInstrumentStore, optionMarketHoursStore, optionPositionStore, optionQuoteStore, optionSettingsStore, optionSideBySideChainStore, optionStrategyBuilderStore, optionTooltipStore, performanceLogger, showSettleOnOpenTooltipPref, savedStateHandle);
        }
    }
}
