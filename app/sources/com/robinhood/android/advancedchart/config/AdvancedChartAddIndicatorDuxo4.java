package com.robinhood.android.advancedchart.config;

import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartAddIndicatorDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advancedchart/config/AdvancedChartAddIndicatorDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$onResume$3$1", m3645f = "AdvancedChartAddIndicatorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartAddIndicatorDuxo$onResume$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AdvancedChartAddIndicatorDuxo4 extends ContinuationImpl7 implements Function2<AdvancedChartAddIndicatorDataState, Continuation<? super AdvancedChartAddIndicatorDataState>, Object> {
    final /* synthetic */ AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant $variant;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartAddIndicatorDuxo4(AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant variant, Continuation<? super AdvancedChartAddIndicatorDuxo4> continuation) {
        super(2, continuation);
        this.$variant = variant;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedChartAddIndicatorDuxo4 advancedChartAddIndicatorDuxo4 = new AdvancedChartAddIndicatorDuxo4(this.$variant, continuation);
        advancedChartAddIndicatorDuxo4.L$0 = obj;
        return advancedChartAddIndicatorDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdvancedChartAddIndicatorDataState advancedChartAddIndicatorDataState, Continuation<? super AdvancedChartAddIndicatorDataState> continuation) {
        return ((AdvancedChartAddIndicatorDuxo4) create(advancedChartAddIndicatorDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AdvancedChartAddIndicatorDataState advancedChartAddIndicatorDataState = (AdvancedChartAddIndicatorDataState) this.L$0;
        AdvancedChartExperiments.ChartsIndicatorImprovementP4.Variant variant = this.$variant;
        Intrinsics.checkNotNull(variant);
        return AdvancedChartAddIndicatorDataState.copy$default(advancedChartAddIndicatorDataState, null, null, null, variant, 7, null);
    }
}
