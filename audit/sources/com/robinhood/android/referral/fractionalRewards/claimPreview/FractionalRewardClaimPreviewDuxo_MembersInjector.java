package com.robinhood.android.referral.fractionalRewards.claimPreview;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class FractionalRewardClaimPreviewDuxo_MembersInjector implements MembersInjector<FractionalRewardClaimPreviewDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private FractionalRewardClaimPreviewDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FractionalRewardClaimPreviewDuxo fractionalRewardClaimPreviewDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(fractionalRewardClaimPreviewDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(fractionalRewardClaimPreviewDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(fractionalRewardClaimPreviewDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<FractionalRewardClaimPreviewDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new FractionalRewardClaimPreviewDuxo_MembersInjector(provider, provider2, provider3);
    }
}
