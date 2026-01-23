package com.robinhood.android.cash.rewards.p074ui.onboarding.account;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class RewardsOnboardingAccountCreatedDuxo_MembersInjector implements MembersInjector<RewardsOnboardingAccountCreatedDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RewardsOnboardingAccountCreatedDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardsOnboardingAccountCreatedDuxo rewardsOnboardingAccountCreatedDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rewardsOnboardingAccountCreatedDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rewardsOnboardingAccountCreatedDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rewardsOnboardingAccountCreatedDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RewardsOnboardingAccountCreatedDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RewardsOnboardingAccountCreatedDuxo_MembersInjector(provider, provider2, provider3);
    }
}
