package com.robinhood.android.options.simulatedreturnschart;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Breakevens.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/options/simulatedreturnschart/BreakevenPoint;", "", "rawPoint", "Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "indexAfterBreakeven", "", "<init>", "(Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;I)V", "getRawPoint", "()Lcom/robinhood/android/options/simulatedreturnschart/RawPoint;", "getIndexAfterBreakeven", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-options-simulated-returns-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BreakevenPoint {
    public static final int $stable = 8;
    private final int indexAfterBreakeven;
    private final RawPoint rawPoint;

    public static /* synthetic */ BreakevenPoint copy$default(BreakevenPoint breakevenPoint, RawPoint rawPoint, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rawPoint = breakevenPoint.rawPoint;
        }
        if ((i2 & 2) != 0) {
            i = breakevenPoint.indexAfterBreakeven;
        }
        return breakevenPoint.copy(rawPoint, i);
    }

    /* renamed from: component1, reason: from getter */
    public final RawPoint getRawPoint() {
        return this.rawPoint;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndexAfterBreakeven() {
        return this.indexAfterBreakeven;
    }

    public final BreakevenPoint copy(RawPoint rawPoint, int indexAfterBreakeven) {
        Intrinsics.checkNotNullParameter(rawPoint, "rawPoint");
        return new BreakevenPoint(rawPoint, indexAfterBreakeven);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreakevenPoint)) {
            return false;
        }
        BreakevenPoint breakevenPoint = (BreakevenPoint) other;
        return Intrinsics.areEqual(this.rawPoint, breakevenPoint.rawPoint) && this.indexAfterBreakeven == breakevenPoint.indexAfterBreakeven;
    }

    public int hashCode() {
        return (this.rawPoint.hashCode() * 31) + Integer.hashCode(this.indexAfterBreakeven);
    }

    public String toString() {
        return "BreakevenPoint(rawPoint=" + this.rawPoint + ", indexAfterBreakeven=" + this.indexAfterBreakeven + ")";
    }

    public BreakevenPoint(RawPoint rawPoint, int i) {
        Intrinsics.checkNotNullParameter(rawPoint, "rawPoint");
        this.rawPoint = rawPoint;
        this.indexAfterBreakeven = i;
    }

    public final RawPoint getRawPoint() {
        return this.rawPoint;
    }

    public final int getIndexAfterBreakeven() {
        return this.indexAfterBreakeven;
    }
}
