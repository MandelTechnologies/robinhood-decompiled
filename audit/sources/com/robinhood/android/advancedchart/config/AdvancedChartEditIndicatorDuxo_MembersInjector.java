package com.robinhood.android.advancedchart.config;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes24.dex */
public final class AdvancedChartEditIndicatorDuxo_MembersInjector implements MembersInjector<AdvancedChartEditIndicatorDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private AdvancedChartEditIndicatorDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AdvancedChartEditIndicatorDuxo advancedChartEditIndicatorDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(advancedChartEditIndicatorDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(advancedChartEditIndicatorDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(advancedChartEditIndicatorDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<AdvancedChartEditIndicatorDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new AdvancedChartEditIndicatorDuxo_MembersInjector(provider, provider2, provider3);
    }
}
