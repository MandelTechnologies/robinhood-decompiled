package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventHistorical;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventHistoricalDataPoint;
import com.robinhood.android.models.event.p186db.dao.EventHistoricalDao;
import com.robinhood.android.models.event.p186db.marketdata.EventHistorical;
import com.robinhood.android.models.event.p186db.marketdata.EventHistorical2;
import com.robinhood.android.models.event.p186db.marketdata.EventHistoricalDataPoint2;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import p479j$.time.Instant;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "historicals", "", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventHistorical;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$getHistorical$2", m3645f = "EventMarketdataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes12.dex */
final class EventMarketdataStore$getHistorical$2 extends ContinuationImpl7 implements Function2<List<? extends ApiEventHistorical>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ EventMarketdataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventMarketdataStore$getHistorical$2(EventMarketdataStore eventMarketdataStore, Continuation<? super EventMarketdataStore$getHistorical$2> continuation) {
        super(2, continuation);
        this.this$0 = eventMarketdataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EventMarketdataStore$getHistorical$2 eventMarketdataStore$getHistorical$2 = new EventMarketdataStore$getHistorical$2(this.this$0, continuation);
        eventMarketdataStore$getHistorical$2.L$0 = obj;
        return eventMarketdataStore$getHistorical$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiEventHistorical> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ApiEventHistorical>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ApiEventHistorical> list, Continuation<? super Unit> continuation) {
        return ((EventMarketdataStore$getHistorical$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r10.deleteOldHistorical(r4, r9) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        EventMarketdataStore eventMarketdataStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            list = (List) this.L$0;
            if (!this.this$0.cleanedOldHistoricals) {
                EventHistoricalDao eventHistoricalDao = this.this$0.eventHistoricalDao;
                Instant instantNow = Instant.now(this.this$0.clock);
                Duration.Companion companion = Duration.INSTANCE;
                Instant instantMinusMillis = instantNow.minusMillis(Duration.m28738getInWholeMillisecondsimpl(Duration3.toDuration(7, DurationUnitJvm.DAYS)));
                Intrinsics.checkNotNullExpressionValue(instantMinusMillis, "minusMillis(...)");
                this.L$0 = list;
                this.label = 1;
            }
            EventMarketdataStore eventMarketdataStore2 = this.this$0;
            it = list.iterator();
            eventMarketdataStore = eventMarketdataStore2;
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            eventMarketdataStore = (EventMarketdataStore) this.L$0;
            ResultKt.throwOnFailure(obj);
            while (it.hasNext()) {
                ApiEventHistorical apiEventHistorical = (ApiEventHistorical) it.next();
                EventHistorical dbModel = EventHistorical2.toDbModel(apiEventHistorical);
                EventHistoricalDao eventHistoricalDao2 = eventMarketdataStore.eventHistoricalDao;
                List<ApiEventHistoricalDataPoint> data_points = apiEventHistorical.getData_points();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data_points, 10));
                Iterator<T> it2 = data_points.iterator();
                while (it2.hasNext()) {
                    arrayList.add(EventHistoricalDataPoint2.toDbModel((ApiEventHistoricalDataPoint) it2.next(), dbModel.getId()));
                }
                this.L$0 = eventMarketdataStore;
                this.L$1 = it;
                this.label = 2;
                if (eventHistoricalDao2.insertHistorical(dbModel, arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        list = (List) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.this$0.cleanedOldHistoricals = true;
        EventMarketdataStore eventMarketdataStore22 = this.this$0;
        it = list.iterator();
        eventMarketdataStore = eventMarketdataStore22;
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}
