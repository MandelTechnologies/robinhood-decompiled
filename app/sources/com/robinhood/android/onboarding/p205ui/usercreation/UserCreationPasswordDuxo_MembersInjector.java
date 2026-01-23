package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes10.dex */
public final class UserCreationPasswordDuxo_MembersInjector implements MembersInjector<UserCreationPasswordDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private UserCreationPasswordDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserCreationPasswordDuxo userCreationPasswordDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(userCreationPasswordDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(userCreationPasswordDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(userCreationPasswordDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<UserCreationPasswordDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new UserCreationPasswordDuxo_MembersInjector(provider, provider2, provider3);
    }
}
