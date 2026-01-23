package com.robinhood.android.cash.rhy.tab.p076ui.transfers;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class TransferFundsBottomSheetDuxo_MembersInjector implements MembersInjector<TransferFundsBottomSheetDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private TransferFundsBottomSheetDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TransferFundsBottomSheetDuxo transferFundsBottomSheetDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(transferFundsBottomSheetDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(transferFundsBottomSheetDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(transferFundsBottomSheetDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<TransferFundsBottomSheetDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new TransferFundsBottomSheetDuxo_MembersInjector(provider, provider2, provider3);
    }
}
