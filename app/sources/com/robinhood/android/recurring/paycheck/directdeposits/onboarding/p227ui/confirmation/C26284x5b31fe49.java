package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo_MembersInjector */
/* loaded from: classes11.dex */
public final class C26284x5b31fe49 implements MembersInjector<PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private C26284x5b31fe49(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(paycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PaycheckRecurringInvestmentsDdOnboardingDdConfirmationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new C26284x5b31fe49(provider, provider2, provider3);
    }
}
