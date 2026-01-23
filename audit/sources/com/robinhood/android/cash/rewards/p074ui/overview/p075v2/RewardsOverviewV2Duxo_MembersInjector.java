package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class RewardsOverviewV2Duxo_MembersInjector implements MembersInjector<RewardsOverviewV2Duxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RewardsOverviewV2Duxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardsOverviewV2Duxo rewardsOverviewV2Duxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rewardsOverviewV2Duxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rewardsOverviewV2Duxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rewardsOverviewV2Duxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RewardsOverviewV2Duxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RewardsOverviewV2Duxo_MembersInjector(provider, provider2, provider3);
    }
}
