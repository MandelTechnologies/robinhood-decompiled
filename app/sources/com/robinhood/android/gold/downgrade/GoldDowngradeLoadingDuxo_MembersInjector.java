package com.robinhood.android.gold.downgrade;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes10.dex */
public final class GoldDowngradeLoadingDuxo_MembersInjector implements MembersInjector<GoldDowngradeLoadingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private GoldDowngradeLoadingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(GoldDowngradeLoadingDuxo goldDowngradeLoadingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(goldDowngradeLoadingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(goldDowngradeLoadingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(goldDowngradeLoadingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<GoldDowngradeLoadingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new GoldDowngradeLoadingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
