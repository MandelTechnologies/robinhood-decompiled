package com.robinhood.android.cash.rewards.p074ui.notification;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class RewardsNotificationDetailsDuxo_MembersInjector implements MembersInjector<RewardsNotificationDetailsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RewardsNotificationDetailsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RewardsNotificationDetailsDuxo rewardsNotificationDetailsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rewardsNotificationDetailsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rewardsNotificationDetailsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rewardsNotificationDetailsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RewardsNotificationDetailsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RewardsNotificationDetailsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
