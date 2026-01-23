package com.robinhood.android.equityscreener.indicators;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndicatorRangeSliderSelector.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/indicators/FinishedRange;", "", "min", "", AnalyticsStrings.MAX_WELCOME_TAG, "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getMin", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMax", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/robinhood/android/equityscreener/indicators/FinishedRange;", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final /* data */ class FinishedRange {
    private final Float max;
    private final Float min;

    public static /* synthetic */ FinishedRange copy$default(FinishedRange finishedRange, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = finishedRange.min;
        }
        if ((i & 2) != 0) {
            f2 = finishedRange.max;
        }
        return finishedRange.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final Float getMin() {
        return this.min;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getMax() {
        return this.max;
    }

    public final FinishedRange copy(Float min, Float max) {
        return new FinishedRange(min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinishedRange)) {
            return false;
        }
        FinishedRange finishedRange = (FinishedRange) other;
        return Intrinsics.areEqual((Object) this.min, (Object) finishedRange.min) && Intrinsics.areEqual((Object) this.max, (Object) finishedRange.max);
    }

    public int hashCode() {
        Float f = this.min;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.max;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    public String toString() {
        return "FinishedRange(min=" + this.min + ", max=" + this.max + ")";
    }

    public FinishedRange(Float f, Float f2) {
        this.min = f;
        this.max = f2;
    }

    public final Float getMax() {
        return this.max;
    }

    public final Float getMin() {
        return this.min;
    }
}
