package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.matcha.MatchaTransfer;
import com.robinhood.models.p320db.matcha.MatchaTransfer2;
import com.robinhood.models.p320db.matcha.dao.MatchaTransferDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MatchaTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import io.reactivex.Single;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: MatchaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u001b2\u0006\u0010\u0016\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/api/matcha/MatchaApi;", "dao", "Lcom/robinhood/models/db/matcha/dao/MatchaTransferDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/models/db/matcha/dao/MatchaTransferDao;Lcom/robinhood/store/StoreBundle;)V", "getTransfer", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;", "getTransfers", "Lcom/robinhood/api/PaginatedEndpoint;", "", "fetchTransfer", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "streamMatchaTransfer", "Lio/reactivex/Observable;", "transferId", "refresh", "force", "", "continueTransferPostVerification", "Lio/reactivex/Single;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaTransferStore extends Store {
    private final MatchaApi api;
    private final MatchaTransferDao dao;
    private final Query<UUID, MatchaTransfer> fetchTransfer;
    private final Endpoint<UUID, ApiMatchaTransfer> getTransfer;
    private final PaginatedEndpoint<Unit, ApiMatchaTransfer> getTransfers;
    private final HistoryLoader.Callbacks<MatchaTransfer> historyLoaderCallbacks;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaTransferStore(MatchaApi api, MatchaTransferDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        Endpoint<UUID, ApiMatchaTransfer> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MatchaTransferStore3(api), getLogoutKillswitch(), new MatchaTransferStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.getTransfer = endpointCreate$default;
        this.getTransfers = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new MatchaTransferStore5(this, null), getLogoutKillswitch(), new MatchaTransferStore6(this, null), storeBundle.getClock(), null, 16, null);
        this.fetchTransfer = Store.create$default(this, Query.INSTANCE, "fetchTransfer", CollectionsKt.listOf(new RefreshEach(new MatchaTransferStore2(endpointCreate$default))), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaTransferStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaTransferStore.fetchTransfer$lambda$0(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.store.matcha.MatchaTransferStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.MATCHA_TRANSFER);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.streamMatchaTransfer(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<MatchaTransaction>() { // from class: com.robinhood.android.store.matcha.MatchaTransferStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.store.matcha.MatchaTransferStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C287552<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaTransferStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "MatchaTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.store.matcha.MatchaTransferStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C287552.this.emit(null, this);
                            }
                        }

                        public C287552(FlowCollector flowCollector) {
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
                                MatchaTransaction matchaTransaction = new MatchaTransaction((MatchaTransfer) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(matchaTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super MatchaTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C287552(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<MatchaTransfer>() { // from class: com.robinhood.android.store.matcha.MatchaTransferStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.MATCHA_TRANSFER);
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
                MatchaTransferStore matchaTransferStore = this.this$0;
                if (filter.getState() == null || filter.getState() == state) {
                    MatchaTransferStore.refresh$default(matchaTransferStore, false, 1, null);
                    return FlowKt.filterNotNull(matchaTransferStore.dao.countTotal(filter.getSince(), filter.getBefore()));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                MatchaTransferStore matchaTransferStore = this.this$0;
                if (filter.getState() == null || filter.getState() == state) {
                    return FlowKt.filterNotNull(matchaTransferStore.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                MatchaTransferStore matchaTransferStore = this.this$0;
                List listEmptyList = CollectionsKt.emptyList();
                if (filter.getState() != null && filter.getState() != state) {
                    return FlowKt.flowOf(listEmptyList);
                }
                MatchaTransferStore.refresh$default(matchaTransferStore, false, 1, null);
                return matchaTransferStore.dao.getLatest(filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit) : FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id) : FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<MatchaTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit) : FlowKt.flowOf(CollectionsKt.emptyList());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fetchTransfer$lambda$0(MatchaTransferStore matchaTransferStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return matchaTransferStore.dao.getMatchaTransfer(id);
    }

    public final Observable<MatchaTransfer> streamMatchaTransfer(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return this.fetchTransfer.asObservable(transferId);
    }

    public static /* synthetic */ void refresh$default(MatchaTransferStore matchaTransferStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        matchaTransferStore.refresh(z);
    }

    public final void refresh(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getTransfers, force);
    }

    /* compiled from: MatchaTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/matcha/MatchaTransfer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaTransferStore$continueTransferPostVerification$1", m3645f = "MatchaTransferStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.matcha.MatchaTransferStore$continueTransferPostVerification$1 */
    static final class C287561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super MatchaTransfer>, Object> {
        final /* synthetic */ UUID $transferId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C287561(UUID uuid, Continuation<? super C287561> continuation) {
            super(2, continuation);
            this.$transferId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaTransferStore.this.new C287561(this.$transferId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MatchaTransfer> continuation) {
            return ((C287561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MatchaApi matchaApi = MatchaTransferStore.this.api;
                UUID uuid = this.$transferId;
                this.label = 1;
                obj = matchaApi.continueTransferPostVerification(uuid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return MatchaTransfer2.toDbModel((ApiMatchaTransfer) obj);
        }
    }

    public final Single<MatchaTransfer> continueTransferPostVerification(UUID transferId) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C287561(transferId, null), 1, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<MatchaTransfer> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
