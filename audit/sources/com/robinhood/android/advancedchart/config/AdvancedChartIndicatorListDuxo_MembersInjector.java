package com.robinhood.android.advancedchart.config;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes24.dex */
public final class AdvancedChartIndicatorListDuxo_MembersInjector implements MembersInjector<AdvancedChartIndicatorListDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private AdvancedChartIndicatorListDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AdvancedChartIndicatorListDuxo advancedChartIndicatorListDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(advancedChartIndicatorListDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(advancedChartIndicatorListDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(advancedChartIndicatorListDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<AdvancedChartIndicatorListDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new AdvancedChartIndicatorListDuxo_MembersInjector(provider, provider2, provider3);
    }
}
