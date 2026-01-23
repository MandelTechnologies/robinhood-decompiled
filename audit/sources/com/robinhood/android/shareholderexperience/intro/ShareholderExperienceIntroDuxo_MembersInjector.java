package com.robinhood.android.shareholderexperience.intro;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes5.dex */
public final class ShareholderExperienceIntroDuxo_MembersInjector implements MembersInjector<ShareholderExperienceIntroDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private ShareholderExperienceIntroDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ShareholderExperienceIntroDuxo shareholderExperienceIntroDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(shareholderExperienceIntroDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(shareholderExperienceIntroDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(shareholderExperienceIntroDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<ShareholderExperienceIntroDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new ShareholderExperienceIntroDuxo_MembersInjector(provider, provider2, provider3);
    }
}
