package com.robinhood.android.trade.options.confirmation;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.android.trade.options.util.OptionOrderManager;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OptionAlertOnboardingStore;
import com.robinhood.librobinhood.data.store.OptionOrderStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore;
import com.robinhood.librobinhood.data.store.bonfire.daytrades.store.DayTradeWarningsStore;
import com.robinhood.userleap.SurveyManager3;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes20.dex */
public final class OptionOrderConfirmationFragment_MembersInjector implements MembersInjector<OptionOrderConfirmationFragment> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStoreProvider;
    private final Provider<AnalyticsLogger> analyticsProvider;
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<DayTradeWarningsStore> dayTradeWarningsStoreProvider;
    private final Provider<TraderEventLogger> eventLoggerProvider;
    private final Provider<ExperimentsStore> experimentsStoreProvider;
    private final Provider<OptionAlertOnboardingStore> optionAlertOnboardingStoreProvider;
    private final Provider<OptionOrderStore> optionOrderStoreProvider;
    private final Provider<OptionPositionStore> optionPositionStoreProvider;
    private final Provider<OptionQuoteStore> optionQuoteStoreProvider;
    private final Provider<OptionRemoveReplaceOrderConfirmationStore> optionRemoveReplaceOrderConfirmationStoreProvider;
    private final Provider<OptionOrderManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;
    private final Provider<SurveyManager3> userLeapManagerProvider;

    private OptionOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<OptionOrderManager> provider4, Provider<AnalyticsLogger> provider5, Provider<AccountProvider> provider6, Provider<ExperimentsStore> provider7, Provider<OptionOrderStore> provider8, Provider<OptionPositionStore> provider9, Provider<OptionQuoteStore> provider10, Provider<AggregateOptionPositionStore> provider11, Provider<DayTradeWarningsStore> provider12, Provider<OptionAlertOnboardingStore> provider13, Provider<OptionRemoveReplaceOrderConfirmationStore> provider14, Provider<SurveyManager3> provider15, Provider<TraderEventLogger> provider16) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
        this.analyticsProvider = provider5;
        this.accountProvider = provider6;
        this.experimentsStoreProvider = provider7;
        this.optionOrderStoreProvider = provider8;
        this.optionPositionStoreProvider = provider9;
        this.optionQuoteStoreProvider = provider10;
        this.aggregateOptionPositionStoreProvider = provider11;
        this.dayTradeWarningsStoreProvider = provider12;
        this.optionAlertOnboardingStoreProvider = provider13;
        this.optionRemoveReplaceOrderConfirmationStoreProvider = provider14;
        this.userLeapManagerProvider = provider15;
        this.eventLoggerProvider = provider16;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionOrderConfirmationFragment optionOrderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(optionOrderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(optionOrderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(optionOrderConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(optionOrderConfirmationFragment, this.orderManagerProvider.get());
        injectAnalytics(optionOrderConfirmationFragment, this.analyticsProvider.get());
        injectAccountProvider(optionOrderConfirmationFragment, this.accountProvider.get());
        injectExperimentsStore(optionOrderConfirmationFragment, this.experimentsStoreProvider.get());
        injectOptionOrderStore(optionOrderConfirmationFragment, this.optionOrderStoreProvider.get());
        injectOptionPositionStore(optionOrderConfirmationFragment, this.optionPositionStoreProvider.get());
        injectOptionQuoteStore(optionOrderConfirmationFragment, this.optionQuoteStoreProvider.get());
        injectAggregateOptionPositionStore(optionOrderConfirmationFragment, this.aggregateOptionPositionStoreProvider.get());
        injectDayTradeWarningsStore(optionOrderConfirmationFragment, this.dayTradeWarningsStoreProvider.get());
        injectOptionAlertOnboardingStore(optionOrderConfirmationFragment, this.optionAlertOnboardingStoreProvider.get());
        injectOptionRemoveReplaceOrderConfirmationStore(optionOrderConfirmationFragment, this.optionRemoveReplaceOrderConfirmationStoreProvider.get());
        injectUserLeapManager(optionOrderConfirmationFragment, this.userLeapManagerProvider.get());
        injectEventLogger(optionOrderConfirmationFragment, this.eventLoggerProvider.get());
    }

    public static MembersInjector<OptionOrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<OptionOrderManager> provider4, Provider<AnalyticsLogger> provider5, Provider<AccountProvider> provider6, Provider<ExperimentsStore> provider7, Provider<OptionOrderStore> provider8, Provider<OptionPositionStore> provider9, Provider<OptionQuoteStore> provider10, Provider<AggregateOptionPositionStore> provider11, Provider<DayTradeWarningsStore> provider12, Provider<OptionAlertOnboardingStore> provider13, Provider<OptionRemoveReplaceOrderConfirmationStore> provider14, Provider<SurveyManager3> provider15, Provider<TraderEventLogger> provider16) {
        return new OptionOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    public static void injectOrderManager(OptionOrderConfirmationFragment optionOrderConfirmationFragment, OptionOrderManager optionOrderManager) {
        optionOrderConfirmationFragment.orderManager = optionOrderManager;
    }

    public static void injectAnalytics(OptionOrderConfirmationFragment optionOrderConfirmationFragment, AnalyticsLogger analyticsLogger) {
        optionOrderConfirmationFragment.analytics = analyticsLogger;
    }

    public static void injectAccountProvider(OptionOrderConfirmationFragment optionOrderConfirmationFragment, AccountProvider accountProvider) {
        optionOrderConfirmationFragment.accountProvider = accountProvider;
    }

    public static void injectExperimentsStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, ExperimentsStore experimentsStore) {
        optionOrderConfirmationFragment.experimentsStore = experimentsStore;
    }

    public static void injectOptionOrderStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, OptionOrderStore optionOrderStore) {
        optionOrderConfirmationFragment.optionOrderStore = optionOrderStore;
    }

    public static void injectOptionPositionStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, OptionPositionStore optionPositionStore) {
        optionOrderConfirmationFragment.optionPositionStore = optionPositionStore;
    }

    public static void injectOptionQuoteStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, OptionQuoteStore optionQuoteStore) {
        optionOrderConfirmationFragment.optionQuoteStore = optionQuoteStore;
    }

    public static void injectAggregateOptionPositionStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, AggregateOptionPositionStore aggregateOptionPositionStore) {
        optionOrderConfirmationFragment.aggregateOptionPositionStore = aggregateOptionPositionStore;
    }

    public static void injectDayTradeWarningsStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, DayTradeWarningsStore dayTradeWarningsStore) {
        optionOrderConfirmationFragment.dayTradeWarningsStore = dayTradeWarningsStore;
    }

    public static void injectOptionAlertOnboardingStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, OptionAlertOnboardingStore optionAlertOnboardingStore) {
        optionOrderConfirmationFragment.optionAlertOnboardingStore = optionAlertOnboardingStore;
    }

    public static void injectOptionRemoveReplaceOrderConfirmationStore(OptionOrderConfirmationFragment optionOrderConfirmationFragment, OptionRemoveReplaceOrderConfirmationStore optionRemoveReplaceOrderConfirmationStore) {
        optionOrderConfirmationFragment.optionRemoveReplaceOrderConfirmationStore = optionRemoveReplaceOrderConfirmationStore;
    }

    public static void injectUserLeapManager(OptionOrderConfirmationFragment optionOrderConfirmationFragment, SurveyManager3 surveyManager3) {
        optionOrderConfirmationFragment.userLeapManager = surveyManager3;
    }

    public static void injectEventLogger(OptionOrderConfirmationFragment optionOrderConfirmationFragment, TraderEventLogger traderEventLogger) {
        optionOrderConfirmationFragment.eventLogger = traderEventLogger;
    }
}
