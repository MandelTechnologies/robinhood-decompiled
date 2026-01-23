package com.robinhood.librobinhood.data.store;

import bonfire.proto.idl.slip.p039v1.GetSlipPaymentsResponseDto;
import bonfire.proto.idl.slip.p039v1.SlipService;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.SlipGroupedPaymentDao;
import com.robinhood.models.p320db.SlipGroupedPayment;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.SlipGroupedPaymentTransaction;
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

/* compiled from: SlipGroupedPaymentStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00160\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SlipGroupedPaymentStore;", "Lcom/robinhood/store/Store;", "slipService", "Lbonfire/proto/idl/slip/v1/SlipService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "slipGroupedPaymentDao", "Lcom/robinhood/models/dao/SlipGroupedPaymentDao;", "<init>", "(Lbonfire/proto/idl/slip/v1/SlipService;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/SlipGroupedPaymentDao;)V", "getSlipGroupedPaymentDao", "()Lcom/robinhood/models/dao/SlipGroupedPaymentDao;", "getSlipPayments", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lbonfire/proto/idl/slip/v1/GetSlipPaymentsResponseDto;", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/models/db/SlipGroupedPayment;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "stream", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "id", "getStream", "()Lcom/robinhood/android/moria/db/Query;", "refresh", "force", "", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipGroupedPaymentStore extends Store {
    private final Endpoint<Unit, GetSlipPaymentsResponseDto> getSlipPayments;
    private final HistoryLoader.Callbacks<SlipGroupedPayment> historyLoaderCallbacks;
    private final SlipGroupedPaymentDao slipGroupedPaymentDao;
    private final SlipService slipService;
    private final Query<UUID, SlipGroupedPayment> stream;
    private final HistoryTransactionLoader transactionLoader;

    public final SlipGroupedPaymentDao getSlipGroupedPaymentDao() {
        return this.slipGroupedPaymentDao;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipGroupedPaymentStore(SlipService slipService, StoreBundle storeBundle, SlipGroupedPaymentDao slipGroupedPaymentDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipService, "slipService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(slipGroupedPaymentDao, "slipGroupedPaymentDao");
        this.slipService = slipService;
        this.slipGroupedPaymentDao = slipGroupedPaymentDao;
        this.getSlipPayments = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipGroupedPaymentStore2(this, null), getLogoutKillswitch(), new SlipGroupedPaymentStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.SLIP_GROUPED_PAYMENT);
                final Flow<SlipGroupedPayment> flowAsFlow = this.this$0.getStream().asFlow(reference.getSourceId());
                return new Flow<SlipGroupedPaymentTransaction>() { // from class: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C343212<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "SlipGroupedPaymentStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C343212.this.emit(null, this);
                            }
                        }

                        public C343212(FlowCollector flowCollector) {
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
                                SlipGroupedPaymentTransaction slipGroupedPaymentTransaction = new SlipGroupedPaymentTransaction((SlipGroupedPayment) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(slipGroupedPaymentTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super SlipGroupedPaymentTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new C343212(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<SlipGroupedPayment>() { // from class: com.robinhood.librobinhood.data.store.SlipGroupedPaymentStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.SLIP_GROUPED_PAYMENT);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.CUSTODIAL_UGMA, BrokerageAccountType.CUSTODIAL_UTMA, BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
                Intrinsics.checkNotNullExpressionValue(enumSetOf2, "of(...)");
                this.supportedBrokerageAccountTypes = enumSetOf2;
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
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                SlipGroupedPaymentStore slipGroupedPaymentStore = this.this$0;
                if (filter.getState() == null || filter.getState() == state) {
                    slipGroupedPaymentStore.refresh(false);
                    return FlowKt.filterNotNull(slipGroupedPaymentStore.getSlipGroupedPaymentDao().countTotal(filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                SlipGroupedPaymentStore slipGroupedPaymentStore = this.this$0;
                if (filter.getState() == null || filter.getState() == state) {
                    return FlowKt.filterNotNull(slipGroupedPaymentStore.getSlipGroupedPaymentDao().countLater(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
                }
                return FlowKt.flowOf(0);
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<SlipGroupedPayment>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                HistoryEvent.State state = HistoryEvent.State.SETTLED;
                SlipGroupedPaymentStore slipGroupedPaymentStore = this.this$0;
                List listEmptyList = CollectionsKt.emptyList();
                if (filter.getState() != null && filter.getState() != state) {
                    return FlowKt.flowOf(listEmptyList);
                }
                slipGroupedPaymentStore.refresh(false);
                return slipGroupedPaymentStore.getSlipGroupedPaymentDao().getLatest(filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<SlipGroupedPayment>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.getSlipGroupedPaymentDao().getLater(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())) : FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<SlipGroupedPayment>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.getSlipGroupedPaymentDao().get(filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())) : FlowKt.flowOf(CollectionsKt.emptyList());
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<SlipGroupedPayment>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return (filter.getState() == null || filter.getState() == HistoryEvent.State.SETTLED) ? this.this$0.getSlipGroupedPaymentDao().getEarlier(filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())) : FlowKt.flowOf(CollectionsKt.emptyList());
            }
        };
        this.stream = Store.create$default(this, Query.INSTANCE, "streamSlipGroupedPayments", CollectionsKt.emptyList(), new SlipGroupedPaymentStore5(slipGroupedPaymentDao), false, 8, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<SlipGroupedPayment> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    public final Query<UUID, SlipGroupedPayment> getStream() {
        return this.stream;
    }

    public final void refresh(boolean force) {
        Endpoint8.refresh$default(this.getSlipPayments, force, null, 2, null);
    }
}
