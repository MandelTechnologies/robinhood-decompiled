package com.robinhood.android.taxcertification;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class TaxInfoConfirmDuxo_MembersInjector implements MembersInjector<TaxInfoConfirmDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private TaxInfoConfirmDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TaxInfoConfirmDuxo taxInfoConfirmDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(taxInfoConfirmDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(taxInfoConfirmDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(taxInfoConfirmDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<TaxInfoConfirmDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new TaxInfoConfirmDuxo_MembersInjector(provider, provider2, provider3);
    }
}
