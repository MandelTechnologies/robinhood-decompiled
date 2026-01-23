package com.robinhood.android.equitydetail.p123ui.leveltwo;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes3.dex */
public final class Level2Duxo_MembersInjector implements MembersInjector<Level2Duxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private Level2Duxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(Level2Duxo level2Duxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(level2Duxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(level2Duxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(level2Duxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<Level2Duxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new Level2Duxo_MembersInjector(provider, provider2, provider3);
    }
}
