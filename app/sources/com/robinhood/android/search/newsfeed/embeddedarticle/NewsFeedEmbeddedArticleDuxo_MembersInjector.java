package com.robinhood.android.search.newsfeed.embeddedarticle;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class NewsFeedEmbeddedArticleDuxo_MembersInjector implements MembersInjector<NewsFeedEmbeddedArticleDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private NewsFeedEmbeddedArticleDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NewsFeedEmbeddedArticleDuxo newsFeedEmbeddedArticleDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(newsFeedEmbeddedArticleDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(newsFeedEmbeddedArticleDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(newsFeedEmbeddedArticleDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<NewsFeedEmbeddedArticleDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new NewsFeedEmbeddedArticleDuxo_MembersInjector(provider, provider2, provider3);
    }
}
