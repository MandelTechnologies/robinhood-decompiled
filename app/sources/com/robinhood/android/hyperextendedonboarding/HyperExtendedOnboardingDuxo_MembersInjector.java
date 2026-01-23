package com.robinhood.android.hyperextendedonboarding;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes10.dex */
public final class HyperExtendedOnboardingDuxo_MembersInjector implements MembersInjector<HyperExtendedOnboardingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private HyperExtendedOnboardingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HyperExtendedOnboardingDuxo hyperExtendedOnboardingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(hyperExtendedOnboardingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(hyperExtendedOnboardingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(hyperExtendedOnboardingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<HyperExtendedOnboardingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new HyperExtendedOnboardingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
