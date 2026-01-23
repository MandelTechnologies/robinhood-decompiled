package com.robinhood.android.mcduckling.card.help.p179ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class CardAddToGooglePayDuxo_MembersInjector implements MembersInjector<CardAddToGooglePayDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CardAddToGooglePayDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardAddToGooglePayDuxo cardAddToGooglePayDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(cardAddToGooglePayDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(cardAddToGooglePayDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(cardAddToGooglePayDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CardAddToGooglePayDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CardAddToGooglePayDuxo_MembersInjector(provider, provider2, provider3);
    }
}
