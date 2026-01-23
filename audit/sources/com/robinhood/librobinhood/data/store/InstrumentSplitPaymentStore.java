package com.robinhood.librobinhood.data.store;

import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiInstrumentSplitPayment;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.InstrumentSplitPaymentDao;
import com.robinhood.models.p320db.InstrumentSplit;
import com.robinhood.models.p320db.InstrumentSplitPayment2;
import com.robinhood.models.p355ui.UiInstrumentSplitPayment;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.InstrumentSplitPaymentTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.EnumSet;
import java.util.LinkedHashSet;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: InstrumentSplitPaymentStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eJ$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\u0019*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001a0\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\u00020\u0015*\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InstrumentSplitPaymentStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InstrumentSplitPaymentDao;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InstrumentSplitPaymentDao;Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "getSplitPayments", "Lcom/robinhood/api/PaginatedEndpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/ApiInstrumentSplitPayment;", "streamInstrumentSplitPayment", "Lio/reactivex/Observable;", "Lcom/robinhood/models/ui/UiInstrumentSplitPayment;", "id", "missingInstrumentDetails", "", "getMissingInstrumentDetails", "(Lcom/robinhood/models/ui/UiInstrumentSplitPayment;)Z", "refreshMissingInstruments", "Lkotlinx/coroutines/flow/Flow;", "", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Companion", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InstrumentSplitPaymentStore extends Store {
    private static final Void ALL_INSTRUMENTS = null;
    private final Brokeback brokeback;
    private final InstrumentSplitPaymentDao dao;
    private final PaginatedEndpoint<UUID, ApiInstrumentSplitPayment> getSplitPayments;
    private final HistoryLoader.Callbacks<UiInstrumentSplitPayment> historyLoaderCallbacks;
    private final InstrumentStore instrumentStore;
    private final HistoryTransactionLoader transactionLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSplitPaymentStore(StoreBundle storeBundle, InstrumentSplitPaymentDao dao, Brokeback brokeback, InstrumentStore instrumentStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.dao = dao;
        this.brokeback = brokeback;
        this.instrumentStore = instrumentStore;
        this.getSplitPayments = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new InstrumentSplitPaymentStore2(this, null), getLogoutKillswitch(), new InstrumentSplitPaymentStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.streamInstrumentSplitPayment(reference.getSourceId())), Integer.MAX_VALUE, null, 2, null);
                return new Flow<InstrumentSplitPaymentTransaction>() { // from class: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$transactionLoader$1$load$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "InstrumentSplitPaymentStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                InstrumentSplitPaymentTransaction instrumentSplitPaymentTransaction = new InstrumentSplitPaymentTransaction((UiInstrumentSplitPayment) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(instrumentSplitPaymentTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super InstrumentSplitPaymentTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiInstrumentSplitPayment>() { // from class: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes = SetsKt.setOf(HistoryTransactionType.INSTRUMENT_SPLIT_PAYMENT);

            {
                EnumSet enumSetOf = EnumSet.of(BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf;
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
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.getSplitPayments, InstrumentSplitPaymentStore.ALL_INSTRUMENTS, false, 2, null);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(InstrumentSplitPayment2.getInstrumentSplitStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getStaticAssetId()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(InstrumentSplitPayment2.getInstrumentSplitStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getStaticAssetId(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInstrumentSplitPayment>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.this$0.getSplitPayments, InstrumentSplitPaymentStore.ALL_INSTRUMENTS, false, 2, null);
                InstrumentSplitPaymentStore instrumentSplitPaymentStore = this.this$0;
                return instrumentSplitPaymentStore.refreshMissingInstruments(instrumentSplitPaymentStore.dao.getLatest(InstrumentSplitPayment2.getInstrumentSplitStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getStaticAssetId(), limit));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInstrumentSplitPayment>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                InstrumentSplitPaymentStore instrumentSplitPaymentStore = this.this$0;
                return instrumentSplitPaymentStore.refreshMissingInstruments(instrumentSplitPaymentStore.dao.getLater(InstrumentSplitPayment2.getInstrumentSplitStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getStaticAssetId(), timestamp, id, limit));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInstrumentSplitPayment>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                InstrumentSplitPaymentStore instrumentSplitPaymentStore = this.this$0;
                return instrumentSplitPaymentStore.refreshMissingInstruments(instrumentSplitPaymentStore.dao.get(InstrumentSplitPayment2.getInstrumentSplitStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getStaticAssetId(), timestamp, id));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiInstrumentSplitPayment>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                InstrumentSplitPaymentStore instrumentSplitPaymentStore = this.this$0;
                return instrumentSplitPaymentStore.refreshMissingInstruments(instrumentSplitPaymentStore.dao.getEarlier(InstrumentSplitPayment2.getInstrumentSplitStates(filter.getState()), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()), filter.getStaticAssetId(), timestamp, id, limit));
            }
        };
    }

    public final Observable<UiInstrumentSplitPayment> streamInstrumentSplitPayment(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.getInstrumentSplitPaymentById(id))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getMissingInstrumentDetails(UiInstrumentSplitPayment uiInstrumentSplitPayment) {
        return uiInstrumentSplitPayment.getInstrumentSymbol() == null && uiInstrumentSplitPayment.getInstrumentName() == null && uiInstrumentSplitPayment.getInstrumentSimpleName() == null;
    }

    /* compiled from: InstrumentSplitPaymentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "splitPayments", "", "Lcom/robinhood/models/ui/UiInstrumentSplitPayment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$refreshMissingInstruments$1", m3645f = "InstrumentSplitPaymentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.librobinhood.data.store.InstrumentSplitPaymentStore$refreshMissingInstruments$1 */
    static final class C339081 extends ContinuationImpl7 implements Function2<List<? extends UiInstrumentSplitPayment>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C339081(Continuation<? super C339081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C339081 c339081 = InstrumentSplitPaymentStore.this.new C339081(continuation);
            c339081.L$0 = obj;
            return c339081;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends UiInstrumentSplitPayment> list, Continuation<? super Unit> continuation) {
            return invoke2((List<UiInstrumentSplitPayment>) list, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<UiInstrumentSplitPayment> list, Continuation<? super Unit> continuation) {
            return ((C339081) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<UiInstrumentSplitPayment> list = (List) this.L$0;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            InstrumentSplitPaymentStore instrumentSplitPaymentStore = InstrumentSplitPaymentStore.this;
            for (UiInstrumentSplitPayment uiInstrumentSplitPayment : list) {
                if (instrumentSplitPaymentStore.getMissingInstrumentDetails(uiInstrumentSplitPayment)) {
                    InstrumentSplit split = uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit();
                    linkedHashSet.add(split.getOldInstrumentId());
                    linkedHashSet.add(split.getNewInstrumentId());
                }
            }
            if (!linkedHashSet.isEmpty()) {
                InstrumentSplitPaymentStore.this.instrumentStore.pingInstruments(linkedHashSet);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<List<UiInstrumentSplitPayment>> refreshMissingInstruments(Flow<? extends List<UiInstrumentSplitPayment>> flow) {
        return FlowKt.onEach(flow, new C339081(null));
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<UiInstrumentSplitPayment> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }
}
