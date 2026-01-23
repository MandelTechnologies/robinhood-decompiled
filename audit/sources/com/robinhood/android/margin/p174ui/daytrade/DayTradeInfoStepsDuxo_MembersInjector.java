package com.robinhood.android.margin.p174ui.daytrade;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class DayTradeInfoStepsDuxo_MembersInjector implements MembersInjector<DayTradeInfoStepsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DayTradeInfoStepsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DayTradeInfoStepsDuxo dayTradeInfoStepsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(dayTradeInfoStepsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(dayTradeInfoStepsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(dayTradeInfoStepsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DayTradeInfoStepsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DayTradeInfoStepsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
