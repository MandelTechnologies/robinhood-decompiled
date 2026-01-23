package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.crypto.models.perpetuals.dao.PerpetualMarginEditDao;
import com.robinhood.crypto.models.perpetuals.p288db.MarginEditStatus2;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMarginEdit;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualMarginEdit;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.PerpetualsMarginEditTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.Uuids;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.GetMarginEditRequestDto;
import crypto_perpetuals.service.p440v1.GetMarginEditResponseDto;
import crypto_perpetuals.service.p440v1.ListMarginEditsRequestDto;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: PerpetualMarginEditHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0(2\u0006\u0010)\u001a\u00020\u001aJ.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0+0(2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u000200R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00061"}, m3636d2 = {"Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "service", "Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;", "dao", "Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualMarginEditDao;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "accountStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualAccountStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;Lcrypto_perpetuals/service/v1/CryptoPerpetualsService;Lcom/robinhood/crypto/models/perpetuals/dao/PerpetualMarginEditDao;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/crypto/perpetuals/store/PerpetualAccountStore;)V", "paginatedMarginEditEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMarginEdit;", "getMarginEditEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcrypto_perpetuals/service/v1/GetMarginEditRequestDto;", "Lcrypto_perpetuals/service/v1/GetMarginEditResponseDto;", "getMarginEditQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "refreshAll", "", "refreshAll$lib_store_perpetuals_externalDebug", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamPerpetualMarginEdit", "Lkotlinx/coroutines/flow/Flow;", "orderId", "streamLatestPendingPerpetualMarginEdit", "", "perpetualContractId", "count", "", "refresh", "", "lib-store-perpetuals_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualMarginEditHistoryStore extends Store {
    private final PerpetualAccountStore accountStore;
    private final PerpetualContractStore contractStore;
    private final PerpetualMarginEditDao dao;
    private final Endpoint<GetMarginEditRequestDto, GetMarginEditResponseDto> getMarginEditEndpoint;
    private final Query<UUID, UiPerpetualMarginEdit> getMarginEditQuery;
    private final HistoryLoader.Callbacks<UiPerpetualMarginEdit> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final PaginatedEndpoint<ListMarginEditsRequestDto, PerpetualMarginEdit> paginatedMarginEditEndpoint;
    private final RegionGateProvider regionGateProvider;
    private final CryptoPerpetualsService service;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerpetualMarginEditHistoryStore(StoreBundle storeBundle, PerpetualContractStore contractStore, CryptoPerpetualsService service, PerpetualMarginEditDao dao, RegionGateProvider regionGateProvider, PerpetualAccountStore accountStore) {
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
        this.paginatedMarginEditEndpoint = PaginatedEndpoint.INSTANCE.createWithParams(new PerpetualMarginEditHistoryStore6(this, null), getLogoutKillswitch(), new PerpetualMarginEditHistoryStore7(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.FIVE_MINUTES, storeBundle.getClock()));
        this.getMarginEditEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new PerpetualMarginEditHistoryStore2(service), getLogoutKillswitch(), new PerpetualMarginEditHistoryStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getMarginEditQuery = Store.create$default(this, Query.INSTANCE, "getMarginEditQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualMarginEditHistoryStore.getMarginEditQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerpetualMarginEditHistoryStore.getMarginEditQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiPerpetualMarginEdit>() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.PERPETUALS_MARGIN_CHANGE);
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
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), MarginEditStatus2.getMarginEditStatuses(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), MarginEditStatus2.getMarginEditStatuses(filter.getState())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualMarginEdit>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll$lib_store_perpetuals_externalDebug();
                return this.this$0.dao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId(), MarginEditStatus2.getMarginEditStatuses(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualMarginEdit>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), MarginEditStatus2.getMarginEditStatuses(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualMarginEdit>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, MarginEditStatus2.getMarginEditStatuses(filter.getState()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiPerpetualMarginEdit>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), MarginEditStatus2.getMarginEditStatuses(filter.getState()));
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf(HistoryTransactionType.PERPETUALS_MARGIN_CHANGE));
                final Flow<UiPerpetualMarginEdit> flowStreamPerpetualMarginEdit = this.this$0.streamPerpetualMarginEdit(reference.getSourceId());
                return new Flow<PerpetualsMarginEditTransaction>() { // from class: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PerpetualsMarginEditTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamPerpetualMarginEdit.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "PerpetualMarginEditHistoryStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                PerpetualsMarginEditTransaction perpetualsMarginEditTransaction = new PerpetualsMarginEditTransaction((UiPerpetualMarginEdit) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(perpetualsMarginEditTransaction, anonymousClass1) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getMarginEditQuery$lambda$0(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return Endpoint.DefaultImpls.poll$default(perpetualMarginEditHistoryStore.getMarginEditEndpoint, new GetMarginEditRequestDto(Uuids.safeToString(orderId)), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getMarginEditQuery$lambda$1(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return perpetualMarginEditHistoryStore.dao.getPerpetualMarginEdit(it);
    }

    public final HistoryLoader.Callbacks<UiPerpetualMarginEdit> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final void refreshAll$lib_store_perpetuals_externalDebug() {
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new PerpetualMarginEditHistoryStore8(this, null), 3, null);
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final Flow<UiPerpetualMarginEdit> streamPerpetualMarginEdit(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.transformLatest(FlowKt.filterNotNull(this.accountStore.streamPerpetualAccount()), new C33028xf3aa65d2(null, this, orderId));
    }

    public static /* synthetic */ Flow streamLatestPendingPerpetualMarginEdit$default(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, UUID uuid, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return perpetualMarginEditHistoryStore.streamLatestPendingPerpetualMarginEdit(uuid, i, z);
    }

    public final Flow<List<UiPerpetualMarginEdit>> streamLatestPendingPerpetualMarginEdit(UUID perpetualContractId, int count, boolean refresh) {
        if (refresh) {
            refreshAll$lib_store_perpetuals_externalDebug();
        }
        return takeWhileLoggedIn(PerpetualMarginEditDao.DefaultImpls.getLatestPendingPerpetualOrderDetails$default(this.dao, perpetualContractId, count, null, 4, null));
    }
}
