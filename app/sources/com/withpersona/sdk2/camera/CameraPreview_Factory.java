package com.withpersona.sdk2.camera;

import dagger.internal.Factory;

/* loaded from: classes26.dex */
public final class CameraPreview_Factory implements Factory<CameraPreview> {

    private static final class InstanceHolder {
        static final CameraPreview_Factory INSTANCE = new CameraPreview_Factory();
    }

    @Override // javax.inject.Provider
    public CameraPreview get() {
        return newInstance();
    }

    public static CameraPreview_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CameraPreview newInstance() {
        return new CameraPreview();
    }
}
