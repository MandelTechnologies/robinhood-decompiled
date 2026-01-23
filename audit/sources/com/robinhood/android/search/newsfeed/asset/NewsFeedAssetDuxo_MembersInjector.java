package com.robinhood.android.search.newsfeed.asset;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class NewsFeedAssetDuxo_MembersInjector implements MembersInjector<NewsFeedAssetDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private NewsFeedAssetDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedAssetDuxo newsFeedAssetDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(newsFeedAssetDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(newsFeedAssetDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(newsFeedAssetDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<NewsFeedAssetDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new NewsFeedAssetDuxo_MembersInjector(provider, provider2, provider3);
    }
}
