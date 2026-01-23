package com.robinhood.android.listsoptions.optionwatchlist;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class OptionWatchlistHubContentDuxo_MembersInjector implements MembersInjector<OptionWatchlistHubContentDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionWatchlistHubContentDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionWatchlistHubContentDuxo optionWatchlistHubContentDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionWatchlistHubContentDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionWatchlistHubContentDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionWatchlistHubContentDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionWatchlistHubContentDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionWatchlistHubContentDuxo_MembersInjector(provider, provider2, provider3);
    }
}
