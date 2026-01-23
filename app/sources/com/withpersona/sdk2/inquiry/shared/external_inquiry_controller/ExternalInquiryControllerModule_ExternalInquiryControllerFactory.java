package com.withpersona.sdk2.inquiry.shared.external_inquiry_controller;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class ExternalInquiryControllerModule_ExternalInquiryControllerFactory implements Factory<ExternalInquiryController> {
    private final ExternalInquiryControllerModule module;

    public ExternalInquiryControllerModule_ExternalInquiryControllerFactory(ExternalInquiryControllerModule externalInquiryControllerModule) {
        this.module = externalInquiryControllerModule;
    }

    @Override // javax.inject.Provider
    public ExternalInquiryController get() {
        return externalInquiryController(this.module);
    }

    public static ExternalInquiryControllerModule_ExternalInquiryControllerFactory create(ExternalInquiryControllerModule externalInquiryControllerModule) {
        return new ExternalInquiryControllerModule_ExternalInquiryControllerFactory(externalInquiryControllerModule);
    }

    public static ExternalInquiryController externalInquiryController(ExternalInquiryControllerModule externalInquiryControllerModule) {
        return (ExternalInquiryController) Preconditions.checkNotNullFromProvides(externalInquiryControllerModule.getExternalInquiryController());
    }
}
