package com.robinhood.android.generic.table;

import androidx.compose.foundation.ScrollState;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/generic/table/DisplayDetails;", "", "rowIndex", "", "columnIndex", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "", "stickyColumn", "horizontalScrollState", "Landroidx/compose/foundation/ScrollState;", "<init>", "(IIZZLandroidx/compose/foundation/ScrollState;)V", "getRowIndex", "()I", "getColumnIndex", "getPreview", "()Z", "getStickyColumn", "getHorizontalScrollState", "()Landroidx/compose/foundation/ScrollState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "lib-generic-table_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DisplayDetails {
    public static final int $stable = 0;
    private final int columnIndex;
    private final ScrollState horizontalScrollState;
    private final boolean preview;
    private final int rowIndex;
    private final boolean stickyColumn;

    public static /* synthetic */ DisplayDetails copy$default(DisplayDetails displayDetails, int i, int i2, boolean z, boolean z2, ScrollState scrollState, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = displayDetails.rowIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = displayDetails.columnIndex;
        }
        if ((i3 & 4) != 0) {
            z = displayDetails.preview;
        }
        if ((i3 & 8) != 0) {
            z2 = displayDetails.stickyColumn;
        }
        if ((i3 & 16) != 0) {
            scrollState = displayDetails.horizontalScrollState;
        }
        ScrollState scrollState2 = scrollState;
        boolean z3 = z;
        return displayDetails.copy(i, i2, z3, z2, scrollState2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRowIndex() {
        return this.rowIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColumnIndex() {
        return this.columnIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPreview() {
        return this.preview;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStickyColumn() {
        return this.stickyColumn;
    }

    /* renamed from: component5, reason: from getter */
    public final ScrollState getHorizontalScrollState() {
        return this.horizontalScrollState;
    }

    public final DisplayDetails copy(int rowIndex, int columnIndex, boolean preview, boolean stickyColumn, ScrollState horizontalScrollState) {
        Intrinsics.checkNotNullParameter(horizontalScrollState, "horizontalScrollState");
        return new DisplayDetails(rowIndex, columnIndex, preview, stickyColumn, horizontalScrollState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayDetails)) {
            return false;
        }
        DisplayDetails displayDetails = (DisplayDetails) other;
        return this.rowIndex == displayDetails.rowIndex && this.columnIndex == displayDetails.columnIndex && this.preview == displayDetails.preview && this.stickyColumn == displayDetails.stickyColumn && Intrinsics.areEqual(this.horizontalScrollState, displayDetails.horizontalScrollState);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.rowIndex) * 31) + Integer.hashCode(this.columnIndex)) * 31) + Boolean.hashCode(this.preview)) * 31) + Boolean.hashCode(this.stickyColumn)) * 31) + this.horizontalScrollState.hashCode();
    }

    public String toString() {
        return "DisplayDetails(rowIndex=" + this.rowIndex + ", columnIndex=" + this.columnIndex + ", preview=" + this.preview + ", stickyColumn=" + this.stickyColumn + ", horizontalScrollState=" + this.horizontalScrollState + ")";
    }

    public DisplayDetails(int i, int i2, boolean z, boolean z2, ScrollState horizontalScrollState) {
        Intrinsics.checkNotNullParameter(horizontalScrollState, "horizontalScrollState");
        this.rowIndex = i;
        this.columnIndex = i2;
        this.preview = z;
        this.stickyColumn = z2;
        this.horizontalScrollState = horizontalScrollState;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final boolean getPreview() {
        return this.preview;
    }

    public final boolean getStickyColumn() {
        return this.stickyColumn;
    }

    public final ScrollState getHorizontalScrollState() {
        return this.horizontalScrollState;
    }
}
