package com.robinhood.store.advisory;

import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.advisory.dao.AdvisorTradesDao;
import com.robinhood.models.advisory.p304db.trade.AdvisorTrade;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.AdvisorTradeTransaction;
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
import yoda.service.RestYoda;
import yoda.service.dashboard.ListAdvisorTradesRequestDto;

/* compiled from: AdvisorTradesStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/store/advisory/AdvisorTradesStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "yodaApi", "Lyoda/service/RestYoda;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/advisory/dao/AdvisorTradesDao;Lcom/robinhood/android/regiongate/RegionGateProvider;Lyoda/service/RestYoda;Lcom/robinhood/store/StoreBundle;)V", "advisorTradesEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lyoda/service/dashboard/ListAdvisorTradesRequestDto;", "Lcom/robinhood/models/advisory/db/trade/AdvisorTrade;", "streamAdvisorTrade", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "refresh", "", "refreshAllPages", "", "force", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-advisory_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class AdvisorTradesStore extends Store {
    private final PaginatedEndpoint<ListAdvisorTradesRequestDto, AdvisorTrade> advisorTradesEndpoint;
    private final AdvisorTradesDao dao;
    private final HistoryLoader.Callbacks<AdvisorTrade> historyLoaderCallbacks;
    private final RegionGateProvider regionGateProvider;
    private final HistoryTransactionLoader transactionLoader;
    private final RestYoda yodaApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorTradesStore(AdvisorTradesDao dao, RegionGateProvider regionGateProvider, RestYoda yodaApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(yodaApi, "yodaApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        this.regionGateProvider = regionGateProvider;
        this.yodaApi = yodaApi;
        this.advisorTradesEndpoint = PaginatedEndpoint.INSTANCE.createWithParams(new AdvisorTradesStore2(this, null), getLogoutKillswitch(), new AdvisorTradesStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_HOUR(), storeBundle.getClock()));
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.advisory.AdvisorTradesStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.ADVISOR_TRADE);
                final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.dao.streamAdvisorTrade(reference.getSourceId()));
                return new Flow<AdvisorTradeTransaction>() { // from class: com.robinhood.store.advisory.AdvisorTradesStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.store.advisory.AdvisorTradesStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C413052<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisorTradesStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "AdvisorTradesStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.store.advisory.AdvisorTradesStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C413052.this.emit(null, this);
                            }
                        }

                        public C413052(FlowCollector flowCollector) {
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
                                AdvisorTradeTransaction advisorTradeTransaction = new AdvisorTradeTransaction((AdvisorTrade) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(advisorTradeTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super AdvisorTradeTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C413052(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<AdvisorTrade>() { // from class: com.robinhood.store.advisory.AdvisorTradesStore$historyLoaderCallbacks$1

            /* compiled from: AdvisorTradesStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.store.advisory.AdvisorTradesStore$historyLoaderCallbacks$1$WhenMappings */
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

            private final AdvisorTrade.State getAdvisorTradeState(HistoryLoader.Filter filter) {
                HistoryEvent.State state = filter.getState();
                int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i == -1) {
                    return null;
                }
                if (i == 1) {
                    return AdvisorTrade.State.PENDING;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return AdvisorTrade.State.FILLED;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return SetsKt.setOf(HistoryTransactionType.ADVISOR_TRADE);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return SetsKt.setOf((Object[]) new BrokerageAccountType[]{BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.JOINT_TENANCY_WITH_ROS});
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                AdvisorTradesStore.refreshAllPages$default(this.this$0, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getAdvisorTradeState(filter)));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getAdvisorTradeState(filter)));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisorTrade>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                AdvisorTradesStore.refreshAllPages$default(this.this$0, false, 1, null);
                return this.this$0.dao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getAdvisorTradeState(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisorTrade>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getAdvisorTradeState(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisorTrade>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getAdvisorTradeState(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AdvisorTrade>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), getAdvisorTradeState(filter));
            }
        };
    }

    public static /* synthetic */ Flow streamAdvisorTrade$default(AdvisorTradesStore advisorTradesStore, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return advisorTradesStore.streamAdvisorTrade(uuid, z);
    }

    public final Flow<AdvisorTrade> streamAdvisorTrade(UUID id, boolean refresh) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (refresh) {
            refreshAllPages$default(this, false, 1, null);
        }
        return this.dao.streamAdvisorTrade(id);
    }

    /* compiled from: AdvisorTradesStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisorTradesStore$refreshAllPages$1", m3645f = "AdvisorTradesStore.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.advisory.AdvisorTradesStore$refreshAllPages$1 */
    static final class C413061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $force;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413061(boolean z, Continuation<? super C413061> continuation) {
            super(2, continuation);
            this.$force = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisorTradesStore.this.new C413061(this.$force, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C413061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C413061 c413061;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionGateProvider regionGateProvider = AdvisorTradesStore.this.regionGateProvider;
                AdvisoryRegionGate advisoryRegionGate = AdvisoryRegionGate.INSTANCE;
                this.label = 1;
                c413061 = this;
                obj = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, advisoryRegionGate, false, c413061, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c413061 = this;
            }
            if (((Boolean) obj).booleanValue()) {
                AdvisorTradesStore.this.advisorTradesEndpoint.refreshAllPages(new ListAdvisorTradesRequestDto(null, 1, null), c413061.$force);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void refreshAllPages$default(AdvisorTradesStore advisorTradesStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        advisorTradesStore.refreshAllPages(z);
    }

    public final void refreshAllPages(boolean force) {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C413061(force, null), 3, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<AdvisorTrade> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
