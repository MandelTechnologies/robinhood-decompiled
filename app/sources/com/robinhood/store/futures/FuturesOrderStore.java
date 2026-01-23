package com.robinhood.store.futures;

import com.robinhood.android.idl.common.pagination.IdlPaginatedResponseEndpoint;
import com.robinhood.android.idl.common.pagination.IdlPaginationCursor;
import com.robinhood.android.models.futures.api.account.FuturesAccountType;
import com.robinhood.android.models.futures.api.order.FuturesOrderState;
import com.robinhood.android.models.futures.api.order.FuturesOrderState5;
import com.robinhood.android.models.futures.dao.FuturesOrderDao;
import com.robinhood.android.models.futures.marketdata.dao.UiFuturesOrderEventDao;
import com.robinhood.android.models.futures.p189db.FuturesOrderLeg;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.android.models.futures.p189db.UiFuturesOrderEvent;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.ceres.p284v1.CancelFuturesOrderRequestDto;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CreateFuturesOrderRequestDto;
import com.robinhood.ceres.p284v1.FlattenPositionsRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetOrdersResponseDto;
import com.robinhood.ceres.p284v1.RealizedPnlForOrderDto;
import com.robinhood.ceres.p284v1.ReplaceFuturesOrderRequestDto;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.idl.Response;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesOrderStore;
import com.robinhood.store.futures.arsenal.FuturesContractStore;
import com.robinhood.store.futures.extensions.Flows;
import com.robinhood.store.futures.extensions.HttpExceptions;
import com.robinhood.store.futures.idl.FuturesOrderToIdlExtensions;
import com.robinhood.store.futures.idl.FuturesPaginationExtensions;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.robinhood.websocket.gateway.WebsocketGatewaySource;
import com.robinhood.websocket.gateway.WebsocketGatewayTopic;
import com.robinhood.websocket.gateway.models.WebsocketGatewayData;
import dispatch.core.Launch;
import io.reactivex.Single;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import retrofit2.HttpException;
import rosetta.mainst.OrderTriggerDto;
import rosetta.mainst.OrderTypeDto;
import rosetta.mainst.TimeInForceDto;
import timber.log.Timber;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u0085\u00012\u00020\u0001:\f\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u0085\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b!\u0010\"J(\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b'\u0010(J*\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b-\u0010.J\u0013\u00101\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b1\u00102J5\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c070/2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u00104\u001a\u0002032\b\b\u0002\u00106\u001a\u000205¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001c0/2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u0002050/2\u0006\u0010*\u001a\u00020\u001f¢\u0006\u0004\b<\u0010;J\u0013\u0010=\u001a\b\u0012\u0004\u0012\u0002050/¢\u0006\u0004\b=\u00102J%\u0010A\u001a\b\u0012\u0004\u0012\u00020@0/2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0/2\u0006\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010?\u001a\u00020>¢\u0006\u0004\bC\u0010BJ\u0015\u0010D\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bD\u0010EJ\u001b\u0010G\u001a\u00020\u00162\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001f07¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010OR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010UR$\u0010\\\u001a\u0012\u0012\b\u0012\u00060\u001fj\u0002`Z\u0012\u0004\u0012\u00020[0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R&\u0010a\u001a\u0014\u0012\u0004\u0012\u00020_\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0`0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR,\u0010d\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f07\u0012\n\u0012\b\u0012\u0004\u0012\u00020c070S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010UR \u0010f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020&0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010RR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00160P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010RR\u001c\u0010j\u001a\n i*\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR&\u0010n\u001a\u0014\u0012\u0004\u0012\u00020m\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c070l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010p\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u0002050l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010oR$\u0010r\u001a\u0012\u0012\b\u0012\u00060\u001fj\u0002`q\u0012\u0004\u0012\u0002050l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010oR \u0010t\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020@0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010oR \u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010oR\u001d\u0010w\u001a\b\u0012\u0004\u0012\u00020\u001c0v8\u0006¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001f\u0010|\u001a\u00020{8\u0006¢\u0006\u0014\n\u0004\b|\u0010}\u0012\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0004\b~\u0010\u007fR!\u0010\u0084\u0001\u001a\u00020[*\b\u0012\u0004\u0012\u00020&078BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u008b\u0001"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/ceres/v1/Ceres;", "ceres", "Lcom/robinhood/store/futures/FuturesAccountStore;", "futuresAccountStore", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "futuresContractStore", "Lcom/robinhood/android/models/futures/dao/FuturesOrderDao;", "futuresOrderDao", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "rhdCostBasisStore", "Lcom/robinhood/android/models/futures/marketdata/dao/UiFuturesOrderEventDao;", "uiFuturesOrderEventDao", "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "websocketGatewaySource", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/store/futures/FuturesAccountStore;Lcom/robinhood/store/futures/arsenal/FuturesContractStore;Lcom/robinhood/android/models/futures/dao/FuturesOrderDao;Lcom/robinhood/store/futures/RhdCostBasisStore;Lcom/robinhood/android/models/futures/marketdata/dao/UiFuturesOrderEventDao;Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;Lcom/robinhood/store/StoreBundle;)V", "Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData$FuturesOrderUpdateData;", "orderUpdate", "", "onWebsocketOrderUpdateReceived", "(Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData$FuturesOrderUpdateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;", "orderRequest", "Lio/reactivex/Single;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "submitOrder", "(Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;)Lio/reactivex/Single;", "Ljava/util/UUID;", "orderId", "cancelOrder", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refId", "Ljava/math/BigDecimal;", "targetPrice", "Lcom/robinhood/ceres/v1/FuturesOrderDto;", "updateOrder", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rhdAccountId", "contractId", "flattenPosition", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOrder", "(Ljava/util/UUID;)Lio/reactivex/Single;", "Lkotlinx/coroutines/flow/Flow;", "", "subscribeToWebsocketOrderUpdates", "()Lkotlinx/coroutines/flow/Flow;", "j$/time/Duration", "duration", "", "subscribeToWebsocketUpdates", "", "streamPendingOrdersForContract", "(Ljava/util/UUID;Lj$/time/Duration;Z)Lkotlinx/coroutines/flow/Flow;", "streamOrder", "(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", "streamHasOrdersForContract", "hasMoreThanOneSuccessfulOrder", "j$/time/Instant", "since", "Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;", "streamOrdersOverview", "(Ljava/util/UUID;Lj$/time/Instant;)Lkotlinx/coroutines/flow/Flow;", "streamRecentFilledOrderToShowConfirmation", "onOrderFilledConfirmationShown", "(Ljava/util/UUID;)V", "orderIds", "refreshRealizedPnls", "(Ljava/util/List;)V", "Lcom/robinhood/ceres/v1/Ceres;", "Lcom/robinhood/store/futures/FuturesAccountStore;", "Lcom/robinhood/store/futures/arsenal/FuturesContractStore;", "Lcom/robinhood/android/models/futures/dao/FuturesOrderDao;", "Lcom/robinhood/store/futures/RhdCostBasisStore;", "Lcom/robinhood/android/models/futures/marketdata/dao/UiFuturesOrderEventDao;", "Lcom/robinhood/websocket/gateway/WebsocketGatewaySource;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "postOrder", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/android/moria/network/Endpoint;", "getOrderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/store/futures/FuturesOrderStore$PartialOrdersRequestArgs;", "Lcom/robinhood/ceres/v1/GetOrdersResponseDto;", "getOrdersEndpointNonPaginated", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/store/futures/RequestId;", "", "requestIdsToMaxUpdatedAts", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Lcom/robinhood/store/futures/FuturesOrderStore$AllOrderRequestArgs;", "Lcom/robinhood/idl/Response;", "getOrdersEndpointPaginated", "Lcom/robinhood/android/idl/common/pagination/IdlPaginatedResponseEndpoint;", "Lcom/robinhood/ceres/v1/RealizedPnlForOrderDto;", "getOrderRealizedPnlEndpoint", "Lcom/robinhood/ceres/v1/ReplaceFuturesOrderRequestDto;", "replaceOrderEndpoint", "Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;", "flattenPositionEndpoint", "kotlin.jvm.PlatformType", "pendingOrdersRequestId", "Ljava/util/UUID;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersRequest;", "getPendingOrdersForContract", "Lcom/robinhood/android/moria/db/Query;", "getHasOrdersForContract", "Lcom/robinhood/store/futures/FuturesAccountId;", "getHasMoreThanOneSuccessfulOrder", "Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewParam;", "getOrdersOverview", "getOrder", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader$annotations", "()V", "getMaxUpdatedAt", "(Ljava/util/List;)J", "maxUpdatedAt", "Companion", "GetOrdersRequest", "GetOrdersOverviewParam", "GetOrdersOverviewResult", "AllOrderRequestArgs", "PartialOrdersRequestArgs", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FuturesOrderStore extends Store {
    private static final Duration DefaultGetOrdersPollingDuration;
    private final Ceres ceres;
    private final PostEndpoint<FlattenPositionsRequestDto, Unit> flattenPositionEndpoint;
    private final FuturesAccountStore futuresAccountStore;
    private final FuturesContractStore futuresContractStore;
    private final FuturesOrderDao futuresOrderDao;
    private final Query<UUID, Boolean> getHasMoreThanOneSuccessfulOrder;
    private final Query<GetOrdersRequest, Boolean> getHasOrdersForContract;
    private final Query<UUID, UiFuturesOrder> getOrder;
    private final Endpoint<UUID, UiFuturesOrder> getOrderEndpoint;
    private final Endpoint<List<UUID>, List<RealizedPnlForOrderDto>> getOrderRealizedPnlEndpoint;
    private final Endpoint<PartialOrdersRequestArgs, GetOrdersResponseDto> getOrdersEndpointNonPaginated;
    private final IdlPaginatedResponseEndpoint<AllOrderRequestArgs, Response<GetOrdersResponseDto>> getOrdersEndpointPaginated;
    private final Query<GetOrdersOverviewParam, GetOrdersOverviewResult> getOrdersOverview;
    private final Query<GetOrdersRequest, List<UiFuturesOrder>> getPendingOrdersForContract;
    private final HistoryLoader.Callbacks<UiFuturesOrder> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final UUID pendingOrdersRequestId;
    private final PostEndpoint<CreateFuturesOrderRequestDto, UiFuturesOrder> postOrder;
    private final PostEndpoint<ReplaceFuturesOrderRequestDto, FuturesOrderDto> replaceOrderEndpoint;
    private final ConcurrentHashMap<UUID, Long> requestIdsToMaxUpdatedAts;
    private final RhdCostBasisStore rhdCostBasisStore;
    private final UiFuturesOrderEventDao uiFuturesOrderEventDao;
    private final WebsocketGatewaySource websocketGatewaySource;

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore", m3645f = "FuturesOrderStore.kt", m3646l = {395, 397, 408, 412, 421, 424}, m3647m = "cancelOrder")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$cancelOrder$1 */
    static final class C414511 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C414511(Continuation<? super C414511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOrderStore.this.cancelOrder(null, this);
        }
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore", m3645f = "FuturesOrderStore.kt", m3646l = {462, 472}, m3647m = "flattenPosition")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$flattenPosition$1 */
    static final class C414531 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414531(Continuation<? super C414531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOrderStore.this.flattenPosition(null, null, null, this);
        }
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore", m3645f = "FuturesOrderStore.kt", m3646l = {480}, m3647m = "onWebsocketOrderUpdateReceived")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$onWebsocketOrderUpdateReceived$1 */
    static final class C414561 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C414561(Continuation<? super C414561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOrderStore.this.onWebsocketOrderUpdateReceived(null, this);
        }
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore", m3645f = "FuturesOrderStore.kt", m3646l = {432, 437, 454}, m3647m = "updateOrder")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$updateOrder$1 */
    static final class C414641 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C414641(Continuation<? super C414641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FuturesOrderStore.this.updateOrder(null, null, null, this);
        }
    }

    public static /* synthetic */ void getHistoryTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesOrderStore(Ceres ceres, FuturesAccountStore futuresAccountStore, FuturesContractStore futuresContractStore, FuturesOrderDao futuresOrderDao, RhdCostBasisStore rhdCostBasisStore, UiFuturesOrderEventDao uiFuturesOrderEventDao, WebsocketGatewaySource websocketGatewaySource, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(futuresAccountStore, "futuresAccountStore");
        Intrinsics.checkNotNullParameter(futuresContractStore, "futuresContractStore");
        Intrinsics.checkNotNullParameter(futuresOrderDao, "futuresOrderDao");
        Intrinsics.checkNotNullParameter(rhdCostBasisStore, "rhdCostBasisStore");
        Intrinsics.checkNotNullParameter(uiFuturesOrderEventDao, "uiFuturesOrderEventDao");
        Intrinsics.checkNotNullParameter(websocketGatewaySource, "websocketGatewaySource");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.futuresAccountStore = futuresAccountStore;
        this.futuresContractStore = futuresContractStore;
        this.futuresOrderDao = futuresOrderDao;
        this.rhdCostBasisStore = rhdCostBasisStore;
        this.uiFuturesOrderEventDao = uiFuturesOrderEventDao;
        this.websocketGatewaySource = websocketGatewaySource;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.postOrder = companion.create(new FuturesOrderStore$postOrder$1(this, null), new FuturesOrderStore$postOrder$2(futuresOrderDao));
        Endpoint.Companion companion2 = Endpoint.INSTANCE;
        Endpoint<UUID, UiFuturesOrder> endpointCreate$default = Endpoint.Companion.create$default(companion2, new FuturesOrderStore$getOrderEndpoint$1(this, null), storeBundle.getLogoutKillswitch(), new FuturesOrderStore$getOrderEndpoint$2(futuresOrderDao), storeBundle.getClock(), null, 16, null);
        this.getOrderEndpoint = endpointCreate$default;
        this.getOrdersEndpointNonPaginated = Endpoint.Companion.create$default(companion2, new FuturesOrderStore$getOrdersEndpointNonPaginated$1(this, null), storeBundle.getLogoutKillswitch(), new FuturesOrderStore$getOrdersEndpointNonPaginated$2(this, null), storeBundle.getClock(), null, 16, null);
        this.requestIdsToMaxUpdatedAts = new ConcurrentHashMap<>();
        this.getOrdersEndpointPaginated = IdlPaginatedResponseEndpoint.Companion.createWithParams$default(IdlPaginatedResponseEndpoint.INSTANCE, new FuturesOrderStore$getOrdersEndpointPaginated$1(this, null), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getOrdersEndpointPaginated$lambda$0((Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getOrdersEndpointPaginated$lambda$1((Response) obj);
            }
        }, storeBundle.getLogoutKillswitch(), new FuturesOrderStore$getOrdersEndpointPaginated$4(this, null), storeBundle.getClock(), null, 64, null);
        this.getOrderRealizedPnlEndpoint = Endpoint.Companion.create$default(companion2, new FuturesOrderStore$getOrderRealizedPnlEndpoint$1(this, null), getLogoutKillswitch(), new FuturesOrderStore$getOrderRealizedPnlEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        this.replaceOrderEndpoint = companion.create(new FuturesOrderStore$replaceOrderEndpoint$1(this, null), new FuturesOrderStore$replaceOrderEndpoint$2(futuresOrderDao));
        this.flattenPositionEndpoint = companion.create(new FuturesOrderStore$flattenPositionEndpoint$1(this, null), new FuturesOrderStore$flattenPositionEndpoint$2(null));
        this.pendingOrdersRequestId = FuturesOrderStoreKt.newRequestId();
        Query.Companion companion3 = Query.INSTANCE;
        this.getPendingOrdersForContract = Store.create$default(this, companion3, "getFuturesPendingOrdersForContract", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getPendingOrdersForContract$lambda$3(this.f$0, (FuturesOrderStore.GetOrdersRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getPendingOrdersForContract$lambda$4(this.f$0, (FuturesOrderStore.GetOrdersRequest) obj);
            }
        }, false, 8, null);
        this.getHasOrdersForContract = Store.create$default(this, companion3, "getHasOrdersForContract", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getHasOrdersForContract$lambda$5(this.f$0, (FuturesOrderStore.GetOrdersRequest) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getHasOrdersForContract$lambda$6(this.f$0, (FuturesOrderStore.GetOrdersRequest) obj);
            }
        }, false, 8, null);
        this.getHasMoreThanOneSuccessfulOrder = Store.create$default(this, companion3, "getOrderCountByState", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getHasMoreThanOneSuccessfulOrder$lambda$7(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getHasMoreThanOneSuccessfulOrder$lambda$9(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.getOrdersOverview = Store.create$default(this, companion3, "getOrdersOverview", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getOrdersOverview$lambda$10(this.f$0, (FuturesOrderStore.GetOrdersOverviewParam) obj);
            }
        })), new Function1() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesOrderStore.getOrdersOverview$lambda$13(this.f$0, (FuturesOrderStore.GetOrdersOverviewParam) obj);
            }
        }, false, 8, null);
        this.getOrder = Store.create$default(this, companion3, "getOrder", CollectionsKt.listOf(new PollEach(getStoreScope(), new FuturesOrderStore$getOrder$1(endpointCreate$default))), new FuturesOrderStore$getOrder$2(futuresOrderDao), false, 8, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiFuturesOrder>() { // from class: com.robinhood.store.futures.FuturesOrderStore$historyLoaderCallbacks$1
            private final UUID historyLoaderRequestId;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.FUTURES_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
                this.historyLoaderRequestId = FuturesOrderStoreKt.newRequestId();
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
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(0);
                }
                refreshOrders(filter);
                return FlowKt.filterNotNull(this.this$0.futuresOrderDao.countTotal(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), futuresSubAccountId));
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
                return FlowKt.filterNotNull(this.this$0.futuresOrderDao.countLater(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiFuturesOrder>> getLatest(HistoryLoader.Filter filter, int limit) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                refreshOrders(filter);
                return FlowKt.onEach(this.this$0.futuresOrderDao.getLatest(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), futuresSubAccountId, limit), new FuturesOrderStore$historyLoaderCallbacks$1$getLatest$1(this.this$0, null));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiFuturesOrder>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return FlowKt.onEach(this.this$0.futuresOrderDao.getLater(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id, limit), new FuturesOrderStore$historyLoaderCallbacks$1$getLater$1(this.this$0, null));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiFuturesOrder>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return FlowKt.onEach(this.this$0.futuresOrderDao.get(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id), new FuturesOrderStore$historyLoaderCallbacks$1$get$1(this.this$0, null));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiFuturesOrder>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                UUID futuresSubAccountId;
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                if (staticFilter == null || (futuresSubAccountId = staticFilter.getFuturesSubAccountId()) == null) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return FlowKt.onEach(this.this$0.futuresOrderDao.getEarlier(FuturesOrderState5.getFuturesOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, futuresSubAccountId, id, limit), new FuturesOrderStore$historyLoaderCallbacks$1$getEarlier$1(this.this$0, null));
            }

            private final void refreshOrders(HistoryLoader.Filter filter) {
                UUID futuresSubAccountId;
                HistoryStaticFilter staticFilter;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                if (staticFilter2 == null || (futuresSubAccountId = staticFilter2.getFuturesSubAccountId()) == null) {
                    return;
                }
                HistoryStaticFilter staticFilter3 = filter.getStaticFilter();
                HistoryStaticFilter.InstrumentFilter instrumentFilter = staticFilter3 != null ? staticFilter3.getInstrumentFilter() : null;
                if (instrumentFilter == null) {
                    instrumentFilter = null;
                }
                if ((instrumentFilter != null ? instrumentFilter.getType() : null) != HistoryStaticFilter.InstrumentFilterType.FUTURES || filter.getState() == null || (staticFilter = filter.getStaticFilter()) == null || !staticFilter.getPreviewOnly()) {
                    FuturesOrderStore futuresOrderStore = this.this$0;
                    IdlPaginatedResponseEndpoint idlPaginatedResponseEndpoint = futuresOrderStore.getOrdersEndpointPaginated;
                    UUID historyLoaderRequestId = this.historyLoaderRequestId;
                    Intrinsics.checkNotNullExpressionValue(historyLoaderRequestId, "historyLoaderRequestId");
                    ScopedSubscriptionKt.subscribeIn(ObservablesKt.ignoreNetworkExceptions(futuresOrderStore.asObservable(idlPaginatedResponseEndpoint.fetchAllPages(new FuturesOrderStore.AllOrderRequestArgs(historyLoaderRequestId, futuresSubAccountId)))), this.this$0.getStoreScope());
                }
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.futures.FuturesOrderStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.FUTURES_ORDER);
                return FlowKt.transformLatest(this.this$0.streamOrder(reference.getSourceId()), new C41449x55b1b2ff(null, this.this$0));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getOrdersEndpointPaginated$lambda$0(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetOrdersResponseDto) response.getData()).getPrevious());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlPaginationCursor getOrdersEndpointPaginated$lambda$1(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return FuturesPaginationExtensions.toIdlPaginationCursor(((GetOrdersResponseDto) response.getData()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getMaxUpdatedAt(List<FuturesOrderDto> list) {
        Instant instant;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Instant instantSafeToInstant = StringsKt.safeToInstant(((FuturesOrderDto) it.next()).getUpdated_at());
            while (it.hasNext()) {
                Instant instantSafeToInstant2 = StringsKt.safeToInstant(((FuturesOrderDto) it.next()).getUpdated_at());
                if (instantSafeToInstant.compareTo(instantSafeToInstant2) < 0) {
                    instantSafeToInstant = instantSafeToInstant2;
                }
            }
            instant = instantSafeToInstant;
        } else {
            instant = null;
        }
        if (instant != null) {
            return instant.toEpochMilli();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getPendingOrdersForContract$lambda$3(FuturesOrderStore futuresOrderStore, GetOrdersRequest param) {
        Intrinsics.checkNotNullParameter(param, "param");
        IdlPaginatedResponseEndpoint<AllOrderRequestArgs, Response<GetOrdersResponseDto>> idlPaginatedResponseEndpoint = futuresOrderStore.getOrdersEndpointPaginated;
        UUID pendingOrdersRequestId = futuresOrderStore.pendingOrdersRequestId;
        Intrinsics.checkNotNullExpressionValue(pendingOrdersRequestId, "pendingOrdersRequestId");
        return idlPaginatedResponseEndpoint.pollAllPages(new AllOrderRequestArgs(pendingOrdersRequestId, param.getFuturesAccountId()), param.getDuration());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getPendingOrdersForContract$lambda$4(FuturesOrderStore futuresOrderStore, GetOrdersRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return futuresOrderStore.futuresOrderDao.getOpenFuturesOrders(params.getContractId(), FuturesOrderState.INSTANCE.getPendingOrderStates());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersRequest;", "", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/FuturesAccountId;", "futuresAccountId", "contractId", "j$/time/Duration", "duration", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lj$/time/Duration;)V", "component1", "()Ljava/util/UUID;", "component2", "component3", "()Lj$/time/Duration;", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lj$/time/Duration;)Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getFuturesAccountId", "getContractId", "Lj$/time/Duration;", "getDuration", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetOrdersRequest {
        private final UUID contractId;
        private final Duration duration;
        private final UUID futuresAccountId;

        public static /* synthetic */ GetOrdersRequest copy$default(GetOrdersRequest getOrdersRequest, UUID uuid, UUID uuid2, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getOrdersRequest.futuresAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = getOrdersRequest.contractId;
            }
            if ((i & 4) != 0) {
                duration = getOrdersRequest.duration;
            }
            return getOrdersRequest.copy(uuid, uuid2, duration);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component3, reason: from getter */
        public final Duration getDuration() {
            return this.duration;
        }

        public final GetOrdersRequest copy(UUID futuresAccountId, UUID contractId, Duration duration) {
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(duration, "duration");
            return new GetOrdersRequest(futuresAccountId, contractId, duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetOrdersRequest)) {
                return false;
            }
            GetOrdersRequest getOrdersRequest = (GetOrdersRequest) other;
            return Intrinsics.areEqual(this.futuresAccountId, getOrdersRequest.futuresAccountId) && Intrinsics.areEqual(this.contractId, getOrdersRequest.contractId) && Intrinsics.areEqual(this.duration, getOrdersRequest.duration);
        }

        public int hashCode() {
            return (((this.futuresAccountId.hashCode() * 31) + this.contractId.hashCode()) * 31) + this.duration.hashCode();
        }

        public String toString() {
            return "GetOrdersRequest(futuresAccountId=" + this.futuresAccountId + ", contractId=" + this.contractId + ", duration=" + this.duration + ")";
        }

        public GetOrdersRequest(UUID futuresAccountId, UUID contractId, Duration duration) {
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.futuresAccountId = futuresAccountId;
            this.contractId = contractId;
            this.duration = duration;
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public /* synthetic */ GetOrdersRequest(UUID uuid, UUID uuid2, Duration duration, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, uuid2, (i & 4) != 0 ? FuturesOrderStore.DefaultGetOrdersPollingDuration : duration);
        }

        public final Duration getDuration() {
            return this.duration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getHasOrdersForContract$lambda$5(FuturesOrderStore futuresOrderStore, GetOrdersRequest param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return Endpoint.DefaultImpls.refresh$default(futuresOrderStore.getOrdersEndpointNonPaginated, new PartialOrdersRequestArgs(param.getFuturesAccountId(), param.getContractId(), null, 4, null), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getHasOrdersForContract$lambda$6(FuturesOrderStore futuresOrderStore, GetOrdersRequest params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return futuresOrderStore.futuresOrderDao.getHasFutureOrders(params.getContractId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job getHasMoreThanOneSuccessfulOrder$lambda$7(FuturesOrderStore futuresOrderStore, UUID futuresAccountId) {
        Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
        return Endpoint.DefaultImpls.refresh$default(futuresOrderStore.getOrdersEndpointNonPaginated, new PartialOrdersRequestArgs(futuresAccountId, null, SetsKt.setOf((Object[]) new FuturesOrderState[]{FuturesOrderState.FILLED, FuturesOrderState.PARTIALLY_FILLED}), 2, null), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getHasMoreThanOneSuccessfulOrder$lambda$9(FuturesOrderStore futuresOrderStore, UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<unused var>");
        final Flow flowCountTotalByOrderState$default = FuturesOrderDao.DefaultImpls.countTotalByOrderState$default(futuresOrderStore.futuresOrderDao, SetsKt.setOf((Object[]) new FuturesOrderState[]{FuturesOrderState.FILLED, FuturesOrderState.PARTIALLY_FILLED}), null, 2, null);
        return new Flow<Boolean>() { // from class: com.robinhood.store.futures.FuturesOrderStore$getHasMoreThanOneSuccessfulOrder$lambda$9$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = flowCountTotalByOrderState$default.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesOrderStore$getHasMoreThanOneSuccessfulOrder$lambda$9$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getHasMoreThanOneSuccessfulOrder$lambda$9$$inlined$map$1$2", m3645f = "FuturesOrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesOrderStore$getHasMoreThanOneSuccessfulOrder$lambda$9$$inlined$map$1$2$1, reason: invalid class name */
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
                        Integer num = (Integer) obj;
                        Boolean boolBoxBoolean = boxing.boxBoolean(num != null && num.intValue() > 1);
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
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewParam;", "", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/FuturesAccountId;", "futuresAccountId", "contractId", "j$/time/Instant", "since", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lj$/time/Instant;)V", "component1", "()Ljava/util/UUID;", "component2", "component3", "()Lj$/time/Instant;", "copy", "(Ljava/util/UUID;Ljava/util/UUID;Lj$/time/Instant;)Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewParam;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getFuturesAccountId", "getContractId", "Lj$/time/Instant;", "getSince", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GetOrdersOverviewParam {
        private final UUID contractId;
        private final UUID futuresAccountId;
        private final Instant since;

        public static /* synthetic */ GetOrdersOverviewParam copy$default(GetOrdersOverviewParam getOrdersOverviewParam, UUID uuid, UUID uuid2, Instant instant, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = getOrdersOverviewParam.futuresAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = getOrdersOverviewParam.contractId;
            }
            if ((i & 4) != 0) {
                instant = getOrdersOverviewParam.since;
            }
            return getOrdersOverviewParam.copy(uuid, uuid2, instant);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component3, reason: from getter */
        public final Instant getSince() {
            return this.since;
        }

        public final GetOrdersOverviewParam copy(UUID futuresAccountId, UUID contractId, Instant since) {
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(since, "since");
            return new GetOrdersOverviewParam(futuresAccountId, contractId, since);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetOrdersOverviewParam)) {
                return false;
            }
            GetOrdersOverviewParam getOrdersOverviewParam = (GetOrdersOverviewParam) other;
            return Intrinsics.areEqual(this.futuresAccountId, getOrdersOverviewParam.futuresAccountId) && Intrinsics.areEqual(this.contractId, getOrdersOverviewParam.contractId) && Intrinsics.areEqual(this.since, getOrdersOverviewParam.since);
        }

        public int hashCode() {
            return (((this.futuresAccountId.hashCode() * 31) + this.contractId.hashCode()) * 31) + this.since.hashCode();
        }

        public String toString() {
            return "GetOrdersOverviewParam(futuresAccountId=" + this.futuresAccountId + ", contractId=" + this.contractId + ", since=" + this.since + ")";
        }

        public GetOrdersOverviewParam(UUID futuresAccountId, UUID contractId, Instant since) {
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(since, "since");
            this.futuresAccountId = futuresAccountId;
            this.contractId = contractId;
            this.since = since;
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final Instant getSince() {
            return this.since;
        }
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;", "", "pendingOrderCount", "", "userHasTradedToday", "", "<init>", "(IZ)V", "getPendingOrderCount", "()I", "getUserHasTradedToday", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GetOrdersOverviewResult {
        private final int pendingOrderCount;
        private final boolean userHasTradedToday;

        public static /* synthetic */ GetOrdersOverviewResult copy$default(GetOrdersOverviewResult getOrdersOverviewResult, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = getOrdersOverviewResult.pendingOrderCount;
            }
            if ((i2 & 2) != 0) {
                z = getOrdersOverviewResult.userHasTradedToday;
            }
            return getOrdersOverviewResult.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPendingOrderCount() {
            return this.pendingOrderCount;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUserHasTradedToday() {
            return this.userHasTradedToday;
        }

        public final GetOrdersOverviewResult copy(int pendingOrderCount, boolean userHasTradedToday) {
            return new GetOrdersOverviewResult(pendingOrderCount, userHasTradedToday);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetOrdersOverviewResult)) {
                return false;
            }
            GetOrdersOverviewResult getOrdersOverviewResult = (GetOrdersOverviewResult) other;
            return this.pendingOrderCount == getOrdersOverviewResult.pendingOrderCount && this.userHasTradedToday == getOrdersOverviewResult.userHasTradedToday;
        }

        public int hashCode() {
            return (Integer.hashCode(this.pendingOrderCount) * 31) + Boolean.hashCode(this.userHasTradedToday);
        }

        public String toString() {
            return "GetOrdersOverviewResult(pendingOrderCount=" + this.pendingOrderCount + ", userHasTradedToday=" + this.userHasTradedToday + ")";
        }

        public GetOrdersOverviewResult(int i, boolean z) {
            this.pendingOrderCount = i;
            this.userHasTradedToday = z;
        }

        public final int getPendingOrderCount() {
            return this.pendingOrderCount;
        }

        public final boolean getUserHasTradedToday() {
            return this.userHasTradedToday;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getOrdersOverview$lambda$10(FuturesOrderStore futuresOrderStore, GetOrdersOverviewParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return Endpoint.DefaultImpls.poll$default(futuresOrderStore.getOrdersEndpointNonPaginated, new PartialOrdersRequestArgs(param.getFuturesAccountId(), param.getContractId(), null, 4, null), DefaultGetOrdersPollingDuration, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getOrdersOverview$lambda$13(FuturesOrderStore futuresOrderStore, GetOrdersOverviewParam params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Flow flowFilterNotNull = FlowKt.filterNotNull(futuresOrderStore.futuresOrderDao.countTotalByOrderState(FuturesOrderState.INSTANCE.getPendingOrderStates(), params.getContractId()));
        final Flow<Boolean> userHasTradedSince = futuresOrderStore.futuresOrderDao.getUserHasTradedSince(params.getSince(), params.getContractId());
        return FlowKt.combine(flowFilterNotNull, new Flow<Boolean>() { // from class: com.robinhood.store.futures.FuturesOrderStore$getOrdersOverview$lambda$13$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                Object objCollect = userHasTradedSince.collect(new C414482(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.store.futures.FuturesOrderStore$getOrdersOverview$lambda$13$$inlined$map$1$2 */
            public static final class C414482<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrdersOverview$lambda$13$$inlined$map$1$2", m3645f = "FuturesOrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.store.futures.FuturesOrderStore$getOrdersOverview$lambda$13$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C414482.this.emit(null, this);
                    }
                }

                public C414482(FlowCollector flowCollector) {
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
                        Boolean boolBoxBoolean = boxing.boxBoolean(Intrinsics.areEqual((Boolean) obj, boxing.boxBoolean(true)));
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
        }, FuturesOrderStore$getOrdersOverview$2$3.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getOrdersOverview$lambda$13$lambda$12(int i, boolean z, Continuation continuation) {
        return new GetOrdersOverviewResult(i, z);
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$submitOrder$1", m3645f = "FuturesOrderStore.kt", m3646l = {387}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$submitOrder$1 */
    static final class C414621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiFuturesOrder>, Object> {
        final /* synthetic */ CreateFuturesOrderRequestDto $orderRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414621(CreateFuturesOrderRequestDto createFuturesOrderRequestDto, Continuation<? super C414621> continuation) {
            super(2, continuation);
            this.$orderRequest = createFuturesOrderRequestDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderStore.this.new C414621(this.$orderRequest, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiFuturesOrder> continuation) {
            return ((C414621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = FuturesOrderStore.this.postOrder;
            CreateFuturesOrderRequestDto createFuturesOrderRequestDto = this.$orderRequest;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, createFuturesOrderRequestDto, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<UiFuturesOrder> submitOrder(CreateFuturesOrderRequestDto orderRequest) {
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C414621(orderRequest, null), 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r14) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r14) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: HttpException -> 0x0063, PHI: r0 r13
      0x009e: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v3 java.lang.Object) binds: [B:34:0x009a, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x009e: PHI (r13v6 java.util.UUID) = (r13v3 java.util.UUID), (r13v8 java.util.UUID) binds: [B:34:0x009a, B:24:0x005f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {HttpException -> 0x0063, blocks: (B:24:0x005f, B:36:0x009e, B:33:0x0083), top: B:66:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f7 -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelOrder(UUID uuid, Continuation<? super UiFuturesOrder> continuation) {
        C414511 c414511;
        UUID uuid2;
        C414511 c4145112;
        int i;
        int i2;
        UUID uuid3;
        Exception e;
        UiFuturesOrder uiFuturesOrder;
        if (continuation instanceof C414511) {
            c414511 = (C414511) continuation;
            int i3 = c414511.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c414511.label = i3 - Integer.MIN_VALUE;
            } else {
                c414511 = new C414511(continuation);
            }
        }
        C414511 c4145113 = c414511;
        Object futuresAccountIdString$default = c4145113.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (c4145113.label) {
                case 0:
                    ResultKt.throwOnFailure(futuresAccountIdString$default);
                    FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
                    c4145113.L$0 = uuid;
                    c4145113.label = 1;
                    futuresAccountIdString$default = FuturesAccountStore.getFuturesAccountIdString$default(futuresAccountStore, null, c4145113, 1, null);
                    if (futuresAccountIdString$default != coroutine_suspended) {
                        String str = (String) futuresAccountIdString$default;
                        Ceres ceres = this.ceres;
                        CancelFuturesOrderRequestDto cancelFuturesOrderRequestDto = new CancelFuturesOrderRequestDto(Uuids.safeToString(uuid), str, null, 4, null);
                        c4145113.L$0 = uuid;
                        c4145113.label = 2;
                        futuresAccountIdString$default = ceres.CancelFuturesOrder(cancelFuturesOrderRequestDto, c4145113);
                        if (futuresAccountIdString$default == coroutine_suspended) {
                            c4145113.L$0 = uuid;
                            c4145113.label = 3;
                            break;
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    uuid = (UUID) c4145113.L$0;
                    ResultKt.throwOnFailure(futuresAccountIdString$default);
                    String str2 = (String) futuresAccountIdString$default;
                    Ceres ceres2 = this.ceres;
                    CancelFuturesOrderRequestDto cancelFuturesOrderRequestDto2 = new CancelFuturesOrderRequestDto(Uuids.safeToString(uuid), str2, null, 4, null);
                    c4145113.L$0 = uuid;
                    c4145113.label = 2;
                    futuresAccountIdString$default = ceres2.CancelFuturesOrder(cancelFuturesOrderRequestDto2, c4145113);
                    if (futuresAccountIdString$default == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    uuid = (UUID) c4145113.L$0;
                    ResultKt.throwOnFailure(futuresAccountIdString$default);
                    c4145113.L$0 = uuid;
                    c4145113.label = 3;
                    break;
                case 3:
                    uuid = (UUID) c4145113.L$0;
                    ResultKt.throwOnFailure(futuresAccountIdString$default);
                    uuid2 = uuid;
                    c4145112 = c4145113;
                    i = 0;
                    i2 = 4;
                    if (i >= i2) {
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            uuid3 = uuid2;
                            c4145113 = c4145112;
                            Timber.INSTANCE.mo3354e(e);
                            c4145113.L$0 = uuid3;
                            c4145113.I$0 = i2;
                            c4145113.I$1 = i;
                            c4145113.label = 5;
                            break;
                        }
                        Endpoint<UUID, UiFuturesOrder> endpoint = this.getOrderEndpoint;
                        c4145112.L$0 = uuid2;
                        c4145112.I$0 = i2;
                        c4145112.I$1 = i;
                        c4145112.label = 4;
                        futuresAccountIdString$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid2, null, c4145112, 2, null);
                        if (futuresAccountIdString$default != coroutine_suspended) {
                            uuid3 = uuid2;
                            c4145113 = c4145112;
                            uiFuturesOrder = (UiFuturesOrder) futuresAccountIdString$default;
                            if (uiFuturesOrder.getOrder().getOrderState().toCommonState().isFinal()) {
                                return uiFuturesOrder;
                            }
                            c4145113.L$0 = uuid3;
                            c4145113.I$0 = i2;
                            c4145113.I$1 = i;
                            c4145113.label = 5;
                        }
                    } else {
                        Endpoint<UUID, UiFuturesOrder> endpoint2 = this.getOrderEndpoint;
                        c4145112.L$0 = null;
                        c4145112.label = 6;
                        Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint2, uuid2, null, c4145112, 2, null);
                        if (objForceFetch$default != coroutine_suspended) {
                            return objForceFetch$default;
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    i = c4145113.I$1;
                    i2 = c4145113.I$0;
                    uuid3 = (UUID) c4145113.L$0;
                    try {
                        ResultKt.throwOnFailure(futuresAccountIdString$default);
                    } catch (Exception e3) {
                        e = e3;
                        Timber.INSTANCE.mo3354e(e);
                        c4145113.L$0 = uuid3;
                        c4145113.I$0 = i2;
                        c4145113.I$1 = i;
                        c4145113.label = 5;
                        break;
                    }
                    uiFuturesOrder = (UiFuturesOrder) futuresAccountIdString$default;
                    if (uiFuturesOrder.getOrder().getOrderState().toCommonState().isFinal()) {
                    }
                    c4145113.L$0 = uuid3;
                    c4145113.I$0 = i2;
                    c4145113.I$1 = i;
                    c4145113.label = 5;
                    break;
                case 5:
                    i = c4145113.I$1;
                    i2 = c4145113.I$0;
                    uuid3 = (UUID) c4145113.L$0;
                    ResultKt.throwOnFailure(futuresAccountIdString$default);
                    c4145112 = c4145113;
                    uuid2 = uuid3;
                    i++;
                    if (i >= i2) {
                    }
                    return coroutine_suspended;
                case 6:
                    ResultKt.throwOnFailure(futuresAccountIdString$default);
                    return futuresAccountIdString$default;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (HttpException e4) {
            throw HttpExceptions.convertToStandardErrorIfPossible(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136 A[LOOP:0: B:43:0x0130->B:45:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateOrder(UUID uuid, UUID uuid2, BigDecimal bigDecimal, Continuation<? super FuturesOrderDto> continuation) {
        C414641 c414641;
        UUID uuid3;
        BigDecimal bigDecimal2;
        UUID uuid4;
        UiFuturesOrder uiFuturesOrder;
        UUID uuid5;
        IdlDecimal idlDecimal;
        Iterator<T> it;
        UUID uuid6 = uuid2;
        if (continuation instanceof C414641) {
            c414641 = (C414641) continuation;
            int i = c414641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414641.label = i - Integer.MIN_VALUE;
            } else {
                c414641 = new C414641(continuation);
            }
        }
        C414641 c4146412 = c414641;
        Object objFirst = c4146412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4146412.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<UiFuturesOrder> flowStreamOrder = streamOrder(uuid6);
            uuid3 = uuid;
            c4146412.L$0 = uuid3;
            c4146412.L$1 = uuid6;
            bigDecimal2 = bigDecimal;
            c4146412.L$2 = bigDecimal2;
            c4146412.label = 1;
            objFirst = FlowKt.first(flowStreamOrder, c4146412);
            if (objFirst != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFirst);
                return objFirst;
            }
            idlDecimal = (IdlDecimal) c4146412.L$3;
            uiFuturesOrder = (UiFuturesOrder) c4146412.L$2;
            uuid5 = (UUID) c4146412.L$1;
            uuid4 = (UUID) c4146412.L$0;
            ResultKt.throwOnFailure(objFirst);
            String str = (String) objFirst;
            String strSafeToString = Uuids.safeToString(uuid5);
            String strSafeToString2 = Uuids.safeToString(uuid4);
            OrderTypeDto idlModel = FuturesOrderToIdlExtensions.toIdlModel(uiFuturesOrder.getOrder().getOrderType());
            IdlDecimal idlDecimal2 = IdlDecimal2.toIdlDecimal(uiFuturesOrder.getOrder().getQuantity());
            OrderTriggerDto idlModel2 = FuturesOrderToIdlExtensions.toIdlModel(uiFuturesOrder.getOrder().getOrderTrigger());
            TimeInForceDto idlModel3 = FuturesOrderToIdlExtensions.toIdlModel(uiFuturesOrder.getOrder().getTimeInForce());
            IdlDecimal idlDecimal3 = uiFuturesOrder.getOrder().getStopPrice() == null ? idlDecimal : null;
            IdlDecimal idlDecimal4 = uiFuturesOrder.getOrder().getLimitPrice() == null ? idlDecimal : null;
            List<FuturesOrderLeg> legs = uiFuturesOrder.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            it = legs.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesOrderToIdlExtensions.toIdlModel((FuturesOrderLeg) it.next()));
            }
            ReplaceFuturesOrderRequestDto replaceFuturesOrderRequestDto = new ReplaceFuturesOrderRequestDto(strSafeToString, str, new CreateFuturesOrderRequestDto(str, arrayList, idlDecimal2, null, idlModel, idlModel2, idlModel3, idlDecimal4, idlDecimal3, strSafeToString2, null, null, null, null, null, null, 64520, null));
            PostEndpoint<ReplaceFuturesOrderRequestDto, FuturesOrderDto> postEndpoint = this.replaceOrderEndpoint;
            c4146412.L$0 = null;
            c4146412.L$1 = null;
            c4146412.L$2 = null;
            c4146412.L$3 = null;
            c4146412.label = 3;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, replaceFuturesOrderRequestDto, null, c4146412, 2, null);
            return objPost$default != coroutine_suspended ? coroutine_suspended : objPost$default;
        }
        BigDecimal bigDecimal3 = (BigDecimal) c4146412.L$2;
        UUID uuid7 = (UUID) c4146412.L$1;
        UUID uuid8 = (UUID) c4146412.L$0;
        ResultKt.throwOnFailure(objFirst);
        bigDecimal2 = bigDecimal3;
        uuid6 = uuid7;
        uuid3 = uuid8;
        UiFuturesOrder uiFuturesOrder2 = (UiFuturesOrder) objFirst;
        if (uiFuturesOrder2.getOrder().getStopPrice() != null && uiFuturesOrder2.getOrder().getLimitPrice() != null) {
            throw new IllegalStateException("Cannot modify a stop limit futures order in this version of the app");
        }
        IdlDecimal idlDecimal5 = IdlDecimal2.toIdlDecimal(bigDecimal2);
        FuturesAccountStore futuresAccountStore = this.futuresAccountStore;
        c4146412.L$0 = uuid3;
        c4146412.L$1 = uuid6;
        c4146412.L$2 = uiFuturesOrder2;
        c4146412.L$3 = idlDecimal5;
        c4146412.label = 2;
        Object futuresAccountIdString$default = FuturesAccountStore.getFuturesAccountIdString$default(futuresAccountStore, null, c4146412, 1, null);
        if (futuresAccountIdString$default != coroutine_suspended) {
            uuid4 = uuid3;
            uiFuturesOrder = uiFuturesOrder2;
            objFirst = futuresAccountIdString$default;
            uuid5 = uuid6;
            idlDecimal = idlDecimal5;
            String str2 = (String) objFirst;
            String strSafeToString3 = Uuids.safeToString(uuid5);
            String strSafeToString22 = Uuids.safeToString(uuid4);
            OrderTypeDto idlModel4 = FuturesOrderToIdlExtensions.toIdlModel(uiFuturesOrder.getOrder().getOrderType());
            IdlDecimal idlDecimal22 = IdlDecimal2.toIdlDecimal(uiFuturesOrder.getOrder().getQuantity());
            OrderTriggerDto idlModel22 = FuturesOrderToIdlExtensions.toIdlModel(uiFuturesOrder.getOrder().getOrderTrigger());
            TimeInForceDto idlModel32 = FuturesOrderToIdlExtensions.toIdlModel(uiFuturesOrder.getOrder().getTimeInForce());
            if (uiFuturesOrder.getOrder().getStopPrice() == null) {
            }
            if (uiFuturesOrder.getOrder().getLimitPrice() == null) {
            }
            List<FuturesOrderLeg> legs2 = uiFuturesOrder.getLegs();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs2, 10));
            it = legs2.iterator();
            while (it.hasNext()) {
            }
            ReplaceFuturesOrderRequestDto replaceFuturesOrderRequestDto2 = new ReplaceFuturesOrderRequestDto(strSafeToString3, str2, new CreateFuturesOrderRequestDto(str2, arrayList2, idlDecimal22, null, idlModel4, idlModel22, idlModel32, idlDecimal4, idlDecimal3, strSafeToString22, null, null, null, null, null, null, 64520, null));
            PostEndpoint<ReplaceFuturesOrderRequestDto, FuturesOrderDto> postEndpoint2 = this.replaceOrderEndpoint;
            c4146412.L$0 = null;
            c4146412.L$1 = null;
            c4146412.L$2 = null;
            c4146412.L$3 = null;
            c4146412.label = 3;
            Object objPost$default2 = PostEndpoint.DefaultImpls.post$default(postEndpoint2, replaceFuturesOrderRequestDto2, null, c4146412, 2, null);
            if (objPost$default2 != coroutine_suspended) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(5000, r4) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object flattenPosition(UUID uuid, UUID uuid2, UUID uuid3, Continuation<? super Unit> continuation) {
        C414531 c414531;
        if (continuation instanceof C414531) {
            c414531 = (C414531) continuation;
            int i = c414531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414531.label = i - Integer.MIN_VALUE;
            } else {
                c414531 = new C414531(continuation);
            }
        }
        C414531 c4145312 = c414531;
        Object obj = c4145312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4145312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PostEndpoint<FlattenPositionsRequestDto, Unit> postEndpoint = this.flattenPositionEndpoint;
            FlattenPositionsRequestDto flattenPositionsRequestDto = new FlattenPositionsRequestDto(Uuids.safeToString(uuid), Uuids.safeToString(uuid2), Uuids.safeToString(uuid3));
            c4145312.label = 1;
            if (PostEndpoint.DefaultImpls.post$default(postEndpoint, flattenPositionsRequestDto, null, c4145312, 2, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        c4145312.label = 2;
    }

    public static /* synthetic */ Object flattenPosition$default(FuturesOrderStore futuresOrderStore, UUID uuid, UUID uuid2, UUID uuid3, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            uuid3 = UUID.randomUUID();
        }
        return futuresOrderStore.flattenPosition(uuid, uuid2, uuid3, continuation);
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$fetchOrder$1", m3645f = "FuturesOrderStore.kt", m3646l = {476}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$fetchOrder$1 */
    static final class C414521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiFuturesOrder>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414521(UUID uuid, Continuation<? super C414521> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderStore.this.new C414521(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiFuturesOrder> continuation) {
            return ((C414521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = FuturesOrderStore.this.getOrderEndpoint;
            UUID uuid = this.$orderId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<UiFuturesOrder> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C414521(orderId, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWebsocketOrderUpdateReceived(WebsocketGatewayData.FuturesOrderUpdateData futuresOrderUpdateData, Continuation<? super Unit> continuation) {
        C414561 c414561;
        if (continuation instanceof C414561) {
            c414561 = (C414561) continuation;
            int i = c414561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c414561.label = i - Integer.MIN_VALUE;
            } else {
                c414561 = new C414561(continuation);
            }
        }
        C414561 c4145612 = c414561;
        Object objForceFetch$default = c4145612.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4145612.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, UiFuturesOrder> endpoint = this.getOrderEndpoint;
            UUID order_uuid = futuresOrderUpdateData.getOrder_uuid();
            c4145612.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, order_uuid, null, c4145612, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        this.rhdCostBasisStore.refreshCostBasis(((UiFuturesOrder) objForceFetch$default).getContractId(), FuturesAccountType.FUTURES, true);
        return Unit.INSTANCE;
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$subscribeToWebsocketOrderUpdates$1 */
    /* synthetic */ class C414631 extends FunctionReferenceImpl implements Function2<WebsocketGatewayData.FuturesOrderUpdateData, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C414631(Object obj) {
            super(2, obj, FuturesOrderStore.class, "onWebsocketOrderUpdateReceived", "onWebsocketOrderUpdateReceived(Lcom/robinhood/websocket/gateway/models/WebsocketGatewayData$FuturesOrderUpdateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WebsocketGatewayData.FuturesOrderUpdateData futuresOrderUpdateData, Continuation<? super Unit> continuation) {
            return ((FuturesOrderStore) this.receiver).onWebsocketOrderUpdateReceived(futuresOrderUpdateData, continuation);
        }
    }

    public final Flow<Object> subscribeToWebsocketOrderUpdates() {
        return FlowKt.onEach(this.websocketGatewaySource.stream(WebsocketGatewayTopic.FuturesOrderUpdates.INSTANCE), new C414631(this));
    }

    public static /* synthetic */ Flow streamPendingOrdersForContract$default(FuturesOrderStore futuresOrderStore, UUID uuid, Duration duration, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = DefaultGetOrdersPollingDuration;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return futuresOrderStore.streamPendingOrdersForContract(uuid, duration, z);
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$streamPendingOrdersForContract$1", m3645f = "FuturesOrderStore.kt", m3646l = {499, 501}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$streamPendingOrdersForContract$1 */
    static final class C414601 extends ContinuationImpl7 implements Function2<FlowCollector<? super List<? extends UiFuturesOrder>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ Duration $duration;
        final /* synthetic */ boolean $subscribeToWebsocketUpdates;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414601(UUID uuid, Duration duration, boolean z, Continuation<? super C414601> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
            this.$duration = duration;
            this.$subscribeToWebsocketUpdates = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414601 c414601 = FuturesOrderStore.this.new C414601(this.$contractId, this.$duration, this.$subscribeToWebsocketUpdates, continuation);
            c414601.L$0 = obj;
            return c414601;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends UiFuturesOrder>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<UiFuturesOrder>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<UiFuturesOrder>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414601) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r9, r8) == r0) goto L20;
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
                FuturesAccountStore futuresAccountStore = FuturesOrderStore.this.futuresAccountStore;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FuturesAccountStore.getFuturesAccountIdOrNull$default(futuresAccountStore, null, this, 1, null);
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
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FuturesOrderStore.this.getPendingOrdersForContract.asFlow(new GetOrdersRequest(uuid, this.$contractId, this.$duration)));
                boolean z = this.$subscribeToWebsocketUpdates;
                FuturesOrderStore futuresOrderStore = FuturesOrderStore.this;
                if (z) {
                    flowDistinctUntilChanged = Flows.alsoSubscribeTo(flowDistinctUntilChanged, new FuturesOrderStore$streamPendingOrdersForContract$1$1$1(futuresOrderStore, null));
                }
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<List<UiFuturesOrder>> streamPendingOrdersForContract(UUID contractId, Duration duration, boolean subscribeToWebsocketUpdates) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(duration, "duration");
        return FlowKt.flow(new C414601(contractId, duration, subscribeToWebsocketUpdates, null));
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$streamOrder$1", m3645f = "FuturesOrderStore.kt", m3646l = {524}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$streamOrder$1 */
    static final class C414581 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiFuturesOrder>, UiFuturesOrder, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C414581(Continuation<? super C414581> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super UiFuturesOrder> flowCollector, UiFuturesOrder uiFuturesOrder, Continuation<? super Boolean> continuation) {
            C414581 c414581 = new C414581(continuation);
            c414581.L$0 = flowCollector;
            c414581.L$1 = uiFuturesOrder;
            return c414581.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UiFuturesOrder uiFuturesOrder;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                UiFuturesOrder uiFuturesOrder2 = (UiFuturesOrder) this.L$1;
                this.L$0 = uiFuturesOrder2;
                this.label = 1;
                if (flowCollector.emit(uiFuturesOrder2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiFuturesOrder = uiFuturesOrder2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiFuturesOrder = (UiFuturesOrder) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!uiFuturesOrder.getOrder().getOrderState().toCommonState().isFinal());
        }
    }

    public final Flow<UiFuturesOrder> streamOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.transformWhile(this.getOrder.asFlow(orderId), new C414581(null));
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$streamHasOrdersForContract$1", m3645f = "FuturesOrderStore.kt", m3646l = {531, 533}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$streamHasOrdersForContract$1 */
    static final class C414571 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contractId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414571(UUID uuid, Continuation<? super C414571> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414571 c414571 = FuturesOrderStore.this.new C414571(this.$contractId, continuation);
            c414571.L$0 = obj;
            return c414571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414571) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r11, r10) == r0) goto L17;
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
                FuturesAccountStore futuresAccountStore = FuturesOrderStore.this.futuresAccountStore;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FuturesAccountStore.getFuturesAccountIdOrNull$default(futuresAccountStore, null, this, 1, null);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(FuturesOrderStore.this.getHasOrdersForContract.asFlow(new GetOrdersRequest(uuid, this.$contractId, null, 4, null)));
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Boolean> streamHasOrdersForContract(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        return FlowKt.flow(new C414571(contractId, null));
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$hasMoreThanOneSuccessfulOrder$1", m3645f = "FuturesOrderStore.kt", m3646l = {547, 549}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$hasMoreThanOneSuccessfulOrder$1 */
    static final class C414541 extends ContinuationImpl7 implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C414541(Continuation<? super C414541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414541 c414541 = FuturesOrderStore.this.new C414541(continuation);
            c414541.L$0 = obj;
            return c414541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414541) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r6, r5) == r0) goto L17;
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
                FuturesAccountStore futuresAccountStore = FuturesOrderStore.this.futuresAccountStore;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FuturesAccountStore.getFuturesAccountIdOrNull$default(futuresAccountStore, null, this, 1, null);
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
                Flow flowAsFlow = FuturesOrderStore.this.getHasMoreThanOneSuccessfulOrder.asFlow(uuid);
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<Boolean> hasMoreThanOneSuccessfulOrder() {
        return FlowKt.flow(new C414541(null));
    }

    public static /* synthetic */ Flow streamOrdersOverview$default(FuturesOrderStore futuresOrderStore, UUID uuid, Instant instant, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant();
        }
        return futuresOrderStore.streamOrdersOverview(uuid, instant);
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/store/futures/FuturesOrderStore$GetOrdersOverviewResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$streamOrdersOverview$1", m3645f = "FuturesOrderStore.kt", m3646l = {562, 564}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$streamOrdersOverview$1 */
    static final class C414591 extends ContinuationImpl7 implements Function2<FlowCollector<? super GetOrdersOverviewResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $contractId;
        final /* synthetic */ Instant $since;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414591(UUID uuid, Instant instant, Continuation<? super C414591> continuation) {
            super(2, continuation);
            this.$contractId = uuid;
            this.$since = instant;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C414591 c414591 = FuturesOrderStore.this.new C414591(this.$contractId, this.$since, continuation);
            c414591.L$0 = obj;
            return c414591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super GetOrdersOverviewResult> flowCollector, Continuation<? super Unit> continuation) {
            return ((C414591) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r9, r8) == r0) goto L17;
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
                FuturesAccountStore futuresAccountStore = FuturesOrderStore.this.futuresAccountStore;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = FuturesAccountStore.getFuturesAccountIdOrNull$default(futuresAccountStore, null, this, 1, null);
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(FuturesOrderStore.this.getOrdersOverview.asFlow(new GetOrdersOverviewParam(uuid, this.$contractId, this.$since)));
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<GetOrdersOverviewResult> streamOrdersOverview(UUID contractId, Instant since) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(since, "since");
        return FlowKt.flow(new C414591(contractId, since, null));
    }

    public static /* synthetic */ Flow streamRecentFilledOrderToShowConfirmation$default(FuturesOrderStore futuresOrderStore, UUID uuid, Instant instant, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = Instant.now();
        }
        return futuresOrderStore.streamRecentFilledOrderToShowConfirmation(uuid, instant);
    }

    public final Flow<UiFuturesOrder> streamRecentFilledOrderToShowConfirmation(UUID contractId, Instant since) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(since, "since");
        return FlowKt.distinctUntilChanged(FlowKt.filterNotNull(FuturesOrderDao.DefaultImpls.getRecentFilledOrderToShowConfirmation$default(this.futuresOrderDao, contractId, since, null, 4, null)), new Function2() { // from class: com.robinhood.store.futures.FuturesOrderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(FuturesOrderStore.streamRecentFilledOrderToShowConfirmation$lambda$16((UiFuturesOrder) obj, (UiFuturesOrder) obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean streamRecentFilledOrderToShowConfirmation$lambda$16(UiFuturesOrder old, UiFuturesOrder uiFuturesOrder) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(uiFuturesOrder, "new");
        return Intrinsics.areEqual(old.getId(), uiFuturesOrder.getId());
    }

    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$onOrderFilledConfirmationShown$1", m3645f = "FuturesOrderStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.store.futures.FuturesOrderStore$onOrderFilledConfirmationShown$1 */
    static final class C414551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C414551(UUID uuid, Continuation<? super C414551> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FuturesOrderStore.this.new C414551(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C414551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesOrderStore.this.uiFuturesOrderEventDao.insert(new UiFuturesOrderEvent(this.$orderId, true));
            return Unit.INSTANCE;
        }
    }

    public final void onOrderFilledConfirmationShown(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Launch.launchIO$default(getStoreScope(), null, null, new C414551(orderId, null), 3, null);
    }

    public final void refreshRealizedPnls(List<UUID> orderIds) {
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        Iterator it = CollectionsKt.chunked(orderIds, 100).iterator();
        while (it.hasNext()) {
            Endpoint.DefaultImpls.refresh$default(this.getOrderRealizedPnlEndpoint, (List) it.next(), false, null, 6, null);
        }
    }

    public final HistoryLoader.Callbacks<UiFuturesOrder> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\r\u0010\r\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore$AllOrderRequestArgs;", "", "requestId", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/RequestId;", "futuresAccountId", "Lcom/robinhood/store/futures/FuturesAccountId;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getRequestId", "()Ljava/util/UUID;", "getFuturesAccountId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class AllOrderRequestArgs {
        private final UUID futuresAccountId;
        private final UUID requestId;

        public static /* synthetic */ AllOrderRequestArgs copy$default(AllOrderRequestArgs allOrderRequestArgs, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = allOrderRequestArgs.requestId;
            }
            if ((i & 2) != 0) {
                uuid2 = allOrderRequestArgs.futuresAccountId;
            }
            return allOrderRequestArgs.copy(uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRequestId() {
            return this.requestId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final AllOrderRequestArgs copy(UUID requestId, UUID futuresAccountId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            return new AllOrderRequestArgs(requestId, futuresAccountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllOrderRequestArgs)) {
                return false;
            }
            AllOrderRequestArgs allOrderRequestArgs = (AllOrderRequestArgs) other;
            return Intrinsics.areEqual(this.requestId, allOrderRequestArgs.requestId) && Intrinsics.areEqual(this.futuresAccountId, allOrderRequestArgs.futuresAccountId);
        }

        public int hashCode() {
            return (this.requestId.hashCode() * 31) + this.futuresAccountId.hashCode();
        }

        public String toString() {
            return "AllOrderRequestArgs(requestId=" + this.requestId + ", futuresAccountId=" + this.futuresAccountId + ")";
        }

        public AllOrderRequestArgs(UUID requestId, UUID futuresAccountId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            this.requestId = requestId;
            this.futuresAccountId = futuresAccountId;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FuturesOrderStore.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesOrderStore$PartialOrdersRequestArgs;", "", "futuresAccountId", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/FuturesAccountId;", "contractId", "orderStates", "", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderState;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/Set;)V", "getFuturesAccountId", "()Ljava/util/UUID;", "getContractId", "getOrderStates", "()Ljava/util/Set;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class PartialOrdersRequestArgs {
        private final UUID contractId;
        private final UUID futuresAccountId;
        private final Set<FuturesOrderState> orderStates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PartialOrdersRequestArgs copy$default(PartialOrdersRequestArgs partialOrdersRequestArgs, UUID uuid, UUID uuid2, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = partialOrdersRequestArgs.futuresAccountId;
            }
            if ((i & 2) != 0) {
                uuid2 = partialOrdersRequestArgs.contractId;
            }
            if ((i & 4) != 0) {
                set = partialOrdersRequestArgs.orderStates;
            }
            return partialOrdersRequestArgs.copy(uuid, uuid2, set);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final Set<FuturesOrderState> component3() {
            return this.orderStates;
        }

        public final PartialOrdersRequestArgs copy(UUID futuresAccountId, UUID contractId, Set<? extends FuturesOrderState> orderStates) {
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            return new PartialOrdersRequestArgs(futuresAccountId, contractId, orderStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PartialOrdersRequestArgs)) {
                return false;
            }
            PartialOrdersRequestArgs partialOrdersRequestArgs = (PartialOrdersRequestArgs) other;
            return Intrinsics.areEqual(this.futuresAccountId, partialOrdersRequestArgs.futuresAccountId) && Intrinsics.areEqual(this.contractId, partialOrdersRequestArgs.contractId) && Intrinsics.areEqual(this.orderStates, partialOrdersRequestArgs.orderStates);
        }

        public int hashCode() {
            int iHashCode = this.futuresAccountId.hashCode() * 31;
            UUID uuid = this.contractId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            Set<FuturesOrderState> set = this.orderStates;
            return iHashCode2 + (set != null ? set.hashCode() : 0);
        }

        public String toString() {
            return "PartialOrdersRequestArgs(futuresAccountId=" + this.futuresAccountId + ", contractId=" + this.contractId + ", orderStates=" + this.orderStates + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PartialOrdersRequestArgs(UUID futuresAccountId, UUID uuid, Set<? extends FuturesOrderState> set) {
            Intrinsics.checkNotNullParameter(futuresAccountId, "futuresAccountId");
            this.futuresAccountId = futuresAccountId;
            this.contractId = uuid;
            this.orderStates = set;
        }

        public /* synthetic */ PartialOrdersRequestArgs(UUID uuid, UUID uuid2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : uuid2, (i & 4) != 0 ? null : set);
        }

        public final UUID getFuturesAccountId() {
            return this.futuresAccountId;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final Set<FuturesOrderState> getOrderStates() {
            return this.orderStates;
        }
    }

    static {
        Duration durationOfMillis = Duration.ofMillis(2500L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        DefaultGetOrdersPollingDuration = durationOfMillis;
    }
}
