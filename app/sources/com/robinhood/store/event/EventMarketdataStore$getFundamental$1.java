package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.api.EventManagedMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventFundamental;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.MockFundamentalRequest;
import com.robinhood.utils.extensions.Uuids;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import retrofit2.Response;
import timber.log.Timber;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00030\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventFundamental;", "eventContractIds", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getFundamental$1", m3645f = "EventMarketdataStore.kt", m3646l = {77, 90}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class EventMarketdataStore$getFundamental$1 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventFundamental>>>>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getFundamental$1(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getFundamental$1> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getFundamental$1 eventMarketdataStore$getFundamental$1 = new EventMarketdataStore$getFundamental$1(this.this$0, continuation);
        eventMarketdataStore$getFundamental$1.L$0 = obj;
        return eventMarketdataStore$getFundamental$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super Response<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiEventFundamental>>>>> continuation) {
        return invoke2((List<UUID>) list, (Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventFundamental>>>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UUID> list, Continuation<? super Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventFundamental>>>>> continuation) {
        return ((EventMarketdataStore$getFundamental$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[EDGE_INSN: B:33:0x00c4->B:28:0x00c4 BREAK  A[LOOP:0: B:18:0x004f->B:35:?], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0093 -> B:18:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        EventMarketdataStore eventMarketdataStore;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = (List) this.L$0;
            if (this.this$0.targetBackend.isApollo()) {
                list2 = list;
                eventMarketdataStore = this.this$0;
                it = list.iterator();
            }
            EventMarketdataApi eventMarketdataApi = this.this$0.eventMarketdataApi;
            String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getFundamental$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Uuids.safeToString((UUID) obj2);
                }
            }, 30, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object fundamentals = eventMarketdataApi.getFundamentals(strJoinToString$default, this);
            return fundamentals != coroutine_suspended ? coroutine_suspended : fundamentals;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        it = (Iterator) this.L$2;
        eventMarketdataStore = (EventMarketdataStore) this.L$1;
        list2 = (List) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Exception e) {
            Timber.INSTANCE.mo3354e(e);
        }
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            EventManagedMarketdataApi eventManagedMarketdataApi = eventMarketdataStore.eventManagedMarketdataApi;
            int iNextInt = 500000 + new Random().nextInt(10000);
            Instant instantNow = Instant.now(eventMarketdataStore.clock);
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            MockFundamentalRequest mockFundamentalRequest = new MockFundamentalRequest(uuid, iNextInt, 0, instantNow, 4, null);
            this.L$0 = list2;
            this.L$1 = eventMarketdataStore;
            this.L$2 = it;
            this.label = 1;
            if (eventManagedMarketdataApi.mockFundamentals(mockFundamentalRequest, this) == coroutine_suspended) {
                break;
            }
        }
        list = list2;
        EventMarketdataApi eventMarketdataApi2 = this.this$0.eventMarketdataApi;
        String strJoinToString$default2 = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$getFundamental$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Uuids.safeToString((UUID) obj2);
            }
        }, 30, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object fundamentals2 = eventMarketdataApi2.getFundamentals(strJoinToString$default2, this);
        if (fundamentals2 != coroutine_suspended) {
        }
    }
}
