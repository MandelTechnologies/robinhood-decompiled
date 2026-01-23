package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_DocumentServiceFactory implements Factory<DocumentService> {
    private final InquiryModule module;
    private final Provider<Retrofit> retrofitProvider;

    public InquiryModule_DocumentServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public DocumentService get() {
        return documentService(this.module, this.retrofitProvider.get());
    }

    public static InquiryModule_DocumentServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_DocumentServiceFactory(inquiryModule, provider);
    }

    public static DocumentService documentService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (DocumentService) Preconditions.checkNotNullFromProvides(inquiryModule.documentService(retrofit));
    }
}
