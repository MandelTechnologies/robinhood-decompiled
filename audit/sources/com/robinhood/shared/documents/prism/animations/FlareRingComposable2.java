package com.robinhood.shared.documents.prism.animations;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.EasingFunctions;
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

/* compiled from: FlareRingComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.animations.FlareRingComposableKt$FlareRingComposable$1$1", m3645f = "FlareRingComposable.kt", m3646l = {52, 54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.documents.prism.animations.FlareRingComposableKt$FlareRingComposable$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class FlareRingComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $opacity;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlareRingComposable2(boolean z, Animatable<Float, AnimationVectors2> animatable, Continuation<? super FlareRingComposable2> continuation) {
        super(2, continuation);
        this.$visible = z;
        this.$opacity = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlareRingComposable2(this.$visible, this.$opacity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FlareRingComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r15 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r15 == r0) goto L18;
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
            if (this.$visible) {
                Animatable<Float, AnimationVectors2> animatable = this.$opacity;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
                this.label = 1;
                obj = Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, this, 12, null);
            } else {
                Animatable<Float, AnimationVectors2> animatable2 = this.$opacity;
                Float fBoxFloat2 = boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(300, 0, EasingFunctions.getEaseInOut(), 2, null);
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
