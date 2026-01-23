package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class InquiryActivityModule_ContextFactory implements Factory<Context> {
    private final InquiryActivityModule module;

    public InquiryActivityModule_ContextFactory(InquiryActivityModule inquiryActivityModule) {
        this.module = inquiryActivityModule;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return context(this.module);
    }

    public static InquiryActivityModule_ContextFactory create(InquiryActivityModule inquiryActivityModule) {
        return new InquiryActivityModule_ContextFactory(inquiryActivityModule);
    }

    public static Context context(InquiryActivityModule inquiryActivityModule) {
        return (Context) Preconditions.checkNotNullFromProvides(inquiryActivityModule.context());
    }
}
