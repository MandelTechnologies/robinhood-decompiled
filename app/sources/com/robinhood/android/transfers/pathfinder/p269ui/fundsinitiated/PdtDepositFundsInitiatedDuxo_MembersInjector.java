package com.robinhood.android.transfers.pathfinder.p269ui.fundsinitiated;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class PdtDepositFundsInitiatedDuxo_MembersInjector implements MembersInjector<PdtDepositFundsInitiatedDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PdtDepositFundsInitiatedDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PdtDepositFundsInitiatedDuxo pdtDepositFundsInitiatedDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(pdtDepositFundsInitiatedDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(pdtDepositFundsInitiatedDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(pdtDepositFundsInitiatedDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PdtDepositFundsInitiatedDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PdtDepositFundsInitiatedDuxo_MembersInjector(provider, provider2, provider3);
    }
}
