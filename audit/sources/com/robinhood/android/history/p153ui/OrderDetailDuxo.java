package com.robinhood.android.history.p153ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.contracts.PnlHubContract2;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equities.taxlots.viewLots.ViewLotsKey;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.history.p153ui.OrderDetailDuxo;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.bonfire.OrderDetailStore;
import com.robinhood.models.api.EquityOrderState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.OrderDetail;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import equity_trading_tax_lots.proto.p460v1.OrderSummaryDetails;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TableDetails;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OrderDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$BQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0016\u0010!\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/OrderDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/OrderDetailStore;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/librobinhood/data/store/bonfire/OrderDetailStore;Lcom/robinhood/librobinhood/data/store/DocumentStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "orderId", "Ljava/util/UUID;", "getOrderId", "()Ljava/util/UUID;", "onCreate", "", "onResume", "refreshOrderDetail", "force", "", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OrderDetailDuxo extends OldBaseDuxo<OrderDetailViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DocumentStore documentStore;
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final OrderDetailStore orderDetailStore;
    private final OrderStore orderStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final TaxLotsCachedService taxLotsCachedService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailDuxo(AccountProvider accountProvider, OrderStore orderStore, OrderDetailStore orderDetailStore, DocumentStore documentStore, InstrumentStore instrumentStore, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, TaxLotsCachedService taxLotsCachedService, SavedStateHandle savedStateHandle) {
        super(new OrderDetailViewState(null, null, null, null, null, false, null, false, 255, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(orderDetailStore, "orderDetailStore");
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.orderStore = orderStore;
        this.orderDetailStore = orderDetailStore;
        this.documentStore = documentStore;
        this.instrumentStore = instrumentStore;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.taxLotsCachedService = taxLotsCachedService;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getOrderId() {
        return ((OrderDetailArgs) INSTANCE.getArgs((HasSavedState) this)).getOrderId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C184071(null));
    }

    /* compiled from: OrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.OrderDetailDuxo$onCreate$1", m3645f = "OrderDetailDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.OrderDetailDuxo$onCreate$1 */
    static final class C184071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C184071(Continuation<? super C184071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderDetailDuxo.this.new C184071(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C184071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(ExperimentsProvider.DefaultImpls.streamStateFlow$default(OrderDetailDuxo.this.experimentsStore, new Experiment[]{PnlHubContract2.INSTANCE}, false, null, 6, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderDetailDuxo.this);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OrderDetailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.history.ui.OrderDetailDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ OrderDetailDuxo this$0;

            AnonymousClass1(OrderDetailDuxo orderDetailDuxo) {
                this.this$0 = orderDetailDuxo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            public final Object emit(final boolean z, Continuation<? super Unit> continuation) {
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$onCreate$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderDetailDuxo.C184071.AnonymousClass1.emit$lambda$0(z, (OrderDetailViewState) obj);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderDetailViewState emit$lambda$0(boolean z, OrderDetailViewState applyMutation) {
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                return OrderDetailViewState.copy$default(applyMutation, null, null, null, null, null, false, null, z, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.orderStore.refresh(false, getOrderId());
        Observable<Order> observableRefCount = this.orderStore.getOrder(getOrderId()).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        final OrderDetailDuxo2 orderDetailDuxo2 = new PropertyReference1Impl() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$onResume$orderDetailObs$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((Order) obj).isIpoAccessOrder());
            }
        };
        Observable observableRefCount2 = observableRefCount.map(new Function(orderDetailDuxo2) { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(orderDetailDuxo2, "function");
                this.function = orderDetailDuxo2;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$onResume$orderDetailObs$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<OrderDetail>> apply(Boolean isIpoAccessOrder) {
                Intrinsics.checkNotNullParameter(isIpoAccessOrder, "isIpoAccessOrder");
                if (isIpoAccessOrder.booleanValue()) {
                    return ObservablesKt.toOptionals(this.this$0.orderDetailStore.getStream().asObservable(this.this$0.getOrderId()));
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        }).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount2, "refCount(...)");
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Account> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                AccountProvider.DefaultImpls.refresh$default(OrderDetailDuxo.this.accountProvider, false, 1, null);
                return OrderDetailDuxo.this.accountProvider.streamAccount(order.getAccountNumber());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$1(this.f$0, (Account) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$3(this.f$0, (Optional) obj);
            }
        });
        Observable map = observableRefCount2.map(new Function() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OrderDetail orderDetail = (OrderDetail) ((Optional) it).component1();
                return Optional3.asOptional(orderDetail != null ? orderDetail.getTradeConfirmationDocId() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OrderDetailDuxo$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map);
        final DocumentStore documentStore = this.documentStore;
        Observable observableDistinctUntilChanged = observableFilterIsPresent.switchMap(new Function() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo.onResume.5
            @Override // io.reactivex.functions.Function
            public final Observable<Document> apply(UUID p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return documentStore.getDocument(p0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$6(this.f$0, (Document) obj);
            }
        });
        ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, OrderStore.poll$default(this.orderStore, getOrderId(), null, 2, null), (LifecycleEvent) null, 1, (Object) null), null, null, null, 7, null);
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$8(this.f$0, (Order) obj);
            }
        });
        Observable<R> observableSwitchMap2 = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo.onResume.8
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(Order order) {
                Intrinsics.checkNotNullParameter(order, "order");
                return OrderDetailDuxo.this.instrumentStore.getInstrument(order.getInstrument());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$10(this.f$0, (Instrument) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$12(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C1840911(observableRefCount, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OrderDetailDuxo orderDetailDuxo, final Account account) {
        orderDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$1$lambda$0(account, (OrderDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState onResume$lambda$1$lambda$0(Account account, OrderDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderDetailViewState.copy$default(applyMutation, account, null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OrderDetailDuxo orderDetailDuxo, Optional optional) {
        final OrderDetail orderDetail = (OrderDetail) optional.component1();
        if ((orderDetail != null ? orderDetail.getOrderState() : null) == EquityOrderState.CANCELED) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_CANCELLED, false);
        }
        orderDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$3$lambda$2(orderDetail, (OrderDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState onResume$lambda$3$lambda$2(OrderDetail orderDetail, OrderDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderDetailViewState.copy$default(applyMutation, null, null, orderDetail, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(OrderDetailDuxo orderDetailDuxo, final Document document) {
        orderDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$6$lambda$5(document, (OrderDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState onResume$lambda$6$lambda$5(Document document, OrderDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderDetailViewState.copy$default(applyMutation, null, null, null, null, document, false, null, false, 239, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$8(OrderDetailDuxo orderDetailDuxo, final Order order) {
        if (!order.isIpoAccessOrder() && order.getState() == EquityOrderState.CANCELED) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.ORDER_CANCELLED, false);
        }
        orderDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$8$lambda$7(order, (OrderDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState onResume$lambda$8$lambda$7(Order order, OrderDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderDetailViewState.copy$default(applyMutation, null, order, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$10(OrderDetailDuxo orderDetailDuxo, final Instrument instrument) {
        orderDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$10$lambda$9(instrument, (OrderDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState onResume$lambda$10$lambda$9(Instrument instrument, OrderDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderDetailViewState.copy$default(applyMutation, null, null, null, instrument, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$12(OrderDetailDuxo orderDetailDuxo, final boolean z) {
        orderDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailDuxo.onResume$lambda$12$lambda$11(z, (OrderDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState onResume$lambda$12$lambda$11(boolean z, OrderDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OrderDetailViewState.copy$default(applyMutation, null, null, null, null, null, z, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    /* compiled from: OrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.OrderDetailDuxo$onResume$11", m3645f = "OrderDetailDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.history.ui.OrderDetailDuxo$onResume$11 */
    static final class C1840911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable<Order> $orderObs;
        int label;
        final /* synthetic */ OrderDetailDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1840911(Observable<Order> observable, OrderDetailDuxo orderDetailDuxo, Continuation<? super C1840911> continuation) {
            super(2, continuation);
            this.$orderObs = observable;
            this.this$0 = orderDetailDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C1840911(this.$orderObs, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1840911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(FlowKt.transformLatest(FlowKt.filterNotNull(Context7.buffer$default(RxConvert.asFlow(this.$orderObs), Integer.MAX_VALUE, null, 2, null)), new C18405xae189643(null, this.this$0)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: OrderDetailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.history.ui.OrderDetailDuxo$onResume$11$2, reason: invalid class name */
        static final class AnonymousClass2<T> implements FlowCollector {
            final /* synthetic */ OrderDetailDuxo this$0;

            AnonymousClass2(OrderDetailDuxo orderDetailDuxo) {
                this.this$0 = orderDetailDuxo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Tuples2<StreamTaxLotsSummaryResponse, Order>) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(Tuples2<StreamTaxLotsSummaryResponse, Order> tuples2, Continuation<? super Unit> continuation) {
                final StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponseComponent1 = tuples2.component1();
                final Order orderComponent2 = tuples2.component2();
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.OrderDetailDuxo$onResume$11$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OrderDetailDuxo.C1840911.AnonymousClass2.emit$lambda$0(streamTaxLotsSummaryResponseComponent1, orderComponent2, (OrderDetailViewState) obj);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final OrderDetailViewState emit$lambda$0(StreamTaxLotsSummaryResponse streamTaxLotsSummaryResponse, Order order, OrderDetailViewState applyMutation) {
                String header_title;
                String row_trailing_title;
                Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                TableDetails table_details = streamTaxLotsSummaryResponse.getTable_details();
                String str = "";
                if (table_details == null || (header_title = table_details.getHeader_title()) == null) {
                    header_title = "";
                }
                OrderSummaryDetails order_summary_details = streamTaxLotsSummaryResponse.getOrder_summary_details();
                if (order_summary_details != null && (row_trailing_title = order_summary_details.getRow_trailing_title()) != null) {
                    str = row_trailing_title;
                }
                return OrderDetailViewState.copy$default(applyMutation, null, null, null, null, null, false, new TaxLotData(header_title, str, new ViewLotsKey(order.getAccountNumber(), order.getId(), order.getInstrument())), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
        }
    }

    public final void refreshOrderDetail(UUID orderId, boolean force) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderDetailStore.refresh(orderId, force);
    }

    /* compiled from: OrderDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/OrderDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/OrderDetailDuxo;", "Lcom/robinhood/android/history/ui/OrderDetailArgs;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderDetailDuxo, OrderDetailArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderDetailArgs getArgs(SavedStateHandle savedStateHandle) {
            return (OrderDetailArgs) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderDetailArgs getArgs(OrderDetailDuxo orderDetailDuxo) {
            return (OrderDetailArgs) DuxoCompanion.DefaultImpls.getArgs(this, orderDetailDuxo);
        }
    }
}
