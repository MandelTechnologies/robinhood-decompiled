package com.robinhood.android.cash.transaction.p079ui.reward;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class CardTransactionRewardsBottomSheetDuxo_MembersInjector implements MembersInjector<CardTransactionRewardsBottomSheetDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CardTransactionRewardsBottomSheetDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CardTransactionRewardsBottomSheetDuxo cardTransactionRewardsBottomSheetDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(cardTransactionRewardsBottomSheetDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(cardTransactionRewardsBottomSheetDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(cardTransactionRewardsBottomSheetDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CardTransactionRewardsBottomSheetDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CardTransactionRewardsBottomSheetDuxo_MembersInjector(provider, provider2, provider3);
    }
}
