package com.robinhood.android.advisory.portfolio;

import kotlin.Metadata;

/* compiled from: AngleTools.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/SliceWindow;", "", "start", "", "end", "<init>", "(FF)V", "getStart", "()F", "getEnd", "contains", "", "angle", "midPoint", "getMidPoint", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SliceWindow {
    public static final int $stable = 0;
    private final float end;
    private final float start;

    public static /* synthetic */ SliceWindow copy$default(SliceWindow sliceWindow, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = sliceWindow.start;
        }
        if ((i & 2) != 0) {
            f2 = sliceWindow.end;
        }
        return sliceWindow.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    public final SliceWindow copy(float start, float end) {
        return new SliceWindow(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliceWindow)) {
            return false;
        }
        SliceWindow sliceWindow = (SliceWindow) other;
        return Float.compare(this.start, sliceWindow.start) == 0 && Float.compare(this.end, sliceWindow.end) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.start) * 31) + Float.hashCode(this.end);
    }

    public String toString() {
        return "SliceWindow(start=" + this.start + ", end=" + this.end + ")";
    }

    public SliceWindow(float f, float f2) {
        this.start = f;
        this.end = f2;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getEnd() {
        return this.end;
    }

    public final boolean contains(float angle) {
        return angle <= this.end && this.start <= angle;
    }

    public final float getMidPoint() {
        return (this.start + this.end) / 2.0f;
    }
}
