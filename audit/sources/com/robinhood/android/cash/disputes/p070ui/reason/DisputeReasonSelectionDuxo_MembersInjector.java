package com.robinhood.android.cash.disputes.p070ui.reason;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class DisputeReasonSelectionDuxo_MembersInjector implements MembersInjector<DisputeReasonSelectionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DisputeReasonSelectionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DisputeReasonSelectionDuxo disputeReasonSelectionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(disputeReasonSelectionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(disputeReasonSelectionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(disputeReasonSelectionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DisputeReasonSelectionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DisputeReasonSelectionDuxo_MembersInjector(provider, provider2, provider3);
    }
}
