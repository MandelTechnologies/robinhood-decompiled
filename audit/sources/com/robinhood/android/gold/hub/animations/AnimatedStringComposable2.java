package com.robinhood.android.gold.hub.animations;

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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnimatedStringComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$AnimatedStringComposable$1$1", m3645f = "AnimatedStringComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$AnimatedStringComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class AnimatedStringComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $alphaAnimationDurationMillis;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $initialStringAlpha;
    final /* synthetic */ int $initialStringDelayMillis;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $updatedStringAlpha;
    final /* synthetic */ int $updatedStringDelayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedStringComposable2(Animatable<Float, AnimationVectors2> animatable, int i, int i2, Animatable<Float, AnimationVectors2> animatable2, int i3, Continuation<? super AnimatedStringComposable2> continuation) {
        super(2, continuation);
        this.$initialStringAlpha = animatable;
        this.$alphaAnimationDurationMillis = i;
        this.$initialStringDelayMillis = i2;
        this.$updatedStringAlpha = animatable2;
        this.$updatedStringDelayMillis = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AnimatedStringComposable2 animatedStringComposable2 = new AnimatedStringComposable2(this.$initialStringAlpha, this.$alphaAnimationDurationMillis, this.$initialStringDelayMillis, this.$updatedStringAlpha, this.$updatedStringDelayMillis, continuation);
        animatedStringComposable2.L$0 = obj;
        return animatedStringComposable2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnimatedStringComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AnimatedStringComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$AnimatedStringComposable$1$1$1", m3645f = "AnimatedStringComposable.kt", m3646l = {76}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$AnimatedStringComposable$1$1$1 */
    static final class C177861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $alphaAnimationDurationMillis;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $initialStringAlpha;
        final /* synthetic */ int $initialStringDelayMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C177861(Animatable<Float, AnimationVectors2> animatable, int i, int i2, Continuation<? super C177861> continuation) {
            super(2, continuation);
            this.$initialStringAlpha = animatable;
            this.$alphaAnimationDurationMillis = i;
            this.$initialStringDelayMillis = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C177861(this.$initialStringAlpha, this.$alphaAnimationDurationMillis, this.$initialStringDelayMillis, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$initialStringAlpha;
                Float fBoxFloat = boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(this.$alphaAnimationDurationMillis, this.$initialStringDelayMillis, EasingFunctions.getEaseInOut());
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

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C177861(this.$initialStringAlpha, this.$alphaAnimationDurationMillis, this.$initialStringDelayMillis, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C177872(this.$updatedStringAlpha, this.$alphaAnimationDurationMillis, this.$updatedStringDelayMillis, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: AnimatedStringComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$AnimatedStringComposable$1$1$2", m3645f = "AnimatedStringComposable.kt", m3646l = {86}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.hub.animations.AnimatedStringComposableKt$AnimatedStringComposable$1$1$2 */
    static final class C177872 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $alphaAnimationDurationMillis;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $updatedStringAlpha;
        final /* synthetic */ int $updatedStringDelayMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C177872(Animatable<Float, AnimationVectors2> animatable, int i, int i2, Continuation<? super C177872> continuation) {
            super(2, continuation);
            this.$updatedStringAlpha = animatable;
            this.$alphaAnimationDurationMillis = i;
            this.$updatedStringDelayMillis = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C177872(this.$updatedStringAlpha, this.$alphaAnimationDurationMillis, this.$updatedStringDelayMillis, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177872) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$updatedStringAlpha;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(this.$alphaAnimationDurationMillis, this.$updatedStringDelayMillis, EasingFunctions.getEaseOut());
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
}
