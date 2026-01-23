package com.robinhood.android.event.gamedetail.p130ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: GameDetailBottomSheetStateHolder.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/ui/SheetHeights;", "", "dragHandleHeight", "", "tradeSlipExpandedHeight", "positionDetailBottomSheetHeight", "<init>", "(III)V", "getDragHandleHeight", "()I", "getTradeSlipExpandedHeight", "getPositionDetailBottomSheetHeight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SheetHeights {
    public static final int $stable = 0;
    private final int dragHandleHeight;
    private final int positionDetailBottomSheetHeight;
    private final int tradeSlipExpandedHeight;

    public SheetHeights() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ SheetHeights copy$default(SheetHeights sheetHeights, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sheetHeights.dragHandleHeight;
        }
        if ((i4 & 2) != 0) {
            i2 = sheetHeights.tradeSlipExpandedHeight;
        }
        if ((i4 & 4) != 0) {
            i3 = sheetHeights.positionDetailBottomSheetHeight;
        }
        return sheetHeights.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDragHandleHeight() {
        return this.dragHandleHeight;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTradeSlipExpandedHeight() {
        return this.tradeSlipExpandedHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPositionDetailBottomSheetHeight() {
        return this.positionDetailBottomSheetHeight;
    }

    public final SheetHeights copy(int dragHandleHeight, int tradeSlipExpandedHeight, int positionDetailBottomSheetHeight) {
        return new SheetHeights(dragHandleHeight, tradeSlipExpandedHeight, positionDetailBottomSheetHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SheetHeights)) {
            return false;
        }
        SheetHeights sheetHeights = (SheetHeights) other;
        return this.dragHandleHeight == sheetHeights.dragHandleHeight && this.tradeSlipExpandedHeight == sheetHeights.tradeSlipExpandedHeight && this.positionDetailBottomSheetHeight == sheetHeights.positionDetailBottomSheetHeight;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.dragHandleHeight) * 31) + Integer.hashCode(this.tradeSlipExpandedHeight)) * 31) + Integer.hashCode(this.positionDetailBottomSheetHeight);
    }

    public String toString() {
        return "SheetHeights(dragHandleHeight=" + this.dragHandleHeight + ", tradeSlipExpandedHeight=" + this.tradeSlipExpandedHeight + ", positionDetailBottomSheetHeight=" + this.positionDetailBottomSheetHeight + ")";
    }

    public SheetHeights(int i, int i2, int i3) {
        this.dragHandleHeight = i;
        this.tradeSlipExpandedHeight = i2;
        this.positionDetailBottomSheetHeight = i3;
    }

    public /* synthetic */ SheetHeights(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getDragHandleHeight() {
        return this.dragHandleHeight;
    }

    public final int getTradeSlipExpandedHeight() {
        return this.tradeSlipExpandedHeight;
    }

    public final int getPositionDetailBottomSheetHeight() {
        return this.positionDetailBottomSheetHeight;
    }
}
