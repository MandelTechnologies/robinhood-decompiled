package com.robinhood.store.event;

import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.dao.OrderFormDisplayDetailsDao;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.models.event.p186db.predictionmarkets.OrderFormDisplayDetails;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.idl.Response;
import com.robinhood.prediction_markets.proto.p361v1.idl.GetOrderFormDisplayDetailsResponseDto;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.event.OrderDisplayStore;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: OrderDisplayStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/store/event/OrderDisplayStore;", "Lcom/robinhood/store/Store;", "orderFormDisplayDetailsDao", "Lcom/robinhood/android/models/event/db/dao/OrderFormDisplayDetailsDao;", "instrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/models/event/db/dao/OrderFormDisplayDetailsDao;Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;Lcom/robinhood/store/StoreBundle;)V", "getOrderFormDisplayDetailsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/event/OrderDisplayStore$OrderFormDisplayDetailsParams;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetOrderFormDisplayDetailsResponseDto;", "getOrderFormDisplayDetailsQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/models/event/db/predictionmarkets/OrderFormDisplayDetails;", "streamOrderFormDetailsUi", "Lkotlinx/coroutines/flow/Flow;", "contractId", "Ljava/util/UUID;", "side", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "orderFormOrderType", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "OrderFormDisplayDetailsParams", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class OrderDisplayStore extends Store {
    private final Endpoint<OrderFormDisplayDetailsParams, Response<GetOrderFormDisplayDetailsResponseDto>> getOrderFormDisplayDetailsEndpoint;
    private final Query<OrderFormDisplayDetailsParams, OrderFormDisplayDetails> getOrderFormDisplayDetailsQuery;
    private final InstrumentService instrumentService;
    private final OrderFormDisplayDetailsDao orderFormDisplayDetailsDao;
    private final PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDisplayStore(OrderFormDisplayDetailsDao orderFormDisplayDetailsDao, InstrumentService instrumentService, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(orderFormDisplayDetailsDao, "orderFormDisplayDetailsDao");
        Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.orderFormDisplayDetailsDao = orderFormDisplayDetailsDao;
        this.instrumentService = instrumentService;
        this.requestHeaderPlugin = requestHeaderPlugin;
        Endpoint<OrderFormDisplayDetailsParams, Response<GetOrderFormDisplayDetailsResponseDto>> endpointCreateWithParams$default = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new OrderDisplayStore2(this, null), storeBundle.getLogoutKillswitch(), new OrderDisplayStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getOrderFormDisplayDetailsEndpoint = endpointCreateWithParams$default;
        this.getOrderFormDisplayDetailsQuery = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "getOrderFormDisplayDetails", CollectionsKt.listOf(new RefreshEach(new OrderDisplayStore4(endpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.store.event.OrderDisplayStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDisplayStore.getOrderFormDisplayDetailsQuery$lambda$0(this.f$0, (OrderDisplayStore.OrderFormDisplayDetailsParams) obj);
            }
        }, false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderDisplayStore.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/event/OrderDisplayStore$OrderFormDisplayDetailsParams;", "", "contractId", "Ljava/util/UUID;", "side", "Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "orderFormOrderType", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/models/event/ContractSide;Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;)V", "getContractId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/android/eventcontracts/models/event/ContractSide;", "getPositionEffect", "()Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "getOrderFormOrderType", "()Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class OrderFormDisplayDetailsParams {
        private final UUID contractId;
        private final OrderFormOrderType orderFormOrderType;
        private final EventOrderPositionEffect positionEffect;
        private final ContractSide side;

        public static /* synthetic */ OrderFormDisplayDetailsParams copy$default(OrderFormDisplayDetailsParams orderFormDisplayDetailsParams, UUID uuid, ContractSide contractSide, EventOrderPositionEffect eventOrderPositionEffect, OrderFormOrderType orderFormOrderType, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = orderFormDisplayDetailsParams.contractId;
            }
            if ((i & 2) != 0) {
                contractSide = orderFormDisplayDetailsParams.side;
            }
            if ((i & 4) != 0) {
                eventOrderPositionEffect = orderFormDisplayDetailsParams.positionEffect;
            }
            if ((i & 8) != 0) {
                orderFormOrderType = orderFormDisplayDetailsParams.orderFormOrderType;
            }
            return orderFormDisplayDetailsParams.copy(uuid, contractSide, eventOrderPositionEffect, orderFormOrderType);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final ContractSide getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final EventOrderPositionEffect getPositionEffect() {
            return this.positionEffect;
        }

        /* renamed from: component4, reason: from getter */
        public final OrderFormOrderType getOrderFormOrderType() {
            return this.orderFormOrderType;
        }

        public final OrderFormDisplayDetailsParams copy(UUID contractId, ContractSide side, EventOrderPositionEffect positionEffect, OrderFormOrderType orderFormOrderType) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            Intrinsics.checkNotNullParameter(orderFormOrderType, "orderFormOrderType");
            return new OrderFormDisplayDetailsParams(contractId, side, positionEffect, orderFormOrderType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderFormDisplayDetailsParams)) {
                return false;
            }
            OrderFormDisplayDetailsParams orderFormDisplayDetailsParams = (OrderFormDisplayDetailsParams) other;
            return Intrinsics.areEqual(this.contractId, orderFormDisplayDetailsParams.contractId) && this.side == orderFormDisplayDetailsParams.side && this.positionEffect == orderFormDisplayDetailsParams.positionEffect && this.orderFormOrderType == orderFormDisplayDetailsParams.orderFormOrderType;
        }

        public int hashCode() {
            return (((((this.contractId.hashCode() * 31) + this.side.hashCode()) * 31) + this.positionEffect.hashCode()) * 31) + this.orderFormOrderType.hashCode();
        }

        public String toString() {
            return "OrderFormDisplayDetailsParams(contractId=" + this.contractId + ", side=" + this.side + ", positionEffect=" + this.positionEffect + ", orderFormOrderType=" + this.orderFormOrderType + ")";
        }

        public OrderFormDisplayDetailsParams(UUID contractId, ContractSide side, EventOrderPositionEffect positionEffect, OrderFormOrderType orderFormOrderType) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            Intrinsics.checkNotNullParameter(orderFormOrderType, "orderFormOrderType");
            this.contractId = contractId;
            this.side = side;
            this.positionEffect = positionEffect;
            this.orderFormOrderType = orderFormOrderType;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final ContractSide getSide() {
            return this.side;
        }

        public final EventOrderPositionEffect getPositionEffect() {
            return this.positionEffect;
        }

        public final OrderFormOrderType getOrderFormOrderType() {
            return this.orderFormOrderType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getOrderFormDisplayDetailsQuery$lambda$0(OrderDisplayStore orderDisplayStore, OrderFormDisplayDetailsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return orderDisplayStore.orderFormDisplayDetailsDao.get(params.getContractId(), params.getSide(), params.getPositionEffect(), params.getOrderFormOrderType());
    }

    public final Flow<OrderFormDisplayDetails> streamOrderFormDetailsUi(UUID contractId, ContractSide side, EventOrderPositionEffect positionEffect, OrderFormOrderType orderFormOrderType) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        Intrinsics.checkNotNullParameter(orderFormOrderType, "orderFormOrderType");
        final Flow flowFilterNotNull = FlowKt.filterNotNull(this.getOrderFormDisplayDetailsQuery.asFlow(new OrderFormDisplayDetailsParams(contractId, side, positionEffect, orderFormOrderType)));
        return new Flow<OrderFormDisplayDetails>() { // from class: com.robinhood.store.event.OrderDisplayStore$streamOrderFormDetailsUi$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.OrderDisplayStore$streamOrderFormDetailsUi$$inlined$map$1$2 */
            public static final class C414172<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.OrderDisplayStore$streamOrderFormDetailsUi$$inlined$map$1$2", m3645f = "OrderDisplayStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.OrderDisplayStore$streamOrderFormDetailsUi$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C414172.this.emit(null, this);
                    }
                }

                public C414172(FlowCollector flowCollector) {
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
                        OrderFormDisplayDetails orderFormDisplayDetails = (OrderFormDisplayDetails) obj;
                        if (StringsKt.isBlank(orderFormDisplayDetails.getOrderTitle())) {
                            orderFormDisplayDetails = null;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orderFormDisplayDetails, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super OrderFormDisplayDetails> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C414172(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
