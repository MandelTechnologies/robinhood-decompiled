package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import coil.ImageLoader;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class InquiryActivityModule_ImageLoaderFactory implements Factory<ImageLoader> {
    private final Provider<Context> contextProvider;
    private final InquiryActivityModule module;

    public InquiryActivityModule_ImageLoaderFactory(InquiryActivityModule inquiryActivityModule, Provider<Context> provider) {
        this.module = inquiryActivityModule;
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public ImageLoader get() {
        return imageLoader(this.module, this.contextProvider.get());
    }

    public static InquiryActivityModule_ImageLoaderFactory create(InquiryActivityModule inquiryActivityModule, Provider<Context> provider) {
        return new InquiryActivityModule_ImageLoaderFactory(inquiryActivityModule, provider);
    }

    public static ImageLoader imageLoader(InquiryActivityModule inquiryActivityModule, Context context) {
        return (ImageLoader) Preconditions.checkNotNullFromProvides(inquiryActivityModule.imageLoader(context));
    }
}
