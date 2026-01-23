package com.withpersona.sdk2.inquiry.shared;

import com.withpersona.sdk2.inquiry.shared.image.ImageHelper;
import com.withpersona.sdk2.inquiry.shared.image.ImageHelper2;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SharedModule_ImageHelperFactory implements Factory<ImageHelper> {
    private final Provider<ImageHelper2> imageHelperProvider;
    private final SharedModule module;

    public SharedModule_ImageHelperFactory(SharedModule sharedModule, Provider<ImageHelper2> provider) {
        this.module = sharedModule;
        this.imageHelperProvider = provider;
    }

    @Override // javax.inject.Provider
    public ImageHelper get() {
        return imageHelper(this.module, this.imageHelperProvider.get());
    }

    public static SharedModule_ImageHelperFactory create(SharedModule sharedModule, Provider<ImageHelper2> provider) {
        return new SharedModule_ImageHelperFactory(sharedModule, provider);
    }

    public static ImageHelper imageHelper(SharedModule sharedModule, ImageHelper2 imageHelper2) {
        return (ImageHelper) Preconditions.checkNotNullFromProvides(sharedModule.imageHelper(imageHelper2));
    }
}
