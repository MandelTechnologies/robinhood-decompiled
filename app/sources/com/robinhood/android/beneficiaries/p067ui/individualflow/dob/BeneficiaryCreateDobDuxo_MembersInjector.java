package com.robinhood.android.beneficiaries.p067ui.individualflow.dob;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class BeneficiaryCreateDobDuxo_MembersInjector implements MembersInjector<BeneficiaryCreateDobDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private BeneficiaryCreateDobDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BeneficiaryCreateDobDuxo beneficiaryCreateDobDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(beneficiaryCreateDobDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(beneficiaryCreateDobDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(beneficiaryCreateDobDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<BeneficiaryCreateDobDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new BeneficiaryCreateDobDuxo_MembersInjector(provider, provider2, provider3);
    }
}
