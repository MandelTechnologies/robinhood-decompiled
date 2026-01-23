package com.robinhood.android.charts;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.charts.Interactions2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Interactions.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.charts.InteractionsKt$scrubDetection$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class Interactions4 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<Offset> $dragOffset$delegate;
    final /* synthetic */ Function1<Offset, Unit> $onScrub;
    final /* synthetic */ Function0<Unit> $onScrubStopped;

    /* JADX WARN: Multi-variable type inference failed */
    Interactions4(Function1<? super Offset, Unit> function1, SnapshotState<Offset> snapshotState, Function0<Unit> function0) {
        this.$onScrub = function1;
        this.$dragOffset$delegate = snapshotState;
        this.$onScrubStopped = function0;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final Function1<Offset, Unit> function1 = this.$onScrub;
        final SnapshotState<Offset> snapshotState = this.$dragOffset$delegate;
        Function1 function12 = new Function1() { // from class: com.robinhood.android.charts.InteractionsKt$scrubDetection$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Interactions4.invoke$lambda$0(function1, snapshotState, (Offset) obj);
            }
        };
        final Function0<Unit> function0 = this.$onScrubStopped;
        final SnapshotState<Offset> snapshotState2 = this.$dragOffset$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.charts.InteractionsKt$scrubDetection$1$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Interactions4.invoke$lambda$1(function0, snapshotState2);
            }
        };
        final Function0<Unit> function03 = this.$onScrubStopped;
        final SnapshotState<Offset> snapshotState3 = this.$dragOffset$delegate;
        Function0 function04 = new Function0() { // from class: com.robinhood.android.charts.InteractionsKt$scrubDetection$1$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Interactions4.invoke$lambda$2(function03, snapshotState3);
            }
        };
        final Function1<Offset, Unit> function13 = this.$onScrub;
        final SnapshotState<Offset> snapshotState4 = this.$dragOffset$delegate;
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, function12, function02, function04, new Function2() { // from class: com.robinhood.android.charts.InteractionsKt$scrubDetection$1$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Interactions4.invoke$lambda$3(function13, snapshotState4, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation);
        return objDetectDragGesturesAfterLongPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 function1, SnapshotState snapshotState, Offset offset) {
        Interactions2.C109721.invoke$lambda$2(snapshotState, offset.getPackedValue());
        function1.invoke(Offset.m6534boximpl(Interactions2.C109721.invoke$lambda$1(snapshotState)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(Function0 function0, SnapshotState snapshotState) {
        long jInvoke$lambda$1 = Interactions2.C109721.invoke$lambda$1(snapshotState);
        Offset.Companion companion = Offset.INSTANCE;
        if (!Offset.m6540equalsimpl0(jInvoke$lambda$1, companion.m6553getZeroF1C5BW0())) {
            function0.invoke();
        }
        Interactions2.C109721.invoke$lambda$2(snapshotState, companion.m6553getZeroF1C5BW0());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(Function0 function0, SnapshotState snapshotState) {
        Interactions2.C109721.invoke$lambda$2(snapshotState, Offset.INSTANCE.m6553getZeroF1C5BW0());
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(Function1 function1, SnapshotState snapshotState, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        Interactions2.C109721.invoke$lambda$2(snapshotState, Offset.m6547plusMKHz9U(Interactions2.C109721.invoke$lambda$1(snapshotState), offset.getPackedValue()));
        function1.invoke(Offset.m6534boximpl(Interactions2.C109721.invoke$lambda$1(snapshotState)));
        return Unit.INSTANCE;
    }
}
