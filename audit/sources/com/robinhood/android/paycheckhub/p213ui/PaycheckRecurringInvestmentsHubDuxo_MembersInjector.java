package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsHubDuxo_MembersInjector implements MembersInjector<PaycheckRecurringInvestmentsHubDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PaycheckRecurringInvestmentsHubDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaycheckRecurringInvestmentsHubDuxo paycheckRecurringInvestmentsHubDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(paycheckRecurringInvestmentsHubDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(paycheckRecurringInvestmentsHubDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(paycheckRecurringInvestmentsHubDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PaycheckRecurringInvestmentsHubDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PaycheckRecurringInvestmentsHubDuxo_MembersInjector(provider, provider2, provider3);
    }
}
