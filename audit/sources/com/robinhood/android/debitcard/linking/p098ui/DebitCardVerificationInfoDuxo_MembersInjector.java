package com.robinhood.android.debitcard.linking.p098ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes2.dex */
public final class DebitCardVerificationInfoDuxo_MembersInjector implements MembersInjector<DebitCardVerificationInfoDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DebitCardVerificationInfoDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DebitCardVerificationInfoDuxo debitCardVerificationInfoDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(debitCardVerificationInfoDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(debitCardVerificationInfoDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(debitCardVerificationInfoDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DebitCardVerificationInfoDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DebitCardVerificationInfoDuxo_MembersInjector(provider, provider2, provider3);
    }
}
