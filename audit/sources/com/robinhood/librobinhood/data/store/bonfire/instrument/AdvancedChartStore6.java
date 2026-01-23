package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.librobinhood.data.store.bonfire.api.InstrumentsApi;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicatorConfigRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvancedChartStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicatorConfigRequest;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$postAdvancedChartConfigEndpoint$1", m3645f = "AdvancedChartStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.AdvancedChartStore$postAdvancedChartConfigEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class AdvancedChartStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends ApiTechnicalIndicatorConfigRequest, ? extends Long>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedChartStore6(AdvancedChartStore advancedChartStore, Continuation<? super AdvancedChartStore6> continuation) {
        super(2, continuation);
        this.this$0 = advancedChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedChartStore6 advancedChartStore6 = new AdvancedChartStore6(this.this$0, continuation);
        advancedChartStore6.L$0 = obj;
        return advancedChartStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiTechnicalIndicatorConfigRequest, ? extends Long> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiTechnicalIndicatorConfigRequest, Long>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiTechnicalIndicatorConfigRequest, Long> tuples2, Continuation<? super Unit> continuation) {
        return ((AdvancedChartStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiTechnicalIndicatorConfigRequest apiTechnicalIndicatorConfigRequest = (ApiTechnicalIndicatorConfigRequest) ((Tuples2) this.L$0).component1();
            InstrumentsApi instrumentsApi = this.this$0.instrumentsApi;
            this.label = 1;
            if (instrumentsApi.updateAdvancedChartConfig(apiTechnicalIndicatorConfigRequest, this) == coroutine_suspended) {
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
