package com.robinhood.android.directdeposit.p101ui.prefilled.submit;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class PreFilledFormSubmitDuxo_MembersInjector implements MembersInjector<PreFilledFormSubmitDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PreFilledFormSubmitDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PreFilledFormSubmitDuxo preFilledFormSubmitDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(preFilledFormSubmitDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(preFilledFormSubmitDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(preFilledFormSubmitDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PreFilledFormSubmitDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PreFilledFormSubmitDuxo_MembersInjector(provider, provider2, provider3);
    }
}
