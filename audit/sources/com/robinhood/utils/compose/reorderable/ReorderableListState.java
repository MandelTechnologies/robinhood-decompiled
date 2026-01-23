package com.robinhood.utils.compose.reorderable;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderableListState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00126\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\t\u00126\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J9\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J9\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J£\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u000628\b\u0002\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\t28\b\u0002\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015RA\u0010\b\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017RA\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/ReorderableListState;", "T", "", "items", "", "onDragStart", "Lkotlin/Function0;", "", "onDragUpdate", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "onDragFinish", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getItems", "()Ljava/util/List;", "getOnDragStart", "()Lkotlin/jvm/functions/Function0;", "getOnDragUpdate", "()Lkotlin/jvm/functions/Function2;", "getOnDragFinish", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReorderableListState<T> {
    public static final int $stable = 0;
    private final List<T> items;
    private final Function2<Integer, Integer, Unit> onDragFinish;
    private final Function0<Unit> onDragStart;
    private final Function2<Integer, Integer, Unit> onDragUpdate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReorderableListState copy$default(ReorderableListState reorderableListState, List list, Function0 function0, Function2 function2, Function2 function22, int i, Object obj) {
        if ((i & 1) != 0) {
            list = reorderableListState.items;
        }
        if ((i & 2) != 0) {
            function0 = reorderableListState.onDragStart;
        }
        if ((i & 4) != 0) {
            function2 = reorderableListState.onDragUpdate;
        }
        if ((i & 8) != 0) {
            function22 = reorderableListState.onDragFinish;
        }
        return reorderableListState.copy(list, function0, function2, function22);
    }

    public final List<T> component1() {
        return this.items;
    }

    public final Function0<Unit> component2() {
        return this.onDragStart;
    }

    public final Function2<Integer, Integer, Unit> component3() {
        return this.onDragUpdate;
    }

    public final Function2<Integer, Integer, Unit> component4() {
        return this.onDragFinish;
    }

    public final ReorderableListState<T> copy(List<? extends T> items, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
        Intrinsics.checkNotNullParameter(onDragUpdate, "onDragUpdate");
        Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
        return new ReorderableListState<>(items, onDragStart, onDragUpdate, onDragFinish);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderableListState)) {
            return false;
        }
        ReorderableListState reorderableListState = (ReorderableListState) other;
        return Intrinsics.areEqual(this.items, reorderableListState.items) && Intrinsics.areEqual(this.onDragStart, reorderableListState.onDragStart) && Intrinsics.areEqual(this.onDragUpdate, reorderableListState.onDragUpdate) && Intrinsics.areEqual(this.onDragFinish, reorderableListState.onDragFinish);
    }

    public int hashCode() {
        return (((((this.items.hashCode() * 31) + this.onDragStart.hashCode()) * 31) + this.onDragUpdate.hashCode()) * 31) + this.onDragFinish.hashCode();
    }

    public String toString() {
        return "ReorderableListState(items=" + this.items + ", onDragStart=" + this.onDragStart + ", onDragUpdate=" + this.onDragUpdate + ", onDragFinish=" + this.onDragFinish + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListState(List<? extends T> items, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
        Intrinsics.checkNotNullParameter(onDragUpdate, "onDragUpdate");
        Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
        this.items = items;
        this.onDragStart = onDragStart;
        this.onDragUpdate = onDragUpdate;
        this.onDragFinish = onDragFinish;
    }

    public final List<T> getItems() {
        return this.items;
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
}
