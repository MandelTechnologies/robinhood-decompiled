package com.robinhood.android.recommendations.p224ui.risk;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class RecommendationsRiskProfileDuxo_MembersInjector implements MembersInjector<RecommendationsRiskProfileDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecommendationsRiskProfileDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecommendationsRiskProfileDuxo recommendationsRiskProfileDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recommendationsRiskProfileDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recommendationsRiskProfileDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recommendationsRiskProfileDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecommendationsRiskProfileDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecommendationsRiskProfileDuxo_MembersInjector(provider, provider2, provider3);
    }
}
