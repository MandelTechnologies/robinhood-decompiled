package com.withpersona.sdk2.camera.camera2;

import android.content.Context;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory, reason: case insensitive filesystem */
/* loaded from: classes26.dex */
public final class C50846Camera2ManagerFactory_Factory {
    private final Provider<CameraStatsManager> cameraStatsManagerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<SdkFilesManager> sdkFilesManagerProvider;

    public C50846Camera2ManagerFactory_Factory(Provider<Context> provider, Provider<CameraStatsManager> provider2, Provider<SdkFilesManager> provider3) {
        this.contextProvider = provider;
        this.cameraStatsManagerProvider = provider2;
        this.sdkFilesManagerProvider = provider3;
    }

    public Camera2ManagerFactory get(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z) {
        return newInstance(this.contextProvider.get(), this.cameraStatsManagerProvider.get(), this.sdkFilesManagerProvider.get(), cameraChoices, camera2PreviewView, camera2ImageAnalyzer, videoCaptureMethod, webRtcManagerBridge, z);
    }

    public static C50846Camera2ManagerFactory_Factory create(Provider<Context> provider, Provider<CameraStatsManager> provider2, Provider<SdkFilesManager> provider3) {
        return new C50846Camera2ManagerFactory_Factory(provider, provider2, provider3);
    }

    public static Camera2ManagerFactory newInstance(Context context, CameraStatsManager cameraStatsManager, SdkFilesManager sdkFilesManager, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, Camera2ImageAnalyzer camera2ImageAnalyzer, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z) {
        return new Camera2ManagerFactory(context, cameraStatsManager, sdkFilesManager, cameraChoices, camera2PreviewView, camera2ImageAnalyzer, videoCaptureMethod, webRtcManagerBridge, z);
    }
}
