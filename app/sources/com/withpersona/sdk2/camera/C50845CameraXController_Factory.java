package com.withpersona.sdk2.camera;

import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.camera.CameraXController_Factory, reason: case insensitive filesystem */
/* loaded from: classes26.dex */
public final class C50845CameraXController_Factory {
    private final Provider<CameraStatsManager> cameraStatsManagerProvider;
    private final Provider<SdkFilesManager> sdkFilesManagerProvider;

    public C50845CameraXController_Factory(Provider<CameraStatsManager> provider, Provider<SdkFilesManager> provider2) {
        this.cameraStatsManagerProvider = provider;
        this.sdkFilesManagerProvider = provider2;
    }

    public CameraXController get(CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder) {
        return newInstance(this.cameraStatsManagerProvider.get(), this.sdkFilesManagerProvider.get(), cameraPreview, previewView, cameraXBinder);
    }

    public static C50845CameraXController_Factory create(Provider<CameraStatsManager> provider, Provider<SdkFilesManager> provider2) {
        return new C50845CameraXController_Factory(provider, provider2);
    }

    public static CameraXController newInstance(CameraStatsManager cameraStatsManager, SdkFilesManager sdkFilesManager, CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder) {
        return new CameraXController(cameraStatsManager, sdkFilesManager, cameraPreview, previewView, cameraXBinder);
    }
}
