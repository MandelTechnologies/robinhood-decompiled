package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.api.EventManagedMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventHistorical;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.MockHistoricalRequest;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.event.EventMarketdataStore;
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
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventHistorical;", "params", "Lcom/robinhood/store/event/EventMarketdataStore$HistoricalParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getHistorical$1", m3645f = "EventMarketdataStore.kt", m3646l = {147, 165}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class EventMarketdataStore$getHistorical$1 extends ContinuationImpl7 implements Function2<EventMarketdataStore.HistoricalParams, Continuation<? super List<? extends ApiEventHistorical>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getHistorical$1(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getHistorical$1> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getHistorical$1 eventMarketdataStore$getHistorical$1 = new EventMarketdataStore$getHistorical$1(this.this$0, continuation);
        eventMarketdataStore$getHistorical$1.L$0 = obj;
        return eventMarketdataStore$getHistorical$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(EventMarketdataStore.HistoricalParams historicalParams, Continuation<? super List<ApiEventHistorical>> continuation) {
        return ((EventMarketdataStore$getHistorical$1) create(historicalParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(EventMarketdataStore.HistoricalParams historicalParams, Continuation<? super List<? extends ApiEventHistorical>> continuation) {
        return invoke2(historicalParams, (Continuation<? super List<ApiEventHistorical>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (r15 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008a -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EventMarketdataStore.HistoricalParams historicalParams;
        EventMarketdataStore.HistoricalParams historicalParams2;
        EventMarketdataStore eventMarketdataStore;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            historicalParams = (EventMarketdataStore.HistoricalParams) this.L$0;
            if (this.this$0.targetBackend.isApollo()) {
                List<UUID> instrumentIds = historicalParams.getInstrumentIds();
                historicalParams2 = historicalParams;
                eventMarketdataStore = this.this$0;
                it = instrumentIds.iterator();
            }
            EventMarketdataApi eventMarketdataApi = this.this$0.eventMarketdataApi;
            String strJoinToString$default = CollectionsKt.joinToString$default(historicalParams.getInstrumentIds(), ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getHistorical$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Uuids.safeToString((UUID) obj2);
                }
            }, 30, null);
            Historical.Interval interval = historicalParams.getInterval();
            Instant start = historicalParams.getStart();
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = eventMarketdataApi.getHistoricals(strJoinToString$default, interval, start, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) ((ApiMarketdataResponse) obj).getData();
                if (list == null) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ApiEventHistorical apiEventHistorical = (ApiEventHistorical) ((ApiMarketdataResponse) it2.next()).getData();
                    if (apiEventHistorical != null) {
                        arrayList.add(apiEventHistorical);
                    }
                }
                return arrayList;
            }
            it = (Iterator) this.L$2;
            eventMarketdataStore = (EventMarketdataStore) this.L$1;
            historicalParams2 = (EventMarketdataStore.HistoricalParams) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Timber.INSTANCE.mo3354e(e);
            }
        }
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            EventManagedMarketdataApi eventManagedMarketdataApi = eventMarketdataStore.eventManagedMarketdataApi;
            MockHistoricalRequest mockHistoricalRequest = new MockHistoricalRequest(uuid, historicalParams2.getInterval(), historicalParams2.getStart(), new MockHistoricalRequest.PriceParams(0.5f, 0.01f, 5));
            this.L$0 = historicalParams2;
            this.L$1 = eventMarketdataStore;
            this.L$2 = it;
            this.label = 1;
            if (eventManagedMarketdataApi.mockHistoricals(mockHistoricalRequest, this) == coroutine_suspended) {
                break;
            }
        }
        historicalParams = historicalParams2;
        EventMarketdataApi eventMarketdataApi2 = this.this$0.eventMarketdataApi;
        String strJoinToString$default2 = CollectionsKt.joinToString$default(historicalParams.getInstrumentIds(), ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getHistorical$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Uuids.safeToString((UUID) obj2);
            }
        }, 30, null);
        Historical.Interval interval2 = historicalParams.getInterval();
        Instant start2 = historicalParams.getStart();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = eventMarketdataApi2.getHistoricals(strJoinToString$default2, interval2, start2, this);
    }
}
