package com.robinhood.android.advisory.projection.chart;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotDoubleState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.frequency.SimulateDepositFrequency2;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsGraphContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsProjectionRangeContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Doubles2;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: AdvisoryProjectionChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$1$1", m3645f = "AdvisoryProjectionChart.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, 224, 225}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryProjectionChart2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $areValuesRelative;
    final /* synthetic */ SnapshotState<ChartPoints> $chartPoints$delegate;
    final /* synthetic */ SnapshotDoubleState2 $currentMaxValue$delegate;
    final /* synthetic */ BigDecimal $currentPortfolioValue;
    final /* synthetic */ SnapshotState<ProjectedValues> $currentValues$delegate;
    final /* synthetic */ SnapshotState4<ProjectedValues> $debouncedCurrentValues$delegate;
    final /* synthetic */ double $depositAmount;
    final /* synthetic */ SimulateDepositFrequency $depositFrequency;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<List<Double>> $gridIncrements$delegate;
    final /* synthetic */ SnapshotState<Boolean> $hasLoggedAppearEvent$delegate;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ int $numYears;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $progress;
    final /* synthetic */ ProjectedValues $values;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryProjectionChart2(boolean z, ProjectedValues projectedValues, BigDecimal bigDecimal, double d, boolean z2, SimulateDepositFrequency simulateDepositFrequency, EventLogger eventLogger, int i, Animatable<Float, AnimationVectors2> animatable, SnapshotState<Boolean> snapshotState, SnapshotState4<ProjectedValues> snapshotState4, SnapshotState<ProjectedValues> snapshotState2, SnapshotDoubleState2 snapshotDoubleState2, SnapshotState<List<Double>> snapshotState3, SnapshotState<ChartPoints> snapshotState5, Continuation<? super AdvisoryProjectionChart2> continuation) {
        super(2, continuation);
        this.$areValuesRelative = z;
        this.$values = projectedValues;
        this.$currentPortfolioValue = bigDecimal;
        this.$depositAmount = d;
        this.$isLoading = z2;
        this.$depositFrequency = simulateDepositFrequency;
        this.$eventLogger = eventLogger;
        this.$numYears = i;
        this.$progress = animatable;
        this.$hasLoggedAppearEvent$delegate = snapshotState;
        this.$debouncedCurrentValues$delegate = snapshotState4;
        this.$currentValues$delegate = snapshotState2;
        this.$currentMaxValue$delegate = snapshotDoubleState2;
        this.$gridIncrements$delegate = snapshotState3;
        this.$chartPoints$delegate = snapshotState5;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryProjectionChart2(this.$areValuesRelative, this.$values, this.$currentPortfolioValue, this.$depositAmount, this.$isLoading, this.$depositFrequency, this.$eventLogger, this.$numYears, this.$progress, this.$hasLoggedAppearEvent$delegate, this.$debouncedCurrentValues$delegate, this.$currentValues$delegate, this.$currentMaxValue$delegate, this.$gridIncrements$delegate, this.$chartPoints$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryProjectionChart2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0535, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, null, r7, r237, 4, null) != r8) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0500 A[PHI: r0 r12 r15 r16 r17
      0x0500: PHI (r0v19 com.robinhood.android.advisory.projection.chart.ChartPoints) = 
      (r0v18 com.robinhood.android.advisory.projection.chart.ChartPoints)
      (r0v30 com.robinhood.android.advisory.projection.chart.ChartPoints)
     binds: [B:50:0x04fd, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r12v3 androidx.compose.animation.core.Easing) = (r12v2 androidx.compose.animation.core.Easing), (r12v6 androidx.compose.animation.core.Easing) binds: [B:50:0x04fd, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r15v3 int) = (r15v2 int), (r15v6 int) binds: [B:50:0x04fd, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r16v3 float) = (r16v2 float), (r16v7 float) binds: [B:50:0x04fd, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0500: PHI (r17v3 float) = (r17v2 float), (r17v6 float) binds: [B:50:0x04fd, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0512 A[PHI: r0 r12 r15 r16
      0x0512: PHI (r0v20 com.robinhood.android.advisory.projection.chart.ChartPoints) = 
      (r0v19 com.robinhood.android.advisory.projection.chart.ChartPoints)
      (r0v32 com.robinhood.android.advisory.projection.chart.ChartPoints)
     binds: [B:53:0x050f, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0512: PHI (r12v4 androidx.compose.animation.core.Easing) = (r12v3 androidx.compose.animation.core.Easing), (r12v7 androidx.compose.animation.core.Easing) binds: [B:53:0x050f, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0512: PHI (r15v4 int) = (r15v3 int), (r15v7 int) binds: [B:53:0x050f, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x0512: PHI (r16v4 float) = (r16v3 float), (r16v8 float) binds: [B:53:0x050f, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        ChartPoints chartPoints;
        final ChartPoints chartPoints2;
        int i;
        Easing easing;
        final ChartPoints chartPoints3;
        Animatable<Float, AnimationVectors2> animatable;
        Float fBoxFloat;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            f = 1.0f;
            f2 = 0.0f;
            ProjectedValues absoluteValues = ChartUtils.toAbsoluteValues(this.$areValuesRelative, this.$values, this.$currentPortfolioValue, this.$depositAmount);
            if (absoluteValues.getMedians().isEmpty() || this.$isLoading) {
                return Unit.INSTANCE;
            }
            double maxValue = ChartUtils.getMaxValue(absoluteValues);
            ProjectedValues projectedValuesCopy$default = ProjectedValues.copy$default(absoluteValues, null, null, null, null, 15, null);
            if (!AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$26(this.$hasLoggedAppearEvent$delegate)) {
                EventLogger.DefaultImpls.logAppear$default(this.$eventLogger, UserInteractionEventData.Action.FETCH, new Screen(Screen.Name.ADVISORY_FUTURE_RETURNS, null, null, null, 14, null), new Component(Component.ComponentType.ADVANCED_CHART, "future_returns_chart", null, 4, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AdvisoryFutureReturnsGraphContext(this.$currentPortfolioValue.doubleValue(), SimulateDepositFrequency2.getEventIdentifier(this.$depositFrequency), this.$depositAmount, !projectedValuesCopy$default.getMedians().isEmpty() ? new AdvisoryFutureReturnsProjectionRangeContext(Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getPercentile5s().get(0).getValues())).doubleValue(), 2), Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getPercentile95s().get(0).getValues())).doubleValue(), 2), Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getMedians().get(0).getValues())).doubleValue(), 2), null, 8, null) : null, projectedValuesCopy$default.getMedians().size() >= 15 ? new AdvisoryFutureReturnsProjectionRangeContext(Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getPercentile5s().get(14).getValues())).doubleValue(), 2), Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getPercentile95s().get(14).getValues())).doubleValue(), 2), Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getMedians().get(14).getValues())).doubleValue(), 2), null, 8, null) : null, projectedValuesCopy$default.getMedians().size() >= 30 ? new AdvisoryFutureReturnsProjectionRangeContext(Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getPercentile5s().get(29).getValues())).doubleValue(), 2), Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getPercentile95s().get(29).getValues())).doubleValue(), 2), Doubles2.round(((Number) CollectionsKt.last((List) projectedValuesCopy$default.getMedians().get(29).getValues())).doubleValue(), 2), null, 8, null) : null, null, 64, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -131073, 16383, null), 8, null);
                AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$27(this.$hasLoggedAppearEvent$delegate, true);
            }
            List<Double> listMakeGridIncrements = ChartUtils.makeGridIncrements(this.$currentPortfolioValue.doubleValue(), maxValue);
            ChartPoints chartPointsCalculateChartPoints = ChartUtils.calculateChartPoints(ProjectedValues.copy$default(AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$9(this.$debouncedCurrentValues$delegate), null, ChartUtils.calculateMedianLineValues(AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$9(this.$debouncedCurrentValues$delegate).getMedians(), projectedValuesCopy$default.getMedians()), null, null, 13, null), this.$currentPortfolioValue.doubleValue(), this.$numYears, ((Number) CollectionsKt.first((List) listMakeGridIncrements)).doubleValue(), ((Number) CollectionsKt.last((List) listMakeGridIncrements)).doubleValue());
            this.$currentValues$delegate.setValue(projectedValuesCopy$default);
            this.$currentMaxValue$delegate.setDoubleValue(maxValue);
            this.$gridIncrements$delegate.setValue(listMakeGridIncrements);
            ChartPoints chartPointsCalculateChartPoints2 = ChartUtils.calculateChartPoints(projectedValuesCopy$default, this.$currentPortfolioValue.doubleValue(), this.$numYears, ((Number) CollectionsKt.first((List) listMakeGridIncrements)).doubleValue(), ((Number) CollectionsKt.last((List) listMakeGridIncrements)).doubleValue());
            if (AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$18(this.$chartPoints$delegate).getMedianPoints().size() != chartPointsCalculateChartPoints2.getMedianPoints().size()) {
                this.$chartPoints$delegate.setValue(ChartPoints.copy$default(chartPointsCalculateChartPoints2, null, null, null, null, 15, null));
                return Unit.INSTANCE;
            }
            chartPoints = chartPointsCalculateChartPoints2;
            Animatable<Float, AnimationVectors2> animatable2 = this.$progress;
            Float fBoxFloat2 = boxing.boxFloat(0.0f);
            this.L$0 = chartPointsCalculateChartPoints;
            this.L$1 = chartPoints;
            this.label = 1;
            if (animatable2.snapTo(fBoxFloat2, this) != coroutine_suspended) {
                chartPoints2 = chartPointsCalculateChartPoints;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            chartPoints = (ChartPoints) this.L$1;
            chartPoints2 = (ChartPoints) this.L$0;
            ResultKt.throwOnFailure(obj);
            f = 1.0f;
            f2 = 0.0f;
        } else {
            if (i2 == 2) {
                chartPoints3 = (ChartPoints) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = 0;
                easing = null;
                f = 1.0f;
                f2 = 0.0f;
                this.L$0 = chartPoints3;
                this.label = 3;
                if (DelayKt.delay(200L, this) != coroutine_suspended) {
                    animatable = this.$progress;
                    fBoxFloat = boxing.boxFloat(f2);
                    this.L$0 = chartPoints3;
                    this.label = 4;
                    if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                chartPoints3 = (ChartPoints) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = 0;
                easing = null;
                f = 1.0f;
                f2 = 0.0f;
                animatable = this.$progress;
                fBoxFloat = boxing.boxFloat(f2);
                this.L$0 = chartPoints3;
                this.label = 4;
                if (animatable.snapTo(fBoxFloat, this) != coroutine_suspended) {
                    Animatable<Float, AnimationVectors2> animatable3 = this.$progress;
                    Float fBoxFloat3 = boxing.boxFloat(f);
                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, i, easing, 6, easing);
                    final Animatable<Float, AnimationVectors2> animatable4 = this.$progress;
                    final SnapshotState<ChartPoints> snapshotState = this.$chartPoints$delegate;
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AdvisoryProjectionChart2.invokeSuspend$lambda$1(chartPoints3, animatable4, snapshotState, (Animatable) obj2);
                        }
                    };
                    this.L$0 = easing;
                    this.label = 5;
                }
                return coroutine_suspended;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            chartPoints3 = (ChartPoints) this.L$0;
            ResultKt.throwOnFailure(obj);
            i = 0;
            easing = null;
            f = 1.0f;
            Animatable<Float, AnimationVectors2> animatable32 = this.$progress;
            Float fBoxFloat32 = boxing.boxFloat(f);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(500, i, easing, 6, easing);
            final Animatable animatable42 = this.$progress;
            final SnapshotState snapshotState2 = this.$chartPoints$delegate;
            Function1 function12 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AdvisoryProjectionChart2.invokeSuspend$lambda$1(chartPoints3, animatable42, snapshotState2, (Animatable) obj2);
                }
            };
            this.L$0 = easing;
            this.label = 5;
        }
        ChartPoints chartPoints4 = chartPoints;
        Animatable<Float, AnimationVectors2> animatable5 = this.$progress;
        Float fBoxFloat4 = boxing.boxFloat(f);
        i = 0;
        TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        final Animatable<Float, AnimationVectors2> animatable6 = this.$progress;
        final SnapshotState<ChartPoints> snapshotState3 = this.$chartPoints$delegate;
        Function1 function13 = new Function1() { // from class: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AdvisoryProjectionChart2.invokeSuspend$lambda$0(chartPoints2, animatable6, snapshotState3, (Animatable) obj2);
            }
        };
        this.L$0 = chartPoints4;
        this.L$1 = null;
        this.label = 2;
        easing = null;
        if (Animatable.animateTo$default(animatable5, fBoxFloat4, tweenSpecTween$default3, null, function13, this, 4, null) != coroutine_suspended) {
            chartPoints3 = chartPoints4;
            this.L$0 = chartPoints3;
            this.label = 3;
            if (DelayKt.delay(200L, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ChartPoints chartPoints, Animatable animatable, SnapshotState snapshotState, Animatable animatable2) {
        snapshotState.setValue(ChartUtils.interpolateChartPoints(AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$18(snapshotState), chartPoints, ((Number) animatable.getValue()).floatValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ChartPoints chartPoints, Animatable animatable, SnapshotState snapshotState, Animatable animatable2) {
        snapshotState.setValue(ChartUtils.interpolateChartPoints(AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$18(snapshotState), chartPoints, ((Number) animatable.getValue()).floatValue()));
        return Unit.INSTANCE;
    }
}
