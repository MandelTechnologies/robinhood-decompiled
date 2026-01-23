package com.robinhood.android.transfers.pathfinder.p269ui.transferfunds;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class PathfinderTransferFundsDuxo_MembersInjector implements MembersInjector<PathfinderTransferFundsDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PathfinderTransferFundsDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PathfinderTransferFundsDuxo pathfinderTransferFundsDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(pathfinderTransferFundsDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(pathfinderTransferFundsDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(pathfinderTransferFundsDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PathfinderTransferFundsDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PathfinderTransferFundsDuxo_MembersInjector(provider, provider2, provider3);
    }
}
