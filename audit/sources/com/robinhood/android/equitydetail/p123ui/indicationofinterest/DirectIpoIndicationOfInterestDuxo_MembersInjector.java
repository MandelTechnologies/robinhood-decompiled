package com.robinhood.android.equitydetail.p123ui.indicationofinterest;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes3.dex */
public final class DirectIpoIndicationOfInterestDuxo_MembersInjector implements MembersInjector<DirectIpoIndicationOfInterestDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DirectIpoIndicationOfInterestDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoIndicationOfInterestDuxo directIpoIndicationOfInterestDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(directIpoIndicationOfInterestDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(directIpoIndicationOfInterestDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(directIpoIndicationOfInterestDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DirectIpoIndicationOfInterestDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DirectIpoIndicationOfInterestDuxo_MembersInjector(provider, provider2, provider3);
    }
}
