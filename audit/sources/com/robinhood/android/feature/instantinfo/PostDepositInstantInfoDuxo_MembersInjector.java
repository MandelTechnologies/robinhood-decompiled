package com.robinhood.android.feature.instantinfo;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes3.dex */
public final class PostDepositInstantInfoDuxo_MembersInjector implements MembersInjector<PostDepositInstantInfoDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PostDepositInstantInfoDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PostDepositInstantInfoDuxo postDepositInstantInfoDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(postDepositInstantInfoDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(postDepositInstantInfoDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(postDepositInstantInfoDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PostDepositInstantInfoDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PostDepositInstantInfoDuxo_MembersInjector(provider, provider2, provider3);
    }
}
