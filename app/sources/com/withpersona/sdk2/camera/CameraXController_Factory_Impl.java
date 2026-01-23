package com.withpersona.sdk2.camera;

import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.CameraXController;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes26.dex */
public final class CameraXController_Factory_Impl implements CameraXController.Factory {
    private final C50845CameraXController_Factory delegateFactory;

    CameraXController_Factory_Impl(C50845CameraXController_Factory c50845CameraXController_Factory) {
        this.delegateFactory = c50845CameraXController_Factory;
    }

    @Override // com.withpersona.sdk2.camera.CameraXController.Factory
    public CameraXController create(CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder) {
        return this.delegateFactory.get(cameraPreview, previewView, cameraXBinder);
    }

    public static Provider<CameraXController.Factory> createFactoryProvider(C50845CameraXController_Factory c50845CameraXController_Factory) {
        return InstanceFactory.create(new CameraXController_Factory_Impl(c50845CameraXController_Factory));
    }
}
