package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class RewardsOnboardingAssetSelectionDuxo_MembersInjector implements MembersInjector<RewardsOnboardingAssetSelectionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RewardsOnboardingAssetSelectionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardsOnboardingAssetSelectionDuxo rewardsOnboardingAssetSelectionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rewardsOnboardingAssetSelectionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rewardsOnboardingAssetSelectionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rewardsOnboardingAssetSelectionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RewardsOnboardingAssetSelectionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RewardsOnboardingAssetSelectionDuxo_MembersInjector(provider, provider2, provider3);
    }
}
