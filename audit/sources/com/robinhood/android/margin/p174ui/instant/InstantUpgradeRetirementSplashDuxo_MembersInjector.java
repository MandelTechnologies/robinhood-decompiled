package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementSplashDuxo_MembersInjector implements MembersInjector<InstantUpgradeRetirementSplashDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private InstantUpgradeRetirementSplashDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstantUpgradeRetirementSplashDuxo instantUpgradeRetirementSplashDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(instantUpgradeRetirementSplashDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(instantUpgradeRetirementSplashDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(instantUpgradeRetirementSplashDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<InstantUpgradeRetirementSplashDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new InstantUpgradeRetirementSplashDuxo_MembersInjector(provider, provider2, provider3);
    }
}
