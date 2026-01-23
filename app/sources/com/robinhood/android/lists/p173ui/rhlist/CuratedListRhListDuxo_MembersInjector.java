package com.robinhood.android.lists.p173ui.rhlist;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes8.dex */
public final class CuratedListRhListDuxo_MembersInjector implements MembersInjector<CuratedListRhListDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private CuratedListRhListDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CuratedListRhListDuxo curatedListRhListDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(curatedListRhListDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(curatedListRhListDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(curatedListRhListDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<CuratedListRhListDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new CuratedListRhListDuxo_MembersInjector(provider, provider2, provider3);
    }
}
