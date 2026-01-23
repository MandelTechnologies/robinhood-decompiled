package com.robinhood.shared.crypto.transfer.enrollment.valueProps.loading;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes6.dex */
public final class WalletEnrollmentLoadingDuxo_MembersInjector implements MembersInjector<WalletEnrollmentLoadingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private WalletEnrollmentLoadingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WalletEnrollmentLoadingDuxo walletEnrollmentLoadingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(walletEnrollmentLoadingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(walletEnrollmentLoadingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(walletEnrollmentLoadingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<WalletEnrollmentLoadingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new WalletEnrollmentLoadingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
