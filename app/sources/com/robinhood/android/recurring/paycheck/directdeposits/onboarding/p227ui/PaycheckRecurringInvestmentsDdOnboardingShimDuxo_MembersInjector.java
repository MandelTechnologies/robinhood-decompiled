package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingShimDuxo_MembersInjector implements MembersInjector<PaycheckRecurringInvestmentsDdOnboardingShimDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PaycheckRecurringInvestmentsDdOnboardingShimDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaycheckRecurringInvestmentsDdOnboardingShimDuxo paycheckRecurringInvestmentsDdOnboardingShimDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(paycheckRecurringInvestmentsDdOnboardingShimDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(paycheckRecurringInvestmentsDdOnboardingShimDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(paycheckRecurringInvestmentsDdOnboardingShimDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PaycheckRecurringInvestmentsDdOnboardingShimDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PaycheckRecurringInvestmentsDdOnboardingShimDuxo_MembersInjector(provider, provider2, provider3);
    }
}
