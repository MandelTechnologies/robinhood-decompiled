package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class ExternalEventLogger_Factory implements Factory<ExternalEventLogger> {
    private final Provider<ExternalInquiryController> externalInquiryControllerProvider;

    public ExternalEventLogger_Factory(Provider<ExternalInquiryController> provider) {
        this.externalInquiryControllerProvider = provider;
    }

    @Override // javax.inject.Provider
    public ExternalEventLogger get() {
        return newInstance(this.externalInquiryControllerProvider.get());
    }

    public static ExternalEventLogger_Factory create(Provider<ExternalInquiryController> provider) {
        return new ExternalEventLogger_Factory(provider);
    }

    public static ExternalEventLogger newInstance(ExternalInquiryController externalInquiryController) {
        return new ExternalEventLogger(externalInquiryController);
    }
}
