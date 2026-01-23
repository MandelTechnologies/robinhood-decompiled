package com.robinhood.shared.unverifiedaccountrecovery.phone;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes12.dex */
public final class PathfinderSmsMfaEnrollOtpDuxo_MembersInjector implements MembersInjector<PathfinderSmsMfaEnrollOtpDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PathfinderSmsMfaEnrollOtpDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PathfinderSmsMfaEnrollOtpDuxo pathfinderSmsMfaEnrollOtpDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(pathfinderSmsMfaEnrollOtpDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(pathfinderSmsMfaEnrollOtpDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(pathfinderSmsMfaEnrollOtpDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PathfinderSmsMfaEnrollOtpDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PathfinderSmsMfaEnrollOtpDuxo_MembersInjector(provider, provider2, provider3);
    }
}
