package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes21.dex */
public final class CryptoOrderConfirmationFragment_MembersInjector implements MembersInjector<CryptoOrderConfirmationFragment> {
    private final Provider<AnalyticsLogger> analyticsProvider;
    private final Provider<AppType> appTypeProvider;
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStoreProvider;
    private final Provider<EventLogger> eventLoggerProvider;
    private final Provider<HistoryNavigator> historyNavigatorProvider;
    private final Provider<InvestmentScheduleKeyResolver> investmentScheduleKeyResolverProvider;
    private final Provider<CryptoOrderManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;

    private CryptoOrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<AppType> provider4, Provider<AnalyticsLogger> provider5, Provider<CryptoExperimentsStore> provider6, Provider<CryptoAccountProvider> provider7, Provider<CryptoOrderManager> provider8, Provider<EventLogger> provider9, Provider<HistoryNavigator> provider10, Provider<InvestmentScheduleKeyResolver> provider11) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.appTypeProvider = provider4;
        this.analyticsProvider = provider5;
        this.cryptoExperimentsStoreProvider = provider6;
        this.cryptoAccountProvider = provider7;
        this.orderManagerProvider = provider8;
        this.eventLoggerProvider = provider9;
        this.historyNavigatorProvider = provider10;
        this.investmentScheduleKeyResolverProvider = provider11;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(cryptoOrderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(cryptoOrderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(cryptoOrderConfirmationFragment, this.pltManagerProvider.get());
        injectAppType(cryptoOrderConfirmationFragment, this.appTypeProvider.get());
        injectAnalytics(cryptoOrderConfirmationFragment, this.analyticsProvider.get());
        injectCryptoExperimentsStore(cryptoOrderConfirmationFragment, this.cryptoExperimentsStoreProvider.get());
        injectCryptoAccountProvider(cryptoOrderConfirmationFragment, this.cryptoAccountProvider.get());
        injectOrderManager(cryptoOrderConfirmationFragment, this.orderManagerProvider.get());
        injectEventLogger(cryptoOrderConfirmationFragment, this.eventLoggerProvider.get());
        injectHistoryNavigator(cryptoOrderConfirmationFragment, this.historyNavigatorProvider.get());
        injectInvestmentScheduleKeyResolver(cryptoOrderConfirmationFragment, this.investmentScheduleKeyResolverProvider.get());
    }

    public static MembersInjector<CryptoOrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<AppType> provider4, Provider<AnalyticsLogger> provider5, Provider<CryptoExperimentsStore> provider6, Provider<CryptoAccountProvider> provider7, Provider<CryptoOrderManager> provider8, Provider<EventLogger> provider9, Provider<HistoryNavigator> provider10, Provider<InvestmentScheduleKeyResolver> provider11) {
        return new CryptoOrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static void injectAppType(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, AppType appType) {
        cryptoOrderConfirmationFragment.appType = appType;
    }

    public static void injectAnalytics(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, AnalyticsLogger analyticsLogger) {
        cryptoOrderConfirmationFragment.analytics = analyticsLogger;
    }

    public static void injectCryptoExperimentsStore(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoExperimentsStore cryptoExperimentsStore) {
        cryptoOrderConfirmationFragment.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    public static void injectCryptoAccountProvider(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoAccountProvider cryptoAccountProvider) {
        cryptoOrderConfirmationFragment.cryptoAccountProvider = cryptoAccountProvider;
    }

    public static void injectOrderManager(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderManager cryptoOrderManager) {
        cryptoOrderConfirmationFragment.orderManager = cryptoOrderManager;
    }

    public static void injectEventLogger(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, EventLogger eventLogger) {
        cryptoOrderConfirmationFragment.eventLogger = eventLogger;
    }

    public static void injectHistoryNavigator(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, HistoryNavigator historyNavigator) {
        cryptoOrderConfirmationFragment.historyNavigator = historyNavigator;
    }

    public static void injectInvestmentScheduleKeyResolver(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, InvestmentScheduleKeyResolver investmentScheduleKeyResolver) {
        cryptoOrderConfirmationFragment.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
    }
}
