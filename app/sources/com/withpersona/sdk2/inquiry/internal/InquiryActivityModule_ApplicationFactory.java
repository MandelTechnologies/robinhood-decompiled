package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class InquiryActivityModule_ApplicationFactory implements Factory<Application> {
    private final InquiryActivityModule module;

    public InquiryActivityModule_ApplicationFactory(InquiryActivityModule inquiryActivityModule) {
        this.module = inquiryActivityModule;
    }

    @Override // javax.inject.Provider
    public Application get() {
        return application(this.module);
    }

    public static InquiryActivityModule_ApplicationFactory create(InquiryActivityModule inquiryActivityModule) {
        return new InquiryActivityModule_ApplicationFactory(inquiryActivityModule);
    }

    public static Application application(InquiryActivityModule inquiryActivityModule) {
        return (Application) Preconditions.checkNotNullFromProvides(inquiryActivityModule.application());
    }
}
