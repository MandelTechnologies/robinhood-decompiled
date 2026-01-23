package com.robinhood.android.psp.history;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes11.dex */
public final class PspGiftHistoryDetailDuxo_MembersInjector implements MembersInjector<PspGiftHistoryDetailDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private PspGiftHistoryDetailDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PspGiftHistoryDetailDuxo pspGiftHistoryDetailDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(pspGiftHistoryDetailDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(pspGiftHistoryDetailDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(pspGiftHistoryDetailDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<PspGiftHistoryDetailDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new PspGiftHistoryDetailDuxo_MembersInjector(provider, provider2, provider3);
    }
}
