package com.robinhood.android.slip.onboarding.agreements;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class SlipOnboardingAgreementsDuxo_MembersInjector implements MembersInjector<SlipOnboardingAgreementsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private SlipOnboardingAgreementsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SlipOnboardingAgreementsDuxo slipOnboardingAgreementsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(slipOnboardingAgreementsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(slipOnboardingAgreementsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(slipOnboardingAgreementsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<SlipOnboardingAgreementsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new SlipOnboardingAgreementsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
