package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderRowPriceText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowPriceTextKt$LadderRowPriceText$2$1", m3645f = "LadderRowPriceText.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LadderRowPriceTextKt$LadderRowPriceText$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<String> $displayText$delegate;
    final /* synthetic */ SnapshotState<Boolean> $isAnimating$delegate;
    final /* synthetic */ SnapshotState<String> $pendingText$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $rotation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderRowPriceTextKt$LadderRowPriceText$2$1(Animatable<Float, AnimationVectors2> animatable, SnapshotState<String> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<String> snapshotState3, Continuation<? super LadderRowPriceTextKt$LadderRowPriceText$2$1> continuation) {
        super(2, continuation);
        this.$rotation = animatable;
        this.$pendingText$delegate = snapshotState;
        this.$isAnimating$delegate = snapshotState2;
        this.$displayText$delegate = snapshotState3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderRowPriceTextKt$LadderRowPriceText$2$1(this.$rotation, this.$pendingText$delegate, this.$isAnimating$delegate, this.$displayText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderRowPriceTextKt$LadderRowPriceText$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String strLadderRowPriceText_mxsUjTo$lambda$5 = LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$5(this.$pendingText$delegate);
            if (LadderRowPriceTextKt.LadderRowPriceText_mxsUjTo$lambda$8(this.$isAnimating$delegate) && strLadderRowPriceText_mxsUjTo$lambda$5 != null) {
                float fFloatValue = this.$rotation.getValue().floatValue() % 360.0f;
                if ((85.0f <= fFloatValue && fFloatValue <= 95.0f) || (265.0f <= fFloatValue && fFloatValue <= 275.0f)) {
                    this.$displayText$delegate.setValue(strLadderRowPriceText_mxsUjTo$lambda$5);
                    this.$pendingText$delegate.setValue(null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
