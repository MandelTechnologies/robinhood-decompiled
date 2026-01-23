package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
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

/* compiled from: AllocationBar.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.composables.components.AllocationBarKt$AllocationsIsometricBar$3$1$3$1", m3645f = "AllocationBar.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AllocationBarKt$AllocationsIsometricBar$3$1$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CubicBezierEasing $easeOutCubic;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $spacingAnimation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllocationBarKt$AllocationsIsometricBar$3$1$3$1(Animatable<Float, AnimationVectors2> animatable, CubicBezierEasing cubicBezierEasing, Continuation<? super AllocationBarKt$AllocationsIsometricBar$3$1$3$1> continuation) {
        super(2, continuation);
        this.$spacingAnimation = animatable;
        this.$easeOutCubic = cubicBezierEasing;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AllocationBarKt$AllocationsIsometricBar$3$1$3$1(this.$spacingAnimation, this.$easeOutCubic, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AllocationBarKt$AllocationsIsometricBar$3$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$spacingAnimation;
            Float fBoxFloat = boxing.boxFloat(1.0f);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(400, 0, this.$easeOutCubic, 2, null);
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
