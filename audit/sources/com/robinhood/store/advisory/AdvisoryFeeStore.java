package com.robinhood.store.advisory;

import advisory.proto.p008v1.GetAdvisoryFeesListRequestDto;
import advisory.proto.p008v1.RestAdvisoryService;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.advisory.dao.AdvisoryFeeDao;
import com.robinhood.models.advisory.p304db.fee.AdvisoryFee;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.AdvisoryFeeTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: AdvisoryFeeStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisoryFeeStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/models/advisory/dao/AdvisoryFeeDao;", "advisoryService", "Ladvisory/proto/v1/RestAdvisoryService;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/advisory/dao/AdvisoryFeeDao;Ladvisory/proto/v1/RestAdvisoryService;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/store/StoreBundle;)V", "advisoryFeesEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Ladvisory/proto/v1/GetAdvisoryFeesListRequestDto;", "Lcom/robinhood/models/advisory/db/fee/AdvisoryFee;", "streamAdvisoryFee", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "refreshAllPages", "", "force", "", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisoryFeeStore extends Store {
    private final PaginatedEndpoint<GetAdvisoryFeesListRequestDto, AdvisoryFee> advisoryFeesEndpoint;
    private final RestAdvisoryService advisoryService;
    private final AdvisoryFeeDao dao;
    private final HistoryLoader.Callbacks<AdvisoryFee> historyLoaderCallbacks;
    private final RegionGateProvider regionGateProvider;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisoryFeeStore(AdvisoryFeeDao dao, RestAdvisoryService advisoryService, RegionGateProvider regionGateProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(advisoryService, "advisoryService");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.advisoryService = advisoryService;
        this.regionGateProvider = regionGateProvider;
        this.advisoryFeesEndpoint = PaginatedEndpoint.INSTANCE.createWithParams(new AdvisoryFeeStore2(this, null), getLogoutKillswitch(), new AdvisoryFeeStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_HOUR(), storeBundle.getClock()));
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.advisory.AdvisoryFeeStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.ADVISORY_FEE);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.dao.streamAdvisoryFee(reference.getSourceId()));
                return new Flow<AdvisoryFeeTransaction>() { // from class: com.robinhood.store.advisory.AdvisoryFeeStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.store.advisory.AdvisoryFeeStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C413092<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryFeeStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "AdvisoryFeeStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.store.advisory.AdvisoryFeeStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C413092.this.emit(null, this);
                            }
                        }

                        public C413092(FlowCollector flowCollector) {
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
                                AdvisoryFeeTransaction advisoryFeeTransaction = new AdvisoryFeeTransaction((AdvisoryFee) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(advisoryFeeTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super AdvisoryFeeTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C413092(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<AdvisoryFee>() { // from class: com.robinhood.store.advisory.AdvisoryFeeStore$historyLoaderCallbacks$1

            /* compiled from: AdvisoryFeeStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.store.advisory.AdvisoryFeeStore$historyLoaderCallbacks$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HistoryEvent.State.values().length];
                    try {
                        iArr[HistoryEvent.State.PENDING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HistoryEvent.State.SETTLED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return SetsKt.setOf(HistoryTransactionType.ADVISORY_FEE);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return SetsKt.setOf((Object[]) new BrokerageAccountType[]{BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.JOINT_TENANCY_WITH_ROS});
            }

            private final Set<AdvisoryFee.State> getFeeStates(HistoryLoader.Filter filter) {
                HistoryEvent.State state = filter.getState();
                int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == -1) {
                    return CollectionsKt.toSet(AdvisoryFee.State.getEntries());
                }
                if (i == 1) {
                    return SetsKt.setOf(AdvisoryFee.State.PENDING);
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return SetsKt.setOf((Object[]) new AdvisoryFee.State[]{AdvisoryFee.State.CHARGED, AdvisoryFee.State.REVERSED});
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                AdvisoryFeeStore.refreshAllPages$default(this.this$0, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getFeeStates(filter)));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getFeeStates(filter)));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisoryFee>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                AdvisoryFeeStore.refreshAllPages$default(this.this$0, false, 1, null);
                return this.this$0.dao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getFeeStates(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisoryFee>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getFeeStates(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisoryFee>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getFeeStates(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisoryFee>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getFeeStates(filter));
            }
        };
    }

    public final Flow<AdvisoryFee> streamAdvisoryFee(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.dao.streamAdvisoryFee(id);
    }

    /* compiled from: AdvisoryFeeStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryFeeStore$refreshAllPages$1", m3645f = "AdvisoryFeeStore.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.advisory.AdvisoryFeeStore$refreshAllPages$1 */
    static final class C413101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413101(boolean z, Continuation<? super C413101> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisoryFeeStore.this.new C413101(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C413101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C413101 c413101;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionGateProvider regionGateProvider = AdvisoryFeeStore.this.regionGateProvider;
                AdvisoryRegionGate advisoryRegionGate = AdvisoryRegionGate.INSTANCE;
                this.label = 1;
                c413101 = this;
                obj = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, advisoryRegionGate, false, c413101, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c413101 = this;
            }
            if (((Boolean) obj).booleanValue()) {
                AdvisoryFeeStore.this.advisoryFeesEndpoint.refreshAllPages(new GetAdvisoryFeesListRequestDto(null, null, null, 7, null), c413101.$force);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refreshAllPages$default(AdvisoryFeeStore advisoryFeeStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        advisoryFeeStore.refreshAllPages(z);
    }

    public final void refreshAllPages(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C413101(force, null), 3, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<AdvisoryFee> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
