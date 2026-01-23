package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventMarketHours;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getMarketHoursEndpoint$2", m3645f = "EventMarketdataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventMarketdataStore$getMarketHoursEndpoint$2 extends ContinuationImpl7 implements Function2<ApiMarketdataResponse<ApiMarketdataResponse<ApiEventMarketHours>>, Continuation<? super Unit>, Object> {
    int label;

    EventMarketdataStore$getMarketHoursEndpoint$2(Continuation<? super EventMarketdataStore$getMarketHoursEndpoint$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EventMarketdataStore$getMarketHoursEndpoint$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarketdataResponse<ApiMarketdataResponse<ApiEventMarketHours>> apiMarketdataResponse, Continuation<? super Unit> continuation) {
        return ((EventMarketdataStore$getMarketHoursEndpoint$2) create(apiMarketdataResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
