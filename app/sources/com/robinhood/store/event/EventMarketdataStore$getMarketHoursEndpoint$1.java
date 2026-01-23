package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventMarketHours;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.store.event.EventMarketdataStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventMarketHours;", "param", "Lcom/robinhood/store/event/EventMarketdataStore$GetMarketHoursParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getMarketHoursEndpoint$1", m3645f = "EventMarketdataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventMarketdataStore$getMarketHoursEndpoint$1 extends ContinuationImpl7 implements Function2<EventMarketdataStore.GetMarketHoursParams, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiEventMarketHours>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getMarketHoursEndpoint$1(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getMarketHoursEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getMarketHoursEndpoint$1 eventMarketdataStore$getMarketHoursEndpoint$1 = new EventMarketdataStore$getMarketHoursEndpoint$1(this.this$0, continuation);
        eventMarketdataStore$getMarketHoursEndpoint$1.L$0 = obj;
        return eventMarketdataStore$getMarketHoursEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EventMarketdataStore.GetMarketHoursParams getMarketHoursParams, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiEventMarketHours>>> continuation) {
        return ((EventMarketdataStore$getMarketHoursEndpoint$1) create(getMarketHoursParams, continuation)).invokeSuspend(Unit.INSTANCE);
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
        EventMarketdataStore.GetMarketHoursParams getMarketHoursParams = (EventMarketdataStore.GetMarketHoursParams) this.L$0;
        EventMarketdataApi eventMarketdataApi = this.this$0.eventMarketdataApi;
        Instant datetime = getMarketHoursParams.getDatetime();
        ExchangeSource exchangeSource = getMarketHoursParams.getExchangeSource();
        String marketdataExchange = exchangeSource != null ? exchangeSource.getMarketdataExchange() : null;
        this.label = 1;
        Object marketHours = eventMarketdataApi.getMarketHours(datetime, marketdataExchange, this);
        return marketHours == coroutine_suspended ? coroutine_suspended : marketHours;
    }
}
