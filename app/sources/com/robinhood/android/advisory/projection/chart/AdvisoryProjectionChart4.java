package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotState;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryProjectionChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$3$1", m3645f = "AdvisoryProjectionChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$3$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryProjectionChart4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ChartPoints> $chartPoints$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $glowingDotX;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $glowingDotY;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ SnapshotState<Boolean> $isLoadingAnimationFinished$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryProjectionChart4(boolean z, SnapshotState<ChartPoints> snapshotState, Animatable<Float, AnimationVectors2> animatable, Animatable<Float, AnimationVectors2> animatable2, SnapshotState<Boolean> snapshotState2, Continuation<? super AdvisoryProjectionChart4> continuation) {
        super(2, continuation);
        this.$isLoading = z;
        this.$chartPoints$delegate = snapshotState;
        this.$glowingDotX = animatable;
        this.$glowingDotY = animatable2;
        this.$isLoadingAnimationFinished$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryProjectionChart4 advisoryProjectionChart4 = new AdvisoryProjectionChart4(this.$isLoading, this.$chartPoints$delegate, this.$glowingDotX, this.$glowingDotY, this.$isLoadingAnimationFinished$delegate, continuation);
        advisoryProjectionChart4.L$0 = obj;
        return advisoryProjectionChart4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryProjectionChart4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        if (!this.$isLoading && !AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$18(this.$chartPoints$delegate).getMedianPoints().isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C92701(this.$glowingDotX, this.$chartPoints$delegate, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C92712(this.$glowingDotY, this.$chartPoints$delegate, this.$isLoadingAnimationFinished$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AdvisoryProjectionChart.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$3$1$1", m3645f = "AdvisoryProjectionChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$3$1$1 */
    static final class C92701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<ChartPoints> $chartPoints$delegate;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $glowingDotX;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C92701(Animatable<Float, AnimationVectors2> animatable, SnapshotState<ChartPoints> snapshotState, Continuation<? super C92701> continuation) {
            super(2, continuation);
            this.$glowingDotX = animatable;
            this.$chartPoints$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C92701(this.$glowingDotX, this.$chartPoints$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$glowingDotX;
                Float fBoxFloat = boxing.boxFloat(AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$18(this.$chartPoints$delegate).getMedianPoints().get(0).getX());
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, Easing3.getFastOutSlowInEasing(), 2, null);
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

    /* compiled from: AdvisoryProjectionChart.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$3$1$2", m3645f = "AdvisoryProjectionChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$3$1$2 */
    static final class C92712 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<ChartPoints> $chartPoints$delegate;
        final /* synthetic */ Animatable<Float, AnimationVectors2> $glowingDotY;
        final /* synthetic */ SnapshotState<Boolean> $isLoadingAnimationFinished$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C92712(Animatable<Float, AnimationVectors2> animatable, SnapshotState<ChartPoints> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super C92712> continuation) {
            super(2, continuation);
            this.$glowingDotY = animatable;
            this.$chartPoints$delegate = snapshotState;
            this.$isLoadingAnimationFinished$delegate = snapshotState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C92712(this.$glowingDotY, this.$chartPoints$delegate, this.$isLoadingAnimationFinished$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C92712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C92712 c92712;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable<Float, AnimationVectors2> animatable = this.$glowingDotY;
                Float fBoxFloat = boxing.boxFloat(AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$18(this.$chartPoints$delegate).getMedianPoints().get(0).getY());
                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(1000, 0, Easing3.getFastOutSlowInEasing(), 2, null);
                this.label = 1;
                c92712 = this;
                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpecTween$default, null, null, c92712, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c92712 = this;
            }
            AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$24(c92712.$isLoadingAnimationFinished$delegate, true);
            return Unit.INSTANCE;
        }
    }
}
