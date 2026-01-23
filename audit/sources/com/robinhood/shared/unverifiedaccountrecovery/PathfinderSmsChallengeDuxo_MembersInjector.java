package com.robinhood.shared.unverifiedaccountrecovery;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes12.dex */
public final class PathfinderSmsChallengeDuxo_MembersInjector implements MembersInjector<PathfinderSmsChallengeDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PathfinderSmsChallengeDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PathfinderSmsChallengeDuxo pathfinderSmsChallengeDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(pathfinderSmsChallengeDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(pathfinderSmsChallengeDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(pathfinderSmsChallengeDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PathfinderSmsChallengeDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PathfinderSmsChallengeDuxo_MembersInjector(provider, provider2, provider3);
    }
}
