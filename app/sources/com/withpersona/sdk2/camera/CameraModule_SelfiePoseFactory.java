package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.selfie.SelfieFrameInfo;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.flow.SharedFlow2;

/* loaded from: classes26.dex */
public final class CameraModule_SelfiePoseFactory implements Factory<SharedFlow2<SelfieFrameInfo>> {
    private final CameraModule module;

    public CameraModule_SelfiePoseFactory(CameraModule cameraModule) {
        this.module = cameraModule;
    }

    @Override // javax.inject.Provider
    public SharedFlow2<SelfieFrameInfo> get() {
        return selfiePose(this.module);
    }

    public static CameraModule_SelfiePoseFactory create(CameraModule cameraModule) {
        return new CameraModule_SelfiePoseFactory(cameraModule);
    }

    public static SharedFlow2<SelfieFrameInfo> selfiePose(CameraModule cameraModule) {
        return (SharedFlow2) Preconditions.checkNotNullFromProvides(cameraModule.selfiePose());
    }
}
