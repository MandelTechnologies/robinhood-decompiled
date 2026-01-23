package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.animation.SplineBasedDecay2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.DecayAnimationSpec3;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderGestureConfiguration;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 implements PointerInputEventHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ float $dragToDeleteThreshold;
    final /* synthetic */ float $draggableLengthForDelete;
    final /* synthetic */ SnapshotIntState2 $initialScrollOffset$delegate;
    final /* synthetic */ LadderGestureConfiguration $ladderGestureConfiguration;
    final /* synthetic */ SnapshotState<LadderState.LadderData.SelectedPendingOrders> $ladderSelectedPendingOrders$delegate;
    final /* synthetic */ SnapshotFloatState2 $ladderViewBottomForDrag$delegate;
    final /* synthetic */ float $ladderViewTopForDrag;
    final /* synthetic */ SnapshotIntState2 $latestPendingOrderDraggedOverRowIndex$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<LadderCustomGestureDetector3, Unit> $onPendingOrderDragDirectionChanged;
    final /* synthetic */ Function2<Boolean, Boolean, Unit> $onPendingOrderDragEnded;
    final /* synthetic */ Function1<Integer, Unit> $onPendingOrderDraggedOverRowChanged;
    final /* synthetic */ Function1<LadderState.LadderData.SelectedPendingOrders, Unit> $onPendingOrderSelected;
    final /* synthetic */ SnapshotState<LadderState.LadderData.SelectedPendingOrders> $potentialDragTarget$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderXOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderYOffset;
    final /* synthetic */ SnapshotState<Integer> $selectedRowOffset$delegate;
    final /* synthetic */ SnapshotFloatState2 $workingPillWidth$delegate;
    final /* synthetic */ SnapshotFloatState2 $workingPillYOffsetWithinRow$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1(Function1<? super LadderState.LadderData.SelectedPendingOrders, Unit> function1, LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState, SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState2, SnapshotIntState2 snapshotIntState2, SnapshotState<Integer> snapshotState3, Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, float f, Function2<? super Boolean, ? super Boolean, Unit> function2, SnapshotIntState2 snapshotIntState22, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Function1<? super LadderCustomGestureDetector3, Unit> function12, LadderGestureConfiguration ladderGestureConfiguration, float f2, Function1<? super Integer, Unit> function13, SnapshotFloatState2 snapshotFloatState23, float f3) {
        this.$onPendingOrderSelected = function1;
        this.$lazyListState = lazyListState;
        this.$coroutineScope = coroutineScope;
        this.$potentialDragTarget$delegate = snapshotState;
        this.$ladderSelectedPendingOrders$delegate = snapshotState2;
        this.$initialScrollOffset$delegate = snapshotIntState2;
        this.$selectedRowOffset$delegate = snapshotState3;
        this.$selectedPendingOrderXOffset = animatable;
        this.$selectedPendingOrderYOffset = animatable2;
        this.$dragToDeleteThreshold = f;
        this.$onPendingOrderDragEnded = function2;
        this.$latestPendingOrderDraggedOverRowIndex$delegate = snapshotIntState22;
        this.$workingPillYOffsetWithinRow$delegate = snapshotFloatState2;
        this.$workingPillWidth$delegate = snapshotFloatState22;
        this.$onPendingOrderDragDirectionChanged = function12;
        this.$ladderGestureConfiguration = ladderGestureConfiguration;
        this.$ladderViewTopForDrag = f2;
        this.$onPendingOrderDraggedOverRowChanged = function13;
        this.$ladderViewBottomForDrag$delegate = snapshotFloatState23;
        this.$draggableLengthForDelete = f3;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function1<LadderState.LadderData.SelectedPendingOrders, Unit> function1 = this.$onPendingOrderSelected;
        final LazyListState lazyListState = this.$lazyListState;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState = this.$potentialDragTarget$delegate;
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState2 = this.$ladderSelectedPendingOrders$delegate;
        final SnapshotIntState2 snapshotIntState2 = this.$initialScrollOffset$delegate;
        final SnapshotState<Integer> snapshotState3 = this.$selectedRowOffset$delegate;
        final Animatable<Float, AnimationVectors2> animatable = this.$selectedPendingOrderXOffset;
        final Animatable<Float, AnimationVectors2> animatable2 = this.$selectedPendingOrderYOffset;
        Function1 function12 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$0(function1, lazyListState, coroutineScope, snapshotState, snapshotState2, snapshotIntState2, snapshotState3, animatable, animatable2, (Offset) obj);
            }
        };
        final Animatable<Float, AnimationVectors2> animatable3 = this.$selectedPendingOrderYOffset;
        final LazyListState lazyListState2 = this.$lazyListState;
        final CoroutineScope coroutineScope2 = this.$coroutineScope;
        final Animatable<Float, AnimationVectors2> animatable4 = this.$selectedPendingOrderXOffset;
        final float f = this.$dragToDeleteThreshold;
        final Function2<Boolean, Boolean, Unit> function2 = this.$onPendingOrderDragEnded;
        final SnapshotIntState2 snapshotIntState22 = this.$latestPendingOrderDraggedOverRowIndex$delegate;
        final SnapshotFloatState2 snapshotFloatState2 = this.$workingPillYOffsetWithinRow$delegate;
        final SnapshotFloatState2 snapshotFloatState22 = this.$workingPillWidth$delegate;
        Function2 function22 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$1(animatable3, lazyListState2, coroutineScope2, pointerInputScope, animatable4, f, function2, snapshotIntState22, snapshotFloatState2, snapshotFloatState22, ((Boolean) obj).booleanValue(), (Float) obj2);
            }
        };
        final Function1<LadderCustomGestureDetector3, Unit> function13 = this.$onPendingOrderDragDirectionChanged;
        final LazyListState lazyListState3 = this.$lazyListState;
        final LadderGestureConfiguration ladderGestureConfiguration = this.$ladderGestureConfiguration;
        final float f2 = this.$ladderViewTopForDrag;
        final CoroutineScope coroutineScope3 = this.$coroutineScope;
        final Function1<Integer, Unit> function14 = this.$onPendingOrderDraggedOverRowChanged;
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState4 = this.$potentialDragTarget$delegate;
        final SnapshotFloatState2 snapshotFloatState23 = this.$workingPillYOffsetWithinRow$delegate;
        final SnapshotIntState2 snapshotIntState23 = this.$initialScrollOffset$delegate;
        final SnapshotFloatState2 snapshotFloatState24 = this.$ladderViewBottomForDrag$delegate;
        final SnapshotState<Integer> snapshotState5 = this.$selectedRowOffset$delegate;
        final Animatable<Float, AnimationVectors2> animatable5 = this.$selectedPendingOrderXOffset;
        final Animatable<Float, AnimationVectors2> animatable6 = this.$selectedPendingOrderYOffset;
        final SnapshotIntState2 snapshotIntState24 = this.$latestPendingOrderDraggedOverRowIndex$delegate;
        final float f3 = this.$draggableLengthForDelete;
        Function3 function3 = new Function3() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$3(function13, lazyListState3, ladderGestureConfiguration, f2, coroutineScope3, function14, snapshotState4, snapshotFloatState23, snapshotIntState23, snapshotFloatState24, snapshotState5, animatable5, animatable6, snapshotIntState24, f3, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), (LadderCustomGestureDetector3) obj3);
            }
        };
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState6 = this.$potentialDragTarget$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$4(snapshotState6));
            }
        };
        final Function2<Boolean, Boolean, Unit> function23 = this.$onPendingOrderDragEnded;
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState7 = this.$potentialDragTarget$delegate;
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState8 = this.$ladderSelectedPendingOrders$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$5(function23, snapshotState7, snapshotState8));
            }
        };
        final SnapshotState<LadderState.LadderData.SelectedPendingOrders> snapshotState9 = this.$potentialDragTarget$delegate;
        Object objLadderCustomDragAfterLongPress = LadderCustomGestureDetector4.ladderCustomDragAfterLongPress(pointerInputScope, function12, function22, function3, function0, function02, new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$6(snapshotState9);
            }
        }, continuation);
        return objLadderCustomDragAfterLongPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLadderCustomDragAfterLongPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState3, Animatable animatable, Animatable animatable2, Offset offset) {
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 = LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$4(snapshotState);
        if (selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$1(snapshotState2) == null) {
            function1.invoke(selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4);
        }
        snapshotIntState2.setIntValue(LadderGestureAwareLazyColumnKt.getScrollOffset(lazyListState));
        int itemOffset = LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getRowIndex());
        snapshotState3.setValue(Integer.valueOf(itemOffset));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C40958x97e0d4cf(animatable, animatable2, itemOffset, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Animatable animatable, LazyListState lazyListState, CoroutineScope coroutineScope, PointerInputScope pointerInputScope, Animatable animatable2, float f, Function2 function2, SnapshotIntState2 snapshotIntState2, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, boolean z, Float f2) {
        snapshotIntState2.setIntValue(-1);
        if (z) {
            if (f2 == null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C40959x97e0d890(animatable, LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, lazyListState.getFirstVisibleItemIndex() + MathKt.roundToInt((((Number) animatable.getValue()).floatValue() + lazyListState.getFirstVisibleItemScrollOffset()) / LadderGestureAwareLazyColumnKt.rowHeight(lazyListState))) + snapshotFloatState2.getFloatValue(), null), 3, null);
            } else if (Math.abs(DecayAnimationSpec3.calculateTargetValue(SplineBasedDecay2.splineBasedDecay(pointerInputScope), ((Number) animatable2.getValue()).floatValue(), f2.floatValue())) >= f) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C40960x97e0d891(animatable2, f2, function2, snapshotFloatState22, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        function2.invoke(Boolean.valueOf(z), Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(Function1 function1, LazyListState lazyListState, LadderGestureConfiguration ladderGestureConfiguration, float f, CoroutineScope coroutineScope, Function1 function12, SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotIntState2 snapshotIntState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState2, Animatable animatable, Animatable animatable2, SnapshotIntState2 snapshotIntState22, float f2, float f3, float f4, LadderCustomGestureDetector3 dragDirection) {
        Intrinsics.checkNotNullParameter(dragDirection, "dragDirection");
        LadderState.LadderData.SelectedPendingOrders selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 = LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$4(snapshotState);
        if (selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        int rowIndex = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getRowIndex();
        function1.invoke(dragDirection);
        float itemOffset = LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, rowIndex) + snapshotFloatState2.getFloatValue();
        boolean z = false;
        boolean z2 = dragDirection == LadderCustomGestureDetector3.VERTICAL;
        boolean z3 = dragDirection == LadderCustomGestureDetector3.HORIZONTAL;
        boolean z4 = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getOrders().size() == 1 && ((LadderState.LadderData.UiPendingOrder) CollectionsKt.first((List) selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getOrders())).isEditable();
        if (ladderGestureConfiguration.getCanEditMultipleOrders()) {
            List<LadderState.LadderData.UiPendingOrder> orders = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getOrders();
            if ((orders instanceof Collection) && orders.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = orders.iterator();
                while (it.hasNext()) {
                    if (!((LadderState.LadderData.UiPendingOrder) it.next()).isEditable()) {
                        break;
                    }
                }
                z = true;
            }
        }
        if (z2 && (z4 || z)) {
            float scrollOffset = (LadderGestureAwareLazyColumnKt.getScrollOffset(lazyListState) - snapshotIntState2.getIntValue()) + itemOffset + f4;
            float fCoerceIn = RangesKt.coerceIn(scrollOffset, f, snapshotFloatState22.getFloatValue());
            snapshotState2.setValue(Integer.valueOf((int) itemOffset));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C40961x97e0dc51(scrollOffset - fCoerceIn, lazyListState, animatable, animatable2, fCoerceIn, null), 3, null);
            int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + MathKt.roundToInt((fCoerceIn + lazyListState.getFirstVisibleItemScrollOffset()) / LadderGestureAwareLazyColumnKt.rowHeight(lazyListState));
            if (firstVisibleItemIndex != snapshotIntState22.getIntValue()) {
                snapshotIntState22.setIntValue(firstVisibleItemIndex);
                function12.invoke(Integer.valueOf(firstVisibleItemIndex));
            }
        } else if (z3) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C40962x97e0dc52(animatable, f3, f2, animatable2, itemOffset, null), 3, null);
            snapshotState2.setValue(Integer.valueOf((int) itemOffset));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(SnapshotState snapshotState) {
        return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$4(snapshotState) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$5(Function2 function2, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$1(snapshotState2) == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        function2.invoke(bool, bool);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
