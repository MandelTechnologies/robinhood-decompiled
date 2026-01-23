package com.robinhood.librobinhood.data.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiBulkOrderCancelRequest;
import com.robinhood.models.api.ApiBulkOrderCancelRequest2;
import com.robinhood.models.api.ApiBulkOrderCancelResponse;
import com.robinhood.models.api.ApiCancelOrderRequest;
import com.robinhood.models.api.ApiEstimatedFees;
import com.robinhood.models.api.ApiEstimatedFeesRequest;
import com.robinhood.models.api.ApiOrder;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.api.EquityOrderState6;
import com.robinhood.models.api.IpoOrderUpdateRequest;
import com.robinhood.models.api.OrderRequest;
import com.robinhood.models.api.OrderUpdateRequest;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.dao.OrderDao;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Order4;
import com.robinhood.models.p355ui.UiOrder;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.extensions.Maybes2;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: OrderStore.kt */
@Metadata(m3635d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0097\u00012\u00020\u0001:\u0004\u0098\u0001\u0097\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0#0\u001a2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001a2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b'\u0010%J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001a¢\u0006\u0004\b)\u0010 J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020(0*2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b+\u0010,J)\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001dJ)\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b2\u0010/J7\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u001a2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403¢\u0006\u0004\b6\u00107J#\u00108\u001a\b\u0012\u0004\u0012\u00020(0\u001a2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b8\u0010/J\u0015\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020\u001b¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0=2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b>\u0010?J+\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u00109\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020&2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ%\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u001d\u0010J\u001a\u00020:2\u0006\u0010I\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020:2\u0006\u0010I\u001a\u00020(¢\u0006\u0004\bL\u0010MJ\u0015\u0010J\u001a\u00020:2\u0006\u0010I\u001a\u00020(¢\u0006\u0004\bJ\u0010MJ\u001b\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001b0=2\u0006\u00109\u001a\u00020N¢\u0006\u0004\bO\u0010PJ#\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001b0=2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00109\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\u001b\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001b0=2\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u00020X2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bY\u0010ZJ \u0010Y\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0086@¢\u0006\u0004\bY\u0010[J!\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0#0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\\\u0010\u001dJ1\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0*2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u0018032\b\b\u0002\u0010^\u001a\u00020(¢\u0006\u0004\b_\u0010`J,\u0010e\u001a\b\u0012\u0004\u0012\u00020b0a2\u0006\u0010\"\u001a\u00020!2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001803H\u0086@¢\u0006\u0004\bc\u0010dJ>\u0010o\u001a\b\u0012\u0004\u0012\u00020l0a2\u0006\u0010-\u001a\u00020\u00182\u0006\u0010f\u001a\u00020(2\u0006\u0010h\u001a\u00020g2\u0006\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020gH\u0086@¢\u0006\u0004\bm\u0010nJ\u001e\u0010o\u001a\b\u0012\u0004\u0012\u00020l0a2\u0006\u0010q\u001a\u00020pH\u0086@¢\u0006\u0004\br\u0010sR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010tR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010uR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010vR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010wR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010xR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010yR \u0010{\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00150z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R,\u0010~\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020Q0}\u0012\u0004\u0012\u00020\u00150z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|R,\u0010\u007f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020T0}\u0012\u0004\u0012\u00020\u00150z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010|R$\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0083\u0001\u001a\u0015\u0012\u0004\u0012\u00020:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0082\u0001R$\u0010\u0085\u0001\u001a\u000f\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00150\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u0089\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u0088\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R%\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u0012\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R#\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0099\u0001"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OrderStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/OrderDao;", "dao", "Lcom/robinhood/api/retrofit/Brokeback;", "brokeback", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "equitiesBrokeback", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OrderDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/api/equity/EquitiesBrokeback;)V", "Lcom/robinhood/models/PaginationCursor;", "cursor", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOrder;", "fetchOrdersWithCursor", "(Lcom/robinhood/models/PaginationCursor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/UUID;", "orderId", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Order;", "getOrder", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "", "getOrders", "()Lio/reactivex/Observable;", "", "accountNumber", "Lcom/robinhood/utils/Optional;", "getLastOrder", "(Ljava/lang/String;)Lio/reactivex/Observable;", "", "getOrderCount", "", "hasAtLeastOneOrderForAllAccounts", "Lkotlinx/coroutines/flow/Flow;", "hasAtLeastOneOrderForAccount", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "instrumentId", "streamOrderByInstrument", "(Ljava/util/UUID;Ljava/lang/String;)Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/UiOrder;", "streamUiOrder", "getOrdersByInstrument", "", "Lcom/robinhood/models/api/EquityOrderState;", "states", "getOrdersByInstrumentAndStates", "(Ljava/util/UUID;Ljava/lang/String;Ljava/util/Set;)Lio/reactivex/Observable;", "hasOrderByInstrument", Card.Icon.ORDER, "", "onOrderPlaced", "(Lcom/robinhood/models/db/Order;)V", "Lio/reactivex/Single;", "fetchOrder", "(Ljava/util/UUID;)Lio/reactivex/Single;", "duration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "pollSubmittedOrder", "(Lcom/robinhood/models/db/Order;ILjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;", "j$/time/Duration", "interval", "poll", "(Ljava/util/UUID;Lj$/time/Duration;)Lio/reactivex/Observable;", "force", "refresh", "(ZLjava/util/UUID;)V", "refreshSinglePage", "(Z)V", "Lcom/robinhood/models/api/OrderRequest;", "submitOrder", "(Lcom/robinhood/models/api/OrderRequest;)Lio/reactivex/Single;", "Lcom/robinhood/models/api/IpoOrderUpdateRequest;", "updateIpoOrder", "(Ljava/util/UUID;Lcom/robinhood/models/api/IpoOrderUpdateRequest;)Lio/reactivex/Single;", "Lcom/robinhood/models/api/OrderUpdateRequest;", "orderUpdate", "updateOrder", "(Lcom/robinhood/models/api/OrderUpdateRequest;)Lio/reactivex/Single;", "Lio/reactivex/Completable;", "cancelOrder", "(Ljava/util/UUID;)Lio/reactivex/Completable;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOrderAndPoll", "orderIds", "forceRefresh", "streamOrdersById", "(Ljava/util/Set;Z)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/robinhood/models/api/ApiBulkOrderCancelResponse;", "cancelOrders-0E7RQCE", "(Ljava/lang/String;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOrders", "isOtc", "Ljava/math/BigDecimal;", "quantity", "Lcom/robinhood/models/db/EquityOrderSide;", "side", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/models/api/ApiEstimatedFees;", "estimateFees-hUnOzRk", "(Ljava/util/UUID;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/EquityOrderSide;Ljava/math/BigDecimal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "estimateFees", "Lcom/robinhood/models/api/ApiEstimatedFeesRequest;", "feeRequest", "estimateFees-gIAlu-s", "(Lcom/robinhood/models/api/ApiEstimatedFeesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/models/dao/OrderDao;", "Lcom/robinhood/api/retrofit/Brokeback;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/api/equity/EquitiesBrokeback;", "Lcom/robinhood/android/moria/network/PostEndpoint;", "postOrder", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lkotlin/Pair;", "patchIpoOrder", "patchOrder", "Lcom/robinhood/android/moria/network/Endpoint;", "orderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "ordersSinglePageEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "ordersEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/librobinhood/data/store/OrderStore$StreamInstrumentOrdersParams;", "streamByInstrumentQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader$annotations", "()V", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Companion", "StreamInstrumentOrdersParams", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OrderStore extends Store {
    private static final int MAX_BATCH_SIZE = 50;
    private final AccountProvider accountProvider;
    private final Brokeback brokeback;
    private final OrderDao dao;
    private final EquitiesBrokeback equitiesBrokeback;
    private final HistoryLoader.Callbacks<Order> historyLoaderCallbacks;
    private final InstrumentStore instrumentStore;
    private final Endpoint<UUID, ApiOrder> orderEndpoint;
    private final PaginatedEndpoint<Unit, ApiOrder> ordersEndpoint;
    private final Endpoint<Unit, PaginatedResult<ApiOrder>> ordersSinglePageEndpoint;
    private final PostEndpoint<Tuples2<UUID, IpoOrderUpdateRequest>, ApiOrder> patchIpoOrder;
    private final PostEndpoint<Tuples2<UUID, OrderUpdateRequest>, ApiOrder> patchOrder;
    private final PositionStore positionStore;
    private final PostEndpoint<OrderRequest, ApiOrder> postOrder;
    private final Query<StreamInstrumentOrdersParams, List<Order>> streamByInstrumentQuery;
    private final HistoryTransactionLoader transactionLoader;

    /* compiled from: OrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore", m3645f = "OrderStore.kt", m3646l = {525, 535}, m3647m = "fetchOrdersWithCursor")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$fetchOrdersWithCursor$1 */
    static final class C342031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C342031(Continuation<? super C342031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OrderStore.this.fetchOrdersWithCursor(null, this);
        }
    }

    public static /* synthetic */ void getTransactionLoader$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStore(StoreBundle storeBundle, OrderDao dao, Brokeback brokeback, AccountProvider accountProvider, InstrumentStore instrumentStore, PositionStore positionStore, EquitiesBrokeback equitiesBrokeback) {
        super(storeBundle, Order.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(equitiesBrokeback, "equitiesBrokeback");
        this.dao = dao;
        this.brokeback = brokeback;
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.equitiesBrokeback = equitiesBrokeback;
        PostEndpoint.Companion companion = PostEndpoint.INSTANCE;
        this.postOrder = companion.create(new OrderStore$postOrder$1(brokeback), new OrderStore$postOrder$2(dao));
        this.patchIpoOrder = companion.create(new OrderStore$patchIpoOrder$1(this, null), new OrderStore$patchIpoOrder$2(dao));
        this.patchOrder = companion.create(new OrderStore$patchOrder$1(this, null), new OrderStore$patchOrder$2(dao));
        Endpoint.Companion companion2 = Endpoint.INSTANCE;
        this.orderEndpoint = Endpoint.Companion.create$default(companion2, new OrderStore$orderEndpoint$1(brokeback), getLogoutKillswitch(), new OrderStore$orderEndpoint$2(dao), storeBundle.getClock(), null, 16, null);
        this.ordersSinglePageEndpoint = Endpoint.Companion.create$default(companion2, new OrderStore$ordersSinglePageEndpoint$1(this, null), getLogoutKillswitch(), new OrderStore$ordersSinglePageEndpoint$2(dao), storeBundle.getClock(), null, 16, null);
        this.ordersEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new OrderStore$ordersEndpoint$1(this, null), getLogoutKillswitch(), new OrderStore$ordersEndpoint$2(this, null), storeBundle.getClock(), null, 16, null);
        int i = 50;
        boolean z = false;
        long j = 0;
        this.streamByInstrumentQuery = Store.create$default(this, Query.INSTANCE, "streamByInstrument", CollectionsKt.listOf(new Batch(getStoreScope(), i, z, j, new Function1() { // from class: com.robinhood.librobinhood.data.store.OrderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderStore.streamByInstrumentQuery$lambda$4(this.f$0, (Collection) obj);
            }
        }, 12, null)), new Function1() { // from class: com.robinhood.librobinhood.data.store.OrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderStore.streamByInstrumentQuery$lambda$5(this.f$0, (OrderStore.StreamInstrumentOrdersParams) obj);
            }
        }, false, 8, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.OrderStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.EQUITY_ORDER);
                return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(this.this$0.getOrder(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null), new OrderStore$transactionLoader$1$load$$inlined$flatMapLatest$1(null, this.this$0));
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<Order>() { // from class: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.EQUITY_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
                this.isInstrumentHistoryLoader = true;
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
            /* renamed from: isInstrumentHistoryLoader, reason: from getter */
            public boolean getIsInstrumentHistoryLoader() {
                return this.isInstrumentHistoryLoader;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                final Flow<Integer> flowCountTotal = this.this$0.dao.countTotal(EquityOrderState6.getEquityOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountTotal.collect(new C341912(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2 */
                    public static final class C341912<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2", m3645f = "OrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C341912.this.emit(null, this);
                            }
                        }

                        public C341912(FlowCollector flowCollector) {
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
                                Integer numBoxInt = boxing.boxInt(num != null ? num.intValue() : 0);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow<Integer> flowCountLater = this.this$0.dao.countLater(EquityOrderState6.getEquityOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id);
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountLater.collect(new C341902(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2 */
                    public static final class C341902<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2", m3645f = "OrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C341902.this.emit(null, this);
                            }
                        }

                        public C341902(FlowCollector flowCollector) {
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
                                Integer numBoxInt = boxing.boxInt(num != null ? num.intValue() : 0);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(numBoxInt, anonymousClass1) == coroutine_suspended) {
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

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<Order>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refresh(false);
                return this.this$0.dao.getLatest(EquityOrderState6.getEquityOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<Order>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(EquityOrderState6.getEquityOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<Order>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(EquityOrderState6.getEquityOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<Order>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(EquityOrderState6.getEquityOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object postOrder$insert(OrderDao orderDao, ApiOrder apiOrder, Continuation continuation) {
        orderDao.insert(apiOrder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object patchIpoOrder$insert$0(OrderDao orderDao, ApiOrder apiOrder, Continuation continuation) {
        orderDao.insert(apiOrder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object patchOrder$insert$1(OrderDao orderDao, ApiOrder apiOrder, Continuation continuation) {
        orderDao.insert(apiOrder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object orderEndpoint$insert$2(OrderDao orderDao, ApiOrder apiOrder, Continuation continuation) {
        orderDao.insert(apiOrder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object ordersSinglePageEndpoint$insert$3(OrderDao orderDao, PaginatedResult paginatedResult, Continuation continuation) {
        orderDao.insert((PaginatedResult<ApiOrder>) paginatedResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamByInstrumentQuery$lambda$4(OrderStore orderStore, Collection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return PaginatedEndpointKt.pollAllPages$default(orderStore.ordersEndpoint, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow streamByInstrumentQuery$lambda$5(OrderStore orderStore, StreamInstrumentOrdersParams streamInstrumentOrdersParams) {
        Intrinsics.checkNotNullParameter(streamInstrumentOrdersParams, "<destruct>");
        return orderStore.dao.getOrdersByInstrument(streamInstrumentOrdersParams.getInstrumentId(), streamInstrumentOrdersParams.getAccountNumber());
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<Order> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final Observable<Order> getOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getOrder(orderId))));
    }

    public final Observable<List<Order>> getOrders() {
        return asObservable(takeWhileLoggedIn(this.dao.getOrders()));
    }

    public final Observable<Optional<Order>> getLastOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow<Order> lastOrder = this.dao.getLastOrder(accountNumber);
        Observable<Optional<Order>> observableTakeUntil = asObservable(new Flow<Optional<? extends Order>>() { // from class: com.robinhood.librobinhood.data.store.OrderStore$getLastOrder$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Order>> flowCollector, Continuation continuation) {
                Object objCollect = lastOrder.collect(new C341892(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$getLastOrder$$inlined$map$1$2 */
            public static final class C341892<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$getLastOrder$$inlined$map$1$2", m3645f = "OrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$getLastOrder$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C341892.this.emit(null, this);
                    }
                }

                public C341892(FlowCollector flowCollector) {
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
                        Optional optionalAsOptional = Optional3.asOptional((Order) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
        }).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Observable<Integer> getOrderCount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getCount(accountNumber))));
    }

    public final Observable<Boolean> hasAtLeastOneOrderForAllAccounts() {
        return asObservable(FlowKt.filterNotNull(this.dao.hasAtLeastOneOrderForAllAccounts()));
    }

    public final Flow<Boolean> hasAtLeastOneOrderForAccount(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return FlowKt.filterNotNull(this.dao.hasAtLeastOneOrderForAccount(accountNumber));
    }

    public final Observable<List<Order>> streamOrderByInstrument(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return this.streamByInstrumentQuery.asObservable(new StreamInstrumentOrdersParams(instrumentId, accountNumber));
    }

    public final Observable<UiOrder> streamUiOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getUiOrder(orderId))));
    }

    public final Observable<List<Order>> getOrdersByInstrument(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Observable<List<Order>> observableTakeUntil = asObservable(this.dao.getOrdersByInstrument(instrumentId, accountNumber)).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Observable<List<Order>> getOrdersByInstrumentAndStates(UUID instrumentId, String accountNumber, Set<? extends EquityOrderState> states) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(states, "states");
        Observable<List<Order>> observableTakeUntil = asObservable(this.dao.getOrdersByInstrumentAndStates(instrumentId, accountNumber, states)).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Observable<Boolean> hasOrderByInstrument(UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.hasOrderByInstrument(instrumentId, accountNumber))));
    }

    public final void onOrderPlaced(Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.accountProvider.refresh(true);
        this.positionStore.refreshForOrder(order);
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$fetchOrder$1", m3645f = "OrderStore.kt", m3646l = {350}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$fetchOrder$1 */
    static final class C342001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOrder>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342001(UUID uuid, Continuation<? super C342001> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderStore.this.new C342001(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOrder> continuation) {
            return ((C342001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = OrderStore.this.orderEndpoint;
            UUID uuid = this.$orderId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Single<Order> fetchOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Single<Order> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C342001(orderId, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.OrderStore.fetchOrder.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiOrder apiOrder) {
                OrderStore.this.instrumentStore.pingInstruments(CollectionsKt.listOf(apiOrder.getInstrumentId()));
            }
        }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OrderStore.fetchOrder.3
            @Override // io.reactivex.functions.Function
            public final Order apply(ApiOrder p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Order4.toOrder(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<Order> pollSubmittedOrder(final Order order, int duration, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Observable<Order> observableDefaultIfEmpty = poll(order.getId(), Durations.INSTANCE.getONE_SECOND()).take(duration, timeUnit).takeUntil(new Predicate() { // from class: com.robinhood.librobinhood.data.store.OrderStore.pollSubmittedOrder.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState().isFinal();
            }
        }).takeLast(1).onErrorReturn(new Function() { // from class: com.robinhood.librobinhood.data.store.OrderStore.pollSubmittedOrder.2
            @Override // io.reactivex.functions.Function
            public final Order apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return order;
            }
        }).defaultIfEmpty(order);
        Intrinsics.checkNotNullExpressionValue(observableDefaultIfEmpty, "defaultIfEmpty(...)");
        return observableDefaultIfEmpty;
    }

    public static /* synthetic */ Observable poll$default(OrderStore orderStore, UUID uuid, Duration duration, int i, Object obj) {
        if ((i & 2) != 0) {
            duration = Durations.INSTANCE.getFIVE_SECONDS();
        }
        return orderStore.poll(uuid, duration);
    }

    public final Observable<Order> poll(UUID orderId, Duration interval) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.orderEndpoint, orderId, interval, null, 4, null);
        Observable<Order> observableTakeUntil = asObservable(new Flow<Order>() { // from class: com.robinhood.librobinhood.data.store.OrderStore$poll$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Order> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C341922(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$poll$$inlined$map$1$2 */
            public static final class C341922<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$poll$$inlined$map$1$2", m3645f = "OrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$poll$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C341922.this.emit(null, this);
                    }
                }

                public C341922(FlowCollector flowCollector) {
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
                        Order order = Order4.toOrder((ApiOrder) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(order, anonymousClass1) == coroutine_suspended) {
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
        }).takeUntil((Predicate) new Predicate() { // from class: com.robinhood.librobinhood.data.store.OrderStore.poll.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState().isFinal();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$refresh$1", m3645f = "OrderStore.kt", m3646l = {375, 377}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$refresh$1 */
    static final class C342071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOrder>, Object> {
        final /* synthetic */ boolean $force;
        final /* synthetic */ UUID $orderId;
        int label;
        final /* synthetic */ OrderStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342071(boolean z, OrderStore orderStore, UUID uuid, Continuation<? super C342071> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = orderStore;
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C342071(this.$force, this.this$0, this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOrder> continuation) {
            return ((C342071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r11 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (ApiOrder) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (ApiOrder) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (this.$force) {
                Endpoint endpoint = this.this$0.orderEndpoint;
                UUID uuid = this.$orderId;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            } else {
                Endpoint endpoint2 = this.this$0.orderEndpoint;
                UUID uuid2 = this.$orderId;
                this.label = 2;
                obj = Endpoint.DefaultImpls.fetch$default(endpoint2, uuid2, null, this, 2, null);
            }
            return coroutine_suspended;
        }
    }

    public final void refresh(boolean force, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Maybe maybeDoOnSuccess = Maybes2.ignoreNetworkExceptions(RxFactory.DefaultImpls.rxMaybe$default(this, null, new C342071(force, this, orderId, null), 1, null)).doOnSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.OrderStore.refresh.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiOrder apiOrder) {
                OrderStore.this.instrumentStore.pingInstruments(CollectionsKt.listOf(apiOrder.getInstrumentId()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeDoOnSuccess, "doOnSuccess(...)");
        ScopedSubscriptionKt.subscribeIn(maybeDoOnSuccess, getStoreScope());
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$refreshSinglePage$1", m3645f = "OrderStore.kt", m3646l = {390, 392}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$refreshSinglePage$1 */
    static final class C342101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiOrder>>, Object> {
        final /* synthetic */ boolean $force;
        int label;
        final /* synthetic */ OrderStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342101(boolean z, OrderStore orderStore, Continuation<? super C342101> continuation) {
            super(2, continuation);
            this.$force = z;
            this.this$0 = orderStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C342101(this.$force, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiOrder>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiOrder>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiOrder>> continuation) {
            return ((C342101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (PaginatedResult) obj;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            }
            ResultKt.throwOnFailure(obj);
            if (this.$force) {
                Endpoint endpoint = this.this$0.ordersSinglePageEndpoint;
                this.label = 1;
                obj = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
            } else {
                Endpoint endpoint2 = this.this$0.ordersSinglePageEndpoint;
                this.label = 2;
                obj = Endpoint8.fetch$default(endpoint2, null, this, 1, null);
            }
            return coroutine_suspended;
        }
    }

    public final void refreshSinglePage(boolean force) {
        ScopedSubscriptionKt.subscribeIn(Maybes2.ignoreNetworkExceptions(RxFactory.DefaultImpls.rxMaybe$default(this, null, new C342101(force, this, null), 1, null)), getStoreScope());
    }

    public final void refresh(boolean force) {
        Flow flowFetchAllPages;
        if (force) {
            flowFetchAllPages = PaginatedEndpointKt.forceFetchAllPages(this.ordersEndpoint);
        } else {
            flowFetchAllPages = PaginatedEndpointKt.fetchAllPages(this.ordersEndpoint);
        }
        Observable observableDoOnNext = ObservablesKt.ignoreNetworkExceptions(asObservable(flowFetchAllPages)).doOnNext(new C342093());
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        ScopedSubscriptionKt.subscribeIn(observableDoOnNext, getStoreScope());
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$refresh$3 */
    static final class C342093<T> implements Consumer {
        C342093() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final UUID accept$lambda$0(ApiOrder it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getInstrumentId();
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(PaginatedResult<ApiOrder> paginatedResult) {
            InstrumentStore instrumentStore = OrderStore.this.instrumentStore;
            Intrinsics.checkNotNull(paginatedResult);
            instrumentStore.pingInstruments(paginatedResult, new Function1() { // from class: com.robinhood.librobinhood.data.store.OrderStore$refresh$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderStore.C342093.accept$lambda$0((ApiOrder) obj);
                }
            });
        }
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Order;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$submitOrder$1", m3645f = "OrderStore.kt", m3646l = {414}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$submitOrder$1 */
    static final class C342111 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Order>, Object> {
        final /* synthetic */ OrderRequest $order;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342111(OrderRequest orderRequest, Continuation<? super C342111> continuation) {
            super(2, continuation);
            this.$order = orderRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderStore.this.new C342111(this.$order, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Order> continuation) {
            return ((C342111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = OrderStore.this.postOrder;
                OrderRequest orderRequest = this.$order;
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, orderRequest, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Order4.toOrder((ApiOrder) obj);
        }
    }

    public final Single<Order> submitOrder(OrderRequest order) {
        Intrinsics.checkNotNullParameter(order, "order");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C342111(order, null), 1, null);
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Order;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$updateIpoOrder$1", m3645f = "OrderStore.kt", m3646l = {418}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$updateIpoOrder$1 */
    static final class C342121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Order>, Object> {
        final /* synthetic */ IpoOrderUpdateRequest $order;
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342121(UUID uuid, IpoOrderUpdateRequest ipoOrderUpdateRequest, Continuation<? super C342121> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
            this.$order = ipoOrderUpdateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderStore.this.new C342121(this.$orderId, this.$order, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Order> continuation) {
            return ((C342121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = OrderStore.this.patchIpoOrder;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$orderId, this.$order);
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Order4.toOrder((ApiOrder) obj);
        }
    }

    public final Single<Order> updateIpoOrder(UUID orderId, IpoOrderUpdateRequest order) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(order, "order");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C342121(orderId, order, null), 1, null);
    }

    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Order;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$updateOrder$1", m3645f = "OrderStore.kt", m3646l = {422}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$updateOrder$1 */
    static final class C342131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Order>, Object> {
        final /* synthetic */ OrderUpdateRequest $orderUpdate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C342131(OrderUpdateRequest orderUpdateRequest, Continuation<? super C342131> continuation) {
            super(2, continuation);
            this.$orderUpdate = orderUpdateRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderStore.this.new C342131(this.$orderUpdate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Order> continuation) {
            return ((C342131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = OrderStore.this.patchOrder;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$orderUpdate.getOriginal_order_id(), this.$orderUpdate);
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, tuples2M3642to, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Order4.toOrder((ApiOrder) obj);
        }
    }

    public final Single<Order> updateOrder(OrderUpdateRequest orderUpdate) {
        Intrinsics.checkNotNullParameter(orderUpdate, "orderUpdate");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C342131(orderUpdate, null), 1, null);
    }

    public final Completable cancelOrder(final UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Completable completableFlatMapCompletable = fetchOrder(orderId).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrder.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(final Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                ApiCancelOrderRequest apiCancelOrderRequest = new ApiCancelOrderRequest(order.getAccountNumber());
                OrderStore orderStore = OrderStore.this;
                Completable completableRxCompletable$default = RxFactory.DefaultImpls.rxCompletable$default(orderStore, null, new AnonymousClass1(orderStore, orderId, apiCancelOrderRequest, null), 1, null);
                final OrderStore orderStore2 = OrderStore.this;
                final UUID uuid = orderId;
                return completableRxCompletable$default.doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrder.1.2
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        orderStore2.refresh(true, uuid);
                        orderStore2.accountProvider.refresh(true);
                        orderStore2.positionStore.refreshAccount(order.getAccountNumber(), true);
                    }
                });
            }

            /* compiled from: OrderStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$cancelOrder$1$1", m3645f = "OrderStore.kt", m3646l = {432}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$cancelOrder$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ UUID $orderId;
                final /* synthetic */ ApiCancelOrderRequest $request;
                int label;
                final /* synthetic */ OrderStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OrderStore orderStore, UUID uuid, ApiCancelOrderRequest apiCancelOrderRequest, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = orderStore;
                    this.$orderId = uuid;
                    this.$request = apiCancelOrderRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$orderId, this.$request, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Brokeback brokeback = this.this$0.brokeback;
                        UUID uuid = this.$orderId;
                        ApiCancelOrderRequest apiCancelOrderRequest = this.$request;
                        this.label = 1;
                        if (brokeback.cancelOrder(uuid, apiCancelOrderRequest, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        return completableFlatMapCompletable;
    }

    public final Object cancelOrder(UUID uuid, String str, Continuation<? super Unit> continuation) {
        Object objCancelOrder = this.brokeback.cancelOrder(uuid, new ApiCancelOrderRequest(str), continuation);
        return objCancelOrder == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCancelOrder : Unit.INSTANCE;
    }

    public final Observable<Optional<Order>> cancelOrderAndPoll(final UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Observable<R> map = getOrder(orderId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrderAndPoll.1
            @Override // io.reactivex.functions.Function
            public final Optional<Order> apply(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it);
            }
        });
        Optional2 optional2 = Optional2.INSTANCE;
        Completable completableFlatMapCompletable = map.first(optional2).flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrderAndPoll.2

            /* compiled from: OrderStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$cancelOrderAndPoll$2$1", m3645f = "OrderStore.kt", m3646l = {464}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$cancelOrderAndPoll$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Order $order;
                final /* synthetic */ UUID $orderId;
                int label;
                final /* synthetic */ OrderStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OrderStore orderStore, UUID uuid, Order order, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = orderStore;
                    this.$orderId = uuid;
                    this.$order = order;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$orderId, this.$order, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    String accountNumber;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Brokeback brokeback = this.this$0.brokeback;
                        UUID uuid = this.$orderId;
                        Order order = this.$order;
                        ApiCancelOrderRequest apiCancelOrderRequest = (order == null || (accountNumber = order.getAccountNumber()) == null) ? null : new ApiCancelOrderRequest(accountNumber);
                        this.label = 1;
                        if (brokeback.cancelOrder(uuid, apiCancelOrderRequest, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Optional<Order> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Order orderComponent1 = optional.component1();
                OrderStore orderStore = OrderStore.this;
                return RxFactory.DefaultImpls.rxCompletable$default(orderStore, null, new AnonymousClass1(orderStore, orderId, orderComponent1, null), 1, null);
            }
        });
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.orderEndpoint, orderId, Durations.INSTANCE.getONE_SECOND(), null, 4, null);
        Observable<Optional<Order>> observableSubscribeOn = completableFlatMapCompletable.andThen(asObservable(new Flow<Order>() { // from class: com.robinhood.librobinhood.data.store.OrderStore$cancelOrderAndPoll$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Order> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C341882(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$cancelOrderAndPoll$$inlined$map$1$2 */
            public static final class C341882<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OrderStore$cancelOrderAndPoll$$inlined$map$1$2", m3645f = "OrderStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.OrderStore$cancelOrderAndPoll$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C341882.this.emit(null, this);
                    }
                }

                public C341882(FlowCollector flowCollector) {
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
                        Order order = Order4.toOrder((ApiOrder) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(order, anonymousClass1) == coroutine_suspended) {
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
        }).takeUntil((Predicate) new Predicate() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrderAndPoll.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getState() == EquityOrderState.CANCELED;
            }
        }).onErrorResumeNext(Observable.empty()).take(5L, TimeUnit.SECONDS).takeLast(1).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrderAndPoll.5
            @Override // io.reactivex.functions.Function
            public final Optional<Order> apply(Order it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.INSTANCE.m2972of(it);
            }
        }).defaultIfEmpty(optional2).doOnNext(new Consumer() { // from class: com.robinhood.librobinhood.data.store.OrderStore.cancelOrderAndPoll.6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<Order> optional) {
                OrderStore.this.accountProvider.refresh(true);
                Order orNull = optional.getOrNull();
                if (orNull != null) {
                    OrderStore.this.positionStore.refreshAccount(orNull.getAccountNumber(), true);
                }
            }
        })).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    public static /* synthetic */ Flow streamOrdersById$default(OrderStore orderStore, Set set, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return orderStore.streamOrdersById(set, z);
    }

    public final Flow<List<Order>> streamOrdersById(Set<UUID> orderIds, boolean forceRefresh) {
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        PaginatedEndpointKt.refreshAllPages(this.ordersEndpoint, forceRefresh);
        return this.dao.streamOrdersById(orderIds);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: cancelOrders-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22704cancelOrders0E7RQCE(String str, Set<UUID> set, Continuation<? super Result<ApiBulkOrderCancelResponse>> continuation) {
        OrderStore$cancelOrders$1 orderStore$cancelOrders$1;
        if (continuation instanceof OrderStore$cancelOrders$1) {
            orderStore$cancelOrders$1 = (OrderStore$cancelOrders$1) continuation;
            int i = orderStore$cancelOrders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderStore$cancelOrders$1.label = i - Integer.MIN_VALUE;
            } else {
                orderStore$cancelOrders$1 = new OrderStore$cancelOrders$1(this, continuation);
            }
        }
        Object objCancelOrders = orderStore$cancelOrders$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = orderStore$cancelOrders$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCancelOrders);
                Result.Companion companion = Result.INSTANCE;
                EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback;
                Set<UUID> set2 = set;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    String string2 = ((UUID) it.next()).toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    arrayList.add(string2);
                }
                ApiBulkOrderCancelRequest apiBulkOrderCancelRequest = new ApiBulkOrderCancelRequest(str, arrayList, ApiBulkOrderCancelRequest2.FLATTENING);
                orderStore$cancelOrders$1.label = 1;
                objCancelOrders = equitiesBrokeback.cancelOrders(apiBulkOrderCancelRequest, orderStore$cancelOrders$1);
                if (objCancelOrders == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCancelOrders);
            }
            return Result.m28550constructorimpl((ApiBulkOrderCancelResponse) objCancelOrders);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchOrdersWithCursor(PaginationCursor paginationCursor, Continuation<? super PaginatedResult<ApiOrder>> continuation) {
        C342031 c342031;
        LocalDate localDate;
        Order order;
        LocalDate localDate2;
        Instant updatedAt;
        Object next;
        if (continuation instanceof C342031) {
            c342031 = (C342031) continuation;
            int i = c342031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342031.label = i - Integer.MIN_VALUE;
            } else {
                c342031 = new C342031(continuation);
            }
        }
        Object lastOrder = c342031.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342031.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(lastOrder);
            OrderDao orderDao = this.dao;
            c342031.L$0 = paginationCursor;
            c342031.label = 1;
            lastOrder = orderDao.getLastOrder(c342031);
            if (lastOrder != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localDate2 = (LocalDate) c342031.L$1;
            order = (Order) c342031.L$0;
            ResultKt.throwOnFailure(lastOrder);
            PaginatedResult paginatedResult = (PaginatedResult) lastOrder;
            if (order != null) {
                List results = paginatedResult.getResults();
                ArrayList arrayList = new ArrayList();
                for (Object obj : results) {
                    if (((ApiOrder) obj).getUpdated_at().compareTo(order.getUpdatedAt()) > 0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        Instant updated_at = ((ApiOrder) next).getUpdated_at();
                        do {
                            Object next2 = it.next();
                            Instant updated_at2 = ((ApiOrder) next2).getUpdated_at();
                            if (updated_at.compareTo(updated_at2) > 0) {
                                next = next2;
                                updated_at = updated_at2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Instant updated_at3 = next != null ? ((ApiOrder) next).getUpdated_at() : null;
                LocalDate localDate$default = updated_at3 != null ? Instants.toLocalDate$default(updated_at3, null, 1, null) : null;
                if (localDate2 != null && localDate$default != null && localDate$default.compareTo((ChronoLocalDate) localDate2) < 0) {
                    getLastUpdatedAtManager().clear(Order.class);
                }
            }
            return paginatedResult;
        }
        paginationCursor = (PaginationCursor) c342031.L$0;
        ResultKt.throwOnFailure(lastOrder);
        Order order2 = (Order) lastOrder;
        if (order2 == null || (updatedAt = order2.getUpdatedAt()) == null) {
            localDate = null;
        } else {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            localDate = Instants.toLocalDate(updatedAt, zoneIdSystemDefault);
        }
        LocalDate lastUpdatedAtDate = getLastUpdatedAtManager().getLastUpdatedAtDate(Order.class);
        LocalDate localDate3 = (localDate == null || lastUpdatedAtDate == null) ? null : (LocalDate) ComparisonsKt.minOf(localDate, lastUpdatedAtDate);
        Brokeback brokeback = this.brokeback;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        c342031.L$0 = order2;
        c342031.L$1 = lastUpdatedAtDate;
        c342031.label = 2;
        Object orders = brokeback.getOrders(localDate3, value, c342031);
        if (orders != coroutine_suspended) {
            order = order2;
            lastOrder = orders;
            localDate2 = lastUpdatedAtDate;
            PaginatedResult paginatedResult2 = (PaginatedResult) lastOrder;
            if (order != null) {
            }
            return paginatedResult2;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: estimateFees-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22706estimateFeeshUnOzRk(UUID uuid, boolean z, BigDecimal bigDecimal, EquityOrderSide equityOrderSide, BigDecimal bigDecimal2, Continuation<? super Result<ApiEstimatedFees>> continuation) {
        OrderStore$estimateFees$1 orderStore$estimateFees$1;
        if (continuation instanceof OrderStore$estimateFees$1) {
            orderStore$estimateFees$1 = (OrderStore$estimateFees$1) continuation;
            int i = orderStore$estimateFees$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderStore$estimateFees$1.label = i - Integer.MIN_VALUE;
            } else {
                orderStore$estimateFees$1 = new OrderStore$estimateFees$1(this, continuation);
            }
        }
        Object obj = orderStore$estimateFees$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = orderStore$estimateFees$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        ApiEstimatedFeesRequest apiEstimatedFeesRequest = new ApiEstimatedFeesRequest(string2, z, bigDecimal, equityOrderSide, bigDecimal2);
        orderStore$estimateFees$1.label = 1;
        Object objM22705estimateFeesgIAlus = m22705estimateFeesgIAlus(apiEstimatedFeesRequest, orderStore$estimateFees$1);
        return objM22705estimateFeesgIAlus == coroutine_suspended ? coroutine_suspended : objM22705estimateFeesgIAlus;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: estimateFees-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22705estimateFeesgIAlus(ApiEstimatedFeesRequest apiEstimatedFeesRequest, Continuation<? super Result<ApiEstimatedFees>> continuation) {
        OrderStore$estimateFees$2 orderStore$estimateFees$2;
        if (continuation instanceof OrderStore$estimateFees$2) {
            orderStore$estimateFees$2 = (OrderStore$estimateFees$2) continuation;
            int i = orderStore$estimateFees$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orderStore$estimateFees$2.label = i - Integer.MIN_VALUE;
            } else {
                orderStore$estimateFees$2 = new OrderStore$estimateFees$2(this, continuation);
            }
        }
        Object objEstimateOrderFees = orderStore$estimateFees$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = orderStore$estimateFees$2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objEstimateOrderFees);
                Result.Companion companion = Result.INSTANCE;
                EquitiesBrokeback equitiesBrokeback = this.equitiesBrokeback;
                orderStore$estimateFees$2.label = 1;
                objEstimateOrderFees = equitiesBrokeback.estimateOrderFees(apiEstimatedFeesRequest, orderStore$estimateFees$2);
                if (objEstimateOrderFees == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objEstimateOrderFees);
            }
            return Result.m28550constructorimpl((ApiEstimatedFees) objEstimateOrderFees);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderStore.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\rHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OrderStore$StreamInstrumentOrdersParams;", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "compareTo", "", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "toString", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class StreamInstrumentOrdersParams implements Comparable<StreamInstrumentOrdersParams> {
        private final String accountNumber;
        private final UUID instrumentId;

        public static /* synthetic */ StreamInstrumentOrdersParams copy$default(StreamInstrumentOrdersParams streamInstrumentOrdersParams, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = streamInstrumentOrdersParams.instrumentId;
            }
            if ((i & 2) != 0) {
                str = streamInstrumentOrdersParams.accountNumber;
            }
            return streamInstrumentOrdersParams.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final StreamInstrumentOrdersParams copy(UUID instrumentId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new StreamInstrumentOrdersParams(instrumentId, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamInstrumentOrdersParams)) {
                return false;
            }
            StreamInstrumentOrdersParams streamInstrumentOrdersParams = (StreamInstrumentOrdersParams) other;
            return Intrinsics.areEqual(this.instrumentId, streamInstrumentOrdersParams.instrumentId) && Intrinsics.areEqual(this.accountNumber, streamInstrumentOrdersParams.accountNumber);
        }

        public int hashCode() {
            return (this.instrumentId.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "StreamInstrumentOrdersParams(instrumentId=" + this.instrumentId + ", accountNumber=" + this.accountNumber + ")";
        }

        public StreamInstrumentOrdersParams(UUID instrumentId, String accountNumber) {
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.instrumentId = instrumentId;
            this.accountNumber = accountNumber;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // java.lang.Comparable
        public int compareTo(StreamInstrumentOrdersParams other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return this.instrumentId.compareTo(other.instrumentId);
        }
    }
}
