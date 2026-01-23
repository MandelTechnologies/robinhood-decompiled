package com.robinhood.android.charts.span;

import kotlin.Metadata;

/* compiled from: SpanDot.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/charts/span/SpanDotState;", "", "pulsing", "", "<init>", "(Z)V", "getPulsing", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SpanDotState {
    public static final int $stable = 0;
    private final boolean pulsing;

    public static /* synthetic */ SpanDotState copy$default(SpanDotState spanDotState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = spanDotState.pulsing;
        }
        return spanDotState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPulsing() {
        return this.pulsing;
    }

    public final SpanDotState copy(boolean pulsing) {
        return new SpanDotState(pulsing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SpanDotState) && this.pulsing == ((SpanDotState) other).pulsing;
    }

    public int hashCode() {
        return Boolean.hashCode(this.pulsing);
    }

    public String toString() {
        return "SpanDotState(pulsing=" + this.pulsing + ")";
    }

    public SpanDotState(boolean z) {
        this.pulsing = z;
    }

    public final boolean getPulsing() {
        return this.pulsing;
    }
}
