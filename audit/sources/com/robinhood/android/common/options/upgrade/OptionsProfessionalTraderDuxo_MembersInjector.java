package com.robinhood.android.common.options.upgrade;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class OptionsProfessionalTraderDuxo_MembersInjector implements MembersInjector<OptionsProfessionalTraderDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionsProfessionalTraderDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionsProfessionalTraderDuxo optionsProfessionalTraderDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionsProfessionalTraderDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionsProfessionalTraderDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionsProfessionalTraderDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionsProfessionalTraderDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionsProfessionalTraderDuxo_MembersInjector(provider, provider2, provider3);
    }
}
