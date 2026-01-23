package com.robinhood.android.beneficiaries.p067ui.individualflow.relationship;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class BeneficiaryCreateRelationshipDuxo_MembersInjector implements MembersInjector<BeneficiaryCreateRelationshipDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private BeneficiaryCreateRelationshipDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BeneficiaryCreateRelationshipDuxo beneficiaryCreateRelationshipDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(beneficiaryCreateRelationshipDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(beneficiaryCreateRelationshipDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(beneficiaryCreateRelationshipDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<BeneficiaryCreateRelationshipDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new BeneficiaryCreateRelationshipDuxo_MembersInjector(provider, provider2, provider3);
    }
}
