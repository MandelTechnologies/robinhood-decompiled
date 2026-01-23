package com.robinhood.android.matcha.p177ui.history.detail.request;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class MatchaRequestDetailDuxo_MembersInjector implements MembersInjector<MatchaRequestDetailDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MatchaRequestDetailDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MatchaRequestDetailDuxo matchaRequestDetailDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(matchaRequestDetailDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(matchaRequestDetailDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(matchaRequestDetailDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MatchaRequestDetailDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MatchaRequestDetailDuxo_MembersInjector(provider, provider2, provider3);
    }
}
