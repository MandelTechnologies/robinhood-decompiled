package com.robinhood.android.sdui.chartgroup;

import androidx.compose.animation.core.Animatable;
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

/* compiled from: SduiChartPulsingDot.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiChartPulsingDotKt$SduiChartPulsingDot$pulseState$1$1", m3645f = "SduiChartPulsingDot.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.sdui.chartgroup.SduiChartPulsingDotKt$SduiChartPulsingDot$pulseState$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SduiChartPulsingDot3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animatedAlpha;
    final /* synthetic */ TweenSpec<Float> $animationTween;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SduiChartPulsingDot3(Animatable<Float, AnimationVectors2> animatable, TweenSpec<Float> tweenSpec, Continuation<? super SduiChartPulsingDot3> continuation) {
        super(2, continuation);
        this.$animatedAlpha = animatable;
        this.$animationTween = tweenSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiChartPulsingDot3(this.$animatedAlpha, this.$animationTween, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiChartPulsingDot3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$animatedAlpha;
            Float fBoxFloat = boxing.boxFloat(1.0f);
            TweenSpec<Float> tweenSpec = this.$animationTween;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpec, null, null, this, 12, null) == coroutine_suspended) {
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
