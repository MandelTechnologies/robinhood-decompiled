package com.robinhood.android.investFlow.paymentmethod;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes10.dex */
public final class InvestFlowPaymentMethodDuxo_MembersInjector implements MembersInjector<InvestFlowPaymentMethodDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private InvestFlowPaymentMethodDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InvestFlowPaymentMethodDuxo investFlowPaymentMethodDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(investFlowPaymentMethodDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(investFlowPaymentMethodDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(investFlowPaymentMethodDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<InvestFlowPaymentMethodDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new InvestFlowPaymentMethodDuxo_MembersInjector(provider, provider2, provider3);
    }
}
