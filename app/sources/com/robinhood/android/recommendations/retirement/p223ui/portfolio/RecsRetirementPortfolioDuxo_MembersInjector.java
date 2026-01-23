package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class RecsRetirementPortfolioDuxo_MembersInjector implements MembersInjector<RecsRetirementPortfolioDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RecsRetirementPortfolioDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RecsRetirementPortfolioDuxo recsRetirementPortfolioDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(recsRetirementPortfolioDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(recsRetirementPortfolioDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(recsRetirementPortfolioDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RecsRetirementPortfolioDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RecsRetirementPortfolioDuxo_MembersInjector(provider, provider2, provider3);
    }
}
