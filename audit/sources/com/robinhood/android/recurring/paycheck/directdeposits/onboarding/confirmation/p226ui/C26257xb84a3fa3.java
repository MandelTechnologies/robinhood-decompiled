package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.p226ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* renamed from: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.confirmation.ui.DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo_MembersInjector */
/* loaded from: classes11.dex */
public final class C26257xb84a3fa3 implements MembersInjector<DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private C26257xb84a3fa3(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo directDepositPaycheckRecurringInvestmentsConfirmationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(directDepositPaycheckRecurringInvestmentsConfirmationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(directDepositPaycheckRecurringInvestmentsConfirmationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(directDepositPaycheckRecurringInvestmentsConfirmationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DirectDepositPaycheckRecurringInvestmentsConfirmationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new C26257xb84a3fa3(provider, provider2, provider3);
    }
}
