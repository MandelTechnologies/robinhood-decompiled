package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.equities.p034v1.AggregatedBorrowChargeDto;
import bonfire.proto.idl.equities.p034v1.EquitiesService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.BorrowChargeDao;
import com.robinhood.models.p320db.GroupedBorrowCharges;
import com.robinhood.models.p320db.GroupedBorrowCharges2;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.BorrowChargeTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: BorrowChargeStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/BorrowChargeStore;", "Lcom/robinhood/store/Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "equitiesService", "Lbonfire/proto/idl/equities/v1/EquitiesService;", "borrowChargeDao", "Lcom/robinhood/models/dao/BorrowChargeDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lbonfire/proto/idl/equities/v1/EquitiesService;Lcom/robinhood/models/dao/BorrowChargeDao;Lcom/robinhood/store/StoreBundle;)V", "aggregatedBorrowChargeEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lbonfire/proto/idl/equities/v1/AggregatedBorrowChargeDto;", "getGroupedBorrowChargeById", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/GroupedBorrowCharges;", "id", "Ljava/util/UUID;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks$annotations", "()V", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "refresh", "force", "", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BorrowChargeStore extends Store {
    private final Endpoint<Unit, List<AggregatedBorrowChargeDto>> aggregatedBorrowChargeEndpoint;
    private final BorrowChargeDao borrowChargeDao;
    private final EquitiesService equitiesService;
    private final ExperimentsStore experimentsStore;
    private final HistoryLoader.Callbacks<GroupedBorrowCharges> historyLoaderCallbacks;
    private final HistoryTransactionLoader transactionLoader;

    public static /* synthetic */ void getHistoryLoaderCallbacks$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowChargeStore(ExperimentsStore experimentsStore, EquitiesService equitiesService, BorrowChargeDao borrowChargeDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(equitiesService, "equitiesService");
        Intrinsics.checkNotNullParameter(borrowChargeDao, "borrowChargeDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.experimentsStore = experimentsStore;
        this.equitiesService = equitiesService;
        this.borrowChargeDao = borrowChargeDao;
        this.aggregatedBorrowChargeEndpoint = Endpoint.INSTANCE.create(new BorrowChargeStore$aggregatedBorrowChargeEndpoint$1(this, null), getLogoutKillswitch(), new BorrowChargeStore$aggregatedBorrowChargeEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.BorrowChargeStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.BORROW_CHARGE);
                final Flow<GroupedBorrowCharges> groupedBorrowChargeById = this.this$0.getGroupedBorrowChargeById(reference.getSourceId());
                return new Flow<BorrowChargeTransaction>() { // from class: com.robinhood.librobinhood.data.store.BorrowChargeStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.BorrowChargeStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C336262<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BorrowChargeStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "BorrowChargeStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.BorrowChargeStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C336262.this.emit(null, this);
                            }
                        }

                        public C336262(FlowCollector flowCollector) {
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
                                BorrowChargeTransaction borrowChargeTransaction = new BorrowChargeTransaction((GroupedBorrowCharges) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(borrowChargeTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super BorrowChargeTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = groupedBorrowChargeById.collect(new C336262(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<GroupedBorrowCharges>() { // from class: com.robinhood.librobinhood.data.store.BorrowChargeStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.BORROW_CHARGE);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
                this.isInstrumentHistoryLoader = true;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader, reason: from getter */
            public boolean getIsInstrumentHistoryLoader() {
                return this.isInstrumentHistoryLoader;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return FlowKt.filterNotNull(this.this$0.borrowChargeDao.countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), GroupedBorrowCharges2.getStatuses(filter.getState()), filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.borrowChargeDao.countLater(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), GroupedBorrowCharges2.getStatuses(filter.getState()), filter.getStaticAssetId(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GroupedBorrowCharges>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return FlowKt.onStart(this.this$0.borrowChargeDao.getLatest(GroupedBorrowCharges2.getStatuses(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit), new BorrowChargeStore$historyLoaderCallbacks$1$getLatest$1(null));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GroupedBorrowCharges>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.onStart(this.this$0.borrowChargeDao.getLater(filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit, filter.getStaticAssetId(), GroupedBorrowCharges2.getStatuses(filter.getState())), new BorrowChargeStore$historyLoaderCallbacks$1$getLater$1(null));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GroupedBorrowCharges>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.onStart(this.this$0.borrowChargeDao.getGroupedBorrowCharges(filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, filter.getStaticAssetId(), GroupedBorrowCharges2.getStatuses(filter.getState())), new BorrowChargeStore$historyLoaderCallbacks$1$get$1(null));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<GroupedBorrowCharges>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.onStart(this.this$0.borrowChargeDao.getEarlierGroupedBorrowCharges(filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit, id, filter.getStaticAssetId(), GroupedBorrowCharges2.getStatuses(filter.getState())), new BorrowChargeStore$historyLoaderCallbacks$1$getEarlier$1(null));
            }
        };
    }

    public final Flow<GroupedBorrowCharges> getGroupedBorrowChargeById(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.filterNotNull(this.borrowChargeDao.getGroupedBorrowChargeById(id));
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<GroupedBorrowCharges> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    /* compiled from: BorrowChargeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.BorrowChargeStore$refresh$1", m3645f = "BorrowChargeStore.kt", m3646l = {211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.BorrowChargeStore$refresh$1 */
    static final class C336271 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C336271(boolean z, Continuation<? super C336271> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BorrowChargeStore.this.new C336271(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C336271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BorrowChargeStore.this.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 4, null);
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamStateFlow$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                Endpoint.DefaultImpls.refresh$default(BorrowChargeStore.this.aggregatedBorrowChargeEndpoint, Unit.INSTANCE, this.$force, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void refresh(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C336271(force, null), 3, null);
    }
}
