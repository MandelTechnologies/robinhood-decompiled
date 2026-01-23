package com.robinhood.android.shareholderexperience.eventslist;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class ShareholderEventsPageDuxo_MembersInjector implements MembersInjector<ShareholderEventsPageDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private ShareholderEventsPageDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ShareholderEventsPageDuxo shareholderEventsPageDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(shareholderEventsPageDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(shareholderEventsPageDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(shareholderEventsPageDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<ShareholderEventsPageDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new ShareholderEventsPageDuxo_MembersInjector(provider, provider2, provider3);
    }
}
