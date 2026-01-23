package com.robinhood.android.advanced.alert.alerthub;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes24.dex */
public final class AlertHubCreateIndicatorAlertDuxo_MembersInjector implements MembersInjector<AlertHubCreateIndicatorAlertDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private AlertHubCreateIndicatorAlertDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AlertHubCreateIndicatorAlertDuxo alertHubCreateIndicatorAlertDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(alertHubCreateIndicatorAlertDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(alertHubCreateIndicatorAlertDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(alertHubCreateIndicatorAlertDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<AlertHubCreateIndicatorAlertDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new AlertHubCreateIndicatorAlertDuxo_MembersInjector(provider, provider2, provider3);
    }
}
