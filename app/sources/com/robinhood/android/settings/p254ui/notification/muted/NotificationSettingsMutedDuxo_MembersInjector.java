package com.robinhood.android.settings.p254ui.notification.muted;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class NotificationSettingsMutedDuxo_MembersInjector implements MembersInjector<NotificationSettingsMutedDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private NotificationSettingsMutedDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationSettingsMutedDuxo notificationSettingsMutedDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(notificationSettingsMutedDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(notificationSettingsMutedDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(notificationSettingsMutedDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<NotificationSettingsMutedDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new NotificationSettingsMutedDuxo_MembersInjector(provider, provider2, provider3);
    }
}
