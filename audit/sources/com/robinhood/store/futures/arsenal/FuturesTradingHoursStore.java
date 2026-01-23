package com.robinhood.store.futures.arsenal;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.models.futures.arsenal.dao.FuturesTradingHoursDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesTradingHours;
import com.robinhood.android.models.futures.arsenal.p188db.UiFuturesTradingHours;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.arsenal.proto.p281v1.idl.TradingSessionsDto;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.threeten.extra.Days;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: FuturesTradingHoursStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0012J$\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR,\u0010\u001f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R2\u0010\"\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "arsenalService", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesTradingHoursDao;", "futuresTradingHoursDao", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Lcom/robinhood/android/models/futures/arsenal/dao/FuturesTradingHoursDao;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "contractId", "j$/time/Instant", GoldFeature.INSTANT, "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesTradingHours;", "getTradingHours", "(Ljava/util/UUID;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "now", "", "streamIsInTradingSession", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "getNextOpenTradingSession", "(Ljava/util/UUID;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesTradingHoursDao;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "j$/time/LocalDate", "Lcom/robinhood/arsenal/proto/v1/idl/TradingSessionsDto;", "tradingHoursEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "tradingHoursQuery", "Lcom/robinhood/android/moria/db/Query;", "", "cachedNextOpenTradingSession", "Ljava/util/Map;", "Companion", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesTradingHoursStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final InstrumentService arsenalService;
    private final Map<UUID, FuturesTradingHours.Session> cachedNextOpenTradingSession;
    private final FuturesTradingHoursDao futuresTradingHoursDao;
    private final Endpoint<Tuples2<UUID, LocalDate>, TradingSessionsDto> tradingHoursEndpoint;
    private final Query<Tuples2<UUID, LocalDate>, List<UiFuturesTradingHours>> tradingHoursQuery;

    /* compiled from: FuturesTradingHoursStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesTradingHoursStore", m3645f = "FuturesTradingHoursStore.kt", m3646l = {105}, m3647m = "getNextOpenTradingSession")
    /* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$getNextOpenTradingSession$1 */
    static final class C414931 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C414931(Continuation<? super C414931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesTradingHoursStore.this.getNextOpenTradingSession(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradingHoursStore(InstrumentService arsenalService, FuturesTradingHoursDao futuresTradingHoursDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(arsenalService, "arsenalService");
        Intrinsics.checkNotNullParameter(futuresTradingHoursDao, "futuresTradingHoursDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.arsenalService = arsenalService;
        this.futuresTradingHoursDao = futuresTradingHoursDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        FuturesTradingHoursStore3 futuresTradingHoursStore3 = new FuturesTradingHoursStore3(this, null);
        LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        FuturesTradingHoursStore4 futuresTradingHoursStore4 = new FuturesTradingHoursStore4(futuresTradingHoursDao);
        Clock clock = storeBundle.getClock();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "ofHours(...)");
        this.tradingHoursEndpoint = companion.create(futuresTradingHoursStore3, logoutKillswitch, futuresTradingHoursStore4, clock, new DefaultStaleDecider(durationOfHours, storeBundle.getClock()));
        this.tradingHoursQuery = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryTradingHours", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradingHoursStore.tradingHoursQuery$lambda$0(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesTradingHoursStore.tradingHoursQuery$lambda$1(this.f$0, (Tuples2) obj);
            }
        }, false, 16, null);
        this.cachedNextOpenTradingSession = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object tradingHoursEndpoint$insert(FuturesTradingHoursDao futuresTradingHoursDao, TradingSessionsDto tradingSessionsDto, Continuation continuation) {
        futuresTradingHoursDao.insert(tradingSessionsDto);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job tradingHoursQuery$lambda$0(FuturesTradingHoursStore futuresTradingHoursStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UUID uuid = (UUID) tuples2.component1();
        LocalDate localDate = (LocalDate) tuples2.component2();
        Endpoint.DefaultImpls.refresh$default(futuresTradingHoursStore.tradingHoursEndpoint, Tuples4.m3642to(uuid, localDate), false, null, 6, null);
        return Endpoint.DefaultImpls.refresh$default(futuresTradingHoursStore.tradingHoursEndpoint, Tuples4.m3642to(uuid, localDate.plusDays(1L)), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow tradingHoursQuery$lambda$1(FuturesTradingHoursStore futuresTradingHoursStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        UUID uuid = (UUID) tuples2.component1();
        LocalDate localDate = (LocalDate) tuples2.component2();
        LocalDate localDatePlusDays = localDate.plusDays(1L);
        FuturesTradingHoursDao futuresTradingHoursDao = futuresTradingHoursStore.futuresTradingHoursDao;
        Intrinsics.checkNotNull(localDatePlusDays);
        return futuresTradingHoursDao.getTradingHours(uuid, localDate, localDatePlusDays);
    }

    public final Flow<List<UiFuturesTradingHours>> getTradingHours(UUID contractId, Instant instant) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(instant, "instant");
        final Flow<List<UiFuturesTradingHours>> flowAsFlow = this.tradingHoursQuery.asFlow(Tuples4.m3642to(contractId, Instants.toLocalDate(instant, ZoneIds.INSTANCE.getUTC())));
        return new Flow<List<? extends UiFuturesTradingHours>>() { // from class: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$getTradingHours$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$getTradingHours$$inlined$filter$1$2 */
            public static final class C414922<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$getTradingHours$$inlined$filter$1$2", m3645f = "FuturesTradingHoursStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$getTradingHours$$inlined$filter$1$2$1, reason: invalid class name */
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
                        return C414922.this.emit(null, this);
                    }
                }

                public C414922(FlowCollector flowCollector) {
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
                        if (((List) obj).size() == 2) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends UiFuturesTradingHours>> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C414922(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* compiled from: FuturesTradingHoursStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$streamIsInTradingSession$1", m3645f = "FuturesTradingHoursStore.kt", m3646l = {76, 82, 83, 84, 86}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$streamIsInTradingSession$1 */
    static final class C414951 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ Instant $now;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414951(UUID uuid, Instant instant, Continuation<? super C414951> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
            this.$now = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414951 c414951 = FuturesTradingHoursStore.this.new C414951(this.$contractId, this.$now, continuation);
            c414951.L$0 = obj;
            return c414951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414951) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r13, r12) != r0) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object next;
            FlowCollector flowCollector2;
            FuturesTradingHours.Session session;
            long epochMilli;
            FlowCollector flowCollector3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Flow<List<UiFuturesTradingHours>> tradingHours = FuturesTradingHoursStore.this.getTradingHours(this.$contractId, this.$now);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FlowKt.first(tradingHours, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    session = (FuturesTradingHours.Session) this.L$1;
                    flowCollector2 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    epochMilli = session.getEndTime().toEpochMilli() - this.$now.toEpochMilli();
                    this.L$0 = flowCollector2;
                    this.L$1 = null;
                    this.label = 3;
                    if (DelayKt.delay(epochMilli, this) != coroutine_suspended) {
                        flowCollector3 = flowCollector2;
                        Flow flowStreamIsInTradingSession$default = FuturesTradingHoursStore.streamIsInTradingSession$default(FuturesTradingHoursStore.this, this.$contractId, null, 2, null);
                        this.L$0 = null;
                        this.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                Flow flowStreamIsInTradingSession$default2 = FuturesTradingHoursStore.streamIsInTradingSession$default(FuturesTradingHoursStore.this, this.$contractId, null, 2, null);
                this.L$0 = null;
                this.label = 4;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((UiFuturesTradingHours) it.next()).getSessions());
            }
            Instant instant = this.$now;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                FuturesTradingHours.Session session2 = (FuturesTradingHours.Session) next;
                if (instant.compareTo(session2.getStartTime()) >= 0 && instant.compareTo(session2.getEndTime()) < 0) {
                    break;
                }
            }
            FuturesTradingHours.Session session3 = (FuturesTradingHours.Session) next;
            if (session3 != null) {
                Boolean boolBoxBoolean = boxing.boxBoolean(session3.isTrading());
                this.L$0 = flowCollector;
                this.L$1 = session3;
                this.label = 2;
                if (flowCollector.emit(boolBoxBoolean, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    session = session3;
                    epochMilli = session.getEndTime().toEpochMilli() - this.$now.toEpochMilli();
                    this.L$0 = flowCollector2;
                    this.L$1 = null;
                    this.label = 3;
                    if (DelayKt.delay(epochMilli, this) != coroutine_suspended) {
                    }
                }
            } else {
                Boolean boolBoxBoolean2 = boxing.boxBoolean(true);
                this.L$0 = null;
                this.label = 5;
            }
            return coroutine_suspended;
        }
    }

    public static /* synthetic */ Flow streamIsInTradingSession$default(FuturesTradingHoursStore futuresTradingHoursStore, UUID uuid, Instant instant, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = Instant.now();
        }
        return futuresTradingHoursStore.streamIsInTradingSession(uuid, instant);
    }

    public final Flow<Boolean> streamIsInTradingSession(UUID contractId, Instant now) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(now, "now");
        return FlowKt.flow(new C414951(contractId, now, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getNextOpenTradingSession(UUID uuid, Instant instant, Continuation<? super FuturesTradingHours.Session> continuation) {
        C414931 c414931;
        if (continuation instanceof C414931) {
            c414931 = (C414931) continuation;
            int i = c414931.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414931.label = i - Integer.MIN_VALUE;
            } else {
                c414931 = new C414931(continuation);
            }
        }
        Object nextOpenTradingSession$lib_store_futures_externalDebug = c414931.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c414931.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(nextOpenTradingSession$lib_store_futures_externalDebug);
            FuturesTradingHours.Session session = this.cachedNextOpenTradingSession.get(uuid);
            if (session != null && session.getEndTime().toEpochMilli() > instant.toEpochMilli()) {
                return session;
            }
            Companion companion = INSTANCE;
            C414942 c414942 = new C414942(this);
            c414931.L$0 = uuid;
            c414931.label = 1;
            nextOpenTradingSession$lib_store_futures_externalDebug = companion.getNextOpenTradingSession$lib_store_futures_externalDebug(uuid, c414942, instant, c414931);
            if (nextOpenTradingSession$lib_store_futures_externalDebug == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) c414931.L$0;
            ResultKt.throwOnFailure(nextOpenTradingSession$lib_store_futures_externalDebug);
        }
        FuturesTradingHours.Session session2 = (FuturesTradingHours.Session) nextOpenTradingSession$lib_store_futures_externalDebug;
        if (session2 == null) {
            return null;
        }
        this.cachedNextOpenTradingSession.put(uuid, session2);
        return session2;
    }

    public static /* synthetic */ Object getNextOpenTradingSession$default(FuturesTradingHoursStore futuresTradingHoursStore, UUID uuid, Instant instant, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = Instant.now();
        }
        return futuresTradingHoursStore.getNextOpenTradingSession(uuid, instant, continuation);
    }

    /* compiled from: FuturesTradingHoursStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$getNextOpenTradingSession$2 */
    /* synthetic */ class C414942 extends FunctionReferenceImpl implements Function2<UUID, Instant, Flow<? extends List<? extends UiFuturesTradingHours>>> {
        C414942(Object obj) {
            super(2, obj, FuturesTradingHoursStore.class, "getTradingHours", "getTradingHours(Ljava/util/UUID;Ljava/time/Instant;)Lkotlinx/coroutines/flow/Flow;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Flow<List<UiFuturesTradingHours>> invoke(UUID p0, Instant p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            return ((FuturesTradingHoursStore) this.receiver).getTradingHours(p0, p1);
        }
    }

    /* compiled from: FuturesTradingHoursStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00062\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/futures/arsenal/FuturesTradingHoursStore$Companion;", "", "<init>", "()V", "Ljava/util/UUID;", "contractId", "Lkotlin/Function2;", "j$/time/Instant", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/futures/arsenal/db/UiFuturesTradingHours;", "getTradingHours", "now", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesTradingHours$Session;", "getNextOpenTradingSession$lib_store_futures_externalDebug", "(Ljava/util/UUID;Lkotlin/jvm/functions/Function2;Lj$/time/Instant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNextOpenTradingSession", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[LOOP:0: B:21:0x0090->B:23:0x0096, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d3 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r15v15, types: [T, j$.time.Instant, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:20:0x0083). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getNextOpenTradingSession$lib_store_futures_externalDebug(UUID uuid, Function2<? super UUID, ? super Instant, ? extends Flow<? extends List<UiFuturesTradingHours>>> function2, Instant instant, Continuation<? super FuturesTradingHours.Session> continuation) {
            FuturesTradingHoursStore2 futuresTradingHoursStore2;
            Ref.ObjectRef objectRef;
            int i;
            UUID uuid2;
            int i2;
            FuturesTradingHoursStore2 futuresTradingHoursStore22;
            Instant instant2;
            Function2<? super UUID, ? super Instant, ? extends Flow<? extends List<UiFuturesTradingHours>>> function22;
            Object next;
            if (continuation instanceof FuturesTradingHoursStore2) {
                futuresTradingHoursStore2 = (FuturesTradingHoursStore2) continuation;
                int i3 = futuresTradingHoursStore2.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    futuresTradingHoursStore2.label = i3 - Integer.MIN_VALUE;
                } else {
                    futuresTradingHoursStore2 = new FuturesTradingHoursStore2(this, continuation);
                }
            }
            Object obj = futuresTradingHoursStore2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = futuresTradingHoursStore2.label;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = new Ref.ObjectRef();
                objectRef.element = instant;
                i = 5;
                uuid2 = uuid;
                i2 = 0;
                futuresTradingHoursStore22 = futuresTradingHoursStore2;
                instant2 = instant;
                function22 = function2;
                if (i2 < i) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = futuresTradingHoursStore2.I$1;
                int i5 = futuresTradingHoursStore2.I$0;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) futuresTradingHoursStore2.L$3;
                Instant instant3 = (Instant) futuresTradingHoursStore2.L$2;
                Function2<? super UUID, ? super Instant, ? extends Flow<? extends List<UiFuturesTradingHours>>> function23 = (Function2) futuresTradingHoursStore2.L$1;
                UUID uuid3 = (UUID) futuresTradingHoursStore2.L$0;
                ResultKt.throwOnFailure(obj);
                int i6 = i5;
                uuid2 = uuid3;
                FuturesTradingHoursStore2 futuresTradingHoursStore23 = futuresTradingHoursStore2;
                Ref.ObjectRef objectRef3 = objectRef2;
                function22 = function23;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((UiFuturesTradingHours) it.next()).getSessions());
                }
                Iterator it2 = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$Companion$getNextOpenTradingSession$lambda$4$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((FuturesTradingHours.Session) t).getStartTime(), ((FuturesTradingHours.Session) t2).getStartTime());
                    }
                }).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = it2.next();
                        FuturesTradingHours.Session session = (FuturesTradingHours.Session) next;
                        if (session.isTrading() && instant3.compareTo(session.getEndTime()) < 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                FuturesTradingHours.Session session2 = (FuturesTradingHours.Session) next;
                if (session2 == null) {
                    return session2;
                }
                ?? Plus = ((Instant) objectRef3.element).plus((TemporalAmount) Days.m3991of(1));
                Intrinsics.checkNotNullExpressionValue(Plus, "plus(...)");
                objectRef3.element = Plus;
                i2++;
                objectRef = objectRef3;
                instant2 = instant3;
                i = i6;
                futuresTradingHoursStore22 = futuresTradingHoursStore23;
                if (i2 < i) {
                    return null;
                }
                Flow<? extends List<UiFuturesTradingHours>> flowInvoke = function22.invoke(uuid2, objectRef.element);
                futuresTradingHoursStore22.L$0 = uuid2;
                futuresTradingHoursStore22.L$1 = function22;
                futuresTradingHoursStore22.L$2 = instant2;
                futuresTradingHoursStore22.L$3 = objectRef;
                futuresTradingHoursStore22.I$0 = i;
                futuresTradingHoursStore22.I$1 = i2;
                futuresTradingHoursStore22.label = 1;
                Object objFirst = FlowKt.first(flowInvoke, futuresTradingHoursStore22);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Instant instant4 = instant2;
                objectRef3 = objectRef;
                obj = objFirst;
                futuresTradingHoursStore23 = futuresTradingHoursStore22;
                i6 = i;
                instant3 = instant4;
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = ((List) obj).iterator();
                while (it3.hasNext()) {
                }
                Iterator it22 = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.robinhood.store.futures.arsenal.FuturesTradingHoursStore$Companion$getNextOpenTradingSession$lambda$4$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((FuturesTradingHours.Session) t).getStartTime(), ((FuturesTradingHours.Session) t2).getStartTime());
                    }
                }).iterator();
                while (true) {
                    if (!it22.hasNext()) {
                    }
                }
                FuturesTradingHours.Session session22 = (FuturesTradingHours.Session) next;
                if (session22 == null) {
                }
            }
        }

        /* renamed from: getNextOpenTradingSession$lib_store_futures_externalDebug$default */
        public static /* synthetic */ Object m2964x5fb5a522(Companion companion, UUID uuid, Function2 function2, Instant instant, Continuation continuation, int i, Object obj) {
            if ((i & 4) != 0) {
                instant = Instant.now();
            }
            return companion.getNextOpenTradingSession$lib_store_futures_externalDebug(uuid, function2, instant, continuation);
        }
    }
}
