package com.robinhood.android.trade.options.profitloss.local;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PiecewiseLinearFunction.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/Point;", "", "x", "Ljava/math/BigDecimal;", "y", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getX", "()Ljava/math/BigDecimal;", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Point {
    public static final int $stable = 8;
    private final BigDecimal x;
    private final BigDecimal y;

    public static /* synthetic */ Point copy$default(Point point, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = point.x;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = point.y;
        }
        return point.copy(bigDecimal, bigDecimal2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getX() {
        return this.x;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getY() {
        return this.y;
    }

    public final Point copy(BigDecimal x, BigDecimal y) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        return new Point(x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Point)) {
            return false;
        }
        Point point = (Point) other;
        return Intrinsics.areEqual(this.x, point.x) && Intrinsics.areEqual(this.y, point.y);
    }

    public int hashCode() {
        return (this.x.hashCode() * 31) + this.y.hashCode();
    }

    public String toString() {
        return "Point(x=" + this.x + ", y=" + this.y + ")";
    }

    public Point(BigDecimal x, BigDecimal y) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        this.x = x;
        this.y = y;
    }

    public final BigDecimal getX() {
        return this.x;
    }

    public final BigDecimal getY() {
        return this.y;
    }
}
