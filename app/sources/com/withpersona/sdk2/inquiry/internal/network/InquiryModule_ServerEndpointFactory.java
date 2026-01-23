package com.withpersona.sdk2.inquiry.internal.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class InquiryModule_ServerEndpointFactory implements Factory<String> {
    private final InquiryModule module;

    public InquiryModule_ServerEndpointFactory(InquiryModule inquiryModule) {
        this.module = inquiryModule;
    }

    @Override // javax.inject.Provider
    public String get() {
        return serverEndpoint(this.module);
    }

    public static InquiryModule_ServerEndpointFactory create(InquiryModule inquiryModule) {
        return new InquiryModule_ServerEndpointFactory(inquiryModule);
    }

    public static String serverEndpoint(InquiryModule inquiryModule) {
        return (String) Preconditions.checkNotNullFromProvides(inquiryModule.getServerEndpoint());
    }
}
