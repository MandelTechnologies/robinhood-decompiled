package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.acats.p299db.bonfire.AcatsDetailPageResponse;
import com.robinhood.models.acats.p299db.bonfire.AcatsDetailPageResponse2;
import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse2;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiAcatsDetailPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.ApiAcatsTransferRequest;
import com.robinhood.models.dao.AcatsTransferDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.AcatsTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: AcatsTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00160\u00160\u001d2\u0006\u0010\u001f\u001a\u00020\u0013J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160!2\u0006\u0010\"\u001a\u00020\u0010J\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010$0$0\u001d2\u0006\u0010%\u001a\u00020\u0010J\u001e\u0010&\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010$0$0\u001d2\b\u0010'\u001a\u0004\u0018\u00010(J\u0016\u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u001602¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u00065"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "Lcom/robinhood/store/Store;", "acatsApi", "Lcom/robinhood/android/acats/api/AcatsApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/AcatsTransferDao;", "<init>", "(Lcom/robinhood/android/acats/api/AcatsApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/AcatsTransferDao;)V", "acatsTransfersEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer;", "acatsTransferEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "postTransferEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransferRequest;", "streamAcatsTransferById", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "getStreamAcatsTransferById", "()Lcom/robinhood/android/moria/db/Query;", "refresh", "force", "", "postTransferRequest", "Lio/reactivex/Single;", "kotlin.jvm.PlatformType", "request", "streamAcatsTransfer", "Lkotlinx/coroutines/flow/Flow;", "id", "fetchAcatDetailPage", "Lcom/robinhood/models/acats/db/bonfire/AcatsDetailPageResponse;", "acatId", "fetchAcatOutDetailPage", "rhsAccountNumber", "", "fetchAcatListPage", "Lcom/robinhood/models/acats/db/bonfire/AcatsListPageResponse;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAcatTransfer", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-acats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class AcatsTransferStore extends Store {
    private final AcatsApi acatsApi;
    private final Endpoint<UUID, ApiAcatsTransfer> acatsTransferEndpoint;
    private final PaginatedEndpoint<Unit, ApiAcatsTransfer> acatsTransfersEndpoint;
    private final AcatsTransferDao dao;
    private final HistoryLoader.Callbacks<AcatsTransfer> historyLoaderCallbacks;
    private final PostEndpoint<ApiAcatsTransferRequest, ApiAcatsTransfer> postTransferEndpoint;
    private final Query<UUID, AcatsTransfer> streamAcatsTransferById;
    private final HistoryTransactionLoader transactionLoader;

    /* compiled from: AcatsTransferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore", m3645f = "AcatsTransferStore.kt", m3646l = {94}, m3647m = "fetchAcatListPage")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$fetchAcatListPage$1 */
    static final class C344751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344751(Continuation<? super C344751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcatsTransferStore.this.fetchAcatListPage(null, this);
        }
    }

    /* compiled from: AcatsTransferStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore", m3645f = "AcatsTransferStore.kt", m3646l = {97}, m3647m = "getAcatTransfer")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$getAcatTransfer$1 */
    static final class C344771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C344771(Continuation<? super C344771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcatsTransferStore.this.getAcatTransfer(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsTransferStore(AcatsApi acatsApi, StoreBundle storeBundle, AcatsTransferDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(acatsApi, "acatsApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.acatsApi = acatsApi;
        this.dao = dao;
        this.acatsTransfersEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new AcatsTransferStore$acatsTransfersEndpoint$1(this, null), getLogoutKillswitch(), new AcatsTransferStore$acatsTransfersEndpoint$2(dao), storeBundle.getClock(), null, 16, null);
        this.acatsTransferEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AcatsTransferStore$acatsTransferEndpoint$1(this, null), getLogoutKillswitch(), new AcatsTransferStore$acatsTransferEndpoint$2(dao), storeBundle.getClock(), null, 16, null);
        this.postTransferEndpoint = PostEndpoint.INSTANCE.create(new AcatsTransferStore$postTransferEndpoint$1(this, null), new AcatsTransferStore$postTransferEndpoint$2(null));
        this.streamAcatsTransferById = Store.create$default(this, Query.INSTANCE, "streamAcatsTransferById", CollectionsKt.emptyList(), new AcatsTransferStore$streamAcatsTransferById$1(dao), false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.ACATS_TRANSFER);
                PaginatedEndpointKt.refreshAllPages$default(this.this$0.acatsTransfersEndpoint, false, 1, null);
                final Flow<AcatsTransfer> flowStreamAcatsTransfer = this.this$0.streamAcatsTransfer(reference.getSourceId());
                return new Flow<AcatsTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C344732<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "AcatsTransferStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C344732.this.emit(null, this);
                            }
                        }

                        public C344732(FlowCollector flowCollector) {
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
                                AcatsTransaction acatsTransaction = new AcatsTransaction((AcatsTransfer) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(acatsTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super AcatsTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamAcatsTransfer.collect(new C344732(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<AcatsTransfer>() { // from class: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.ACATS_TRANSFER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
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
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages$default(this.this$0.acatsTransfersEndpoint, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(AcatsTransfer2.getAcatsTransferPhases(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(AcatsTransfer2.getAcatsTransferPhases(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getIsFilteringByGoldDepositBoost()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AcatsTransfer>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages$default(this.this$0.acatsTransfersEndpoint, false, 1, null);
                return this.this$0.dao.getLatest(AcatsTransfer2.getAcatsTransferPhases(filter.getState()), filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AcatsTransfer>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(AcatsTransfer2.getAcatsTransferPhases(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit, filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AcatsTransfer>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(AcatsTransfer2.getAcatsTransferPhases(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getIsFilteringByGoldDepositBoost());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<AcatsTransfer>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(AcatsTransfer2.getAcatsTransferPhases(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit, filter.getIsFilteringByGoldDepositBoost());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object acatsTransfersEndpoint$insertApiModel(AcatsTransferDao acatsTransferDao, Iterable iterable, Continuation continuation) {
        acatsTransferDao.insertApiModel((Iterable<ApiAcatsTransfer>) iterable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object acatsTransferEndpoint$insertApiModel$0(AcatsTransferDao acatsTransferDao, ApiAcatsTransfer apiAcatsTransfer, Continuation continuation) {
        acatsTransferDao.insertApiModel(apiAcatsTransfer);
        return Unit.INSTANCE;
    }

    public final Query<UUID, AcatsTransfer> getStreamAcatsTransferById() {
        return this.streamAcatsTransferById;
    }

    public static /* synthetic */ void refresh$default(AcatsTransferStore acatsTransferStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        acatsTransferStore.refresh(z);
    }

    public final void refresh(boolean force) {
        this.acatsTransfersEndpoint.refreshAllPages(Unit.INSTANCE, force);
    }

    /* compiled from: AcatsTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$postTransferRequest$1", m3645f = "AcatsTransferStore.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$postTransferRequest$1 */
    static final class C344781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AcatsTransfer>, Object> {
        final /* synthetic */ ApiAcatsTransferRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344781(ApiAcatsTransferRequest apiAcatsTransferRequest, Continuation<? super C344781> continuation) {
            super(2, continuation);
            this.$request = apiAcatsTransferRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsTransferStore.this.new C344781(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AcatsTransfer> continuation) {
            return ((C344781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = AcatsTransferStore.this.postTransferEndpoint;
                ApiAcatsTransferRequest apiAcatsTransferRequest = this.$request;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiAcatsTransferRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return AcatsTransfer2.toDbModel((ApiAcatsTransfer) obj);
        }
    }

    public final Single<AcatsTransfer> postTransferRequest(ApiAcatsTransferRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Single<AcatsTransfer> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344781(request, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    public final Flow<AcatsTransfer> streamAcatsTransfer(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.streamAcatsTransferById.asFlow(id);
    }

    /* compiled from: AcatsTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/AcatsDetailPageResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$fetchAcatDetailPage$1", m3645f = "AcatsTransferStore.kt", m3646l = {85}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$fetchAcatDetailPage$1 */
    static final class C344741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AcatsDetailPageResponse>, Object> {
        final /* synthetic */ UUID $acatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344741(UUID uuid, Continuation<? super C344741> continuation) {
            super(2, continuation);
            this.$acatId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsTransferStore.this.new C344741(this.$acatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AcatsDetailPageResponse> continuation) {
            return ((C344741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsApi acatsApi = AcatsTransferStore.this.acatsApi;
                String string2 = this.$acatId.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                this.label = 1;
                obj = acatsApi.getAcatDetailPage(string2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return AcatsDetailPageResponse2.toDbModel((ApiAcatsDetailPageResponse) obj);
        }
    }

    public final Single<AcatsDetailPageResponse> fetchAcatDetailPage(UUID acatId) {
        Intrinsics.checkNotNullParameter(acatId, "acatId");
        Single<AcatsDetailPageResponse> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344741(acatId, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* compiled from: AcatsTransferStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/acats/db/bonfire/AcatsDetailPageResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$fetchAcatOutDetailPage$1", m3645f = "AcatsTransferStore.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$fetchAcatOutDetailPage$1 */
    static final class C344761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AcatsDetailPageResponse>, Object> {
        final /* synthetic */ String $rhsAccountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C344761(String str, Continuation<? super C344761> continuation) {
            super(2, continuation);
            this.$rhsAccountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsTransferStore.this.new C344761(this.$rhsAccountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AcatsDetailPageResponse> continuation) {
            return ((C344761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsApi acatsApi = AcatsTransferStore.this.acatsApi;
                String str = this.$rhsAccountNumber;
                this.label = 1;
                obj = acatsApi.getAcatOutDetailPage(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return AcatsDetailPageResponse2.toDbModel((ApiAcatsDetailPageResponse) obj);
        }
    }

    public final Single<AcatsDetailPageResponse> fetchAcatOutDetailPage(String rhsAccountNumber) {
        Single<AcatsDetailPageResponse> singleSubscribeOn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C344761(rhsAccountNumber, null), 1, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(singleSubscribeOn, "subscribeOn(...)");
        return singleSubscribeOn;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAcatListPage(UUID uuid, Continuation<? super AcatsListPageResponse> continuation) {
        C344751 c344751;
        if (continuation instanceof C344751) {
            c344751 = (C344751) continuation;
            int i = c344751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344751.label = i - Integer.MIN_VALUE;
            } else {
                c344751 = new C344751(continuation);
            }
        }
        Object acatListPage = c344751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c344751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(acatListPage);
            AcatsApi acatsApi = this.acatsApi;
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            c344751.label = 1;
            acatListPage = acatsApi.getAcatListPage(string2, c344751);
            if (acatListPage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(acatListPage);
        }
        return AcatsListPageResponse2.toDbModel((ApiAcatsListPageResponse) acatListPage);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAcatTransfer(UUID uuid, Continuation<? super AcatsTransfer> continuation) {
        C344771 c344771;
        if (continuation instanceof C344771) {
            c344771 = (C344771) continuation;
            int i = c344771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c344771.label = i - Integer.MIN_VALUE;
            } else {
                c344771 = new C344771(continuation);
            }
        }
        C344771 c3447712 = c344771;
        Object objForceFetch$default = c3447712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3447712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, ApiAcatsTransfer> endpoint = this.acatsTransferEndpoint;
            c3447712.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c3447712, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return AcatsTransfer2.toDbModel((ApiAcatsTransfer) objForceFetch$default);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<AcatsTransfer> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
