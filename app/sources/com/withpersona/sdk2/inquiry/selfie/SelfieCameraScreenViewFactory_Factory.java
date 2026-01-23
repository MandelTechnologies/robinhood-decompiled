package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class SelfieCameraScreenViewFactory_Factory implements Factory<SelfieCameraScreenViewFactory> {
    private final Provider<CameraPreview> cameraPreviewProvider;
    private final Provider<SelfieDirectionFeed> selfieDirectionFeedProvider;

    public SelfieCameraScreenViewFactory_Factory(Provider<CameraPreview> provider, Provider<SelfieDirectionFeed> provider2) {
        this.cameraPreviewProvider = provider;
        this.selfieDirectionFeedProvider = provider2;
    }

    @Override // javax.inject.Provider
    public SelfieCameraScreenViewFactory get() {
        return newInstance(this.cameraPreviewProvider.get(), this.selfieDirectionFeedProvider.get());
    }

    public static SelfieCameraScreenViewFactory_Factory create(Provider<CameraPreview> provider, Provider<SelfieDirectionFeed> provider2) {
        return new SelfieCameraScreenViewFactory_Factory(provider, provider2);
    }

    public static SelfieCameraScreenViewFactory newInstance(CameraPreview cameraPreview, SelfieDirectionFeed selfieDirectionFeed) {
        return new SelfieCameraScreenViewFactory(cameraPreview, selfieDirectionFeed);
    }
}
