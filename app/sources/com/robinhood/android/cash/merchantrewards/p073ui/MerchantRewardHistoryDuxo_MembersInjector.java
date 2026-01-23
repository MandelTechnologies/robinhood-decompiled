package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class MerchantRewardHistoryDuxo_MembersInjector implements MembersInjector<MerchantRewardHistoryDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MerchantRewardHistoryDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MerchantRewardHistoryDuxo merchantRewardHistoryDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(merchantRewardHistoryDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(merchantRewardHistoryDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(merchantRewardHistoryDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MerchantRewardHistoryDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MerchantRewardHistoryDuxo_MembersInjector(provider, provider2, provider3);
    }
}
