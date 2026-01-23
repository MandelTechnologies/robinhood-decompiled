package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementAgreementDuxo_MembersInjector implements MembersInjector<InstantUpgradeRetirementAgreementDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private InstantUpgradeRetirementAgreementDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(InstantUpgradeRetirementAgreementDuxo instantUpgradeRetirementAgreementDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(instantUpgradeRetirementAgreementDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(instantUpgradeRetirementAgreementDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(instantUpgradeRetirementAgreementDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<InstantUpgradeRetirementAgreementDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new InstantUpgradeRetirementAgreementDuxo_MembersInjector(provider, provider2, provider3);
    }
}
