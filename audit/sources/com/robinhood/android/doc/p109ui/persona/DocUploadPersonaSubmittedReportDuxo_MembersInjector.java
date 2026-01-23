package com.robinhood.android.doc.p109ui.persona;

import com.robinhood.android.udf.OldBaseDuxo_MembersInjector;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.utils.RxGlobalErrorHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dispatch.core.DispatcherProvider;

/* loaded from: classes7.dex */
public final class DocUploadPersonaSubmittedReportDuxo_MembersInjector implements MembersInjector<DocUploadPersonaSubmittedReportDuxo> {
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<RxFactory> rxFactoryProvider;
    private final Provider<RxGlobalErrorHandler> rxGlobalErrorHandlerProvider;

    private DocUploadPersonaSubmittedReportDuxo_MembersInjector(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        this.dispatcherProvider = provider;
        this.rxFactoryProvider = provider2;
        this.rxGlobalErrorHandlerProvider = provider3;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DocUploadPersonaSubmittedReportDuxo docUploadPersonaSubmittedReportDuxo) {
        OldBaseDuxo_MembersInjector.injectDispatcherProvider(docUploadPersonaSubmittedReportDuxo, this.dispatcherProvider.get());
        OldBaseDuxo_MembersInjector.injectRxFactory(docUploadPersonaSubmittedReportDuxo, this.rxFactoryProvider.get());
        OldBaseDuxo_MembersInjector.injectRxGlobalErrorHandler(docUploadPersonaSubmittedReportDuxo, this.rxGlobalErrorHandlerProvider.get());
    }

    public static MembersInjector<DocUploadPersonaSubmittedReportDuxo> create(Provider<DispatcherProvider> provider, Provider<RxFactory> provider2, Provider<RxGlobalErrorHandler> provider3) {
        return new DocUploadPersonaSubmittedReportDuxo_MembersInjector(provider, provider2, provider3);
    }
}
