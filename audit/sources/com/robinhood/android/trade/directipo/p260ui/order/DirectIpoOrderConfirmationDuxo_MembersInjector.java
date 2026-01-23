package com.robinhood.android.trade.directipo.p260ui.order;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class DirectIpoOrderConfirmationDuxo_MembersInjector implements MembersInjector<DirectIpoOrderConfirmationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DirectIpoOrderConfirmationDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoOrderConfirmationDuxo directIpoOrderConfirmationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(directIpoOrderConfirmationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(directIpoOrderConfirmationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(directIpoOrderConfirmationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DirectIpoOrderConfirmationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DirectIpoOrderConfirmationDuxo_MembersInjector(provider, provider2, provider3);
    }
}
