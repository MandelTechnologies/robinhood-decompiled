package com.robinhood.android.options.statistics;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnPreTradeStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStatisticsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BÙ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionSimulatedReturnPreTradeStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "optionPreTradeSimulatedReturnChartShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "optionPreTradeStatNuxDotShownPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/options/statistics/OptionStatisticsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionStatisticsDuxo_Factory implements Factory<OptionStatisticsDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<BooleanPreference> optionPreTradeSimulatedReturnChartShownPref;
    private final Provider<BooleanPreference> optionPreTradeStatNuxDotShownPref;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSimulatedReturnPreTradeStore> optionSimulatedReturnPreTradeStore;
    private final Provider<OptionsWatchlistStore> optionsWatchlistStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionStatisticsStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionStatisticsDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<EventLogger> provider3, Provider<PerformanceLogger> provider4, Provider<OptionChainStore> provider5, Provider<OptionInstrumentStore> provider6, Provider<OptionQuoteStore> provider7, Provider<OptionSettingsStore> provider8, Provider<OptionsWatchlistStore> provider9, Provider<OptionSimulatedReturnPreTradeStore> provider10, Provider<BooleanPreference> provider11, Provider<BooleanPreference> provider12, Provider<SavedStateHandle> provider13, Provider<OptionStatisticsStateProvider> provider14, Provider<DuxoBundle> provider15) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15);
    }

    @JvmStatic
    public static final OptionStatisticsDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, PerformanceLogger performanceLogger, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionsWatchlistStore optionsWatchlistStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, SavedStateHandle savedStateHandle, OptionStatisticsStateProvider optionStatisticsStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, eventLogger, performanceLogger, optionChainStore, optionInstrumentStore, optionQuoteStore, optionSettingsStore, optionsWatchlistStore, optionSimulatedReturnPreTradeStore, booleanPreference, booleanPreference2, savedStateHandle, optionStatisticsStateProvider, duxoBundle);
    }

    public OptionStatisticsDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<EventLogger> eventLogger, Provider<PerformanceLogger> performanceLogger, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<OptionSimulatedReturnPreTradeStore> optionSimulatedReturnPreTradeStore, Provider<BooleanPreference> optionPreTradeSimulatedReturnChartShownPref, Provider<BooleanPreference> optionPreTradeStatNuxDotShownPref, Provider<SavedStateHandle> savedStateHandle, Provider<OptionStatisticsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
        Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
        Intrinsics.checkNotNullParameter(optionPreTradeStatNuxDotShownPref, "optionPreTradeStatNuxDotShownPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.eventLogger = eventLogger;
        this.performanceLogger = performanceLogger;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.optionSimulatedReturnPreTradeStore = optionSimulatedReturnPreTradeStore;
        this.optionPreTradeSimulatedReturnChartShownPref = optionPreTradeSimulatedReturnChartShownPref;
        this.optionPreTradeStatNuxDotShownPref = optionPreTradeStatNuxDotShownPref;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OptionStatisticsDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsWatchlistStore, "get(...)");
        OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore = this.optionSimulatedReturnPreTradeStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSimulatedReturnPreTradeStore, "get(...)");
        BooleanPreference booleanPreference = this.optionPreTradeSimulatedReturnChartShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.optionPreTradeStatNuxDotShownPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OptionStatisticsStateProvider optionStatisticsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionStatisticsStateProvider, "get(...)");
        OptionStatisticsStateProvider optionStatisticsStateProvider2 = optionStatisticsStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, eventLogger, performanceLogger, optionChainStore, optionInstrumentStore, optionQuoteStore, optionSettingsStore, optionsWatchlistStore, optionSimulatedReturnPreTradeStore, booleanPreference, booleanPreference2, savedStateHandle, optionStatisticsStateProvider2, duxoBundle);
    }

    /* compiled from: OptionStatisticsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÚ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007H\u0007J\u0080\u0001\u0010$\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0007¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "optionsWatchlistStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionSimulatedReturnPreTradeStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "optionPreTradeSimulatedReturnChartShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "optionPreTradeStatNuxDotShownPref", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/options/statistics/OptionStatisticsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/options/statistics/OptionStatisticsDuxo;", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionStatisticsDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<EventLogger> eventLogger, Provider<PerformanceLogger> performanceLogger, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<OptionSimulatedReturnPreTradeStore> optionSimulatedReturnPreTradeStore, Provider<BooleanPreference> optionPreTradeSimulatedReturnChartShownPref, Provider<BooleanPreference> optionPreTradeStatNuxDotShownPref, Provider<SavedStateHandle> savedStateHandle, Provider<OptionStatisticsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
            Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
            Intrinsics.checkNotNullParameter(optionPreTradeStatNuxDotShownPref, "optionPreTradeStatNuxDotShownPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionStatisticsDuxo_Factory(accountProvider, aggregateOptionPositionStore, eventLogger, performanceLogger, optionChainStore, optionInstrumentStore, optionQuoteStore, optionSettingsStore, optionsWatchlistStore, optionSimulatedReturnPreTradeStore, optionPreTradeSimulatedReturnChartShownPref, optionPreTradeStatNuxDotShownPref, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final OptionStatisticsDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, EventLogger eventLogger, PerformanceLogger performanceLogger, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, OptionsWatchlistStore optionsWatchlistStore, OptionSimulatedReturnPreTradeStore optionSimulatedReturnPreTradeStore, BooleanPreference optionPreTradeSimulatedReturnChartShownPref, BooleanPreference optionPreTradeStatNuxDotShownPref, SavedStateHandle savedStateHandle, OptionStatisticsStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnPreTradeStore, "optionSimulatedReturnPreTradeStore");
            Intrinsics.checkNotNullParameter(optionPreTradeSimulatedReturnChartShownPref, "optionPreTradeSimulatedReturnChartShownPref");
            Intrinsics.checkNotNullParameter(optionPreTradeStatNuxDotShownPref, "optionPreTradeStatNuxDotShownPref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionStatisticsDuxo(accountProvider, aggregateOptionPositionStore, eventLogger, performanceLogger, optionChainStore, optionInstrumentStore, optionQuoteStore, optionSettingsStore, optionsWatchlistStore, optionSimulatedReturnPreTradeStore, optionPreTradeSimulatedReturnChartShownPref, optionPreTradeStatNuxDotShownPref, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
