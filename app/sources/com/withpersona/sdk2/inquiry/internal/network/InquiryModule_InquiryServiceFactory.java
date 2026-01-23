package com.withpersona.sdk2.inquiry.internal.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_InquiryServiceFactory implements Factory<InquiryService> {
    private final InquiryModule module;
    private final Provider<Retrofit> retrofitProvider;

    public InquiryModule_InquiryServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public InquiryService get() {
        return inquiryService(this.module, this.retrofitProvider.get());
    }

    public static InquiryModule_InquiryServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_InquiryServiceFactory(inquiryModule, provider);
    }

    public static InquiryService inquiryService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (InquiryService) Preconditions.checkNotNullFromProvides(inquiryModule.inquiryService(retrofit));
    }
}
