package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WheelPicker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class WheelPicker5 implements PointerInputEventHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotFloatState2 $dragOffset$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $scrollOffset;
    final /* synthetic */ WheelPickerState $state;

    WheelPicker5(SnapshotState<Boolean> snapshotState, CoroutineScope coroutineScope, SnapshotFloatState2 snapshotFloatState2, Animatable<Float, AnimationVectors2> animatable, WheelPickerState wheelPickerState) {
        this.$isDragging$delegate = snapshotState;
        this.$coroutineScope = coroutineScope;
        this.$dragOffset$delegate = snapshotFloatState2;
        this.$scrollOffset = animatable;
        this.$state = wheelPickerState;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotState<Boolean> snapshotState = this.$isDragging$delegate;
        Function1 function1 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WheelPicker5.invoke$lambda$0(snapshotState, (Offset) obj);
            }
        };
        final SnapshotState<Boolean> snapshotState2 = this.$isDragging$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelPicker5.invoke$lambda$1(snapshotState2);
            }
        };
        final SnapshotState<Boolean> snapshotState3 = this.$isDragging$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WheelPicker5.invoke$lambda$2(snapshotState3);
            }
        };
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final SnapshotFloatState2 snapshotFloatState2 = this.$dragOffset$delegate;
        final Animatable<Float, AnimationVectors2> animatable = this.$scrollOffset;
        final WheelPickerState wheelPickerState = this.$state;
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function02, new Function2() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$WheelPicker$2$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WheelPicker5.invoke$lambda$3(coroutineScope, snapshotFloatState2, animatable, wheelPickerState, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation);
        return objDetectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SnapshotState snapshotState, Offset offset) {
        WheelPicker3.WheelPicker$lambda$4(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(SnapshotState snapshotState) {
        WheelPicker3.WheelPicker$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(SnapshotState snapshotState) {
        WheelPicker3.WheelPicker$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(CoroutineScope coroutineScope, SnapshotFloatState2 snapshotFloatState2, Animatable animatable, WheelPickerState wheelPickerState, PointerInputChange pointerInputChange, Offset offset) {
        Intrinsics.checkNotNullParameter(pointerInputChange, "<unused var>");
        snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() + Float.intBitsToFloat((int) (offset.getPackedValue() & 4294967295L)));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WheelPicker6(animatable, offset, wheelPickerState, null), 3, null);
        return Unit.INSTANCE;
    }
}
