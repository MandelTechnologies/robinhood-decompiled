package com.robinhood.utils.compose.reorderable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragStateV2.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\t\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J9\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J9\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J¡\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000628\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\t28\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015RA\u0010\b\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017RA\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableGroup;", "", "groupId", "", "size", "onDragStart", "Lkotlin/Function0;", "", "onDragUpdate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "onDragFinish", "<init>", "(IILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getGroupId", "()I", "getSize", "getOnDragStart", "()Lkotlin/jvm/functions/Function0;", "getOnDragUpdate", "()Lkotlin/jvm/functions/Function2;", "getOnDragFinish", "lastIndex", "getLastIndex", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReorderableGroup {
    public static final int $stable = 0;
    private final int groupId;
    private final int lastIndex;
    private final Function2<Integer, Integer, Unit> onDragFinish;
    private final Function0<Unit> onDragStart;
    private final Function2<Integer, Integer, Unit> onDragUpdate;
    private final int size;

    public static /* synthetic */ ReorderableGroup copy$default(ReorderableGroup reorderableGroup, int i, int i2, Function0 function0, Function2 function2, Function2 function22, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = reorderableGroup.groupId;
        }
        if ((i3 & 2) != 0) {
            i2 = reorderableGroup.size;
        }
        if ((i3 & 4) != 0) {
            function0 = reorderableGroup.onDragStart;
        }
        if ((i3 & 8) != 0) {
            function2 = reorderableGroup.onDragUpdate;
        }
        if ((i3 & 16) != 0) {
            function22 = reorderableGroup.onDragFinish;
        }
        Function2 function23 = function22;
        Function0 function02 = function0;
        return reorderableGroup.copy(i, i2, function02, function2, function23);
    }

    /* renamed from: component1, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final Function0<Unit> component3() {
        return this.onDragStart;
    }

    public final Function2<Integer, Integer, Unit> component4() {
        return this.onDragUpdate;
    }

    public final Function2<Integer, Integer, Unit> component5() {
        return this.onDragFinish;
    }

    public final ReorderableGroup copy(int groupId, int size, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish) {
        Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
        Intrinsics.checkNotNullParameter(onDragUpdate, "onDragUpdate");
        Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
        return new ReorderableGroup(groupId, size, onDragStart, onDragUpdate, onDragFinish);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderableGroup)) {
            return false;
        }
        ReorderableGroup reorderableGroup = (ReorderableGroup) other;
        return this.groupId == reorderableGroup.groupId && this.size == reorderableGroup.size && Intrinsics.areEqual(this.onDragStart, reorderableGroup.onDragStart) && Intrinsics.areEqual(this.onDragUpdate, reorderableGroup.onDragUpdate) && Intrinsics.areEqual(this.onDragFinish, reorderableGroup.onDragFinish);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.groupId) * 31) + Integer.hashCode(this.size)) * 31) + this.onDragStart.hashCode()) * 31) + this.onDragUpdate.hashCode()) * 31) + this.onDragFinish.hashCode();
    }

    public String toString() {
        return "ReorderableGroup(groupId=" + this.groupId + ", size=" + this.size + ", onDragStart=" + this.onDragStart + ", onDragUpdate=" + this.onDragUpdate + ", onDragFinish=" + this.onDragFinish + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableGroup(int i, int i2, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish) {
        Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
        Intrinsics.checkNotNullParameter(onDragUpdate, "onDragUpdate");
        Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
        this.groupId = i;
        this.size = i2;
        this.onDragStart = onDragStart;
        this.onDragUpdate = onDragUpdate;
        this.onDragFinish = onDragFinish;
        this.lastIndex = i2 - 1;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getSize() {
        return this.size;
    }

    public final Function0<Unit> getOnDragStart() {
        return this.onDragStart;
    }

    public final Function2<Integer, Integer, Unit> getOnDragUpdate() {
        return this.onDragUpdate;
    }

    public final Function2<Integer, Integer, Unit> getOnDragFinish() {
        return this.onDragFinish;
    }

    public final int getLastIndex() {
        return this.lastIndex;
    }
}
