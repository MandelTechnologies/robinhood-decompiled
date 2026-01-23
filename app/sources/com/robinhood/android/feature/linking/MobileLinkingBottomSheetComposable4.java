package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.compose.bento.util.PointerInputScopes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: MobileLinkingBottomSheetComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$MobileLinkingBottomSheetComposable$4$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingBottomSheetComposable4 implements PointerInputEventHandler {
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    final /* synthetic */ SnapshotFloatState2 $offsetPx$delegate;
    final /* synthetic */ float $screenHeightPx;

    MobileLinkingBottomSheetComposable4(SnapshotState<Boolean> snapshotState, float f, SnapshotFloatState2 snapshotFloatState2) {
        this.$isDragging$delegate = snapshotState;
        this.$screenHeightPx = f;
        this.$offsetPx$delegate = snapshotFloatState2;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        final SnapshotState<Boolean> snapshotState = this.$isDragging$delegate;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$MobileLinkingBottomSheetComposable$4$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileLinkingBottomSheetComposable4.invoke$lambda$0(snapshotState);
            }
        };
        final SnapshotState<Boolean> snapshotState2 = this.$isDragging$delegate;
        Function0 function02 = new Function0() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$MobileLinkingBottomSheetComposable$4$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MobileLinkingBottomSheetComposable4.invoke$lambda$1(snapshotState2);
            }
        };
        final float f = this.$screenHeightPx;
        final SnapshotFloatState2 snapshotFloatState2 = this.$offsetPx$delegate;
        Object objDetectVerticalDragUnconsumed = PointerInputScopes.detectVerticalDragUnconsumed(pointerInputScope, function0, function02, new Function1() { // from class: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$MobileLinkingBottomSheetComposable$4$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobileLinkingBottomSheetComposable4.invoke$lambda$2(f, snapshotFloatState2, ((Float) obj).floatValue());
            }
        }, continuation);
        return objDetectVerticalDragUnconsumed == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectVerticalDragUnconsumed : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(SnapshotState snapshotState) {
        MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$8(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(SnapshotState snapshotState) {
        MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$8(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(float f, SnapshotFloatState2 snapshotFloatState2, float f2) {
        snapshotFloatState2.setFloatValue(RangesKt.coerceIn(snapshotFloatState2.getFloatValue() + f2, 0.0f, f));
        return Unit.INSTANCE;
    }
}
