package com.robinhood.android.store.options.combo;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.dao.ComboOrderDao;
import com.robinhood.android.options.combo.p206db.ComboOrder;
import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.shared.history.HistoryLoader;
import com.robinhood.shared.history.HistoryTransactionLoader;
import com.robinhood.shared.history.HistoryTransactionLoader3;
import com.robinhood.shared.models.history.ComboOrderTransaction;
import com.robinhood.shared.models.history.MinervaTransaction;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.OrderState2;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: ComboOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0!2\u0006\u0010\"\u001a\u00020\u0010J\"\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0$0!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0010J\"\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0$0!2\u0006\u0010%\u001a\u00020&2\u0006\u0010)\u001a\u00020\u0010J\u000e\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0010J\u0016\u0010/\u001a\u0002002\u0006\u0010.\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u00101R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/android/options/combo/dao/ComboOrderDao;", "optionsApi", "Lcom/robinhood/android/api/options/retrofit/OptionsApi;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/options/combo/dao/ComboOrderDao;Lcom/robinhood/android/api/options/retrofit/OptionsApi;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "getComboOrderEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/android/options/combo/api/ApiComboOrder;", "getComboOrders", "Lcom/robinhood/api/PaginatedEndpoint;", "", "transactionLoader", "Lcom/robinhood/shared/history/HistoryTransactionLoader;", "getTransactionLoader", "()Lcom/robinhood/shared/history/HistoryTransactionLoader;", "historyLoaderCallbacks", "Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "getHistoryLoaderCallbacks", "()Lcom/robinhood/shared/history/HistoryLoader$Callbacks;", "comboOrderDetailQuery", "Lcom/robinhood/android/moria/db/Query;", "streamComboOrder", "Lkotlinx/coroutines/flow/Flow;", "orderId", "streamComboOrdersByAggregatePosition", "", "accountNumber", "", "aggregateOptionPositionId", "streamComboOrdersByOptionInstrument", "optionInstrumentId", "refreshAll", "force", "", "refresh", "id", "fetchOrder", "Lcom/robinhood/android/options/combo/db/ComboOrder;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-combo-orders_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ComboOrderStore extends Store {
    private final Query<UUID, UiComboOrder> comboOrderDetailQuery;
    private final ComboOrderDao dao;
    private final Endpoint<UUID, ApiComboOrder> getComboOrderEndpoint;
    private final PaginatedEndpoint<Unit, ApiComboOrder> getComboOrders;
    private final HistoryLoader.Callbacks<UiComboOrder> historyLoaderCallbacks;
    private final InstrumentStore instrumentStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final OptionsApi optionsApi;
    private final HistoryTransactionLoader transactionLoader;

    /* compiled from: ComboOrderStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.options.combo.ComboOrderStore", m3645f = "ComboOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "fetchOrder")
    /* renamed from: com.robinhood.android.store.options.combo.ComboOrderStore$fetchOrder$1 */
    static final class C287681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C287681(Continuation<? super C287681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ComboOrderStore.this.fetchOrder(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboOrderStore(StoreBundle storeBundle, ComboOrderDao dao, OptionsApi optionsApi, OptionInstrumentStore optionInstrumentStore, InstrumentStore instrumentStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(optionsApi, "optionsApi");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.dao = dao;
        this.optionsApi = optionsApi;
        this.optionInstrumentStore = optionInstrumentStore;
        this.instrumentStore = instrumentStore;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        ComboOrderStore2 comboOrderStore2 = new ComboOrderStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        ComboOrderStore3 comboOrderStore3 = new ComboOrderStore3(this, null);
        Clock clock = storeBundle.getClock();
        ComboOrder.Companion companion2 = ComboOrder.INSTANCE;
        this.getComboOrderEndpoint = companion.create(comboOrderStore2, logoutKillswitch, comboOrderStore3, clock, new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.getComboOrders = PaginatedEndpoint.INSTANCE.create(new ComboOrderStore4(this, null), getLogoutKillswitch(), new ComboOrderStore5(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion2.getNormalStaleTimeout(), storeBundle.getClock()));
        this.transactionLoader = new HistoryTransactionLoader() { // from class: com.robinhood.android.store.options.combo.ComboOrderStore$transactionLoader$1
            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public Flow<MinervaTransaction> load(HistoryEvent historyEvent) {
                return HistoryTransactionLoader.DefaultImpls.load(this, historyEvent);
            }

            @Override // com.robinhood.shared.history.HistoryTransactionLoader
            public final Flow<MinervaTransaction> load(TransactionReference reference) {
                Intrinsics.checkNotNullParameter(reference, "reference");
                HistoryTransactionLoader3.validateEquals(reference.getSourceType(), HistoryTransactionType.COMBO_ORDER);
                this.this$0.refreshAll(false);
                final Flow<UiComboOrder> flowStreamComboOrder = this.this$0.streamComboOrder(reference.getSourceId());
                return new Flow<ComboOrderTransaction>() { // from class: com.robinhood.android.store.options.combo.ComboOrderStore$transactionLoader$1$load$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.store.options.combo.ComboOrderStore$transactionLoader$1$load$$inlined$map$1$2 */
                    public static final class C287672<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.store.options.combo.ComboOrderStore$transactionLoader$1$load$$inlined$map$1$2", m3645f = "ComboOrderStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.store.options.combo.ComboOrderStore$transactionLoader$1$load$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C287672.this.emit(null, this);
                            }
                        }

                        public C287672(FlowCollector flowCollector) {
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
                                ComboOrderTransaction comboOrderTransaction = new ComboOrderTransaction((UiComboOrder) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(comboOrderTransaction, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super ComboOrderTransaction> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamComboOrder.collect(new C287672(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        };
        this.historyLoaderCallbacks = new HistoryLoader.Callbacks<UiComboOrder>() { // from class: com.robinhood.android.store.options.combo.ComboOrderStore$historyLoaderCallbacks$1
            private final boolean isInstrumentHistoryLoader;
            private final Set<BrokerageAccountType> supportedBrokerageAccountTypes;
            private final Set<HistoryTransactionType> supportedTransactionTypes;

            {
                EnumSet enumSetOf = EnumSet.of(HistoryTransactionType.COMBO_ORDER);
                Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
                this.supportedTransactionTypes = enumSetOf;
                EnumSet enumSetOf2 = EnumSet.of(BrokerageAccountType.INDIVIDUAL, BrokerageAccountType.IRA_ROTH, BrokerageAccountType.IRA_TRADITIONAL, BrokerageAccountType.JOINT_TENANCY_WITH_ROS);
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
                this.this$0.refreshAll(false);
                return FlowKt.filterNotNull(this.this$0.dao.countTotal(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<Integer> countLater(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return FlowKt.filterNotNull(this.this$0.dao.countLater(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes())));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiComboOrder>> getLatest(HistoryLoader.Filter filter, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                this.this$0.refreshAll(false);
                return this.this$0.dao.getLatest(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiComboOrder>> getLater(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getLater(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiComboOrder>> get(HistoryLoader.Filter filter, Instant timestamp, UUID id) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.get(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }

            @Override // com.robinhood.shared.history.HistoryLoader.Callbacks
            public Flow<List<UiComboOrder>> getEarlier(HistoryLoader.Filter filter, Instant timestamp, UUID id, int limit) {
                Intrinsics.checkNotNullParameter(filter, "filter");
                Intrinsics.checkNotNullParameter(timestamp, "timestamp");
                Intrinsics.checkNotNullParameter(id, "id");
                return this.this$0.dao.getEarlier(OrderState2.getOrderStates(filter.getState()), filter.getStaticAssetId(), filter.getSince(), filter.getBefore(), timestamp, id, limit, filter.isFilteringByAccountNumber(getSupportedBrokerageAccountTypes()), filter.getSupportedAccountNumbers(getSupportedBrokerageAccountTypes()));
            }
        };
        this.comboOrderDetailQuery = Store.create$default(this, Query.INSTANCE, "comboOrderDetailQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.store.options.combo.ComboOrderStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderStore.comboOrderDetailQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.options.combo.ComboOrderStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ComboOrderStore.comboOrderDetailQuery$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
    }

    public final HistoryTransactionLoader getTransactionLoader() {
        return this.transactionLoader;
    }

    public final HistoryLoader.Callbacks<UiComboOrder> getHistoryLoaderCallbacks() {
        return this.historyLoaderCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow comboOrderDetailQuery$lambda$0(ComboOrderStore comboOrderStore, UUID request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return Endpoint.DefaultImpls.poll$default(comboOrderStore.getComboOrderEndpoint, request, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow comboOrderDetailQuery$lambda$1(ComboOrderStore comboOrderStore, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return comboOrderStore.dao.getOrder(orderId);
    }

    public final Flow<UiComboOrder> streamComboOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return FlowKt.transformWhile(this.comboOrderDetailQuery.asFlow(orderId), new C287701(null));
    }

    /* compiled from: ComboOrderStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.store.options.combo.ComboOrderStore$streamComboOrder$1", m3645f = "ComboOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.store.options.combo.ComboOrderStore$streamComboOrder$1 */
    static final class C287701 extends ContinuationImpl7 implements Function3<FlowCollector<? super UiComboOrder>, UiComboOrder, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C287701(Continuation<? super C287701> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super UiComboOrder> flowCollector, UiComboOrder uiComboOrder, Continuation<? super Boolean> continuation) {
            C287701 c287701 = new C287701(continuation);
            c287701.L$0 = flowCollector;
            c287701.L$1 = uiComboOrder;
            return c287701.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            UiComboOrder uiComboOrder;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                UiComboOrder uiComboOrder2 = (UiComboOrder) this.L$1;
                this.L$0 = uiComboOrder2;
                this.label = 1;
                if (flowCollector.emit(uiComboOrder2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiComboOrder = uiComboOrder2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uiComboOrder = (UiComboOrder) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!uiComboOrder.getComboOrder().getDerivedState().isFinal());
        }
    }

    public final Flow<List<UiComboOrder>> streamComboOrdersByAggregatePosition(String accountNumber, UUID aggregateOptionPositionId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionId, "aggregateOptionPositionId");
        return this.dao.getComboOrdersByAggregatePosition(accountNumber, aggregateOptionPositionId);
    }

    public final Flow<List<UiComboOrder>> streamComboOrdersByOptionInstrument(String accountNumber, UUID optionInstrumentId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(optionInstrumentId, "optionInstrumentId");
        return this.dao.getComboOrdersByOptionInstrument(accountNumber, optionInstrumentId);
    }

    public final void refreshAll(final boolean force) {
        Flow<PaginatedResult<ApiComboOrder>> flowFetchAllPages;
        if (force) {
            flowFetchAllPages = this.getComboOrders.forceFetchAllPages(Unit.INSTANCE);
        } else {
            flowFetchAllPages = this.getComboOrders.fetchAllPages(Unit.INSTANCE);
        }
        Completable completableFlatMapCompletable = asObservable(flowFetchAllPages).flatMapCompletable(new Function() { // from class: com.robinhood.android.store.options.combo.ComboOrderStore.refreshAll.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(PaginatedResult<ApiComboOrder> comboOrders) {
                Intrinsics.checkNotNullParameter(comboOrders, "comboOrders");
                List<ApiComboOrder> results = comboOrders.getResults();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = results.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, CollectionsKt.asSequence(((ApiComboOrder) it.next()).getLegs()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (T t : arrayList) {
                    if (((ApiComboOrder.Leg) t).getInstrument_type() == ApiComboOrder.InstrumentType.OPTION) {
                        arrayList2.add(t);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator<T> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ApiComboOrder.Leg) it2.next()).getInstrument_id());
                }
                return ComboOrderStore.this.optionInstrumentStore.pingOptionInstrumentsCompletable(arrayList3, force);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        ScopedSubscriptionKt.subscribeIn(completableFlatMapCompletable, getStoreScope());
    }

    public final void refresh(boolean force, UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Endpoint.DefaultImpls.refresh$default(this.getComboOrderEndpoint, id, force, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchOrder(UUID uuid, Continuation<? super ComboOrder> continuation) {
        C287681 c287681;
        if (continuation instanceof C287681) {
            c287681 = (C287681) continuation;
            int i = c287681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c287681.label = i - Integer.MIN_VALUE;
            } else {
                c287681 = new C287681(continuation);
            }
        }
        C287681 c2876812 = c287681;
        Object objForceFetch$default = c2876812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2876812.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objForceFetch$default);
            Endpoint<UUID, ApiComboOrder> endpoint = this.getComboOrderEndpoint;
            c2876812.label = 1;
            objForceFetch$default = Endpoint.DefaultImpls.forceFetch$default(endpoint, uuid, null, c2876812, 2, null);
            if (objForceFetch$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objForceFetch$default);
        }
        return ((ApiComboOrder) objForceFetch$default).toDbModel();
    }
}
