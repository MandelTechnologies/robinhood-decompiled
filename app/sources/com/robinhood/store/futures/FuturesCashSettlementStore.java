package com.robinhood.store.futures;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint;
import com.robinhood.android.models.futures.dao.FuturesCashSettlementDao;
import com.robinhood.android.models.futures.p189db.FuturesCashSettlement;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetCashSettlementExecutionsResponseDto;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesCashSettlementStore;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: FuturesCashSettlementStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0010J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesCashSettlementStore;", "Lcom/robinhood/store/Store;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "cashSettlementDao", "Lcom/robinhood/android/models/futures/dao/FuturesCashSettlementDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/android/models/futures/dao/FuturesCashSettlementDao;Lcom/robinhood/store/StoreBundle;)V", "getCashSettlementsEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lcom/robinhood/store/futures/FuturesCashSettlementStore$GetAllCashSettlementArg;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;", "getEventContractPayoutByContractId", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/futures/db/FuturesCashSettlement;", "streamExecution", "Lkotlinx/coroutines/flow/Flow;", "id", "streamPayout", "contractId", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "GetAllCashSettlementArg", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesCashSettlementStore extends Store {
    private final FuturesCashSettlementDao cashSettlementDao;
    private final Ceres ceres;
    private final IdlPaginationEndpoint<GetAllCashSettlementArg, GetCashSettlementExecutionsResponseDto> getCashSettlementsEndpoint;
    private final Query<UUID, FuturesCashSettlement> getEventContractPayoutByContractId;
    private final HistoryLoader.Callbacks<FuturesCashSettlement> historyLoaderCallbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesCashSettlementStore(Ceres ceres, FuturesCashSettlementDao cashSettlementDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(cashSettlementDao, "cashSettlementDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.cashSettlementDao = cashSettlementDao;
        this.getCashSettlementsEndpoint = IdlPaginationEndpoint.Companion.create$default(IdlPaginationEndpoint.INSTANCE, new FuturesCashSettlementStore2(this, null), new Function1() { // from class: com.robinhood.store.futures.FuturesCashSettlementStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesCashSettlementStore.getCashSettlementsEndpoint$lambda$0((GetCashSettlementExecutionsResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.futures.FuturesCashSettlementStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesCashSettlementStore.getCashSettlementsEndpoint$lambda$1((GetCashSettlementExecutionsResponseDto) obj);
            }
        }, getLogoutKillswitch(), new FuturesCashSettlementStore3(this, null), storeBundle.getClock(), null, 64, null);
        this.getEventContractPayoutByContractId = Store.create$default(this, Query.INSTANCE, "getEventContractPayoutByContractId", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.FuturesCashSettlementStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesCashSettlementStore.getEventContractPayoutByContractId$lambda$2(this.f$0, (UUID) obj);
            }
        })), new FuturesCashSettlementStore4(cashSettlementDao), false, 8, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<FuturesCashSettlement>() { // from class: com.robinhood.store.futures.FuturesCashSettlementStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.EVENT_EXECUTION, HistoryTransactionType.FUTURES_EXECUTION);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
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

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter != null && (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) != null) {
                    IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.getCashSettlementsEndpoint, new FuturesCashSettlementStore.GetAllCashSettlementArg(futuresSubAccountId, null, 2, null == true ? 1 : 0), false, 2, null);
                    return FlowKt.filterNotNull(this.this$0.cashSettlementDao.countTotal(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), futuresSubAccountId));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.cashSettlementDao.countLater(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashSettlement>> getLatest(HistoryLoader.Filter filter, int limit) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter != null && (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) != null) {
                    IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.getCashSettlementsEndpoint, new FuturesCashSettlementStore.GetAllCashSettlementArg(futuresSubAccountId, null, 2, 0 == true ? 1 : 0), false, 2, null);
                    return this.this$0.cashSettlementDao.getLatest(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), futuresSubAccountId, limit);
                }
                return FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashSettlement>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.cashSettlementDao.getLater(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashSettlement>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.cashSettlementDao.get(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashSettlement>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.cashSettlementDao.getEarlier(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id, limit);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getCashSettlementsEndpoint$lambda$0(GetCashSettlementExecutionsResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FuturesPaginationExtensions.toIdlPaginationCursor(it.getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getCashSettlementsEndpoint$lambda$1(GetCashSettlementExecutionsResponseDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FuturesPaginationExtensions.toIdlPaginationCursor(it.getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Job getEventContractPayoutByContractId$lambda$2(FuturesCashSettlementStore futuresCashSettlementStore, UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(futuresCashSettlementStore.getCashSettlementsEndpoint, new GetAllCashSettlementArg(null, contractId, 1, 0 == true ? 1 : 0), false, 2, null);
    }

    public final Flow<FuturesCashSettlement> streamExecution(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.cashSettlementDao.getCashSettlement(id)));
    }

    public final Flow<FuturesCashSettlement> streamPayout(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.getEventContractPayoutByContractId.asFlow(contractId)));
    }

    public final HistoryLoader.Callbacks<FuturesCashSettlement> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesCashSettlementStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesCashSettlementStore$GetAllCashSettlementArg;", "", "futuresAccountId", "Ljava/util/UUID;", "contractId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getFuturesAccountId", "()Ljava/util/UUID;", "getContractId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetAllCashSettlementArg {
        private final UUID contractId;
        private final UUID futuresAccountId;

        /* JADX WARN: Multi-variable type inference failed */
        public GetAllCashSettlementArg() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ GetAllCashSettlementArg copy$default(GetAllCashSettlementArg getAllCashSettlementArg, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getAllCashSettlementArg.futuresAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = getAllCashSettlementArg.contractId;
            }
            return getAllCashSettlementArg.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final GetAllCashSettlementArg copy(UUID futuresAccountId, UUID contractId) {
            return new GetAllCashSettlementArg(futuresAccountId, contractId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAllCashSettlementArg)) {
                return false;
            }
            GetAllCashSettlementArg getAllCashSettlementArg = (GetAllCashSettlementArg) other;
            return Intrinsics.areEqual(this.futuresAccountId, getAllCashSettlementArg.futuresAccountId) && Intrinsics.areEqual(this.contractId, getAllCashSettlementArg.contractId);
        }

        public int hashCode() {
            UUID uuid = this.futuresAccountId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            UUID uuid2 = this.contractId;
            return iHashCode + (uuid2 != null ? uuid2.hashCode() : 0);
        }

        public String toString() {
            return "GetAllCashSettlementArg(futuresAccountId=" + this.futuresAccountId + ", contractId=" + this.contractId + ")";
        }

        public GetAllCashSettlementArg(UUID uuid, UUID uuid2) {
            this.futuresAccountId = uuid;
            this.contractId = uuid2;
        }

        public /* synthetic */ GetAllCashSettlementArg(UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2);
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }
}
