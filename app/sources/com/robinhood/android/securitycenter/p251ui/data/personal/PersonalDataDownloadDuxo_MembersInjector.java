package com.robinhood.android.securitycenter.p251ui.data.personal;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class PersonalDataDownloadDuxo_MembersInjector implements MembersInjector<PersonalDataDownloadDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PersonalDataDownloadDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PersonalDataDownloadDuxo personalDataDownloadDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(personalDataDownloadDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(personalDataDownloadDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(personalDataDownloadDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PersonalDataDownloadDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PersonalDataDownloadDuxo_MembersInjector(provider, provider2, provider3);
    }
}
