package com.robinhood.android.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CapturePhotoResult.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/camera/CapturePhotoResult;", "", "bytes", "", "rotationDegrees", "", "<init>", "([BI)V", "getBytes", "()[B", "getRotationDegrees", "()I", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class CapturePhotoResult {
    public static final int $stable = 8;
    private final byte[] bytes;
    private final int rotationDegrees;

    public CapturePhotoResult(byte[] bytes, int i) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
        this.rotationDegrees = i;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }
}
