package com.robinhood.android.recommendations.p224ui.walkthrough;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class RecommendationsWalkthroughDuxo_MembersInjector implements MembersInjector<RecommendationsWalkthroughDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecommendationsWalkthroughDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsWalkthroughDuxo recommendationsWalkthroughDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsWalkthroughDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsWalkthroughDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsWalkthroughDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsWalkthroughDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecommendationsWalkthroughDuxo_MembersInjector(provider, provider2, provider3);
    }
}
