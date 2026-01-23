package com.robinhood.android.settings.settings.account.trustedcontact;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class TrustedContactUpdateDuxo_MembersInjector implements MembersInjector<TrustedContactUpdateDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private TrustedContactUpdateDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TrustedContactUpdateDuxo trustedContactUpdateDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(trustedContactUpdateDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(trustedContactUpdateDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(trustedContactUpdateDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<TrustedContactUpdateDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new TrustedContactUpdateDuxo_MembersInjector(provider, provider2, provider3);
    }
}
