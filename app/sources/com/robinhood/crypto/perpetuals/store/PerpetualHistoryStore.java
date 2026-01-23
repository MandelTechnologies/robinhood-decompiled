package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.idl.common.polling.IdlBackendPolling;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualOrderDetailsDao;
import com.robinhood.crypto.models.perpetuals.p288db.OrderStatus;
import com.robinhood.crypto.models.perpetuals.p288db.OrderStatus2;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualHistoryType;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderDetails;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import com.robinhood.crypto.perpetuals.store.PerpetualHistoryStore;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.PerpetualsOrderTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.GetOrderRequestDto;
import crypto_perpetuals.service.p440v1.GetOrderResponseDto;
import crypto_perpetuals.service.p440v1.ListOrderRequestDto;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: PerpetualHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u0001:\u000389:B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0006\u0010-\u001a\u00020.J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0006\u0010-\u001a\u00020.J\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0,2\u0006\u0010-\u001a\u00020.J.\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0,2\b\u00102\u001a\u0004\u0018\u00010.2\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206J\u001c\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0,2\b\u00102\u001a\u0004\u0018\u00010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006;"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "dao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualOrderDetailsDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualAccountStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualOrderDetailsDao;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/crypto/perpetuals/store/PerpetualAccountStore;)V", "paginatedListOrderDetailsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore$PaginatedListOrderRequest;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualOrderDetails;", "getOrderDetailEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/idl/Request;", "Lcrypto_perpetuals/service/v1/GetOrderRequestDto;", "Lcom/robinhood/idl/Response;", "Lcrypto_perpetuals/service/v1/GetOrderResponseDto;", "listPendingOrderDetailQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore$PendingOrderDetailQueryRequest;", "", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "getOrderDetailQuery", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "refreshAll", "", "refreshAll$lib_store_perpetuals_externalDebug", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamOrderDetails", "Lkotlinx/coroutines/flow/Flow;", "orderId", "Ljava/util/UUID;", "pollOrderDetails", "pollOrderDetailsWhileNonFinal", "streamLatestPendingPerpetualOrderDetails", "contractId", "count", "", "refresh", "", "pollPendingPerpetualOrderDetails", "PaginatedListOrderRequest", "PendingOrderDetailQueryRequest", "Companion", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualHistoryStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final PerpetualAccountStore accountStore;
    private final PerpetualContractStore contractStore;
    private final PerpetualOrderDetailsDao dao;
    private final Endpoint<Request<GetOrderRequestDto>, Response<GetOrderResponseDto>> getOrderDetailEndpoint;
    private final Query<GetOrderRequestDto, UiPerpetualOrderDetails> getOrderDetailQuery;
    private final HistoryLoader.Callbacks<UiPerpetualOrderDetails> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final Query<PendingOrderDetailQueryRequest, List<UiPerpetualOrderDetails>> listPendingOrderDetailQuery;
    private final PaginatedEndpoint<PaginatedListOrderRequest, PerpetualOrderDetails> paginatedListOrderDetailsEndpoint;
    private final RegionGateProvider regionGateProvider;
    private final CryptoPerpetualsService service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualHistoryStore(StoreBundle storeBundle, PerpetualContractStore contractStore, CryptoPerpetualsService service, PerpetualOrderDetailsDao dao, RegionGateProvider regionGateProvider, PerpetualAccountStore accountStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(contractStore, "contractStore");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        this.contractStore = contractStore;
        this.service = service;
        this.dao = dao;
        this.regionGateProvider = regionGateProvider;
        this.accountStore = accountStore;
        this.paginatedListOrderDetailsEndpoint = PaginatedEndpoint.INSTANCE.createWithParams(new PerpetualHistoryStore6(this, null), getLogoutKillswitch(), new PerpetualHistoryStore7(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
        this.getOrderDetailEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PerpetualHistoryStore2(this, null), getLogoutKillswitch(), new PerpetualHistoryStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.listPendingOrderDetailQuery = Store.create$default(this, companion, "listPendingOrderDetailQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualHistoryStore.listPendingOrderDetailQuery$lambda$1(this.f$0, (PerpetualHistoryStore.PendingOrderDetailQueryRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualHistoryStore.listPendingOrderDetailQuery$lambda$2(this.f$0, (PerpetualHistoryStore.PendingOrderDetailQueryRequest) obj);
            }
        }, false, 8, null);
        this.getOrderDetailQuery = Store.create$default(this, companion, "getOrderDetailQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualHistoryStore.getOrderDetailQuery$lambda$3(this.f$0, (GetOrderRequestDto) obj);
            }
        })), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualHistoryStore.getOrderDetailQuery$lambda$4(this.f$0, (GetOrderRequestDto) obj);
            }
        }, false, 8, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiPerpetualOrderDetails>() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.PERPETUALS_ORDER, HistoryTransactionType.PERPETUALS_LIQUIDATION);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                this.supportedBrokerageAccountTypes = SetsKt.emptySet();
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
                this.this$0.refreshAll$lib_store_perpetuals_externalDebug();
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(OrderStatus2.getOrderStatuses(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), PerpetualHistoryStore.INSTANCE.getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(filter.getTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(OrderStatus2.getOrderStatuses(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), PerpetualHistoryStore.INSTANCE.getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(filter.getTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualOrderDetails>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll$lib_store_perpetuals_externalDebug();
                return this.this$0.dao.getLatest(OrderStatus2.getOrderStatuses(filter.getState()), filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId(), PerpetualHistoryStore.INSTANCE.getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(filter.getTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualOrderDetails>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(OrderStatus2.getOrderStatuses(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), PerpetualHistoryStore.INSTANCE.getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(filter.getTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualOrderDetails>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(OrderStatus2.getOrderStatuses(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, PerpetualHistoryStore.INSTANCE.getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(filter.getTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualOrderDetails>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(OrderStatus2.getOrderStatuses(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), PerpetualHistoryStore.INSTANCE.getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(filter.getTypes()));
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.PERPETUALS_ORDER, HistoryTransactionType.PERPETUALS_LIQUIDATION}));
                final Flow<UiPerpetualOrderDetails> flowStreamOrderDetails = this.this$0.streamOrderDetails(reference.getSourceId());
                return new Flow<PerpetualsOrderTransaction>() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PerpetualsOrderTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamOrderDetails.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "PerpetualHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                PerpetualsOrderTransaction perpetualsOrderTransaction = new PerpetualsOrderTransaction((UiPerpetualOrderDetails) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(perpetualsOrderTransaction, anonymousClass1) == coroutine_suspended) {
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
        };
    }

    /* compiled from: PerpetualHistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore$PaginatedListOrderRequest;", "", "request", "Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "saveLastUpdatedAt", "", "<init>", "(Lcrypto_perpetuals/service/v1/ListOrderRequestDto;Z)V", "getRequest", "()Lcrypto_perpetuals/service/v1/ListOrderRequestDto;", "getSaveLastUpdatedAt", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$PaginatedListOrderRequest, reason: from toString */
    public static final /* data */ class PaginatedListOrderRequest {
        private final ListOrderRequestDto request;
        private final boolean saveLastUpdatedAt;

        public static /* synthetic */ PaginatedListOrderRequest copy$default(PaginatedListOrderRequest paginatedListOrderRequest, ListOrderRequestDto listOrderRequestDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                listOrderRequestDto = paginatedListOrderRequest.request;
            }
            if ((i & 2) != 0) {
                z = paginatedListOrderRequest.saveLastUpdatedAt;
            }
            return paginatedListOrderRequest.copy(listOrderRequestDto, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ListOrderRequestDto getRequest() {
            return this.request;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSaveLastUpdatedAt() {
            return this.saveLastUpdatedAt;
        }

        public final PaginatedListOrderRequest copy(ListOrderRequestDto request, boolean saveLastUpdatedAt) {
            Intrinsics.checkNotNullParameter(request, "request");
            return new PaginatedListOrderRequest(request, saveLastUpdatedAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaginatedListOrderRequest)) {
                return false;
            }
            PaginatedListOrderRequest paginatedListOrderRequest = (PaginatedListOrderRequest) other;
            return Intrinsics.areEqual(this.request, paginatedListOrderRequest.request) && this.saveLastUpdatedAt == paginatedListOrderRequest.saveLastUpdatedAt;
        }

        public int hashCode() {
            return (this.request.hashCode() * 31) + Boolean.hashCode(this.saveLastUpdatedAt);
        }

        public String toString() {
            return "PaginatedListOrderRequest(request=" + this.request + ", saveLastUpdatedAt=" + this.saveLastUpdatedAt + ")";
        }

        public PaginatedListOrderRequest(ListOrderRequestDto request, boolean z) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            this.saveLastUpdatedAt = z;
        }

        public final ListOrderRequestDto getRequest() {
            return this.request;
        }

        public final boolean getSaveLastUpdatedAt() {
            return this.saveLastUpdatedAt;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow listPendingOrderDetailQuery$lambda$1(PerpetualHistoryStore perpetualHistoryStore, PendingOrderDetailQueryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        PaginatedEndpoint<PaginatedListOrderRequest, PerpetualOrderDetails> paginatedEndpoint = perpetualHistoryStore.paginatedListOrderDetailsEndpoint;
        Set<OrderStatus> pendingStatuses = OrderStatus.INSTANCE.getPendingStatuses();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pendingStatuses, 10));
        Iterator<T> it = pendingStatuses.iterator();
        while (it.hasNext()) {
            arrayList.add(OrderStatus2.toProto((OrderStatus) it.next()));
        }
        UUID contractId = request.getContractId();
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(paginatedEndpoint, new PaginatedListOrderRequest(new ListOrderRequestDto(arrayList, null, CollectionsKt.listOfNotNull(contractId != null ? Uuids.safeToString(contractId) : null), null, null, null, 58, null), false), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow listPendingOrderDetailQuery$lambda$2(PerpetualHistoryStore perpetualHistoryStore, PendingOrderDetailQueryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return PerpetualOrderDetailsDao.DefaultImpls.getLatestPendingPerpetualOrderDetails$default(perpetualHistoryStore.dao, request.getContractId(), -1, null, 4, null);
    }

    /* compiled from: PerpetualHistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore$PendingOrderDetailQueryRequest;", "", "contractId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getContractId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$PendingOrderDetailQueryRequest, reason: from toString */
    public static final /* data */ class PendingOrderDetailQueryRequest {
        private final UUID contractId;

        public static /* synthetic */ PendingOrderDetailQueryRequest copy$default(PendingOrderDetailQueryRequest pendingOrderDetailQueryRequest, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pendingOrderDetailQueryRequest.contractId;
            }
            return pendingOrderDetailQueryRequest.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final PendingOrderDetailQueryRequest copy(UUID contractId) {
            return new PendingOrderDetailQueryRequest(contractId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingOrderDetailQueryRequest) && Intrinsics.areEqual(this.contractId, ((PendingOrderDetailQueryRequest) other).contractId);
        }

        public int hashCode() {
            UUID uuid = this.contractId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "PendingOrderDetailQueryRequest(contractId=" + this.contractId + ")";
        }

        public PendingOrderDetailQueryRequest(UUID uuid) {
            this.contractId = uuid;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getOrderDetailQuery$lambda$3(PerpetualHistoryStore perpetualHistoryStore, GetOrderRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return IdlBackendPolling.backendPoll$default(perpetualHistoryStore.getOrderDetailEndpoint, new Request(it, null, 2, null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getOrderDetailQuery$lambda$4(PerpetualHistoryStore perpetualHistoryStore, GetOrderRequestDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return perpetualHistoryStore.dao.getPerpetualOrderDetails(StringsKt.toUuid(it.getOrder_id()));
    }

    public final HistoryLoader.Callbacks<UiPerpetualOrderDetails> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final void refreshAll$lib_store_perpetuals_externalDebug() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new PerpetualHistoryStore9(this, null), 3, null);
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final Flow<UiPerpetualOrderDetails> streamOrderDetails(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.filterNotNull(this.dao.getPerpetualOrderDetails(orderId));
    }

    public final Flow<UiPerpetualOrderDetails> pollOrderDetails(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.transformLatest(FlowKt.filterNotNull(this.accountStore.streamPerpetualAccount()), new PerpetualsHistoryStore$pollOrderDetails$$inlined$flatMapLatest$1(null, this, orderId));
    }

    public final Flow<UiPerpetualOrderDetails> pollOrderDetailsWhileNonFinal(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.transformLatest(FlowKt.filterNotNull(this.accountStore.streamPerpetualAccount()), new C33025xf2846179(null, this, orderId));
    }

    public static /* synthetic */ Flow streamLatestPendingPerpetualOrderDetails$default(PerpetualHistoryStore perpetualHistoryStore, UUID uuid, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return perpetualHistoryStore.streamLatestPendingPerpetualOrderDetails(uuid, i, z);
    }

    public final Flow<List<UiPerpetualOrderDetails>> streamLatestPendingPerpetualOrderDetails(UUID contractId, int count, boolean refresh) {
        if (refresh) {
            refreshAll$lib_store_perpetuals_externalDebug();
        }
        return takeWhileLoggedIn(PerpetualOrderDetailsDao.DefaultImpls.getLatestPendingPerpetualOrderDetails$default(this.dao, contractId, count, null, 4, null));
    }

    public final Flow<List<UiPerpetualOrderDetails>> pollPendingPerpetualOrderDetails(UUID contractId) {
        return this.listPendingOrderDetailQuery.asFlow(new PendingOrderDetailQueryRequest(contractId));
    }

    /* compiled from: PerpetualHistoryStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\b0\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore$Companion;", "", "<init>", "()V", "perpetualHistoryTypes", "", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualHistoryType;", "Ljava/util/EnumSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug$annotations", "(Ljava/util/EnumSet;)V", "getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug", "(Ljava/util/EnumSet;)Ljava/util/Set;", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$Companion, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: PerpetualHistoryStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$Companion$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HistoryTransactionType.values().length];
                try {
                    iArr[HistoryTransactionType.PERPETUALS_ORDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistoryTransactionType.PERPETUALS_LIQUIDATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug$annotations */
        public static /* synthetic */ void m2593x949dc62d(EnumSet enumSet) {
        }

        private Companion() {
        }

        public final Set<PerpetualHistoryType> getPerpetualHistoryTypes$lib_store_perpetuals_externalDebug(EnumSet<HistoryTransactionType> enumSet) {
            Intrinsics.checkNotNullParameter(enumSet, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (HistoryTransactionType historyTransactionType : enumSet) {
                int i = historyTransactionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[historyTransactionType.ordinal()];
                if (i == 1) {
                    linkedHashSet.addAll(SetsKt.setOf((Object[]) new PerpetualHistoryType[]{PerpetualHistoryType.MARKET, PerpetualHistoryType.LIMIT, PerpetualHistoryType.TAKE_PROFIT, PerpetualHistoryType.STOP_LOSS, PerpetualHistoryType.CLOSE_POSITION}));
                } else if (i == 2) {
                    linkedHashSet.add(PerpetualHistoryType.LIQUIDATION);
                }
            }
            return linkedHashSet;
        }
    }
}
