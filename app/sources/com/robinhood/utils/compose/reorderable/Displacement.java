package com.robinhood.utils.compose.reorderable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragStateV2.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/Displacement;", "", "dragDraggableItemInfo", "Lcom/robinhood/utils/compose/reorderable/DraggableItem;", "dragItemSize", "", "dragAmount", "targetIndex", "<init>", "(Lcom/robinhood/utils/compose/reorderable/DraggableItem;III)V", "getDragDraggableItemInfo", "()Lcom/robinhood/utils/compose/reorderable/DraggableItem;", "getDragItemSize", "()I", "getDragAmount", "getTargetIndex", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Displacement {
    public static final int $stable = 8;
    private final int dragAmount;
    private final DraggableItem dragDraggableItemInfo;
    private final int dragItemSize;
    private final int targetIndex;

    public static /* synthetic */ Displacement copy$default(Displacement displacement, DraggableItem draggableItem, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            draggableItem = displacement.dragDraggableItemInfo;
        }
        if ((i4 & 2) != 0) {
            i = displacement.dragItemSize;
        }
        if ((i4 & 4) != 0) {
            i2 = displacement.dragAmount;
        }
        if ((i4 & 8) != 0) {
            i3 = displacement.targetIndex;
        }
        return displacement.copy(draggableItem, i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final DraggableItem getDragDraggableItemInfo() {
        return this.dragDraggableItemInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDragItemSize() {
        return this.dragItemSize;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDragAmount() {
        return this.dragAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public final Displacement copy(DraggableItem dragDraggableItemInfo, int dragItemSize, int dragAmount, int targetIndex) {
        Intrinsics.checkNotNullParameter(dragDraggableItemInfo, "dragDraggableItemInfo");
        return new Displacement(dragDraggableItemInfo, dragItemSize, dragAmount, targetIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Displacement)) {
            return false;
        }
        Displacement displacement = (Displacement) other;
        return Intrinsics.areEqual(this.dragDraggableItemInfo, displacement.dragDraggableItemInfo) && this.dragItemSize == displacement.dragItemSize && this.dragAmount == displacement.dragAmount && this.targetIndex == displacement.targetIndex;
    }

    public int hashCode() {
        return (((((this.dragDraggableItemInfo.hashCode() * 31) + Integer.hashCode(this.dragItemSize)) * 31) + Integer.hashCode(this.dragAmount)) * 31) + Integer.hashCode(this.targetIndex);
    }

    public String toString() {
        return "Displacement(dragDraggableItemInfo=" + this.dragDraggableItemInfo + ", dragItemSize=" + this.dragItemSize + ", dragAmount=" + this.dragAmount + ", targetIndex=" + this.targetIndex + ")";
    }

    public Displacement(DraggableItem dragDraggableItemInfo, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dragDraggableItemInfo, "dragDraggableItemInfo");
        this.dragDraggableItemInfo = dragDraggableItemInfo;
        this.dragItemSize = i;
        this.dragAmount = i2;
        this.targetIndex = i3;
    }

    public final DraggableItem getDragDraggableItemInfo() {
        return this.dragDraggableItemInfo;
    }

    public final int getDragItemSize() {
        return this.dragItemSize;
    }

    public final int getDragAmount() {
        return this.dragAmount;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }
}
