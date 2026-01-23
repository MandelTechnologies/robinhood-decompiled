package com.withpersona.sdk2.camera.camera2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Camera2Utils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/ExtraCameraOptions;", "", "", "dynamicRange", "", "previewStabilization", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getDynamicRange", "()J", "Z", "getPreviewStabilization", "()Z", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ExtraCameraOptions {
    private final long dynamicRange;
    private final boolean previewStabilization;

    public ExtraCameraOptions() {
        this(0L, false, 3, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraCameraOptions)) {
            return false;
        }
        ExtraCameraOptions extraCameraOptions = (ExtraCameraOptions) other;
        return this.dynamicRange == extraCameraOptions.dynamicRange && this.previewStabilization == extraCameraOptions.previewStabilization;
    }

    public int hashCode() {
        return (Long.hashCode(this.dynamicRange) * 31) + Boolean.hashCode(this.previewStabilization);
    }

    public String toString() {
        return "ExtraCameraOptions(dynamicRange=" + this.dynamicRange + ", previewStabilization=" + this.previewStabilization + ")";
    }

    public ExtraCameraOptions(long j, boolean z) {
        this.dynamicRange = j;
        this.previewStabilization = z;
    }

    public /* synthetic */ ExtraCameraOptions(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1L : j, (i & 2) != 0 ? false : z);
    }

    public final long getDynamicRange() {
        return this.dynamicRange;
    }

    public final boolean getPreviewStabilization() {
        return this.previewStabilization;
    }
}
