package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$5$1$customScope$1$updatePotentialDragTarget$1", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {364, 366}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$2$5$1$customScope$1$updatePotentialDragTarget$1 */
/* loaded from: classes12.dex */
final class C40967xb95f5296 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentRowOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderXOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderYOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C40967xb95f5296(Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, int i, Continuation<? super C40967xb95f5296> continuation) {
        super(2, continuation);
        this.$selectedPendingOrderXOffset = animatable;
        this.$selectedPendingOrderYOffset = animatable2;
        this.$currentRowOffset = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C40967xb95f5296(this.$selectedPendingOrderXOffset, this.$selectedPendingOrderYOffset, this.$currentRowOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C40967xb95f5296) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r5.snapTo(r1, r4) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$selectedPendingOrderXOffset.getValue().floatValue() != 0.0f) {
                Animatable<Float, AnimationVectors2> animatable = this.$selectedPendingOrderXOffset;
                Float fBoxFloat = boxing.boxFloat(0.0f);
                this.label = 1;
                if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        Animatable<Float, AnimationVectors2> animatable2 = this.$selectedPendingOrderYOffset;
        Float fBoxFloat2 = boxing.boxFloat(this.$currentRowOffset);
        this.label = 2;
    }
}
