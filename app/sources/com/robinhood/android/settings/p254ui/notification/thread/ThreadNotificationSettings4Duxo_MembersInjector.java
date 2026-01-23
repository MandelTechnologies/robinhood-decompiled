package com.robinhood.android.settings.p254ui.notification.thread;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class ThreadNotificationSettings4Duxo_MembersInjector implements MembersInjector<ThreadNotificationSettings4Duxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private ThreadNotificationSettings4Duxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ThreadNotificationSettings4Duxo threadNotificationSettings4Duxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(threadNotificationSettings4Duxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(threadNotificationSettings4Duxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(threadNotificationSettings4Duxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<ThreadNotificationSettings4Duxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new ThreadNotificationSettings4Duxo_MembersInjector(provider, provider2, provider3);
    }
}
