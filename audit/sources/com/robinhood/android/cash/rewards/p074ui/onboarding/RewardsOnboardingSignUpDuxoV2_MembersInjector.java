package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class RewardsOnboardingSignUpDuxoV2_MembersInjector implements MembersInjector<RewardsOnboardingSignUpDuxoV2> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RewardsOnboardingSignUpDuxoV2_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardsOnboardingSignUpDuxoV2 rewardsOnboardingSignUpDuxoV2) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rewardsOnboardingSignUpDuxoV2, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rewardsOnboardingSignUpDuxoV2, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rewardsOnboardingSignUpDuxoV2, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RewardsOnboardingSignUpDuxoV2> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RewardsOnboardingSignUpDuxoV2_MembersInjector(provider, provider2, provider3);
    }
}
