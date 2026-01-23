package com.robinhood.store.event;

import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.event.p186db.dao.EcHubLayoutDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.idl.Response;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetLayoutResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.EcHubLayoutStore;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: EcHubLayoutStore.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002+*B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubLayoutStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/models/event/db/dao/EcHubLayoutDao;", "ecHubLayoutDao", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "layoutService", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/event/EcHubSessionTracker;", "ecHubSessionTracker", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "requestHeaderPlugin", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/android/models/event/db/dao/EcHubLayoutDao;Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;Lj$/time/Clock;Lcom/robinhood/store/event/EcHubSessionTracker;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "nodeId", "Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;", "cursor", "", "generateRefId", "(Ljava/util/UUID;Lcom/robinhood/android/idl/common/pagination/IdlPaginationCursor;)Ljava/lang/String;", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubLayout;", "streamEcHubLayoutComponentsByNodeId", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/models/event/db/dao/EcHubLayoutDao;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "Lj$/time/Clock;", "Lcom/robinhood/store/event/EcHubSessionTracker;", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Lcom/robinhood/store/event/EcHubLayoutStore$GetLayoutParams;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetLayoutResponseDto;", "getEcHubLayoutEndpoint", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "queryEcHubLayout", "Lcom/robinhood/android/moria/db/Query;", "Companion", "GetLayoutParams", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class EcHubLayoutStore extends Store {
    private static final int GET_LAYOUT_PAGE_SIZE = 100;
    private static final String TRACKER_PREFIX = "ec_hub_layout_";
    private final Clock clock;
    private final EcHubLayoutDao ecHubLayoutDao;
    private final EcHubSessionTracker ecHubSessionTracker;
    private final IdlPaginatedResponseEndpoint<GetLayoutParams, Response<GetLayoutResponseDto>> getEcHubLayoutEndpoint;
    private final LayoutService layoutService;
    private final Query<GetLayoutParams, List<EcHubLayout>> queryEcHubLayout;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcHubLayoutStore(EcHubLayoutDao ecHubLayoutDao, LayoutService layoutService, Clock clock, EcHubSessionTracker ecHubSessionTracker, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ecHubLayoutDao, "ecHubLayoutDao");
        Intrinsics.checkNotNullParameter(layoutService, "layoutService");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(ecHubSessionTracker, "ecHubSessionTracker");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ecHubLayoutDao = ecHubLayoutDao;
        this.layoutService = layoutService;
        this.clock = clock;
        this.ecHubSessionTracker = ecHubSessionTracker;
        this.requestHeaderPlugin = requestHeaderPlugin;
        IdlPaginatedResponseEndpoint<GetLayoutParams, Response<GetLayoutResponseDto>> idlPaginatedResponseEndpointCreateWithParams = IdlPaginatedResponseEndpoint.INSTANCE.createWithParams(new EcHubLayoutStore2(this, null), new Function1() { // from class: com.robinhood.store.event.EcHubLayoutStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EcHubLayoutStore.getEcHubLayoutEndpoint$lambda$0((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.event.EcHubLayoutStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EcHubLayoutStore.getEcHubLayoutEndpoint$lambda$1((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new EcHubLayoutStore3(this, null), storeBundle.getClock(), new EcHubLayoutStore4(this, null));
        this.getEcHubLayoutEndpoint = idlPaginatedResponseEndpointCreateWithParams;
        this.queryEcHubLayout = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryEcHubLayout", CollectionsKt.listOf(new RefreshEach(new EcHubLayoutStore5(idlPaginatedResponseEndpointCreateWithParams))), new Function1() { // from class: com.robinhood.store.event.EcHubLayoutStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EcHubLayoutStore.queryEcHubLayout$lambda$2(this.f$0, (EcHubLayoutStore.GetLayoutParams) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EcHubLayoutStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubLayoutStore$GetLayoutParams;", "", "nodeId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getNodeId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetLayoutParams {
        private final UUID nodeId;

        public static /* synthetic */ GetLayoutParams copy$default(GetLayoutParams getLayoutParams, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getLayoutParams.nodeId;
            }
            return getLayoutParams.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getNodeId() {
            return this.nodeId;
        }

        public final GetLayoutParams copy(UUID nodeId) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            return new GetLayoutParams(nodeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetLayoutParams) && Intrinsics.areEqual(this.nodeId, ((GetLayoutParams) other).nodeId);
        }

        public int hashCode() {
            return this.nodeId.hashCode();
        }

        public String toString() {
            return "GetLayoutParams(nodeId=" + this.nodeId + ")";
        }

        public GetLayoutParams(UUID nodeId) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            this.nodeId = nodeId;
        }

        public final UUID getNodeId() {
            return this.nodeId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String generateRefId(UUID nodeId, IdlPaginationCursor cursor) {
        String strSafeToString;
        if (cursor == null) {
            strSafeToString = Uuids.safeToString(nodeId);
        } else {
            strSafeToString = Uuids.safeToString(nodeId) + "-" + cursor.getValue();
        }
        return TRACKER_PREFIX + strSafeToString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getEcHubLayoutEndpoint$lambda$0(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetLayoutResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getEcHubLayoutEndpoint$lambda$1(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetLayoutResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryEcHubLayout$lambda$2(EcHubLayoutStore ecHubLayoutStore, GetLayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Operators.connectWhen(ecHubLayoutStore.ecHubLayoutDao.streamComponentsByNodeId(params.getNodeId()), ecHubLayoutStore.ecHubSessionTracker.streamIsRecordUpdatedWithinSession$lib_store_event_externalDebug(ecHubLayoutStore.generateRefId(params.getNodeId(), null)), FlowKt.flowOf(CollectionsKt.emptyList()));
    }

    public final Flow<List<EcHubLayout>> streamEcHubLayoutComponentsByNodeId(UUID nodeId) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        return this.queryEcHubLayout.asFlow(new GetLayoutParams(nodeId));
    }
}
