package com.robinhood.android.optionsrolling.p209ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class OptionRollingStrategyDuxo_MembersInjector implements MembersInjector<OptionRollingStrategyDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionRollingStrategyDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionRollingStrategyDuxo optionRollingStrategyDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionRollingStrategyDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionRollingStrategyDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionRollingStrategyDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionRollingStrategyDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionRollingStrategyDuxo_MembersInjector(provider, provider2, provider3);
    }
}
