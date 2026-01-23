package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class DirectIpoLearningHubDuxo_MembersInjector implements MembersInjector<DirectIpoLearningHubDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DirectIpoLearningHubDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoLearningHubDuxo directIpoLearningHubDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(directIpoLearningHubDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(directIpoLearningHubDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(directIpoLearningHubDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DirectIpoLearningHubDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DirectIpoLearningHubDuxo_MembersInjector(provider, provider2, provider3);
    }
}
