package com.robinhood.shared.unverifiedaccountrecovery.email;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes12.dex */
public final class PathfinderEmailChallengeDuxo_MembersInjector implements MembersInjector<PathfinderEmailChallengeDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PathfinderEmailChallengeDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PathfinderEmailChallengeDuxo pathfinderEmailChallengeDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(pathfinderEmailChallengeDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(pathfinderEmailChallengeDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(pathfinderEmailChallengeDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PathfinderEmailChallengeDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PathfinderEmailChallengeDuxo_MembersInjector(provider, provider2, provider3);
    }
}
