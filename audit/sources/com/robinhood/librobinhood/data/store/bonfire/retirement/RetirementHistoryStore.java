package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryDetail;
import com.robinhood.android.models.retirement.api.ApiRetirementFeeHistoryResponse;
import com.robinhood.android.models.retirement.dao.RetirementHistoryDao;
import com.robinhood.android.models.retirement.p194db.RetirementHistoryItem;
import com.robinhood.android.models.retirement.p194db.RetirementHistoryItem2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.RetirementFeeTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: RetirementHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u001e\u001a\u00020\u0010J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001b0\u001d2\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0015\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014 \u0018*\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00170\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00140\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001b0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006("}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementHistoryStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/api/retirement/RetirementApi;", "dao", "Lcom/robinhood/android/models/retirement/dao/RetirementHistoryDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/models/retirement/dao/RetirementHistoryDao;Lcom/robinhood/store/StoreBundle;)V", "listEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryResponse;", "listItemQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/retirement/db/RetirementHistoryItem;", "infoCache", "", "Lcom/robinhood/android/models/retirement/api/ApiRetirementFeeHistoryDetail;", "infoRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "detailEndpoint", "detailQuery", "Lcom/robinhood/utils/Optional;", "getHistoryItem", "Lio/reactivex/Observable;", "id", "getHistoryItemDetails", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RetirementHistoryStore extends Store {
    private final RetirementApi api;
    private final RetirementHistoryDao dao;
    private final Endpoint<UUID, ApiRetirementFeeHistoryDetail> detailEndpoint;
    private final Query<UUID, Optional<ApiRetirementFeeHistoryDetail>> detailQuery;
    private final HistoryLoader.Callbacks<RetirementHistoryItem> historyLoaderCallbacks;
    private final Map<UUID, ApiRetirementFeeHistoryDetail> infoCache;
    private final PublishRelay<Tuples2<UUID, ApiRetirementFeeHistoryDetail>> infoRelay;
    private final Endpoint<Unit, ApiRetirementFeeHistoryResponse> listEndpoint;
    private final Query<UUID, RetirementHistoryItem> listItemQuery;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementHistoryStore(RetirementApi api, RetirementHistoryDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.listEndpoint = Endpoint.Companion.create$default(companion, new RetirementHistoryStore$listEndpoint$1(this, null), getLogoutKillswitch(), new RetirementHistoryStore$listEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.listItemQuery = Store.create$default(this, companion2, "fetchRetirementHistory", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementHistoryStore.listItemQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new RetirementHistoryStore$listItemQuery$2(dao), false, 8, null);
        this.infoCache = new LinkedHashMap();
        PublishRelay<Tuples2<UUID, ApiRetirementFeeHistoryDetail>> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.infoRelay = publishRelayCreate;
        this.detailEndpoint = Endpoint.Companion.createWithParams$default(companion, new RetirementHistoryStore$detailEndpoint$1(this, null), getLogoutKillswitch(), new RetirementHistoryStore$detailEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.detailQuery = Store.createOptional$default(this, companion2, "retirementHistoryDetails", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementHistoryStore.detailQuery$lambda$1(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementHistoryStore.detailQuery$lambda$3(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.RETIREMENT_FEE);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.getHistoryItem(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<RetirementFeeTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C347262<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "RetirementHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C347262.this.emit(null, this);
                            }
                        }

                        public C347262(FlowCollector flowCollector) {
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
                                RetirementFeeTransaction retirementFeeTransaction = new RetirementFeeTransaction((RetirementHistoryItem) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(retirementFeeTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super RetirementFeeTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C347262(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<RetirementHistoryItem>() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.RETIREMENT_FEE);

            {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf;
            }

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
                Endpoint.DefaultImpls.refresh$default(this.this$0.listEndpoint, Unit.INSTANCE, false, null, 6, null);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(filter.getSince(), filter.getBefore(), RetirementHistoryItem2.getToRetirementFeeStatuses(filter.getState()), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, RetirementHistoryItem2.getToRetirementFeeStatuses(filter.getState()), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RetirementHistoryItem>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Endpoint.DefaultImpls.refresh$default(this.this$0.listEndpoint, Unit.INSTANCE, false, null, 6, null);
                return this.this$0.dao.getLatest(filter.getSince(), filter.getBefore(), limit, RetirementHistoryItem2.getToRetirementFeeStatuses(filter.getState()), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RetirementHistoryItem>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, RetirementHistoryItem2.getToRetirementFeeStatuses(filter.getState()), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RetirementHistoryItem>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id, RetirementHistoryItem2.getToRetirementFeeStatuses(filter.getState()), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<RetirementHistoryItem>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, RetirementHistoryItem2.getToRetirementFeeStatuses(filter.getState()), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job listItemQuery$lambda$0(RetirementHistoryStore retirementHistoryStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(retirementHistoryStore.listEndpoint, Unit.INSTANCE, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job detailQuery$lambda$1(RetirementHistoryStore retirementHistoryStore, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Endpoint.DefaultImpls.refresh$default(retirementHistoryStore.detailEndpoint, id, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow detailQuery$lambda$3(RetirementHistoryStore retirementHistoryStore, final UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableStartWith = retirementHistoryStore.infoRelay.hide().filter(new Predicate() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$detailQuery$2$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<UUID, ApiRetirementFeeHistoryDetail> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Intrinsics.areEqual(tuples2.component1(), id);
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$detailQuery$2$2
            @Override // io.reactivex.functions.Function
            public final Optional<ApiRetirementFeeHistoryDetail> apply(Tuples2<UUID, ApiRetirementFeeHistoryDetail> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Optional3.asOptional(tuples2.component2());
            }
        }).startWith((Observable<R>) Optional3.asOptional(retirementHistoryStore.infoCache.get(id)));
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(observableStartWith), Integer.MAX_VALUE, null, 2, null);
        return new Flow<ApiRetirementFeeHistoryDetail>() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$detailQuery$lambda$3$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$detailQuery$lambda$3$$inlined$map$1$2 */
            public static final class C347252<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$detailQuery$lambda$3$$inlined$map$1$2", m3645f = "RetirementHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementHistoryStore$detailQuery$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C347252.this.emit(null, this);
                    }
                }

                public C347252(FlowCollector flowCollector) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ApiRetirementFeeHistoryDetail> flowCollector, Continuation continuation) {
                Object objCollect = flowBuffer$default.collect(new C347252(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Observable<RetirementHistoryItem> getHistoryItem(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.listItemQuery.asObservable(id);
    }

    public final Observable<Optional<ApiRetirementFeeHistoryDetail>> getHistoryItemDetails(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.detailQuery.asObservable(id);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<RetirementHistoryItem> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
