package com.robinhood.android.mcw.fxswitcher.ftux.constants;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;

/* compiled from: BezierControlPoints.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/mcw/fxswitcher/ftux/constants/BezierControlPoints;", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "b", "c", "d", "<init>", "(FFFF)V", "getA", "()F", "getB", "getC", "getD", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-fx-switcher-ftux-constants_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BezierControlPoints {
    public static final int $stable = 0;
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public static /* synthetic */ BezierControlPoints copy$default(BezierControlPoints bezierControlPoints, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bezierControlPoints.a;
        }
        if ((i & 2) != 0) {
            f2 = bezierControlPoints.b;
        }
        if ((i & 4) != 0) {
            f3 = bezierControlPoints.c;
        }
        if ((i & 8) != 0) {
            f4 = bezierControlPoints.d;
        }
        return bezierControlPoints.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getA() {
        return this.a;
    }

    /* renamed from: component2, reason: from getter */
    public final float getB() {
        return this.b;
    }

    /* renamed from: component3, reason: from getter */
    public final float getC() {
        return this.c;
    }

    /* renamed from: component4, reason: from getter */
    public final float getD() {
        return this.d;
    }

    public final BezierControlPoints copy(float a, float b, float c, float d) {
        return new BezierControlPoints(a, b, c, d);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BezierControlPoints)) {
            return false;
        }
        BezierControlPoints bezierControlPoints = (BezierControlPoints) other;
        return Float.compare(this.a, bezierControlPoints.a) == 0 && Float.compare(this.b, bezierControlPoints.b) == 0 && Float.compare(this.c, bezierControlPoints.c) == 0 && Float.compare(this.d, bezierControlPoints.d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "BezierControlPoints(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ")";
    }

    public BezierControlPoints(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float getA() {
        return this.a;
    }

    public final float getB() {
        return this.b;
    }

    public final float getC() {
        return this.c;
    }

    public final float getD() {
        return this.d;
    }
}
