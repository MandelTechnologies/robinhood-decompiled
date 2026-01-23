package com.robinhood.android.mcduckling.card.help.p179ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class CardReplacementConfirmationDuxo_MembersInjector implements MembersInjector<CardReplacementConfirmationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CardReplacementConfirmationDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardReplacementConfirmationDuxo cardReplacementConfirmationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(cardReplacementConfirmationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(cardReplacementConfirmationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(cardReplacementConfirmationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CardReplacementConfirmationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CardReplacementConfirmationDuxo_MembersInjector(provider, provider2, provider3);
    }
}
