package com.robinhood.android.doc.p109ui.photo;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class DocUploadReviewPdfDuxo_MembersInjector implements MembersInjector<DocUploadReviewPdfDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DocUploadReviewPdfDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadReviewPdfDuxo docUploadReviewPdfDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(docUploadReviewPdfDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(docUploadReviewPdfDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(docUploadReviewPdfDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DocUploadReviewPdfDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DocUploadReviewPdfDuxo_MembersInjector(provider, provider2, provider3);
    }
}
