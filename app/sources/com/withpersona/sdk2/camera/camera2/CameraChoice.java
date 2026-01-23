package com.withpersona.sdk2.camera.camera2;

import android.util.Range;
import android.util.Size;
import com.withpersona.sdk2.camera.CameraProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Camera2Utils.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "", "", "id", "Landroid/util/Size;", "size", "", "maxFps", "Landroid/util/Range;", "", "targetFpsRange", "rotation", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "facingMode", "Lcom/withpersona/sdk2/camera/camera2/ExtraCameraOptions;", "additionalOptions", "<init>", "(Ljava/lang/String;Landroid/util/Size;DLandroid/util/Range;ILcom/withpersona/sdk2/camera/CameraProperties$FacingMode;Lcom/withpersona/sdk2/camera/camera2/ExtraCameraOptions;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "D", "getMaxFps", "()D", "Landroid/util/Range;", "getTargetFpsRange", "()Landroid/util/Range;", "I", "getRotation", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "getFacingMode", "()Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "Lcom/withpersona/sdk2/camera/camera2/ExtraCameraOptions;", "getAdditionalOptions", "()Lcom/withpersona/sdk2/camera/camera2/ExtraCameraOptions;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class CameraChoice {
    private final ExtraCameraOptions additionalOptions;
    private final CameraProperties cameraProperties;
    private final CameraProperties.FacingMode facingMode;
    private final String id;
    private final double maxFps;
    private final int rotation;
    private final Size size;
    private final Range<Integer> targetFpsRange;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChoice)) {
            return false;
        }
        CameraChoice cameraChoice = (CameraChoice) other;
        return Intrinsics.areEqual(this.id, cameraChoice.id) && Intrinsics.areEqual(this.size, cameraChoice.size) && Double.compare(this.maxFps, cameraChoice.maxFps) == 0 && Intrinsics.areEqual(this.targetFpsRange, cameraChoice.targetFpsRange) && this.rotation == cameraChoice.rotation && this.facingMode == cameraChoice.facingMode && Intrinsics.areEqual(this.additionalOptions, cameraChoice.additionalOptions);
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.size.hashCode()) * 31) + Double.hashCode(this.maxFps)) * 31) + this.targetFpsRange.hashCode()) * 31) + Integer.hashCode(this.rotation)) * 31) + this.facingMode.hashCode()) * 31) + this.additionalOptions.hashCode();
    }

    public String toString() {
        return "CameraChoice(id=" + this.id + ", size=" + this.size + ", maxFps=" + this.maxFps + ", targetFpsRange=" + this.targetFpsRange + ", rotation=" + this.rotation + ", facingMode=" + this.facingMode + ", additionalOptions=" + this.additionalOptions + ")";
    }

    public CameraChoice(String id, Size size, double d, Range<Integer> targetFpsRange, int i, CameraProperties.FacingMode facingMode, ExtraCameraOptions additionalOptions) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(targetFpsRange, "targetFpsRange");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        Intrinsics.checkNotNullParameter(additionalOptions, "additionalOptions");
        this.id = id;
        this.size = size;
        this.maxFps = d;
        this.targetFpsRange = targetFpsRange;
        this.rotation = i;
        this.facingMode = facingMode;
        this.additionalOptions = additionalOptions;
        this.cameraProperties = new CameraProperties(id, facingMode, size, (int) d);
    }

    public final String getId() {
        return this.id;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Range<Integer> getTargetFpsRange() {
        return this.targetFpsRange;
    }

    public final int getRotation() {
        return this.rotation;
    }

    public final CameraProperties.FacingMode getFacingMode() {
        return this.facingMode;
    }

    public final ExtraCameraOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }
}
