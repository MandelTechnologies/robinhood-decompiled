package com.robinhood.android.options.portfolioriskanalyzer.components.position;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.portfolio.pnl.UnrealizedProfitAndLossStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.AggregateOptionQuoteStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionMarketHoursStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRollingStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionSimulatedReturnsStore;
import com.robinhood.librobinhood.data.store.OptionStrategyDetailStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bõ\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionStrategyDetailStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerPositionDuxo_Factory implements Factory<OptionsPortfolioRiskAnalyzerPositionDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OptionMarketHoursStore> optionMarketHoursStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionRollingStore> optionRollingStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore;
    private final Provider<OptionStrategyDetailStore> optionStrategyDetailStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OptionsPortfolioRiskAnalyzerPositionStateProvider> stateProvider;
    private final Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionsPortfolioRiskAnalyzerPositionDuxo_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<AggregateOptionQuoteStore> provider3, Provider<InstrumentStore> provider4, Provider<OptionMarketHoursStore> provider5, Provider<OptionPositionStore> provider6, Provider<OptionSimulatedReturnsStore> provider7, Provider<OptionStrategyDetailStore> provider8, Provider<OptionQuoteStore> provider9, Provider<PositionStore> provider10, Provider<UnrealizedProfitAndLossStore> provider11, Provider<QuoteStore> provider12, Provider<OptionRollingStore> provider13, Provider<OptionSettingsStore> provider14, Provider<DuxoBundle> provider15, Provider<OptionsPortfolioRiskAnalyzerPositionStateProvider> provider16, Provider<SavedStateHandle> provider17) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17);
    }

    @JvmStatic
    public static final OptionsPortfolioRiskAnalyzerPositionDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, InstrumentStore instrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionStrategyDetailStore optionStrategyDetailStore, OptionQuoteStore optionQuoteStore, PositionStore positionStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, QuoteStore quoteStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerPositionStateProvider optionsPortfolioRiskAnalyzerPositionStateProvider, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, instrumentStore, optionMarketHoursStore, optionPositionStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionQuoteStore, positionStore, unrealizedProfitAndLossStore, quoteStore, optionRollingStore, optionSettingsStore, duxoBundle, optionsPortfolioRiskAnalyzerPositionStateProvider, savedStateHandle);
    }

    public OptionsPortfolioRiskAnalyzerPositionDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore, Provider<InstrumentStore> instrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionStrategyDetailStore> optionStrategyDetailStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<PositionStore> positionStore, Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore, Provider<QuoteStore> quoteStore, Provider<OptionRollingStore> optionRollingStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<DuxoBundle> duxoBundle, Provider<OptionsPortfolioRiskAnalyzerPositionStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
        Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.aggregateOptionQuoteStore = aggregateOptionQuoteStore;
        this.instrumentStore = instrumentStore;
        this.optionMarketHoursStore = optionMarketHoursStore;
        this.optionPositionStore = optionPositionStore;
        this.optionSimulatedReturnsStore = optionSimulatedReturnsStore;
        this.optionStrategyDetailStore = optionStrategyDetailStore;
        this.optionQuoteStore = optionQuoteStore;
        this.positionStore = positionStore;
        this.unrealizedProfitAndLossStore = unrealizedProfitAndLossStore;
        this.quoteStore = quoteStore;
        this.optionRollingStore = optionRollingStore;
        this.optionSettingsStore = optionSettingsStore;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OptionsPortfolioRiskAnalyzerPositionDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        AggregateOptionQuoteStore aggregateOptionQuoteStore = this.aggregateOptionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionQuoteStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        OptionMarketHoursStore optionMarketHoursStore = this.optionMarketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(optionMarketHoursStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionSimulatedReturnsStore optionSimulatedReturnsStore = this.optionSimulatedReturnsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSimulatedReturnsStore, "get(...)");
        OptionStrategyDetailStore optionStrategyDetailStore = this.optionStrategyDetailStore.get();
        Intrinsics.checkNotNullExpressionValue(optionStrategyDetailStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        UnrealizedProfitAndLossStore unrealizedProfitAndLossStore = this.unrealizedProfitAndLossStore.get();
        Intrinsics.checkNotNullExpressionValue(unrealizedProfitAndLossStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        OptionRollingStore optionRollingStore = this.optionRollingStore.get();
        Intrinsics.checkNotNullExpressionValue(optionRollingStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        OptionSettingsStore optionSettingsStore2 = optionSettingsStore;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        OptionsPortfolioRiskAnalyzerPositionStateProvider optionsPortfolioRiskAnalyzerPositionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(optionsPortfolioRiskAnalyzerPositionStateProvider, "get(...)");
        OptionsPortfolioRiskAnalyzerPositionStateProvider optionsPortfolioRiskAnalyzerPositionStateProvider2 = optionsPortfolioRiskAnalyzerPositionStateProvider;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, instrumentStore, optionMarketHoursStore, optionPositionStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionQuoteStore, positionStore, unrealizedProfitAndLossStore, quoteStore, optionRollingStore, optionSettingsStore2, duxoBundle2, optionsPortfolioRiskAnalyzerPositionStateProvider2, savedStateHandle);
    }

    /* compiled from: OptionsPortfolioRiskAnalyzerPositionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jö\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007H\u0007J\u0090\u0001\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "aggregateOptionQuoteStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionQuoteStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "optionMarketHoursStore", "Lcom/robinhood/librobinhood/data/store/OptionMarketHoursStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionSimulatedReturnsStore", "Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnsStore;", "optionStrategyDetailStore", "Lcom/robinhood/librobinhood/data/store/OptionStrategyDetailStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "unrealizedProfitAndLossStore", "Lcom/robinhood/android/portfolio/pnl/UnrealizedProfitAndLossStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "optionRollingStore", "Lcom/robinhood/librobinhood/data/store/OptionRollingStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/position/OptionsPortfolioRiskAnalyzerPositionDuxo;", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionsPortfolioRiskAnalyzerPositionDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<AggregateOptionQuoteStore> aggregateOptionQuoteStore, Provider<InstrumentStore> instrumentStore, Provider<OptionMarketHoursStore> optionMarketHoursStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionSimulatedReturnsStore> optionSimulatedReturnsStore, Provider<OptionStrategyDetailStore> optionStrategyDetailStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<PositionStore> positionStore, Provider<UnrealizedProfitAndLossStore> unrealizedProfitAndLossStore, Provider<QuoteStore> quoteStore, Provider<OptionRollingStore> optionRollingStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<DuxoBundle> duxoBundle, Provider<OptionsPortfolioRiskAnalyzerPositionStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsPortfolioRiskAnalyzerPositionDuxo_Factory(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, instrumentStore, optionMarketHoursStore, optionPositionStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionQuoteStore, positionStore, unrealizedProfitAndLossStore, quoteStore, optionRollingStore, optionSettingsStore, duxoBundle, stateProvider, savedStateHandle);
        }

        @JvmStatic
        public final OptionsPortfolioRiskAnalyzerPositionDuxo newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, AggregateOptionQuoteStore aggregateOptionQuoteStore, InstrumentStore instrumentStore, OptionMarketHoursStore optionMarketHoursStore, OptionPositionStore optionPositionStore, OptionSimulatedReturnsStore optionSimulatedReturnsStore, OptionStrategyDetailStore optionStrategyDetailStore, OptionQuoteStore optionQuoteStore, PositionStore positionStore, UnrealizedProfitAndLossStore unrealizedProfitAndLossStore, QuoteStore quoteStore, OptionRollingStore optionRollingStore, OptionSettingsStore optionSettingsStore, DuxoBundle duxoBundle, OptionsPortfolioRiskAnalyzerPositionStateProvider stateProvider, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(aggregateOptionQuoteStore, "aggregateOptionQuoteStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(optionMarketHoursStore, "optionMarketHoursStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionSimulatedReturnsStore, "optionSimulatedReturnsStore");
            Intrinsics.checkNotNullParameter(optionStrategyDetailStore, "optionStrategyDetailStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(unrealizedProfitAndLossStore, "unrealizedProfitAndLossStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(optionRollingStore, "optionRollingStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OptionsPortfolioRiskAnalyzerPositionDuxo(accountProvider, aggregateOptionPositionStore, aggregateOptionQuoteStore, instrumentStore, optionMarketHoursStore, optionPositionStore, optionSimulatedReturnsStore, optionStrategyDetailStore, optionQuoteStore, positionStore, unrealizedProfitAndLossStore, quoteStore, optionRollingStore, optionSettingsStore, duxoBundle, stateProvider, savedStateHandle);
        }
    }
}
