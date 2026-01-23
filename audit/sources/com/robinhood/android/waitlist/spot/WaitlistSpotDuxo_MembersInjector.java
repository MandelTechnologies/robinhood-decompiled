package com.robinhood.android.waitlist.spot;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes9.dex */
public final class WaitlistSpotDuxo_MembersInjector implements MembersInjector<WaitlistSpotDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private WaitlistSpotDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WaitlistSpotDuxo waitlistSpotDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(waitlistSpotDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(waitlistSpotDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(waitlistSpotDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<WaitlistSpotDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new WaitlistSpotDuxo_MembersInjector(provider, provider2, provider3);
    }
}
