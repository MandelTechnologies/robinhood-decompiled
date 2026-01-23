package com.robinhood.android.directdeposit.p101ui.prefilled.partial.input;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class PreFilledFormAmountInputDuxo_MembersInjector implements MembersInjector<PreFilledFormAmountInputDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PreFilledFormAmountInputDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PreFilledFormAmountInputDuxo preFilledFormAmountInputDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(preFilledFormAmountInputDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(preFilledFormAmountInputDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(preFilledFormAmountInputDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PreFilledFormAmountInputDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PreFilledFormAmountInputDuxo_MembersInjector(provider, provider2, provider3);
    }
}
