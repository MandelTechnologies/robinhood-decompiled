package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$3$2", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$3$2 */
/* loaded from: classes10.dex */
final class C17552x97e0dc52 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $currentDraggedItemOffset;
    final /* synthetic */ float $dragX;
    final /* synthetic */ float $draggableLengthForDelete;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderXOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderYOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C17552x97e0dc52(Animatable<Float, AnimationVectors2> animatable, float f, float f2, Animatable<Float, AnimationVectors2> animatable2, float f3, Continuation<? super C17552x97e0dc52> continuation) {
        super(2, continuation);
        this.$selectedPendingOrderXOffset = animatable;
        this.$dragX = f;
        this.$draggableLengthForDelete = f2;
        this.$selectedPendingOrderYOffset = animatable2;
        this.$currentDraggedItemOffset = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C17552x97e0dc52(this.$selectedPendingOrderXOffset, this.$dragX, this.$draggableLengthForDelete, this.$selectedPendingOrderYOffset, this.$currentDraggedItemOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C17552x97e0dc52) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.snapTo(r1, r6) == r0) goto L15;
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
            Animatable<Float, AnimationVectors2> animatable = this.$selectedPendingOrderXOffset;
            float f = this.$dragX;
            float f2 = this.$draggableLengthForDelete;
            Float fBoxFloat = boxing.boxFloat(RangesKt.coerceIn(f, -f2, f2));
            this.label = 1;
            if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVectors2> animatable2 = this.$selectedPendingOrderYOffset;
        Float fBoxFloat2 = boxing.boxFloat(this.$currentDraggedItemOffset);
        this.label = 2;
    }
}
