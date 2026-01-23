package com.robinhood.android.feature.linking;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MobileLinkingBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$MobileLinkingBottomSheetComposable$1$1", m3645f = "MobileLinkingBottomSheetComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingBottomSheetComposableKt$MobileLinkingBottomSheetComposable$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MobileLinkingBottomSheetComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    final /* synthetic */ float $offsetDp;
    final /* synthetic */ SnapshotFloatState2 $offsetPx$delegate;
    final /* synthetic */ float $screenHeightDp;
    final /* synthetic */ float $screenHeightPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MobileLinkingBottomSheetComposable2(float f, float f2, float f3, SnapshotState<Boolean> snapshotState, SnapshotFloatState2 snapshotFloatState2, Continuation<? super MobileLinkingBottomSheetComposable2> continuation) {
        super(2, continuation);
        this.$offsetDp = f;
        this.$screenHeightDp = f2;
        this.$screenHeightPx = f3;
        this.$isDragging$delegate = snapshotState;
        this.$offsetPx$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MobileLinkingBottomSheetComposable2(this.$offsetDp, this.$screenHeightDp, this.$screenHeightPx, this.$isDragging$delegate, this.$offsetPx$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MobileLinkingBottomSheetComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!MobileLinkingBottomSheetComposable.MobileLinkingBottomSheetComposable$lambda$7(this.$isDragging$delegate)) {
                this.$offsetPx$delegate.setFloatValue(C2002Dp.m7994compareTo0680j_4(this.$offsetDp, C2002Dp.m7995constructorimpl(this.$screenHeightDp / ((float) 3))) < 0 ? 0.0f : this.$screenHeightPx);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
