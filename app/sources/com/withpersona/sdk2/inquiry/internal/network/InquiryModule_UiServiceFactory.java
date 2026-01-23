package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.p424ui.network.UiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_UiServiceFactory implements Factory<UiService> {
    private final InquiryModule module;
    private final Provider<Retrofit> retrofitProvider;

    public InquiryModule_UiServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public UiService get() {
        return uiService(this.module, this.retrofitProvider.get());
    }

    public static InquiryModule_UiServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_UiServiceFactory(inquiryModule, provider);
    }

    public static UiService uiService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (UiService) Preconditions.checkNotNullFromProvides(inquiryModule.uiService(retrofit));
    }
}
