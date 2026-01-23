package com.robinhood.shared.unverifiedaccountrecovery.email;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes12.dex */
public final class UarEmailUpdateInputDuxo_MembersInjector implements MembersInjector<UarEmailUpdateInputDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private UarEmailUpdateInputDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UarEmailUpdateInputDuxo uarEmailUpdateInputDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(uarEmailUpdateInputDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(uarEmailUpdateInputDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(uarEmailUpdateInputDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<UarEmailUpdateInputDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new UarEmailUpdateInputDuxo_MembersInjector(provider, provider2, provider3);
    }
}
