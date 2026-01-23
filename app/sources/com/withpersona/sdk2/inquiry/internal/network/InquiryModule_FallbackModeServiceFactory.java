package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_FallbackModeServiceFactory implements Factory<FallbackModeService> {
    private final Provider<Retrofit> fallbackModeRetrofitProvider;
    private final InquiryModule module;

    public InquiryModule_FallbackModeServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.fallbackModeRetrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public FallbackModeService get() {
        return fallbackModeService(this.module, this.fallbackModeRetrofitProvider.get());
    }

    public static InquiryModule_FallbackModeServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_FallbackModeServiceFactory(inquiryModule, provider);
    }

    public static FallbackModeService fallbackModeService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (FallbackModeService) Preconditions.checkNotNullFromProvides(inquiryModule.fallbackModeService(retrofit));
    }
}
