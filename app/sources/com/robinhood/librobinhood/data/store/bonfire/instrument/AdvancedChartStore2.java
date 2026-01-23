package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.shared.models.advancedChart.api.ApiTitledTechnicalIndicatorConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/models/advancedChart/api/ApiTitledTechnicalIndicatorConfig;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$getAdvancedChartConfigEndpoint$1", m3645f = "AdvancedChartStore.kt", m3646l = {39}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$getAdvancedChartConfigEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AdvancedChartStore2 extends ContinuationImpl7 implements Function2<Long, Continuation<? super ApiTitledTechnicalIndicatorConfig>, Object> {
    int label;
    final /* synthetic */ AdvancedChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartStore2(AdvancedChartStore advancedChartStore, Continuation<? super AdvancedChartStore2> continuation) {
        super(2, continuation);
        this.this$0 = advancedChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedChartStore2(this.this$0, continuation);
    }

    public final Object invoke(long j, Continuation<? super ApiTitledTechnicalIndicatorConfig> continuation) {
        return ((AdvancedChartStore2) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super ApiTitledTechnicalIndicatorConfig> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        InstrumentsApi instrumentsApi = this.this$0.instrumentsApi;
        this.label = 1;
        Object advancedChartConfig = instrumentsApi.getAdvancedChartConfig(this);
        return advancedChartConfig == coroutine_suspended ? coroutine_suspended : advancedChartConfig;
    }
}
