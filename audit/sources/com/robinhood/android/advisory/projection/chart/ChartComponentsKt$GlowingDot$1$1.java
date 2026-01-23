package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.RepeatMode;
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
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.ChartComponentsKt$GlowingDot$1$1", m3645f = "ChartComponents.kt", m3646l = {544, 545, 553}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ChartComponentsKt$GlowingDot$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $enableHeartbeat;
    final /* synthetic */ int $heartbeatDuration;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $heartbeatScale;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChartComponentsKt$GlowingDot$1$1(boolean z, Animatable<Float, AnimationVectors2> animatable, int i, Continuation<? super ChartComponentsKt$GlowingDot$1$1> continuation) {
        super(2, continuation);
        this.$enableHeartbeat = z;
        this.$heartbeatScale = animatable;
        this.$heartbeatDuration = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartComponentsKt$GlowingDot$1$1(this.$enableHeartbeat, this.$heartbeatScale, this.$heartbeatDuration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartComponentsKt$GlowingDot$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r13, 12, null) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r14.snapTo(r1, r13) == r0) goto L22;
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
            if (this.$enableHeartbeat) {
                Animatable<Float, AnimationVectors2> animatable = this.$heartbeatScale;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                this.label = 1;
                if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                    Animatable<Float, AnimationVectors2> animatable2 = this.$heartbeatScale;
                    Float fBoxFloat2 = boxing.boxFloat(1.5f);
                    InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$heartbeatDuration, 0, Easing3.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null);
                    this.label = 2;
                }
            } else {
                Animatable<Float, AnimationVectors2> animatable3 = this.$heartbeatScale;
                Float fBoxFloat3 = boxing.boxFloat(1.0f);
                this.label = 3;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVectors2> animatable22 = this.$heartbeatScale;
        Float fBoxFloat22 = boxing.boxFloat(1.5f);
        InfiniteRepeatableSpec infiniteRepeatableSpecM4815infiniteRepeatable9IiC70o$default2 = AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(this.$heartbeatDuration, 0, Easing3.getFastOutSlowInEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null);
        this.label = 2;
    }
}
