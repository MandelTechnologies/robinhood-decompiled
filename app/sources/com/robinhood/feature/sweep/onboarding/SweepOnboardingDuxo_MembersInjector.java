package com.robinhood.feature.sweep.onboarding;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes15.dex */
public final class SweepOnboardingDuxo_MembersInjector implements MembersInjector<SweepOnboardingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private SweepOnboardingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SweepOnboardingDuxo sweepOnboardingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(sweepOnboardingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(sweepOnboardingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(sweepOnboardingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<SweepOnboardingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new SweepOnboardingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
