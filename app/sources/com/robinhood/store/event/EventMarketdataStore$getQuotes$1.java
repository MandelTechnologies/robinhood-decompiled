package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventQuote;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import com.robinhood.utils.extensions.Uuids;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00030\u00020\u00012\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventQuote;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getQuotes$1", m3645f = "EventMarketdataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class EventMarketdataStore$getQuotes$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends List<? extends UUID>, ? extends MarketdataPollLocation>, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventQuote>>>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getQuotes$1(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getQuotes$1> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getQuotes$1 eventMarketdataStore$getQuotes$1 = new EventMarketdataStore$getQuotes$1(this.this$0, continuation);
        eventMarketdataStore$getQuotes$1.L$0 = obj;
        return eventMarketdataStore$getQuotes$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends List<? extends UUID>, ? extends MarketdataPollLocation> tuples2, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventQuote>>>>> continuation) {
        return invoke2((Tuples2<? extends List<UUID>, ? extends MarketdataPollLocation>) tuples2, (Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventQuote>>>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends List<UUID>, ? extends MarketdataPollLocation> tuples2, Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventQuote>>>>> continuation) {
        return ((EventMarketdataStore$getQuotes$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Tuples2 tuples2 = (Tuples2) this.L$0;
        List list = (List) tuples2.component1();
        MarketdataPollLocation marketdataPollLocation = (MarketdataPollLocation) tuples2.component2();
        EventMarketdataApi eventMarketdataApi = this.this$0.eventMarketdataApi;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getQuotes$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Uuids.safeToString((UUID) obj2);
            }
        }, 30, null);
        String serverValue = marketdataPollLocation != null ? marketdataPollLocation.getServerValue() : null;
        this.label = 1;
        Object quotes = eventMarketdataApi.getQuotes(strJoinToString$default, serverValue, this);
        return quotes == coroutine_suspended ? coroutine_suspended : quotes;
    }
}
