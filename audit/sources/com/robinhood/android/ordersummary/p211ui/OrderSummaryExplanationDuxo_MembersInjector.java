package com.robinhood.android.ordersummary.p211ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class OrderSummaryExplanationDuxo_MembersInjector implements MembersInjector<OrderSummaryExplanationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OrderSummaryExplanationDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OrderSummaryExplanationDuxo orderSummaryExplanationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(orderSummaryExplanationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(orderSummaryExplanationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(orderSummaryExplanationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OrderSummaryExplanationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OrderSummaryExplanationDuxo_MembersInjector(provider, provider2, provider3);
    }
}
