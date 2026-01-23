package com.withpersona.sdk2.camera;

import androidx.camera.core.Camera;
import androidx.camera.core.ImageCapture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraSession.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraSession;", "", "camera", "Landroidx/camera/core/Camera;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "<init>", "(Landroidx/camera/core/Camera;Landroidx/camera/core/ImageCapture;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "getCamera", "()Landroidx/camera/core/Camera;", "getImageCapture", "()Landroidx/camera/core/ImageCapture;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CameraSession {
    private final Camera camera;
    private final CameraProperties cameraProperties;
    private final ImageCapture imageCapture;

    public CameraSession(Camera camera, ImageCapture imageCapture, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        this.camera = camera;
        this.imageCapture = imageCapture;
        this.cameraProperties = cameraProperties;
    }

    public final Camera getCamera() {
        return this.camera;
    }

    public final ImageCapture getImageCapture() {
        return this.imageCapture;
    }

    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }
}
