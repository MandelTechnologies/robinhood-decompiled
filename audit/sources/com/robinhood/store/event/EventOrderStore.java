package com.robinhood.store.event;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.experiments.EcLimitAndNotionalExperiment;
import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.event.p186db.dao.EventOrderDao;
import com.robinhood.android.models.event.p186db.order.EventOrder;
import com.robinhood.android.models.event.p186db.order.EventOrder4;
import com.robinhood.android.models.event.p186db.order.EventOrderPositionEffect;
import com.robinhood.android.models.event.p186db.order.EventOrderSide;
import com.robinhood.android.models.event.p186db.order.UiEventOrder;
import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.android.models.futures.api.order.FuturesOrderState5;
import com.robinhood.android.models.futures.p189db.FuturesOrderKt;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.CancelEventContractOrderRequestDto;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CreateEventContractOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.FuturesOrderLegRequestDto;
import com.robinhood.ceres.p284v1.GetFeesForTentativeOrderRequestDto;
import com.robinhood.ceres.p284v1.GetFeesForTentativeOrderResponseDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.ceres.p284v1.TentativeFuturesOrderRequestDto;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Response;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesAccountStore;
import com.robinhood.store.futures.extensions.HttpExceptions;
import com.robinhood.store.futures.idl.FuturesOrderToIdlExtensions;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Instant;
import retrofit2.HttpException;
import timber.log.Timber;

