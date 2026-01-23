package com.robinhood.utils.compose.reorderable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragStateV2.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0001HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/DraggableItem;", "", "groupId", "", "indexInGroup", "key", "<init>", "(IILjava/lang/Object;)V", "getGroupId", "()I", "getIndexInGroup", "getKey", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DraggableItem {
    public static final int $stable = 8;
    private final int groupId;
    private final int indexInGroup;
    private final Object key;

    public static /* synthetic */ DraggableItem copy$default(DraggableItem draggableItem, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = draggableItem.groupId;
        }
        if ((i3 & 2) != 0) {
            i2 = draggableItem.indexInGroup;
        }
        if ((i3 & 4) != 0) {
            obj = draggableItem.key;
        }
        return draggableItem.copy(i, i2, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndexInGroup() {
        return this.indexInGroup;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    public final DraggableItem copy(int groupId, int indexInGroup, Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new DraggableItem(groupId, indexInGroup, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraggableItem)) {
            return false;
        }
        DraggableItem draggableItem = (DraggableItem) other;
        return this.groupId == draggableItem.groupId && this.indexInGroup == draggableItem.indexInGroup && Intrinsics.areEqual(this.key, draggableItem.key);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.groupId) * 31) + Integer.hashCode(this.indexInGroup)) * 31) + this.key.hashCode();
    }

    public String toString() {
        return "DraggableItem(groupId=" + this.groupId + ", indexInGroup=" + this.indexInGroup + ", key=" + this.key + ")";
    }

    public DraggableItem(int i, int i2, Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.groupId = i;
        this.indexInGroup = i2;
        this.key = key;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getIndexInGroup() {
        return this.indexInGroup;
    }

    public final Object getKey() {
        return this.key;
    }
}
