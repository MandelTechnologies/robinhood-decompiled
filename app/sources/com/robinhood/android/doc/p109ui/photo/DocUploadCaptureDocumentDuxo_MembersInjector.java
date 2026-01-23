package com.robinhood.android.doc.p109ui.photo;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class DocUploadCaptureDocumentDuxo_MembersInjector implements MembersInjector<DocUploadCaptureDocumentDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DocUploadCaptureDocumentDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadCaptureDocumentDuxo docUploadCaptureDocumentDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(docUploadCaptureDocumentDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(docUploadCaptureDocumentDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(docUploadCaptureDocumentDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DocUploadCaptureDocumentDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DocUploadCaptureDocumentDuxo_MembersInjector(provider, provider2, provider3);
    }
}