/* compiled from: EventOrderStore.kt */
@Metadata(m3635d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!2\u0006\u0010\"\u001a\u00020\u0014J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150!2\u0006\u0010$\u001a\u00020\u0018J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&2\u0006\u0010$\u001a\u00020\u0018J\u0016\u0010'\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010(J2\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u00100J2\u00101\u001a\u0004\u0018\u00010\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u00100J \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u001b0&2\u0006\u00103\u001a\u00020\u001aJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0018H\u0002J.\u0010I\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0J0\u001b0&2\u0006\u0010K\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u0018J.\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&2\u0006\u0010K\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010O\u001a\u00020PR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u001b0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R \u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002070605X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010C\u001a\u00020D¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/store/event/EventOrderStore;", "Lcom/robinhood/store/Store;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "eventOrderDao", "Lcom/robinhood/android/models/event/db/dao/EventOrderDao;", "eventStore", "Lcom/robinhood/store/event/EventStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/FuturesAccountStore;", "contractDetailsDisplayStore", "Lcom/robinhood/store/event/ContractDetailsDisplayStore;", "experimentsProvider", "Lcom/robinhood/experiments/ExperimentsProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/android/models/event/db/dao/EventOrderDao;Lcom/robinhood/store/event/EventStore;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/event/ContractDetailsDisplayStore;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/store/StoreBundle;)V", "postOrder", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/ceres/v1/CreateEventContractOrderRequestDto;", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "getOrderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "getEstimatedFeesForMultipleContractsEndpoint", "Lcom/robinhood/store/event/EstimatedFeesParams;", "", "Ljava/math/BigDecimal;", "getOrderQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "submitOrder", "Lio/reactivex/Single;", "orderRequest", "fetchOrder", "orderId", "streamOrder", "Lkotlinx/coroutines/flow/Flow;", "cancelOrder", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFeesForTentativeOrder", "Lcom/robinhood/ceres/v1/GetFeesForTentativeOrderResponseDto;", "swapsAccountId", "eventContractId", "side", "Lcom/robinhood/android/models/event/db/order/EventOrderSide;", "quantity", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/android/models/event/db/order/EventOrderSide;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEstimatedFeePerContractAmount", "streamEstimatedFeesForMultipleContracts", "params", "getOrdersEndpointPaginated", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Lcom/robinhood/idl/Response;", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "refreshOrders", "", "swapSubAccountId", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/android/models/event/db/order/EventOrder;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "isInLimitOrderNotionalExperimentFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader$annotations", "()V", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamContractIdsToOrders", "", "swapAccountId", "eventId", "streamPendingOrderContractQuantity", "contractId", "positionEffect", "Lcom/robinhood/android/models/event/db/order/EventOrderPositionEffect;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class EventOrderStore extends Store {
    private final Ceres ceres;
    private final ContractDetailsDisplayStore contractDetailsDisplayStore;
    private final EventOrderDao eventOrderDao;
    private final EventStore eventStore;
    private final ExperimentsProvider experimentsProvider;
    private final FuturesAccountStore futuresAccountStore;
    private final Endpoint<EstimatedFeesParams, Map<UUID, BigDecimal>> getEstimatedFeesForMultipleContractsEndpoint;
    private final Endpoint<UUID, FuturesOrderDto> getOrderEndpoint;
    private final Query<UUID, UiEventOrder> getOrderQuery;
    private final IdlPaginatedResponseEndpoint<UUID, Response<GetOrdersResponseDto>> getOrdersEndpointPaginated;
    private final HistoryLoader.Callbacks<EventOrder> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final SharedFlow<Boolean> isInLimitOrderNotionalExperimentFlow;
    private final PostEndpoint<CreateEventContractOrderRequestDto, FuturesOrderDto> postOrder;

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventOrderPositionEffect.values().length];
            try {
                iArr[EventOrderPositionEffect.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventOrderPositionEffect.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 165, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 192}, m3647m = "cancelOrder")
    /* renamed from: com.robinhood.store.event.EventOrderStore$cancelOrder$1 */
    static final class C413781 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C413781(Continuation<? super C413781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventOrderStore.this.cancelOrder(null, this);
        }
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE}, m3647m = "getEstimatedFeePerContractAmount")
    /* renamed from: com.robinhood.store.event.EventOrderStore$getEstimatedFeePerContractAmount$1 */
    static final class C413801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413801(Continuation<? super C413801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventOrderStore.this.getEstimatedFeePerContractAmount(null, null, null, null, this);
        }
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "getFeesForTentativeOrder")
    /* renamed from: com.robinhood.store.event.EventOrderStore$getFeesForTentativeOrder$1 */
    static final class C413831 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C413831(Continuation<? super C413831> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventOrderStore.this.getFeesForTentativeOrder(null, null, null, null, this);
        }
    }

    public static /* synthetic */ void getHistoryTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventOrderStore(Ceres ceres, EventOrderDao eventOrderDao, EventStore eventStore, FuturesAccountStore futuresAccountStore, ContractDetailsDisplayStore contractDetailsDisplayStore, ExperimentsProvider experimentsProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(eventOrderDao, "eventOrderDao");
        Intrinsics.checkNotNullParameter(eventStore, "eventStore");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(contractDetailsDisplayStore, "contractDetailsDisplayStore");
        Intrinsics.checkNotNullParameter(experimentsProvider, "experimentsProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.eventOrderDao = eventOrderDao;
        this.eventStore = eventStore;
        this.futuresAccountStore = futuresAccountStore;
        this.contractDetailsDisplayStore = contractDetailsDisplayStore;
        this.experimentsProvider = experimentsProvider;
        this.postOrder = PostEndpoint.INSTANCE.create(new EventOrderStore$postOrder$1(this, null), new EventOrderStore$postOrder$2(eventOrderDao));
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<UUID, FuturesOrderDto> endpointCreate$default = Endpoint.Companion.create$default(companion, new EventOrderStore$getOrderEndpoint$1(this, null), storeBundle.getLogoutKillswitch(), new EventOrderStore$getOrderEndpoint$2(eventOrderDao), storeBundle.getClock(), null, 16, null);
        this.getOrderEndpoint = endpointCreate$default;
        this.getEstimatedFeesForMultipleContractsEndpoint = Endpoint.Companion.createWithParams$default(companion, new EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$1(this, null), storeBundle.getLogoutKillswitch(), new EventOrderStore$getEstimatedFeesForMultipleContractsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.getOrderQuery = Store.create$default(this, Query.INSTANCE, "getOrder", CollectionsKt.listOf(new PollEach(getStoreScope(), new EventOrderStore$getOrderQuery$1(endpointCreate$default))), new EventOrderStore$getOrderQuery$2(eventOrderDao), false, 8, null);
        this.getOrdersEndpointPaginated = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(IdlPaginatedResponseEndpoint.INSTANCE, new EventOrderStore$getOrdersEndpointPaginated$1(this, null), new Function1() { // from class: com.robinhood.store.event.EventOrderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventOrderStore.getOrdersEndpointPaginated$lambda$2((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.event.EventOrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EventOrderStore.getOrdersEndpointPaginated$lambda$3((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new EventOrderStore$getOrdersEndpointPaginated$4(this, null), storeBundle.getClock(), null, 64, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<EventOrder>() { // from class: com.robinhood.store.event.EventOrderStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.EVENT_ORDER);
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

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter != null && (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) != null) {
                    this.this$0.refreshOrders(swapsSubAccountId);
                    return FlowKt.filterNotNull(this.this$0.eventOrderDao.countTotal(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), swapsSubAccountId));
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
                return FlowKt.filterNotNull(this.this$0.eventOrderDao.countLater(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventOrder>> getLatest(HistoryLoader.Filter filter, int limit) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter != null && (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) != null) {
                    this.this$0.refreshOrders(swapsSubAccountId);
                    return this.this$0.eventOrderDao.getLatest(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), swapsSubAccountId, limit);
                }
                return FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventOrder>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.eventOrderDao.getLater(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventOrder>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.eventOrderDao.get(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<EventOrder>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID swapsSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (swapsSubAccountId = staticFilter.getSwapsSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.eventOrderDao.getEarlier(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, swapsSubAccountId, id, limit);
            }
        };
        final Flow flowCoStreamVariant = experimentsProvider.coStreamVariant(EcLimitAndNotionalExperiment.INSTANCE, EcLimitAndNotionalExperiment.Variant.INSTANCE.getDefault(), false);
        this.isInLimitOrderNotionalExperimentFlow = FlowKt.shareIn(new Flow<Boolean>() { // from class: com.robinhood.store.event.EventOrderStore$special$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowCoStreamVariant.collect(new C413772(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.event.EventOrderStore$special$$inlined$map$1$2 */
            public static final class C413772<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$special$$inlined$map$1$2", m3645f = "EventOrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.event.EventOrderStore$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C413772.this.emit(null, this);
                    }
                }

                public C413772(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(((EcLimitAndNotionalExperiment.Variant) obj).isInTreatmentExperience());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
        }, getStoreScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), 1);
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.event.EventOrderStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.EVENT_ORDER);
                return FlowKt.transformLatest(this.this$0.streamOrder(reference.getSourceId()), new C41376x4eb89f35(null, this.this$0));
            }
        };
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$submitOrder$1", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventOrderStore$submitOrder$1 */
    static final class C413861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super FuturesOrderDto>, Object> {
        final /* synthetic */ CreateEventContractOrderRequestDto $orderRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413861(CreateEventContractOrderRequestDto createEventContractOrderRequestDto, Continuation<? super C413861> continuation) {
            super(2, continuation);
            this.$orderRequest = createEventContractOrderRequestDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventOrderStore.this.new C413861(this.$orderRequest, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FuturesOrderDto> continuation) {
            return ((C413861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PostEndpoint postEndpoint = EventOrderStore.this.postOrder;
            CreateEventContractOrderRequestDto createEventContractOrderRequestDto = this.$orderRequest;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, createEventContractOrderRequestDto, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<FuturesOrderDto> submitOrder(CreateEventContractOrderRequestDto orderRequest) {
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C413861(orderRequest, null), 1, null);
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$fetchOrder$1", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventOrderStore$fetchOrder$1 */
    static final class C413791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super FuturesOrderDto>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413791(UUID uuid, Continuation<? super C413791> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EventOrderStore.this.new C413791(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FuturesOrderDto> continuation) {
            return ((C413791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Endpoint endpoint = EventOrderStore.this.getOrderEndpoint;
            UUID uuid = this.$orderId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<FuturesOrderDto> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C413791(orderId, null), 1, null);
    }

    public final Flow<UiEventOrder> streamOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.transformWhile(FlowKt.distinctUntilChanged(this.getOrderQuery.asFlow(orderId)), new C413851(null));
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/models/event/db/order/UiEventOrder;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$streamOrder$1", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventOrderStore$streamOrder$1 */
    static final class C413851 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiEventOrder>, UiEventOrder, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C413851(Continuation<? super C413851> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super UiEventOrder> flowCollector, UiEventOrder uiEventOrder, Continuation<? super Boolean> continuation) {
            C413851 c413851 = new C413851(continuation);
            c413851.L$0 = flowCollector;
            c413851.L$1 = uiEventOrder;
            return c413851.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UiEventOrder uiEventOrder;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                UiEventOrder uiEventOrder2 = (UiEventOrder) this.L$1;
                this.L$0 = uiEventOrder2;
                this.label = 1;
                if (flowCollector.emit(uiEventOrder2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiEventOrder = uiEventOrder2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiEventOrder = (UiEventOrder) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!uiEventOrder.getOrder().getOrderState().toCommonState().isFinal());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r14) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r14) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[Catch: HttpException -> 0x0063, PHI: r0 r13
      0x00a1: PHI (r0v11 java.lang.Object) = (r0v10 java.lang.Object), (r0v3 java.lang.Object) binds: [B:34:0x009d, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r13v6 java.util.UUID) = (r13v3 java.util.UUID), (r13v8 java.util.UUID) binds: [B:34:0x009d, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {HttpException -> 0x0063, blocks: (B:24:0x005f, B:36:0x00a1, B:33:0x0082), top: B:66:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f6 -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelOrder(UUID uuid, Continuation<? super FuturesOrderDto> continuation) {
        C413781 c413781;
        UUID uuid2;
        C413781 c4137812;
        int i;
        int i2;
        UUID uuid3;
        Exception e;
        FuturesOrderDto futuresOrderDto;
        if (continuation instanceof C413781) {
            c413781 = (C413781) continuation;
            int i3 = c413781.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c413781.label = i3 - Integer.MIN_VALUE;
            } else {
                c413781 = new C413781(continuation);
            }
        }
        C413781 c4137813 = c413781;
        Object eventContractSwapsAccountId$default = c4137813.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (c4137813.label) {
                case 0:
                    ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
                    c4137813.L$0 = uuid;
                    c4137813.label = 1;
                    eventContractSwapsAccountId$default = FuturesAccountStore.getEventContractSwapsAccountId$default(futuresAccountStore, null, c4137813, 1, null);
                    if (eventContractSwapsAccountId$default != coroutine_suspended) {
                        UUID uuid4 = (UUID) eventContractSwapsAccountId$default;
                        Ceres ceres = this.ceres;
                        CancelEventContractOrderRequestDto cancelEventContractOrderRequestDto = new CancelEventContractOrderRequestDto(Uuids.safeToString(uuid), Uuids.safeToString(uuid4), null, 4, null);
                        c4137813.L$0 = uuid;
                        c4137813.label = 2;
                        eventContractSwapsAccountId$default = ceres.CancelEventContractOrder(cancelEventContractOrderRequestDto, c4137813);
                        if (eventContractSwapsAccountId$default == coroutine_suspended) {
                            c4137813.L$0 = uuid;
                            c4137813.label = 3;
                            break;
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    uuid = (UUID) c4137813.L$0;
                    ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    UUID uuid42 = (UUID) eventContractSwapsAccountId$default;
                    Ceres ceres2 = this.ceres;
                    CancelEventContractOrderRequestDto cancelEventContractOrderRequestDto2 = new CancelEventContractOrderRequestDto(Uuids.safeToString(uuid), Uuids.safeToString(uuid42), null, 4, null);
                    c4137813.L$0 = uuid;
                    c4137813.label = 2;
                    eventContractSwapsAccountId$default = ceres2.CancelEventContractOrder(cancelEventContractOrderRequestDto2, c4137813);
                    if (eventContractSwapsAccountId$default == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    uuid = (UUID) c4137813.L$0;
                    ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    c4137813.L$0 = uuid;
                    c4137813.label = 3;
                    break;
                case 3:
                    uuid = (UUID) c4137813.L$0;
                    ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    uuid2 = uuid;
                    c4137812 = c4137813;
                    i = 0;
                    i2 = 4;
                    if (i >= i2) {
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            uuid3 = uuid2;
                            c4137813 = c4137812;
                            Timber.INSTANCE.mo3354e(e);
                            c4137813.L$0 = uuid3;
                            c4137813.I$0 = i2;
                            c4137813.I$1 = i;
                            c4137813.label = 5;
                            break;
                        }
                        Endpoint<UUID, FuturesOrderDto> endpoint = this.getOrderEndpoint;
                        c4137812.L$0 = uuid2;
                        c4137812.I$0 = i2;
                        c4137812.I$1 = i;
                        c4137812.label = 4;
                        eventContractSwapsAccountId$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid2, null, c4137812, 2, null);
                        if (eventContractSwapsAccountId$default != coroutine_suspended) {
                            uuid3 = uuid2;
                            c4137813 = c4137812;
                            futuresOrderDto = (FuturesOrderDto) eventContractSwapsAccountId$default;
                            if (FuturesOrderKt.toCommonState(futuresOrderDto.getOrder_state()).isFinal()) {
                                return futuresOrderDto;
                            }
                            c4137813.L$0 = uuid3;
                            c4137813.I$0 = i2;
                            c4137813.I$1 = i;
                            c4137813.label = 5;
                        }
                    } else {
                        Endpoint<UUID, FuturesOrderDto> endpoint2 = this.getOrderEndpoint;
                        c4137812.L$0 = null;
                        c4137812.label = 6;
                        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint2, uuid2, null, c4137812, 2, null);
                        if (objForceFetch$default != coroutine_suspended) {
                            return objForceFetch$default;
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    i = c4137813.I$1;
                    i2 = c4137813.I$0;
                    uuid3 = (UUID) c4137813.L$0;
                    try {
                        ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    } catch (Exception e3) {
                        e = e3;
                        Timber.INSTANCE.mo3354e(e);
                        c4137813.L$0 = uuid3;
                        c4137813.I$0 = i2;
                        c4137813.I$1 = i;
                        c4137813.label = 5;
                        break;
                    }
                    futuresOrderDto = (FuturesOrderDto) eventContractSwapsAccountId$default;
                    if (FuturesOrderKt.toCommonState(futuresOrderDto.getOrder_state()).isFinal()) {
                    }
                    c4137813.L$0 = uuid3;
                    c4137813.I$0 = i2;
                    c4137813.I$1 = i;
                    c4137813.label = 5;
                    break;
                case 5:
                    i = c4137813.I$1;
                    i2 = c4137813.I$0;
                    uuid3 = (UUID) c4137813.L$0;
                    ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    c4137812 = c4137813;
                    uuid2 = uuid3;
                    i++;
                    if (i >= i2) {
                    }
                    return coroutine_suspended;
                case 6:
                    ResultKt.throwOnFailure(eventContractSwapsAccountId$default);
                    return eventContractSwapsAccountId$default;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (HttpException e4) {
            throw HttpExceptions.convertToStandardErrorIfPossible(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFeesForTentativeOrder(UUID uuid, UUID uuid2, EventOrderSide eventOrderSide, BigDecimal bigDecimal, Continuation<? super GetFeesForTentativeOrderResponseDto> continuation) throws Throwable {
        C413831 c413831;
        Object objM28550constructorimpl;
        String strSafeToString;
        if (continuation instanceof C413831) {
            c413831 = (C413831) continuation;
            int i = c413831.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413831.label = i - Integer.MIN_VALUE;
            } else {
                c413831 = new C413831(continuation);
            }
        }
        Object objGetFeesForTentativeOrder = c413831.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c413831.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
                if (uuid == null || (strSafeToString = Uuids.safeToString(uuid)) == null) {
                    return null;
                }
                GetFeesForTentativeOrderRequestDto getFeesForTentativeOrderRequestDto = new GetFeesForTentativeOrderRequestDto(strSafeToString, new TentativeFuturesOrderRequestDto(CollectionsKt.listOf(new FuturesOrderLegRequestDto(FuturesOrderToIdlExtensions.toIdlModel(FuturesContractType.EVENTS), Uuids.safeToString(uuid2), 1, eventOrderSide.toIdlModel())), IdlDecimal2.toIdlDecimal(bigDecimal), null, null, null, null, 60, null));
                Result.Companion companion = Result.INSTANCE;
                Ceres ceres = this.ceres;
                c413831.label = 1;
                objGetFeesForTentativeOrder = ceres.GetFeesForTentativeOrder(getFeesForTentativeOrderRequestDto, c413831);
                if (objGetFeesForTentativeOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGetFeesForTentativeOrder);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((GetFeesForTentativeOrderResponseDto) objGetFeesForTentativeOrder);
        } catch (Throwable th) {
            Throwables.rethrowIfNotNetworkRelated(th);
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getEstimatedFeePerContractAmount(UUID uuid, UUID uuid2, EventOrderSide eventOrderSide, BigDecimal bigDecimal, Continuation<? super BigDecimal> continuation) throws Throwable {
        C413801 c413801;
        MoneyDto total_fee_per_contract;
        IdlDecimal amount;
        if (continuation instanceof C413801) {
            c413801 = (C413801) continuation;
            int i = c413801.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c413801.label = i - Integer.MIN_VALUE;
            } else {
                c413801 = new C413801(continuation);
            }
        }
        C413801 c4138012 = c413801;
        Object feesForTentativeOrder = c4138012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4138012.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(feesForTentativeOrder);
            c4138012.label = 1;
            feesForTentativeOrder = getFeesForTentativeOrder(uuid, uuid2, eventOrderSide, bigDecimal, c4138012);
            if (feesForTentativeOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(feesForTentativeOrder);
        }
        GetFeesForTentativeOrderResponseDto getFeesForTentativeOrderResponseDto = (GetFeesForTentativeOrderResponseDto) feesForTentativeOrder;
        if (getFeesForTentativeOrderResponseDto == null || (total_fee_per_contract = getFeesForTentativeOrderResponseDto.getTotal_fee_per_contract()) == null || (amount = total_fee_per_contract.getAmount()) == null) {
            return null;
        }
        return amount.toBigDecimalOrNull();
    }

    /* compiled from: EventOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljava/util/UUID;", "Ljava/math/BigDecimal;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.event.EventOrderStore$streamEstimatedFeesForMultipleContracts$1", m3645f = "EventOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.event.EventOrderStore$streamEstimatedFeesForMultipleContracts$1 */
    static final class C413841 extends ContinuationImpl7 implements Function2<FlowCollector<? super Map<UUID, ? extends BigDecimal>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ EstimatedFeesParams $params;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C413841(EstimatedFeesParams estimatedFeesParams, Continuation<? super C413841> continuation) {
            super(2, continuation);
            this.$params = estimatedFeesParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C413841 c413841 = EventOrderStore.this.new C413841(this.$params, continuation);
            c413841.L$0 = obj;
            return c413841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Map<UUID, ? extends BigDecimal>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C413841) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C413841 c413841;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                Endpoint endpoint = EventOrderStore.this.getEstimatedFeesForMultipleContractsEndpoint;
                EstimatedFeesParams estimatedFeesParams = this.$params;
                this.L$0 = flowCollector;
                this.label = 1;
                c413841 = this;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, estimatedFeesParams, null, c413841, 2, null);
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
            c413841 = this;
            c413841.L$0 = null;
            c413841.label = 2;
        }
    }

    public final Flow<Map<UUID, BigDecimal>> streamEstimatedFeesForMultipleContracts(EstimatedFeesParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.getContractIds().isEmpty() || params.getSwapsAccountId() == null) {
            return FlowKt.flowOf(MapsKt.emptyMap());
        }
        return FlowKt.flow(new C413841(params, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getOrdersEndpointPaginated$lambda$2(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetOrdersResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getOrdersEndpointPaginated$lambda$3(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetOrdersResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshOrders(UUID swapSubAccountId) {
        ScopedSubscriptionKt.subscribeIn(ObservablesKt.ignoreNetworkExceptions(asObservable(this.getOrdersEndpointPaginated.fetchAllPages(swapSubAccountId))), getStoreScope());
    }

    public final HistoryLoader.Callbacks<EventOrder> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final Flow<Map<UUID, List<UiEventOrder>>> streamContractIdsToOrders(UUID swapAccountId, UUID eventId) {
        Intrinsics.checkNotNullParameter(swapAccountId, "swapAccountId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        refreshOrders(swapAccountId);
        return FlowKt.filterNotNull(this.eventOrderDao.streamOrdersByEventId(swapAccountId, eventId, FuturesOrderState.INSTANCE.getPendingOrderStates()));
    }

    public final Flow<BigDecimal> streamPendingOrderContractQuantity(UUID swapAccountId, UUID contractId, EventOrderSide side, EventOrderPositionEffect positionEffect) {
        EventOrder4 eventOrder4;
        Intrinsics.checkNotNullParameter(swapAccountId, "swapAccountId");
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
        refreshOrders(swapAccountId);
        EventOrderDao eventOrderDao = this.eventOrderDao;
        Set<FuturesOrderState> pendingOrderStates = FuturesOrderState.INSTANCE.getPendingOrderStates();
        int i = WhenMappings.$EnumSwitchMapping$0[positionEffect.ordinal()];
        if (i == 1) {
            eventOrder4 = EventOrder4.OPENING;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            eventOrder4 = EventOrder4.CLOSING;
        }
        return eventOrderDao.getAccumulatedOrderContractUnfilledQuantity(swapAccountId, contractId, pendingOrderStates, eventOrder4, side);
    }
}
