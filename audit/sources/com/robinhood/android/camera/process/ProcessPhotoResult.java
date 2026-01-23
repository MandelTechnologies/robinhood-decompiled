package com.robinhood.android.camera.process;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessPhotoResult.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/camera/process/ProcessPhotoResult;", "", "fileName", "", "isBlurry", "", "<init>", "(Ljava/lang/String;Z)V", "getFileName", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProcessPhotoResult {
    public static final int $stable = 0;
    private final String fileName;
    private final boolean isBlurry;

    public static /* synthetic */ ProcessPhotoResult copy$default(ProcessPhotoResult processPhotoResult, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = processPhotoResult.fileName;
        }
        if ((i & 2) != 0) {
            z = processPhotoResult.isBlurry;
        }
        return processPhotoResult.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsBlurry() {
        return this.isBlurry;
    }

    public final ProcessPhotoResult copy(String fileName, boolean isBlurry) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new ProcessPhotoResult(fileName, isBlurry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessPhotoResult)) {
            return false;
        }
        ProcessPhotoResult processPhotoResult = (ProcessPhotoResult) other;
        return Intrinsics.areEqual(this.fileName, processPhotoResult.fileName) && this.isBlurry == processPhotoResult.isBlurry;
    }

    public int hashCode() {
        return (this.fileName.hashCode() * 31) + Boolean.hashCode(this.isBlurry);
    }

    public String toString() {
        return "ProcessPhotoResult(fileName=" + this.fileName + ", isBlurry=" + this.isBlurry + ")";
    }

    public ProcessPhotoResult(String fileName, boolean z) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileName = fileName;
        this.isBlurry = z;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean isBlurry() {
        return this.isBlurry;
    }
}
