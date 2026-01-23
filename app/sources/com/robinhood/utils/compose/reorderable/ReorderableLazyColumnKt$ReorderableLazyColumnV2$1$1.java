package com.robinhood.utils.compose.reorderable;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderableLazyColumn.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1 implements PointerInputEventHandler {
    final /* synthetic */ DragStateV2 $dragState;
    final /* synthetic */ DragStateV2 $parentDragState;

    ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1(DragStateV2 dragStateV2, DragStateV2 dragStateV22) {
        this.$dragState = dragStateV2;
        this.$parentDragState = dragStateV22;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final DragStateV2 dragStateV2 = this.$dragState;
        Function1 function1 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1.invoke$lambda$0(dragStateV2, (Offset) obj);
            }
        };
        final DragStateV2 dragStateV22 = this.$dragState;
        Function0 function0 = new Function0() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1.invoke$lambda$1(dragStateV22);
            }
        };
        final DragStateV2 dragStateV23 = this.$dragState;
        Object objDetectDragGesturesAfterLongPressV2$default = ReorderableLazyColumnKt.detectDragGesturesAfterLongPressV2$default(pointerInputScope, function1, function0, null, new Function2() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReorderableLazyColumnKt$ReorderableLazyColumnV2$1$1.invoke$lambda$2(dragStateV23, (PointerInputChange) obj, (Offset) obj2);
            }
        }, this.$dragState, this.$parentDragState, continuation, 4, null);
        return objDetectDragGesturesAfterLongPressV2$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPressV2$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(DragStateV2 dragStateV2, Offset offset) {
        dragStateV2.m26616onDragStartk4lQ0M(offset.getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(DragStateV2 dragStateV2, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        dragStateV2.m26615onDragk4lQ0M(offset.getPackedValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(DragStateV2 dragStateV2) {
        dragStateV2.onDragEnd();
        return Unit.INSTANCE;
    }
}
