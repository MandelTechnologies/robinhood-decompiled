package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.crypto.gifting.CryptoGiftingApi;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.cryptogifting.ApiCryptoGift;
import com.robinhood.models.dao.CryptoGiftDao;
import com.robinhood.models.p355ui.bonfire.cryptogifting.CryptoGift;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoGiftItemTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.EnumSet;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: CryptoGiftStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoGiftStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/CryptoGiftDao;", "cryptoGiftingApi", "Lcom/robinhood/android/api/crypto/gifting/CryptoGiftingApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/CryptoGiftDao;Lcom/robinhood/android/api/crypto/gifting/CryptoGiftingApi;)V", "allCryptoGiftsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/bonfire/cryptogifting/ApiCryptoGift;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/ui/bonfire/cryptogifting/CryptoGift;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "streamCryptoGift", "Lkotlinx/coroutines/flow/Flow;", "id", "Ljava/util/UUID;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoGiftStore extends Store {
    private final PaginatedEndpoint<Unit, ApiCryptoGift> allCryptoGiftsEndpoint;
    private final CryptoGiftingApi cryptoGiftingApi;
    private final CryptoGiftDao dao;
    private final HistoryLoader.Callbacks<CryptoGift> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoGiftStore(StoreBundle storeBundle, CryptoGiftDao dao, CryptoGiftingApi cryptoGiftingApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(cryptoGiftingApi, "cryptoGiftingApi");
        this.dao = dao;
        this.cryptoGiftingApi = cryptoGiftingApi;
        this.allCryptoGiftsEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new CryptoGiftStore2(this, null), getLogoutKillswitch(), new CryptoGiftStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<CryptoGift>() { // from class: com.robinhood.librobinhood.data.store.CryptoGiftStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.CRYPTO_GIFT_ITEM);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                this.supportedBrokerageAccountTypes = SetsKt.emptySet();
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
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(0);
                }
                this.this$0.refresh(false);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(filter.getSince(), filter.getBefore()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(0);
                }
                return FlowKt.filterNotNull(this.this$0.dao.countLater(filter.getSince(), filter.getBefore(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoGift>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                this.this$0.refresh(false);
                return this.this$0.dao.getLatest(filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoGift>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.dao.getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoGift>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.dao.get(filter.getSince(), filter.getBefore(), timestamp, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoGift>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                if (filter.getState() == HistoryEvent.State.PENDING) {
                    return FlowKt.flowOf(CollectionsKt.emptyList());
                }
                return this.this$0.dao.getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoGiftStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.CRYPTO_GIFT_ITEM);
                final Flow flowStreamCryptoGift = this.this$0.streamCryptoGift(reference.getSourceId());
                return new Flow<CryptoGiftItemTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoGiftStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoGiftItemTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamCryptoGift.collect(new C337022(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoGiftStore$historyTransactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C337022<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoGiftStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoGiftStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoGiftStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C337022.this.emit(null, this);
                            }
                        }

                        public C337022(FlowCollector flowCollector) {
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
                                CryptoGiftItemTransaction cryptoGiftItemTransaction = new CryptoGiftItemTransaction((CryptoGift) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoGiftItemTransaction, anonymousClass1) == coroutine_suspended) {
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
    }

    public final HistoryLoader.Callbacks<CryptoGift> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoGift> streamCryptoGift(UUID id) {
        return takeWhileLoggedIn(Operators.mapFirstItem(this.dao.get(id)));
    }

    public final Job refresh(boolean force) {
        return PaginatedEndpointKt.refreshAllPages(this.allCryptoGiftsEndpoint, force);
    }
}
