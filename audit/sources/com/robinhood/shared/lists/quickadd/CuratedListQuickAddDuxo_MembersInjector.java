package com.robinhood.shared.lists.quickadd;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes6.dex */
public final class CuratedListQuickAddDuxo_MembersInjector implements MembersInjector<CuratedListQuickAddDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CuratedListQuickAddDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CuratedListQuickAddDuxo curatedListQuickAddDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(curatedListQuickAddDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(curatedListQuickAddDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(curatedListQuickAddDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CuratedListQuickAddDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CuratedListQuickAddDuxo_MembersInjector(provider, provider2, provider3);
    }
}
