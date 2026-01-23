package com.robinhood.shared.common.etpcomposition;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
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

/* compiled from: EtpHoldingRadialBreakdownChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingRadialBreakdownChart$2$1", m3645f = "EtpHoldingRadialBreakdownChart.kt", m3646l = {98, 99}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingRadialBreakdownChart$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class EtpHoldingRadialBreakdownChart2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animStartAngle;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $animSweepAngle;
    final /* synthetic */ SnapshotState<Boolean> $isIntroAnimation$delegate;
    final /* synthetic */ float $targetStartAngle;
    final /* synthetic */ float $targetSweepAngle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EtpHoldingRadialBreakdownChart2(Animatable<Float, AnimationVectors2> animatable, float f, Animatable<Float, AnimationVectors2> animatable2, float f2, SnapshotState<Boolean> snapshotState, Continuation<? super EtpHoldingRadialBreakdownChart2> continuation) {
        super(2, continuation);
        this.$animStartAngle = animatable;
        this.$targetStartAngle = f;
        this.$animSweepAngle = animatable2;
        this.$targetSweepAngle = f2;
        this.$isIntroAnimation$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EtpHoldingRadialBreakdownChart2 etpHoldingRadialBreakdownChart2 = new EtpHoldingRadialBreakdownChart2(this.$animStartAngle, this.$targetStartAngle, this.$animSweepAngle, this.$targetSweepAngle, this.$isIntroAnimation$delegate, continuation);
        etpHoldingRadialBreakdownChart2.L$0 = obj;
        return etpHoldingRadialBreakdownChart2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EtpHoldingRadialBreakdownChart2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r6, r7, r8, null, null, r14, 12, null) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EtpHoldingRadialBreakdownChart2 etpHoldingRadialBreakdownChart2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (!EtpHoldingRadialBreakdownChart.EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$11(this.$isIntroAnimation$delegate)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.$animStartAngle, this.$targetStartAngle, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.$animSweepAngle, this.$targetSweepAngle, null), 3, null);
                return Unit.INSTANCE;
            }
            Animatable<Float, AnimationVectors2> animatable = this.$animStartAngle;
            Float fBoxFloat = boxing.boxFloat(this.$targetStartAngle);
            this.label = 1;
            if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            etpHoldingRadialBreakdownChart2 = this;
            EtpHoldingRadialBreakdownChart.EtpHoldingRadialBreakdownChart_3csKH6Y$lambda$12(etpHoldingRadialBreakdownChart2.$isIntroAnimation$delegate, false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVectors2> animatable2 = this.$animSweepAngle;
        Float fBoxFloat2 = boxing.boxFloat(this.$targetSweepAngle);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, Easing3.getFastOutSlowInEasing(), 2, null);
        this.label = 2;
        etpHoldingRadialBreakdownChart2 = this;
    }

    /* compiled from: EtpHoldingRadialBreakdownChart.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingRadialBreakdownChart$2$1$1", m3645f = "EtpHoldingRadialBreakdownChart.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingRadialBreakdownChart$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $animStartAngle;
        final /* synthetic */ float $targetStartAngle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Animatable<Float, AnimationVectors2> animatable, float f, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animStartAngle = animatable;
            this.$targetStartAngle = f;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$animStartAngle, this.$targetStartAngle, continuation);
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
                Animatable<Float, AnimationVectors2> animatable = this.$animStartAngle;
                Float fBoxFloat = boxing.boxFloat(this.$targetStartAngle);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, Easing3.getFastOutSlowInEasing(), 2, null);
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

    /* compiled from: EtpHoldingRadialBreakdownChart.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingRadialBreakdownChart$2$1$2", m3645f = "EtpHoldingRadialBreakdownChart.kt", m3646l = {109}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.common.etpcomposition.EtpHoldingRadialBreakdownChartKt$EtpHoldingRadialBreakdownChart$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $animSweepAngle;
        final /* synthetic */ float $targetSweepAngle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Animatable<Float, AnimationVectors2> animatable, float f, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$animSweepAngle = animatable;
            this.$targetSweepAngle = f;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$animSweepAngle, this.$targetSweepAngle, continuation);
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
                Animatable<Float, AnimationVectors2> animatable = this.$animSweepAngle;
                Float fBoxFloat = boxing.boxFloat(this.$targetSweepAngle);
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(600, 0, Easing3.getFastOutSlowInEasing(), 2, null);
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
}
