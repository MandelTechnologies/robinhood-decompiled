package com.robinhood.android.gold.transfers;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
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

/* compiled from: GoldDepositBoostCelebrationComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostCharacter$1$1", m3645f = "GoldDepositBoostCelebrationComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostCharacter$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDepositBoostCelebrationComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $delayMillis;
    final /* synthetic */ Easing $easing;
    final /* synthetic */ float $targetOffsetValue;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $yOffset;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDepositBoostCelebrationComposable3(Animatable<Float, AnimationVectors2> animatable, float f, int i, Easing easing, Continuation<? super GoldDepositBoostCelebrationComposable3> continuation) {
        super(2, continuation);
        this.$yOffset = animatable;
        this.$targetOffsetValue = f;
        this.$delayMillis = i;
        this.$easing = easing;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldDepositBoostCelebrationComposable3(this.$yOffset, this.$targetOffsetValue, this.$delayMillis, this.$easing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldDepositBoostCelebrationComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$yOffset;
            Float fBoxFloat = boxing.boxFloat(this.$targetOffsetValue);
            TweenSpec tweenSpecTween = AnimationSpecKt.tween(1000, this.$delayMillis, this.$easing);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
