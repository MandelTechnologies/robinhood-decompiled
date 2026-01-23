package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.dao.EventToContractMapDao;
import com.robinhood.android.models.event.p186db.dao.StrikeContractDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.StrikeContract;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.prediction_markets.proto.p361v1.idl.ListStrikesResponseDto;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.StrikeContractStore;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: StrikeContractStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/store/event/StrikeContractStore;", "Lcom/robinhood/store/Store;", "layoutService", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "strikeContractDao", "Lcom/robinhood/android/models/event/db/dao/StrikeContractDao;", "eventToContractMapDao", "Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;Lcom/robinhood/android/models/event/db/dao/StrikeContractDao;Lcom/robinhood/android/models/event/db/dao/EventToContractMapDao;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lcom/robinhood/store/StoreBundle;)V", "listStrikesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/event/StrikeContractStore$ListStrikesParams;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/ListStrikesResponseDto;", "queryListStrikes", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/models/event/db/predictionmarkets/StrikeContract;", "streamListStrikeContracts", "Lkotlinx/coroutines/flow/Flow;", "contractId", "Ljava/util/UUID;", "moneylineEventId", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "ListStrikesParams", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class StrikeContractStore extends Store {
    private final EventToContractMapDao eventToContractMapDao;
    private final LayoutService layoutService;
    private final Endpoint<ListStrikesParams, Response<ListStrikesResponseDto>> listStrikesEndpoint;
    private final Query<ListStrikesParams, StrikeContract> queryListStrikes;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;
    private final StrikeContractDao strikeContractDao;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrikeContractStore(LayoutService layoutService, StrikeContractDao strikeContractDao, EventToContractMapDao eventToContractMapDao, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(layoutService, "layoutService");
        Intrinsics.checkNotNullParameter(strikeContractDao, "strikeContractDao");
        Intrinsics.checkNotNullParameter(eventToContractMapDao, "eventToContractMapDao");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.layoutService = layoutService;
        this.strikeContractDao = strikeContractDao;
        this.eventToContractMapDao = eventToContractMapDao;
        this.requestHeaderPlugin = requestHeaderPlugin;
        Endpoint<ListStrikesParams, Response<ListStrikesResponseDto>> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new StrikeContractStore2(this, null), storeBundle.getLogoutKillswitch(), new StrikeContractStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.listStrikesEndpoint = endpointCreateWithParams$default;
        this.queryListStrikes = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryListStrikes", CollectionsKt.listOf(new RefreshEach(new StrikeContractStore4(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.store.event.StrikeContractStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StrikeContractStore.queryListStrikes$lambda$0(this.f$0, (StrikeContractStore.ListStrikesParams) obj);
            }
        }, false, 16, null);
    }

    /* compiled from: StrikeContractStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/store/event/StrikeContractStore$ListStrikesParams;", "", "contractSide", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "contractId", "Ljava/util/UUID;", "moneylineEventId", "<init>", "(Lcom/robinhood/android/eventcontracts/models/event/ContractSide;Ljava/util/UUID;Ljava/util/UUID;)V", "getContractSide", "()Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "getContractId", "()Ljava/util/UUID;", "getMoneylineEventId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ListStrikesParams {
        private final UUID contractId;
        private final ContractSide contractSide;
        private final UUID moneylineEventId;

        public static /* synthetic */ ListStrikesParams copy$default(ListStrikesParams listStrikesParams, ContractSide contractSide, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                contractSide = listStrikesParams.contractSide;
            }
            if ((i & 2) != 0) {
                uuid = listStrikesParams.contractId;
            }
            if ((i & 4) != 0) {
                uuid2 = listStrikesParams.moneylineEventId;
            }
            return listStrikesParams.copy(contractSide, uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final ContractSide getContractSide() {
            return this.contractSide;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getMoneylineEventId() {
            return this.moneylineEventId;
        }

        public final ListStrikesParams copy(ContractSide contractSide, UUID contractId, UUID moneylineEventId) {
            Intrinsics.checkNotNullParameter(contractSide, "contractSide");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
            return new ListStrikesParams(contractSide, contractId, moneylineEventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListStrikesParams)) {
                return false;
            }
            ListStrikesParams listStrikesParams = (ListStrikesParams) other;
            return this.contractSide == listStrikesParams.contractSide && Intrinsics.areEqual(this.contractId, listStrikesParams.contractId) && Intrinsics.areEqual(this.moneylineEventId, listStrikesParams.moneylineEventId);
        }

        public int hashCode() {
            return (((this.contractSide.hashCode() * 31) + this.contractId.hashCode()) * 31) + this.moneylineEventId.hashCode();
        }

        public String toString() {
            return "ListStrikesParams(contractSide=" + this.contractSide + ", contractId=" + this.contractId + ", moneylineEventId=" + this.moneylineEventId + ")";
        }

        public ListStrikesParams(ContractSide contractSide, UUID contractId, UUID moneylineEventId) {
            Intrinsics.checkNotNullParameter(contractSide, "contractSide");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
            this.contractSide = contractSide;
            this.contractId = contractId;
            this.moneylineEventId = moneylineEventId;
        }

        public final ContractSide getContractSide() {
            return this.contractSide;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final UUID getMoneylineEventId() {
            return this.moneylineEventId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryListStrikes$lambda$0(StrikeContractStore strikeContractStore, ListStrikesParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return strikeContractStore.strikeContractDao.streamStrikeContractByIdAndContractSide(params.getContractId(), params.getContractSide());
    }

    public final Flow<StrikeContract> streamListStrikeContracts(UUID contractId, UUID moneylineEventId, ContractSide contractSide) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(moneylineEventId, "moneylineEventId");
        Intrinsics.checkNotNullParameter(contractSide, "contractSide");
        return this.queryListStrikes.asFlow(new ListStrikesParams(contractSide, contractId, moneylineEventId));
    }
}
