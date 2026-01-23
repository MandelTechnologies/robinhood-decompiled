package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.api.EventManagedMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.EventMarketdataApi;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventFundamental;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventGameData;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventHistorical;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventMarketHours;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventQuote;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiEventTradingSession;
import com.robinhood.android.eventcontracts.models.event.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.dao.EventFundamentalDao;
import com.robinhood.android.models.event.p186db.dao.EventGameDataDao;
import com.robinhood.android.models.event.p186db.dao.EventHistoricalDao;
import com.robinhood.android.models.event.p186db.dao.EventQuoteDao;
import com.robinhood.android.models.event.p186db.marketdata.EventFundamental;
import com.robinhood.android.models.event.p186db.marketdata.EventGameData;
import com.robinhood.android.models.event.p186db.marketdata.EventQuote;
import com.robinhood.android.models.event.p186db.marketdata.UiEventHistorical;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import com.robinhood.store.util.FlowUtils;
import com.robinhood.targetbackend.TargetBackend;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: EventMarketdataStore.kt */
@Metadata(m3635d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 `2\u00020\u0001:\u0005abcd`BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020$0#0\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b%\u0010&J7\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,J?\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002000#0\"2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020 ¢\u0006\u0004\b1\u00102J$\u00105\u001a\u0004\u0018\u0001042\b\b\u0002\u00103\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b5\u0010\u001cJ7\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002080#0\"2\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001d2\b\b\u0002\u0010/\u001a\u00020 ¢\u0006\u0004\b9\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR>\u0010F\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0\u001d0D0C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR:\u0010J\u001a(\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010 0I\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001d0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR&\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0\u001d0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010GR&\u0010R\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010KRL\u0010T\u001a:\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010-0I\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0D0\u001d0D0C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010GR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020U\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u001d0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010KR,\u0010X\u001a\u001a\u0012\u0004\u0012\u00020W\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0D0D0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010GR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002040Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R>\u0010]\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u001d\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0D0\u001d0D0C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010GR,\u0010_\u001a\u001a\u0012\u0004\u0012\u00020^\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002080#0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010K¨\u0006e"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/android/eventcontracts/models/event/api/EventMarketdataApi;", "eventMarketdataApi", "Lcom/robinhood/android/eventcontracts/models/event/api/EventManagedMarketdataApi;", "eventManagedMarketdataApi", "Lcom/robinhood/android/models/event/db/dao/EventFundamentalDao;", "eventFundamentalDao", "Lcom/robinhood/android/models/event/db/dao/EventHistoricalDao;", "eventHistoricalDao", "Lcom/robinhood/android/models/event/db/dao/EventQuoteDao;", "eventQuoteDao", "Lcom/robinhood/android/models/event/db/dao/EventGameDataDao;", "eventGameDataDao", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/android/eventcontracts/models/event/api/EventMarketdataApi;Lcom/robinhood/android/eventcontracts/models/event/api/EventManagedMarketdataApi;Lcom/robinhood/android/models/event/db/dao/EventFundamentalDao;Lcom/robinhood/android/models/event/db/dao/EventHistoricalDao;Lcom/robinhood/android/models/event/db/dao/EventQuoteDao;Lcom/robinhood/android/models/event/db/dao/EventGameDataDao;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "j$/time/Instant", InquiryField.DatetimeField.TYPE, "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "exchangeSource", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventMarketHours;", "getMarketHours", "(Lj$/time/Instant;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/util/UUID;", "eventContractIds", "j$/time/Duration", "overrideBackendPollDuration", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/db/marketdata/EventFundamental;", "streamFundamentals", "(Ljava/util/List;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "start", "Lcom/robinhood/android/models/event/db/marketdata/UiEventHistorical;", "streamHistoricals", "(Ljava/util/List;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "location", "defaultPollingDuration", "Lcom/robinhood/android/models/event/db/marketdata/EventQuote;", "streamQuotes", "(Ljava/util/List;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;Lj$/time/Duration;)Lkotlinx/coroutines/flow/Flow;", "now", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventTradingSession;", "getNextOpenTradingSession", "Lcom/robinhood/store/event/EventGameDataContext;", "eventAndHomeAndAwayIds", "Lcom/robinhood/android/models/event/db/marketdata/EventGameData;", "streamEventGameData", "Lcom/robinhood/targetbackend/TargetBackend;", "Lcom/robinhood/android/eventcontracts/models/event/api/EventMarketdataApi;", "Lcom/robinhood/android/eventcontracts/models/event/api/EventManagedMarketdataApi;", "Lcom/robinhood/android/models/event/db/dao/EventFundamentalDao;", "Lcom/robinhood/android/models/event/db/dao/EventHistoricalDao;", "Lcom/robinhood/android/models/event/db/dao/EventQuoteDao;", "Lcom/robinhood/android/models/event/db/dao/EventGameDataDao;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lretrofit2/Response;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiMarketdataResponse;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventFundamental;", "getFundamental", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lkotlin/Pair;", "queryFundamental", "Lcom/robinhood/android/moria/db/Query;", "", "cleanedOldHistoricals", "Z", "Lcom/robinhood/store/event/EventMarketdataStore$HistoricalParams;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventHistorical;", "getHistorical", "queryHistorical", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventQuote;", "getQuotes", "Lcom/robinhood/store/event/EventMarketdataStore$GetQuotesParams;", "queryQuotes", "Lcom/robinhood/store/event/EventMarketdataStore$GetMarketHoursParams;", "getMarketHoursEndpoint", "Ljava/util/concurrent/ConcurrentMap;", "cachedOpenTradingSessionByExchangeSource", "Ljava/util/concurrent/ConcurrentMap;", "Lcom/robinhood/android/eventcontracts/models/event/api/marketdata/ApiEventGameData;", "getEventGameDataEndpoint", "Lcom/robinhood/store/event/EventMarketdataStore$EventGameDataParams;", "queryEventGameData", "Companion", "HistoricalParams", "GetQuotesParams", "GetMarketHoursParams", "EventGameDataParams", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EventMarketdataStore extends Store {
    private static final long QUOTE_LIST_LOAD_TIMEOUT = 5000;
    private final ConcurrentMap<ExchangeSource, ApiEventTradingSession> cachedOpenTradingSessionByExchangeSource;
    private boolean cleanedOldHistoricals;
    private final Clock clock;
    private final EventFundamentalDao eventFundamentalDao;
    private final EventGameDataDao eventGameDataDao;
    private final EventHistoricalDao eventHistoricalDao;
    private final EventManagedMarketdataApi eventManagedMarketdataApi;
    private final EventMarketdataApi eventMarketdataApi;
    private final EventQuoteDao eventQuoteDao;
    private final Endpoint<List<EventGameDataContext>, Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventGameData>>>>> getEventGameDataEndpoint;
    private final Endpoint<List<UUID>, Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventFundamental>>>>> getFundamental;
    private final Endpoint<HistoricalParams, List<ApiEventHistorical>> getHistorical;
    private final Endpoint<GetMarketHoursParams, ApiMarketdataResponse<ApiMarketdataResponse<ApiEventMarketHours>>> getMarketHoursEndpoint;
    private final Endpoint<Tuples2<List<UUID>, MarketdataPollLocation>, Response<ApiMarketdataResponse<List<ApiMarketdataResponse<ApiEventQuote>>>>> getQuotes;
    private final Query<EventGameDataParams, Map<UUID, EventGameData>> queryEventGameData;
    private final Query<Tuples2<? extends List<UUID>, Duration>, List<EventFundamental>> queryFundamental;
    private final Query<HistoricalParams, List<UiEventHistorical>> queryHistorical;
    private final Query<GetQuotesParams, List<EventQuote>> queryQuotes;
    private final TargetBackend targetBackend;

    /* compiled from: EventMarketdataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore", m3645f = "EventMarketdataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "getMarketHours")
    /* renamed from: com.robinhood.store.event.EventMarketdataStore$getMarketHours$1 */
    static final class C413741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413741(Continuation<? super C413741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventMarketdataStore.this.getMarketHours(null, null, this);
        }
    }

    /* compiled from: EventMarketdataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore", m3645f = "EventMarketdataStore.kt", m3646l = {339}, m3647m = "getNextOpenTradingSession")
    /* renamed from: com.robinhood.store.event.EventMarketdataStore$getNextOpenTradingSession$1 */
    static final class C413751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C413751(Continuation<? super C413751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventMarketdataStore.this.getNextOpenTradingSession(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventMarketdataStore(TargetBackend targetBackend, EventMarketdataApi eventMarketdataApi, EventManagedMarketdataApi eventManagedMarketdataApi, EventFundamentalDao eventFundamentalDao, EventHistoricalDao eventHistoricalDao, EventQuoteDao eventQuoteDao, EventGameDataDao eventGameDataDao, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(eventMarketdataApi, "eventMarketdataApi");
        Intrinsics.checkNotNullParameter(eventManagedMarketdataApi, "eventManagedMarketdataApi");
        Intrinsics.checkNotNullParameter(eventFundamentalDao, "eventFundamentalDao");
        Intrinsics.checkNotNullParameter(eventHistoricalDao, "eventHistoricalDao");
        Intrinsics.checkNotNullParameter(eventQuoteDao, "eventQuoteDao");
        Intrinsics.checkNotNullParameter(eventGameDataDao, "eventGameDataDao");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.targetBackend = targetBackend;
        this.eventMarketdataApi = eventMarketdataApi;
        this.eventManagedMarketdataApi = eventManagedMarketdataApi;
        this.eventFundamentalDao = eventFundamentalDao;
        this.eventHistoricalDao = eventHistoricalDao;
        this.eventQuoteDao = eventQuoteDao;
        this.eventGameDataDao = eventGameDataDao;
        this.clock = clock;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getFundamental = Endpoint.Companion.create$default(companion, new EventMarketdataStore$getFundamental$1(this, null), getLogoutKillswitch(), new EventMarketdataStore$getFundamental$2(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.queryFundamental = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventFundamental", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryFundamental$lambda$1(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryFundamental$lambda$2(this.f$0, (Tuples2) obj);
            }
        }, false, 16, null);
        this.getHistorical = Endpoint.Companion.create$default(companion, new EventMarketdataStore$getHistorical$1(this, null), getLogoutKillswitch(), new EventMarketdataStore$getHistorical$2(this, null), storeBundle.getClock(), null, 16, null);
        this.queryHistorical = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventHistorical", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryHistorical$lambda$5(this.f$0, (EventMarketdataStore.HistoricalParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryHistorical$lambda$6(this.f$0, (EventMarketdataStore.HistoricalParams) obj);
            }
        }, false, 16, null);
        this.getQuotes = Endpoint.Companion.create$default(companion, new EventMarketdataStore$getQuotes$1(this, null), getLogoutKillswitch(), new EventMarketdataStore$getQuotes$2(this, null), storeBundle.getClock(), null, 16, null);
        this.queryQuotes = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventQuotes", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryQuotes$lambda$8(this.f$0, (EventMarketdataStore.GetQuotesParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryQuotes$lambda$9(this.f$0, (EventMarketdataStore.GetQuotesParams) obj);
            }
        }, false, 16, null);
        this.getMarketHoursEndpoint = Endpoint.Companion.create$default(companion, new EventMarketdataStore$getMarketHoursEndpoint$1(this, null), getLogoutKillswitch(), new EventMarketdataStore$getMarketHoursEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.cachedOpenTradingSessionByExchangeSource = new ConcurrentHashMap();
        this.getEventGameDataEndpoint = Endpoint.Companion.create$default(companion, new EventMarketdataStore$getEventGameDataEndpoint$1(this, null), getLogoutKillswitch(), new EventMarketdataStore$getEventGameDataEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.queryEventGameData = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryEventGameData", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryEventGameData$lambda$16(this.f$0, (EventMarketdataStore.EventGameDataParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventMarketdataStore.queryEventGameData$lambda$18(this.f$0, (EventMarketdataStore.EventGameDataParams) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryFundamental$lambda$1(EventMarketdataStore eventMarketdataStore, Tuples2 tuples2) {
        Flow flowPoll$default;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        List list = (List) tuples2.component1();
        Duration duration = (Duration) tuples2.component2();
        List<List> listChunked = CollectionsKt.chunked(list, 20);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        for (List list2 : listChunked) {
            if (duration == null) {
                flowPoll$default = Endpoint8.backendPoll$default(eventMarketdataStore.getFundamental, list2, null, null, 6, null);
            } else {
                flowPoll$default = Endpoint.DefaultImpls.poll$default(eventMarketdataStore.getFundamental, list2, duration, null, 4, null);
            }
            arrayList.add(flowPoll$default);
        }
        return FlowKt.merge(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryFundamental$lambda$2(EventMarketdataStore eventMarketdataStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return eventMarketdataStore.eventFundamentalDao.getFundamentals((List) tuples2.component1());
    }

    public static /* synthetic */ Flow streamFundamentals$default(EventMarketdataStore eventMarketdataStore, List list, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = null;
        }
        return eventMarketdataStore.streamFundamentals(list, duration);
    }

    public final Flow<Map<UUID, EventFundamental>> streamFundamentals(List<UUID> eventContractIds, Duration overrideBackendPollDuration) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.queryFundamental.asFlow(Tuples4.m3642to(eventContractIds, overrideBackendPollDuration)));
        return new Flow<Map<UUID, ? extends EventFundamental>>() { // from class: com.robinhood.store.event.EventMarketdataStore$streamFundamentals$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends EventFundamental>> flowCollector, Continuation continuation) {
                Object objCollect = flowDistinctUntilChanged.collect(new C413722(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventMarketdataStore$streamFundamentals$$inlined$map$1$2 */
            public static final class C413722<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$streamFundamentals$$inlined$map$1$2", m3645f = "EventMarketdataStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventMarketdataStore$streamFundamentals$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C413722.this.emit(null, this);
                    }
                }

                public C413722(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((EventFundamental) t).getInstrumentId(), t);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryHistorical$lambda$5(EventMarketdataStore eventMarketdataStore, HistoricalParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(eventMarketdataStore.getHistorical, params, params.getPollDuration(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryHistorical$lambda$6(EventMarketdataStore eventMarketdataStore, HistoricalParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return eventMarketdataStore.eventHistoricalDao.getEventHistoricals(params.getInstrumentIds(), params.getStart(), params.getInterval());
    }

    public final Flow<List<UiEventHistorical>> streamHistoricals(List<UUID> eventContractIds, Historical.Interval interval, Instant start) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(start, "start");
        return this.queryHistorical.asFlow(new HistoricalParams(eventContractIds, interval, start));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventMarketdataStore.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore$HistoricalParams;", "", "", "Ljava/util/UUID;", "instrumentIds", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "j$/time/Instant", "start", "<init>", "(Ljava/util/List;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/robinhood/models/ui/Historical$Interval;", "component3", "()Lj$/time/Instant;", "copy", "(Ljava/util/List;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;)Lcom/robinhood/store/event/EventMarketdataStore$HistoricalParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInstrumentIds", "Lcom/robinhood/models/ui/Historical$Interval;", "getInterval", "Lj$/time/Instant;", "getStart", "j$/time/Duration", "getPollDuration", "()Lj$/time/Duration;", "pollDuration", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class HistoricalParams {
        private final List<UUID> instrumentIds;
        private final Historical.Interval interval;
        private final Instant start;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HistoricalParams copy$default(HistoricalParams historicalParams, List list, Historical.Interval interval, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                list = historicalParams.instrumentIds;
            }
            if ((i & 2) != 0) {
                interval = historicalParams.interval;
            }
            if ((i & 4) != 0) {
                instant = historicalParams.start;
            }
            return historicalParams.copy(list, interval, instant);
        }

        public final List<UUID> component1() {
            return this.instrumentIds;
        }

        /* renamed from: component2, reason: from getter */
        public final Historical.Interval getInterval() {
            return this.interval;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getStart() {
            return this.start;
        }

        public final HistoricalParams copy(List<UUID> instrumentIds, Historical.Interval interval, Instant start) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(start, "start");
            return new HistoricalParams(instrumentIds, interval, start);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HistoricalParams)) {
                return false;
            }
            HistoricalParams historicalParams = (HistoricalParams) other;
            return Intrinsics.areEqual(this.instrumentIds, historicalParams.instrumentIds) && this.interval == historicalParams.interval && Intrinsics.areEqual(this.start, historicalParams.start);
        }

        public int hashCode() {
            return (((this.instrumentIds.hashCode() * 31) + this.interval.hashCode()) * 31) + this.start.hashCode();
        }

        public String toString() {
            return "HistoricalParams(instrumentIds=" + this.instrumentIds + ", interval=" + this.interval + ", start=" + this.start + ")";
        }

        public HistoricalParams(List<UUID> instrumentIds, Historical.Interval interval, Instant start) {
            Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(start, "start");
            this.instrumentIds = instrumentIds;
            this.interval = interval;
            this.start = start;
        }

        public final List<UUID> getInstrumentIds() {
            return this.instrumentIds;
        }

        public final Historical.Interval getInterval() {
            return this.interval;
        }

        public final Instant getStart() {
            return this.start;
        }

        public final Duration getPollDuration() {
            Duration durationDividedBy;
            Duration duration = this.interval.getDuration();
            if (duration != null && (durationDividedBy = duration.dividedBy(2L)) != null) {
                return durationDividedBy;
            }
            Duration durationOfSeconds = Duration.ofSeconds(150L);
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
            return durationOfSeconds;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryQuotes$lambda$8(EventMarketdataStore eventMarketdataStore, GetQuotesParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List listChunked = CollectionsKt.chunked(params.getEventContractIds(), 20);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        Iterator it = listChunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Endpoint8.backendPoll$default(eventMarketdataStore.getQuotes, Tuples4.m3642to((List) it.next(), params.getLocation()), params.getDefaultPollingDuration(), null, 4, null));
        }
        return FlowKt.merge(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryQuotes$lambda$9(EventMarketdataStore eventMarketdataStore, GetQuotesParams getQuotesParams) {
        Intrinsics.checkNotNullParameter(getQuotesParams, "<destruct>");
        return eventMarketdataStore.eventQuoteDao.getEventQuotes(getQuotesParams.component1());
    }

    public static /* synthetic */ Flow streamQuotes$default(EventMarketdataStore eventMarketdataStore, List list, MarketdataPollLocation marketdataPollLocation, Duration duration, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return eventMarketdataStore.streamQuotes(list, marketdataPollLocation, duration);
    }

    public final Flow<Map<UUID, EventQuote>> streamQuotes(final List<UUID> eventContractIds, MarketdataPollLocation location, Duration defaultPollingDuration) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(defaultPollingDuration, "defaultPollingDuration");
        final Flow flowFilterUntilTimeout = FlowUtils.filterUntilTimeout(FlowKt.distinctUntilChanged(this.queryQuotes.asFlow(new GetQuotesParams(eventContractIds, defaultPollingDuration, location))), 5000L, this.clock, new Function1() { // from class: com.robinhood.store.event.EventMarketdataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EventMarketdataStore.streamQuotes$lambda$10(eventContractIds, (List) obj));
            }
        });
        return new Flow<Map<UUID, ? extends EventQuote>>() { // from class: com.robinhood.store.event.EventMarketdataStore$streamQuotes$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends EventQuote>> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterUntilTimeout.collect(new C413732(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventMarketdataStore$streamQuotes$$inlined$map$1$2 */
            public static final class C413732<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventMarketdataStore$streamQuotes$$inlined$map$1$2", m3645f = "EventMarketdataStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventMarketdataStore$streamQuotes$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C413732.this.emit(null, this);
                    }
                }

                public C413732(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List list = (List) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                        for (T t : list) {
                            linkedHashMap.put(((EventQuote) t).getInstrumentId(), t);
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean streamQuotes$lambda$10(List list, List quotes) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        return list.size() == quotes.size();
    }

    /* compiled from: EventMarketdataStore.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore$GetQuotesParams;", "", "", "Ljava/util/UUID;", "eventContractIds", "j$/time/Duration", "defaultPollingDuration", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "location", "<init>", "(Ljava/util/List;Lj$/time/Duration;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;)V", "component1", "()Ljava/util/List;", "component2", "()Lj$/time/Duration;", "component3", "()Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "copy", "(Ljava/util/List;Lj$/time/Duration;Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;)Lcom/robinhood/store/event/EventMarketdataStore$GetQuotesParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEventContractIds", "Lj$/time/Duration;", "getDefaultPollingDuration", "Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "getLocation", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetQuotesParams {
        private final Duration defaultPollingDuration;
        private final List<UUID> eventContractIds;
        private final MarketdataPollLocation location;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetQuotesParams copy$default(GetQuotesParams getQuotesParams, List list, Duration duration, MarketdataPollLocation marketdataPollLocation, int i, Object obj) {
            if ((i & 1) != 0) {
                list = getQuotesParams.eventContractIds;
            }
            if ((i & 2) != 0) {
                duration = getQuotesParams.defaultPollingDuration;
            }
            if ((i & 4) != 0) {
                marketdataPollLocation = getQuotesParams.location;
            }
            return getQuotesParams.copy(list, duration, marketdataPollLocation);
        }

        public final List<UUID> component1() {
            return this.eventContractIds;
        }

        /* renamed from: component2, reason: from getter */
        public final Duration getDefaultPollingDuration() {
            return this.defaultPollingDuration;
        }

        /* renamed from: component3, reason: from getter */
        public final MarketdataPollLocation getLocation() {
            return this.location;
        }

        public final GetQuotesParams copy(List<UUID> eventContractIds, Duration defaultPollingDuration, MarketdataPollLocation location) {
            Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
            Intrinsics.checkNotNullParameter(defaultPollingDuration, "defaultPollingDuration");
            return new GetQuotesParams(eventContractIds, defaultPollingDuration, location);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetQuotesParams)) {
                return false;
            }
            GetQuotesParams getQuotesParams = (GetQuotesParams) other;
            return Intrinsics.areEqual(this.eventContractIds, getQuotesParams.eventContractIds) && Intrinsics.areEqual(this.defaultPollingDuration, getQuotesParams.defaultPollingDuration) && this.location == getQuotesParams.location;
        }

        public int hashCode() {
            int iHashCode = ((this.eventContractIds.hashCode() * 31) + this.defaultPollingDuration.hashCode()) * 31;
            MarketdataPollLocation marketdataPollLocation = this.location;
            return iHashCode + (marketdataPollLocation == null ? 0 : marketdataPollLocation.hashCode());
        }

        public String toString() {
            return "GetQuotesParams(eventContractIds=" + this.eventContractIds + ", defaultPollingDuration=" + this.defaultPollingDuration + ", location=" + this.location + ")";
        }

        public GetQuotesParams(List<UUID> eventContractIds, Duration defaultPollingDuration, MarketdataPollLocation marketdataPollLocation) {
            Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
            Intrinsics.checkNotNullParameter(defaultPollingDuration, "defaultPollingDuration");
            this.eventContractIds = eventContractIds;
            this.defaultPollingDuration = defaultPollingDuration;
            this.location = marketdataPollLocation;
        }

        public /* synthetic */ GetQuotesParams(List list, Duration duration, MarketdataPollLocation marketdataPollLocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, duration, (i & 4) != 0 ? null : marketdataPollLocation);
        }

        public final List<UUID> getEventContractIds() {
            return this.eventContractIds;
        }

        public final Duration getDefaultPollingDuration() {
            return this.defaultPollingDuration;
        }

        public final MarketdataPollLocation getLocation() {
            return this.location;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventMarketdataStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore$GetMarketHoursParams;", "", "j$/time/Instant", InquiryField.DatetimeField.TYPE, "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "exchangeSource", "<init>", "(Lj$/time/Instant;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "copy", "(Lj$/time/Instant;Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;)Lcom/robinhood/store/event/EventMarketdataStore$GetMarketHoursParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getDatetime", "Lcom/robinhood/android/models/event/db/arsenal/ExchangeSource;", "getExchangeSource", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetMarketHoursParams {
        private final Instant datetime;
        private final ExchangeSource exchangeSource;

        public static /* synthetic */ GetMarketHoursParams copy$default(GetMarketHoursParams getMarketHoursParams, Instant instant, ExchangeSource exchangeSource, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = getMarketHoursParams.datetime;
            }
            if ((i & 2) != 0) {
                exchangeSource = getMarketHoursParams.exchangeSource;
            }
            return getMarketHoursParams.copy(instant, exchangeSource);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getDatetime() {
            return this.datetime;
        }

        /* renamed from: component2, reason: from getter */
        public final ExchangeSource getExchangeSource() {
            return this.exchangeSource;
        }

        public final GetMarketHoursParams copy(Instant datetime, ExchangeSource exchangeSource) {
            return new GetMarketHoursParams(datetime, exchangeSource);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetMarketHoursParams)) {
                return false;
            }
            GetMarketHoursParams getMarketHoursParams = (GetMarketHoursParams) other;
            return Intrinsics.areEqual(this.datetime, getMarketHoursParams.datetime) && this.exchangeSource == getMarketHoursParams.exchangeSource;
        }

        public int hashCode() {
            Instant instant = this.datetime;
            int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
            ExchangeSource exchangeSource = this.exchangeSource;
            return iHashCode + (exchangeSource != null ? exchangeSource.hashCode() : 0);
        }

        public String toString() {
            return "GetMarketHoursParams(datetime=" + this.datetime + ", exchangeSource=" + this.exchangeSource + ")";
        }

        public GetMarketHoursParams(Instant instant, ExchangeSource exchangeSource) {
            this.datetime = instant;
            this.exchangeSource = exchangeSource;
        }

        public final Instant getDatetime() {
            return this.datetime;
        }

        public final ExchangeSource getExchangeSource() {
            return this.exchangeSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMarketHours(Instant instant, ExchangeSource exchangeSource, Continuation<? super ApiEventMarketHours> continuation) {
        C413741 c413741;
        if (continuation instanceof C413741) {
            c413741 = (C413741) continuation;
            int i = c413741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413741.label = i - Integer.MIN_VALUE;
            } else {
                c413741 = new C413741(continuation);
            }
        }
        C413741 c4137412 = c413741;
        Object objForceFetch$default = c4137412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4137412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<GetMarketHoursParams, ApiMarketdataResponse<ApiMarketdataResponse<ApiEventMarketHours>>> endpoint = this.getMarketHoursEndpoint;
            GetMarketHoursParams getMarketHoursParams = new GetMarketHoursParams(instant, exchangeSource);
            c4137412.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, getMarketHoursParams, null, c4137412, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        ApiMarketdataResponse apiMarketdataResponse = (ApiMarketdataResponse) ((ApiMarketdataResponse) objForceFetch$default).getData();
        if (apiMarketdataResponse != null) {
            return (ApiEventMarketHours) apiMarketdataResponse.getData();
        }
        return null;
    }

    static /* synthetic */ Object getMarketHours$default(EventMarketdataStore eventMarketdataStore, Instant instant, ExchangeSource exchangeSource, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = null;
        }
        if ((i & 2) != 0) {
            exchangeSource = null;
        }
        return eventMarketdataStore.getMarketHours(instant, exchangeSource, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNextOpenTradingSession(Instant instant, ExchangeSource exchangeSource, Continuation<? super ApiEventTradingSession> continuation) {
        C413751 c413751;
        Object next;
        if (continuation instanceof C413751) {
            c413751 = (C413751) continuation;
            int i = c413751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413751.label = i - Integer.MIN_VALUE;
            } else {
                c413751 = new C413751(continuation);
            }
        }
        Object marketHours = c413751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(marketHours);
            ApiEventTradingSession apiEventTradingSession = this.cachedOpenTradingSessionByExchangeSource.get(exchangeSource);
            if (apiEventTradingSession != null && instant.isBefore(apiEventTradingSession.getEndTime())) {
                return apiEventTradingSession;
            }
            c413751.L$0 = instant;
            c413751.L$1 = exchangeSource;
            c413751.label = 1;
            marketHours = getMarketHours(instant, exchangeSource, c413751);
            if (marketHours == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exchangeSource = (ExchangeSource) c413751.L$1;
            instant = (Instant) c413751.L$0;
            ResultKt.throwOnFailure(marketHours);
        }
        ApiEventMarketHours apiEventMarketHours = (ApiEventMarketHours) marketHours;
        if (apiEventMarketHours == null) {
            return null;
        }
        Iterator it = CollectionsKt.listOfNotNull((Object[]) new ApiEventTradingSession[]{apiEventMarketHours.getCurrentSession(), apiEventMarketHours.getNextSession()}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (instant.isBefore(((ApiEventTradingSession) next).getEndTime())) {
                break;
            }
        }
        ApiEventTradingSession apiEventTradingSession2 = (ApiEventTradingSession) next;
        if (apiEventTradingSession2 == null) {
            return null;
        }
        this.cachedOpenTradingSessionByExchangeSource.put(exchangeSource, apiEventTradingSession2);
        return apiEventTradingSession2;
    }

    public static /* synthetic */ Object getNextOpenTradingSession$default(EventMarketdataStore eventMarketdataStore, Instant instant, ExchangeSource exchangeSource, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now(eventMarketdataStore.clock);
        }
        return eventMarketdataStore.getNextOpenTradingSession(instant, exchangeSource, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventMarketdataStore.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/event/EventMarketdataStore$EventGameDataParams;", "", "", "Lcom/robinhood/store/event/EventGameDataContext;", "eventAndHomeAndAwayIds", "j$/time/Duration", "defaultPollingDuration", "<init>", "(Ljava/util/List;Lj$/time/Duration;)V", "component1", "()Ljava/util/List;", "component2", "()Lj$/time/Duration;", "copy", "(Ljava/util/List;Lj$/time/Duration;)Lcom/robinhood/store/event/EventMarketdataStore$EventGameDataParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEventAndHomeAndAwayIds", "Lj$/time/Duration;", "getDefaultPollingDuration", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class EventGameDataParams {
        private final Duration defaultPollingDuration;
        private final List<EventGameDataContext> eventAndHomeAndAwayIds;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventGameDataParams copy$default(EventGameDataParams eventGameDataParams, List list, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                list = eventGameDataParams.eventAndHomeAndAwayIds;
            }
            if ((i & 2) != 0) {
                duration = eventGameDataParams.defaultPollingDuration;
            }
            return eventGameDataParams.copy(list, duration);
        }

        public final List<EventGameDataContext> component1() {
            return this.eventAndHomeAndAwayIds;
        }

        /* renamed from: component2, reason: from getter */
        public final Duration getDefaultPollingDuration() {
            return this.defaultPollingDuration;
        }

        public final EventGameDataParams copy(List<EventGameDataContext> eventAndHomeAndAwayIds, Duration defaultPollingDuration) {
            Intrinsics.checkNotNullParameter(eventAndHomeAndAwayIds, "eventAndHomeAndAwayIds");
            Intrinsics.checkNotNullParameter(defaultPollingDuration, "defaultPollingDuration");
            return new EventGameDataParams(eventAndHomeAndAwayIds, defaultPollingDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventGameDataParams)) {
                return false;
            }
            EventGameDataParams eventGameDataParams = (EventGameDataParams) other;
            return Intrinsics.areEqual(this.eventAndHomeAndAwayIds, eventGameDataParams.eventAndHomeAndAwayIds) && Intrinsics.areEqual(this.defaultPollingDuration, eventGameDataParams.defaultPollingDuration);
        }

        public int hashCode() {
            return (this.eventAndHomeAndAwayIds.hashCode() * 31) + this.defaultPollingDuration.hashCode();
        }

        public String toString() {
            return "EventGameDataParams(eventAndHomeAndAwayIds=" + this.eventAndHomeAndAwayIds + ", defaultPollingDuration=" + this.defaultPollingDuration + ")";
        }

        public EventGameDataParams(List<EventGameDataContext> eventAndHomeAndAwayIds, Duration defaultPollingDuration) {
            Intrinsics.checkNotNullParameter(eventAndHomeAndAwayIds, "eventAndHomeAndAwayIds");
            Intrinsics.checkNotNullParameter(defaultPollingDuration, "defaultPollingDuration");
            this.eventAndHomeAndAwayIds = eventAndHomeAndAwayIds;
            this.defaultPollingDuration = defaultPollingDuration;
        }

        public final List<EventGameDataContext> getEventAndHomeAndAwayIds() {
            return this.eventAndHomeAndAwayIds;
        }

        public final Duration getDefaultPollingDuration() {
            return this.defaultPollingDuration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventGameData$lambda$16(EventMarketdataStore eventMarketdataStore, EventGameDataParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List listChunked = CollectionsKt.chunked(params.getEventAndHomeAndAwayIds(), 20);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listChunked, 10));
        Iterator it = listChunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Endpoint8.backendPoll$default(eventMarketdataStore.getEventGameDataEndpoint, (List) it.next(), params.getDefaultPollingDuration(), null, 4, null));
        }
        return FlowKt.merge(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEventGameData$lambda$18(EventMarketdataStore eventMarketdataStore, EventGameDataParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List<EventGameDataContext> eventAndHomeAndAwayIds = params.getEventAndHomeAndAwayIds();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eventAndHomeAndAwayIds, 10));
        Iterator<T> it = eventAndHomeAndAwayIds.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventGameDataContext) it.next()).getEventId());
        }
        return FlowKt.filterNotNull(eventMarketdataStore.eventGameDataDao.getEventGameData(arrayList));
    }

    public static /* synthetic */ Flow streamEventGameData$default(EventMarketdataStore eventMarketdataStore, List list, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = Duration.ofSeconds(1L);
        }
        return eventMarketdataStore.streamEventGameData(list, duration);
    }

    public final Flow<Map<UUID, EventGameData>> streamEventGameData(List<EventGameDataContext> eventAndHomeAndAwayIds, Duration defaultPollingDuration) {
        Intrinsics.checkNotNullParameter(eventAndHomeAndAwayIds, "eventAndHomeAndAwayIds");
        Intrinsics.checkNotNullParameter(defaultPollingDuration, "defaultPollingDuration");
        return FlowKt.distinctUntilChanged(this.queryEventGameData.asFlow(new EventGameDataParams(eventAndHomeAndAwayIds, defaultPollingDuration)));
    }
}
