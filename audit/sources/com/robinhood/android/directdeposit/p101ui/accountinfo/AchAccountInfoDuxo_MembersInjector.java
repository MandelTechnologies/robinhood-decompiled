package com.robinhood.android.directdeposit.p101ui.accountinfo;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class AchAccountInfoDuxo_MembersInjector implements MembersInjector<AchAccountInfoDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private AchAccountInfoDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AchAccountInfoDuxo achAccountInfoDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(achAccountInfoDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(achAccountInfoDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(achAccountInfoDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<AchAccountInfoDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new AchAccountInfoDuxo_MembersInjector(provider, provider2, provider3);
    }
}
