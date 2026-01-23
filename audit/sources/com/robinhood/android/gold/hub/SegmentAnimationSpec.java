package com.robinhood.android.gold.hub;

import kotlin.Metadata;

/* compiled from: GoldHubCylinderChartComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/SegmentAnimationSpec;", "", "delayMillis", "", "durationMillis", "<init>", "(II)V", "getDelayMillis", "()I", "getDurationMillis", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SegmentAnimationSpec {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;

    public static /* synthetic */ SegmentAnimationSpec copy$default(SegmentAnimationSpec segmentAnimationSpec, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = segmentAnimationSpec.delayMillis;
        }
        if ((i3 & 2) != 0) {
            i2 = segmentAnimationSpec.durationMillis;
        }
        return segmentAnimationSpec.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDelayMillis() {
        return this.delayMillis;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final SegmentAnimationSpec copy(int delayMillis, int durationMillis) {
        return new SegmentAnimationSpec(delayMillis, durationMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentAnimationSpec)) {
            return false;
        }
        SegmentAnimationSpec segmentAnimationSpec = (SegmentAnimationSpec) other;
        return this.delayMillis == segmentAnimationSpec.delayMillis && this.durationMillis == segmentAnimationSpec.durationMillis;
    }

    public int hashCode() {
        return (Integer.hashCode(this.delayMillis) * 31) + Integer.hashCode(this.durationMillis);
    }

    public String toString() {
        return "SegmentAnimationSpec(delayMillis=" + this.delayMillis + ", durationMillis=" + this.durationMillis + ")";
    }

    public SegmentAnimationSpec(int i, int i2) {
        this.delayMillis = i;
        this.durationMillis = i2;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }
}
