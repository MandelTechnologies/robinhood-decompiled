package com.robinhood.android.search.newsfeed.marketupdates;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class NewsFeedMarketIndicesViewDuxo_MembersInjector implements MembersInjector<NewsFeedMarketIndicesViewDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private NewsFeedMarketIndicesViewDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedMarketIndicesViewDuxo newsFeedMarketIndicesViewDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(newsFeedMarketIndicesViewDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(newsFeedMarketIndicesViewDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(newsFeedMarketIndicesViewDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<NewsFeedMarketIndicesViewDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new NewsFeedMarketIndicesViewDuxo_MembersInjector(provider, provider2, provider3);
    }
}
