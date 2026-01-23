package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class OldSelfieCameraScreenViewFactory_Factory implements Factory<OldSelfieCameraScreenViewFactory> {
    private final Provider<CameraPreview> cameraPreviewProvider;
    private final Provider<SelfieDirectionFeed> selfieDirectionFeedProvider;

    public OldSelfieCameraScreenViewFactory_Factory(Provider<CameraPreview> provider, Provider<SelfieDirectionFeed> provider2) {
        this.cameraPreviewProvider = provider;
        this.selfieDirectionFeedProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OldSelfieCameraScreenViewFactory get() {
        return newInstance(this.cameraPreviewProvider.get(), this.selfieDirectionFeedProvider.get());
    }

    public static OldSelfieCameraScreenViewFactory_Factory create(Provider<CameraPreview> provider, Provider<SelfieDirectionFeed> provider2) {
        return new OldSelfieCameraScreenViewFactory_Factory(provider, provider2);
    }

    public static OldSelfieCameraScreenViewFactory newInstance(CameraPreview cameraPreview, SelfieDirectionFeed selfieDirectionFeed) {
        return new OldSelfieCameraScreenViewFactory(cameraPreview, selfieDirectionFeed);
    }
}
