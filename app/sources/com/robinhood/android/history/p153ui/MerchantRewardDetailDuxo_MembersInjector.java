package com.robinhood.android.history.p153ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes10.dex */
public final class MerchantRewardDetailDuxo_MembersInjector implements MembersInjector<MerchantRewardDetailDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MerchantRewardDetailDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MerchantRewardDetailDuxo merchantRewardDetailDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(merchantRewardDetailDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(merchantRewardDetailDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(merchantRewardDetailDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MerchantRewardDetailDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MerchantRewardDetailDuxo_MembersInjector(provider, provider2, provider3);
    }
}
