package com.robinhood.android.directdeposit.p101ui.redirect;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class RedirectDirectDepositBottomSheetDuxo_MembersInjector implements MembersInjector<RedirectDirectDepositBottomSheetDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private RedirectDirectDepositBottomSheetDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(RedirectDirectDepositBottomSheetDuxo redirectDirectDepositBottomSheetDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(redirectDirectDepositBottomSheetDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(redirectDirectDepositBottomSheetDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(redirectDirectDepositBottomSheetDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<RedirectDirectDepositBottomSheetDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new RedirectDirectDepositBottomSheetDuxo_MembersInjector(provider, provider2, provider3);
    }
}
