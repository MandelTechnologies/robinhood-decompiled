package com.robinhood.android.cash.merchantrewards.p073ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class MerchantRewardsOfferTermsDuxo_MembersInjector implements MembersInjector<MerchantRewardsOfferTermsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MerchantRewardsOfferTermsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MerchantRewardsOfferTermsDuxo merchantRewardsOfferTermsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(merchantRewardsOfferTermsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(merchantRewardsOfferTermsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(merchantRewardsOfferTermsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MerchantRewardsOfferTermsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MerchantRewardsOfferTermsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
