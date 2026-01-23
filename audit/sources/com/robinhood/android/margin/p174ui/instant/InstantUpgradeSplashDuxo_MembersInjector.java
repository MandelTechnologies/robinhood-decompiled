package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class InstantUpgradeSplashDuxo_MembersInjector implements MembersInjector<InstantUpgradeSplashDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private InstantUpgradeSplashDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstantUpgradeSplashDuxo instantUpgradeSplashDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(instantUpgradeSplashDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(instantUpgradeSplashDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(instantUpgradeSplashDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<InstantUpgradeSplashDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new InstantUpgradeSplashDuxo_MembersInjector(provider, provider2, provider3);
    }
}
