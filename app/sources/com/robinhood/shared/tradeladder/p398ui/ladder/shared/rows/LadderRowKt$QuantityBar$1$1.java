package com.robinhood.shared.tradeladder.p398ui.ladder.shared.rows;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.LadderAnimations2;
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

/* compiled from: LadderRow.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.rows.LadderRowKt$QuantityBar$1$1", m3645f = "LadderRow.kt", m3646l = {703, 711}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LadderRowKt$QuantityBar$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $animateQuantityBarsEntry;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animatedWidthFraction;
    final /* synthetic */ float $widthFraction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderRowKt$QuantityBar$1$1(boolean z, Animatable<Float, AnimationVectors2> animatable, float f, Continuation<? super LadderRowKt$QuantityBar$1$1> continuation) {
        super(2, continuation);
        this.$animateQuantityBarsEntry = z;
        this.$animatedWidthFraction = animatable;
        this.$widthFraction = f;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LadderRowKt$QuantityBar$1$1(this.$animateQuantityBarsEntry, this.$animatedWidthFraction, this.$widthFraction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LadderRowKt$QuantityBar$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r14 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        if (r14 == r0) goto L18;
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
            if (this.$animateQuantityBarsEntry) {
                Animatable<Float, AnimationVectors2> animatable = this.$animatedWidthFraction;
                Float fBoxFloat = boxing.boxFloat(this.$widthFraction);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(0, 333, LadderAnimations2.getLADDER_COMPONENTS_ENTRY_EASING(), 1, null);
                this.label = 1;
                obj = Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null);
            } else {
                Animatable<Float, AnimationVectors2> animatable2 = this.$animatedWidthFraction;
                Float fBoxFloat2 = boxing.boxFloat(this.$widthFraction);
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(100, 0, new CubicBezierEasing(0.0f, 0.91f, 0.0f, 1.0f), 2, null);
                this.label = 2;
                obj = Animatable.animateTo$default(animatable2, fBoxFloat2, tweenSpecTween$default2, null, null, this, 12, null);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
