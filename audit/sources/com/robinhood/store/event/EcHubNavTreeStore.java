package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.event.p186db.dao.EcHubNavNodeDao;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prediction_markets.proto.p361v1.idl.LayoutService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.EcHubNavTreeStore;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;

/* compiled from: EcHubNavTreeStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)(B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00150 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00180$8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010%\u0012\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubNavTreeStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "layoutService", "Lcom/robinhood/android/models/event/db/dao/EcHubNavNodeDao;", "ecHubNavNodeDao", "Lcom/robinhood/store/event/EcHubSessionTracker;", "ecHubSessionTracker", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "requestHeaderPlugin", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;Lcom/robinhood/android/models/event/db/dao/EcHubNavNodeDao;Lcom/robinhood/store/event/EcHubSessionTracker;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lj$/time/Clock;Lcom/robinhood/store/StoreBundle;)V", "Ljava/util/UUID;", "parentId", "", "isStale", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/store/event/PartialTree;", "forceFetchPartialTreeByParentId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/store/event/HubPartialNavTree;", "queryPartialTreeByParentId", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/prediction_markets/proto/v1/idl/LayoutService;", "Lcom/robinhood/android/models/event/db/dao/EcHubNavNodeDao;", "Lcom/robinhood/store/event/EcHubSessionTracker;", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "Lj$/time/Clock;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/event/EcHubNavTreeStore$GetNavNodesParams;", "getNavNodesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/moria/db/Query;", "getQueryPartialTreeByParentId$annotations", "()V", "Companion", "GetNavNodesParams", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EcHubNavTreeStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TRACKER_PREFIX = "ec_hub_nav_tree_";
    private final Clock clock;
    private final EcHubNavNodeDao ecHubNavNodeDao;
    private final EcHubSessionTracker ecHubSessionTracker;
    private final Endpoint<GetNavNodesParams, PartialTree> getNavNodesEndpoint;
    private final LayoutService layoutService;
    private final Query<GetNavNodesParams, HubPartialNavTree> queryPartialTreeByParentId;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;

    /* compiled from: EcHubNavTreeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EcHubNavTreeStore", m3645f = "EcHubNavTreeStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 144}, m3647m = "isStale")
    /* renamed from: com.robinhood.store.event.EcHubNavTreeStore$isStale$1 */
    static final class C413531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413531(Continuation<? super C413531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcHubNavTreeStore.this.isStale(null, this);
        }
    }

    private static /* synthetic */ void getQueryPartialTreeByParentId$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcHubNavTreeStore(LayoutService layoutService, EcHubNavNodeDao ecHubNavNodeDao, EcHubSessionTracker ecHubSessionTracker, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, Clock clock, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(layoutService, "layoutService");
        Intrinsics.checkNotNullParameter(ecHubNavNodeDao, "ecHubNavNodeDao");
        Intrinsics.checkNotNullParameter(ecHubSessionTracker, "ecHubSessionTracker");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.layoutService = layoutService;
        this.ecHubNavNodeDao = ecHubNavNodeDao;
        this.ecHubSessionTracker = ecHubSessionTracker;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.clock = clock;
        Endpoint<GetNavNodesParams, PartialTree> endpointCreateWithParams = Endpoint.INSTANCE.createWithParams(new EcHubNavTreeStore2(this, null), storeBundle.getLogoutKillswitch(), new EcHubNavTreeStore3(this, null), new EcHubNavTreeStore4(this, null), storeBundle.getClock());
        this.getNavNodesEndpoint = endpointCreateWithParams;
        this.queryPartialTreeByParentId = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryPartialTreeByParentId", CollectionsKt.listOf(new RefreshEach(new C413541(endpointCreateWithParams))), new Function1() { // from class: com.robinhood.store.event.EcHubNavTreeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EcHubNavTreeStore.queryPartialTreeByParentId$lambda$5(this.f$0, (EcHubNavTreeStore.GetNavNodesParams) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EcHubNavTreeStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubNavTreeStore$GetNavNodesParams;", "", "parentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getParentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetNavNodesParams {
        private final UUID parentId;

        /* JADX WARN: Multi-variable type inference failed */
        public GetNavNodesParams() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ GetNavNodesParams copy$default(GetNavNodesParams getNavNodesParams, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getNavNodesParams.parentId;
            }
            return getNavNodesParams.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getParentId() {
            return this.parentId;
        }

        public final GetNavNodesParams copy(UUID parentId) {
            return new GetNavNodesParams(parentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GetNavNodesParams) && Intrinsics.areEqual(this.parentId, ((GetNavNodesParams) other).parentId);
        }

        public int hashCode() {
            UUID uuid = this.parentId;
            if (uuid == null) {
                return 0;
            }
            return uuid.hashCode();
        }

        public String toString() {
            return "GetNavNodesParams(parentId=" + this.parentId + ")";
        }

        public GetNavNodesParams(UUID uuid) {
            this.parentId = uuid;
        }

        public /* synthetic */ GetNavNodesParams(UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uuid);
        }

        public final UUID getParentId() {
            return this.parentId;
        }
    }

    /* compiled from: EcHubNavTreeStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.event.EcHubNavTreeStore$queryPartialTreeByParentId$1 */
    /* synthetic */ class C413541 extends AdaptedFunctionReference implements Function1<GetNavNodesParams, Job> {
        C413541(Object obj) {
            super(1, obj, Endpoint.class, "refresh", "refresh(Ljava/lang/Object;ZLkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/Job;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Job invoke(GetNavNodesParams p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return Endpoint.DefaultImpls.refresh$default((Endpoint) this.receiver, p0, false, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryPartialTreeByParentId$lambda$5(EcHubNavTreeStore ecHubNavTreeStore, GetNavNodesParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(FlowKt.transformLatest(FlowKt.filterNotNull(ecHubNavTreeStore.ecHubNavNodeDao.streamNode(params.getParentId())), new C41349xae3dc202(null, ecHubNavTreeStore)), new C41350xae3dc203(null, ecHubNavTreeStore)));
    }

    public final Object forceFetchPartialTreeByParentId(UUID uuid, Continuation<? super PartialTree> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.getNavNodesEndpoint, new GetNavNodesParams(uuid), null, continuation, 2, null);
    }

    public static /* synthetic */ Flow queryPartialTreeByParentId$default(EcHubNavTreeStore ecHubNavTreeStore, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return ecHubNavTreeStore.queryPartialTreeByParentId(uuid);
    }

    public final Flow<HubPartialNavTree> queryPartialTreeByParentId(UUID parentId) {
        return this.queryPartialTreeByParentId.asFlow(new GetNavNodesParams(parentId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isStale(UUID uuid, Continuation<? super Boolean> continuation) {
        C413531 c413531;
        if (continuation instanceof C413531) {
            c413531 = (C413531) continuation;
            int i = c413531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413531.label = i - Integer.MIN_VALUE;
            } else {
                c413531 = new C413531(continuation);
            }
        }
        Object node = c413531.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413531.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(node);
            EcHubNavNodeDao ecHubNavNodeDao = this.ecHubNavNodeDao;
            c413531.label = 1;
            node = ecHubNavNodeDao.getNode(uuid, c413531);
            if (node != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(node);
            return node;
        }
        ResultKt.throwOnFailure(node);
        EcHubNavNode ecHubNavNode = (EcHubNavNode) node;
        if (ecHubNavNode != null) {
            EcHubSessionTracker ecHubSessionTracker = this.ecHubSessionTracker;
            String strGenerateRefId$lib_store_event_externalDebug = INSTANCE.generateRefId$lib_store_event_externalDebug(ecHubNavNode.getId());
            c413531.label = 2;
            Object objIsRecordStale$lib_store_event_externalDebug = ecHubSessionTracker.isRecordStale$lib_store_event_externalDebug(strGenerateRefId$lib_store_event_externalDebug, c413531);
            return objIsRecordStale$lib_store_event_externalDebug == coroutine_suspended ? coroutine_suspended : objIsRecordStale$lib_store_event_externalDebug;
        }
        return boxing.boxBoolean(true);
    }

    static /* synthetic */ Object isStale$default(EcHubNavTreeStore ecHubNavTreeStore, UUID uuid, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = null;
        }
        return ecHubNavTreeStore.isStale(uuid, continuation);
    }

    /* compiled from: EcHubNavTreeStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/event/EcHubNavTreeStore$Companion;", "", "<init>", "()V", "TRACKER_PREFIX", "", "generateRefId", "parentId", "Ljava/util/UUID;", "generateRefId$lib_store_event_externalDebug", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String generateRefId$lib_store_event_externalDebug(UUID parentId) {
            Intrinsics.checkNotNullParameter(parentId, "parentId");
            return EcHubNavTreeStore.TRACKER_PREFIX + Uuids.safeToString(parentId);
        }
    }
}
