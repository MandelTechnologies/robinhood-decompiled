package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.shared.models.advancedChart.api.ApiTitledTechnicalIndicatorConfig;
import com.robinhood.shared.models.advancedChart.p386db.TechnicalIndicatorConfigList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "timestamp", "", "config", "Lcom/robinhood/shared/models/advancedChart/api/ApiTitledTechnicalIndicatorConfig;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$getAdvancedChartConfigEndpoint$2", m3645f = "AdvancedChartStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$getAdvancedChartConfigEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AdvancedChartStore3 extends ContinuationImpl7 implements Function3<Long, ApiTitledTechnicalIndicatorConfig, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartStore3(AdvancedChartStore advancedChartStore, Continuation<? super AdvancedChartStore3> continuation) {
        super(3, continuation);
        this.this$0 = advancedChartStore;
    }

    public final Object invoke(long j, ApiTitledTechnicalIndicatorConfig apiTitledTechnicalIndicatorConfig, Continuation<? super Unit> continuation) {
        AdvancedChartStore3 advancedChartStore3 = new AdvancedChartStore3(this.this$0, continuation);
        advancedChartStore3.J$0 = j;
        advancedChartStore3.L$0 = apiTitledTechnicalIndicatorConfig;
        return advancedChartStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Long l, ApiTitledTechnicalIndicatorConfig apiTitledTechnicalIndicatorConfig, Continuation<? super Unit> continuation) {
        return invoke(l.longValue(), apiTitledTechnicalIndicatorConfig, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TechnicalIndicatorConfigList technicalIndicatorConfigList = new TechnicalIndicatorConfigList(((ApiTitledTechnicalIndicatorConfig) this.L$0).toIndicatorConfigList(), this.J$0);
        this.this$0.indicatorDao.delete();
        this.this$0.indicatorDao.insert(technicalIndicatorConfigList);
        return Unit.INSTANCE;
    }
}
