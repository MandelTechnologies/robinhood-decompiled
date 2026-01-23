package com.robinhood.android.directdeposit.p101ui.prefilled.employer;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class PreFilledFormEmployerDuxo_MembersInjector implements MembersInjector<PreFilledFormEmployerDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PreFilledFormEmployerDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PreFilledFormEmployerDuxo preFilledFormEmployerDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(preFilledFormEmployerDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(preFilledFormEmployerDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(preFilledFormEmployerDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PreFilledFormEmployerDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PreFilledFormEmployerDuxo_MembersInjector(provider, provider2, provider3);
    }
}
