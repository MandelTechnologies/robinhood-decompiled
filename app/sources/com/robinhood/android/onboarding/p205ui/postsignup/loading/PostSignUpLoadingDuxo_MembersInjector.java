package com.robinhood.android.onboarding.p205ui.postsignup.loading;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes10.dex */
public final class PostSignUpLoadingDuxo_MembersInjector implements MembersInjector<PostSignUpLoadingDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PostSignUpLoadingDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PostSignUpLoadingDuxo postSignUpLoadingDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(postSignUpLoadingDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(postSignUpLoadingDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(postSignUpLoadingDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PostSignUpLoadingDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PostSignUpLoadingDuxo_MembersInjector(provider, provider2, provider3);
    }
}
