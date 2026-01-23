package com.robinhood.android.advisory.projection.chart;

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

/* compiled from: ChartComponents.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.ChartComponentsKt$ProjectionChart$1$1", m3645f = "ChartComponents.kt", m3646l = {359}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChartComponentsKt$ProjectionChart$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TweenSpec<Float> $lineAnimationSpec;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $lineProgress;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChartComponentsKt$ProjectionChart$1$1(Animatable<Float, AnimationVectors2> animatable, TweenSpec<Float> tweenSpec, Continuation<? super ChartComponentsKt$ProjectionChart$1$1> continuation) {
        super(2, continuation);
        this.$lineProgress = animatable;
        this.$lineAnimationSpec = tweenSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartComponentsKt$ProjectionChart$1$1(this.$lineProgress, this.$lineAnimationSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartComponentsKt$ProjectionChart$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVectors2> animatable = this.$lineProgress;
            Float fBoxFloat = boxing.boxFloat(1.0f);
            TweenSpec<Float> tweenSpec = this.$lineAnimationSpec;
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
