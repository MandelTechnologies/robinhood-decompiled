package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventGameData;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.utils.extensions.Uuids;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00030\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventGameData;", "param", "Lcom/robinhood/store/event/EventGameDataContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getEventGameDataEndpoint$1", m3645f = "EventMarketdataStore.kt", m3646l = {370}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class EventMarketdataStore$getEventGameDataEndpoint$1 extends ContinuationImpl7 implements Function2<List<? extends EventGameDataContext>, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventGameData>>>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getEventGameDataEndpoint$1(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getEventGameDataEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getEventGameDataEndpoint$1 eventMarketdataStore$getEventGameDataEndpoint$1 = new EventMarketdataStore$getEventGameDataEndpoint$1(this.this$0, continuation);
        eventMarketdataStore$getEventGameDataEndpoint$1.L$0 = obj;
        return eventMarketdataStore$getEventGameDataEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends EventGameDataContext> list, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventGameData>>>>> continuation) {
        return invoke2((List<EventGameDataContext>) list, (Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventGameData>>>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<EventGameDataContext> list, Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventGameData>>>>> continuation) {
        return ((EventMarketdataStore$getEventGameDataEndpoint$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
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
        List list = (List) this.L$0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventGameDataContext) it.next()).getEventId());
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getEventGameDataEndpoint$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Uuids.safeToString((UUID) obj2);
            }
        }, 30, null);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((EventGameDataContext) it2.next()).getHomeId());
        }
        String strJoinToString$default2 = CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getEventGameDataEndpoint$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Uuids.safeToString((UUID) obj2);
            }
        }, 30, null);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((EventGameDataContext) it3.next()).getAwayId());
        }
        String strJoinToString$default3 = CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getEventGameDataEndpoint$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Uuids.safeToString((UUID) obj2);
            }
        }, 30, null);
        EventMarketdataApi eventMarketdataApi = this.this$0.eventMarketdataApi;
        this.label = 1;
        Object gameLiveData = eventMarketdataApi.getGameLiveData(strJoinToString$default2, strJoinToString$default3, strJoinToString$default, this);
        return gameLiveData == coroutine_suspended ? coroutine_suspended : gameLiveData;
    }
}
