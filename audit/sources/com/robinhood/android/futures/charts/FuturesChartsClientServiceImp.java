package com.robinhood.android.futures.charts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.futures.charts.extensions.EventHistoricals;
import com.robinhood.android.futures.charts.extensions.FutureHistoricals;
import com.robinhood.android.futures.charts.extensions.FuturesClosePrices2;
import com.robinhood.android.models.event.p186db.arsenal.Event;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.arsenal.ExchangeSource;
import com.robinhood.android.models.event.p186db.marketdata.UiEventHistorical;
import com.robinhood.android.models.event.p187ui.UiEcEvent;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosesRange;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.android.models.futures.marketdata.p191db.UiFuturesHistorical;
import com.robinhood.futures.charts.contracts.FuturesChartsClientService;
import com.robinhood.futures.charts.contracts.models.EventContractEvent;
import com.robinhood.futures.charts.contracts.models.FuturesClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesContract;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical;
import com.robinhood.futures.charts.contracts.models.FuturesHistorical7;
import com.robinhood.futures.charts.contracts.models.FuturesPrevClosePrice;
import com.robinhood.futures.charts.contracts.models.FuturesProduct;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.store.event.EventMarketdataStore;
import com.robinhood.store.event.EventStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.arsenal.FuturesProductStore;
import com.robinhood.store.futures.marketdata.FuturesMarketDataStore;
import com.robinhood.store.futures.marketdata.FuturesQuoteStore;
import com.robinhood.store.futures.marketdata.MarketdataPollLocation;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: FuturesChartsClientServiceImp.kt */
@Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001aJ5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J3\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010%\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010'J2\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120 0\u00112\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140 2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0 0\u00112\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0016J\u001c\u0010.\u001a\u00020/2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0096@¢\u0006\u0002\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/FuturesChartsClientServiceImp;", "Lcom/robinhood/futures/charts/contracts/FuturesChartsClientService;", "contractStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "eventMarketdataStore", "Lcom/robinhood/store/event/EventMarketdataStore;", "marketDataStore", "Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;", "productStore", "Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "quoteStore", "Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;", "<init>", "(Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/event/EventMarketdataStore;Lcom/robinhood/store/futures/marketdata/FuturesMarketDataStore;Lcom/robinhood/store/futures/arsenal/FuturesProductStore;Lcom/robinhood/store/futures/marketdata/FuturesQuoteStore;)V", "getFuturesHistorical", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistorical;", "contractId", "", "interval", "Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;", "start", "", "end", "(Ljava/lang/String;Lcom/robinhood/futures/charts/contracts/models/FuturesHistoricalInterval;JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "getFuturesHistoricalForProduct", "productId", "getFuturesLastTradePrice", "", "getFuturesClosesRange", "", "Lcom/robinhood/futures/charts/contracts/models/FuturesClosePrice;", "(Ljava/lang/String;JLjava/lang/Long;)Lkotlinx/coroutines/flow/Flow;", "getFuturesClosePrice", "Lcom/robinhood/futures/charts/contracts/models/FuturesPrevClosePrice;", "getFuturesContract", "Lcom/robinhood/futures/charts/contracts/models/FuturesContract;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFuturesProduct", "Lcom/robinhood/futures/charts/contracts/models/FuturesProduct;", "streamEventContractHistoricals", "eventContractIds", "streamEventContractLastTradePrices", "Lcom/robinhood/futures/charts/contracts/models/FuturesQuote;", "getEventContractEvent", "Lcom/robinhood/futures/charts/contracts/models/EventContractEvent;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesChartsClientServiceImp implements FuturesChartsClientService {
    public static final int $stable = 8;
    private final FuturesContractStore contractStore;
    private final EventMarketdataStore eventMarketdataStore;
    private final EventStore eventStore;
    private final FuturesMarketDataStore marketDataStore;
    private final FuturesProductStore productStore;
    private final FuturesQuoteStore quoteStore;

    /* compiled from: FuturesChartsClientServiceImp.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExchangeSource.values().length];
            try {
                iArr[ExchangeSource.FORECAST_EX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExchangeSource.KALSHI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExchangeSource.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FuturesChartsClientServiceImp.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 188}, m3647m = "getEventContractEvent")
    /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getEventContractEvent$1 */
    static final class C170091 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C170091(Continuation<? super C170091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesChartsClientServiceImp.this.getEventContractEvent(null, this);
        }
    }

    public FuturesChartsClientServiceImp(FuturesContractStore contractStore, EventStore eventStore, EventMarketdataStore eventMarketdataStore, FuturesMarketDataStore marketDataStore, FuturesProductStore productStore, FuturesQuoteStore quoteStore) {
        Intrinsics.checkNotNullParameter(contractStore, "contractStore");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(eventMarketdataStore, "eventMarketdataStore");
        Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
        Intrinsics.checkNotNullParameter(productStore, "productStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        this.contractStore = contractStore;
        this.eventStore = eventStore;
        this.eventMarketdataStore = eventMarketdataStore;
        this.marketDataStore = marketDataStore;
        this.productStore = productStore;
        this.quoteStore = quoteStore;
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<FuturesHistorical> getFuturesHistorical(String contractId, FuturesHistorical7 interval, long start, Long end) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        FuturesMarketDataStore futuresMarketDataStore = this.marketDataStore;
        UUID uuidFromString = UUID.fromString(contractId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        Historical.Interval interval2 = FutureHistoricals.toInterval(interval);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(start);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        final Flow<UiFuturesHistorical> flowStreamContractHistorical = futuresMarketDataStore.streamContractHistorical(uuidFromString, interval2, instantOfEpochMilli, end != null ? Instant.ofEpochMilli(end.longValue()) : null);
        return FlowKt.distinctUntilChanged(new Flow<FuturesHistorical>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistorical$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistorical$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistorical$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistorical$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesHistorical microgramHistorical = FutureHistoricals.toMicrogramHistorical((UiFuturesHistorical) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(microgramHistorical, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesHistorical> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamContractHistorical.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<FuturesHistorical> getFuturesHistoricalForProduct(String productId, FuturesHistorical7 interval, long start, Long end) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        FuturesMarketDataStore futuresMarketDataStore = this.marketDataStore;
        UUID uuidFromString = UUID.fromString(productId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        Historical.Interval interval2 = FutureHistoricals.toInterval(interval);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(start);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        final Flow<UiFuturesHistorical> flowStreamProductHistorical = futuresMarketDataStore.streamProductHistorical(uuidFromString, interval2, instantOfEpochMilli, end != null ? Instant.ofEpochMilli(end.longValue()) : null);
        return FlowKt.distinctUntilChanged(new Flow<FuturesHistorical>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistoricalForProduct$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistoricalForProduct$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistoricalForProduct$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesHistoricalForProduct$$inlined$map$1$2$1, reason: invalid class name */
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
                        FuturesHistorical microgramHistorical = FutureHistoricals.toMicrogramHistorical((UiFuturesHistorical) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(microgramHistorical, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesHistorical> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamProductHistorical.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<Double> getFuturesLastTradePrice(String contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        FuturesQuoteStore futuresQuoteStore = this.quoteStore;
        UUID uuidFromString = UUID.fromString(contractId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        final Flow<FuturesQuote> quote = futuresQuoteStore.getQuote(uuidFromString, MarketdataPollLocation.FDP);
        return FlowKt.distinctUntilChanged(new Flow<Double>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesLastTradePrice$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesLastTradePrice$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesLastTradePrice$$inlined$mapNotNull$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesLastTradePrice$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        BigDecimal lastTradePrice = ((FuturesQuote) obj).getLastTradePrice();
                        Double dBoxDouble = lastTradePrice != null ? boxing.boxDouble(lastTradePrice.doubleValue()) : null;
                        if (dBoxDouble != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(dBoxDouble, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Double> flowCollector, Continuation continuation) {
                Object objCollect = quote.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<List<FuturesClosePrice>> getFuturesClosesRange(String contractId, long start, Long end) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        FuturesMarketDataStore futuresMarketDataStore = this.marketDataStore;
        UUID uuidFromString = UUID.fromString(contractId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(start);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        final Flow<List<FuturesClosesRange>> closesRange = futuresMarketDataStore.getClosesRange(uuidFromString, instantOfEpochMilli, end != null ? Instant.ofEpochMilli(end.longValue()) : null);
        return FlowKt.distinctUntilChanged(new Flow<List<? extends FuturesClosePrice>>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosesRange$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosesRange$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosesRange$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosesRange$$inlined$map$1$2$1, reason: invalid class name */
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
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            FuturesClosePrice microgramClosePrice = FuturesClosePrices2.toMicrogramClosePrice((FuturesClosesRange) it.next());
                            if (microgramClosePrice != null) {
                                arrayList.add(microgramClosePrice);
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends FuturesClosePrice>> flowCollector, Continuation continuation) {
                Object objCollect = closesRange.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<FuturesPrevClosePrice> getFuturesClosePrice(String contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        FuturesMarketDataStore futuresMarketDataStore = this.marketDataStore;
        UUID uuidFromString = UUID.fromString(contractId);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        final Flow<FuturesClosePrices> closePrices = futuresMarketDataStore.getClosePrices(uuidFromString);
        return FlowKt.distinctUntilChanged(new Flow<FuturesPrevClosePrice>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosePrice$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosePrice$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosePrice$$inlined$mapNotNull$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesClosePrice$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        FuturesPrevClosePrice microgramClosePrice = FuturesClosePrices2.toMicrogramClosePrice((FuturesClosePrices) obj);
                        if (microgramClosePrice != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(microgramClosePrice, anonymousClass1) == coroutine_suspended) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesPrevClosePrice> flowCollector, Continuation continuation) {
                Object objCollect = closePrices.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Object getFuturesContract(String str, Continuation<? super FuturesContract> continuation) {
        FuturesContractStore futuresContractStore = this.contractStore;
        UUID uuidFromString = UUID.fromString(str);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        final Flow<com.robinhood.android.models.futures.arsenal.p188db.FuturesContract> flowStreamFuturesContract = futuresContractStore.streamFuturesContract(uuidFromString);
        return FlowKt.first(new Flow<FuturesContract>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesContract$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesContract> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesContract.collect(new C170012(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesContract$$inlined$map$1$2 */
            public static final class C170012<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesContract$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesContract$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C170012.this.emit(null, this);
                    }
                }

                public C170012(FlowCollector flowCollector) {
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
                        com.robinhood.android.models.futures.arsenal.p188db.FuturesContract futuresContract = (com.robinhood.android.models.futures.arsenal.p188db.FuturesContract) obj;
                        String string2 = futuresContract.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        String string3 = futuresContract.getProductId().toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                        FuturesContract futuresContract2 = new FuturesContract(string2, string3, futuresContract.getDisplaySymbol(), futuresContract.getDisplayName(), futuresContract.getExpirationMmy());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresContract2, anonymousClass1) == coroutine_suspended) {
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
        }, continuation);
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Object getFuturesProduct(String str, Continuation<? super FuturesProduct> continuation) {
        FuturesProductStore futuresProductStore = this.productStore;
        UUID uuidFromString = UUID.fromString(str);
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        final Flow<com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct> flowStreamFuturesProduct = futuresProductStore.streamFuturesProduct(uuidFromString);
        return FlowKt.first(new Flow<FuturesProduct>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesProduct$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super FuturesProduct> flowCollector, Continuation continuation2) {
                Object objCollect = flowStreamFuturesProduct.collect(new C170052(flowCollector), continuation2);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesProduct$$inlined$map$1$2 */
            public static final class C170052<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesProduct$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$getFuturesProduct$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C170052.this.emit(null, this);
                    }
                }

                public C170052(FlowCollector flowCollector) {
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
                        com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct futuresProduct = (com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct) obj;
                        String string2 = futuresProduct.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        String displaySymbol = futuresProduct.getDisplaySymbol();
                        if (displaySymbol == null) {
                            displaySymbol = futuresProduct.getSymbol();
                        }
                        FuturesProduct futuresProduct2 = new FuturesProduct(string2, displaySymbol, futuresProduct.getDisplayName(), futuresProduct.getPriceIncrements().scale());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(futuresProduct2, anonymousClass1) == coroutine_suspended) {
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
        }, continuation);
    }

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<List<FuturesHistorical>> streamEventContractHistoricals(List<String> eventContractIds, FuturesHistorical7 interval, long start) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        Intrinsics.checkNotNullParameter(interval, "interval");
        EventMarketdataStore eventMarketdataStore = this.eventMarketdataStore;
        List<String> list = eventContractIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UUID.fromString((String) it.next()));
        }
        Historical.Interval interval2 = FutureHistoricals.toInterval(interval);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(start);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        final Flow<List<UiEventHistorical>> flowStreamHistoricals = eventMarketdataStore.streamHistoricals(arrayList, interval2, instantOfEpochMilli);
        return new Flow<List<? extends FuturesHistorical>>() { // from class: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractHistoricals$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends FuturesHistorical>> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamHistoricals.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractHistoricals$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractHistoricals$$inlined$map$1$2", m3645f = "FuturesChartsClientServiceImp.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.futures.charts.FuturesChartsClientServiceImp$streamEventContractHistoricals$$inlined$map$1$2$1, reason: invalid class name */
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
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(EventHistoricals.toMicrogramHistorical((UiEventHistorical) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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

    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    public Flow<List<com.robinhood.futures.charts.contracts.models.FuturesQuote>> streamEventContractLastTradePrices(List<String> eventContractIds) {
        Intrinsics.checkNotNullParameter(eventContractIds, "eventContractIds");
        List<String> list = eventContractIds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(UUID.fromString((String) it.next()));
        }
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(this.eventStore.streamEventContractList(arrayList)), new C17007x745950b5(null, this, arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.futures.charts.contracts.FuturesChartsClientService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getEventContractEvent(List<String> list, Continuation<? super EventContractEvent> continuation) {
        C170091 c170091;
        Map map;
        UiEcEvent uiEcEvent;
        UUID eventId;
        Iterator it;
        Iterator it2;
        Event event;
        BigDecimal tickSize;
        if (continuation instanceof C170091) {
            c170091 = (C170091) continuation;
            int i = c170091.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c170091.label = i - Integer.MIN_VALUE;
            } else {
                c170091 = new C170091(continuation);
            }
        }
        Object objFirst = c170091.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c170091.label;
        int iScale = 2;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(UUID.fromString((String) it3.next()));
            }
            Flow<Map<UUID, EventContract>> flowStreamEventContractList = this.eventStore.streamEventContractList(arrayList);
            c170091.label = 1;
            objFirst = FlowKt.first(flowStreamEventContractList, c170091);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c170091.L$0;
            ResultKt.throwOnFailure(objFirst);
            uiEcEvent = (UiEcEvent) objFirst;
            if (uiEcEvent != null && (event = uiEcEvent.getEvent()) != null && (tickSize = event.getTickSize()) != null) {
                iScale = tickSize.scale();
            }
            Collection collectionValues = map.values();
            ArrayList arrayList2 = new ArrayList();
            it = collectionValues.iterator();
            while (it.hasNext()) {
                Instant openDate = ((EventContract) it.next()).getOpenDate();
                Long lBoxLong = openDate != null ? boxing.boxLong(openDate.toEpochMilli()) : null;
                if (lBoxLong != null) {
                    arrayList2.add(lBoxLong);
                }
            }
            Long l = (Long) CollectionsKt.minOrNull((Iterable) arrayList2);
            long jLongValue = l == null ? l.longValue() : Instant.now().toEpochMilli();
            Collection collectionValues2 = map.values();
            ArrayList arrayList3 = new ArrayList();
            it2 = collectionValues2.iterator();
            while (it2.hasNext()) {
                Instant expirationDate = ((EventContract) it2.next()).getExpirationDate();
                Long lBoxLong2 = expirationDate != null ? boxing.boxLong(expirationDate.toEpochMilli()) : null;
                if (lBoxLong2 != null) {
                    arrayList3.add(lBoxLong2);
                }
            }
            return new EventContractEvent(iScale, jLongValue, (Long) CollectionsKt.maxOrNull((Iterable) arrayList3));
        }
        ResultKt.throwOnFailure(objFirst);
        map = (Map) objFirst;
        EventContract eventContract = (EventContract) CollectionsKt.firstOrNull(map.values());
        if (eventContract == null || (eventId = eventContract.getEventId()) == null) {
            uiEcEvent = null;
            if (uiEcEvent != null) {
                iScale = tickSize.scale();
            }
            Collection collectionValues3 = map.values();
            ArrayList arrayList22 = new ArrayList();
            it = collectionValues3.iterator();
            while (it.hasNext()) {
            }
            Long l2 = (Long) CollectionsKt.minOrNull((Iterable) arrayList22);
            if (l2 == null) {
            }
            Collection collectionValues22 = map.values();
            ArrayList arrayList32 = new ArrayList();
            it2 = collectionValues22.iterator();
            while (it2.hasNext()) {
            }
            return new EventContractEvent(iScale, jLongValue, (Long) CollectionsKt.maxOrNull((Iterable) arrayList32));
        }
        Flow<UiEcEvent> flowStreamEvent = this.eventStore.streamEvent(eventId);
        c170091.L$0 = map;
        c170091.label = 2;
        objFirst = FlowKt.firstOrNull(flowStreamEvent, c170091);
    }
}
