package com.robinhood.android.directipo.allocation.clarity.p103ui.announcement;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes27.dex */
public final class DirectIpoNewAnnouncementDuxo_MembersInjector implements MembersInjector<DirectIpoNewAnnouncementDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DirectIpoNewAnnouncementDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DirectIpoNewAnnouncementDuxo directIpoNewAnnouncementDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(directIpoNewAnnouncementDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(directIpoNewAnnouncementDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(directIpoNewAnnouncementDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DirectIpoNewAnnouncementDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DirectIpoNewAnnouncementDuxo_MembersInjector(provider, provider2, provider3);
    }
}
