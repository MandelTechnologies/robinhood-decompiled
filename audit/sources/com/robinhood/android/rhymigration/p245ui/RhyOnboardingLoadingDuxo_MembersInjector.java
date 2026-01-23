package com.robinhood.android.rhymigration.p245ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class RhyOnboardingLoadingDuxo_MembersInjector implements MembersInjector<RhyOnboardingLoadingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RhyOnboardingLoadingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyOnboardingLoadingDuxo rhyOnboardingLoadingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rhyOnboardingLoadingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rhyOnboardingLoadingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rhyOnboardingLoadingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RhyOnboardingLoadingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RhyOnboardingLoadingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
