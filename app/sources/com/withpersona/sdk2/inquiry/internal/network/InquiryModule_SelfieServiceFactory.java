package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.selfie.network.SelfieService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_SelfieServiceFactory implements Factory<SelfieService> {
    private final InquiryModule module;
    private final Provider<Retrofit> retrofitProvider;

    public InquiryModule_SelfieServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public SelfieService get() {
        return selfieService(this.module, this.retrofitProvider.get());
    }

    public static InquiryModule_SelfieServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_SelfieServiceFactory(inquiryModule, provider);
    }

    public static SelfieService selfieService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (SelfieService) Preconditions.checkNotNullFromProvides(inquiryModule.selfieService(retrofit));
    }
}
