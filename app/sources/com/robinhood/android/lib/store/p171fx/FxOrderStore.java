package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.lib.api.p164fx.FxOrderApi;
import com.robinhood.android.lib.p166fx.provider.FxOrderProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p325fx.FxOrderDao;
import com.robinhood.models.p325fx.api.ApiFxOrder;
import com.robinhood.models.p325fx.p326db.FxOrder;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.FxOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.OrderState2;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: FxOrderStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010&\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/FxOrderStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;", "api", "Lcom/robinhood/android/lib/api/fx/FxOrderApi;", "dao", "Lcom/robinhood/models/fx/FxOrderDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/api/fx/FxOrderApi;Lcom/robinhood/models/fx/FxOrderDao;Lcom/robinhood/store/StoreBundle;)V", "singleEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/fx/api/ApiFxOrder;", "listEndpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "singleQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/fx/db/FxOrder;", "pollSingleQuery", "streamSingle", "Lkotlinx/coroutines/flow/Flow;", "accountNumber", "orderId", "pollSingle", "fxOrderTransactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getFxOrderTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getFxOrder", "id", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class FxOrderStore extends Store implements FxOrderProvider {
    private final FxOrderApi api;
    private final FxOrderDao dao;
    private final HistoryTransactionLoader fxOrderTransactionLoader;
    private final HistoryLoader.Callbacks<FxOrder> historyLoaderCallbacks;
    private final PaginatedEndpoint<Unit, ApiFxOrder> listEndpoint;
    private final Query<Tuples2<String, UUID>, FxOrder> pollSingleQuery;
    private final Endpoint<Tuples2<String, UUID>, ApiFxOrder> singleEndpoint;
    private final Query<Tuples2<String, UUID>, FxOrder> singleQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxOrderStore(FxOrderApi api, FxOrderDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        Endpoint<Tuples2<String, UUID>, ApiFxOrder> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new FxOrderStore6(this, null), getLogoutKillswitch(), new FxOrderStore7(this, null), storeBundle.getClock(), null, 16, null);
        this.singleEndpoint = endpointCreate$default;
        this.listEndpoint = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new FxOrderStore4(this, null), getLogoutKillswitch(), new FxOrderStore5(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion = Query.INSTANCE;
        this.singleQuery = Store.create$default(this, companion, "streamSingleFxOrder", CollectionsKt.listOf(new RefreshEach(new FxOrderStore8(endpointCreate$default))), new Function1() { // from class: com.robinhood.android.lib.store.fx.FxOrderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FxOrderStore.singleQuery$lambda$0(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.pollSingleQuery = Store.create$default(this, companion, "pollSingleFxOrder", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.fx.FxOrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FxOrderStore.pollSingleQuery$lambda$1(this.f$0, (Tuples2) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.store.fx.FxOrderStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FxOrderStore.pollSingleQuery$lambda$2(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
        this.fxOrderTransactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.lib.store.fx.FxOrderStore$fxOrderTransactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.FX_ORDER);
                final Flow fxOrder = this.this$0.getFxOrder(reference.getSourceId());
                return new Flow<FxOrderTransaction>() { // from class: com.robinhood.android.lib.store.fx.FxOrderStore$fxOrderTransactionLoader$1$load$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super FxOrderTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = fxOrder.collect(new C205692(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.lib.store.fx.FxOrderStore$fxOrderTransactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C205692<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.lib.store.fx.FxOrderStore$fxOrderTransactionLoader$1$load$$inlined$map$1$2", m3645f = "FxOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.lib.store.fx.FxOrderStore$fxOrderTransactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C205692.this.emit(null, this);
                            }
                        }

                        public C205692(FlowCollector flowCollector) {
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
                                FxOrderTransaction fxOrderTransaction = new FxOrderTransaction((FxOrder) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(fxOrderTransaction, anonymousClass1) == coroutine_suspended) {
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
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<FxOrder>() { // from class: com.robinhood.android.lib.store.fx.FxOrderStore$historyLoaderCallbacks$1
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.FX_ORDER);
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
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages$default(this.this$0.listEndpoint, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.dao.streamNumTotal(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.streamNumLater(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FxOrder>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpointKt.refreshAllPages$default(this.this$0.listEndpoint, false, 1, null);
                return FlowKt.filterNotNull(this.this$0.dao.streamLatest(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), limit));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FxOrder>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.streamLater(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FxOrder>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.streamSingle(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<FxOrder>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.streamEarlier(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), id, limit));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singleQuery$lambda$0(FxOrderStore fxOrderStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return FlowKt.filterNotNull(fxOrderStore.dao.streamSingle((String) tuples2.component1(), (UUID) tuples2.component2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollSingleQuery$lambda$1(FxOrderStore fxOrderStore, Tuples2 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Endpoint<Tuples2<String, UUID>, ApiFxOrder> endpoint = fxOrderStore.singleEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, params, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pollSingleQuery$lambda$2(FxOrderStore fxOrderStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return FlowKt.filterNotNull(fxOrderStore.dao.streamSingle((String) tuples2.component1(), (UUID) tuples2.component2()));
    }

    @Override // com.robinhood.android.lib.p166fx.provider.FxOrderProvider
    public Flow<FxOrder> streamSingle(String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        if (accountNumber != null) {
            return this.singleQuery.asFlow(Tuples4.m3642to(accountNumber, orderId));
        }
        return getFxOrder(orderId);
    }

    @Override // com.robinhood.android.lib.p166fx.provider.FxOrderProvider
    public Flow<FxOrder> pollSingle(String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return this.pollSingleQuery.asFlow(Tuples4.m3642to(accountNumber, orderId));
    }

    public final HistoryTransactionLoader getFxOrderTransactionLoader() {
        return this.fxOrderTransactionLoader;
    }

    public final HistoryLoader.Callbacks<FxOrder> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<FxOrder> getFxOrder(UUID id) {
        return FlowKt.filterNotNull(this.dao.getFxOrderById(id));
    }
}
