package com.robinhood.android.charts;

import com.robinhood.android.charts.model.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrubWindow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/charts/ScrubWindow;", "", "minX", "", "minY", "maxX", "maxY", "<init>", "(FFFF)V", "getMinX", "()F", "getMinY", "getMaxX", "getMaxY", "containScrubPoint", "Lcom/robinhood/android/charts/model/Point;", "point", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScrubWindow {
    public static final int $stable = 0;
    private final float maxX;
    private final float maxY;
    private final float minX;
    private final float minY;

    public ScrubWindow() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ ScrubWindow copy$default(ScrubWindow scrubWindow, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = scrubWindow.minX;
        }
        if ((i & 2) != 0) {
            f2 = scrubWindow.minY;
        }
        if ((i & 4) != 0) {
            f3 = scrubWindow.maxX;
        }
        if ((i & 8) != 0) {
            f4 = scrubWindow.maxY;
        }
        return scrubWindow.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getMinX() {
        return this.minX;
    }

    /* renamed from: component2, reason: from getter */
    public final float getMinY() {
        return this.minY;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMaxX() {
        return this.maxX;
    }

    /* renamed from: component4, reason: from getter */
    public final float getMaxY() {
        return this.maxY;
    }

    public final ScrubWindow copy(float minX, float minY, float maxX, float maxY) {
        return new ScrubWindow(minX, minY, maxX, maxY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrubWindow)) {
            return false;
        }
        ScrubWindow scrubWindow = (ScrubWindow) other;
        return Float.compare(this.minX, scrubWindow.minX) == 0 && Float.compare(this.minY, scrubWindow.minY) == 0 && Float.compare(this.maxX, scrubWindow.maxX) == 0 && Float.compare(this.maxY, scrubWindow.maxY) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.minX) * 31) + Float.hashCode(this.minY)) * 31) + Float.hashCode(this.maxX)) * 31) + Float.hashCode(this.maxY);
    }

    public String toString() {
        return "ScrubWindow(minX=" + this.minX + ", minY=" + this.minY + ", maxX=" + this.maxX + ", maxY=" + this.maxY + ")";
    }

    public ScrubWindow(float f, float f2, float f3, float f4) {
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
    }

    public /* synthetic */ ScrubWindow(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? 1.0f : f4);
    }

    public final float getMinX() {
        return this.minX;
    }

    public final float getMinY() {
        return this.minY;
    }

    public final float getMaxX() {
        return this.maxX;
    }

    public final float getMaxY() {
        return this.maxY;
    }

    public final Point containScrubPoint(Point point) {
        Intrinsics.checkNotNullParameter(point, "point");
        float x = point.getX();
        float x2 = this.minX;
        if (x >= x2) {
            float x3 = point.getX();
            x2 = this.maxX;
            if (x3 <= x2) {
                x2 = point.getX();
            }
        }
        float y = point.getY();
        float y2 = this.minY;
        if (y >= y2) {
            float y3 = point.getY();
            y2 = this.maxY;
            if (y3 <= y2) {
                y2 = point.getY();
            }
        }
        return new Point(x2, y2);
    }
}
