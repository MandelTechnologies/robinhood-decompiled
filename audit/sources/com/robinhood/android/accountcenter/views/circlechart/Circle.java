package com.robinhood.android.accountcenter.views.circlechart;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Circle.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 2\u0006\u0010!\u001a\u00020\u0000H\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0000H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/circlechart/Circle;", "", "center", "Landroid/graphics/PointF;", "radius", "", "<init>", "(Landroid/graphics/PointF;F)V", "boundingRect", "Landroid/graphics/RectF;", "getBoundingRect", "()Landroid/graphics/RectF;", "minX", "getMinX", "()F", "maxX", "getMaxX", "minY", "getMinY", "maxY", "getMaxY", "offset", "offsetRadius", "generateCircles", "", "radii", "offsetInitialCircle", "", "perimeterCenterPoint", "angle", "otherCircleRadius", "intersectionPoints", "Lkotlin/Pair;", "other", "angleBetween", "point1", "point2", "arcAngle", "circle", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class Circle {
    public static final int $stable = 8;
    private final PointF center;
    private final float radius;

    public Circle(PointF center, float f) {
        Intrinsics.checkNotNullParameter(center, "center");
        this.center = center;
        this.radius = f;
    }

    public final RectF getBoundingRect() {
        return new RectF(getMinX(), getMinY(), getMaxX(), getMaxY());
    }

    private final float getMinX() {
        return this.center.x - this.radius;
    }

    private final float getMaxX() {
        return this.center.x + this.radius;
    }

    private final float getMinY() {
        return this.center.y - this.radius;
    }

    private final float getMaxY() {
        return this.center.y + this.radius;
    }

    public final Circle offset(PointF offset) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        PointF pointF = this.center;
        return new Circle(new PointF(pointF.x - offset.x, pointF.y - offset.y), this.radius);
    }

    public final Circle offsetRadius(float offset) {
        return new Circle(this.center, this.radius + offset);
    }

    public final List<Circle> generateCircles(List<Float> radii, boolean offsetInitialCircle) {
        Intrinsics.checkNotNullParameter(radii, "radii");
        Iterator<T> it = radii.iterator();
        do {
            float fArcAngle = 0.0f;
            if (!it.hasNext()) {
                Iterator<Float> it2 = radii.iterator();
                while (it2.hasNext()) {
                    fArcAngle += arcAngle(it2.next().floatValue());
                }
                double size = (6.283185307179586d - fArcAngle) / radii.size();
                ArrayList arrayList = new ArrayList();
                float radians = (float) Math.toRadians(180.0d);
                if (offsetInitialCircle) {
                    radians -= arcAngle(((Number) CollectionsKt.first((List) radii)).floatValue()) / 2;
                }
                Iterator<Float> it3 = radii.iterator();
                while (it3.hasNext()) {
                    float fFloatValue = it3.next().floatValue();
                    float fArcAngle2 = arcAngle(fFloatValue) / 2;
                    float f = radians + fArcAngle2;
                    arrayList.add(new Circle(perimeterCenterPoint(f, fFloatValue), fFloatValue));
                    radians = f + ((float) (fArcAngle2 + size));
                }
                return arrayList;
            }
        } while (((Number) it.next()).floatValue() >= 0.0f);
        throw new IllegalArgumentException("Failed requirement.");
    }

    private final PointF perimeterCenterPoint(float angle, float otherCircleRadius) {
        double d = angle;
        float f = (4 * otherCircleRadius) / 5;
        float fCos = ((float) Math.cos(d)) * (this.radius + f);
        float fSin = ((float) Math.sin(d)) * (this.radius + f);
        PointF pointF = this.center;
        return new PointF(pointF.x + fCos, pointF.y + fSin);
    }

    private final Tuples2<PointF, PointF> intersectionPoints(Circle other) {
        PointF pointF = other.center;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = other.radius;
        PointF pointF2 = this.center;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        float f6 = this.radius;
        float f7 = f4 - f;
        float f8 = f5 - f2;
        float fHypot = (float) Math.hypot(f7, f8);
        double d = f3;
        double dPow = ((Math.pow(d, 2.0d) - Math.pow(f6, 2.0d)) + Math.pow(fHypot, 2.0d)) / (2 * fHypot);
        double dSqrt = Math.sqrt(Math.pow(d, 2.0d) - Math.pow(dPow, 2.0d));
        double d2 = f7 / fHypot;
        double d3 = f + (dPow * d2);
        double d4 = f8 / fHypot;
        double d5 = dSqrt * d4;
        double d6 = f2 + (dPow * d4);
        double d7 = dSqrt * d2;
        return Tuples4.m3642to(new PointF((float) (d3 - d5), (float) (d6 + d7)), new PointF((float) (d3 + d5), (float) (d6 - d7)));
    }

    private final float angleBetween(PointF point1, PointF point2) {
        float f = point1.x;
        PointF pointF = this.center;
        float f2 = pointF.x;
        float f3 = f - f2;
        float f4 = point1.y;
        float f5 = pointF.y;
        float f6 = f4 - f5;
        float f7 = point2.x - f2;
        float f8 = point2.y - f5;
        float fAtan = (float) Math.atan(((f3 * f8) - (f6 * f7)) / ((f3 * f7) + (f6 * f8)));
        return fAtan < 0.0f ? (float) (fAtan + 3.141592653589793d) : fAtan;
    }

    private final float arcAngle(float radius) {
        return arcAngle(new Circle(perimeterCenterPoint(0.0f, radius), radius));
    }

    private final float arcAngle(Circle circle) {
        Tuples2<PointF, PointF> tuples2IntersectionPoints = intersectionPoints(circle);
        return angleBetween(tuples2IntersectionPoints.component1(), tuples2IntersectionPoints.component2());
    }
}
