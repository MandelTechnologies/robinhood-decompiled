package com.robinhood.android.directdeposit.p101ui.deeplink;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class DirectDepositFormDuxo_MembersInjector implements MembersInjector<DirectDepositFormDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DirectDepositFormDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectDepositFormDuxo directDepositFormDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(directDepositFormDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(directDepositFormDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(directDepositFormDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DirectDepositFormDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DirectDepositFormDuxo_MembersInjector(provider, provider2, provider3);
    }
}
