package com.robinhood.android.search.newsfeed.videoplayer;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class NewsFeedVideoPlayerDuxo_MembersInjector implements MembersInjector<NewsFeedVideoPlayerDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private NewsFeedVideoPlayerDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedVideoPlayerDuxo newsFeedVideoPlayerDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(newsFeedVideoPlayerDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(newsFeedVideoPlayerDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(newsFeedVideoPlayerDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<NewsFeedVideoPlayerDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new NewsFeedVideoPlayerDuxo_MembersInjector(provider, provider2, provider3);
    }
}
