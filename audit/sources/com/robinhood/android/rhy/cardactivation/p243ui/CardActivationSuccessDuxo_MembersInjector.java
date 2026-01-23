package com.robinhood.android.rhy.cardactivation.p243ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class CardActivationSuccessDuxo_MembersInjector implements MembersInjector<CardActivationSuccessDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CardActivationSuccessDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardActivationSuccessDuxo cardActivationSuccessDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(cardActivationSuccessDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(cardActivationSuccessDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(cardActivationSuccessDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CardActivationSuccessDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CardActivationSuccessDuxo_MembersInjector(provider, provider2, provider3);
    }
}
