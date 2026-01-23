package com.robinhood.shared.ticker.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColumnDataBuilder.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/ColumnDataResult;", "", "columns", "", "Lcom/robinhood/shared/ticker/internal/ColumnDataResult$ColumnData;", "previousWidth", "", "currentWidth", "<init>", "(Ljava/util/List;FF)V", "getColumns", "()Ljava/util/List;", "getPreviousWidth", "()F", "getCurrentWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ColumnData", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ColumnDataResult {
    public static final int $stable = 8;
    private final List<ColumnData> columns;
    private final float currentWidth;
    private final float previousWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColumnDataResult copy$default(ColumnDataResult columnDataResult, List list, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = columnDataResult.columns;
        }
        if ((i & 2) != 0) {
            f = columnDataResult.previousWidth;
        }
        if ((i & 4) != 0) {
            f2 = columnDataResult.currentWidth;
        }
        return columnDataResult.copy(list, f, f2);
    }

    public final List<ColumnData> component1() {
        return this.columns;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPreviousWidth() {
        return this.previousWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final float getCurrentWidth() {
        return this.currentWidth;
    }

    public final ColumnDataResult copy(List<ColumnData> columns, float previousWidth, float currentWidth) {
        Intrinsics.checkNotNullParameter(columns, "columns");
        return new ColumnDataResult(columns, previousWidth, currentWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColumnDataResult)) {
            return false;
        }
        ColumnDataResult columnDataResult = (ColumnDataResult) other;
        return Intrinsics.areEqual(this.columns, columnDataResult.columns) && Float.compare(this.previousWidth, columnDataResult.previousWidth) == 0 && Float.compare(this.currentWidth, columnDataResult.currentWidth) == 0;
    }

    public int hashCode() {
        return (((this.columns.hashCode() * 31) + Float.hashCode(this.previousWidth)) * 31) + Float.hashCode(this.currentWidth);
    }

    public String toString() {
        return "ColumnDataResult(columns=" + this.columns + ", previousWidth=" + this.previousWidth + ", currentWidth=" + this.currentWidth + ")";
    }

    public ColumnDataResult(List<ColumnData> columns, float f, float f2) {
        Intrinsics.checkNotNullParameter(columns, "columns");
        this.columns = columns;
        this.previousWidth = f;
        this.currentWidth = f2;
    }

    public final List<ColumnData> getColumns() {
        return this.columns;
    }

    public final float getPreviousWidth() {
        return this.previousWidth;
    }

    public final float getCurrentWidth() {
        return this.currentWidth;
    }

    /* compiled from: ColumnDataBuilder.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016Jb\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/ticker/internal/ColumnDataResult$ColumnData;", "", "snapshot", "Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "width", "", "previousX", "currentX", "currentCharOffset", "previousCharOffset", "currentCharAlpha", "previousCharAlpha", "<init>", "(Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;FFFFLjava/lang/Float;FLjava/lang/Float;)V", "getSnapshot", "()Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;", "getWidth", "()F", "getPreviousX", "getCurrentX", "getCurrentCharOffset", "getPreviousCharOffset", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrentCharAlpha", "getPreviousCharAlpha", "animatedX", "progress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/robinhood/shared/ticker/internal/TickerColumnSnapshot;FFFFLjava/lang/Float;FLjava/lang/Float;)Lcom/robinhood/shared/ticker/internal/ColumnDataResult$ColumnData;", "equals", "", "other", "hashCode", "", "toString", "", "lib-ticker-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ColumnData {
        public static final int $stable = 0;
        private final float currentCharAlpha;
        private final float currentCharOffset;
        private final float currentX;
        private final Float previousCharAlpha;
        private final Float previousCharOffset;
        private final float previousX;
        private final TickerColumnSnapshot snapshot;
        private final float width;

        public static /* synthetic */ ColumnData copy$default(ColumnData columnData, TickerColumnSnapshot tickerColumnSnapshot, float f, float f2, float f3, float f4, Float f5, float f6, Float f7, int i, Object obj) {
            if ((i & 1) != 0) {
                tickerColumnSnapshot = columnData.snapshot;
            }
            if ((i & 2) != 0) {
                f = columnData.width;
            }
            if ((i & 4) != 0) {
                f2 = columnData.previousX;
            }
            if ((i & 8) != 0) {
                f3 = columnData.currentX;
            }
            if ((i & 16) != 0) {
                f4 = columnData.currentCharOffset;
            }
            if ((i & 32) != 0) {
                f5 = columnData.previousCharOffset;
            }
            if ((i & 64) != 0) {
                f6 = columnData.currentCharAlpha;
            }
            if ((i & 128) != 0) {
                f7 = columnData.previousCharAlpha;
            }
            float f8 = f6;
            Float f9 = f7;
            float f10 = f4;
            Float f11 = f5;
            return columnData.copy(tickerColumnSnapshot, f, f2, f3, f10, f11, f8, f9);
        }

        /* renamed from: component1, reason: from getter */
        public final TickerColumnSnapshot getSnapshot() {
            return this.snapshot;
        }

        /* renamed from: component2, reason: from getter */
        public final float getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final float getPreviousX() {
            return this.previousX;
        }

        /* renamed from: component4, reason: from getter */
        public final float getCurrentX() {
            return this.currentX;
        }

        /* renamed from: component5, reason: from getter */
        public final float getCurrentCharOffset() {
            return this.currentCharOffset;
        }

        /* renamed from: component6, reason: from getter */
        public final Float getPreviousCharOffset() {
            return this.previousCharOffset;
        }

        /* renamed from: component7, reason: from getter */
        public final float getCurrentCharAlpha() {
            return this.currentCharAlpha;
        }

        /* renamed from: component8, reason: from getter */
        public final Float getPreviousCharAlpha() {
            return this.previousCharAlpha;
        }

        public final ColumnData copy(TickerColumnSnapshot snapshot, float width, float previousX, float currentX, float currentCharOffset, Float previousCharOffset, float currentCharAlpha, Float previousCharAlpha) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            return new ColumnData(snapshot, width, previousX, currentX, currentCharOffset, previousCharOffset, currentCharAlpha, previousCharAlpha);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColumnData)) {
                return false;
            }
            ColumnData columnData = (ColumnData) other;
            return Intrinsics.areEqual(this.snapshot, columnData.snapshot) && Float.compare(this.width, columnData.width) == 0 && Float.compare(this.previousX, columnData.previousX) == 0 && Float.compare(this.currentX, columnData.currentX) == 0 && Float.compare(this.currentCharOffset, columnData.currentCharOffset) == 0 && Intrinsics.areEqual((Object) this.previousCharOffset, (Object) columnData.previousCharOffset) && Float.compare(this.currentCharAlpha, columnData.currentCharAlpha) == 0 && Intrinsics.areEqual((Object) this.previousCharAlpha, (Object) columnData.previousCharAlpha);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.snapshot.hashCode() * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.previousX)) * 31) + Float.hashCode(this.currentX)) * 31) + Float.hashCode(this.currentCharOffset)) * 31;
            Float f = this.previousCharOffset;
            int iHashCode2 = (((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + Float.hashCode(this.currentCharAlpha)) * 31;
            Float f2 = this.previousCharAlpha;
            return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
        }

        public String toString() {
            return "ColumnData(snapshot=" + this.snapshot + ", width=" + this.width + ", previousX=" + this.previousX + ", currentX=" + this.currentX + ", currentCharOffset=" + this.currentCharOffset + ", previousCharOffset=" + this.previousCharOffset + ", currentCharAlpha=" + this.currentCharAlpha + ", previousCharAlpha=" + this.previousCharAlpha + ")";
        }

        public ColumnData(TickerColumnSnapshot snapshot, float f, float f2, float f3, float f4, Float f5, float f6, Float f7) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.width = f;
            this.previousX = f2;
            this.currentX = f3;
            this.currentCharOffset = f4;
            this.previousCharOffset = f5;
            this.currentCharAlpha = f6;
            this.previousCharAlpha = f7;
        }

        public final TickerColumnSnapshot getSnapshot() {
            return this.snapshot;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float getPreviousX() {
            return this.previousX;
        }

        public final float getCurrentX() {
            return this.currentX;
        }

        public final float getCurrentCharOffset() {
            return this.currentCharOffset;
        }

        public final Float getPreviousCharOffset() {
            return this.previousCharOffset;
        }

        public final float getCurrentCharAlpha() {
            return this.currentCharAlpha;
        }

        public final Float getPreviousCharAlpha() {
            return this.previousCharAlpha;
        }

        public final float animatedX(float progress) {
            float f = this.previousX;
            return f + ((this.currentX - f) * progress);
        }
    }
}
