package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaIncentives;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.matcha.MatchaIncentive;
import com.robinhood.models.p320db.matcha.dao.MatchaIncentiveDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MatchaIncentiveTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: MatchaIncentivesStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaIncentivesStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "dao", "Lcom/robinhood/models/db/matcha/dao/MatchaIncentiveDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/models/db/matcha/dao/MatchaIncentiveDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIncentives;", "query", "Lcom/robinhood/android/moria/db/Query;", "", "Lcom/robinhood/models/db/matcha/MatchaIncentive;", "queryById", "Ljava/util/UUID;", "stream", "Lio/reactivex/Observable;", "streamMatchaIncentive", "Lkotlinx/coroutines/flow/Flow;", "id", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaIncentivesStore extends Store {
    private final MatchaIncentiveDao dao;
    private final Endpoint<Unit, ApiMatchaIncentives> endpoint;
    private final HistoryLoader.Callbacks<MatchaIncentive> historyLoaderCallbacks;
    private final MatchaApi matchaApi;
    private final Query<Unit, List<MatchaIncentive>> query;
    private final Query<UUID, MatchaIncentive> queryById;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaIncentivesStore(MatchaApi matchaApi, MatchaIncentiveDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MatchaIncentivesStore2(this, null), getLogoutKillswitch(), new MatchaIncentivesStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.query = Store.create$default(this, companion, "queryMatchIncentives", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.queryById = Store.create$default(this, companion, "queryMatchIncentives", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesStore.queryById$lambda$2(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesStore.queryById$lambda$3(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.MATCHA_INCENTIVE);
                final Flow flowStreamMatchaIncentive = this.this$0.streamMatchaIncentive(reference.getSourceId());
                return new Flow<MatchaIncentiveTransaction>() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.store.matcha.MatchaIncentivesStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C287382<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaIncentivesStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "MatchaIncentivesStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.store.matcha.MatchaIncentivesStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C287382.this.emit(null, this);
                            }
                        }

                        public C287382(FlowCollector flowCollector) {
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
                                MatchaIncentiveTransaction matchaIncentiveTransaction = new MatchaIncentiveTransaction((MatchaIncentive) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(matchaIncentiveTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super MatchaIncentiveTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamMatchaIncentive.collect(new C287382(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<MatchaIncentive>() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.MATCHA_INCENTIVE);
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes = SetsKt.emptySet();

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                MatchaIncentivesStore matchaIncentivesStore = this.this$0;
                if (filter.getState() == null || filter.getState() == state) {
                    MatchaIncentivesStore.refresh$default(matchaIncentivesStore, false, 1, null);
                    return FlowKt.filterNotNull(matchaIncentivesStore.dao.countTotal(filter.getSince(), filter.getBefore()));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                MatchaIncentivesStore matchaIncentivesStore = this.this$0;
                if (filter.getState() == null || filter.getState() == state) {
                    return FlowKt.filterNotNull(matchaIncentivesStore.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaIncentive>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                MatchaIncentivesStore matchaIncentivesStore = this.this$0;
                List listEmptyList = CollectionsKt.emptyList();
                if (filter.getState() != null && filter.getState() != state) {
                    return FlowKt.flowOf(listEmptyList);
                }
                MatchaIncentivesStore.refresh$default(matchaIncentivesStore, false, 1, null);
                return matchaIncentivesStore.dao.getLatest(filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaIncentive>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit) : FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaIncentive>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id) : FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaIncentive>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit) : FlowKt.flowOf(CollectionsKt.emptyList());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(MatchaIncentivesStore matchaIncentivesStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(matchaIncentivesStore.endpoint, Unit.INSTANCE, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(MatchaIncentivesStore matchaIncentivesStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return matchaIncentivesStore.dao.getAllMatchaIncentives();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryById$lambda$2(MatchaIncentivesStore matchaIncentivesStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(matchaIncentivesStore.endpoint, Unit.INSTANCE, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryById$lambda$3(MatchaIncentivesStore matchaIncentivesStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return matchaIncentivesStore.dao.getMatchIncentive(id);
    }

    public final Observable<List<MatchaIncentive>> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<MatchaIncentive> streamMatchaIncentive(UUID id) {
        refresh$default(this, false, 1, null);
        return this.queryById.asFlow(id);
    }

    public static /* synthetic */ Job refresh$default(MatchaIncentivesStore matchaIncentivesStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return matchaIncentivesStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<MatchaIncentive> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
