package com.robinhood.android.trade.options.configuration;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class OptionConfigurationSelectionDuxo_MembersInjector implements MembersInjector<OptionConfigurationSelectionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionConfigurationSelectionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionConfigurationSelectionDuxo optionConfigurationSelectionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionConfigurationSelectionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionConfigurationSelectionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionConfigurationSelectionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionConfigurationSelectionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionConfigurationSelectionDuxo_MembersInjector(provider, provider2, provider3);
    }
}
