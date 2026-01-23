package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.core.view.ViewCompat;
import com.robinhood.shared.tradeladder.p398ui.ladder.extensions.LazyListStates2;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderGestureConfiguration;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$4$1 */
/* loaded from: classes12.dex */
final class C40965x670a1b86 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<BigDecimal> $centerPriceBeforeZoom$delegate;
    final /* synthetic */ SnapshotState<Float> $initialPinchDistance$delegate;
    final /* synthetic */ LadderGestureConfiguration $ladderGestureConfiguration;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function2<Float, Float, Unit> $onZoomDistanceChange;
    final /* synthetic */ Function3<Boolean, Integer, Integer, Unit> $onZoomStateChanged;
    final /* synthetic */ SnapshotFloatState2 $scale$delegate;
    final /* synthetic */ View $view;

    /* JADX WARN: Multi-variable type inference failed */
    C40965x670a1b86(LazyListState lazyListState, Function3<? super Boolean, ? super Integer, ? super Integer, Unit> function3, Function2<? super Float, ? super Float, Unit> function2, SnapshotState<Float> snapshotState, SnapshotState<BigDecimal> snapshotState2, LadderGestureConfiguration ladderGestureConfiguration, View view, SnapshotFloatState2 snapshotFloatState2) {
        this.$lazyListState = lazyListState;
        this.$onZoomStateChanged = function3;
        this.$onZoomDistanceChange = function2;
        this.$initialPinchDistance$delegate = snapshotState;
        this.$centerPriceBeforeZoom$delegate = snapshotState2;
        this.$ladderGestureConfiguration = ladderGestureConfiguration;
        this.$view = view;
        this.$scale$delegate = snapshotFloatState2;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final LazyListState lazyListState = this.$lazyListState;
        final Function3<Boolean, Integer, Integer, Unit> function3 = this.$onZoomStateChanged;
        final Function2<Float, Float, Unit> function2 = this.$onZoomDistanceChange;
        final SnapshotState<Float> snapshotState = this.$initialPinchDistance$delegate;
        Function2 function22 = new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$4$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40965x670a1b86.invoke$lambda$0(lazyListState, function3, function2, snapshotState, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        };
        final Function2<Float, Float, Unit> function23 = this.$onZoomDistanceChange;
        final Function3<Boolean, Integer, Integer, Unit> function32 = this.$onZoomStateChanged;
        final SnapshotState<Float> snapshotState2 = this.$initialPinchDistance$delegate;
        final SnapshotState<BigDecimal> snapshotState3 = this.$centerPriceBeforeZoom$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$4$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40965x670a1b86.invoke$lambda$1(function23, function32, snapshotState2, snapshotState3);
            }
        };
        final LadderGestureConfiguration ladderGestureConfiguration = this.$ladderGestureConfiguration;
        final View view = this.$view;
        final Function2<Float, Float, Unit> function24 = this.$onZoomDistanceChange;
        final SnapshotState<Float> snapshotState4 = this.$initialPinchDistance$delegate;
        final SnapshotFloatState2 snapshotFloatState2 = this.$scale$delegate;
        Object objDetectZoom = LadderZoomGestureDetector2.detectZoom(pointerInputScope, function22, function0, new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$4$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C40965x670a1b86.invoke$lambda$2(ladderGestureConfiguration, view, function24, snapshotState4, snapshotFloatState2, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, continuation);
        return objDetectZoom == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectZoom : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(LazyListState lazyListState, Function3 function3, Function2 function2, SnapshotState snapshotState, float f, float f2) {
        function3.invoke(Boolean.TRUE, Integer.valueOf(LazyListStates2.getCenterIndex(lazyListState)), Integer.valueOf(lazyListState.getLayoutInfo().getVisibleItemsInfo().size()));
        snapshotState.setValue(Float.valueOf(f));
        function2.invoke(Float.valueOf(f), Float.valueOf(f2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function2 function2, Function3 function3, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        function2.invoke(null, null);
        function3.invoke(Boolean.FALSE, null, null);
        snapshotState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(LadderGestureConfiguration ladderGestureConfiguration, View view, Function2 function2, SnapshotState snapshotState, SnapshotFloatState2 snapshotFloatState2, float f, float f2) {
        Float fLadderGestureAwareLazyColumn$lambda$31 = LadderGestureAwareLazyColumnKt.LadderGestureAwareLazyColumn$lambda$31(snapshotState);
        float fFloatValue = (f - (fLadderGestureAwareLazyColumn$lambda$31 != null ? fLadderGestureAwareLazyColumn$lambda$31.floatValue() : 0.0f)) / ladderGestureConfiguration.getZoomFingerSensitivity();
        if (fFloatValue < -1.0f && snapshotFloatState2.getFloatValue() < ladderGestureConfiguration.getMaxZoomScale()) {
            ViewCompat.performHapticFeedback(view, 9);
            snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() + 1);
            snapshotState.setValue(Float.valueOf(f));
        } else if (fFloatValue > 1.0f && snapshotFloatState2.getFloatValue() > ladderGestureConfiguration.getMinZoomScale()) {
            ViewCompat.performHapticFeedback(view, 9);
            snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() - 1);
            snapshotState.setValue(Float.valueOf(f));
        }
        function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(f2));
        return Unit.INSTANCE;
    }
}
