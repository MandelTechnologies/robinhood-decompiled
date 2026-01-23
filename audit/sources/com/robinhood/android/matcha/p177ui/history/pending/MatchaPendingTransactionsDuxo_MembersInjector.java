package com.robinhood.android.matcha.p177ui.history.pending;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class MatchaPendingTransactionsDuxo_MembersInjector implements MembersInjector<MatchaPendingTransactionsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MatchaPendingTransactionsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchaPendingTransactionsDuxo matchaPendingTransactionsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(matchaPendingTransactionsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(matchaPendingTransactionsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(matchaPendingTransactionsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MatchaPendingTransactionsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MatchaPendingTransactionsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
