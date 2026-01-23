package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/Point;", "", "x", "Landroidx/compose/ui/unit/Dp;", "z", "", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getX-D9Ej5fM", "()F", "F", "getZ", "component1", "component1-D9Ej5fM", "component2", "copy", "copy-D5KLDUw", "(FF)Lcom/robinhood/android/futures/trade/ui/ladder/Point;", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final /* data */ class Point {
    private final float x;
    private final float z;

    public /* synthetic */ Point(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ Point m14885copyD5KLDUw$default(Point point, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = point.x;
        }
        if ((i & 2) != 0) {
            f2 = point.z;
        }
        return point.m14887copyD5KLDUw(f, f2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final Point m14887copyD5KLDUw(float x, float z) {
        return new Point(x, z, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Point)) {
            return false;
        }
        Point point = (Point) other;
        return C2002Dp.m7997equalsimpl0(this.x, point.x) && Float.compare(this.z, point.z) == 0;
    }

    public int hashCode() {
        return (C2002Dp.m7998hashCodeimpl(this.x) * 31) + Float.hashCode(this.z);
    }

    public String toString() {
        return "Point(x=" + C2002Dp.m7999toStringimpl(this.x) + ", z=" + this.z + ")";
    }

    private Point(float f, float f2) {
        this.x = f;
        this.z = f2;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m14888getXD9Ej5fM() {
        return this.x;
    }

    public final float getZ() {
        return this.z;
    }
}
