package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventGameData;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.models.event.p186db.dao.EventGameDataDao;
import com.robinhood.android.models.event.p186db.marketdata.EventGameData2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.Response;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00040\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventGameData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getEventGameDataEndpoint$2", m3645f = "EventMarketdataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class EventMarketdataStore$getEventGameDataEndpoint$2 extends ContinuationImpl7 implements Function2<Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventGameData>>>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getEventGameDataEndpoint$2(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getEventGameDataEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getEventGameDataEndpoint$2 eventMarketdataStore$getEventGameDataEndpoint$2 = new EventMarketdataStore$getEventGameDataEndpoint$2(this.this$0, continuation);
        eventMarketdataStore$getEventGameDataEndpoint$2.L$0 = obj;
        return eventMarketdataStore$getEventGameDataEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventGameData>>>> response, Continuation<? super Unit> continuation) {
        return invoke2((Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventGameData>>>>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventGameData>>>> response, Continuation<? super Unit> continuation) {
        return ((EventMarketdataStore$getEventGameDataEndpoint$2) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Collection collectionEmptyList;
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiMarketdataResponse apiMarketdataResponse = (ApiMarketdataResponse) ((Response) this.L$0).body();
        if (apiMarketdataResponse == null || (list = (List) apiMarketdataResponse.getData()) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            collectionEmptyList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApiEventGameData apiEventGameData = (ApiEventGameData) ((ApiMarketdataResponse) it.next()).getData();
                if (apiEventGameData != null) {
                    collectionEmptyList.add(apiEventGameData);
                }
            }
        }
        EventGameDataDao eventGameDataDao = this.this$0.eventGameDataDao;
        Collection collection = collectionEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(EventGameData2.toDbModel((ApiEventGameData) it2.next()));
        }
        eventGameDataDao.insert(arrayList);
        return Unit.INSTANCE;
    }
}
