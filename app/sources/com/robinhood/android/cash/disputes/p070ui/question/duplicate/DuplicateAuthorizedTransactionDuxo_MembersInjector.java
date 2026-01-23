package com.robinhood.android.cash.disputes.p070ui.question.duplicate;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class DuplicateAuthorizedTransactionDuxo_MembersInjector implements MembersInjector<DuplicateAuthorizedTransactionDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DuplicateAuthorizedTransactionDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DuplicateAuthorizedTransactionDuxo duplicateAuthorizedTransactionDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(duplicateAuthorizedTransactionDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(duplicateAuthorizedTransactionDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(duplicateAuthorizedTransactionDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DuplicateAuthorizedTransactionDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DuplicateAuthorizedTransactionDuxo_MembersInjector(provider, provider2, provider3);
    }
}
