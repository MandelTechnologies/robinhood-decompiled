package com.robinhood.utils.compose.reorderable;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: DragStateV2.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0094\u0001\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u001826\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00140\u001a26\u0010\u001f\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00140\u001aJ\u001e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0001J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010I\u001a\u00020J¢\u0006\u0004\bK\u0010LJ\u0015\u0010M\u001a\u00020\u00142\u0006\u0010N\u001a\u00020J¢\u0006\u0004\bO\u0010LJ\u0006\u0010P\u001a\u00020\u0014J\u001d\u0010Q\u001a\u00020R2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020\u000e¢\u0006\u0004\bT\u0010UJ\u0013\u0010]\u001a\u00020R*\u00020\u000eH\u0002¢\u0006\u0004\b^\u0010_J\u001a\u0010`\u001a\u00020Z*\b\u0012\u0004\u0012\u00020Z0a2\u0006\u0010I\u001a\u00020%H\u0002J>\u0010b\u001a\u0004\u0018\u00010Z*\b\u0012\u0004\u0012\u00020Z0a2\u0006\u0010c\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u00112\u0006\u0010d\u001a\u00020Z2\u0006\u0010e\u001a\u00020%2\b\u0010f\u001a\u0004\u0018\u00010<H\u0002J\u0006\u0010g\u001a\u00020HJ\u0006\u0010h\u001a\u00020\u0014J\u0006\u0010i\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R/\u0010-\u001a\u0004\u0018\u00010\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u0010/R/\u00106\u001a\u0004\u0018\u00010\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R5\u0010=\u001a\u0004\u0018\u00010<2\b\u0010$\u001a\u0004\u0018\u00010<8@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\bD\u00103\u0012\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010V\u001a\u00020%*\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0018\u0010Y\u001a\u00020\u000e*\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006j"}, m3636d2 = {"Lcom/robinhood/utils/compose/reorderable/DragStateV2;", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlinx/coroutines/CoroutineScope;)V", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "reorderableGroups", "", "", "Lcom/robinhood/utils/compose/reorderable/ReorderableGroup;", "dragItems", "Lcom/robinhood/utils/compose/reorderable/DraggableItem;", "groupItemsCount", "registerGroup", "", "groupId", "size", "onDragStart", "Lkotlin/Function0;", "onDragUpdate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startIndex", "targetIndex", "onDragFinish", "registerItem", "key", "indexInGroup", "removeItem", "<set-?>", "", "totalDragAmount", "getTotalDragAmount", "()F", "setTotalDragAmount", "(F)V", "totalDragAmount$delegate", "Landroidx/compose/runtime/MutableFloatState;", "_dragItem", "get_dragItem", "()Lcom/robinhood/utils/compose/reorderable/DraggableItem;", "set_dragItem", "(Lcom/robinhood/utils/compose/reorderable/DraggableItem;)V", "_dragItem$delegate", "Landroidx/compose/runtime/MutableState;", "dragItem", "getDragItem$lib_utils_compose_externalDebug", "dragGroup", "getDragGroup", "()Lcom/robinhood/utils/compose/reorderable/ReorderableGroup;", "setDragGroup", "(Lcom/robinhood/utils/compose/reorderable/ReorderableGroup;)V", "dragGroup$delegate", "Lcom/robinhood/utils/compose/reorderable/Displacement;", "displacement", "getDisplacement$lib_utils_compose_externalDebug$annotations", "()V", "getDisplacement$lib_utils_compose_externalDebug", "()Lcom/robinhood/utils/compose/reorderable/Displacement;", "setDisplacement$lib_utils_compose_externalDebug", "(Lcom/robinhood/utils/compose/reorderable/Displacement;)V", "displacement$delegate", "dragStartScrollJob", "Lkotlinx/coroutines/Job;", "nestedItemDragging", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "onDragStart-k-4lQ0M", "(J)V", "onDrag", "dragAmount", "onDrag-k-4lQ0M", "onDragEnd", "calculateTargetOffset", "Landroidx/compose/ui/unit/IntOffset;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "calculateTargetOffset-iSbpLlY", "(II)J", "mainAxisValue", "getMainAxisValue-k-4lQ0M", "(J)F", "endOffset", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "getEndOffset", "(Landroidx/compose/foundation/lazy/LazyListItemInfo;)I", "toOffset", "toOffset-Bjo55l4", "(I)J", "itemAtOffset", "", "calculateDisplacementTarget", "dragItemVisibleIndex", "dragLayoutItem", "coercedDragAmount", "previousDisplacement", "isNestedItemDragging", "onNestedItemDraggingStart", "onNestedItemDraggingFinish", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DragStateV2 {
    public static final int $stable = 8;

    /* renamed from: _dragItem$delegate, reason: from kotlin metadata */
    private final SnapshotState _dragItem;
    private final CoroutineScope coroutineScope;

    /* renamed from: displacement$delegate, reason: from kotlin metadata */
    private final SnapshotState displacement;

    /* renamed from: dragGroup$delegate, reason: from kotlin metadata */
    private final SnapshotState dragGroup;
    private final Map<Object, DraggableItem> dragItems;
    private Job dragStartScrollJob;
    private final Map<Integer, Integer> groupItemsCount;
    private final LazyListState lazyListState;
    private boolean nestedItemDragging;
    private final Orientation orientation;
    private final Map<Integer, ReorderableGroup> reorderableGroups;

    /* renamed from: totalDragAmount$delegate, reason: from kotlin metadata */
    private final SnapshotFloatState2 totalDragAmount;

    /* compiled from: DragStateV2.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getDisplacement$lib_utils_compose_externalDebug$annotations() {
    }

    public DragStateV2(LazyListState lazyListState, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.lazyListState = lazyListState;
        this.coroutineScope = coroutineScope;
        this.orientation = lazyListState.getLayoutInfo().getOrientation();
        this.reorderableGroups = new LinkedHashMap();
        this.dragItems = new LinkedHashMap();
        this.groupItemsCount = new LinkedHashMap();
        this.totalDragAmount = SnapshotFloatState3.mutableFloatStateOf(0.0f);
        this._dragItem = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.dragGroup = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.displacement = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final void registerGroup(int groupId, int size, Function0<Unit> onDragStart, Function2<? super Integer, ? super Integer, Unit> onDragUpdate, Function2<? super Integer, ? super Integer, Unit> onDragFinish) {
        ReorderableGroup reorderableGroup;
        Intrinsics.checkNotNullParameter(onDragStart, "onDragStart");
        Intrinsics.checkNotNullParameter(onDragUpdate, "onDragUpdate");
        Intrinsics.checkNotNullParameter(onDragFinish, "onDragFinish");
        if (this.reorderableGroups.containsKey(Integer.valueOf(groupId)) && (reorderableGroup = this.reorderableGroups.get(Integer.valueOf(groupId))) != null && reorderableGroup.getSize() == size) {
            return;
        }
        this.reorderableGroups.put(Integer.valueOf(groupId), new ReorderableGroup(groupId, size, onDragStart, onDragUpdate, onDragFinish));
    }

    public final void registerItem(Object key, int groupId, int indexInGroup) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.dragItems.put(key, new DraggableItem(groupId, indexInGroup, key));
        Map<Integer, Integer> map = this.groupItemsCount;
        Integer numValueOf = Integer.valueOf(groupId);
        Integer num = this.groupItemsCount.get(Integer.valueOf(groupId));
        map.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final void removeItem(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DraggableItem draggableItemRemove = this.dragItems.remove(key);
        if (draggableItemRemove != null) {
            Integer num = this.groupItemsCount.get(Integer.valueOf(draggableItemRemove.getGroupId()));
            int iIntValue = (num != null ? num.intValue() : 0) - 1;
            if (iIntValue == 0) {
                this.groupItemsCount.remove(Integer.valueOf(draggableItemRemove.getGroupId()));
                this.reorderableGroups.remove(Integer.valueOf(draggableItemRemove.getGroupId()));
            } else {
                this.groupItemsCount.put(Integer.valueOf(draggableItemRemove.getGroupId()), Integer.valueOf(iIntValue));
            }
        }
    }

    private final float getTotalDragAmount() {
        return this.totalDragAmount.getFloatValue();
    }

    private final void setTotalDragAmount(float f) {
        this.totalDragAmount.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final DraggableItem get_dragItem() {
        return (DraggableItem) this._dragItem.getValue();
    }

    private final void set_dragItem(DraggableItem draggableItem) {
        this._dragItem.setValue(draggableItem);
    }

    public final DraggableItem getDragItem$lib_utils_compose_externalDebug() {
        return get_dragItem();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ReorderableGroup getDragGroup() {
        return (ReorderableGroup) this.dragGroup.getValue();
    }

    private final void setDragGroup(ReorderableGroup reorderableGroup) {
        this.dragGroup.setValue(reorderableGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Displacement getDisplacement$lib_utils_compose_externalDebug() {
        return (Displacement) this.displacement.getValue();
    }

    public final void setDisplacement$lib_utils_compose_externalDebug(Displacement displacement) {
        this.displacement.setValue(displacement);
    }

    /* renamed from: onDragStart-k-4lQ0M, reason: not valid java name */
    public final void m26616onDragStartk4lQ0M(long offset) {
        ReorderableGroup reorderableGroup;
        LazyListItemInfo lazyListItemInfoItemAtOffset = itemAtOffset(this.lazyListState.getLayoutInfo().getVisibleItemsInfo(), m26612getMainAxisValuek4lQ0M(offset));
        DraggableItem draggableItem = this.dragItems.get(lazyListItemInfoItemAtOffset.getKey());
        if (draggableItem == null || (reorderableGroup = this.reorderableGroups.get(Integer.valueOf(draggableItem.getGroupId()))) == null) {
            return;
        }
        set_dragItem(draggableItem);
        setDragGroup(reorderableGroup);
        reorderableGroup.getOnDragStart().invoke();
        this.dragStartScrollJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new DragStateV23(this, lazyListItemInfoItemAtOffset, null), 3, null);
    }

    /* renamed from: onDrag-k-4lQ0M, reason: not valid java name */
    public final void m26615onDragk4lQ0M(long dragAmount) {
        ReorderableGroup dragGroup;
        setTotalDragAmount(getTotalDragAmount() + m26612getMainAxisValuek4lQ0M(dragAmount));
        DraggableItem draggableItem = get_dragItem();
        if (draggableItem == null || (dragGroup = getDragGroup()) == null) {
            return;
        }
        List<LazyListItemInfo> visibleItemsInfo = this.lazyListState.getLayoutInfo().getVisibleItemsInfo();
        for (IndexedValue indexedValue : CollectionsKt.withIndex(this.lazyListState.getLayoutInfo().getVisibleItemsInfo())) {
            if (Intrinsics.areEqual(((LazyListItemInfo) indexedValue.component2()).getKey(), draggableItem.getKey())) {
                int index = indexedValue.getIndex();
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) indexedValue.component2();
                int iCoerceAtLeast = RangesKt.coerceAtLeast(index - draggableItem.getIndexInGroup(), 0);
                int iCoerceAtMost = RangesKt.coerceAtMost((dragGroup.getLastIndex() - draggableItem.getIndexInGroup()) + index, CollectionsKt.getLastIndex(visibleItemsInfo));
                float fCoerceIn = RangesKt.coerceIn(getTotalDragAmount(), visibleItemsInfo.get(iCoerceAtLeast).getOffset() - lazyListItemInfo.getOffset(), getEndOffset(visibleItemsInfo.get(iCoerceAtMost)) - getEndOffset(lazyListItemInfo));
                LazyListItemInfo lazyListItemInfoCalculateDisplacementTarget = calculateDisplacementTarget(visibleItemsInfo, index, draggableItem, lazyListItemInfo, fCoerceIn, getDisplacement$lib_utils_compose_externalDebug());
                if (lazyListItemInfoCalculateDisplacementTarget == null) {
                    lazyListItemInfoCalculateDisplacementTarget = lazyListItemInfo;
                }
                int indexInGroup = draggableItem.getIndexInGroup() + (lazyListItemInfoCalculateDisplacementTarget.getIndex() - lazyListItemInfo.getIndex());
                Displacement displacement$lib_utils_compose_externalDebug = getDisplacement$lib_utils_compose_externalDebug();
                if (displacement$lib_utils_compose_externalDebug == null || displacement$lib_utils_compose_externalDebug.getTargetIndex() != indexInGroup) {
                    dragGroup.getOnDragUpdate().invoke(Integer.valueOf(draggableItem.getIndexInGroup()), Integer.valueOf(indexInGroup));
                }
                setDisplacement$lib_utils_compose_externalDebug(new Displacement(draggableItem, lazyListItemInfo.getSize(), MathKt.roundToInt(fCoerceIn), indexInGroup));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void onDragEnd() {
        ReorderableGroup dragGroup;
        Function2<Integer, Integer, Unit> onDragFinish;
        Job job = this.dragStartScrollJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Displacement displacement$lib_utils_compose_externalDebug = getDisplacement$lib_utils_compose_externalDebug();
        if (displacement$lib_utils_compose_externalDebug != null && (dragGroup = getDragGroup()) != null && (onDragFinish = dragGroup.getOnDragFinish()) != null) {
            onDragFinish.invoke(Integer.valueOf(displacement$lib_utils_compose_externalDebug.getDragDraggableItemInfo().getIndexInGroup()), Integer.valueOf(displacement$lib_utils_compose_externalDebug.getTargetIndex()));
        }
        setTotalDragAmount(0.0f);
        set_dragItem(null);
        setDragGroup(null);
        setDisplacement$lib_utils_compose_externalDebug(null);
    }

    /* renamed from: calculateTargetOffset-iSbpLlY, reason: not valid java name */
    public final long m26614calculateTargetOffsetiSbpLlY(int groupId, int index) {
        Displacement displacement$lib_utils_compose_externalDebug = getDisplacement$lib_utils_compose_externalDebug();
        if (displacement$lib_utils_compose_externalDebug == null) {
            return IntOffset.INSTANCE.m8047getZeronOccac();
        }
        DraggableItem dragDraggableItemInfo = displacement$lib_utils_compose_externalDebug.getDragDraggableItemInfo();
        int dragItemSize = 0;
        if (groupId == dragDraggableItemInfo.getGroupId()) {
            if (index == dragDraggableItemInfo.getIndexInGroup()) {
                dragItemSize = displacement$lib_utils_compose_externalDebug.getDragAmount();
            } else if (displacement$lib_utils_compose_externalDebug.getDragAmount() > 0 && index > dragDraggableItemInfo.getIndexInGroup() && index <= displacement$lib_utils_compose_externalDebug.getTargetIndex()) {
                dragItemSize = -displacement$lib_utils_compose_externalDebug.getDragItemSize();
            } else if (displacement$lib_utils_compose_externalDebug.getDragAmount() < 0 && index < dragDraggableItemInfo.getIndexInGroup() && index >= displacement$lib_utils_compose_externalDebug.getTargetIndex()) {
                dragItemSize = displacement$lib_utils_compose_externalDebug.getDragItemSize();
            }
        }
        return m26613toOffsetBjo55l4(dragItemSize);
    }

    /* renamed from: getMainAxisValue-k-4lQ0M, reason: not valid java name */
    private final float m26612getMainAxisValuek4lQ0M(long j) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i == 1) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (i == 2) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getEndOffset(LazyListItemInfo lazyListItemInfo) {
        return lazyListItemInfo.getOffset() + lazyListItemInfo.getSize();
    }

    /* renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m26613toOffsetBjo55l4(int i) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()];
        if (i2 == 1) {
            return IntOffset.m8033constructorimpl((0 << 32) | (4294967295L & i));
        }
        if (i2 == 2) {
            return IntOffset.m8033constructorimpl((i << 32) | (4294967295L & 0));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final LazyListItemInfo itemAtOffset(List<? extends LazyListItemInfo> list, final float f) {
        return list.get(CollectionsKt.binarySearch$default(list, 0, 0, new Function1() { // from class: com.robinhood.utils.compose.reorderable.DragStateV2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(DragStateV2.itemAtOffset$lambda$3(f, this, (LazyListItemInfo) obj));
            }
        }, 3, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int itemAtOffset$lambda$3(float f, DragStateV2 dragStateV2, LazyListItemInfo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (f > dragStateV2.getEndOffset(item)) {
            return -1;
        }
        return f < ((float) item.getOffset()) ? 1 : 0;
    }

    private final LazyListItemInfo calculateDisplacementTarget(List<? extends LazyListItemInfo> list, int i, DraggableItem draggableItem, LazyListItemInfo lazyListItemInfo, float f, Displacement displacement) {
        final int iRoundToInt = MathKt.roundToInt(lazyListItemInfo.getOffset() + f + (lazyListItemInfo.getSize() / 2.0f));
        Function1 function1 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.DragStateV2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DragStateV2.calculateDisplacementTarget$lambda$4(iRoundToInt, this, (LazyListItemInfo) obj));
            }
        };
        Object obj = null;
        if (f > 0.0f) {
            if (displacement != null) {
                int targetIndex = (displacement.getTargetIndex() + i) - draggableItem.getIndexInGroup();
                if (f <= displacement.getDragAmount()) {
                    List<? extends LazyListItemInfo> listSubList = list.subList(i, targetIndex + 1);
                    ListIterator<? extends LazyListItemInfo> listIterator = listSubList.listIterator(listSubList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        LazyListItemInfo lazyListItemInfoPrevious = listIterator.previous();
                        if (((Boolean) function1.invoke(lazyListItemInfoPrevious)).booleanValue()) {
                            obj = lazyListItemInfoPrevious;
                            break;
                        }
                    }
                    return (LazyListItemInfo) obj;
                }
                Iterator<T> it = list.subList(targetIndex, list.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Boolean) function1.invoke(next)).booleanValue()) {
                        obj = next;
                        break;
                    }
                }
                return (LazyListItemInfo) obj;
            }
            Iterator<T> it2 = list.subList(i, list.size()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((Boolean) function1.invoke(next2)).booleanValue()) {
                    obj = next2;
                    break;
                }
            }
            return (LazyListItemInfo) obj;
        }
        if (f >= 0.0f) {
            return null;
        }
        if (displacement != null) {
            int targetIndex2 = (displacement.getTargetIndex() + i) - draggableItem.getIndexInGroup();
            if (f < displacement.getDragAmount()) {
                List<? extends LazyListItemInfo> listSubList2 = list.subList(0, targetIndex2 + 1);
                ListIterator<? extends LazyListItemInfo> listIterator2 = listSubList2.listIterator(listSubList2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        break;
                    }
                    LazyListItemInfo lazyListItemInfoPrevious2 = listIterator2.previous();
                    if (((Boolean) function1.invoke(lazyListItemInfoPrevious2)).booleanValue()) {
                        obj = lazyListItemInfoPrevious2;
                        break;
                    }
                }
                return (LazyListItemInfo) obj;
            }
            Iterator<T> it3 = list.subList(targetIndex2, i + 1).iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((Boolean) function1.invoke(next3)).booleanValue()) {
                    obj = next3;
                    break;
                }
            }
            return (LazyListItemInfo) obj;
        }
        List<? extends LazyListItemInfo> listSubList3 = list.subList(0, i + 1);
        ListIterator<? extends LazyListItemInfo> listIterator3 = listSubList3.listIterator(listSubList3.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                break;
            }
            LazyListItemInfo lazyListItemInfoPrevious3 = listIterator3.previous();
            if (((Boolean) function1.invoke(lazyListItemInfoPrevious3)).booleanValue()) {
                obj = lazyListItemInfoPrevious3;
                break;
            }
        }
        return (LazyListItemInfo) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean calculateDisplacementTarget$lambda$4(int i, DragStateV2 dragStateV2, LazyListItemInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return i <= dragStateV2.getEndOffset(it) && it.getOffset() <= i;
    }

    /* renamed from: isNestedItemDragging, reason: from getter */
    public final boolean getNestedItemDragging() {
        return this.nestedItemDragging;
    }

    public final void onNestedItemDraggingStart() {
        this.nestedItemDragging = true;
    }

    public final void onNestedItemDraggingFinish() {
        this.nestedItemDragging = false;
    }
}
