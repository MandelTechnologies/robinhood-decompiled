package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.psp.PspApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiEligibleProgram;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.api.bonfire.ApiPspGiftHistoryDetail;
import com.robinhood.models.api.bonfire.ApiPspGiftItem;
import com.robinhood.models.p320db.bonfire.ProgramDetail;
import com.robinhood.models.p320db.bonfire.PspGiftHistoryDetail;
import com.robinhood.models.p320db.bonfire.PspGiftHistoryDetail3;
import com.robinhood.models.p320db.bonfire.PspGiftItem;
import com.robinhood.models.p320db.bonfire.PspGiftItem2;
import com.robinhood.models.p320db.bonfire.dao.PspHistoryItemDao;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.PspGiftItemTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.http.BackendPoll;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Instant;
import retrofit2.Response;

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\"J\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0$2\u0006\u0010%\u001a\u00020\u000eJ\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0'2\u0006\u0010%\u001a\u00020\u000eJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0)2\u0006\u0010%\u001a\u00020\u000eJ\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"2\u0006\u0010%\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00020\u0012\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00180\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u000f01¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u00064"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/PspStore;", "Lcom/robinhood/store/Store;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "api", "Lcom/robinhood/android/api/psp/PspApi;", "historyItemsDao", "Lcom/robinhood/models/db/bonfire/dao/PspHistoryItemDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/api/psp/PspApi;Lcom/robinhood/models/db/bonfire/dao/PspHistoryItemDao;Lcom/robinhood/store/StoreBundle;)V", "fetchHistoryItem", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/bonfire/PspGiftItem;", "getHistory", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/models/api/bonfire/ApiPspGiftItem;", "pspGiftHistoryDetailEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/bonfire/ApiPspGiftHistoryDetail;", "eligibleProgramsEndpoint", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/bonfire/ApiEligibleProgram;", "programEnrollEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "programDetailEndpoint", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/ProgramDetail;", "stream", "Lio/reactivex/Observable;", "enrollProgram", "Lio/reactivex/Single;", "programId", "streamProgramDetail", "Lio/reactivex/Maybe;", "getHistoryItem", "Lkotlinx/coroutines/flow/Flow;", "getHistoryDetail", "Lcom/robinhood/models/db/bonfire/PspGiftHistoryDetail;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "lib-store-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class PspStore extends Store {
    private final PspApi api;
    private final Endpoint<Unit, Response<List<ApiEligibleProgram>>> eligibleProgramsEndpoint;
    private final Query<UUID, PspGiftItem> fetchHistoryItem;
    private final PaginatedEndpoint<Unit, ApiPspGiftItem> getHistory;
    private final PspHistoryItemDao historyItemsDao;
    private final HistoryLoader.Callbacks<PspGiftItem> historyLoaderCallbacks;
    private final Endpoint<UUID, Optional<ProgramDetail>> programDetailEndpoint;
    private final PostEndpoint<UUID, ApiPspEnrollmentResponse> programEnrollEndpoint;
    private final Endpoint<UUID, ApiPspGiftHistoryDetail> pspGiftHistoryDetailEndpoint;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PspStore(AccountProvider accountProvider, PspApi api, PspHistoryItemDao historyItemsDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(historyItemsDao, "historyItemsDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.historyItemsDao = historyItemsDao;
        this.fetchHistoryItem = Store.create$default(this, Query.INSTANCE, "fetchHistoryItem", CollectionsKt.emptyList(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.PspStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PspStore.fetchHistoryItem$lambda$0(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.getHistory = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new PspStore$getHistory$1(this, null), getLogoutKillswitch(), new PspStore$getHistory$2(this, null), storeBundle.getClock(), null, 16, null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.pspGiftHistoryDetailEndpoint = Endpoint.Companion.create$default(companion, new PspStore$pspGiftHistoryDetailEndpoint$1(this, null), getLogoutKillswitch(), new PspStore$pspGiftHistoryDetailEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.eligibleProgramsEndpoint = Endpoint.Companion.create$default(companion, new PspStore$eligibleProgramsEndpoint$1(accountProvider, this, null), getLogoutKillswitch(), new PspStore$eligibleProgramsEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.programEnrollEndpoint = PostEndpoint.INSTANCE.create(new PspStore$programEnrollEndpoint$1(accountProvider, this, null), new PspStore$programEnrollEndpoint$2(null));
        this.programDetailEndpoint = Endpoint.Companion.create$default(companion, new PspStore$programDetailEndpoint$1(accountProvider, this, null), getLogoutKillswitch(), new PspStore$programDetailEndpoint$2(null), storeBundle.getClock(), null, 16, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.bonfire.PspStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.PSP_GIFT_ITEM);
                final Flow<PspGiftItem> historyItem = this.this$0.getHistoryItem(reference.getSourceId());
                return new Flow<PspGiftItemTransaction>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PspStore$transactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super PspGiftItemTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = historyItem.collect(new C345322(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PspStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C345322<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "PspStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PspStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C345322.this.emit(null, this);
                            }
                        }

                        public C345322(FlowCollector flowCollector) {
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
                                PspGiftItemTransaction pspGiftItemTransaction = new PspGiftItemTransaction((PspGiftItem) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(pspGiftItemTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<PspGiftItem>() { // from class: com.robinhood.librobinhood.data.store.bonfire.PspStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final EnumSet<HistoryTransactionType> supportedTransactionTypes = EnumSet.of(HistoryTransactionType.PSP_GIFT_ITEM);

            {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.INDIVIDUAL);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf;
                this.isInstrumentHistoryLoader = true;
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
            /* renamed from: isInstrumentHistoryLoader, reason: from getter */
            public boolean getIsInstrumentHistoryLoader() {
                return this.isInstrumentHistoryLoader;
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countTotal(HistoryLoader.Filter filter) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                refreshPaginated();
                return FlowKt.filterNotNull(this.this$0.historyItemsDao.countTotal(PspGiftItem2.getPspGiftItemStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.historyItemsDao.countLater(PspGiftItem2.getPspGiftItemStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PspGiftItem>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                refreshPaginated();
                return this.this$0.historyItemsDao.getLatest(PspGiftItem2.getPspGiftItemStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PspGiftItem>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemsDao.getLater(PspGiftItem2.getPspGiftItemStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PspGiftItem>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemsDao.get(PspGiftItem2.getPspGiftItemStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<PspGiftItem>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.historyItemsDao.getEarlier(PspGiftItem2.getPspGiftItemStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit);
            }

            private final void refreshPaginated() {
                Endpoint.DefaultImpls.refresh$default(this.this$0.getHistory.getEndpoint(), Tuples4.m3642to(Unit.INSTANCE, null), false, null, 4, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fetchHistoryItem$lambda$0(PspStore pspStore, UUID programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        return pspStore.historyItemsDao.getPspGiftItems(programId);
    }

    /* compiled from: PspStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/bonfire/ApiEligibleProgram;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$stream$1", m3645f = "PspStore.kt", m3646l = {120}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PspStore$stream$1 */
    static final class C345351 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ApiEligibleProgram>>>, Object> {
        int label;

        C345351(Continuation<? super C345351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PspStore.this.new C345351(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<? extends ApiEligibleProgram>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Response<List<ApiEligibleProgram>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Response<List<ApiEligibleProgram>>> continuation) {
            return ((C345351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = PspStore.this.eligibleProgramsEndpoint;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Observable<List<ApiEligibleProgram>> stream() {
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C345351(null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        Observable<List<ApiEligibleProgram>> observableCompose = observable.compose(new BackendPoll(3600L, false, true));
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    /* compiled from: PspStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$enrollProgram$1", m3645f = "PspStore.kt", m3646l = {125}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PspStore$enrollProgram$1 */
    static final class C345331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPspEnrollmentResponse>, Object> {
        final /* synthetic */ UUID $programId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345331(UUID uuid, Continuation<? super C345331> continuation) {
            super(2, continuation);
            this.$programId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PspStore.this.new C345331(this.$programId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPspEnrollmentResponse> continuation) {
            return ((C345331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PostEndpoint postEndpoint = PspStore.this.programEnrollEndpoint;
            UUID uuid = this.$programId;
            this.label = 1;
            Object objPost$default = PostEndpoint.DefaultImpls.post$default(postEndpoint, uuid, null, this, 2, null);
            return objPost$default == coroutine_suspended ? coroutine_suspended : objPost$default;
        }
    }

    public final Single<ApiPspEnrollmentResponse> enrollProgram(UUID programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C345331(programId, null), 1, null);
    }

    /* compiled from: PspStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/ProgramDetail;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$streamProgramDetail$1", m3645f = "PspStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PspStore$streamProgramDetail$1 */
    static final class C345361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ProgramDetail>>, Object> {
        final /* synthetic */ UUID $programId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345361(UUID uuid, Continuation<? super C345361> continuation) {
            super(2, continuation);
            this.$programId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PspStore.this.new C345361(this.$programId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ProgramDetail>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<ProgramDetail>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ProgramDetail>> continuation) {
            return ((C345361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Endpoint endpoint = PspStore.this.programDetailEndpoint;
            UUID uuid = this.$programId;
            this.label = 1;
            Object objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
            return objForceFetch$default == coroutine_suspended ? coroutine_suspended : objForceFetch$default;
        }
    }

    public final Maybe<Optional<ProgramDetail>> streamProgramDetail(UUID programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C345361(programId, null), 1, null);
    }

    public final Flow<PspGiftItem> getHistoryItem(UUID programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        return this.fetchHistoryItem.asFlow(programId);
    }

    /* compiled from: PspStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/PspGiftHistoryDetail;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$getHistoryDetail$1", m3645f = "PspStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.PspStore$getHistoryDetail$1 */
    static final class C345341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PspGiftHistoryDetail>, Object> {
        final /* synthetic */ UUID $programId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C345341(UUID uuid, Continuation<? super C345341> continuation) {
            super(2, continuation);
            this.$programId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PspStore.this.new C345341(this.$programId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PspGiftHistoryDetail> continuation) {
            return ((C345341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = PspStore.this.pspGiftHistoryDetailEndpoint;
                UUID uuid = this.$programId;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return PspGiftHistoryDetail3.toDbModel((ApiPspGiftHistoryDetail) obj);
        }
    }

    public final Observable<PspGiftHistoryDetail> getHistoryDetail(UUID programId) {
        Intrinsics.checkNotNullParameter(programId, "programId");
        Observable<PspGiftHistoryDetail> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C345341(programId, null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<PspGiftItem> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
