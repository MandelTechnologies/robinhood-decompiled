package com.robinhood.android.doc.p109ui.assistant;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class MultiDocUploadAssistantDuxo_MembersInjector implements MembersInjector<MultiDocUploadAssistantDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private MultiDocUploadAssistantDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MultiDocUploadAssistantDuxo multiDocUploadAssistantDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(multiDocUploadAssistantDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(multiDocUploadAssistantDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(multiDocUploadAssistantDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<MultiDocUploadAssistantDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new MultiDocUploadAssistantDuxo_MembersInjector(provider, provider2, provider3);
    }
}
