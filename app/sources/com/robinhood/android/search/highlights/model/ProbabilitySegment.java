package com.robinhood.android.search.highlights.model;

import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProbabilitySegments.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/search/highlights/model/ProbabilitySegment;", "", "fraction", "", ResourceTypes.COLOR, "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "<init>", "(FLcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;)V", "getFraction", "()F", "getColor", "()Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-search-highlights_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProbabilitySegment {
    public static final int $stable = 0;
    private final DayNightColor color;
    private final float fraction;

    public static /* synthetic */ ProbabilitySegment copy$default(ProbabilitySegment probabilitySegment, float f, DayNightColor dayNightColor, int i, Object obj) {
        if ((i & 1) != 0) {
            f = probabilitySegment.fraction;
        }
        if ((i & 2) != 0) {
            dayNightColor = probabilitySegment.color;
        }
        return probabilitySegment.copy(f, dayNightColor);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    /* renamed from: component2, reason: from getter */
    public final DayNightColor getColor() {
        return this.color;
    }

    public final ProbabilitySegment copy(float fraction, DayNightColor color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new ProbabilitySegment(fraction, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProbabilitySegment)) {
            return false;
        }
        ProbabilitySegment probabilitySegment = (ProbabilitySegment) other;
        return Float.compare(this.fraction, probabilitySegment.fraction) == 0 && Intrinsics.areEqual(this.color, probabilitySegment.color);
    }

    public int hashCode() {
        return (Float.hashCode(this.fraction) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "ProbabilitySegment(fraction=" + this.fraction + ", color=" + this.color + ")";
    }

    public ProbabilitySegment(float f, DayNightColor color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.fraction = f;
        this.color = color;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final DayNightColor getColor() {
        return this.color;
    }
}
