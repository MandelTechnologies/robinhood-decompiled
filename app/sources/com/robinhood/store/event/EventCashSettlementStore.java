package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.idl.common.pagination.IdlPaginationEndpoint;
import com.robinhood.android.models.event.p186db.ceres.EventCashSettlement;
import com.robinhood.android.models.event.p186db.dao.EventCashSettlementDao;
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
import com.robinhood.store.event.EventCashSettlementStore;
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

/* compiled from: EventCashSettlementStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0010J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/store/event/EventCashSettlementStore;", "Lcom/robinhood/store/Store;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "cashSettlementDao", "Lcom/robinhood/android/models/event/db/dao/EventCashSettlementDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/android/models/event/db/dao/EventCashSettlementDao;Lcom/robinhood/store/StoreBundle;)V", "getCashSettlementsEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedEndpoint;", "Lcom/robinhood/store/event/EventCashSettlementStore$GetAllPayoutArg;", "Lcom/robinhood/ceres/v1/GetCashSettlementExecutionsResponseDto;", "getEventContractPayoutByContractId", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/event/db/ceres/EventCashSettlement;", "streamCashSettlement", "Lkotlinx/coroutines/flow/Flow;", "cashSettlementId", "streamCashSettlementByContractId", "contractId", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "GetAllPayoutArg", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EventCashSettlementStore extends Store {
    private final EventCashSettlementDao cashSettlementDao;
    private final Ceres ceres;
    private final IdlPaginationEndpoint<GetAllPayoutArg, GetCashSettlementExecutionsResponseDto> getCashSettlementsEndpoint;
    private final Query<UUID, EventCashSettlement> getEventContractPayoutByContractId;
    private final HistoryLoader.Callbacks<EventCashSettlement> historyLoaderCallbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventCashSettlementStore(Ceres ceres, EventCashSettlementDao cashSettlementDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(cashSettlementDao, "cashSettlementDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.cashSettlementDao = cashSettlementDao;
        this.getCashSettlementsEndpoint = IdlPaginationEndpoint.Companion.create$default(IdlPaginationEndpoint.INSTANCE, new EventCashSettlementStore2(this, null), new Function1() { // from class: com.robinhood.store.event.EventCashSettlementStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventCashSettlementStore.getCashSettlementsEndpoint$lambda$0((GetCashSettlementExecutionsResponseDto) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.event.EventCashSettlementStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventCashSettlementStore.getCashSettlementsEndpoint$lambda$1((GetCashSettlementExecutionsResponseDto) obj);
            }
        }, getLogoutKillswitch(), new EventCashSettlementStore3(this, null), storeBundle.getClock(), null, 64, null);
        this.getEventContractPayoutByContractId = Store.create$default(this, Query.INSTANCE, "getEventContractPayoutByContractId", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.event.EventCashSettlementStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventCashSettlementStore.getEventContractPayoutByContractId$lambda$2(this.f$0, (UUID) obj);
            }
        })), new EventCashSettlementStore4(cashSettlementDao), false, 8, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<EventCashSettlement>() { // from class: com.robinhood.store.event.EventCashSettlementStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.EVENT_EXECUTION);
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
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter != null && (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) != null) {
                    IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.getCashSettlementsEndpoint, new EventCashSettlementStore.GetAllPayoutArg(swapsSubAccountId, null, 2, null == true ? 1 : 0), false, 2, null);
                    return FlowKt.filterNotNull(this.this$0.cashSettlementDao.countTotal(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), swapsSubAccountId));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.cashSettlementDao.countLater(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventCashSettlement>> getLatest(HistoryLoader.Filter filter, int limit) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter != null && (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) != null) {
                    IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.getCashSettlementsEndpoint, new EventCashSettlementStore.GetAllPayoutArg(swapsSubAccountId, null, 2, 0 == true ? 1 : 0), false, 2, null);
                    return this.this$0.cashSettlementDao.getLatest(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), swapsSubAccountId, limit);
                }
                return FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventCashSettlement>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.cashSettlementDao.getLater(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventCashSettlement>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.cashSettlementDao.get(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventCashSettlement>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.cashSettlementDao.getEarlier(filter.getState(), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id, limit);
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
    public static final Job getEventContractPayoutByContractId$lambda$2(EventCashSettlementStore eventCashSettlementStore, UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return IdlPaginationEndpoint.DefaultImpls.refreshAllPages$default(eventCashSettlementStore.getCashSettlementsEndpoint, new GetAllPayoutArg(null, contractId, 1, 0 == true ? 1 : 0), false, 2, null);
    }

    public final Flow<EventCashSettlement> streamCashSettlement(UUID cashSettlementId) {
        Intrinsics.checkNotNullParameter(cashSettlementId, "cashSettlementId");
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.cashSettlementDao.getCashSettlement(cashSettlementId)));
    }

    public final Flow<EventCashSettlement> streamCashSettlementByContractId(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(this.getEventContractPayoutByContractId.asFlow(contractId)));
    }

    public final HistoryLoader.Callbacks<EventCashSettlement> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventCashSettlementStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/event/EventCashSettlementStore$GetAllPayoutArg;", "", "swapAccountId", "Ljava/util/UUID;", "contractId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getSwapAccountId", "()Ljava/util/UUID;", "getContractId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetAllPayoutArg {
        private final UUID contractId;
        private final UUID swapAccountId;

        /* JADX WARN: Multi-variable type inference failed */
        public GetAllPayoutArg() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ GetAllPayoutArg copy$default(GetAllPayoutArg getAllPayoutArg, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getAllPayoutArg.swapAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = getAllPayoutArg.contractId;
            }
            return getAllPayoutArg.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getSwapAccountId() {
            return this.swapAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final GetAllPayoutArg copy(UUID swapAccountId, UUID contractId) {
            return new GetAllPayoutArg(swapAccountId, contractId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetAllPayoutArg)) {
                return false;
            }
            GetAllPayoutArg getAllPayoutArg = (GetAllPayoutArg) other;
            return Intrinsics.areEqual(this.swapAccountId, getAllPayoutArg.swapAccountId) && Intrinsics.areEqual(this.contractId, getAllPayoutArg.contractId);
        }

        public int hashCode() {
            UUID uuid = this.swapAccountId;
            int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
            UUID uuid2 = this.contractId;
            return iHashCode + (uuid2 != null ? uuid2.hashCode() : 0);
        }

        public String toString() {
            return "GetAllPayoutArg(swapAccountId=" + this.swapAccountId + ", contractId=" + this.contractId + ")";
        }

        public GetAllPayoutArg(UUID uuid, UUID uuid2) {
            this.swapAccountId = uuid;
            this.contractId = uuid2;
        }

        public /* synthetic */ GetAllPayoutArg(UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : uuid2);
        }

        public final UUID getSwapAccountId() {
            return this.swapAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }
    }
}
