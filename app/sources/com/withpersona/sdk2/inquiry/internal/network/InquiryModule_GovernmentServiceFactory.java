package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_GovernmentServiceFactory implements Factory<GovernmentIdService> {
    private final InquiryModule module;
    private final Provider<Retrofit> retrofitProvider;

    public InquiryModule_GovernmentServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public GovernmentIdService get() {
        return governmentService(this.module, this.retrofitProvider.get());
    }

    public static InquiryModule_GovernmentServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_GovernmentServiceFactory(inquiryModule, provider);
    }

    public static GovernmentIdService governmentService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (GovernmentIdService) Preconditions.checkNotNullFromProvides(inquiryModule.governmentService(retrofit));
    }
}
