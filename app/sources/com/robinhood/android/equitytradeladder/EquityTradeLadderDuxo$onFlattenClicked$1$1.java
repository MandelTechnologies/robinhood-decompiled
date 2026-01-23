package com.robinhood.android.equitytradeladder;

import com.robinhood.android.equities.contracts.tradeladder.EquityTradeLadderFragmentKey;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equities.equitytrade.EquityTradeService;
import com.robinhood.android.equities.equitytrade.OrderSubmitResult;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState;
import com.robinhood.android.equitytradeladder.models.EquityLadderOrderState2;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import rosetta.order.OrderEntryPoint;
import rosetta.order.OrderInputFormat;
import rosetta.order.PositionEffect;

/* compiled from: EquityTradeLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {2196, 1368, 1395, 1409, 1438}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityTradeLadderDuxo$onFlattenClicked$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ EquityTradeLadderDataState $ds;
    final /* synthetic */ EquityLadderOrderState $orderState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ EquityTradeLadderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityTradeLadderDuxo$onFlattenClicked$1$1(EquityTradeLadderDuxo equityTradeLadderDuxo, EquityTradeLadderDataState equityTradeLadderDataState, String str, EquityLadderOrderState equityLadderOrderState, Continuation<? super EquityTradeLadderDuxo$onFlattenClicked$1$1> continuation) {
        super(2, continuation);
        this.this$0 = equityTradeLadderDuxo;
        this.$ds = equityTradeLadderDataState;
        this.$accountNumber = str;
        this.$orderState = equityLadderOrderState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityTradeLadderDuxo$onFlattenClicked$1$1(this.this$0, this.$ds, this.$accountNumber, this.$orderState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityTradeLadderDuxo$onFlattenClicked$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1$1", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1$1 */
    static final class C158381 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158381(Continuation<? super C158381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158381 c158381 = new C158381(continuation);
            c158381.L$0 = obj;
            return c158381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158381) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, true, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268433407, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0434  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UUID uuidFromString;
        String symbol;
        Object objAwaitFirst;
        UUID uuid;
        Set<UUID> setUnmodifiableSet;
        boolean z;
        Object objM22704cancelOrders0E7RQCE;
        UUID uuid2;
        Set<UUID> set;
        C158393 c158393;
        UUID uuid3;
        Throwable thM28553exceptionOrNullimpl;
        Object objFetchPositionForInstrument;
        UUID uuid4;
        Position position;
        EquityOrderSide equityOrderSide;
        BigDecimal closableQuantity;
        Object objValidateAndSubmit;
        EquityTradeLadderDuxo equityTradeLadderDuxo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C158381(null));
            UUID uuidGenerateNewRefId = this.this$0.generateNewRefId();
            uuidFromString = UUID.fromString(((EquityTradeLadderFragmentKey) EquityTradeLadderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getInstrumentId());
            PerformanceLogger performanceLogger = this.this$0.performanceLogger;
            PerformanceMetricEventData.Name name = PerformanceMetricEventData.Name.ACTION_COMPLETION;
            UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.TAP;
            Screen screen = this.this$0.ladderScreen;
            String string2 = uuidFromString.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            Instrument instrument = this.$ds.getInstrument();
            if (instrument == null || (symbol = instrument.getSymbol()) == null) {
                symbol = "";
            }
            PerformanceLogger.DefaultImpls.beginMetric$default(performanceLogger, name, null, uuidGenerateNewRefId, new PerformanceMetricEventData.Context(false, false, false, null, null, null, new PerformanceMetricEventData.Context.Action(new UserInteractionEventData(eventType, screen, null, UserInteractionEventData.Action.CLOSE_POSITION, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EquityOrderContext(string2, symbol, null, null, null, null, null, null, null, null, null, null, null, null, null, null, PositionEffect.CLOSE, OrderEntryPoint.ORDER_ENTRY_POINT_LADDER_FLATTEN, OrderInputFormat.ORDER_INPUT_FORMAT_LADDER, null, 589820, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null), null, null, 100, null), null, 2, null), null, null, null, null, null, 4031, null), 2, null);
            OrderStore orderStore = this.this$0.orderStore;
            Intrinsics.checkNotNull(uuidFromString);
            Observable<List<Order>> observableStreamOrderByInstrument = orderStore.streamOrderByInstrument(uuidFromString, this.$accountNumber);
            this.L$0 = uuidGenerateNewRefId;
            this.L$1 = uuidFromString;
            this.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableStreamOrderByInstrument, this);
            if (objAwaitFirst != coroutine_suspended) {
                uuid = uuidGenerateNewRefId;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                set = (Set) this.L$2;
                uuid2 = (UUID) this.L$1;
                uuid = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                objM22704cancelOrders0E7RQCE = ((Result) obj).getValue();
                EquityTradeLadderDuxo equityTradeLadderDuxo2 = this.this$0;
                String str = this.$accountNumber;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM22704cancelOrders0E7RQCE);
                if (thM28553exceptionOrNullimpl == null) {
                    z = true;
                    CrashReporter.INSTANCE.reportNonFatal(new Exception("Bulk cancel failed, using fallback", thM28553exceptionOrNullimpl), false, new EventMetadata(SentryTeam.EQUITIES, MapsKt.mapOf(Tuples4.m3642to("flatten_fallback", "true")), MapsKt.mapOf(Tuples4.m3642to("refId", uuid), Tuples4.m3642to("instrumentId", uuid2.toString()), Tuples4.m3642to("orderIds", set))));
                    equityTradeLadderDuxo2.cancelOrdersFallback(str, set);
                } else {
                    z = true;
                }
                setUnmodifiableSet = set;
                uuidFromString = uuid2;
                c158393 = new C158393(this.this$0, setUnmodifiableSet, null);
                this.L$0 = uuid;
                this.L$1 = uuidFromString;
                this.L$2 = null;
                this.label = 3;
                if (Timeout6.withTimeoutOrNull(7000L, c158393, this) != coroutine_suspended) {
                    uuid3 = uuid;
                    PositionStore positionStore = this.this$0.positionStore;
                    String str2 = this.$accountNumber;
                    Intrinsics.checkNotNull(uuidFromString);
                    this.L$0 = uuid3;
                    this.L$1 = null;
                    this.label = 4;
                    objFetchPositionForInstrument = positionStore.fetchPositionForInstrument(str2, uuidFromString, this);
                    if (objFetchPositionForInstrument != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i == 3) {
                uuidFromString = (UUID) this.L$1;
                uuid3 = (UUID) this.L$0;
                ResultKt.throwOnFailure(obj);
                z = true;
                PositionStore positionStore2 = this.this$0.positionStore;
                String str22 = this.$accountNumber;
                Intrinsics.checkNotNull(uuidFromString);
                this.L$0 = uuid3;
                this.L$1 = null;
                this.label = 4;
                objFetchPositionForInstrument = positionStore2.fetchPositionForInstrument(str22, uuidFromString, this);
                if (objFetchPositionForInstrument != coroutine_suspended) {
                    uuid4 = uuid3;
                    position = (Position) objFetchPositionForInstrument;
                    if (!Position5.isShortPosition(position)) {
                    }
                    EquityOrderSide equityOrderSide2 = equityOrderSide;
                    if (!Position5.isShortPosition(position)) {
                    }
                    if (closableQuantity.compareTo(BigDecimal.ZERO) > 0) {
                    }
                }
                return coroutine_suspended;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                equityTradeLadderDuxo = (EquityTradeLadderDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
                objValidateAndSubmit = obj;
                equityTradeLadderDuxo.handleOrderSubmitResult((OrderSubmitResult) objValidateAndSubmit);
                return Unit.INSTANCE;
            }
            UUID uuid5 = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
            uuid4 = uuid5;
            z = true;
            objFetchPositionForInstrument = obj;
            position = (Position) objFetchPositionForInstrument;
            if (!Position5.isShortPosition(position)) {
                equityOrderSide = EquityOrderSide.BUY;
            } else {
                equityOrderSide = EquityOrderSide.SELL;
            }
            EquityOrderSide equityOrderSide22 = equityOrderSide;
            if (!Position5.isShortPosition(position)) {
                closableQuantity = position.getSharesAvailableForClosingShortPosition();
            } else {
                closableQuantity = position.getClosableQuantity();
            }
            if (closableQuantity.compareTo(BigDecimal.ZERO) > 0) {
                this.this$0.applyMutation(new C158404(null));
                return Unit.INSTANCE;
            }
            EquityOrderIntent equityOrderIntent = EquityLadderOrderState2.toEquityOrderIntent(this.$orderState, uuid4, equityOrderSide22, null, null, null, CollectionsKt.emptyList(), boxing.boxBoolean(z), boxing.boxBoolean(z), closableQuantity);
            EquityTradeLadderDuxo equityTradeLadderDuxo3 = this.this$0;
            EquityTradeService equityTradeService = equityTradeLadderDuxo3.equityTradeService;
            this.L$0 = equityTradeLadderDuxo3;
            this.label = 5;
            objValidateAndSubmit = equityTradeService.validateAndSubmit(equityOrderIntent, this);
            if (objValidateAndSubmit != coroutine_suspended) {
                equityTradeLadderDuxo = equityTradeLadderDuxo3;
                equityTradeLadderDuxo.handleOrderSubmitResult((OrderSubmitResult) objValidateAndSubmit);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        uuidFromString = (UUID) this.L$1;
        uuid = (UUID) this.L$0;
        ResultKt.throwOnFailure(obj);
        objAwaitFirst = obj;
        Intrinsics.checkNotNullExpressionValue(objAwaitFirst, "awaitFirst(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objAwaitFirst) {
            if (((Order) obj2).getState().isPending()) {
                arrayList.add(obj2);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((Order) it.next()).getId());
        }
        setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        if (!setUnmodifiableSet.isEmpty()) {
            OrderStore orderStore2 = this.this$0.orderStore;
            String str3 = this.$accountNumber;
            this.L$0 = uuid;
            this.L$1 = uuidFromString;
            this.L$2 = setUnmodifiableSet;
            this.label = 2;
            objM22704cancelOrders0E7RQCE = orderStore2.m22704cancelOrders0E7RQCE(str3, setUnmodifiableSet, this);
            if (objM22704cancelOrders0E7RQCE != coroutine_suspended) {
                uuid2 = uuidFromString;
                set = setUnmodifiableSet;
                EquityTradeLadderDuxo equityTradeLadderDuxo22 = this.this$0;
                String str4 = this.$accountNumber;
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM22704cancelOrders0E7RQCE);
                if (thM28553exceptionOrNullimpl == null) {
                }
                setUnmodifiableSet = set;
                uuidFromString = uuid2;
                c158393 = new C158393(this.this$0, setUnmodifiableSet, null);
                this.L$0 = uuid;
                this.L$1 = uuidFromString;
                this.L$2 = null;
                this.label = 3;
                if (Timeout6.withTimeoutOrNull(7000L, c158393, this) != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        z = true;
        c158393 = new C158393(this.this$0, setUnmodifiableSet, null);
        this.L$0 = uuid;
        this.L$1 = uuidFromString;
        this.L$2 = null;
        this.label = 3;
        if (Timeout6.withTimeoutOrNull(7000L, c158393, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1$3", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {1400, 1404}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1$3 */
    static final class C158393 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ Set<UUID> $ordersToCancel;
        int label;
        final /* synthetic */ EquityTradeLadderDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C158393(EquityTradeLadderDuxo equityTradeLadderDuxo, Set<UUID> set, Continuation<? super C158393> continuation) {
            super(2, continuation);
            this.this$0 = equityTradeLadderDuxo;
            this.$ordersToCancel = set;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C158393(this.this$0, this.$ordersToCancel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C158393) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Path cross not found for [B:16:0x003b, B:19:0x0045], limit reached: 29 */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[PHI: r7
          0x0033: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v0 java.lang.Object) binds: [B:12:0x0030, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006d -> B:11:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    List list = (List) obj;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!((Order) it.next()).getState().isFinal()) {
                                Duration.Companion companion = Duration.INSTANCE;
                                long duration = Duration3.toDuration(1, DurationUnitJvm.SECONDS);
                                this.label = 2;
                                if (DelayKt.m28786delayVtjQ1oo(duration, this) != coroutine_suspended) {
                                    Flow<List<Order>> flowStreamOrdersById = this.this$0.orderStore.streamOrdersById(this.$ordersToCancel, true);
                                    this.label = 1;
                                    obj = FlowKt.first(flowStreamOrdersById, this);
                                    if (obj != coroutine_suspended) {
                                        List list2 = (List) obj;
                                        if (list2 instanceof Collection) {
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                        }
                    }
                    return boxing.boxBoolean(true);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            Flow<List<Order>> flowStreamOrdersById2 = this.this$0.orderStore.streamOrdersById(this.$ordersToCancel, true);
            this.label = 1;
            obj = FlowKt.first(flowStreamOrdersById2, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* compiled from: EquityTradeLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1$4", m3645f = "EquityTradeLadderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitytradeladder.EquityTradeLadderDuxo$onFlattenClicked$1$1$4 */
    static final class C158404 extends ContinuationImpl7 implements Function2<EquityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C158404(Continuation<? super C158404> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C158404 c158404 = new C158404(continuation);
            c158404.L$0 = obj;
            return c158404;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityTradeLadderDataState equityTradeLadderDataState, Continuation<? super EquityTradeLadderDataState> continuation) {
            return ((C158404) create(equityTradeLadderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return EquityTradeLadderDataState.copy$default((EquityTradeLadderDataState) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, false, null, null, null, false, null, false, false, false, false, false, null, null, null, null, false, false, false, false, false, false, false, false, -1, 268433407, null);
        }
    }
}
