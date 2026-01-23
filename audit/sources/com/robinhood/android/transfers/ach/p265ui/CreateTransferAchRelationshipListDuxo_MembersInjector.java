package com.robinhood.android.transfers.ach.p265ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class CreateTransferAchRelationshipListDuxo_MembersInjector implements MembersInjector<CreateTransferAchRelationshipListDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CreateTransferAchRelationshipListDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CreateTransferAchRelationshipListDuxo createTransferAchRelationshipListDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(createTransferAchRelationshipListDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(createTransferAchRelationshipListDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(createTransferAchRelationshipListDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CreateTransferAchRelationshipListDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CreateTransferAchRelationshipListDuxo_MembersInjector(provider, provider2, provider3);
    }
}
