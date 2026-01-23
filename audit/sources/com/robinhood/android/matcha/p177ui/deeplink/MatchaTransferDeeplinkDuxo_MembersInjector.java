package com.robinhood.android.matcha.p177ui.deeplink;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class MatchaTransferDeeplinkDuxo_MembersInjector implements MembersInjector<MatchaTransferDeeplinkDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MatchaTransferDeeplinkDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchaTransferDeeplinkDuxo matchaTransferDeeplinkDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(matchaTransferDeeplinkDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(matchaTransferDeeplinkDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(matchaTransferDeeplinkDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MatchaTransferDeeplinkDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MatchaTransferDeeplinkDuxo_MembersInjector(provider, provider2, provider3);
    }
}
