package com.robinhood.android.recommendations.p224ui.risk;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class RecommendationsRiskProfileLandingDuxo_MembersInjector implements MembersInjector<RecommendationsRiskProfileLandingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecommendationsRiskProfileLandingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsRiskProfileLandingDuxo recommendationsRiskProfileLandingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsRiskProfileLandingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsRiskProfileLandingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsRiskProfileLandingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsRiskProfileLandingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecommendationsRiskProfileLandingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
