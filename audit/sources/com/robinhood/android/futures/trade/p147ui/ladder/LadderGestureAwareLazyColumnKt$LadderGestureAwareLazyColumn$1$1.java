package com.robinhood.android.futures.trade.p147ui.ladder;

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
import com.robinhood.android.futures.trade.p147ui.ladder.FuturesLadderViewState;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderCustomGestureDetector2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
final class LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1 implements PointerInputEventHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ float $dragToDeleteThreshold;
    final /* synthetic */ float $draggableLengthForDelete;
    final /* synthetic */ SnapshotIntState2 $initialScrollOffset$delegate;
    final /* synthetic */ SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> $ladderSelectedPendingOrders$delegate;
    final /* synthetic */ SnapshotFloatState2 $ladderViewBottomForDrag$delegate;
    final /* synthetic */ float $ladderViewTopForDrag;
    final /* synthetic */ SnapshotIntState2 $latestPendingOrderDraggedOverRowIndex$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<LadderCustomGestureDetector, Unit> $onPendingOrderDragDirectionChanged;
    final /* synthetic */ Function2<Boolean, Boolean, Unit> $onPendingOrderDragEnded;
    final /* synthetic */ Function1<Integer, Unit> $onPendingOrderDraggedOverRowChanged;
    final /* synthetic */ Function1<FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> $onPendingOrderSelected;
    final /* synthetic */ SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> $potentialDragTarget$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderXOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderYOffset;
    final /* synthetic */ SnapshotState<Integer> $selectedRowOffset$delegate;
    final /* synthetic */ SnapshotFloatState2 $workingPillWidth$delegate;
    final /* synthetic */ SnapshotFloatState2 $workingPillYOffsetWithinRow$delegate;

    /* compiled from: LadderGestureAwareLazyColumn.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LadderCustomGestureDetector.values().length];
            try {
                iArr[LadderCustomGestureDetector.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LadderCustomGestureDetector.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1(Function1<? super FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> function1, LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState, SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState2, SnapshotIntState2 snapshotIntState2, SnapshotState<Integer> snapshotState3, Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, float f, Function2<? super Boolean, ? super Boolean, Unit> function2, SnapshotIntState2 snapshotIntState22, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Function1<? super LadderCustomGestureDetector, Unit> function12, float f2, Function1<? super Integer, Unit> function13, SnapshotFloatState2 snapshotFloatState23, float f3) {
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
        this.$ladderViewTopForDrag = f2;
        this.$onPendingOrderDraggedOverRowChanged = function13;
        this.$ladderViewBottomForDrag$delegate = snapshotFloatState23;
        this.$draggableLengthForDelete = f3;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function1<FuturesLadderViewState.LadderData.SelectedPendingOrders, Unit> function1 = this.$onPendingOrderSelected;
        final LazyListState lazyListState = this.$lazyListState;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState = this.$potentialDragTarget$delegate;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState2 = this.$ladderSelectedPendingOrders$delegate;
        final SnapshotIntState2 snapshotIntState2 = this.$initialScrollOffset$delegate;
        final SnapshotState<Integer> snapshotState3 = this.$selectedRowOffset$delegate;
        final Animatable<Float, AnimationVectors2> animatable = this.$selectedPendingOrderXOffset;
        final Animatable<Float, AnimationVectors2> animatable2 = this.$selectedPendingOrderYOffset;
        Function1 function12 = new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda0
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
        Function2 function22 = new Function2() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$1(animatable3, lazyListState2, coroutineScope2, pointerInputScope, animatable4, f, function2, snapshotIntState22, snapshotFloatState2, snapshotFloatState22, ((Boolean) obj).booleanValue(), (Float) obj2);
            }
        };
        final Function1<LadderCustomGestureDetector, Unit> function13 = this.$onPendingOrderDragDirectionChanged;
        final LazyListState lazyListState3 = this.$lazyListState;
        final float f2 = this.$ladderViewTopForDrag;
        final CoroutineScope coroutineScope3 = this.$coroutineScope;
        final Function1<Integer, Unit> function14 = this.$onPendingOrderDraggedOverRowChanged;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState4 = this.$potentialDragTarget$delegate;
        final SnapshotFloatState2 snapshotFloatState23 = this.$workingPillYOffsetWithinRow$delegate;
        final SnapshotIntState2 snapshotIntState23 = this.$initialScrollOffset$delegate;
        final SnapshotFloatState2 snapshotFloatState24 = this.$ladderViewBottomForDrag$delegate;
        final SnapshotState<Integer> snapshotState5 = this.$selectedRowOffset$delegate;
        final Animatable<Float, AnimationVectors2> animatable5 = this.$selectedPendingOrderXOffset;
        final Animatable<Float, AnimationVectors2> animatable6 = this.$selectedPendingOrderYOffset;
        final SnapshotIntState2 snapshotIntState24 = this.$latestPendingOrderDraggedOverRowIndex$delegate;
        final float f3 = this.$draggableLengthForDelete;
        Function3 function3 = new Function3() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$2(function13, lazyListState3, f2, coroutineScope3, function14, snapshotState4, snapshotFloatState23, snapshotIntState23, snapshotFloatState24, snapshotState5, animatable5, animatable6, snapshotIntState24, f3, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), (LadderCustomGestureDetector) obj3);
            }
        };
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState6 = this.$potentialDragTarget$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$3(snapshotState6));
            }
        };
        final Function2<Boolean, Boolean, Unit> function23 = this.$onPendingOrderDragEnded;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState7 = this.$potentialDragTarget$delegate;
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState8 = this.$ladderSelectedPendingOrders$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$4(function23, snapshotState7, snapshotState8));
            }
        };
        final SnapshotState<FuturesLadderViewState.LadderData.SelectedPendingOrders> snapshotState9 = this.$potentialDragTarget$delegate;
        Object objLadderCustomDragAfterLongPress = LadderCustomGestureDetector2.ladderCustomDragAfterLongPress(pointerInputScope, function12, function22, function3, function0, function02, new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1.invoke$lambda$5(snapshotState9);
            }
        }, continuation);
        return objLadderCustomDragAfterLongPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objLadderCustomDragAfterLongPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, LazyListState lazyListState, CoroutineScope coroutineScope, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotIntState2 snapshotIntState2, SnapshotState snapshotState3, Animatable animatable, Animatable animatable2, Offset offset) {
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 = LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$4(snapshotState);
        if (selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$1(snapshotState2) == null) {
            function1.invoke(selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4);
        }
        snapshotIntState2.setIntValue(LadderGestureAwareLazyColumnKt.getScrollOffset(lazyListState));
        int itemOffset = LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getRowIndex());
        snapshotState3.setValue(Integer.valueOf(itemOffset));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17548x97e0d4cf(animatable, animatable2, itemOffset, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Animatable animatable, LazyListState lazyListState, CoroutineScope coroutineScope, PointerInputScope pointerInputScope, Animatable animatable2, float f, Function2 function2, SnapshotIntState2 snapshotIntState2, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, boolean z, Float f2) {
        snapshotIntState2.setIntValue(-1);
        if (z) {
            if (f2 == null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17549x97e0d890(animatable, LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, lazyListState.getFirstVisibleItemIndex() + MathKt.roundToInt((((Number) animatable.getValue()).floatValue() + lazyListState.getFirstVisibleItemScrollOffset()) / LadderGestureAwareLazyColumnKt.rowHeight(lazyListState))) + snapshotFloatState2.getFloatValue(), null), 3, null);
            } else if (Math.abs(DecayAnimationSpec3.calculateTargetValue(SplineBasedDecay2.splineBasedDecay(pointerInputScope), ((Number) animatable2.getValue()).floatValue(), f2.floatValue())) >= f) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17550x97e0d891(animatable2, f2, function2, snapshotFloatState22, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        function2.invoke(Boolean.valueOf(z), Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(Function1 function1, LazyListState lazyListState, float f, CoroutineScope coroutineScope, Function1 function12, SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, SnapshotIntState2 snapshotIntState2, SnapshotFloatState2 snapshotFloatState22, SnapshotState snapshotState2, Animatable animatable, Animatable animatable2, SnapshotIntState2 snapshotIntState22, float f2, float f3, float f4, LadderCustomGestureDetector dragDirection) {
        Intrinsics.checkNotNullParameter(dragDirection, "dragDirection");
        FuturesLadderViewState.LadderData.SelectedPendingOrders selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 = LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$4(snapshotState);
        if (selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        int rowIndex = selectedPendingOrdersLadderGestureAwareLazyColumn$lambda$4.getRowIndex();
        function1.invoke(dragDirection);
        float itemOffset = LadderGestureAwareLazyColumnKt.getItemOffset(lazyListState, rowIndex) + snapshotFloatState2.getFloatValue();
        int i = WhenMappings.$EnumSwitchMapping$0[dragDirection.ordinal()];
        if (i == 1) {
            float scrollOffset = (LadderGestureAwareLazyColumnKt.getScrollOffset(lazyListState) - snapshotIntState2.getIntValue()) + itemOffset + f4;
            float fCoerceIn = RangesKt.coerceIn(scrollOffset, f, snapshotFloatState22.getFloatValue());
            snapshotState2.setValue(Integer.valueOf((int) itemOffset));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17551x97e0dc51(scrollOffset - fCoerceIn, lazyListState, animatable, animatable2, fCoerceIn, null), 3, null);
            int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + MathKt.roundToInt((fCoerceIn + lazyListState.getFirstVisibleItemScrollOffset()) / LadderGestureAwareLazyColumnKt.rowHeight(lazyListState));
            if (firstVisibleItemIndex != snapshotIntState22.getIntValue()) {
                snapshotIntState22.setIntValue(firstVisibleItemIndex);
                function12.invoke(Integer.valueOf(firstVisibleItemIndex));
            }
        } else if (i == 2) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C17552x97e0dc52(animatable, f3, f2, animatable2, itemOffset, null), 3, null);
            snapshotState2.setValue(Integer.valueOf((int) itemOffset));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$3(SnapshotState snapshotState) {
        return LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$4(snapshotState) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(Function2 function2, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        if (LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$1(snapshotState2) == null) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        function2.invoke(bool, bool);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
