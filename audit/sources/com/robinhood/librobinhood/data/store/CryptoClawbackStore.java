package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.retrofit.NummusApi;
import com.robinhood.models.api.rewards.ApiCryptoClawback;
import com.robinhood.models.api.rewards.ApiCryptoClawbackDetails;
import com.robinhood.models.crypto.dao.CryptoClawbackDao;
import com.robinhood.models.crypto.dao.CryptoClawbackDetailsDao;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.models.crypto.dao.CurrencyPairDao;
import com.robinhood.models.crypto.p314db.Currency4;
import com.robinhood.models.crypto.p314db.CurrencyPair2;
import com.robinhood.models.crypto.p314db.rewards.CryptoClawback2;
import com.robinhood.models.crypto.p314db.rewards.CryptoClawbackDetails;
import com.robinhood.models.crypto.p314db.rewards.CryptoClawbackDetails2;
import com.robinhood.models.crypto.p315ui.rewards.UiCryptoClawbackDetails;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoClawbackTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: CryptoClawbackStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u001f\u001a\u00020\u0019*\u00020\u0016H\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!2\u0006\u0010\"\u001a\u00020\u0014J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010\"\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoClawbackStore;", "Lcom/robinhood/store/Store;", "nummus", "Lcom/robinhood/models/api/retrofit/NummusApi;", "clawbackDao", "Lcom/robinhood/models/crypto/dao/CryptoClawbackDao;", "clawbackDetailsDao", "Lcom/robinhood/models/crypto/dao/CryptoClawbackDetailsDao;", "currencyDao", "Lcom/robinhood/models/crypto/dao/CurrencyDao;", "currencyPairDao", "Lcom/robinhood/models/crypto/dao/CurrencyPairDao;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/api/retrofit/NummusApi;Lcom/robinhood/models/crypto/dao/CryptoClawbackDao;Lcom/robinhood/models/crypto/dao/CryptoClawbackDetailsDao;Lcom/robinhood/models/crypto/dao/CurrencyDao;Lcom/robinhood/models/crypto/dao/CurrencyPairDao;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/rewards/ApiCryptoClawbackDetails;", "paginatedEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/crypto/db/rewards/CryptoClawbackDetails;", "uiQuery", "Lcom/robinhood/models/crypto/ui/rewards/UiCryptoClawbackDetails;", "saveToDb", "getClawback", "Lkotlinx/coroutines/flow/Flow;", "transactionId", "getUiClawback", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoClawbackStore extends Store {
    private final CryptoClawbackDao clawbackDao;
    private final CryptoClawbackDetailsDao clawbackDetailsDao;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CurrencyDao currencyDao;
    private final CurrencyPairDao currencyPairDao;
    private final Endpoint<UUID, Optional<ApiCryptoClawbackDetails>> endpoint;
    private final HistoryLoader.Callbacks<UiCryptoClawbackDetails> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;
    private final NummusApi nummus;
    private final PaginatedEndpoint<Unit, ApiCryptoClawbackDetails> paginatedEndpoint;
    private final Query<UUID, CryptoClawbackDetails> query;
    private final Query<UUID, UiCryptoClawbackDetails> uiQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoClawbackStore(NummusApi nummus2, CryptoClawbackDao clawbackDao, CryptoClawbackDetailsDao clawbackDetailsDao, CurrencyDao currencyDao, CurrencyPairDao currencyPairDao, CryptoExperimentsStore cryptoExperimentsStore, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(nummus2, "nummus");
        Intrinsics.checkNotNullParameter(clawbackDao, "clawbackDao");
        Intrinsics.checkNotNullParameter(clawbackDetailsDao, "clawbackDetailsDao");
        Intrinsics.checkNotNullParameter(currencyDao, "currencyDao");
        Intrinsics.checkNotNullParameter(currencyPairDao, "currencyPairDao");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.nummus = nummus2;
        this.clawbackDao = clawbackDao;
        this.clawbackDetailsDao = clawbackDetailsDao;
        this.currencyDao = currencyDao;
        this.currencyPairDao = currencyPairDao;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new CryptoClawbackStore2(this, null), getLogoutKillswitch(), new CryptoClawbackStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.paginatedEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new CryptoClawbackStore6(this, null), getLogoutKillswitch(), new CryptoClawbackStore7(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.query = Store.create$default(this, companion, "getCryptoClawback", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoClawbackStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoClawbackStore.query$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.uiQuery = Store.create$default(this, companion, "getCryptoClawback", CollectionsKt.listOf(new RefreshEach(new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoClawbackStore.uiQuery$lambda$2(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoClawbackStore.uiQuery$lambda$3(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.CRYPTO_CLAWBACK);
                UUID transactionId = reference.getTransactionId();
                if (transactionId == null) {
                    throw new IllegalStateException("transactionId must be set for CryptoClawback transactions");
                }
                final Flow<UiCryptoClawbackDetails> uiClawback = this.this$0.getUiClawback(transactionId);
                return new Flow<CryptoClawbackTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoClawbackTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = uiClawback.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoClawbackStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoClawbackStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoClawbackStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoClawbackStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                CryptoClawbackTransaction cryptoClawbackTransaction = new CryptoClawbackTransaction((UiCryptoClawbackDetails) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoClawbackTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiCryptoClawbackDetails>() { // from class: com.robinhood.librobinhood.data.store.CryptoClawbackStore$historyLoaderCallbacks$1
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.CRYPTO_CLAWBACK);
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes = SetsKt.emptySet();

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public EnumSet<HistoryTransactionType> getSupportedTransactionTypes() {
                return this.supportedTransactionTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return this.supportedBrokerageAccountTypes;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(0);
                }
                refreshPaginated();
                return FlowKt.filterNotNull(this.this$0.clawbackDetailsDao.countTotal(filter.getSince(), filter.getBefore(), filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.clawbackDetailsDao.countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoClawbackDetails>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                refreshPaginated();
                return this.this$0.clawbackDetailsDao.getLatest(filter.getSince(), filter.getBefore(), limit, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoClawbackDetails>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.clawbackDetailsDao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoClawbackDetails>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.clawbackDetailsDao.get(filter.getSince(), filter.getBefore(), timestamp, id, filter.getStaticAssetId());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiCryptoClawbackDetails>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() != null && filter.getState() != HistoryEvent.State.SETTLED) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.clawbackDetailsDao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.getStaticAssetId());
            }

            private final void refreshPaginated() {
                PaginatedEndpointKt.refreshAllPages(this.this$0.paginatedEndpoint, false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job query$lambda$0(CryptoClawbackStore cryptoClawbackStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(cryptoClawbackStore.endpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(CryptoClawbackStore cryptoClawbackStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoClawbackStore.clawbackDetailsDao.getClawbackDetails(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job uiQuery$lambda$2(CryptoClawbackStore cryptoClawbackStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.refresh$default(cryptoClawbackStore.endpoint, it, false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow uiQuery$lambda$3(CryptoClawbackStore cryptoClawbackStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cryptoClawbackStore.clawbackDetailsDao.getUiClawbackDetails(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveToDb(ApiCryptoClawbackDetails apiCryptoClawbackDetails) {
        this.clawbackDetailsDao.insert((CryptoClawbackDetailsDao) CryptoClawbackDetails2.toDbModel(apiCryptoClawbackDetails));
        CryptoClawbackDao cryptoClawbackDao = this.clawbackDao;
        List<ApiCryptoClawback> clawbackDetails = apiCryptoClawbackDetails.getClawbackDetails();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(clawbackDetails, 10));
        Iterator<T> it = clawbackDetails.iterator();
        while (it.hasNext()) {
            arrayList.add(CryptoClawback2.toDbModel((ApiCryptoClawback) it.next(), apiCryptoClawbackDetails.getTransactionId()));
        }
        cryptoClawbackDao.insert(arrayList);
        List<ApiCryptoClawback> clawbackDetails2 = apiCryptoClawbackDetails.getClawbackDetails();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(clawbackDetails2, 10));
        Iterator<T> it2 = clawbackDetails2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ApiCryptoClawback) it2.next()).getCurrencyPair());
        }
        for (ApiCurrencyPair apiCurrencyPair : CollectionsKt.distinct(arrayList2)) {
            this.currencyPairDao.insert((CurrencyPairDao) CurrencyPair2.toDbModel(apiCurrencyPair));
            this.currencyDao.insert((CurrencyDao) Currency4.toDbModel(apiCurrencyPair.getAssetCurrency()));
            this.currencyDao.insert((CurrencyDao) Currency4.toDbModel(apiCurrencyPair.getQuoteCurrency()));
        }
    }

    public final Flow<CryptoClawbackDetails> getClawback(UUID transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return this.query.asFlow(transactionId);
    }

    public final Flow<UiCryptoClawbackDetails> getUiClawback(UUID transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return this.uiQuery.asFlow(transactionId);
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    public final HistoryLoader.Callbacks<UiCryptoClawbackDetails> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
