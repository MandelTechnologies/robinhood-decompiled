package com.robinhood.android.gold.transfers;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.EasingFunctions;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
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

/* compiled from: GoldDepositBoostCelebrationComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostText$1$1", m3645f = "GoldDepositBoostCelebrationComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostText$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDepositBoostCelebrationComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $initialAmountAlpha;
    final /* synthetic */ int $initialAmountDelayMillis;
    final /* synthetic */ SnapshotState<Boolean> $shouldDrawText$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $updatedAmountAlpha;
    final /* synthetic */ int $updatedAmountDelayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldDepositBoostCelebrationComposable4(SnapshotState<Boolean> snapshotState, Animatable<Float, AnimationVectors2> animatable, int i, Animatable<Float, AnimationVectors2> animatable2, int i2, Continuation<? super GoldDepositBoostCelebrationComposable4> continuation) {
        super(2, continuation);
        this.$shouldDrawText$delegate = snapshotState;
        this.$initialAmountAlpha = animatable;
        this.$initialAmountDelayMillis = i;
        this.$updatedAmountAlpha = animatable2;
        this.$updatedAmountDelayMillis = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldDepositBoostCelebrationComposable4 goldDepositBoostCelebrationComposable4 = new GoldDepositBoostCelebrationComposable4(this.$shouldDrawText$delegate, this.$initialAmountAlpha, this.$initialAmountDelayMillis, this.$updatedAmountAlpha, this.$updatedAmountDelayMillis, continuation);
        goldDepositBoostCelebrationComposable4.L$0 = obj;
        return goldDepositBoostCelebrationComposable4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GoldDepositBoostCelebrationComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (GoldDepositBoostCelebrationComposable2.AnimatedDepositBoostText$lambda$46(this.$shouldDrawText$delegate)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$initialAmountAlpha, this.$initialAmountDelayMillis, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$updatedAmountAlpha, this.$updatedAmountDelayMillis, null), 3, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: GoldDepositBoostCelebrationComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostText$1$1$1", m3645f = "GoldDepositBoostCelebrationComposable.kt", m3646l = {362}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostText$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $initialAmountAlpha;
        final /* synthetic */ int $initialAmountDelayMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVectors2> animatable, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$initialAmountAlpha = animatable;
            this.$initialAmountDelayMillis = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$initialAmountAlpha, this.$initialAmountDelayMillis, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$initialAmountAlpha;
                Float fBoxFloat = boxing.boxFloat(0.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(GoldDepositBoostCelebrationComposable2.framesToMillis(17.0f), this.$initialAmountDelayMillis, EasingFunctions.getEaseInOut());
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

    /* compiled from: GoldDepositBoostCelebrationComposable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostText$1$1$2", m3645f = "GoldDepositBoostCelebrationComposable.kt", m3646l = {372}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationComposableKt$AnimatedDepositBoostText$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $updatedAmountAlpha;
        final /* synthetic */ int $updatedAmountDelayMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Animatable<Float, AnimationVectors2> animatable, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$updatedAmountAlpha = animatable;
            this.$updatedAmountDelayMillis = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$updatedAmountAlpha, this.$updatedAmountDelayMillis, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$updatedAmountAlpha;
                Float fBoxFloat = boxing.boxFloat(1.0f);
                TweenSpec tweenSpecTween = AnimationSpecKt.tween(GoldDepositBoostCelebrationComposable2.framesToMillis(17.0f), this.$updatedAmountDelayMillis, EasingFunctions.getEaseOut());
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
