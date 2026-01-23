package com.robinhood.android.common.options.upsell.alert;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class OptionAlertOnboardingDuxo_MembersInjector implements MembersInjector<OptionAlertOnboardingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private OptionAlertOnboardingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OptionAlertOnboardingDuxo optionAlertOnboardingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(optionAlertOnboardingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(optionAlertOnboardingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(optionAlertOnboardingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<OptionAlertOnboardingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new OptionAlertOnboardingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
