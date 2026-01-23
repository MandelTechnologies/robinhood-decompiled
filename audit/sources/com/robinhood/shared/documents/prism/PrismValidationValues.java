package com.robinhood.shared.documents.prism;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrismValidationValues.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismValidationValues;", "", "darkness", "", "faceCenterX", "", "faceCenterY", "faceDistance", "yaw", "pitch", "roll", "areaRatio", "averageGradient", "<init>", "(DFFFDDDDD)V", "getDarkness", "()D", "getFaceCenterX", "()F", "getFaceCenterY", "getFaceDistance", "getYaw", "getPitch", "getRoll", "getAreaRatio", "getAverageGradient", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrismValidationValues {
    public static final int $stable = 0;
    private final double areaRatio;
    private final double averageGradient;
    private final double darkness;
    private final float faceCenterX;
    private final float faceCenterY;
    private final float faceDistance;
    private final double pitch;
    private final double roll;
    private final double yaw;

    public static /* synthetic */ PrismValidationValues copy$default(PrismValidationValues prismValidationValues, double d, float f, float f2, float f3, double d2, double d3, double d4, double d5, double d6, int i, Object obj) {
        double d7;
        double d8;
        double d9 = (i & 1) != 0 ? prismValidationValues.darkness : d;
        float f4 = (i & 2) != 0 ? prismValidationValues.faceCenterX : f;
        float f5 = (i & 4) != 0 ? prismValidationValues.faceCenterY : f2;
        float f6 = (i & 8) != 0 ? prismValidationValues.faceDistance : f3;
        double d10 = (i & 16) != 0 ? prismValidationValues.yaw : d2;
        double d11 = (i & 32) != 0 ? prismValidationValues.pitch : d3;
        double d12 = (i & 64) != 0 ? prismValidationValues.roll : d4;
        double d13 = (i & 128) != 0 ? prismValidationValues.areaRatio : d5;
        if ((i & 256) != 0) {
            d7 = prismValidationValues.averageGradient;
            d8 = d9;
        } else {
            d7 = d6;
            d8 = d9;
        }
        return prismValidationValues.copy(d8, f4, f5, f6, d10, d11, d12, d13, d7);
    }

    /* renamed from: component1, reason: from getter */
    public final double getDarkness() {
        return this.darkness;
    }

    /* renamed from: component2, reason: from getter */
    public final float getFaceCenterX() {
        return this.faceCenterX;
    }

    /* renamed from: component3, reason: from getter */
    public final float getFaceCenterY() {
        return this.faceCenterY;
    }

    /* renamed from: component4, reason: from getter */
    public final float getFaceDistance() {
        return this.faceDistance;
    }

    /* renamed from: component5, reason: from getter */
    public final double getYaw() {
        return this.yaw;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPitch() {
        return this.pitch;
    }

    /* renamed from: component7, reason: from getter */
    public final double getRoll() {
        return this.roll;
    }

    /* renamed from: component8, reason: from getter */
    public final double getAreaRatio() {
        return this.areaRatio;
    }

    /* renamed from: component9, reason: from getter */
    public final double getAverageGradient() {
        return this.averageGradient;
    }

    public final PrismValidationValues copy(double darkness, float faceCenterX, float faceCenterY, float faceDistance, double yaw, double pitch, double roll, double areaRatio, double averageGradient) {
        return new PrismValidationValues(darkness, faceCenterX, faceCenterY, faceDistance, yaw, pitch, roll, areaRatio, averageGradient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrismValidationValues)) {
            return false;
        }
        PrismValidationValues prismValidationValues = (PrismValidationValues) other;
        return Double.compare(this.darkness, prismValidationValues.darkness) == 0 && Float.compare(this.faceCenterX, prismValidationValues.faceCenterX) == 0 && Float.compare(this.faceCenterY, prismValidationValues.faceCenterY) == 0 && Float.compare(this.faceDistance, prismValidationValues.faceDistance) == 0 && Double.compare(this.yaw, prismValidationValues.yaw) == 0 && Double.compare(this.pitch, prismValidationValues.pitch) == 0 && Double.compare(this.roll, prismValidationValues.roll) == 0 && Double.compare(this.areaRatio, prismValidationValues.areaRatio) == 0 && Double.compare(this.averageGradient, prismValidationValues.averageGradient) == 0;
    }

    public int hashCode() {
        return (((((((((((((((Double.hashCode(this.darkness) * 31) + Float.hashCode(this.faceCenterX)) * 31) + Float.hashCode(this.faceCenterY)) * 31) + Float.hashCode(this.faceDistance)) * 31) + Double.hashCode(this.yaw)) * 31) + Double.hashCode(this.pitch)) * 31) + Double.hashCode(this.roll)) * 31) + Double.hashCode(this.areaRatio)) * 31) + Double.hashCode(this.averageGradient);
    }

    public String toString() {
        return "PrismValidationValues(darkness=" + this.darkness + ", faceCenterX=" + this.faceCenterX + ", faceCenterY=" + this.faceCenterY + ", faceDistance=" + this.faceDistance + ", yaw=" + this.yaw + ", pitch=" + this.pitch + ", roll=" + this.roll + ", areaRatio=" + this.areaRatio + ", averageGradient=" + this.averageGradient + ")";
    }

    public PrismValidationValues(double d, float f, float f2, float f3, double d2, double d3, double d4, double d5, double d6) {
        this.darkness = d;
        this.faceCenterX = f;
        this.faceCenterY = f2;
        this.faceDistance = f3;
        this.yaw = d2;
        this.pitch = d3;
        this.roll = d4;
        this.areaRatio = d5;
        this.averageGradient = d6;
    }

    public /* synthetic */ PrismValidationValues(double d, float f, float f2, float f3, double d2, double d3, double d4, double d5, double d6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, f, f2, f3, d2, d3, d4, (i & 128) != 0 ? 0.0d : d5, (i & 256) != 0 ? 0.0d : d6);
    }

    public final double getDarkness() {
        return this.darkness;
    }

    public final float getFaceCenterX() {
        return this.faceCenterX;
    }

    public final float getFaceCenterY() {
        return this.faceCenterY;
    }

    public final float getFaceDistance() {
        return this.faceDistance;
    }

    public final double getYaw() {
        return this.yaw;
    }

    public final double getPitch() {
        return this.pitch;
    }

    public final double getRoll() {
        return this.roll;
    }

    public final double getAreaRatio() {
        return this.areaRatio;
    }

    public final double getAverageGradient() {
        return this.averageGradient;
    }
}
