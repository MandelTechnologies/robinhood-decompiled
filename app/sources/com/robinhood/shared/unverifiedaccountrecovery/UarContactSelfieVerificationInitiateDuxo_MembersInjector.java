package com.robinhood.shared.unverifiedaccountrecovery;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes12.dex */
public final class UarContactSelfieVerificationInitiateDuxo_MembersInjector implements MembersInjector<UarContactSelfieVerificationInitiateDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private UarContactSelfieVerificationInitiateDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UarContactSelfieVerificationInitiateDuxo uarContactSelfieVerificationInitiateDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(uarContactSelfieVerificationInitiateDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(uarContactSelfieVerificationInitiateDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(uarContactSelfieVerificationInitiateDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<UarContactSelfieVerificationInitiateDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new UarContactSelfieVerificationInitiateDuxo_MembersInjector(provider, provider2, provider3);
    }
}
