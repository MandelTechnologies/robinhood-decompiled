package com.robinhood.librobinhood.data.store;

import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationResultDto;
import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoService;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.crypto.dao.CryptoMigrationResultDao;
import com.robinhood.models.crypto.p314db.CryptoMigrationResult;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.CryptoAcatsTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: CryptoAcatsStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoAcatsStore;", "Lcom/robinhood/store/Store;", "cryptoService", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;", "cryptoMigrationResultDao", "Lcom/robinhood/models/crypto/dao/CryptoMigrationResultDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoService;Lcom/robinhood/models/crypto/dao/CryptoMigrationResultDao;Lcom/robinhood/store/StoreBundle;)V", "cryptoMigrationsEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResultDto;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/crypto/db/CryptoMigrationResult;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class CryptoAcatsStore extends Store {
    private final CryptoMigrationResultDao cryptoMigrationResultDao;
    private final PaginatedEndpoint<Unit, CryptoMigrationResultDto> cryptoMigrationsEndpoint;
    private final CryptoService cryptoService;
    private final HistoryLoader.Callbacks<CryptoMigrationResult> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAcatsStore(CryptoService cryptoService, CryptoMigrationResultDao cryptoMigrationResultDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cryptoService, "cryptoService");
        Intrinsics.checkNotNullParameter(cryptoMigrationResultDao, "cryptoMigrationResultDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cryptoService = cryptoService;
        this.cryptoMigrationResultDao = cryptoMigrationResultDao;
        this.cryptoMigrationsEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new CryptoAcatsStore2(this, null), getLogoutKillswitch(), new CryptoAcatsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<CryptoMigrationResult>() { // from class: com.robinhood.librobinhood.data.store.CryptoAcatsStore$historyLoaderCallbacks$1
            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public boolean isInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                return SetsKt.setOf(HistoryTransactionType.CRYPTO_ACATS_TRANSFER);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                return SetsKt.setOf(BrokerageAccountType.INDIVIDUAL);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.cryptoMigrationsEndpoint, Unit.INSTANCE, false, 2, null);
                return FlowKt.filterNotNull(this.this$0.cryptoMigrationResultDao.countTotal(CryptoMigrationResult.INSTANCE.getCryptoMigrationStates(filter.getState()), filter.getSince(), filter.getBefore()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.cryptoMigrationResultDao.countLater(CryptoMigrationResult.INSTANCE.getCryptoMigrationStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoMigrationResult>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.cryptoMigrationsEndpoint, Unit.INSTANCE, false, 2, null);
                return this.this$0.cryptoMigrationResultDao.getLatest(CryptoMigrationResult.INSTANCE.getCryptoMigrationStates(filter.getState()), filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoMigrationResult>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.cryptoMigrationResultDao.getLater(CryptoMigrationResult.INSTANCE.getCryptoMigrationStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoMigrationResult>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.cryptoMigrationResultDao.get(CryptoMigrationResult.INSTANCE.getCryptoMigrationStates(filter.getState()), filter.getSince(), filter.getBefore(), id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<CryptoMigrationResult>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.cryptoMigrationResultDao.getEarlier(CryptoMigrationResult.INSTANCE.getCryptoMigrationStates(filter.getState()), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.CryptoAcatsStore$historyTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf(HistoryTransactionType.CRYPTO_ACATS_TRANSFER));
                final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.cryptoMigrationResultDao.getWithId(reference.getSourceId()));
                return new Flow<CryptoAcatsTransaction>() { // from class: com.robinhood.librobinhood.data.store.CryptoAcatsStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoAcatsTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowFilterNotNull.collect(new C336522(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.CryptoAcatsStore$historyTransactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C336522<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoAcatsStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "CryptoAcatsStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.CryptoAcatsStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C336522.this.emit(null, this);
                            }
                        }

                        public C336522(FlowCollector flowCollector) {
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
                                CryptoAcatsTransaction cryptoAcatsTransaction = new CryptoAcatsTransaction((CryptoMigrationResult) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(cryptoAcatsTransaction, anonymousClass1) == coroutine_suspended) {
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

    public final HistoryLoader.Callbacks<CryptoMigrationResult> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }
}
