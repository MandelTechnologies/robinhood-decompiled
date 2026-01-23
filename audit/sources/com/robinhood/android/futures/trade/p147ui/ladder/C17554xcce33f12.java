package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import com.robinhood.android.futures.trade.p147ui.ladder.gestures.LadderZoomGestureDetector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$3$1$1 */
/* loaded from: classes10.dex */
final class C17554xcce33f12 implements PointerInputEventHandler {
    final /* synthetic */ Function1<Boolean, Unit> $onZoomStateChanged;
    final /* synthetic */ SnapshotFloatState2 $scale$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    C17554xcce33f12(Function1<? super Boolean, Unit> function1, SnapshotFloatState2 snapshotFloatState2) {
        this.$onZoomStateChanged = function1;
        this.$scale$delegate = snapshotFloatState2;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function1<Boolean, Unit> function1 = this.$onZoomStateChanged;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$3$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17554xcce33f12.invoke$lambda$0(function1);
            }
        };
        final Function1<Boolean, Unit> function12 = this.$onZoomStateChanged;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$3$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C17554xcce33f12.invoke$lambda$1(function12);
            }
        };
        final SnapshotFloatState2 snapshotFloatState2 = this.$scale$delegate;
        Object objDetectZoom = LadderZoomGestureDetector.detectZoom(pointerInputScope, function0, function02, new Function1() { // from class: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$3$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17554xcce33f12.invoke$lambda$2(snapshotFloatState2, ((Float) obj).floatValue());
            }
        }, continuation);
        return objDetectZoom == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectZoom : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(SnapshotFloatState2 snapshotFloatState2, float f) {
        snapshotFloatState2.setFloatValue(RangesKt.coerceAtLeast(snapshotFloatState2.getFloatValue() / f, 1.0f));
        return Unit.INSTANCE;
    }
}
