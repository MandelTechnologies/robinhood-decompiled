package com.robinhood.android.trade.equity.p261ui.confirmation;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment_MembersInjector;
import com.robinhood.android.plt.contract.PltManager;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* loaded from: classes20.dex */
public final class OrderConfirmationFragment_MembersInjector implements MembersInjector<OrderConfirmationFragment> {
    private final Provider<AnalyticsLogger> analyticsProvider;
    private final Provider<CardManager> cardManagerProvider;
    private final Provider<EquityOrderManager> orderManagerProvider;
    private final Provider<PltManager> pltManagerProvider;
    private final Provider<BaseFragmentSingletons> singletonsProvider;

    private OrderConfirmationFragment_MembersInjector(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<EquityOrderManager> provider4, Provider<AnalyticsLogger> provider5) {
        this.singletonsProvider = provider;
        this.cardManagerProvider = provider2;
        this.pltManagerProvider = provider3;
        this.orderManagerProvider = provider4;
        this.analyticsProvider = provider5;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OrderConfirmationFragment orderConfirmationFragment) {
        BaseFragment_MembersInjector.injectSingletons(orderConfirmationFragment, this.singletonsProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectCardManager(orderConfirmationFragment, this.cardManagerProvider.get());
        BaseOrderConfirmationFragment_MembersInjector.injectPltManager(orderConfirmationFragment, this.pltManagerProvider.get());
        injectOrderManager(orderConfirmationFragment, this.orderManagerProvider.get());
        injectAnalytics(orderConfirmationFragment, this.analyticsProvider.get());
    }

    public static MembersInjector<OrderConfirmationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<CardManager> provider2, Provider<PltManager> provider3, Provider<EquityOrderManager> provider4, Provider<AnalyticsLogger> provider5) {
        return new OrderConfirmationFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectOrderManager(OrderConfirmationFragment orderConfirmationFragment, EquityOrderManager equityOrderManager) {
        orderConfirmationFragment.orderManager = equityOrderManager;
    }

    public static void injectAnalytics(OrderConfirmationFragment orderConfirmationFragment, AnalyticsLogger analyticsLogger) {
        orderConfirmationFragment.analytics = analyticsLogger;
    }
}
