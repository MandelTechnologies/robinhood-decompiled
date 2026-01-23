package com.robinhood.store.futures.marketdata;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.lib.api.futures.FuturesManagedMarketdataApi;
import com.robinhood.android.lib.api.futures.FuturesMarketdataApi;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesClosePrices;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesClosesRange;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesFundamentals;
import com.robinhood.android.models.futures.api.marketdata.ApiFuturesHistorical;
import com.robinhood.android.models.futures.api.marketdata.ApiMarketdataResponse;
import com.robinhood.android.models.futures.api.marketdata.MockFundamentalsRequest;
import com.robinhood.android.models.futures.api.marketdata.MockHistoricalRequest;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.models.futures.marketdata.dao.FuturesClosePricesDao;
import com.robinhood.android.models.futures.marketdata.dao.FuturesClosesRangeDao;
import com.robinhood.android.models.futures.marketdata.dao.FuturesFundamentalsDao;
import com.robinhood.android.models.futures.marketdata.dao.FuturesHistoricalDao;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices3;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange2;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesFundamentals;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesFundamentals2;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.marketdata.p191db.UiFuturesHistorical;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.TemporalAmount;
import timber.log.Timber;

/* compiled from: FuturesMarketDataStore.kt */
@Metadata(m3635d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002abBY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b#\u0010$J\u0018\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J5\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010&\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u00100J5\u00102\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00101\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010*¢\u0006\u0004\b2\u00100J\u001b\u00104\u001a\b\u0012\u0004\u0012\u0002030-2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b4\u00105J'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203060-2\f\u00107\u001a\b\u0012\u0004\u0012\u00020%06¢\u0006\u0004\b8\u00109J3\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:060-2\u0006\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010*¢\u0006\u0004\b;\u0010<J%\u0010>\u001a\b\u0012\u0004\u0012\u00020:0-2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010=\u001a\u00020*¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020@0-2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\bA\u00105J'\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@060-2\f\u00107\u001a\b\u0012\u0004\u0012\u00020%06¢\u0006\u0004\bB\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR&\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020P060O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR&\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020P060O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020.0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020.0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010VR,\u00104\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020%06\u0012\n\u0012\b\u0012\u0004\u0012\u00020X060O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010RR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u0002030T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010VR,\u0010Z\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020%06\u0012\n\u0012\b\u0012\u0004\u0012\u000203060T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010VR&\u0010;\u001a\u0014\u0012\u0004\u0012\u00020[\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\060O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010RR&\u0010]\u001a\u0014\u0012\u0004\u0012\u00020[\u0012\n\u0012\b\u0012\u0004\u0012\u00020:060T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010VR,\u0010A\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020%06\u0012\n\u0012\b\u0012\u0004\u0012\u00020^060O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010RR \u0010_\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020@0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010VR,\u0010`\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020%06\u0012\n\u0012\b\u0012\u0004\u0012\u00020@060T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010V¨\u0006c"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/targetbackend/TargetBackend;", "targetBackend", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "futuresProductStore", "Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;", "futuresManagedMarketdataApi", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "futuresMarketdataApi", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "futuresQuoteStore", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosePricesDao;", "closePricesDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosesRangeDao;", "closesRangeDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesFundamentalsDao;", "fundamentalsDao", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesHistoricalDao;", "historicalDao", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/store/futures/arsenal/FuturesProductStore;Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosePricesDao;Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosesRangeDao;Lcom/robinhood/android/models/futures/marketdata/dao/FuturesFundamentalsDao;Lcom/robinhood/android/models/futures/marketdata/dao/FuturesHistoricalDao;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/models/ui/Historical$Interval;", "j$/time/Duration", "toPollDuration", "(Lcom/robinhood/models/ui/Historical$Interval;)Lj$/time/Duration;", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$HistoricalParams;", "params", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "quote", "", "seedContractHistoricalIfApplicable", "(Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$HistoricalParams;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "seedProductHistoricalIfApplicable", "(Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$HistoricalParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "contractId", "seedFundamentalsIfApplicable", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interval", "j$/time/Instant", "start", "end", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/marketdata/db/UiFuturesHistorical;", "streamContractHistorical", "(Ljava/util/UUID;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "productId", "streamProductHistorical", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "getClosePrices", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "", "contractIds", "getMultipleClosePrices", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosesRange;", "getClosesRange", "(Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "time", "getEffectiveClosesRange", "(Ljava/util/UUID;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesFundamentals;", "getFundamentals", "getFundamentalsList", "Lcom/robinhood/targetbackend/TargetBackend;", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "Lcom/robinhood/android/lib/api/futures/FuturesManagedMarketdataApi;", "Lcom/robinhood/android/lib/api/futures/FuturesMarketdataApi;", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosePricesDao;", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesClosesRangeDao;", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesFundamentalsDao;", "Lcom/robinhood/android/models/futures/marketdata/dao/FuturesHistoricalDao;", "", "cleanedOldHistoricals", "Z", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesHistorical;", "getContractHistorical", "Lcom/robinhood/android/moria/network/Endpoint;", "getProductHistorical", "Lcom/robinhood/android/moria/db/Query;", "queryContractHistorical", "Lcom/robinhood/android/moria/db/Query;", "queryProductHistorical", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosePrices;", "queryClosePrices", "queryMultipleClosePrices", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$ClosesRangeArgs;", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosesRange;", "queryClosesRange", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesFundamentals;", "queryFundamentals", "queryFundamentalsList", "HistoricalParams", "ClosesRangeArgs", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesMarketDataStore extends Store {
    private boolean cleanedOldHistoricals;
    private final FuturesClosePricesDao closePricesDao;
    private final FuturesClosesRangeDao closesRangeDao;
    private final FuturesFundamentalsDao fundamentalsDao;
    private final FuturesManagedMarketdataApi futuresManagedMarketdataApi;
    private final FuturesMarketdataApi futuresMarketdataApi;
    private final FuturesProductStore futuresProductStore;
    private final FuturesQuoteStore futuresQuoteStore;
    private final Endpoint<List<UUID>, List<ApiFuturesClosePrices>> getClosePrices;
    private final Endpoint<ClosesRangeArgs, List<ApiFuturesClosesRange>> getClosesRange;
    private final Endpoint<HistoricalParams, List<ApiFuturesHistorical>> getContractHistorical;
    private final Endpoint<List<UUID>, List<ApiFuturesFundamentals>> getFundamentals;
    private final Endpoint<HistoricalParams, List<ApiFuturesHistorical>> getProductHistorical;
    private final FuturesHistoricalDao historicalDao;
    private final Query<UUID, FuturesClosePrices> queryClosePrices;
    private final Query<ClosesRangeArgs, List<FuturesClosesRange>> queryClosesRange;
    private final Query<HistoricalParams, UiFuturesHistorical> queryContractHistorical;
    private final Query<UUID, FuturesFundamentals> queryFundamentals;
    private final Query<List<UUID>, List<FuturesFundamentals>> queryFundamentalsList;
    private final Query<List<UUID>, List<FuturesClosePrices>> queryMultipleClosePrices;
    private final Query<HistoricalParams, UiFuturesHistorical> queryProductHistorical;
    private final TargetBackend targetBackend;

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore", m3645f = "FuturesMarketDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC7081g.f2773x8d9721ad}, m3647m = "seedContractHistoricalIfApplicable")
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedContractHistoricalIfApplicable$1 */
    static final class C415131 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C415131(Continuation<? super C415131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesMarketDataStore.this.seedContractHistoricalIfApplicable(null, null, this);
        }
    }

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore", m3645f = "FuturesMarketDataStore.kt", m3646l = {472}, m3647m = "seedFundamentalsIfApplicable")
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedFundamentalsIfApplicable$1 */
    static final class C415151 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C415151(Continuation<? super C415151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesMarketDataStore.this.seedFundamentalsIfApplicable(null, this);
        }
    }

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore", m3645f = "FuturesMarketDataStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, 224}, m3647m = "seedProductHistoricalIfApplicable")
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$seedProductHistoricalIfApplicable$1 */
    static final class C415161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C415161(Continuation<? super C415161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesMarketDataStore.this.seedProductHistoricalIfApplicable(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesMarketDataStore(TargetBackend targetBackend, FuturesProductStore futuresProductStore, FuturesManagedMarketdataApi futuresManagedMarketdataApi, FuturesMarketdataApi futuresMarketdataApi, FuturesQuoteStore futuresQuoteStore, FuturesClosePricesDao closePricesDao, FuturesClosesRangeDao closesRangeDao, FuturesFundamentalsDao fundamentalsDao, FuturesHistoricalDao historicalDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(futuresProductStore, "futuresProductStore");
        Intrinsics.checkNotNullParameter(futuresManagedMarketdataApi, "futuresManagedMarketdataApi");
        Intrinsics.checkNotNullParameter(futuresMarketdataApi, "futuresMarketdataApi");
        Intrinsics.checkNotNullParameter(futuresQuoteStore, "futuresQuoteStore");
        Intrinsics.checkNotNullParameter(closePricesDao, "closePricesDao");
        Intrinsics.checkNotNullParameter(closesRangeDao, "closesRangeDao");
        Intrinsics.checkNotNullParameter(fundamentalsDao, "fundamentalsDao");
        Intrinsics.checkNotNullParameter(historicalDao, "historicalDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.targetBackend = targetBackend;
        this.futuresProductStore = futuresProductStore;
        this.futuresManagedMarketdataApi = futuresManagedMarketdataApi;
        this.futuresMarketdataApi = futuresMarketdataApi;
        this.futuresQuoteStore = futuresQuoteStore;
        this.closePricesDao = closePricesDao;
        this.closesRangeDao = closesRangeDao;
        this.fundamentalsDao = fundamentalsDao;
        this.historicalDao = historicalDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.getContractHistorical = Endpoint.Companion.create$default(companion, new FuturesMarketDataStore2(this, null), getLogoutKillswitch(), new FuturesMarketDataStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getProductHistorical = Endpoint.Companion.create$default(companion, new FuturesMarketDataStore4(this, null), getLogoutKillswitch(), new FuturesMarketDataStore5(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.queryContractHistorical = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryContractHistorical", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryContractHistorical$lambda$0(this.f$0, (FuturesMarketDataStore.HistoricalParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryContractHistorical$lambda$1(this.f$0, (FuturesMarketDataStore.HistoricalParams) obj);
            }
        }, false, 16, null);
        this.queryProductHistorical = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryProductHistorical", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryProductHistorical$lambda$2(this.f$0, (FuturesMarketDataStore.HistoricalParams) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryProductHistorical$lambda$3(this.f$0, (FuturesMarketDataStore.HistoricalParams) obj);
            }
        }, false, 16, null);
        C415071 c415071 = new C415071(null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        C415082 c415082 = new C415082(null);
        Clock clock = storeBundle.getClock();
        Duration durationOfSeconds = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        this.getClosePrices = companion.create(c415071, logoutKillswitch, c415082, clock, new DefaultStaleDecider(durationOfSeconds, storeBundle.getClock()));
        this.queryClosePrices = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesClosePrices", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryClosePrices$lambda$7(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryClosePrices$lambda$8(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        this.queryMultipleClosePrices = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryMultipleFuturesClosePrices", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryMultipleClosePrices$lambda$9(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryMultipleClosePrices$lambda$10(this.f$0, (List) obj);
            }
        }, false, 16, null);
        C415091 c415091 = new C415091(null);
        LogoutKillswitch logoutKillswitch2 = getLogoutKillswitch();
        C415102 c415102 = new C415102(null);
        Clock clock2 = storeBundle.getClock();
        Duration durationOfSeconds2 = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        this.getClosesRange = companion.create(c415091, logoutKillswitch2, c415102, clock2, new DefaultStaleDecider(durationOfSeconds2, storeBundle.getClock()));
        this.queryClosesRange = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesClosesRange", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryClosesRange$lambda$11(this.f$0, (FuturesMarketDataStore.ClosesRangeArgs) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryClosesRange$lambda$12(this.f$0, (FuturesMarketDataStore.ClosesRangeArgs) obj);
            }
        }, false, 16, null);
        C415111 c415111 = new C415111(null);
        LogoutKillswitch logoutKillswitch3 = getLogoutKillswitch();
        C415122 c415122 = new C415122(null);
        Clock clock3 = storeBundle.getClock();
        Duration durationOfSeconds3 = Duration.ofSeconds(30L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "ofSeconds(...)");
        this.getFundamentals = companion.create(c415111, logoutKillswitch3, c415122, clock3, new DefaultStaleDecider(durationOfSeconds3, storeBundle.getClock()));
        this.queryFundamentals = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesClosePrices", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryFundamentals$lambda$19(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryFundamentals$lambda$20(this.f$0, (UUID) obj);
            }
        }, false, 16, null);
        this.queryFundamentalsList = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "queryFuturesFundamentalsList", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryFundamentalsList$lambda$21(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesMarketDataStore.queryFundamentalsList$lambda$22(this.f$0, (List) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryContractHistorical$lambda$0(FuturesMarketDataStore futuresMarketDataStore, HistoricalParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(futuresMarketDataStore.getContractHistorical, params, futuresMarketDataStore.toPollDuration(params.getInterval()), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryContractHistorical$lambda$1(FuturesMarketDataStore futuresMarketDataStore, HistoricalParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.filterNotNull(futuresMarketDataStore.historicalDao.getFuturesHistorical(params.getInstrumentId(), params.getStart(), params.getInterval()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryProductHistorical$lambda$2(FuturesMarketDataStore futuresMarketDataStore, HistoricalParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(futuresMarketDataStore.getProductHistorical, params, futuresMarketDataStore.toPollDuration(params.getInterval()), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryProductHistorical$lambda$3(FuturesMarketDataStore futuresMarketDataStore, HistoricalParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.filterNotNull(futuresMarketDataStore.historicalDao.getFuturesHistorical(params.getInstrumentId(), params.getStart(), params.getInterval()));
    }

    private final Duration toPollDuration(Historical.Interval interval) {
        Duration durationDividedBy;
        Duration duration = interval.getDuration();
        if (duration != null && (durationDividedBy = duration.dividedBy(2L)) != null) {
            return durationDividedBy;
        }
        Duration durationOfSeconds = Duration.ofSeconds(150L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return durationOfSeconds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r14.createMockHistoricalsForContract(r5, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x0029, B:30:0x006c, B:32:0x0084, B:34:0x008c), top: B:40:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object seedContractHistoricalIfApplicable(HistoricalParams historicalParams, FuturesQuote futuresQuote, Continuation<? super Unit> continuation) {
        C415131 c415131;
        Object obj;
        if (continuation instanceof C415131) {
            c415131 = (C415131) continuation;
            int i = c415131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415131.label = i - Integer.MIN_VALUE;
            } else {
                c415131 = new C415131(continuation);
            }
        }
        Object obj2 = c415131.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c415131.label;
        try {
        } catch (Exception e) {
            Timber.INSTANCE.mo3354e(e);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (!this.targetBackend.isApollo()) {
                return Unit.INSTANCE;
            }
            if (futuresQuote == null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) {
                FuturesMarketDataStore6 futuresMarketDataStore6 = new FuturesMarketDataStore6(this, historicalParams, null);
                c415131.L$0 = historicalParams;
                c415131.label = 1;
                Object objWithTimeoutOrNull = Timeout6.withTimeoutOrNull(2000L, futuresMarketDataStore6, c415131);
                obj = objWithTimeoutOrNull;
            } else {
                FuturesManagedMarketdataApi futuresManagedMarketdataApi = this.futuresManagedMarketdataApi;
                MockHistoricalRequest mockHistoricalRequest = new MockHistoricalRequest(historicalParams.getInstrumentId(), historicalParams.getInterval(), historicalParams.getStart(), historicalParams.getEnd(), new MockHistoricalRequest.PriceParams(lastTradePrice == null ? lastTradePrice.floatValue() : 5300.0f, 0.25f, 50));
                c415131.L$0 = null;
                c415131.label = 2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
            return Unit.INSTANCE;
        }
        historicalParams = (HistoricalParams) c415131.L$0;
        ResultKt.throwOnFailure(obj2);
        obj = obj2;
        BigDecimal lastTradePrice = (BigDecimal) obj;
        FuturesManagedMarketdataApi futuresManagedMarketdataApi2 = this.futuresManagedMarketdataApi;
        MockHistoricalRequest mockHistoricalRequest2 = new MockHistoricalRequest(historicalParams.getInstrumentId(), historicalParams.getInterval(), historicalParams.getStart(), historicalParams.getEnd(), new MockHistoricalRequest.PriceParams(lastTradePrice == null ? lastTradePrice.floatValue() : 5300.0f, 0.25f, 50));
        c415131.L$0 = null;
        c415131.label = 2;
    }

    static /* synthetic */ Object seedContractHistoricalIfApplicable$default(FuturesMarketDataStore futuresMarketDataStore, HistoricalParams historicalParams, FuturesQuote futuresQuote, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            futuresQuote = null;
        }
        return futuresMarketDataStore.seedContractHistoricalIfApplicable(historicalParams, futuresQuote, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
    
        if (r2.createMockHistoricalsForProduct(r14, r3) != r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8 A[Catch: Exception -> 0x003c, PHI: r0 r13
      0x00d8: PHI (r0v11 com.robinhood.android.models.futures.marketdata.db.FuturesQuote) = 
      (r0v5 com.robinhood.android.models.futures.marketdata.db.FuturesQuote)
      (r0v8 com.robinhood.android.models.futures.marketdata.db.FuturesQuote)
      (r0v17 com.robinhood.android.models.futures.marketdata.db.FuturesQuote)
     binds: [B:47:0x00d6, B:41:0x00b7, B:46:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r13v5 com.robinhood.store.futures.marketdata.FuturesMarketDataStore$HistoricalParams) = 
      (r13v0 com.robinhood.store.futures.marketdata.FuturesMarketDataStore$HistoricalParams)
      (r13v2 com.robinhood.store.futures.marketdata.FuturesMarketDataStore$HistoricalParams)
      (r13v6 com.robinhood.store.futures.marketdata.FuturesMarketDataStore$HistoricalParams)
     binds: [B:47:0x00d6, B:41:0x00b7, B:46:0x00d4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:48:0x00d8, B:50:0x00f0, B:52:0x00f6, B:54:0x00fe), top: B:60:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:48:0x00d8, B:50:0x00f0, B:52:0x00f6, B:54:0x00fe), top: B:60:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object seedProductHistoricalIfApplicable(HistoricalParams historicalParams, Continuation<? super Unit> continuation) {
        C415161 c415161;
        FuturesProduct futuresProduct;
        HistoricalParams historicalParams2;
        FuturesQuote futuresQuote;
        HistoricalParams historicalParams3;
        FuturesProduct futuresProduct2;
        UUID activeFuturesContractId;
        HistoricalParams historicalParams4;
        BigDecimal lastTradePrice;
        HistoricalParams historicalParams5 = historicalParams;
        if (continuation instanceof C415161) {
            c415161 = (C415161) continuation;
            int i = c415161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c415161.label = i - Integer.MIN_VALUE;
            } else {
                c415161 = new C415161(continuation);
            }
        }
        Object objWithTimeoutOrNull = c415161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c415161.label;
        try {
        } catch (Exception e) {
            Timber.INSTANCE.mo3354e(e);
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            if (!this.targetBackend.isApollo()) {
                return Unit.INSTANCE;
            }
            FuturesMarketDataStore7 futuresMarketDataStore7 = new FuturesMarketDataStore7(this, historicalParams5, null);
            c415161.L$0 = historicalParams5;
            c415161.label = 1;
            objWithTimeoutOrNull = Timeout6.withTimeoutOrNull(2000L, futuresMarketDataStore7, c415161);
            if (objWithTimeoutOrNull != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            historicalParams5 = (HistoricalParams) c415161.L$0;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        } else {
            if (i2 == 2) {
                futuresProduct2 = (FuturesProduct) c415161.L$1;
                historicalParams3 = (HistoricalParams) c415161.L$0;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                FuturesQuote futuresQuote2 = (FuturesQuote) objWithTimeoutOrNull;
                futuresProduct = futuresProduct2;
                futuresQuote = futuresQuote2;
                historicalParams2 = historicalParams3;
                activeFuturesContractId = futuresProduct.getActiveFuturesContractId();
                if (activeFuturesContractId != null) {
                    HistoricalParams historicalParamsCopy$default = HistoricalParams.copy$default(historicalParams2, activeFuturesContractId, null, null, null, 14, null);
                    c415161.L$0 = historicalParams2;
                    c415161.L$1 = futuresQuote;
                    c415161.label = 3;
                    if (seedContractHistoricalIfApplicable(historicalParamsCopy$default, futuresQuote, c415161) != coroutine_suspended) {
                        historicalParams4 = historicalParams2;
                        historicalParams2 = historicalParams4;
                        FuturesManagedMarketdataApi futuresManagedMarketdataApi = this.futuresManagedMarketdataApi;
                        MockHistoricalRequest mockHistoricalRequest = new MockHistoricalRequest(historicalParams2.getInstrumentId(), historicalParams2.getInterval(), historicalParams2.getStart(), historicalParams2.getEnd(), new MockHistoricalRequest.PriceParams((futuresQuote != null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) ? 5300.0f : lastTradePrice.floatValue(), 0.25f, 50));
                        c415161.L$0 = null;
                        c415161.L$1 = null;
                        c415161.label = 4;
                    }
                } else {
                    FuturesManagedMarketdataApi futuresManagedMarketdataApi2 = this.futuresManagedMarketdataApi;
                    MockHistoricalRequest mockHistoricalRequest2 = new MockHistoricalRequest(historicalParams2.getInstrumentId(), historicalParams2.getInterval(), historicalParams2.getStart(), historicalParams2.getEnd(), new MockHistoricalRequest.PriceParams((futuresQuote != null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) ? 5300.0f : lastTradePrice.floatValue(), 0.25f, 50));
                    c415161.L$0 = null;
                    c415161.L$1 = null;
                    c415161.label = 4;
                }
                return coroutine_suspended;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                return Unit.INSTANCE;
            }
            futuresQuote = (FuturesQuote) c415161.L$1;
            historicalParams4 = (HistoricalParams) c415161.L$0;
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            historicalParams2 = historicalParams4;
            FuturesManagedMarketdataApi futuresManagedMarketdataApi22 = this.futuresManagedMarketdataApi;
            MockHistoricalRequest mockHistoricalRequest22 = new MockHistoricalRequest(historicalParams2.getInstrumentId(), historicalParams2.getInterval(), historicalParams2.getStart(), historicalParams2.getEnd(), new MockHistoricalRequest.PriceParams((futuresQuote != null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) ? 5300.0f : lastTradePrice.floatValue(), 0.25f, 50));
            c415161.L$0 = null;
            c415161.L$1 = null;
            c415161.label = 4;
        }
        futuresProduct = (FuturesProduct) objWithTimeoutOrNull;
        if (futuresProduct != null) {
            UUID activeFuturesContractId2 = futuresProduct.getActiveFuturesContractId();
            if (activeFuturesContractId2 != null) {
                FuturesMarketDataStore8 futuresMarketDataStore8 = new FuturesMarketDataStore8(this, activeFuturesContractId2, null);
                c415161.L$0 = historicalParams5;
                c415161.L$1 = futuresProduct;
                c415161.label = 2;
                Object objWithTimeoutOrNull2 = Timeout6.withTimeoutOrNull(2000L, futuresMarketDataStore8, c415161);
                if (objWithTimeoutOrNull2 != coroutine_suspended) {
                    historicalParams3 = historicalParams5;
                    futuresProduct2 = futuresProduct;
                    objWithTimeoutOrNull = objWithTimeoutOrNull2;
                    FuturesQuote futuresQuote22 = (FuturesQuote) objWithTimeoutOrNull;
                    futuresProduct = futuresProduct2;
                    futuresQuote = futuresQuote22;
                    historicalParams2 = historicalParams3;
                    activeFuturesContractId = futuresProduct.getActiveFuturesContractId();
                    if (activeFuturesContractId != null) {
                    }
                }
                return coroutine_suspended;
            }
            historicalParams2 = historicalParams5;
            futuresQuote = null;
            activeFuturesContractId = futuresProduct.getActiveFuturesContractId();
            if (activeFuturesContractId != null) {
            }
            return coroutine_suspended;
        }
        historicalParams2 = historicalParams5;
        futuresQuote = null;
        FuturesManagedMarketdataApi futuresManagedMarketdataApi222 = this.futuresManagedMarketdataApi;
        MockHistoricalRequest mockHistoricalRequest222 = new MockHistoricalRequest(historicalParams2.getInstrumentId(), historicalParams2.getInterval(), historicalParams2.getStart(), historicalParams2.getEnd(), new MockHistoricalRequest.PriceParams((futuresQuote != null || (lastTradePrice = futuresQuote.getLastTradePrice()) == null) ? 5300.0f : lastTradePrice.floatValue(), 0.25f, 50));
        c415161.L$0 = null;
        c415161.L$1 = null;
        c415161.label = 4;
    }

    public final Flow<UiFuturesHistorical> streamContractHistorical(UUID contractId, Historical.Interval interval, Instant start, Instant end) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(start, "start");
        return this.queryContractHistorical.asFlow(new HistoricalParams(contractId, interval, start, end));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$HistoricalParams;", "", "Ljava/util/UUID;", "instrumentId", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "j$/time/Instant", "start", "end", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;Lj$/time/Instant;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lcom/robinhood/models/ui/Historical$Interval;", "component3", "()Lj$/time/Instant;", "component4", "copy", "(Ljava/util/UUID;Lcom/robinhood/models/ui/Historical$Interval;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$HistoricalParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getInstrumentId", "Lcom/robinhood/models/ui/Historical$Interval;", "getInterval", "Lj$/time/Instant;", "getStart", "getEnd", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class HistoricalParams {
        private final Instant end;
        private final UUID instrumentId;
        private final Historical.Interval interval;
        private final Instant start;

        public static /* synthetic */ HistoricalParams copy$default(HistoricalParams historicalParams, UUID uuid, Historical.Interval interval, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = historicalParams.instrumentId;
            }
            if ((i & 2) != 0) {
                interval = historicalParams.interval;
            }
            if ((i & 4) != 0) {
                instant = historicalParams.start;
            }
            if ((i & 8) != 0) {
                instant2 = historicalParams.end;
            }
            return historicalParams.copy(uuid, interval, instant, instant2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Historical.Interval getInterval() {
            return this.interval;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getStart() {
            return this.start;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getEnd() {
            return this.end;
        }

        public final HistoricalParams copy(UUID instrumentId, Historical.Interval interval, Instant start, Instant end) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(start, "start");
            return new HistoricalParams(instrumentId, interval, start, end);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HistoricalParams)) {
                return false;
            }
            HistoricalParams historicalParams = (HistoricalParams) other;
            return Intrinsics.areEqual(this.instrumentId, historicalParams.instrumentId) && this.interval == historicalParams.interval && Intrinsics.areEqual(this.start, historicalParams.start) && Intrinsics.areEqual(this.end, historicalParams.end);
        }

        public int hashCode() {
            int iHashCode = ((((this.instrumentId.hashCode() * 31) + this.interval.hashCode()) * 31) + this.start.hashCode()) * 31;
            Instant instant = this.end;
            return iHashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "HistoricalParams(instrumentId=" + this.instrumentId + ", interval=" + this.interval + ", start=" + this.start + ", end=" + this.end + ")";
        }

        public HistoricalParams(UUID instrumentId, Historical.Interval interval, Instant start, Instant instant) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(start, "start");
            this.instrumentId = instrumentId;
            this.interval = interval;
            this.start = start;
            this.end = instant;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Historical.Interval getInterval() {
            return this.interval;
        }

        public final Instant getStart() {
            return this.start;
        }

        public final Instant getEnd() {
            return this.end;
        }
    }

    public final Flow<UiFuturesHistorical> streamProductHistorical(UUID productId, Historical.Interval interval, Instant start, Instant end) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(start, "start");
        return this.queryProductHistorical.asFlow(new HistoricalParams(productId, interval, start, end));
    }

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosePrices;", "contractIds", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosePrices$1", m3645f = "FuturesMarketDataStore.kt", m3646l = {288}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosePrices$1 */
    static final class C415071 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super List<? extends ApiFuturesClosePrices>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415071(Continuation<? super C415071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415071 c415071 = FuturesMarketDataStore.this.new C415071(continuation);
            c415071.L$0 = obj;
            return c415071;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super List<? extends ApiFuturesClosePrices>> continuation) {
            return invoke2((List<UUID>) list, (Continuation<? super List<ApiFuturesClosePrices>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UUID> list, Continuation<? super List<ApiFuturesClosePrices>> continuation) {
            return ((C415071) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object closes$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strJoinToString$default = CollectionsKt.joinToString$default((List) this.L$0, ",", null, null, 0, null, null, 62, null);
                FuturesMarketdataApi futuresMarketdataApi = FuturesMarketDataStore.this.futuresMarketdataApi;
                this.label = 1;
                closes$default = FuturesMarketdataApi.DefaultImpls.getCloses$default(futuresMarketdataApi, strJoinToString$default, null, this, 2, null);
                if (closes$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                closes$default = obj;
            }
            List list = (List) ((ApiMarketdataResponse) closes$default).getData();
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApiFuturesClosePrices apiFuturesClosePrices = (ApiFuturesClosePrices) ((ApiMarketdataResponse) it.next()).getData();
                if (apiFuturesClosePrices != null) {
                    arrayList.add(apiFuturesClosePrices);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "prices", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosePrices;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosePrices$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosePrices$2 */
    static final class C415082 extends ContinuationImpl7 implements Function2<List<? extends ApiFuturesClosePrices>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415082(Continuation<? super C415082> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415082 c415082 = FuturesMarketDataStore.this.new C415082(continuation);
            c415082.L$0 = obj;
            return c415082;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiFuturesClosePrices> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ApiFuturesClosePrices>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ApiFuturesClosePrices> list, Continuation<? super Unit> continuation) {
            return ((C415082) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            if (!list.isEmpty()) {
                FuturesClosePricesDao futuresClosePricesDao = FuturesMarketDataStore.this.closePricesDao;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FuturesClosePrices dbModel = FuturesClosePrices3.toDbModel((ApiFuturesClosePrices) it.next());
                    if (dbModel != null) {
                        arrayList.add(dbModel);
                    }
                }
                futuresClosePricesDao.insert(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryClosePrices$lambda$7(FuturesMarketDataStore futuresMarketDataStore, UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Endpoint<List<UUID>, List<ApiFuturesClosePrices>> endpoint = futuresMarketDataStore.getClosePrices;
        List listListOf = CollectionsKt.listOf(contractId);
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, listListOf, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryClosePrices$lambda$8(FuturesMarketDataStore futuresMarketDataStore, UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return futuresMarketDataStore.closePricesDao.getFuturesClosePrices(contractId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryMultipleClosePrices$lambda$9(FuturesMarketDataStore futuresMarketDataStore, List contractIds) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Endpoint<List<UUID>, List<ApiFuturesClosePrices>> endpoint = futuresMarketDataStore.getClosePrices;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, contractIds, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryMultipleClosePrices$lambda$10(FuturesMarketDataStore futuresMarketDataStore, List contractIds) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        return futuresMarketDataStore.closePricesDao.getFuturesClosePrices((List<UUID>) contractIds);
    }

    public final Flow<FuturesClosePrices> getClosePrices(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return this.queryClosePrices.asFlow(contractId);
    }

    public final Flow<List<FuturesClosePrices>> getMultipleClosePrices(List<UUID> contractIds) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        return this.queryMultipleClosePrices.asFlow(contractIds);
    }

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosesRange;", "args", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$ClosesRangeArgs;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$1", m3645f = "FuturesMarketDataStore.kt", m3646l = {337}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$1 */
    static final class C415091 extends ContinuationImpl7 implements Function2<ClosesRangeArgs, Continuation<? super List<? extends ApiFuturesClosesRange>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415091(Continuation<? super C415091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415091 c415091 = FuturesMarketDataStore.this.new C415091(continuation);
            c415091.L$0 = obj;
            return c415091;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ClosesRangeArgs closesRangeArgs, Continuation<? super List<ApiFuturesClosesRange>> continuation) {
            return ((C415091) create(closesRangeArgs, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ClosesRangeArgs closesRangeArgs, Continuation<? super List<? extends ApiFuturesClosesRange>> continuation) {
            return invoke2(closesRangeArgs, (Continuation<? super List<ApiFuturesClosesRange>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ClosesRangeArgs closesRangeArgs = (ClosesRangeArgs) this.L$0;
                FuturesMarketdataApi futuresMarketdataApi = FuturesMarketDataStore.this.futuresMarketdataApi;
                String string2 = closesRangeArgs.getContractId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                Instant start = closesRangeArgs.getStart();
                Instant end = closesRangeArgs.getEnd();
                this.label = 1;
                obj = futuresMarketdataApi.getClosesRange(string2, start, end, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) ((ApiMarketdataResponse) obj).getData();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) ((ApiMarketdataResponse) it.next()).getData();
                    if (list2 != null) {
                        arrayList.add(list2);
                    }
                }
                List listFlatten = CollectionsKt.flatten(arrayList);
                if (listFlatten != null) {
                    return listFlatten;
                }
            }
            return CollectionsKt.emptyList();
        }
    }

    /* compiled from: FuturesMarketDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "prices", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesClosesRange;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$2 */
    static final class C415102 extends ContinuationImpl7 implements Function2<List<? extends ApiFuturesClosesRange>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C415102(Continuation<? super C415102> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C415102 c415102 = FuturesMarketDataStore.this.new C415102(continuation);
            c415102.L$0 = obj;
            return c415102;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiFuturesClosesRange> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ApiFuturesClosesRange>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<ApiFuturesClosesRange> list, Continuation<? super Unit> continuation) {
            return ((C415102) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            if (!list.isEmpty()) {
                FuturesClosesRangeDao futuresClosesRangeDao = FuturesMarketDataStore.this.closesRangeDao;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(FuturesClosesRange2.toDbModel((ApiFuturesClosesRange) it.next()));
                }
                futuresClosesRangeDao.insert(arrayList);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryClosesRange$lambda$11(FuturesMarketDataStore futuresMarketDataStore, ClosesRangeArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Endpoint<ClosesRangeArgs, List<ApiFuturesClosesRange>> endpoint = futuresMarketDataStore.getClosesRange;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, args, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryClosesRange$lambda$12(FuturesMarketDataStore futuresMarketDataStore, ClosesRangeArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        LocalDate localDate$default = Instants.toLocalDate$default(args.getStart(), null, 1, null);
        Instant end = args.getEnd();
        return futuresMarketDataStore.closesRangeDao.getFuturesClosesRange(args.getContractId(), localDate$default, end != null ? Instants.toLocalDate$default(end, null, 1, null) : null);
    }

    public final Flow<List<FuturesClosesRange>> getClosesRange(UUID contractId, Instant start, Instant end) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(start, "start");
        final Flow<List<FuturesClosesRange>> flowAsFlow = this.queryClosesRange.asFlow(new ClosesRangeArgs(contractId, start, end));
        return new Flow<List<? extends FuturesClosesRange>>() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends FuturesClosesRange>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C415032(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1$2 */
            public static final class C415032<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C415032.this.emit(null, this);
                    }
                }

                public C415032(FlowCollector flowCollector) {
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
                        List listSortedWith = CollectionsKt.sortedWith((List) obj, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE (r5v3 'listSortedWith' java.util.List) = 
                              (wrap:java.util.List:0x0036: CHECK_CAST (java.util.List) (r5v0 'obj' java.lang.Object))
                              (wrap:java.util.Comparator:0x003c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:1056) call: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$lambda$14$$inlined$sortedBy$1.<init>():void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:1056) in method: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1.2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object, file: classes12.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$lambda$14$$inlined$sortedBy$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            boolean r0 = r6 instanceof com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1.C415032.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1$2$1 r0 = (com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1.C415032.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1$2$1 r0 = new com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.ResultKt.throwOnFailure(r6)
                            goto L4c
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.ResultKt.throwOnFailure(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            java.util.List r5 = (java.util.List) r5
                            java.lang.Iterable r5 = (java.lang.Iterable) r5
                            com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$lambda$14$$inlined$sortedBy$1 r2 = new com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$lambda$14$$inlined$sortedBy$1
                            r2.<init>()
                            java.util.List r5 = kotlin.collections.CollectionsKt.sortedWith(r5, r2)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4c
                            return r1
                        L4c:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getClosesRange$$inlined$map$1.C415032.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }
            };
        }

        public static /* synthetic */ Flow getEffectiveClosesRange$default(FuturesMarketDataStore futuresMarketDataStore, UUID uuid, Instant instant, int i, Object obj) {
            if ((i & 2) != 0) {
                instant = Instant.now();
            }
            return futuresMarketDataStore.getEffectiveClosesRange(uuid, instant);
        }

        public final Flow<FuturesClosesRange> getEffectiveClosesRange(final UUID contractId, final Instant time) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(time, "time");
            Instant instantMinus = time.minus((TemporalAmount) Duration.ofDays(1L));
            Intrinsics.checkNotNullExpressionValue(instantMinus, "minus(...)");
            final Flow<List<FuturesClosesRange>> closesRange = getClosesRange(contractId, instantMinus, null);
            final Flow<List<? extends FuturesClosesRange>> flow = new Flow<List<? extends FuturesClosesRange>>() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$filterNot$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends FuturesClosesRange>> flowCollector, Continuation continuation) {
                    Object objCollect = closesRange.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$filterNot$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$filterNot$1$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$filterNot$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
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
                            if (!((List) obj).isEmpty()) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
            return new Flow<FuturesClosesRange>() { // from class: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$mapNotNull$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FuturesClosesRange> flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector, this, time, contractId), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ UUID $contractId$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ Instant $time$inlined;
                    final /* synthetic */ FuturesMarketDataStore this$0;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$mapNotNull$1$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {63}, m3647m = "emit")
                    /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getEffectiveClosesRange$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, FuturesMarketDataStore futuresMarketDataStore, Instant instant, UUID uuid) {
                        this.$this_unsafeFlow = flowCollector;
                        this.this$0 = futuresMarketDataStore;
                        this.$time$inlined = instant;
                        this.$contractId$inlined = uuid;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Object objPrevious;
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
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    objPrevious = null;
                                    break;
                                }
                                objPrevious = listIterator.previous();
                                if (this.$time$inlined.compareTo(((FuturesClosesRange) objPrevious).getSessionEndTime()) > 0) {
                                    break;
                                }
                            }
                            FuturesClosesRange futuresClosesRange = (FuturesClosesRange) objPrevious;
                            if (futuresClosesRange == null) {
                                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("No closes range found for " + this.$contractId$inlined + " when time is " + this.$time$inlined), false, null, 6, null);
                                futuresClosesRange = (FuturesClosesRange) CollectionsKt.lastOrNull(list);
                            }
                            if (futuresClosesRange != null) {
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(futuresClosesRange, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
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
        /* compiled from: FuturesMarketDataStore.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$ClosesRangeArgs;", "", "Ljava/util/UUID;", "contractId", "j$/time/Instant", "start", "end", "<init>", "(Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;)V", "component1", "()Ljava/util/UUID;", "component2", "()Lj$/time/Instant;", "component3", "copy", "(Ljava/util/UUID;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore$ClosesRangeArgs;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getContractId", "Lj$/time/Instant;", "getStart", "getEnd", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final /* data */ class ClosesRangeArgs {
            private final UUID contractId;
            private final Instant end;
            private final Instant start;

            public static /* synthetic */ ClosesRangeArgs copy$default(ClosesRangeArgs closesRangeArgs, UUID uuid, Instant instant, Instant instant2, int i, Object obj) {
                if ((i & 1) != 0) {
                    uuid = closesRangeArgs.contractId;
                }
                if ((i & 2) != 0) {
                    instant = closesRangeArgs.start;
                }
                if ((i & 4) != 0) {
                    instant2 = closesRangeArgs.end;
                }
                return closesRangeArgs.copy(uuid, instant, instant2);
            }

            /* renamed from: component1, reason: from getter */
            public final UUID getContractId() {
                return this.contractId;
            }

            /* renamed from: component2, reason: from getter */
            public final Instant getStart() {
                return this.start;
            }

            /* renamed from: component3, reason: from getter */
            public final Instant getEnd() {
                return this.end;
            }

            public final ClosesRangeArgs copy(UUID contractId, Instant start, Instant end) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(start, "start");
                return new ClosesRangeArgs(contractId, start, end);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClosesRangeArgs)) {
                    return false;
                }
                ClosesRangeArgs closesRangeArgs = (ClosesRangeArgs) other;
                return Intrinsics.areEqual(this.contractId, closesRangeArgs.contractId) && Intrinsics.areEqual(this.start, closesRangeArgs.start) && Intrinsics.areEqual(this.end, closesRangeArgs.end);
            }

            public int hashCode() {
                int iHashCode = ((this.contractId.hashCode() * 31) + this.start.hashCode()) * 31;
                Instant instant = this.end;
                return iHashCode + (instant == null ? 0 : instant.hashCode());
            }

            public String toString() {
                return "ClosesRangeArgs(contractId=" + this.contractId + ", start=" + this.start + ", end=" + this.end + ")";
            }

            public ClosesRangeArgs(UUID contractId, Instant start, Instant instant) {
                Intrinsics.checkNotNullParameter(contractId, "contractId");
                Intrinsics.checkNotNullParameter(start, "start");
                this.contractId = contractId;
                this.start = start;
                this.end = instant;
            }

            public final UUID getContractId() {
                return this.contractId;
            }

            public final Instant getStart() {
                return this.start;
            }

            public final Instant getEnd() {
                return this.end;
            }
        }

        /* compiled from: FuturesMarketDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesFundamentals;", "contractIds", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getFundamentals$1", m3645f = "FuturesMarketDataStore.kt", m3646l = {422, CompanyFinancialsSection.BAR_ANIMATION_DURATION}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getFundamentals$1 */
        static final class C415111 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super List<? extends ApiFuturesFundamentals>>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;

            C415111(Continuation<? super C415111> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C415111 c415111 = FuturesMarketDataStore.this.new C415111(continuation);
                c415111.L$0 = obj;
                return c415111;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super List<? extends ApiFuturesFundamentals>> continuation) {
                return invoke2((List<UUID>) list, (Continuation<? super List<ApiFuturesFundamentals>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<UUID> list, Continuation<? super List<ApiFuturesFundamentals>> continuation) {
                return ((C415111) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
            
                if (r15 == r0) goto L18;
             */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                List list;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list2 = (List) this.L$0;
                    it = list2.iterator();
                    list = list2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        List list3 = (List) ((ApiMarketdataResponse) obj).getData();
                        if (list3 == null) {
                            return CollectionsKt.emptyList();
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            ApiFuturesFundamentals apiFuturesFundamentals = (ApiFuturesFundamentals) ((ApiMarketdataResponse) it2.next()).getData();
                            if (apiFuturesFundamentals != null) {
                                arrayList.add(apiFuturesFundamentals);
                            }
                        }
                        return arrayList;
                    }
                    it = (Iterator) this.L$1;
                    list = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (true) {
                    if (it.hasNext()) {
                        UUID uuid = (UUID) it.next();
                        FuturesMarketDataStore futuresMarketDataStore = FuturesMarketDataStore.this;
                        this.L$0 = list;
                        this.L$1 = it;
                        this.label = 1;
                        if (futuresMarketDataStore.seedFundamentalsIfApplicable(uuid, this) == coroutine_suspended) {
                            break;
                        }
                    } else {
                        String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
                        FuturesMarketdataApi futuresMarketdataApi = FuturesMarketDataStore.this.futuresMarketdataApi;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        obj = futuresMarketdataApi.getFundamentals(strJoinToString$default, this);
                    }
                }
                return coroutine_suspended;
            }
        }

        /* compiled from: FuturesMarketDataStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "fundamentals", "", "Lcom/robinhood/android/models/futures/api/marketdata/ApiFuturesFundamentals;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getFundamentals$2", m3645f = "FuturesMarketDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.store.futures.marketdata.FuturesMarketDataStore$getFundamentals$2 */
        static final class C415122 extends ContinuationImpl7 implements Function2<List<? extends ApiFuturesFundamentals>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            C415122(Continuation<? super C415122> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C415122 c415122 = FuturesMarketDataStore.this.new C415122(continuation);
                c415122.L$0 = obj;
                return c415122;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends ApiFuturesFundamentals> list, Continuation<? super Unit> continuation) {
                return invoke2((List<ApiFuturesFundamentals>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<ApiFuturesFundamentals> list, Continuation<? super Unit> continuation) {
                return ((C415122) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                if (!list.isEmpty()) {
                    FuturesFundamentalsDao futuresFundamentalsDao = FuturesMarketDataStore.this.fundamentalsDao;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(FuturesFundamentals2.toDbModel((ApiFuturesFundamentals) it.next()));
                    }
                    futuresFundamentalsDao.insert(arrayList);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow queryFundamentals$lambda$19(FuturesMarketDataStore futuresMarketDataStore, UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Endpoint<List<UUID>, List<ApiFuturesFundamentals>> endpoint = futuresMarketDataStore.getFundamentals;
            List listListOf = CollectionsKt.listOf(contractId);
            Duration durationOfMinutes = Duration.ofMinutes(1L);
            Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
            return Endpoint.DefaultImpls.poll$default(endpoint, listListOf, durationOfMinutes, null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow queryFundamentals$lambda$20(FuturesMarketDataStore futuresMarketDataStore, UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return futuresMarketDataStore.fundamentalsDao.getFuturesFundamentals(contractId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow queryFundamentalsList$lambda$21(FuturesMarketDataStore futuresMarketDataStore, List contractIds) {
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            Endpoint<List<UUID>, List<ApiFuturesFundamentals>> endpoint = futuresMarketDataStore.getFundamentals;
            Duration durationOfMinutes = Duration.ofMinutes(1L);
            Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
            return Endpoint.DefaultImpls.poll$default(endpoint, contractIds, durationOfMinutes, null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Flow queryFundamentalsList$lambda$22(FuturesMarketDataStore futuresMarketDataStore, List contractIds) {
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            return futuresMarketDataStore.fundamentalsDao.getFuturesFundamentals((List<UUID>) contractIds);
        }

        public final Flow<FuturesFundamentals> getFundamentals(UUID contractId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return this.queryFundamentals.asFlow(contractId);
        }

        public final Flow<List<FuturesFundamentals>> getFundamentalsList(List<UUID> contractIds) {
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            return this.queryFundamentalsList.asFlow(contractIds);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object seedFundamentalsIfApplicable(UUID uuid, Continuation<? super Unit> continuation) throws Throwable {
            C415151 c415151;
            if (continuation instanceof C415151) {
                c415151 = (C415151) continuation;
                int i = c415151.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c415151.label = i - Integer.MIN_VALUE;
                } else {
                    c415151 = new C415151(continuation);
                }
            }
            Object obj = c415151.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c415151.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.targetBackend.isApollo()) {
                        return Unit.INSTANCE;
                    }
                    FuturesManagedMarketdataApi futuresManagedMarketdataApi = this.futuresManagedMarketdataApi;
                    MockFundamentalsRequest mockFundamentalsRequest = new MockFundamentalsRequest(uuid, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    c415151.label = 1;
                    if (futuresManagedMarketdataApi.createMockFundamentals(mockFundamentalsRequest, c415151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Timber.INSTANCE.mo3354e(th);
            }
            return Unit.INSTANCE;
        }
    }
