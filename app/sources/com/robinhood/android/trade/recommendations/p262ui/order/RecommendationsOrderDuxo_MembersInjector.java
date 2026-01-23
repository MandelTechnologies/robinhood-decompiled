package com.robinhood.android.trade.recommendations.p262ui.order;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class RecommendationsOrderDuxo_MembersInjector implements MembersInjector<RecommendationsOrderDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecommendationsOrderDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsOrderDuxo recommendationsOrderDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsOrderDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsOrderDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsOrderDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsOrderDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecommendationsOrderDuxo_MembersInjector(provider, provider2, provider3);
    }
}
