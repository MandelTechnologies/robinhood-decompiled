package com.robinhood.shared.ticker.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColumnDataBuilder.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/ColumnSnapshotWithWidth;", "", "snapshot", "Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "currentWidth", "", "previousWidth", "<init>", "(Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;FF)V", "getSnapshot", "()Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "getCurrentWidth", "()F", "getPreviousWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
final /* data */ class ColumnSnapshotWithWidth {
    private final float currentWidth;
    private final float previousWidth;
    private final TickerColumnSnapshot snapshot;

    public static /* synthetic */ ColumnSnapshotWithWidth copy$default(ColumnSnapshotWithWidth columnSnapshotWithWidth, TickerColumnSnapshot tickerColumnSnapshot, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            tickerColumnSnapshot = columnSnapshotWithWidth.snapshot;
        }
        if ((i & 2) != 0) {
            f = columnSnapshotWithWidth.currentWidth;
        }
        if ((i & 4) != 0) {
            f2 = columnSnapshotWithWidth.previousWidth;
        }
        return columnSnapshotWithWidth.copy(tickerColumnSnapshot, f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final TickerColumnSnapshot getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component2, reason: from getter */
    public final float getCurrentWidth() {
        return this.currentWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final float getPreviousWidth() {
        return this.previousWidth;
    }

    public final ColumnSnapshotWithWidth copy(TickerColumnSnapshot snapshot, float currentWidth, float previousWidth) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return new ColumnSnapshotWithWidth(snapshot, currentWidth, previousWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnSnapshotWithWidth)) {
            return false;
        }
        ColumnSnapshotWithWidth columnSnapshotWithWidth = (ColumnSnapshotWithWidth) other;
        return Intrinsics.areEqual(this.snapshot, columnSnapshotWithWidth.snapshot) && Float.compare(this.currentWidth, columnSnapshotWithWidth.currentWidth) == 0 && Float.compare(this.previousWidth, columnSnapshotWithWidth.previousWidth) == 0;
    }

    public int hashCode() {
        return (((this.snapshot.hashCode() * 31) + Float.hashCode(this.currentWidth)) * 31) + Float.hashCode(this.previousWidth);
    }

    public String toString() {
        return "ColumnSnapshotWithWidth(snapshot=" + this.snapshot + ", currentWidth=" + this.currentWidth + ", previousWidth=" + this.previousWidth + ")";
    }

    public ColumnSnapshotWithWidth(TickerColumnSnapshot snapshot, float f, float f2) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
        this.currentWidth = f;
        this.previousWidth = f2;
    }

    public final TickerColumnSnapshot getSnapshot() {
        return this.snapshot;
    }

    public final float getCurrentWidth() {
        return this.currentWidth;
    }

    public final float getPreviousWidth() {
        return this.previousWidth;
    }
}
