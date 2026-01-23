package com.robinhood.android.earlypay.enrollment.p110ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentDuxo_MembersInjector implements MembersInjector<EarlyPayEnrollmentDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private EarlyPayEnrollmentDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(earlyPayEnrollmentDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(earlyPayEnrollmentDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(earlyPayEnrollmentDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<EarlyPayEnrollmentDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new EarlyPayEnrollmentDuxo_MembersInjector(provider, provider2, provider3);
    }
}
