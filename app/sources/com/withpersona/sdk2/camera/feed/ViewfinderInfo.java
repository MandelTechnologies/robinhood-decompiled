package com.withpersona.sdk2.camera.feed;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewfinderInfo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/feed/ViewfinderInfo;", "", "Landroid/graphics/Rect;", "region", "viewport", "<init>", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Rect;", "getRegion", "()Landroid/graphics/Rect;", "getViewport", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class ViewfinderInfo {
    private final Rect region;
    private final Rect viewport;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewfinderInfo)) {
            return false;
        }
        ViewfinderInfo viewfinderInfo = (ViewfinderInfo) other;
        return Intrinsics.areEqual(this.region, viewfinderInfo.region) && Intrinsics.areEqual(this.viewport, viewfinderInfo.viewport);
    }

    public int hashCode() {
        return (this.region.hashCode() * 31) + this.viewport.hashCode();
    }

    public String toString() {
        return "ViewfinderInfo(region=" + this.region + ", viewport=" + this.viewport + ")";
    }

    public ViewfinderInfo(Rect region, Rect viewport) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        this.region = region;
        this.viewport = viewport;
    }

    public final Rect getRegion() {
        return this.region;
    }

    public final Rect getViewport() {
        return this.viewport;
    }
}
