package com.withpersona.sdk2.inquiry.internal;

import android.view.Window;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class InquiryActivityModule_WindowFactory implements Factory<Window> {
    private final InquiryActivityModule module;

    public InquiryActivityModule_WindowFactory(InquiryActivityModule inquiryActivityModule) {
        this.module = inquiryActivityModule;
    }

    @Override // javax.inject.Provider
    public Window get() {
        return window(this.module);
    }

    public static InquiryActivityModule_WindowFactory create(InquiryActivityModule inquiryActivityModule) {
        return new InquiryActivityModule_WindowFactory(inquiryActivityModule);
    }

    public static Window window(InquiryActivityModule inquiryActivityModule) {
        return (Window) Preconditions.checkNotNullFromProvides(inquiryActivityModule.window());
    }
}
