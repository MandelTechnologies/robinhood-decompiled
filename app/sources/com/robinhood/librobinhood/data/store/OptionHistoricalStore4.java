package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.librobinhood.data.store.OptionHistoricalStore;
import com.robinhood.models.api.ApiOptionHistorical;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionHistoricalStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionHistorical;", "<destruct>", "Lcom/robinhood/librobinhood/data/store/OptionHistoricalStore$QueryParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionHistoricalStore$extendedHoursEndpoint$1", m3645f = "OptionHistoricalStore.kt", m3646l = {74}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionHistoricalStore$extendedHoursEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionHistoricalStore4 extends ContinuationImpl7 implements Function2<OptionHistoricalStore.QueryParams, Continuation<? super ApiOptionHistorical>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionHistoricalStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionHistoricalStore4(OptionHistoricalStore optionHistoricalStore, Continuation<? super OptionHistoricalStore4> continuation) {
        super(2, continuation);
        this.this$0 = optionHistoricalStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionHistoricalStore4 optionHistoricalStore4 = new OptionHistoricalStore4(this.this$0, continuation);
        optionHistoricalStore4.L$0 = obj;
        return optionHistoricalStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionHistoricalStore.QueryParams queryParams, Continuation<? super ApiOptionHistorical> continuation) {
        return ((OptionHistoricalStore4) create(queryParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        OptionHistoricalStore.QueryParams queryParams = (OptionHistoricalStore.QueryParams) this.L$0;
        UUID optionInstrumentId = queryParams.getOptionInstrumentId();
        GraphSelection graphSelection = queryParams.getGraphSelection();
        queryParams.getOptionChain();
        String serverValue = graphSelection.getIntervalForOptions().getServerValue();
        String serverValue2 = graphSelection.getSpanForOptions().getServerValue();
        String serverValue3 = Historical.Bounds.ADT_24_5.getServerValue();
        OptionsApi optionsApi = this.this$0.optionsApi;
        this.label = 1;
        Object optionHistorical = optionsApi.getOptionHistorical(optionInstrumentId, serverValue, serverValue2, serverValue3, this);
        return optionHistorical == coroutine_suspended ? coroutine_suspended : optionHistorical;
    }
}
