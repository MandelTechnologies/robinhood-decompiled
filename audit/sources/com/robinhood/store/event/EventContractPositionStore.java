package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.event.p186db.ceres.EventContractPosition;
import com.robinhood.android.models.event.p186db.ceres.EventContractPositionWithEvent;
import com.robinhood.android.models.event.p186db.ceres.UiEventContractPosition;
import com.robinhood.android.models.event.p186db.dao.EventContractPositionDao;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetCurrentPositionsByContractIDResponseDto;
import com.robinhood.ceres.p284v1.GetCurrentPositionsResponseDto;
import com.robinhood.idl.Response;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.EventContractPositionStore;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventContractPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002,-B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0018J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020 0$2\u0006\u0010%\u001a\u00020\u0010J \u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f0$2\u0006\u0010'\u001a\u00020\u0010J\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001b0$J\u0010\u0010)\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, m3636d2 = {"Lcom/robinhood/store/event/EventContractPositionStore;", "Lcom/robinhood/store/Store;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "eventContractPositionDao", "Lcom/robinhood/android/models/event/db/dao/EventContractPositionDao;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/models/event/db/dao/EventContractPositionDao;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/StoreBundle;)V", "allPositionsEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Ljava/util/UUID;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsResponseDto;", "positionsByContractEndpoint", "Lcom/robinhood/store/event/EventContractPositionStore$ContractPositionArgs;", "Lcom/robinhood/ceres/v1/GetCurrentPositionsByContractIDResponseDto;", "refreshForMissingEventContracts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "allPositionsQuery", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/android/models/event/db/ceres/EventContractPosition;", "positionsForEventQuery", "Lcom/robinhood/store/event/EventContractPositionStore$PositionsForEventArgs;", "", "Lcom/robinhood/android/models/event/db/ceres/UiEventContractPosition;", "positionsForContractQuery", "Lcom/robinhood/android/models/event/db/ceres/EventContractPositionWithEvent;", "streamPositionByContract", "Lkotlinx/coroutines/flow/Flow;", "contractId", "streamPositionByEventId", "moneylineEventId", "streamAllPositions", "refresh", "force", "", "ContractPositionArgs", "PositionsForEventArgs", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EventContractPositionStore extends Store {
    private final IdlPaginatedResponseEndpoint<UUID, Response<GetCurrentPositionsResponseDto>> allPositionsEndpoint;
    private final Query<UUID, List<EventContractPosition>> allPositionsQuery;
    private final Ceres ceres;
    private final EventContractPositionDao eventContractPositionDao;
    private final EventStore eventStore;
    private final FuturesAccountStore futuresAccountStore;
    private final IdlPaginatedResponseEndpoint<ContractPositionArgs, Response<GetCurrentPositionsByContractIDResponseDto>> positionsByContractEndpoint;
    private final Query<ContractPositionArgs, List<EventContractPositionWithEvent>> positionsForContractQuery;
    private final Query<PositionsForEventArgs, Map<UUID, UiEventContractPosition>> positionsForEventQuery;

    /* compiled from: EventContractPositionStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore", m3645f = "EventContractPositionStore.kt", m3646l = {100}, m3647m = "refreshForMissingEventContracts")
    /* renamed from: com.robinhood.store.event.EventContractPositionStore$refreshForMissingEventContracts$1 */
    static final class C413631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413631(Continuation<? super C413631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventContractPositionStore.this.refreshForMissingEventContracts(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventContractPositionStore(Ceres ceres, FuturesAccountStore futuresAccountStore, EventContractPositionDao eventContractPositionDao, EventStore eventStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractPositionDao, "eventContractPositionDao");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractPositionDao = eventContractPositionDao;
        this.eventStore = eventStore;
        IdlPaginatedResponseEndpoint.Companion companion = IdlPaginatedResponseEndpoint.INSTANCE;
        this.allPositionsEndpoint = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(companion, new EventContractPositionStore2(this, null), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.allPositionsEndpoint$lambda$0((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.allPositionsEndpoint$lambda$1((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new EventContractPositionStore3(this, null), storeBundle.getClock(), null, 64, null);
        this.positionsByContractEndpoint = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(companion, new EventContractPositionStore4(this, null), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.positionsByContractEndpoint$lambda$2((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.positionsByContractEndpoint$lambda$3((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new EventContractPositionStore5(this, null), storeBundle.getClock(), null, 64, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.allPositionsQuery = Store.create$default(this, companion2, "getAllEventContractPositions", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.allPositionsQuery$lambda$4(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.allPositionsQuery$lambda$5(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.positionsForEventQuery = Store.create$default(this, companion2, "getEventContractPositionsForEvent", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.positionsForEventQuery$lambda$6(this.f$0, (EventContractPositionStore.PositionsForEventArgs) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.positionsForEventQuery$lambda$10(this.f$0, (EventContractPositionStore.PositionsForEventArgs) obj);
            }
        }, false, 8, null);
        this.positionsForContractQuery = Store.create$default(this, companion2, "getEventContractPositionsForContract", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.positionsForContractQuery$lambda$11(this.f$0, (EventContractPositionStore.ContractPositionArgs) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.event.EventContractPositionStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractPositionStore.positionsForContractQuery$lambda$12(this.f$0, (EventContractPositionStore.ContractPositionArgs) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor allPositionsEndpoint$lambda$0(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor allPositionsEndpoint$lambda$1(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor positionsByContractEndpoint$lambda$2(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsByContractIDResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor positionsByContractEndpoint$lambda$3(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetCurrentPositionsByContractIDResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshForMissingEventContracts(Continuation<? super Unit> continuation) {
        C413631 c413631;
        if (continuation instanceof C413631) {
            c413631 = (C413631) continuation;
            int i = c413631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413631.label = i - Integer.MIN_VALUE;
            } else {
                c413631 = new C413631(continuation);
            }
        }
        Object positionContractIdsWithoutEventId = c413631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(positionContractIdsWithoutEventId);
            EventContractPositionDao eventContractPositionDao = this.eventContractPositionDao;
            c413631.label = 1;
            positionContractIdsWithoutEventId = eventContractPositionDao.getPositionContractIdsWithoutEventId(c413631);
            if (positionContractIdsWithoutEventId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(positionContractIdsWithoutEventId);
        }
        this.eventStore.refreshEventContractList((List) positionContractIdsWithoutEventId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allPositionsQuery$lambda$4(EventContractPositionStore eventContractPositionStore, UUID params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlPaginatedResponseEndpoint.DefaultImpls.pollAllPages$default(eventContractPositionStore.allPositionsEndpoint, params, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow allPositionsQuery$lambda$5(EventContractPositionStore eventContractPositionStore, UUID arg) {
        Intrinsics.checkNotNullParameter(arg, "arg");
        return eventContractPositionStore.eventContractPositionDao.getAllPositions(arg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsForEventQuery$lambda$6(EventContractPositionStore eventContractPositionStore, PositionsForEventArgs params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlPaginatedResponseEndpoint.DefaultImpls.pollAllPages$default(eventContractPositionStore.allPositionsEndpoint, params.getAccountId(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsForEventQuery$lambda$10(EventContractPositionStore eventContractPositionStore, PositionsForEventArgs params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final Flow<Map<UUID, List<EventContractPosition>>> allPositionsForEvent = eventContractPositionStore.eventContractPositionDao.getAllPositionsForEvent(params.getAccountId(), params.getMoneylineEventId());
        return new Flow<Map<UUID, ? extends UiEventContractPosition>>() { // from class: com.robinhood.store.event.EventContractPositionStore$positionsForEventQuery$lambda$10$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<UUID, ? extends UiEventContractPosition>> flowCollector, Continuation continuation) {
                Object objCollect = allPositionsForEvent.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventContractPositionStore$positionsForEventQuery$lambda$10$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore$positionsForEventQuery$lambda$10$$inlined$map$1$2", m3645f = "EventContractPositionStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventContractPositionStore$positionsForEventQuery$lambda$10$$inlined$map$1$2$1, reason: invalid class name */
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
                        Map mapEmptyMap = (Map) obj;
                        if (mapEmptyMap == null) {
                            mapEmptyMap = MapsKt.emptyMap();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapEmptyMap.size()));
                        for (Map.Entry entry : mapEmptyMap.entrySet()) {
                            linkedHashMap.put(entry.getKey(), UiEventContractPosition.INSTANCE.createUiPosition((UUID) entry.getKey(), (List) entry.getValue()));
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                            if (((UiEventContractPosition) entry2.getValue()) != null) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(linkedHashMap2, anonymousClass1) == coroutine_suspended) {
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
    public static final Flow positionsForContractQuery$lambda$11(EventContractPositionStore eventContractPositionStore, ContractPositionArgs params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return IdlPaginatedResponseEndpoint.DefaultImpls.pollAllPages$default(eventContractPositionStore.positionsByContractEndpoint, params, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow positionsForContractQuery$lambda$12(EventContractPositionStore eventContractPositionStore, ContractPositionArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return eventContractPositionStore.eventContractPositionDao.getPositionsForContract(args.getContractId(), args.getAccountId());
    }

    public final Flow<UiEventContractPosition> streamPositionByContract(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FuturesAccountStore.streamOptionalEventContractSwapsAccountId$default(this.futuresAccountStore, null, 1, null)), new C41359x3f573cb4(null, this, contractId));
    }

    public final Flow<Map<UUID, UiEventContractPosition>> streamPositionByEventId(UUID moneylineEventId) {
        Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FuturesAccountStore.streamOptionalEventContractSwapsAccountId$default(this.futuresAccountStore, null, 1, null)), new C41361x15faf281(null, this, moneylineEventId));
    }

    public final Flow<List<UiEventContractPosition>> streamAllPositions() {
        return FlowKt.transformLatest(FlowKt.distinctUntilChanged(FuturesAccountStore.streamOptionalEventContractSwapsAccountId$default(this.futuresAccountStore, null, 1, null)), new C41357x58fc2f5d(null, this));
    }

    /* compiled from: EventContractPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore$refresh$1", m3645f = "EventContractPositionStore.kt", m3646l = {211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventContractPositionStore$refresh$1 */
    static final class C413621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413621(boolean z, Continuation<? super C413621> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventContractPositionStore.this.new C413621(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C413621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EventContractPositionStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.store.event.EventContractPositionStore$refresh$1$1", m3645f = "EventContractPositionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.store.event.EventContractPositionStore$refresh$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $force;
            int label;
            final /* synthetic */ EventContractPositionStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EventContractPositionStore eventContractPositionStore, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = eventContractPositionStore;
                this.$force = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$force, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamEventContractSwapsAccountId$default = FuturesAccountStore.streamEventContractSwapsAccountId$default(this.this$0.futuresAccountStore, null, 1, null);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowStreamEventContractSwapsAccountId$default, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                UUID uuid = (UUID) obj;
                if (uuid != null) {
                    this.this$0.allPositionsEndpoint.refreshAllPages(uuid, this.$force);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EventContractPositionStore.this, this.$force, null);
                this.label = 1;
                if (Timeout6.withTimeout(1000L, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refresh$default(EventContractPositionStore eventContractPositionStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        eventContractPositionStore.refresh(z);
    }

    public final void refresh(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C413621(force, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventContractPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractPositionStore$ContractPositionArgs;", "", "contractId", "Ljava/util/UUID;", "accountId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "getAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ContractPositionArgs {
        private final UUID accountId;
        private final UUID contractId;

        public static /* synthetic */ ContractPositionArgs copy$default(ContractPositionArgs contractPositionArgs, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = contractPositionArgs.contractId;
            }
            if ((i & 2) != 0) {
                uuid2 = contractPositionArgs.accountId;
            }
            return contractPositionArgs.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        public final ContractPositionArgs copy(UUID contractId, UUID accountId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new ContractPositionArgs(contractId, accountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContractPositionArgs)) {
                return false;
            }
            ContractPositionArgs contractPositionArgs = (ContractPositionArgs) other;
            return Intrinsics.areEqual(this.contractId, contractPositionArgs.contractId) && Intrinsics.areEqual(this.accountId, contractPositionArgs.accountId);
        }

        public int hashCode() {
            return (this.contractId.hashCode() * 31) + this.accountId.hashCode();
        }

        public String toString() {
            return "ContractPositionArgs(contractId=" + this.contractId + ", accountId=" + this.accountId + ")";
        }

        public ContractPositionArgs(UUID contractId, UUID accountId) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.contractId = contractId;
            this.accountId = accountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final UUID getAccountId() {
            return this.accountId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventContractPositionStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractPositionStore$PositionsForEventArgs;", "", "moneylineEventId", "Ljava/util/UUID;", "accountId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getMoneylineEventId", "()Ljava/util/UUID;", "getAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class PositionsForEventArgs {
        private final UUID accountId;
        private final UUID moneylineEventId;

        public static /* synthetic */ PositionsForEventArgs copy$default(PositionsForEventArgs positionsForEventArgs, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = positionsForEventArgs.moneylineEventId;
            }
            if ((i & 2) != 0) {
                uuid2 = positionsForEventArgs.accountId;
            }
            return positionsForEventArgs.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getMoneylineEventId() {
            return this.moneylineEventId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        public final PositionsForEventArgs copy(UUID moneylineEventId, UUID accountId) {
            Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new PositionsForEventArgs(moneylineEventId, accountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionsForEventArgs)) {
                return false;
            }
            PositionsForEventArgs positionsForEventArgs = (PositionsForEventArgs) other;
            return Intrinsics.areEqual(this.moneylineEventId, positionsForEventArgs.moneylineEventId) && Intrinsics.areEqual(this.accountId, positionsForEventArgs.accountId);
        }

        public int hashCode() {
            return (this.moneylineEventId.hashCode() * 31) + this.accountId.hashCode();
        }

        public String toString() {
            return "PositionsForEventArgs(moneylineEventId=" + this.moneylineEventId + ", accountId=" + this.accountId + ")";
        }

        public PositionsForEventArgs(UUID moneylineEventId, UUID accountId) {
            Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.moneylineEventId = moneylineEventId;
            this.accountId = accountId;
        }

        public final UUID getMoneylineEventId() {
            return this.moneylineEventId;
        }

        public final UUID getAccountId() {
            return this.accountId;
        }
    }
}
