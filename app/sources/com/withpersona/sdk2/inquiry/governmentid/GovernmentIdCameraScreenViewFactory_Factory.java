package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes18.dex */
public final class GovernmentIdCameraScreenViewFactory_Factory implements Factory<GovernmentIdCameraScreenViewFactory> {
    private final Provider<CameraPreview> cameraPreviewProvider;
    private final Provider<GovernmentIdFeed> governmentIdFeedProvider;

    public GovernmentIdCameraScreenViewFactory_Factory(Provider<GovernmentIdFeed> provider, Provider<CameraPreview> provider2) {
        this.governmentIdFeedProvider = provider;
        this.cameraPreviewProvider = provider2;
    }

    @Override // javax.inject.Provider
    public GovernmentIdCameraScreenViewFactory get() {
        return newInstance(this.governmentIdFeedProvider.get(), this.cameraPreviewProvider.get());
    }

    public static GovernmentIdCameraScreenViewFactory_Factory create(Provider<GovernmentIdFeed> provider, Provider<CameraPreview> provider2) {
        return new GovernmentIdCameraScreenViewFactory_Factory(provider, provider2);
    }

    public static GovernmentIdCameraScreenViewFactory newInstance(GovernmentIdFeed governmentIdFeed, CameraPreview cameraPreview) {
        return new GovernmentIdCameraScreenViewFactory(governmentIdFeed, cameraPreview);
    }
}
