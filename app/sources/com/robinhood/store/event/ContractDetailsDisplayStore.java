package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.experiments.GameDetailPageExperiment;
import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.dao.ContractDisplayDetailsDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractDisplayDetails;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetContractDisplayDetailsResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.Optional;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: ContractDetailsDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001f2\u0006\u0010 \u001a\u00020\u0010J\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001a0\u001f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0019\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0014\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001a0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "Lcom/robinhood/store/Store;", "contractDisplayDetailsDao", "Lcom/robinhood/android/models/event/db/dao/ContractDisplayDetailsDao;", "instrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/event/db/dao/ContractDisplayDetailsDao;Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/store/StoreBundle;)V", "getContractDisplayDetailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetContractDisplayDetailsResponseDto;", "getMultipleContractDisplayDetailsEndpoint", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractDisplayDetails;", "getContractDisplayDetailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "getMultipleContractDisplayDetailsQuery", "", "sharedIsInGdpExperimentFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "", "streamContractDisplayDetails", "Lkotlinx/coroutines/flow/Flow;", "contractIdWithSide", "contractId", "Ljava/util/UUID;", "side", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "streamMultipleContractDisplayDetails", WebsocketGatewayConstants.DATA_KEY, "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ContractDetailsDisplayStore extends Store {
    private final ContractDisplayDetailsDao contractDisplayDetailsDao;
    private final Endpoint<ContractIdWithSide, Response<GetContractDisplayDetailsResponseDto>> getContractDisplayDetailsEndpoint;
    private final Query<ContractIdWithSide, Optional<ContractDisplayDetails>> getContractDisplayDetailsQuery;
    private final Endpoint<List<ContractIdWithSide>, List<ContractDisplayDetails>> getMultipleContractDisplayDetailsEndpoint;
    private final Query<List<ContractIdWithSide>, Map<ContractIdWithSide, ContractDisplayDetails>> getMultipleContractDisplayDetailsQuery;
    private final InstrumentService instrumentService;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;
    private final SharedFlow<Boolean> sharedIsInGdpExperimentFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDetailsDisplayStore(ContractDisplayDetailsDao contractDisplayDetailsDao, InstrumentService instrumentService, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, ExperimentsProvider experimentsProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(contractDisplayDetailsDao, "contractDisplayDetailsDao");
        Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.contractDisplayDetailsDao = contractDisplayDetailsDao;
        this.instrumentService = instrumentService;
        this.requestHeaderPlugin = requestHeaderPlugin;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<ContractIdWithSide, Response<GetContractDisplayDetailsResponseDto>> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(companion, new ContractDetailsDisplayStore2(this, null), storeBundle.getLogoutKillswitch(), new ContractDetailsDisplayStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getContractDisplayDetailsEndpoint = endpointCreateWithParams$default;
        Endpoint<List<ContractIdWithSide>, List<ContractDisplayDetails>> endpointCreate$default = Endpoint.Companion.create$default(companion, new ContractDetailsDisplayStore5(this, null), storeBundle.getLogoutKillswitch(), new ContractDetailsDisplayStore7(this, null), storeBundle.getClock(), null, 16, null);
        this.getMultipleContractDisplayDetailsEndpoint = endpointCreate$default;
        Query.Companion companion2 = Query.INSTANCE;
        this.getContractDisplayDetailsQuery = Query.Companion.createOptional$default(companion2, storeBundle.getRxFactory(), "getContractDisplayDetails", CollectionsKt.listOf(new RefreshEach(new ContractDetailsDisplayStore4(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.store.event.ContractDetailsDisplayStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractDetailsDisplayStore.getContractDisplayDetailsQuery$lambda$2(this.f$0, (ContractIdWithSide) obj);
            }
        }, false, 16, null);
        this.getMultipleContractDisplayDetailsQuery = Query.Companion.create$default(companion2, storeBundle.getRxFactory(), "getMultipleContractDisplayDetails", CollectionsKt.listOf(new RefreshEach(new ContractDetailsDisplayStore8(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.event.ContractDetailsDisplayStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContractDetailsDisplayStore.getMultipleContractDisplayDetailsQuery$lambda$9(this.f$0, (List) obj);
            }
        }, false, 16, null);
        this.sharedIsInGdpExperimentFlow = FlowKt.shareIn(ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsProvider, new Experiment[]{GameDetailPageExperiment.INSTANCE}, false, null, 4, null), getStoreScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getContractDisplayDetailsQuery$lambda$2(ContractDetailsDisplayStore contractDetailsDisplayStore, ContractIdWithSide params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final Flow flowFilterNotNull = FlowKt.filterNotNull(contractDetailsDisplayStore.contractDisplayDetailsDao.get(params.getContractId(), params.getSide()));
        return new Flow<ContractDisplayDetails>() { // from class: com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsQuery$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsQuery$lambda$2$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsQuery$lambda$2$$inlined$map$1$2", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getContractDisplayDetailsQuery$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        ContractDisplayDetails contractDisplayDetails = (ContractDisplayDetails) obj;
                        if (StringsKt.isBlank(contractDisplayDetails.getContractTitleName())) {
                            contractDisplayDetails = null;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(contractDisplayDetails, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ContractDisplayDetails> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getMultipleContractDisplayDetailsQuery$lambda$9(ContractDetailsDisplayStore contractDetailsDisplayStore, List params) {
        Intrinsics.checkNotNullParameter(params, "params");
        List list = params;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContractIdWithSide) it.next()).getContractId());
        }
        Set<UUID> set = CollectionsKt.toSet(arrayList);
        final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            ContractIdWithSide contractIdWithSide = (ContractIdWithSide) obj;
            linkedHashMap.put(Tuples4.m3642to(contractIdWithSide.getContractId(), contractIdWithSide.getSide()), obj);
        }
        final Flow<List<ContractDisplayDetails>> batch = contractDetailsDisplayStore.contractDisplayDetailsDao.getBatch(set);
        return new Flow<Map<ContractIdWithSide, ? extends ContractDisplayDetails>>() { // from class: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsQuery$lambda$9$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Map<ContractIdWithSide, ? extends ContractDisplayDetails>> flowCollector, Continuation continuation) {
                Object objCollect = batch.collect(new AnonymousClass2(flowCollector, linkedHashMap), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsQuery$lambda$9$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Map $paramsByContractIdAndSide$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsQuery$lambda$9$$inlined$map$1$2", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$getMultipleContractDisplayDetailsQuery$lambda$9$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, Map map) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$paramsByContractIdAndSide$inlined = map;
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
                        for (ContractDisplayDetails contractDisplayDetails : (List) obj) {
                            ContractIdWithSide contractIdWithSide = (ContractIdWithSide) this.$paramsByContractIdAndSide$inlined.get(Tuples4.m3642to(contractDisplayDetails.getContractId(), contractDisplayDetails.getSide()));
                            Tuples2 tuples2M3642to = null;
                            if (contractIdWithSide != null) {
                                if (!boxing.boxBoolean(!StringsKt.isBlank(contractDisplayDetails.getContractTitleName())).booleanValue()) {
                                    contractDisplayDetails = null;
                                }
                                tuples2M3642to = Tuples4.m3642to(contractIdWithSide, contractDisplayDetails);
                            }
                            if (tuples2M3642to != null) {
                                arrayList.add(tuples2M3642to);
                            }
                        }
                        Map map = MapsKt.toMap(arrayList);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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

    public final Flow<ContractDisplayDetails> streamContractDisplayDetails(ContractIdWithSide contractIdWithSide) {
        Intrinsics.checkNotNullParameter(contractIdWithSide, "contractIdWithSide");
        final Flow<Optional<ContractDisplayDetails>> flowAsFlow = this.getContractDisplayDetailsQuery.asFlow(contractIdWithSide);
        return Operators.connectWhen(new Flow<ContractDisplayDetails>() { // from class: com.robinhood.store.event.ContractDetailsDisplayStore$streamContractDisplayDetails$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ContractDisplayDetails> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$streamContractDisplayDetails$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.ContractDetailsDisplayStore$streamContractDisplayDetails$$inlined$map$1$2", m3645f = "ContractDetailsDisplayStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.ContractDetailsDisplayStore$streamContractDisplayDetails$$inlined$map$1$2$1, reason: invalid class name */
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

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
        }, this.sharedIsInGdpExperimentFlow, FlowKt.flowOf((Object) null));
    }

    public final Flow<ContractDisplayDetails> streamContractDisplayDetails(UUID contractId, ContractSide side) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        return streamContractDisplayDetails(new ContractIdWithSide(contractId, side));
    }

    public final Flow<Map<ContractIdWithSide, ContractDisplayDetails>> streamMultipleContractDisplayDetails(List<ContractIdWithSide> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.isEmpty() ? FlowKt.flowOf(MapsKt.emptyMap()) : this.getMultipleContractDisplayDetailsQuery.asFlow(data);
    }
}
