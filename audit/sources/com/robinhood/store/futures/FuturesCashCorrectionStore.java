package com.robinhood.store.futures;

import com.robinhood.android.models.futures.api.order.FuturesContractType;
import com.robinhood.android.models.futures.dao.FuturesCashCorrectionDao;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection2;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.ListManualCashCorrectionsResponseDto;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.FuturesCashCorrectionTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.futures.FuturesCashCorrectionStore6;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;

/* compiled from: FuturesCashCorrectionStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/store/futures/FuturesCashCorrectionStore;", "Lcom/robinhood/store/Store;", "ceres", "Lcom/robinhood/ceres/v1/Ceres;", "cashCorrectionDao", "Lcom/robinhood/android/models/futures/dao/FuturesCashCorrectionDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/ceres/v1/Ceres;Lcom/robinhood/android/models/futures/dao/FuturesCashCorrectionDao;Lcom/robinhood/store/StoreBundle;)V", "getCashCorrectionsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/ceres/v1/ListManualCashCorrectionsResponseDto;", "getCashCorrectionQuery", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/futures/db/FuturesCashCorrection;", "streamCashCorrection", "Lkotlinx/coroutines/flow/Flow;", "id", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "historyTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getHistoryTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesCashCorrectionStore extends Store {
    private final FuturesCashCorrectionDao cashCorrectionDao;
    private final Ceres ceres;
    private final Query<UUID, FuturesCashCorrection> getCashCorrectionQuery;
    private final Endpoint<Unit, ListManualCashCorrectionsResponseDto> getCashCorrectionsEndpoint;
    private final HistoryLoader.Callbacks<FuturesCashCorrection> historyLoaderCallbacks;
    private final HistoryTransactionLoader historyTransactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesCashCorrectionStore(Ceres ceres, FuturesCashCorrectionDao cashCorrectionDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(ceres, "ceres");
        Intrinsics.checkNotNullParameter(cashCorrectionDao, "cashCorrectionDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.ceres = ceres;
        this.cashCorrectionDao = cashCorrectionDao;
        this.getCashCorrectionsEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new FuturesCashCorrectionStore3(this, null), getLogoutKillswitch(), new FuturesCashCorrectionStore4(this, null), storeBundle.getClock(), null, 16, null);
        this.getCashCorrectionQuery = Store.create$default(this, Query.INSTANCE, "getCashCorrection", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.store.futures.FuturesCashCorrectionStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesCashCorrectionStore.getCashCorrectionQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new FuturesCashCorrectionStore2(cashCorrectionDao), false, 8, null);
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<FuturesCashCorrection>() { // from class: com.robinhood.store.futures.FuturesCashCorrectionStore$historyLoaderCallbacks$1

            /* compiled from: FuturesCashCorrectionStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$historyLoaderCallbacks$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HistoryTransactionType.values().length];
                    try {
                        iArr[HistoryTransactionType.EVENT_CASH_CORRECTION.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HistoryTransactionType.FUTURES_CASH_CORRECTION.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            /* renamed from: isInstrumentHistoryLoader */
            public boolean getIsInstrumentHistoryLoader() {
                return HistoryLoader.Callbacks.DefaultImpls.isInstrumentHistoryLoader(this);
            }

            private final FuturesContractType getContractType(HistoryLoader.Filter filter) {
                HistoryTransactionType historyTransactionType = (HistoryTransactionType) CollectionsKt.singleOrNull(filter.getTypes());
                if (historyTransactionType == null) {
                    return null;
                }
                int i = WhenMappings.$EnumSwitchMapping$0[historyTransactionType.ordinal()];
                if (i == 1) {
                    return FuturesContractType.EVENTS;
                }
                if (i != 2) {
                    return null;
                }
                return FuturesContractType.OUTRIGHTS;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<HistoryTransactionType> getSupportedTransactionTypes() {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.EVENT_CASH_CORRECTION, HistoryTransactionType.FUTURES_CASH_CORRECTION);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                return enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Set<BrokerageAccountType> getSupportedBrokerageAccountTypes() {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                return enumSetOf;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Endpoint8.refresh$default(this.this$0.getCashCorrectionsEndpoint, false, null, 2, null);
                FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
                Set<FuturesCashCorrection.Status> futuresCashCorrectionStatuses = FuturesCashCorrection2.getFuturesCashCorrectionStatuses(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                UUID futuresSubAccountId = staticFilter != null ? staticFilter.getFuturesSubAccountId() : null;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                return FlowKt.filterNotNull(futuresCashCorrectionDao.countTotal(futuresCashCorrectionStatuses, since, before, futuresSubAccountId, staticFilter2 != null ? staticFilter2.getSwapsSubAccountId() : null, getContractType(filter)));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
                Set<FuturesCashCorrection.Status> futuresCashCorrectionStatuses = FuturesCashCorrection2.getFuturesCashCorrectionStatuses(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                UUID futuresSubAccountId = staticFilter != null ? staticFilter.getFuturesSubAccountId() : null;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                return FlowKt.filterNotNull(futuresCashCorrectionDao.countLater(futuresCashCorrectionStatuses, since, before, timestamp, futuresSubAccountId, staticFilter2 != null ? staticFilter2.getSwapsSubAccountId() : null, id, getContractType(filter)));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashCorrection>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Endpoint8.refresh$default(this.this$0.getCashCorrectionsEndpoint, false, null, 2, null);
                FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
                Set<FuturesCashCorrection.Status> futuresCashCorrectionStatuses = FuturesCashCorrection2.getFuturesCashCorrectionStatuses(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                UUID futuresSubAccountId = staticFilter != null ? staticFilter.getFuturesSubAccountId() : null;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                return futuresCashCorrectionDao.getLatest(futuresCashCorrectionStatuses, since, before, futuresSubAccountId, staticFilter2 != null ? staticFilter2.getSwapsSubAccountId() : null, limit, getContractType(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashCorrection>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
                Set<FuturesCashCorrection.Status> futuresCashCorrectionStatuses = FuturesCashCorrection2.getFuturesCashCorrectionStatuses(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                UUID futuresSubAccountId = staticFilter != null ? staticFilter.getFuturesSubAccountId() : null;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                return futuresCashCorrectionDao.getLater(futuresCashCorrectionStatuses, since, before, timestamp, futuresSubAccountId, staticFilter2 != null ? staticFilter2.getSwapsSubAccountId() : null, id, limit, getContractType(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashCorrection>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
                Set<FuturesCashCorrection.Status> futuresCashCorrectionStatuses = FuturesCashCorrection2.getFuturesCashCorrectionStatuses(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                UUID futuresSubAccountId = staticFilter != null ? staticFilter.getFuturesSubAccountId() : null;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                return futuresCashCorrectionDao.get(futuresCashCorrectionStatuses, since, before, timestamp, futuresSubAccountId, staticFilter2 != null ? staticFilter2.getSwapsSubAccountId() : null, id, getContractType(filter));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FuturesCashCorrection>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                FuturesCashCorrectionDao futuresCashCorrectionDao = this.this$0.cashCorrectionDao;
                Set<FuturesCashCorrection.Status> futuresCashCorrectionStatuses = FuturesCashCorrection2.getFuturesCashCorrectionStatuses(filter.getState());
                Instant since = filter.getSince();
                Instant before = filter.getBefore();
                HistoryStaticFilter staticFilter = filter.getStaticFilter();
                UUID futuresSubAccountId = staticFilter != null ? staticFilter.getFuturesSubAccountId() : null;
                HistoryStaticFilter staticFilter2 = filter.getStaticFilter();
                return futuresCashCorrectionDao.getEarlier(futuresCashCorrectionStatuses, since, before, timestamp, futuresSubAccountId, staticFilter2 != null ? staticFilter2.getSwapsSubAccountId() : null, id, limit, getContractType(filter));
            }
        };
        this.historyTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.store.futures.FuturesCashCorrectionStore$historyTransactionLoader$1

            /* compiled from: FuturesCashCorrectionStore.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$historyTransactionLoader$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FuturesContractType.values().length];
                    try {
                        iArr[FuturesContractType.OUTRIGHTS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[FuturesContractType.OPTIONS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[FuturesContractType.EVENTS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateOneOf(reference.getSourceType(), SetsKt.setOf((Object[]) new HistoryTransactionType[]{HistoryTransactionType.FUTURES_CASH_CORRECTION, HistoryTransactionType.EVENT_CASH_CORRECTION}));
                final Flow flowAsFlow = this.this$0.getCashCorrectionQuery.asFlow(reference.getSourceId());
                return new Flow<FuturesCashCorrectionTransaction>() { // from class: com.robinhood.store.futures.FuturesCashCorrectionStore$historyTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super FuturesCashCorrectionTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$historyTransactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesCashCorrectionStore$historyTransactionLoader$1$load$$inlined$map$1$2", m3645f = "FuturesCashCorrectionStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$historyTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                            MinervaTransaction outrights;
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
                                FuturesCashCorrection futuresCashCorrection = (FuturesCashCorrection) obj;
                                int i3 = FuturesCashCorrectionStore6.WhenMappings.$EnumSwitchMapping$0[futuresCashCorrection.getContractType().ordinal()];
                                if (i3 == 1) {
                                    outrights = new FuturesCashCorrectionTransaction.Outrights(futuresCashCorrection);
                                } else {
                                    if (i3 == 2) {
                                        throw new IllegalStateException("OOFs are not supported in this build");
                                    }
                                    if (i3 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    outrights = new FuturesCashCorrectionTransaction.Events(futuresCashCorrection);
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(outrights, anonymousClass1) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow getCashCorrectionQuery$lambda$0(FuturesCashCorrectionStore futuresCashCorrectionStore, UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint8.poll$default(futuresCashCorrectionStore.getCashCorrectionsEndpoint, null, null, 3, null);
    }

    public final Flow<FuturesCashCorrection> streamCashCorrection(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return FlowKt.distinctUntilChanged(this.getCashCorrectionQuery.asFlow(id));
    }

    public final HistoryLoader.Callbacks<FuturesCashCorrection> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final HistoryTransactionLoader getHistoryTransactionLoader() {
        return this.historyTransactionLoader;
    }
}
