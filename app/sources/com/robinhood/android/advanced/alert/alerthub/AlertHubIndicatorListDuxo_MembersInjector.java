package com.robinhood.android.advanced.alert.alerthub;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes24.dex */
public final class AlertHubIndicatorListDuxo_MembersInjector implements MembersInjector<AlertHubIndicatorListDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private AlertHubIndicatorListDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AlertHubIndicatorListDuxo alertHubIndicatorListDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(alertHubIndicatorListDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(alertHubIndicatorListDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(alertHubIndicatorListDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<AlertHubIndicatorListDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new AlertHubIndicatorListDuxo_MembersInjector(provider, provider2, provider3);
    }
}
