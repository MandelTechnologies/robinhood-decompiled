package com.robinhood.feature.sweep.onboarding;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes15.dex */
public final class SweepOnboardingEnrollmentDuxo_MembersInjector implements MembersInjector<SweepOnboardingEnrollmentDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private SweepOnboardingEnrollmentDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SweepOnboardingEnrollmentDuxo sweepOnboardingEnrollmentDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(sweepOnboardingEnrollmentDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(sweepOnboardingEnrollmentDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(sweepOnboardingEnrollmentDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<SweepOnboardingEnrollmentDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new SweepOnboardingEnrollmentDuxo_MembersInjector(provider, provider2, provider3);
    }
}
