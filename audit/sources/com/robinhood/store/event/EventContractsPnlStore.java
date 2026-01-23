package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.event.p186db.ceres.EventContractRealizedPnlByContract;
import com.robinhood.android.models.event.p186db.dao.EventContractRealizedPnlDao;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.GetEventContractRealizedPnlByContractResponseDto;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.EventContractsPnlStore;
import com.robinhood.store.futures.FuturesAccountStore;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EventContractsPnlStore.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR,\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u00100\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/event/EventContractsPnlStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/ceres/v1/Ceres;", "ceres", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/android/models/event/db/dao/EventContractRealizedPnlDao;", "eventContractRealizedPnlDao", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/android/models/event/db/dao/EventContractRealizedPnlDao;Lcom/robinhood/store/StoreBundle;)V", "", "Ljava/util/UUID;", "contractIds", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/models/event/db/ceres/EventContractRealizedPnlByContract;", "streamEventContractRealizedPnlByContract", "(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/ceres/v1/Ceres;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/android/models/event/db/dao/EventContractRealizedPnlDao;", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/event/EventContractsPnlStore$EventContractRealizedPnlByContractParams;", "Lcom/robinhood/ceres/v1/GetEventContractRealizedPnlByContractResponseDto;", "getEventContractRealizedPnlByContractEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/moria/db/Query;", "getEventContractRealizedPnlByContractQuery", "Lcom/robinhood/android/moria/db/Query;", "EventContractRealizedPnlByContractParams", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EventContractsPnlStore extends Store {
    private final Ceres ceres;
    private final EventContractRealizedPnlDao eventContractRealizedPnlDao;
    private final FuturesAccountStore futuresAccountStore;
    private final Endpoint<EventContractRealizedPnlByContractParams, GetEventContractRealizedPnlByContractResponseDto> getEventContractRealizedPnlByContractEndpoint;
    private final Query<EventContractRealizedPnlByContractParams, Map<UUID, EventContractRealizedPnlByContract>> getEventContractRealizedPnlByContractQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventContractsPnlStore(Ceres ceres, FuturesAccountStore futuresAccountStore, EventContractRealizedPnlDao eventContractRealizedPnlDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(eventContractRealizedPnlDao, "eventContractRealizedPnlDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.eventContractRealizedPnlDao = eventContractRealizedPnlDao;
        Endpoint<EventContractRealizedPnlByContractParams, GetEventContractRealizedPnlByContractResponseDto> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new EventContractsPnlStore2(this, null), getLogoutKillswitch(), new EventContractsPnlStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getEventContractRealizedPnlByContractEndpoint = endpointCreate$default;
        this.getEventContractRealizedPnlByContractQuery = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "getEventContractRealizedPnlByContractQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new EventContractsPnlStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.store.event.EventContractsPnlStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventContractsPnlStore.getEventContractRealizedPnlByContractQuery$lambda$0(this.f$0, (EventContractsPnlStore.EventContractRealizedPnlByContractParams) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventContractsPnlStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/event/EventContractsPnlStore$EventContractRealizedPnlByContractParams;", "", "accountId", "Ljava/util/UUID;", "contractIds", "", "<init>", "(Ljava/util/UUID;Ljava/util/List;)V", "getAccountId", "()Ljava/util/UUID;", "getContractIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class EventContractRealizedPnlByContractParams {
        private final UUID accountId;
        private final List<UUID> contractIds;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EventContractRealizedPnlByContractParams copy$default(EventContractRealizedPnlByContractParams eventContractRealizedPnlByContractParams, UUID uuid, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = eventContractRealizedPnlByContractParams.accountId;
            }
            if ((i & 2) != 0) {
                list = eventContractRealizedPnlByContractParams.contractIds;
            }
            return eventContractRealizedPnlByContractParams.copy(uuid, list);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        public final List<UUID> component2() {
            return this.contractIds;
        }

        public final EventContractRealizedPnlByContractParams copy(UUID accountId, List<UUID> contractIds) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            return new EventContractRealizedPnlByContractParams(accountId, contractIds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventContractRealizedPnlByContractParams)) {
                return false;
            }
            EventContractRealizedPnlByContractParams eventContractRealizedPnlByContractParams = (EventContractRealizedPnlByContractParams) other;
            return Intrinsics.areEqual(this.accountId, eventContractRealizedPnlByContractParams.accountId) && Intrinsics.areEqual(this.contractIds, eventContractRealizedPnlByContractParams.contractIds);
        }

        public int hashCode() {
            return (this.accountId.hashCode() * 31) + this.contractIds.hashCode();
        }

        public String toString() {
            return "EventContractRealizedPnlByContractParams(accountId=" + this.accountId + ", contractIds=" + this.contractIds + ")";
        }

        public EventContractRealizedPnlByContractParams(UUID accountId, List<UUID> contractIds) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(contractIds, "contractIds");
            this.accountId = accountId;
            this.contractIds = contractIds;
        }

        public final UUID getAccountId() {
            return this.accountId;
        }

        public final List<UUID> getContractIds() {
            return this.contractIds;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getEventContractRealizedPnlByContractQuery$lambda$0(EventContractsPnlStore eventContractsPnlStore, EventContractRealizedPnlByContractParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return eventContractsPnlStore.eventContractRealizedPnlDao.getEventContractRealizedPnl(params.getContractIds());
    }

    /* compiled from: EventContractsPnlStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventContractsPnlStore$streamEventContractRealizedPnlByContract$1", m3645f = "EventContractsPnlStore.kt", m3646l = {66, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventContractsPnlStore$streamEventContractRealizedPnlByContract$1 */
    static final class C413681 extends ContinuationImpl7 implements Function2<FlowCollector<? super UUID>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C413681(Continuation<? super C413681> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C413681 c413681 = EventContractsPnlStore.this.new C413681(continuation);
            c413681.L$0 = obj;
            return c413681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super UUID> flowCollector, Continuation<? super Unit> continuation) {
            return ((C413681) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                FuturesAccountStore futuresAccountStore = EventContractsPnlStore.this.futuresAccountStore;
                FuturesAccountType futuresAccountType = FuturesAccountType.EVENT_CONTRACT_SWAPS;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = futuresAccountStore.getRhdAccountId(futuresAccountType, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) obj;
            if (uuid != null) {
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Map<UUID, EventContractRealizedPnlByContract>> streamEventContractRealizedPnlByContract(List<UUID> contractIds) {
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        return FlowKt.transformLatest(FlowKt.flow(new C413681(null)), new C41364xf28efa97(null, this, contractIds));
    }
}
