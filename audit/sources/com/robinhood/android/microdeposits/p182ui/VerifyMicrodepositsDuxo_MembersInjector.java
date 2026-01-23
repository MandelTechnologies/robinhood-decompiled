package com.robinhood.android.microdeposits.p182ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class VerifyMicrodepositsDuxo_MembersInjector implements MembersInjector<VerifyMicrodepositsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private VerifyMicrodepositsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VerifyMicrodepositsDuxo verifyMicrodepositsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(verifyMicrodepositsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(verifyMicrodepositsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(verifyMicrodepositsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<VerifyMicrodepositsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new VerifyMicrodepositsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
