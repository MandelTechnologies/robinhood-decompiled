package com.robinhood.shared.unverifiedaccountrecovery.phone;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes12.dex */
public final class UarSmsMfaEnrollPhoneInputDuxo_MembersInjector implements MembersInjector<UarSmsMfaEnrollPhoneInputDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private UarSmsMfaEnrollPhoneInputDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UarSmsMfaEnrollPhoneInputDuxo uarSmsMfaEnrollPhoneInputDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(uarSmsMfaEnrollPhoneInputDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(uarSmsMfaEnrollPhoneInputDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(uarSmsMfaEnrollPhoneInputDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<UarSmsMfaEnrollPhoneInputDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new UarSmsMfaEnrollPhoneInputDuxo_MembersInjector(provider, provider2, provider3);
    }
}
