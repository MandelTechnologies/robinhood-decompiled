package com.robinhood.android.advisory.projection.chart;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.advisory.p304db.projection.ProjectedValues;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryProjectionChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$2$1", m3645f = "AdvisoryProjectionChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.projection.chart.AdvisoryProjectionChartKt$AdvisoryProjectionChart$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryProjectionChart3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ProjectedValues> $currentValues$delegate;
    final /* synthetic */ HapticFeedback $hapticFeedback;
    final /* synthetic */ Function2<Integer, EndOfYearProjectionValue, Unit> $onYearSelected;
    final /* synthetic */ SnapshotIntState2 $selectedYear$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdvisoryProjectionChart3(Function2<? super Integer, ? super EndOfYearProjectionValue, Unit> function2, HapticFeedback hapticFeedback, SnapshotState<ProjectedValues> snapshotState, SnapshotIntState2 snapshotIntState2, Continuation<? super AdvisoryProjectionChart3> continuation) {
        super(2, continuation);
        this.$onYearSelected = function2;
        this.$hapticFeedback = hapticFeedback;
        this.$currentValues$delegate = snapshotState;
        this.$selectedYear$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryProjectionChart3(this.$onYearSelected, this.$hapticFeedback, this.$currentValues$delegate, this.$selectedYear$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryProjectionChart3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$7(this.$currentValues$delegate).getMedians().isEmpty()) {
                return Unit.INSTANCE;
            }
            this.$onYearSelected.invoke(boxing.boxInt(this.$selectedYear$delegate.getIntValue()), new EndOfYearProjectionValue(((Number) CollectionsKt.last((List) AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$7(this.$currentValues$delegate).getPercentile5s().get(this.$selectedYear$delegate.getIntValue() - 1).getValues())).doubleValue(), ((Number) CollectionsKt.last((List) AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$7(this.$currentValues$delegate).getMedians().get(this.$selectedYear$delegate.getIntValue() - 1).getValues())).doubleValue(), ((Number) CollectionsKt.last((List) AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$7(this.$currentValues$delegate).getPercentile95s().get(this.$selectedYear$delegate.getIntValue() - 1).getValues())).doubleValue(), ((Number) CollectionsKt.last((List) AdvisoryProjectionChart.AdvisoryProjectionChart$lambda$7(this.$currentValues$delegate).getNetDeposits().get(this.$selectedYear$delegate.getIntValue() - 1).getValues())).doubleValue()));
            this.$hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
