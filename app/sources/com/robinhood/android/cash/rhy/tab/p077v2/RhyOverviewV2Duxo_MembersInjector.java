package com.robinhood.android.cash.rhy.tab.p077v2;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class RhyOverviewV2Duxo_MembersInjector implements MembersInjector<RhyOverviewV2Duxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RhyOverviewV2Duxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RhyOverviewV2Duxo rhyOverviewV2Duxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(rhyOverviewV2Duxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(rhyOverviewV2Duxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(rhyOverviewV2Duxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RhyOverviewV2Duxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RhyOverviewV2Duxo_MembersInjector(provider, provider2, provider3);
    }
}
