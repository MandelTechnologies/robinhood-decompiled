package com.robinhood.shared.tradeladder.p398ui.ladder.gestures;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.gestures.ScrollExtensions;
import androidx.compose.foundation.lazy.LazyListState;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LadderGestureAwareLazyColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$3$1", m3645f = "LadderGestureAwareLazyColumn.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.gestures.LadderGestureAwareLazyColumnKt$LadderGestureAwareLazyColumn$1$1$3$1 */
/* loaded from: classes12.dex */
final class C40961x97e0dc51 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $boundedOffset;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ float $pendingScrollAmount;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderXOffset;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $selectedPendingOrderYOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C40961x97e0dc51(float f, LazyListState lazyListState, Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, float f2, Continuation<? super C40961x97e0dc51> continuation) {
        super(2, continuation);
        this.$pendingScrollAmount = f;
        this.$lazyListState = lazyListState;
        this.$selectedPendingOrderXOffset = animatable;
        this.$selectedPendingOrderYOffset = animatable2;
        this.$boundedOffset = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C40961x97e0dc51(this.$pendingScrollAmount, this.$lazyListState, this.$selectedPendingOrderXOffset, this.$selectedPendingOrderYOffset, this.$boundedOffset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C40961x97e0dc51) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r8.snapTo(r1, r7) != r0) goto L27;
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
            float f = this.$pendingScrollAmount;
            if (f != 0.0f) {
                this.label = 1;
                if (ScrollExtensions.scrollBy(this.$lazyListState, f / 3, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$selectedPendingOrderYOffset;
            Float fBoxFloat = boxing.boxFloat(this.$boundedOffset);
            this.label = 3;
        }
        if (this.$selectedPendingOrderXOffset.getValue().floatValue() != 0.0f) {
            Animatable<Float, AnimationVectors2> animatable2 = this.$selectedPendingOrderXOffset;
            Float fBoxFloat2 = boxing.boxFloat(0.0f);
            this.label = 2;
            if (animatable2.snapTo(fBoxFloat2, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        Animatable<Float, AnimationVectors2> animatable3 = this.$selectedPendingOrderYOffset;
        Float fBoxFloat3 = boxing.boxFloat(this.$boundedOffset);
        this.label = 3;
    }
}
