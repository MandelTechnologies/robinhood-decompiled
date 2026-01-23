package com.robinhood.android.trade.recommendations.p262ui.disclosures;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class RecommendationsDisclosuresDuxo_MembersInjector implements MembersInjector<RecommendationsDisclosuresDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecommendationsDisclosuresDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsDisclosuresDuxo recommendationsDisclosuresDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsDisclosuresDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsDisclosuresDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsDisclosuresDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsDisclosuresDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecommendationsDisclosuresDuxo_MembersInjector(provider, provider2, provider3);
    }
}
