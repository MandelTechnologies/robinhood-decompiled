package com.withpersona.sdk2.camera.camera2;

import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes26.dex */
public final class Camera2ManagerFactory_Factory_Impl implements Camera2ManagerFactory.Factory {
    private final C50846Camera2ManagerFactory_Factory delegateFactory;

    Camera2ManagerFactory_Factory_Impl(C50846Camera2ManagerFactory_Factory c50846Camera2ManagerFactory_Factory) {
        this.delegateFactory = c50846Camera2ManagerFactory_Factory;
    }

    @Override // com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory.Factory
    public Camera2ManagerFactory create(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z) {
        return this.delegateFactory.get(cameraChoices, camera2PreviewView, camera2ImageAnalyzer, videoCaptureMethod, webRtcManagerBridge, z);
    }

    public static Provider<Camera2ManagerFactory.Factory> createFactoryProvider(C50846Camera2ManagerFactory_Factory c50846Camera2ManagerFactory_Factory) {
        return InstanceFactory.create(new Camera2ManagerFactory_Factory_Impl(c50846Camera2ManagerFactory_Factory));
    }
}
