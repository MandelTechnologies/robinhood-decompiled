package com.robinhood.android.psp;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class ProgramEnrollmentCelebrationDuxo_MembersInjector implements MembersInjector<ProgramEnrollmentCelebrationDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private ProgramEnrollmentCelebrationDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ProgramEnrollmentCelebrationDuxo programEnrollmentCelebrationDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(programEnrollmentCelebrationDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(programEnrollmentCelebrationDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(programEnrollmentCelebrationDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<ProgramEnrollmentCelebrationDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new ProgramEnrollmentCelebrationDuxo_MembersInjector(provider, provider2, provider3);
    }
}
