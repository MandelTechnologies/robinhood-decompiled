package com.robinhood.android.options.lib.simulatedreturn.chart;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyInfoStore;
import com.robinhood.librobinhood.data.store.OptionUnderlyingQuoteStore;
import com.robinhood.librobinhood.data.store.OptionsWatchlistStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.store.user.UserStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: OptionsSimulatedReturnChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+Bõ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010*R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionsWatchlistStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnChartDuxo_Factory implements Factory<OptionsSimulatedReturnChartDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<Clock> clock;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore;
    private final Provider<OptionStrategyInfoStore> optionStrategyInfoStore;
    private final Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore;
    private final Provider<OptionsWatchlistStore> optionsWatchlistStore;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionsSimulatedReturnChartStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsSimulatedReturnChartDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<Clock> provider3, Provider<EventLogger> provider4, Provider<ExperimentsStore> provider5, Provider<OptionMarketHoursStore> provider6, Provider<OptionStrategyInfoStore> provider7, Provider<OptionPositionStore> provider8, Provider<OptionQuoteStore> provider9, Provider<OptionSimulatedReturnsStore> provider10, Provider<OptionUnderlyingQuoteStore> provider11, Provider<OptionsWatchlistStore> provider12, Provider<PerformanceLogger> provider13, Provider<UserStore> provider14, Provider<SavedStateHandle> provider15, Provider<OptionsSimulatedReturnChartStateProvider> provider16, Provider<DuxoBundle> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final OptionsSimulatedReturnChartDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, Clock clock, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionMarketHoursStore optionMarketHoursStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsWatchlistStore optionsWatchlistStore, PerformanceLogger performanceLogger, UserStore userStore, SavedStateHandle savedStateHandle, OptionsSimulatedReturnChartStateProvider optionsSimulatedReturnChartStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, clock, eventLogger, experimentsStore, optionMarketHoursStore, optionStrategyInfoStore, optionPositionStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, optionsWatchlistStore, performanceLogger, userStore, savedStateHandle, optionsSimulatedReturnChartStateProvider, duxoBundle);
    }

    public OptionsSimulatedReturnChartDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<Clock> clock, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<PerformanceLogger> performanceLogger, Provider<UserStore> userStore, Provider<SavedStateHandle> savedStateHandle, Provider<OptionsSimulatedReturnChartStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
        Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
        Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.clock = clock;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionStrategyInfoStore = optionStrategyInfoStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSimulatedReturnsStore = optionSimulatedReturnsStore;
        this.optionUnderlyingQuoteStore = optionUnderlyingQuoteStore;
        this.optionsWatchlistStore = optionsWatchlistStore;
        this.performanceLogger = performanceLogger;
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public OptionsSimulatedReturnChartDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionStrategyInfoStore optionStrategyInfoStore = this.optionStrategyInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyInfoStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionSimulatedReturnsStore optionSimulatedReturnsStore = this.optionSimulatedReturnsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSimulatedReturnsStore, "get(...)");
        OptionUnderlyingQuoteStore optionUnderlyingQuoteStore = this.optionUnderlyingQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUnderlyingQuoteStore, "get(...)");
        OptionsWatchlistStore optionsWatchlistStore = this.optionsWatchlistStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsWatchlistStore, "get(...)");
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        UserStore userStore2 = userStore;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        OptionsSimulatedReturnChartStateProvider optionsSimulatedReturnChartStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsSimulatedReturnChartStateProvider, "get(...)");
        OptionsSimulatedReturnChartStateProvider optionsSimulatedReturnChartStateProvider2 = optionsSimulatedReturnChartStateProvider;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, clock, eventLogger, experimentsStore, optionMarketHoursStore, optionStrategyInfoStore, optionPositionStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, optionsWatchlistStore, performanceLogger, userStore2, savedStateHandle2, optionsSimulatedReturnChartStateProvider2, duxoBundle);
    }

    /* compiled from: OptionsSimulatedReturnChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jý\u0001\u0010(\u001a\u00020'2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0004H\u0007¢\u0006\u0004\b(\u0010)J\u0097\u0001\u0010+\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionPositionStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;", "optionStrategyInfoStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;", "optionUnderlyingQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;", "optionsWatchlistStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartStateProvider;", "stateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo_Factory;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;Lj$/time/Clock;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;Lcom/robinhood/librobinhood/data/store/OptionStrategyInfoStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;Lcom/robinhood/librobinhood/data/store/OptionUnderlyingQuoteStore;Lcom/robinhood/librobinhood/data/store/OptionsWatchlistStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartDuxo;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsSimulatedReturnChartDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<Clock> clock, Provider<EventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionStrategyInfoStore> optionStrategyInfoStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionUnderlyingQuoteStore> optionUnderlyingQuoteStore, Provider<OptionsWatchlistStore> optionsWatchlistStore, Provider<PerformanceLogger> performanceLogger, Provider<UserStore> userStore, Provider<SavedStateHandle> savedStateHandle, Provider<OptionsSimulatedReturnChartStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionsSimulatedReturnChartDuxo_Factory(accountProvider, aggregateOptionPositionStore, clock, eventLogger, experimentsStore, optionMarketHoursStore, optionStrategyInfoStore, optionPositionStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, optionsWatchlistStore, performanceLogger, userStore, savedStateHandle, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final OptionsSimulatedReturnChartDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, Clock clock, EventLogger eventLogger, ExperimentsStore experimentsStore, OptionMarketHoursStore optionMarketHoursStore, OptionStrategyInfoStore optionStrategyInfoStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionUnderlyingQuoteStore optionUnderlyingQuoteStore, OptionsWatchlistStore optionsWatchlistStore, PerformanceLogger performanceLogger, UserStore userStore, SavedStateHandle savedStateHandle, OptionsSimulatedReturnChartStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionStrategyInfoStore, "optionStrategyInfoStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionUnderlyingQuoteStore, "optionUnderlyingQuoteStore");
            Intrinsics.checkNotNullParameter(optionsWatchlistStore, "optionsWatchlistStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new OptionsSimulatedReturnChartDuxo(accountProvider, aggregateOptionPositionStore, clock, eventLogger, experimentsStore, optionMarketHoursStore, optionStrategyInfoStore, optionPositionStore, optionQuoteStore, optionSimulatedReturnsStore, optionUnderlyingQuoteStore, optionsWatchlistStore, performanceLogger, userStore, savedStateHandle, stateProvider, duxoBundle);
        }
    }
}
