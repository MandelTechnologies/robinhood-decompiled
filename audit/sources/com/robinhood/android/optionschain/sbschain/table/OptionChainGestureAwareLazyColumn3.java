package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import com.robinhood.android.optionschain.sbschain.table.gestures.OptionChainCustomGestureDetector;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainGestureAwareLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainGestureAwareLazyColumn3 implements PointerInputEventHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Density $density;
    final /* synthetic */ SnapshotState<Float> $draggedItemY$delegate;
    final /* synthetic */ SnapshotState<Integer> $gestureVisibleQuoteIndex$delegate;
    final /* synthetic */ SnapshotFloatState2 $initialScrollOffset$delegate;
    final /* synthetic */ SnapshotIntState2 $latestDraggedOverRowIndex$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<Boolean, Unit> $onDragEnd;
    final /* synthetic */ Function1<DragTarget, Unit> $onDragStart;
    final /* synthetic */ Function1<Integer, Unit> $onDraggedIndexChanged;
    final /* synthetic */ SnapshotState<DragTarget> $potentialDragTarget$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedContractYOffset;
    final /* synthetic */ float $snapThresholdPx;
    final /* synthetic */ SnapshotFloatState2 $tableViewBottomForDrag$delegate;
    final /* synthetic */ float $tableViewTopForDrag;

    /* JADX WARN: Multi-variable type inference failed */
    OptionChainGestureAwareLazyColumn3(LazyListState lazyListState, Density density, Function1<? super DragTarget, Unit> function1, CoroutineScope coroutineScope, SnapshotState<DragTarget> snapshotState, SnapshotState<Integer> snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotIntState2 snapshotIntState2, Animatable<Float, AnimationVectors2> animatable, Function1<? super Boolean, Unit> function12, float f, float f2, Function1<? super Integer, Unit> function13, SnapshotFloatState2 snapshotFloatState22, SnapshotState<Float> snapshotState3) {
        this.$lazyListState = lazyListState;
        this.$density = density;
        this.$onDragStart = function1;
        this.$coroutineScope = coroutineScope;
        this.$potentialDragTarget$delegate = snapshotState;
        this.$gestureVisibleQuoteIndex$delegate = snapshotState2;
        this.$initialScrollOffset$delegate = snapshotFloatState2;
        this.$latestDraggedOverRowIndex$delegate = snapshotIntState2;
        this.$selectedContractYOffset = animatable;
        this.$onDragEnd = function12;
        this.$tableViewTopForDrag = f;
        this.$snapThresholdPx = f2;
        this.$onDraggedIndexChanged = function13;
        this.$tableViewBottomForDrag$delegate = snapshotFloatState22;
        this.$draggedItemY$delegate = snapshotState3;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final LazyListState lazyListState = this.$lazyListState;
        final Density density = this.$density;
        final Function1<DragTarget, Unit> function1 = this.$onDragStart;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final SnapshotState<DragTarget> snapshotState = this.$potentialDragTarget$delegate;
        final SnapshotState<Integer> snapshotState2 = this.$gestureVisibleQuoteIndex$delegate;
        final SnapshotFloatState2 snapshotFloatState2 = this.$initialScrollOffset$delegate;
        final SnapshotIntState2 snapshotIntState2 = this.$latestDraggedOverRowIndex$delegate;
        final Animatable<Float, AnimationVectors2> animatable = this.$selectedContractYOffset;
        Function1 function12 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainGestureAwareLazyColumn3.invoke$lambda$0(lazyListState, density, function1, coroutineScope, snapshotState, snapshotState2, snapshotFloatState2, snapshotIntState2, animatable, (Offset) obj);
            }
        };
        final Function1<Boolean, Unit> function13 = this.$onDragEnd;
        final SnapshotIntState2 snapshotIntState22 = this.$latestDraggedOverRowIndex$delegate;
        final SnapshotState<DragTarget> snapshotState3 = this.$potentialDragTarget$delegate;
        Function1 function14 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainGestureAwareLazyColumn3.invoke$lambda$1(function13, snapshotIntState22, snapshotState3, ((Boolean) obj).booleanValue());
            }
        };
        final LazyListState lazyListState2 = this.$lazyListState;
        final Density density2 = this.$density;
        final float f = this.$tableViewTopForDrag;
        final float f2 = this.$snapThresholdPx;
        final CoroutineScope coroutineScope2 = this.$coroutineScope;
        final Function1<Integer, Unit> function15 = this.$onDraggedIndexChanged;
        final SnapshotState<DragTarget> snapshotState4 = this.$potentialDragTarget$delegate;
        final SnapshotState<Integer> snapshotState5 = this.$gestureVisibleQuoteIndex$delegate;
        final SnapshotFloatState2 snapshotFloatState22 = this.$initialScrollOffset$delegate;
        final SnapshotFloatState2 snapshotFloatState23 = this.$tableViewBottomForDrag$delegate;
        final SnapshotState<Float> snapshotState6 = this.$draggedItemY$delegate;
        final SnapshotIntState2 snapshotIntState23 = this.$latestDraggedOverRowIndex$delegate;
        final Animatable<Float, AnimationVectors2> animatable2 = this.$selectedContractYOffset;
        Function2 function2 = new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionChainGestureAwareLazyColumn3.invoke$lambda$2(lazyListState2, density2, f, f2, coroutineScope2, function15, snapshotState4, snapshotState5, snapshotFloatState22, snapshotFloatState23, snapshotState6, snapshotIntState23, animatable2, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        };
        final SnapshotState<DragTarget> snapshotState7 = this.$potentialDragTarget$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(OptionChainGestureAwareLazyColumn3.invoke$lambda$3(snapshotState7));
            }
        };
        final SnapshotState<DragTarget> snapshotState8 = this.$potentialDragTarget$delegate;
        final SnapshotState<Float> snapshotState9 = this.$draggedItemY$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(OptionChainGestureAwareLazyColumn3.invoke$lambda$4(snapshotState8, snapshotState9));
            }
        };
        final SnapshotState<DragTarget> snapshotState10 = this.$potentialDragTarget$delegate;
        final SnapshotState<Float> snapshotState11 = this.$draggedItemY$delegate;
        Object objOptionChainDragAfterLongPress = OptionChainCustomGestureDetector.optionChainDragAfterLongPress(pointerInputScope, function12, function14, function2, function0, function02, new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.OptionChainGestureAwareLazyColumnKt$OptionChainGestureAwareLazyColumn$2$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainGestureAwareLazyColumn3.invoke$lambda$5(snapshotState10, snapshotState11);
            }
        }, continuation);
        return objOptionChainDragAfterLongPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOptionChainDragAfterLongPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(LazyListState lazyListState, Density density, Function1 function1, CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotIntState2 snapshotIntState2, Animatable animatable, Offset offset) {
        DragTarget dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 = OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState);
        if (dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 == null) {
            return Unit.INSTANCE;
        }
        snapshotFloatState2.setFloatValue(OptionChainGestureAwareLazyColumn.getScrollOffset(lazyListState, OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2), density));
        float itemOffset = OptionChainGestureAwareLazyColumn.getItemOffset(lazyListState, dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1.getDragStartRowIndex(), OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2), density);
        snapshotIntState2.setIntValue(lazyListState.getFirstVisibleItemIndex() + MathKt.roundToInt((lazyListState.getFirstVisibleItemScrollOffset() + itemOffset) / OptionChainGestureAwareLazyColumn.normalRowHeight(density)));
        function1.invoke(dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionChainGestureAwareLazyColumn4(animatable, itemOffset, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function1 function1, SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState, boolean z) {
        snapshotIntState2.setIntValue(-1);
        snapshotState.setValue(null);
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invoke$lambda$2(LazyListState lazyListState, Density density, float f, float f2, CoroutineScope coroutineScope, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState3, SnapshotIntState2 snapshotIntState2, Animatable animatable, float f3, float f4) {
        boolean z;
        DragTarget dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 = OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState);
        if (dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 == null) {
            return Unit.INSTANCE;
        }
        float itemOffset = OptionChainGestureAwareLazyColumn.getItemOffset(lazyListState, dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1.getDragStartRowIndex(), OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2), density) + (OptionChainGestureAwareLazyColumn.getScrollOffset(lazyListState, OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2), density) - snapshotFloatState2.getFloatValue()) + f4;
        float fCoerceIn = RangesKt.coerceIn(itemOffset, f, snapshotFloatState22.getFloatValue());
        snapshotState3.setValue(Float.valueOf(itemOffset));
        boolean z2 = dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 instanceof DragTarget.OptionLegDragTarget;
        int iCalculateCurrentIndex = OptionChainGestureAwareLazyColumn.calculateCurrentIndex(lazyListState.getFirstVisibleItemScrollOffset() + fCoerceIn, lazyListState, density, OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2), snapshotIntState2.getIntValue(), z2, f2);
        float itemOffset2 = OptionChainGestureAwareLazyColumn.getItemOffset(lazyListState, iCalculateCurrentIndex, OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2), density);
        if (z2) {
            Integer numOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14 = OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14(snapshotState2);
            z = (numOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14 == null || iCalculateCurrentIndex != numOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$14.intValue()) && Math.abs(fCoerceIn - itemOffset2) < f2;
        } else {
            if (!(dragTargetOptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1 instanceof DragTarget.OptionSpreadDragTarget)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Math.abs(fCoerceIn - itemOffset2) < f2) {
            }
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionChainGestureAwareLazyColumn5(z, animatable, itemOffset2, fCoerceIn, null), 3, null);
        if (iCalculateCurrentIndex != snapshotIntState2.getIntValue()) {
            snapshotIntState2.setIntValue(iCalculateCurrentIndex);
            function1.invoke(Integer.valueOf(iCalculateCurrentIndex));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$3(SnapshotState snapshotState) {
        return OptionChainGestureAwareLazyColumn.OptionChainGestureAwareLazyColumn_BuJpD7Q$lambda$1(snapshotState) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        snapshotState2.setValue(null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        snapshotState2.setValue(null);
        return Unit.INSTANCE;
    }
}
