package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class PaycheckDetailDuxo_MembersInjector implements MembersInjector<PaycheckDetailDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PaycheckDetailDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaycheckDetailDuxo paycheckDetailDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(paycheckDetailDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(paycheckDetailDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(paycheckDetailDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PaycheckDetailDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PaycheckDetailDuxo_MembersInjector(provider, provider2, provider3);
    }
}
