package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.OneDayChartStore;
import com.robinhood.models.onedaycharts.api.ApiInstrumentOneDayChart;
import com.robinhood.models.onedaycharts.api.InstrumentApi;
import com.robinhood.models.onedaycharts.api.InstrumentType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OneDayChartStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/onedaycharts/api/ApiInstrumentOneDayChart;", "request", "Lcom/robinhood/librobinhood/data/store/OneDayChartStore$InstrumentOneDayChartRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OneDayChartStore$perpetualsOneDayChartEndpoint$1", m3645f = "OneDayChartStore.kt", m3646l = {103}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OneDayChartStore$perpetualsOneDayChartEndpoint$1 extends ContinuationImpl7 implements Function2<OneDayChartStore.InstrumentOneDayChartRequest, Continuation<? super ApiInstrumentOneDayChart>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OneDayChartStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneDayChartStore$perpetualsOneDayChartEndpoint$1(OneDayChartStore oneDayChartStore, Continuation<? super OneDayChartStore$perpetualsOneDayChartEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = oneDayChartStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OneDayChartStore$perpetualsOneDayChartEndpoint$1 oneDayChartStore$perpetualsOneDayChartEndpoint$1 = new OneDayChartStore$perpetualsOneDayChartEndpoint$1(this.this$0, continuation);
        oneDayChartStore$perpetualsOneDayChartEndpoint$1.L$0 = obj;
        return oneDayChartStore$perpetualsOneDayChartEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OneDayChartStore.InstrumentOneDayChartRequest instrumentOneDayChartRequest, Continuation<? super ApiInstrumentOneDayChart> continuation) {
        return ((OneDayChartStore$perpetualsOneDayChartEndpoint$1) create(instrumentOneDayChartRequest, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OneDayChartStore.InstrumentOneDayChartRequest instrumentOneDayChartRequest = (OneDayChartStore.InstrumentOneDayChartRequest) this.L$0;
        InstrumentApi instrumentApi = this.this$0.instrumentApi;
        InstrumentType instrumentType = InstrumentType.CRYPTO_PERPETUALS;
        UUID instrumentId = instrumentOneDayChartRequest.getInstrumentId();
        this.label = 1;
        Object instrumentOneDayChart = instrumentApi.getInstrumentOneDayChart(instrumentId, instrumentType, false, this);
        return instrumentOneDayChart == coroutine_suspended ? coroutine_suspended : instrumentOneDayChart;
    }
}
