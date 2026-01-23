package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.RhySpendingHistoryUpdatesExperiment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.models.dao.RhyTransactionDao;
import com.robinhood.models.p320db.bonfire.RhyTransaction;
import com.robinhood.models.p320db.bonfire.RhyTransaction3;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RhyHistoryTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
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
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: RhyTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyTransactionStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "dao", "Lcom/robinhood/models/dao/RhyTransactionDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/models/dao/RhyTransactionDao;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "paginatedEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransaction;", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/RhyTransaction;", "streamIsInExperiment", "Lkotlinx/coroutines/flow/Flow;", "", "getStreamIsInExperiment", "()Lkotlinx/coroutines/flow/Flow;", "streamRhyTransaction", "Lio/reactivex/Observable;", "reference", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyTransactionStore extends Store {
    private final RhyBonfireApi api;
    private final RhyTransactionDao dao;
    private final Endpoint<TransactionReference, ApiRhyTransaction> endpoint;
    private final ExperimentsStore experimentsStore;
    private final HistoryLoader.Callbacks<RhyTransaction> historyLoaderCallbacks;
    private final PaginatedEndpoint<Unit, ApiRhyTransaction> paginatedEndpoint;
    private final Query<TransactionReference, RhyTransaction> query;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTransactionStore(RhyBonfireApi api, RhyTransactionDao dao, ExperimentsStore experimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.experimentsStore = experimentsStore;
        this.paginatedEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new RhyTransactionStore5(this, null), getLogoutKillswitch(), new RhyTransactionStore6(this, null), storeBundle.getClock(), null, 16, null);
        Endpoint<TransactionReference, ApiRhyTransaction> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyTransactionStore2(this, null), getLogoutKillswitch(), new RhyTransactionStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default;
        this.query = Store.create$default(this, Query.INSTANCE, "fetchRhyTransaction", CollectionsKt.listOf(new RefreshEach(new RhyTransactionStore7(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTransactionStore.query$lambda$1(this.f$0, (TransactionReference) obj);
            }
        }, false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), RhyTransactionStore9.getGringottsTransactionTypes());
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.streamRhyTransaction(reference)), Integer.MAX_VALUE, null, 2, null);
                return new Flow<RhyHistoryTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C345822<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "RhyTransactionStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C345822.this.emit(null, this);
                            }
                        }

                        public C345822(FlowCollector flowCollector) {
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
                                RhyHistoryTransaction rhyHistoryTransaction = new RhyHistoryTransaction((RhyTransaction) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(rhyHistoryTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super RhyHistoryTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C345822(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<RhyTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = RhyTransactionStore9.getGringottsTransactionTypes();
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
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return Operators.connectWhen(FlowKt.filterNotNull(this.this$0.dao.countTotal(RhyTransaction3.getRhyTransactionStates(filter.getState()), filter.getSince(), filter.getBefore())), this.this$0.getStreamIsInExperiment(), FlowKt.flowOf(0));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return Operators.connectWhen(FlowKt.filterNotNull(this.this$0.dao.countLater(RhyTransaction3.getRhyTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id)), this.this$0.getStreamIsInExperiment(), FlowKt.flowOf(0));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RhyTransaction>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return Operators.connectWhen(this.this$0.dao.getLatest(RhyTransaction3.getRhyTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), limit), this.this$0.getStreamIsInExperiment(), FlowKt.flowOf(CollectionsKt.emptyList()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RhyTransaction>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return Operators.connectWhen(this.this$0.dao.getLater(RhyTransaction3.getRhyTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit), this.this$0.getStreamIsInExperiment(), FlowKt.flowOf(CollectionsKt.emptyList()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RhyTransaction>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return Operators.connectWhen(this.this$0.dao.get(RhyTransaction3.getRhyTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id), this.this$0.getStreamIsInExperiment(), FlowKt.flowOf(CollectionsKt.emptyList()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RhyTransaction>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
                return Operators.connectWhen(this.this$0.dao.getEarlier(RhyTransaction3.getRhyTransactionStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit), this.this$0.getStreamIsInExperiment(), FlowKt.flowOf(CollectionsKt.emptyList()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RhyTransactionStore rhyTransactionStore, TransactionReference it) {
        Flow<RhyTransaction> transaction;
        Intrinsics.checkNotNullParameter(it, "it");
        UUID transactionId = it.getTransactionId();
        return (transactionId == null || (transaction = rhyTransactionStore.dao.getTransaction(transactionId)) == null) ? FlowKt.flowOf((Object) null) : transaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> getStreamIsInExperiment() {
        return FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{RhySpendingHistoryUpdatesExperiment.INSTANCE}, false, null, 6, null));
    }

    public final Observable<RhyTransaction> streamRhyTransaction(final TransactionReference reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Observable<RhyTransaction> observableFlatMap = asObservable(getStreamIsInExperiment()).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore.streamRhyTransaction.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends RhyTransaction> apply(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.booleanValue()) {
                    return RhyTransactionStore.this.query.asObservable(reference);
                }
                return Observable.never();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<RhyTransaction> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
