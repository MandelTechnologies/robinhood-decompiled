package com.robinhood.android.camera.process;

import com.robinhood.android.gold.contracts.GoldFeature;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessPhotoOptions.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/camera/process/ProcessPhotoOptions;", "", "fileName", "", "rotationDegrees", "", "checkBlurriness", "", "aspectRatio", "", GoldFeature.MARGIN, "<init>", "(Ljava/lang/String;IZFF)V", "getFileName", "()Ljava/lang/String;", "getRotationDegrees", "()I", "getCheckBlurriness", "()Z", "getAspectRatio", "()F", "getMargin", "swapWidthAndHeight", "getSwapWidthAndHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProcessPhotoOptions {
    public static final int $stable = 0;
    private final float aspectRatio;
    private final boolean checkBlurriness;
    private final String fileName;
    private final float margin;
    private final int rotationDegrees;
    private final boolean swapWidthAndHeight;

    public static /* synthetic */ ProcessPhotoOptions copy$default(ProcessPhotoOptions processPhotoOptions, String str, int i, boolean z, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = processPhotoOptions.fileName;
        }
        if ((i2 & 2) != 0) {
            i = processPhotoOptions.rotationDegrees;
        }
        if ((i2 & 4) != 0) {
            z = processPhotoOptions.checkBlurriness;
        }
        if ((i2 & 8) != 0) {
            f = processPhotoOptions.aspectRatio;
        }
        if ((i2 & 16) != 0) {
            f2 = processPhotoOptions.margin;
        }
        float f3 = f2;
        boolean z2 = z;
        return processPhotoOptions.copy(str, i, z2, f, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCheckBlurriness() {
        return this.checkBlurriness;
    }

    /* renamed from: component4, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component5, reason: from getter */
    public final float getMargin() {
        return this.margin;
    }

    public final ProcessPhotoOptions copy(String fileName, int rotationDegrees, boolean checkBlurriness, float aspectRatio, float margin) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new ProcessPhotoOptions(fileName, rotationDegrees, checkBlurriness, aspectRatio, margin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessPhotoOptions)) {
            return false;
        }
        ProcessPhotoOptions processPhotoOptions = (ProcessPhotoOptions) other;
        return Intrinsics.areEqual(this.fileName, processPhotoOptions.fileName) && this.rotationDegrees == processPhotoOptions.rotationDegrees && this.checkBlurriness == processPhotoOptions.checkBlurriness && Float.compare(this.aspectRatio, processPhotoOptions.aspectRatio) == 0 && Float.compare(this.margin, processPhotoOptions.margin) == 0;
    }

    public int hashCode() {
        return (((((((this.fileName.hashCode() * 31) + Integer.hashCode(this.rotationDegrees)) * 31) + Boolean.hashCode(this.checkBlurriness)) * 31) + Float.hashCode(this.aspectRatio)) * 31) + Float.hashCode(this.margin);
    }

    public String toString() {
        return "ProcessPhotoOptions(fileName=" + this.fileName + ", rotationDegrees=" + this.rotationDegrees + ", checkBlurriness=" + this.checkBlurriness + ", aspectRatio=" + this.aspectRatio + ", margin=" + this.margin + ")";
    }

    public ProcessPhotoOptions(String fileName, int i, boolean z, float f, float f2) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileName = fileName;
        this.rotationDegrees = i;
        this.checkBlurriness = z;
        this.aspectRatio = f;
        this.margin = f2;
        this.swapWidthAndHeight = i == 90 || i == 270;
    }

    public /* synthetic */ ProcessPhotoOptions(String str, int i, boolean z, float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, z, f, (i2 & 16) != 0 ? 0.0f : f2);
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public final boolean getCheckBlurriness() {
        return this.checkBlurriness;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final float getMargin() {
        return this.margin;
    }

    public final boolean getSwapWidthAndHeight() {
        return this.swapWidthAndHeight;
    }
}
