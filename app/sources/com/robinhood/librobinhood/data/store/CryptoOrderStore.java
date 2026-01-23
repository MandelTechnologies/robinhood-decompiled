package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.retrofit.Nummus;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoOrder;
import com.robinhood.models.api.ApiCryptoOrderRequest;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.dao.CryptoOrderDao;
import com.robinhood.shared.crypto.utils.UpdatedAtGteUtil;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.OrderState2;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.util.LastUpdatedAtManager;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import com.robinhood.utils.p408rx.Poll;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import timber.log.Timber;

/* compiled from: CryptoOrderStore.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002?@BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010!\u001a\u00020\u0015H\u0002J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0$0#J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0&J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0#2\u0006\u0010(\u001a\u00020)J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0$0&J$\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0$0#2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105J\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a0&2\u0006\u00107\u001a\u00020)J\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a092\u0006\u0010:\u001a\u00020;J\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a092\u0006\u00107\u001a\u00020)J\u001a\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0>0&2\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0017\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00140-X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0$00X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CryptoOrderDao;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "nummus", "Lcom/robinhood/api/retrofit/Nummus;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CryptoOrderDao;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/api/retrofit/Nummus;Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;)V", "saveAction", "Lkotlin/Function1;", "Lcom/robinhood/models/api/ApiCryptoOrder;", "", "paginatedSaveAction", "Lcom/robinhood/models/PaginatedResult;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "refreshAll", "streamCryptoOrders", "Lkotlinx/coroutines/flow/Flow;", "", "streamMostRecentlyUpdatedCryptoOrder", "Lio/reactivex/Observable;", "streamCryptoOrder", "orderId", "Ljava/util/UUID;", "streamPendingCryptoOrders", "Lcom/robinhood/models/crypto/db/CryptoOrder;", "pendingEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore$PendingRequest;", "pendingQuery", "Lcom/robinhood/android/moria/db/Query;", "streamLatestPendingUiCryptoOrders", "count", "", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "pollWhileNonFinal", "id", "submitOrder", "Lio/reactivex/Single;", Card.Icon.ORDER, "Lcom/robinhood/models/api/ApiCryptoOrderRequest;", "fetchOrder", "cancelOrderAndPoll", "Lcom/robinhood/utils/Optional;", "PendingRequest", "Companion", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoOrderStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CurrencyPairStore currencyPairStore;
    private final CryptoOrderDao dao;
    private final HistoryLoader.Callbacks<UiCryptoOrder> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final Nummus nummus;
    private final Function1<PaginatedResult<ApiCryptoOrder>, Unit> paginatedSaveAction;
    private final PaginatedEndpoint<PendingRequest, ApiCryptoOrder> pendingEndpoint;
    private final Query<PendingRequest, List<UiCryptoOrder>> pendingQuery;
    private final Function1<ApiCryptoOrder, Unit> saveAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderStore(StoreBundle storeBundle, final CryptoOrderDao dao, CryptoAccountStore cryptoAccountStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, Nummus nummus2, CurrencyPairStore currencyPairStore) {
        super(storeBundle, CryptoOrder.INSTANCE);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        this.dao = dao;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.nummus = nummus2;
        this.currencyPairStore = currencyPairStore;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<ApiCryptoOrder, Unit>() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiCryptoOrder apiCryptoOrder) {
                m22622invoke(apiCryptoOrder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22622invoke(ApiCryptoOrder apiCryptoOrder) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(apiCryptoOrder);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        final LogoutKillswitch logoutKillswitch2 = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase2 = ((Store) this).roomDatabase;
        this.paginatedSaveAction = new Function1<PaginatedResult<? extends ApiCryptoOrder>, Unit>() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$special$$inlined$safeSave$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiCryptoOrder> paginatedResult) {
                m22623invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22623invoke(PaginatedResult<? extends ApiCryptoOrder> paginatedResult) {
                if (logoutKillswitch2.isLoggedOut()) {
                    Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
                    return;
                }
                try {
                    PaginatedResult<? extends ApiCryptoOrder> paginatedResult2 = paginatedResult;
                    if (paginatedResult2.getNext() == null) {
                        LastUpdatedAtManager.saveLastUpdatedAt$default(this.getLastUpdatedAtManager(), CryptoOrder.class, 0L, 2, null);
                    }
                    this.dao.insertPaginated(paginatedResult2);
                } catch (IllegalStateException e) {
                    if (logoutKillswitch2.isLoggedOut()) {
                        Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                        try {
                            roomDatabase2.close();
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    throw e;
                }
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiCryptoOrder>() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.CRYPTO_ORDER, HistoryTransactionType.CRYPTO_MARKET_ORDER, HistoryTransactionType.CRYPTO_LIMIT_ORDER, HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER, HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                this.supportedBrokerageAccountTypes = SetsKt.setOf((Object[]) new BrokerageAccountType[]{BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.IRA_ROTH});
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
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll();
                final Flow<Integer> flowCountTotal = this.this$0.dao.countTotal(OrderState2.getOrderStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.getStaticAssetId(), CryptoOrderStore.INSTANCE.getCryptoOrderTypes$lib_store_crypto_externalDebug(filter.getTypes()), filter.isFilteringByAccountId(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountIds(getSupportedBrokerageAccountTypes()));
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2", m3645f = "CryptoOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countTotal$$inlined$map$1$2$1, reason: invalid class name */
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountTotal.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                final Flow<Integer> flowCountLater = this.this$0.dao.countLater(OrderState2.getOrderStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), CryptoOrderStore.INSTANCE.getCryptoOrderTypes$lib_store_crypto_externalDebug(filter.getTypes()), filter.isFilteringByAccountId(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountIds(getSupportedBrokerageAccountTypes()));
                return new Flow<Integer>() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                        Object objCollect = flowCountLater.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2", m3645f = "CryptoOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyLoaderCallbacks$1$countLater$$inlined$map$1$2$1, reason: invalid class name */
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
            public Flow<List<UiCryptoOrder>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll();
                return this.this$0.dao.getLatest(OrderState2.getOrderStates(filter.getState()), filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId(), CryptoOrderStore.INSTANCE.getCryptoOrderTypes$lib_store_crypto_externalDebug(filter.getTypes()), filter.isFilteringByAccountId(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountIds(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoOrder>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(OrderState2.getOrderStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), CryptoOrderStore.INSTANCE.getCryptoOrderTypes$lib_store_crypto_externalDebug(filter.getTypes()), filter.isFilteringByAccountId(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountIds(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoOrder>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(OrderState2.getOrderStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId(), CryptoOrderStore.INSTANCE.getCryptoOrderTypes$lib_store_crypto_externalDebug(filter.getTypes()), filter.isFilteringByAccountId(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountIds(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoOrder>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(OrderState2.getOrderStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId(), CryptoOrderStore.INSTANCE.getCryptoOrderTypes$lib_store_crypto_externalDebug(filter.getTypes()), filter.isFilteringByAccountId(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountIds(getSupportedBrokerageAccountTypes()));
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.CRYPTO_ORDER, HistoryTransactionType.CRYPTO_MARKET_ORDER, HistoryTransactionType.CRYPTO_LIMIT_ORDER, HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER, HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER}));
                final Flow<UiCryptoOrder> flowStreamCryptoOrder = this.this$0.streamCryptoOrder(reference.getSourceId());
                return new Flow<CryptoOrderTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamCryptoOrder.collect(new C337292(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyTransactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C337292<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C337292.this.emit(null, this);
                            }
                        }

                        public C337292(FlowCollector flowCollector) {
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
                                CryptoOrderTransaction cryptoOrderTransaction = new CryptoOrderTransaction((UiCryptoOrder) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoOrderTransaction, anonymousClass1) == coroutine_suspended) {
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
        };
        PaginatedEndpoint<PendingRequest, ApiCryptoOrder> paginatedEndpointCreateWithParams$default = PaginatedEndpoint.Companion.createWithParams$default(PaginatedEndpoint.INSTANCE, new CryptoOrderStore4(this, null), getLogoutKillswitch(), new CryptoOrderStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.pendingEndpoint = paginatedEndpointCreateWithParams$default;
        this.pendingQuery = Store.create$default(this, Query.INSTANCE, "streamPendingOrders", CollectionsKt.listOf(new RefreshEach(new CryptoOrderStore6(paginatedEndpointCreateWithParams$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderStore.pendingQuery$lambda$3(this.f$0, (CryptoOrderStore.PendingRequest) obj);
            }
        }, false, 8, null);
    }

    public final HistoryLoader.Callbacks<UiCryptoOrder> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshAll() {
        this.cryptoAccountStore.refresh(false);
        Observable observableTake = asObservable(this.cryptoAccountStore.streamAccountOptional()).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        ScopedSubscriptionKt.subscribeIn(observableTake, getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoOrderStore.refreshAll$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshAll$lambda$2(final CryptoOrderStore cryptoOrderStore, final Optional optional) {
        if (optional instanceof Some) {
            final Instant updatedAtGte = UpdatedAtGteUtil.getUpdatedAtGte(cryptoOrderStore.dao.getLatestUpdatedAt(), cryptoOrderStore.getLastUpdatedAtManager().getLastUpdatedAt(CryptoOrder.class));
            Maybe maybeDoAfterSuccess = cryptoOrderStore.refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderStore.refreshAll$lambda$2$lambda$1(this.f$0, updatedAtGte, optional, (String) obj);
                }
            }).saveAction(cryptoOrderStore.paginatedSaveAction).force(false).toMaybe(cryptoOrderStore.getNetworkWrapper()).doAfterSuccess(new Consumer() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore$refreshAll$1$2
                @Override // io.reactivex.functions.Consumer
                public final void accept(PaginatedResult<ApiCryptoOrder> paginatedResult) {
                    this.this$0.currencyPairStore.refreshAll(false);
                }
            });
            Intrinsics.checkNotNullExpressionValue(maybeDoAfterSuccess, "doAfterSuccess(...)");
            ScopedSubscriptionKt.subscribeIn(maybeDoAfterSuccess, cryptoOrderStore.getStoreScope());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single refreshAll$lambda$2$lambda$1(CryptoOrderStore cryptoOrderStore, Instant instant, Optional optional, String str) {
        return RxFactory.DefaultImpls.rxSingle$default(cryptoOrderStore, null, new CryptoOrderStore7(cryptoOrderStore, str, instant, optional, null), 1, null);
    }

    public final Flow<List<UiCryptoOrder>> streamCryptoOrders() {
        return takeWhileLoggedIn(this.dao.getUiCryptoOrders());
    }

    public final Observable<UiCryptoOrder> streamMostRecentlyUpdatedCryptoOrder() {
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getMostRecentlyUpdatedCryptoOrder())));
    }

    public final Flow<UiCryptoOrder> streamCryptoOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getUiCryptoOrder(orderId)));
    }

    public final Observable<List<CryptoOrder>> streamPendingCryptoOrders() {
        return asObservable(takeWhileLoggedIn(this.dao.getPendingCryptoOrders()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pendingQuery$lambda$3(CryptoOrderStore cryptoOrderStore, PendingRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoOrderStore.takeWhileLoggedIn(cryptoOrderStore.dao.getLatestPendingUiCryptoOrders(it.getCurrencyPairId(), it.getCount(), it.getAccountId()));
    }

    public final Flow<List<UiCryptoOrder>> streamLatestPendingUiCryptoOrders(int count, CryptoAccountSwitcherLocation location) {
        return FlowKt.transformLatest(this.cryptoExperimentsStore.streamCryptoMibExperiment(), new C33730x5ea05804(null, location, this, count));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoOrderStore$PendingRequest;", "", "currencyPairId", "Ljava/util/UUID;", "count", "", "accountId", "<init>", "(Ljava/util/UUID;ILjava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getCount", "()I", "getAccountId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class PendingRequest {
        private final UUID accountId;
        private final int count;
        private final UUID currencyPairId;

        public static /* synthetic */ PendingRequest copy$default(PendingRequest pendingRequest, UUID uuid, int i, UUID uuid2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                uuid = pendingRequest.currencyPairId;
            }
            if ((i2 & 2) != 0) {
                i = pendingRequest.count;
            }
            if ((i2 & 4) != 0) {
                uuid2 = pendingRequest.accountId;
            }
            return pendingRequest.copy(uuid, i, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getAccountId() {
            return this.accountId;
        }

        public final PendingRequest copy(UUID currencyPairId, int count, UUID accountId) {
            return new PendingRequest(currencyPairId, count, accountId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingRequest)) {
                return false;
            }
            PendingRequest pendingRequest = (PendingRequest) other;
            return Intrinsics.areEqual(this.currencyPairId, pendingRequest.currencyPairId) && this.count == pendingRequest.count && Intrinsics.areEqual(this.accountId, pendingRequest.accountId);
        }

        public int hashCode() {
            UUID uuid = this.currencyPairId;
            int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + Integer.hashCode(this.count)) * 31;
            UUID uuid2 = this.accountId;
            return iHashCode + (uuid2 != null ? uuid2.hashCode() : 0);
        }

        public String toString() {
            return "PendingRequest(currencyPairId=" + this.currencyPairId + ", count=" + this.count + ", accountId=" + this.accountId + ")";
        }

        public PendingRequest(UUID uuid, int i, UUID uuid2) {
            this.currencyPairId = uuid;
            this.count = i;
            this.accountId = uuid2;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final int getCount() {
            return this.count;
        }

        public final UUID getAccountId() {
            return this.accountId;
        }
    }

    /* compiled from: CryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$pollWhileNonFinal$1", m3645f = "CryptoOrderStore.kt", m3646l = {330}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$pollWhileNonFinal$1 */
    static final class C337361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoOrder>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337361(UUID uuid, Continuation<? super C337361> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderStore.this.new C337361(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoOrder> continuation) {
            return ((C337361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Nummus nummus2 = CryptoOrderStore.this.nummus;
            UUID uuid = this.$id;
            this.label = 1;
            Object objFetchOrder = nummus2.fetchOrder(uuid, this);
            return objFetchOrder == coroutine_suspended ? coroutine_suspended : objFetchOrder;
        }
    }

    public final Observable<UiCryptoOrder> pollWhileNonFinal(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable observableFlatMapObservable = refresh(RxFactory.DefaultImpls.rxSingle$default(this, null, new C337361(id, null), 1, null)).saveAction(this.saveAction).key(id).force(true).toMaybe(getNetworkWrapper()).flatMapObservable(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore.pollWhileNonFinal.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UiCryptoOrder> apply(ApiCryptoOrder apiOrder) {
                Intrinsics.checkNotNullParameter(apiOrder, "apiOrder");
                CryptoOrderStore cryptoOrderStore = CryptoOrderStore.this;
                return cryptoOrderStore.asObservable(cryptoOrderStore.streamCryptoOrder(apiOrder.getId())).take(1L);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        Observable observableCompose = observableFlatMapObservable.compose(new Poll(1L, TimeUnit.SECONDS, false));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        Observable<UiCryptoOrder> observableTakeUntil = observableCompose.takeUntil((Predicate) new Predicate() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore.pollWhileNonFinal.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(UiCryptoOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getCryptoOrder().isFinal();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    /* compiled from: CryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$submitOrder$1", m3645f = "CryptoOrderStore.kt", m3646l = {342}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$submitOrder$1 */
    static final class C337391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoOrder>, Object> {
        final /* synthetic */ ApiCryptoOrderRequest $order;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337391(ApiCryptoOrderRequest apiCryptoOrderRequest, Continuation<? super C337391> continuation) {
            super(2, continuation);
            this.$order = apiCryptoOrderRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderStore.this.new C337391(this.$order, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoOrder> continuation) {
            return ((C337391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Nummus nummus2 = CryptoOrderStore.this.nummus;
            ApiCryptoOrderRequest apiCryptoOrderRequest = this.$order;
            this.label = 1;
            Object objSubmitOrder = nummus2.submitOrder(apiCryptoOrderRequest, this);
            return objSubmitOrder == coroutine_suspended ? coroutine_suspended : objSubmitOrder;
        }
    }

    public final Single<UiCryptoOrder> submitOrder(ApiCryptoOrderRequest order) {
        Intrinsics.checkNotNullParameter(order, "order");
        Single<UiCryptoOrder> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C337391(order, null), 1, null).doAfterSuccess(new CryptoOrderStore9(this.saveAction)).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore.submitOrder.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends UiCryptoOrder> apply(ApiCryptoOrder apiOrder) {
                Intrinsics.checkNotNullParameter(apiOrder, "apiOrder");
                CryptoOrderStore cryptoOrderStore = CryptoOrderStore.this;
                return cryptoOrderStore.asObservable(FlowKt.filterNotNull(cryptoOrderStore.dao.getUiCryptoOrder(apiOrder.getId()))).firstOrError();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: CryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoOrder;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$fetchOrder$1", m3645f = "CryptoOrderStore.kt", m3646l = {352}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$fetchOrder$1 */
    static final class C337341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiCryptoOrder>, Object> {
        final /* synthetic */ UUID $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337341(UUID uuid, Continuation<? super C337341> continuation) {
            super(2, continuation);
            this.$id = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderStore.this.new C337341(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiCryptoOrder> continuation) {
            return ((C337341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Nummus nummus2 = CryptoOrderStore.this.nummus;
            UUID uuid = this.$id;
            this.label = 1;
            Object objFetchOrder = nummus2.fetchOrder(uuid, this);
            return objFetchOrder == coroutine_suspended ? coroutine_suspended : objFetchOrder;
        }
    }

    public final Single<UiCryptoOrder> fetchOrder(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Single<UiCryptoOrder> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C337341(id, null), 1, null).doOnSuccess(new CryptoOrderStore9(this.saveAction)).flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore.fetchOrder.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends UiCryptoOrder> apply(ApiCryptoOrder apiOrder) {
                Intrinsics.checkNotNullParameter(apiOrder, "apiOrder");
                CryptoOrderStore cryptoOrderStore = CryptoOrderStore.this;
                return cryptoOrderStore.asObservable(FlowKt.filterNotNull(cryptoOrderStore.dao.getUiCryptoOrder(apiOrder.getId()))).firstOrError();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: CryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$cancelOrderAndPoll$1", m3645f = "CryptoOrderStore.kt", m3646l = {362}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$cancelOrderAndPoll$1 */
    static final class C337321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C337321(UUID uuid, Continuation<? super C337321> continuation) {
            super(2, continuation);
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderStore.this.new C337321(this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C337321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Nummus nummus2 = CryptoOrderStore.this.nummus;
                UUID uuid = this.$orderId;
                this.label = 1;
                if (nummus2.cancelOrder(uuid, this) == coroutine_suspended) {
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

    public final Observable<Optional<UiCryptoOrder>> cancelOrderAndPoll(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Observable<Optional<UiCryptoOrder>> observableSubscribeOn = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C337321(orderId, null), 1, null).andThen(pollWhileNonFinal(orderId).take(5L, TimeUnit.SECONDS).takeLast(1).map(new Function() { // from class: com.robinhood.librobinhood.data.store.CryptoOrderStore.cancelOrderAndPoll.2
            @Override // io.reactivex.functions.Function
            public final Optional<UiCryptoOrder> apply(UiCryptoOrder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.INSTANCE.m2972of(it);
            }
        })).defaultIfEmpty(Optional2.INSTANCE).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "subscribeOn(...)");
        return observableSubscribeOn;
    }

    /* compiled from: CryptoOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\b0\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoOrderStore$Companion;", "", "<init>", "()V", "cryptoOrderTypes", "", "Lcom/robinhood/models/api/CryptoOrderType;", "Ljava/util/EnumSet;", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "getCryptoOrderTypes$lib_store_crypto_externalDebug$annotations", "(Ljava/util/EnumSet;)V", "getCryptoOrderTypes$lib_store_crypto_externalDebug", "(Ljava/util/EnumSet;)Ljava/util/Set;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: CryptoOrderStore.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HistoryTransactionType.values().length];
                try {
                    iArr[HistoryTransactionType.CRYPTO_MARKET_ORDER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_LIMIT_ORDER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_STOP_LOSS_ORDER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_STOP_LIMIT_ORDER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HistoryTransactionType.CRYPTO_ORDER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCryptoOrderTypes$lib_store_crypto_externalDebug$annotations(EnumSet enumSet) {
        }

        private Companion() {
        }

        public final Set<CryptoOrderType> getCryptoOrderTypes$lib_store_crypto_externalDebug(EnumSet<HistoryTransactionType> enumSet) {
            Intrinsics.checkNotNullParameter(enumSet, "<this>");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (HistoryTransactionType historyTransactionType : enumSet) {
                int i = historyTransactionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[historyTransactionType.ordinal()];
                if (i == 1) {
                    linkedHashSet.add(CryptoOrderType.MARKET);
                } else if (i == 2) {
                    linkedHashSet.add(CryptoOrderType.LIMIT);
                } else if (i == 3) {
                    linkedHashSet.add(CryptoOrderType.STOP_LOSS);
                } else if (i == 4) {
                    linkedHashSet.add(CryptoOrderType.STOP_LIMIT);
                } else if (i == 5) {
                    linkedHashSet.addAll(SetsKt.setOf((Object[]) new CryptoOrderType[]{CryptoOrderType.MARKET, CryptoOrderType.LIMIT, CryptoOrderType.STOP_LOSS, CryptoOrderType.STOP_LIMIT}));
                }
            }
            return linkedHashSet;
        }
    }
}
