package com.robinhood.android.doc.p109ui.residency;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class DocUploadVerifyResidencyDuxo_MembersInjector implements MembersInjector<DocUploadVerifyResidencyDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DocUploadVerifyResidencyDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadVerifyResidencyDuxo docUploadVerifyResidencyDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(docUploadVerifyResidencyDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(docUploadVerifyResidencyDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(docUploadVerifyResidencyDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DocUploadVerifyResidencyDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DocUploadVerifyResidencyDuxo_MembersInjector(provider, provider2, provider3);
    }
}
