package com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.TweenSpec;
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

/* compiled from: FractionalRewardClaimConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$FractionalRewardClaimConfirmationComposable$1$1", m3645f = "FractionalRewardClaimConfirmationComposable.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationComposableKt$FractionalRewardClaimConfirmationComposable$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class FractionalRewardClaimConfirmationComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animatedScale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FractionalRewardClaimConfirmationComposable2(Animatable<Float, AnimationVectors2> animatable, Continuation<? super FractionalRewardClaimConfirmationComposable2> continuation) {
        super(2, continuation);
        this.$animatedScale = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FractionalRewardClaimConfirmationComposable2(this.$animatedScale, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FractionalRewardClaimConfirmationComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$animatedScale;
            Float fBoxFloat = boxing.boxFloat(1.0f);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, null, 6, null);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null) == coroutine_suspended) {
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
