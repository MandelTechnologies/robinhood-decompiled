package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes18.dex */
public final class InquiryModule_WebRtcServiceFactory implements Factory<WebRtcService> {
    private final InquiryModule module;
    private final Provider<Retrofit> webRtcRetrofitProvider;

    public InquiryModule_WebRtcServiceFactory(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        this.module = inquiryModule;
        this.webRtcRetrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public WebRtcService get() {
        return webRtcService(this.module, this.webRtcRetrofitProvider.get());
    }

    public static InquiryModule_WebRtcServiceFactory create(InquiryModule inquiryModule, Provider<Retrofit> provider) {
        return new InquiryModule_WebRtcServiceFactory(inquiryModule, provider);
    }

    public static WebRtcService webRtcService(InquiryModule inquiryModule, Retrofit retrofit) {
        return (WebRtcService) Preconditions.checkNotNullFromProvides(inquiryModule.webRtcService(retrofit));
    }
}
