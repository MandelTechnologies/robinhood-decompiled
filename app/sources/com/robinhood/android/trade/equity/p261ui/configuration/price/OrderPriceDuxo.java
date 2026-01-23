package com.robinhood.android.trade.equity.p261ui.configuration.price;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragment;
import com.robinhood.android.trade.equity.p261ui.configuration.price.OrderPriceFragmentEvent;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceContext;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.OrderPriceFailureResolver;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Quote;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OrderPriceDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001(BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0010\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u001a\u0010\u001e\u001a\u00020\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 J\u0014\u0010#\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0%J\u0006\u0010&\u001a\u00020\u0018J\b\u0010'\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragmentEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "validatePrice", "setPrice", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "abortValidation", "setSkipFailure", "failure", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "setRetryWhen", "retryWhen", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$RetryWhen;", "logMarketDataDialogAlert", "validatePriceInternal", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OrderPriceDuxo extends BaseDuxo5<OrderPriceViewState, OrderPriceFragmentEvent> implements HasSavedState {
    public static final String MARKET_DATA_ALERT_BANNER_LOGGING_ID = "market-data-temporarily-unavailable-banner";
    private final EventLogger eventLogger;
    private final InstrumentStore instrumentStore;
    private final NbboSummaryStore nbboSummaryStore;
    private final OrderStore orderStore;
    private final QuoteStore quoteStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderPriceDuxo(InstrumentStore instrumentStore, NbboSummaryStore nbboSummaryStore, QuoteStore quoteStore, EventLogger eventLogger, OrderStore orderStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new OrderPriceViewState(((OrderPriceFragment.Args) companion.getArgs(savedStateHandle)).getDirectOrder().getOrderConfiguration(), ((OrderPriceFragment.Args) companion.getArgs(savedStateHandle)).getScreenType(), null, null, null, null, null, null, ((OrderPriceFragment.Args) companion.getArgs(savedStateHandle)).getOrderToReplaceId() != null, null, null, 1788, null), duxoBundle);
        this.instrumentStore = instrumentStore;
        this.nbboSummaryStore = nbboSummaryStore;
        this.quoteStore = quoteStore;
        this.eventLogger = eventLogger;
        this.orderStore = orderStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        InstrumentStore instrumentStore = this.instrumentStore;
        Companion companion = INSTANCE;
        instrumentStore.refresh(false, ((OrderPriceFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId());
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(((OrderPriceFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderPriceDuxo.onResume$lambda$0(this.f$0, (Instrument) obj);
            }
        });
        if (((OrderPriceFragment.Args) companion.getArgs((HasSavedState) this)).getDirectOrder().getOrderConfiguration() == Order.Configuration.LIMIT) {
            LifecycleHost.DefaultImpls.bind$default(this, this.nbboSummaryStore.streamNbboSummary(((OrderPriceFragment.Args) companion.getArgs((HasSavedState) this)).getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderPriceDuxo.onResume$lambda$1(this.f$0, (NbboSummary) obj);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C294093(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C294104(null), 3, null);
        UUID orderToReplaceId = ((OrderPriceFragment.Args) companion.getArgs((HasSavedState) this)).getOrderToReplaceId();
        if (orderToReplaceId != null) {
            this.orderStore.refresh(true, orderToReplaceId);
            LifecycleHost.DefaultImpls.bind$default(this, this.orderStore.getOrder(orderToReplaceId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OrderPriceDuxo.onResume$lambda$3$lambda$2(this.f$0, (Order) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(OrderPriceDuxo orderPriceDuxo, Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        orderPriceDuxo.applyMutation(new OrderPriceDuxo2(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OrderPriceDuxo orderPriceDuxo, NbboSummary nbboSummary) {
        Intrinsics.checkNotNullParameter(nbboSummary, "nbboSummary");
        orderPriceDuxo.applyMutation(new OrderPriceDuxo3(nbboSummary, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$3", m3645f = "OrderPriceDuxo.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$3 */
    static final class C294093 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294093(Continuation<? super C294093> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderPriceDuxo.this.new C294093(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294093) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Quote> flowAsFlow = OrderPriceDuxo.this.quoteStore.getStreamQuote().asFlow(((OrderPriceFragment.Args) OrderPriceDuxo.INSTANCE.getArgs((HasSavedState) OrderPriceDuxo.this)).getInstrumentId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderPriceDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable unused) {
                OrderPriceDuxo.this.submit(OrderPriceFragmentEvent.QuoteFetchError.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderPriceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/Quote;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$3$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Quote, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderPriceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderPriceDuxo orderPriceDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderPriceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Quote quote, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quote, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderPriceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$3$1$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$3$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505721 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
                final /* synthetic */ Quote $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505721(Quote quote, Continuation<? super C505721> continuation) {
                    super(2, continuation);
                    this.$it = quote;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505721 c505721 = new C505721(this.$it, continuation);
                    c505721.L$0 = obj;
                    return c505721;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
                    return ((C505721) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, null, null, this.$it, null, null, null, false, null, null, 2031, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505721((Quote) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$4", m3645f = "OrderPriceDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$4 */
    static final class C294104 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C294104(Continuation<? super C294104> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderPriceDuxo.this.new C294104(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C294104) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OrderPriceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$4$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderPriceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderPriceDuxo orderPriceDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderPriceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((OrderPriceViewState) this.L$0).getShouldRetryValidation()) {
                    this.this$0.applyMutation(new C505731(null));
                    this.this$0.validatePriceInternal();
                }
                return Unit.INSTANCE;
            }

            /* compiled from: OrderPriceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$4$1$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$onResume$4$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505731 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                C505731(Continuation<? super C505731> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505731 c505731 = new C505731(continuation);
                    c505731.L$0 = obj;
                    return c505731;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
                    return ((C505731) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, 1919, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<OrderPriceViewState> stateFlow = OrderPriceDuxo.this.getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderPriceDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3$lambda$2(OrderPriceDuxo orderPriceDuxo, Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        orderPriceDuxo.applyMutation(new OrderPriceDuxo4(orderPriceDuxo, order, null));
        return Unit.INSTANCE;
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$validatePrice$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$validatePrice$1 */
    static final class C294141 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294141(Continuation<? super C294141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294141 c294141 = new C294141(continuation);
            c294141.L$0 = obj;
            return c294141;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
            return ((C294141) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, null, null, null, null, null, null, false, null, null, 1919, null);
        }
    }

    public final void validatePrice() {
        applyMutation(new C294141(null));
        validatePriceInternal();
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$setPrice$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$setPrice$1 */
    static final class C294111 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
        final /* synthetic */ BigDecimal $price;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C294111(BigDecimal bigDecimal, Continuation<? super C294111> continuation) {
            super(2, continuation);
            this.$price = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294111 c294111 = new C294111(this.$price, continuation);
            c294111.L$0 = obj;
            return c294111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
            return ((C294111) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, this.$price, null, null, null, null, null, false, null, null, 2043, null);
        }
    }

    public final void setPrice(BigDecimal price) {
        applyMutation(new C294111(price, null));
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$abortValidation$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$abortValidation$1 */
    static final class C294081 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294081(Continuation<? super C294081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294081 c294081 = new C294081(continuation);
            c294081.L$0 = obj;
            return c294081;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
            return ((C294081) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((OrderPriceViewState) this.L$0).abortValidation();
        }
    }

    public final void abortValidation() {
        applyMutation(new C294081(null));
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$setSkipFailure$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$setSkipFailure$1 */
    static final class C294131 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
        final /* synthetic */ Validator.Failure<OrderPriceContext, OrderPriceFailureResolver> $failure;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C294131(Validator.Failure<? super OrderPriceContext, ? super OrderPriceFailureResolver> failure, Continuation<? super C294131> continuation) {
            super(2, continuation);
            this.$failure = failure;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294131 c294131 = new C294131(this.$failure, continuation);
            c294131.L$0 = obj;
            return c294131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
            return ((C294131) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((OrderPriceViewState) this.L$0).skipFailureAndValidate(this.$failure);
        }
    }

    public final void setSkipFailure(Validator.Failure<? super OrderPriceContext, ? super OrderPriceFailureResolver> failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        applyMutation(new C294131(failure, null));
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$setRetryWhen$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$setRetryWhen$1 */
    static final class C294121 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
        final /* synthetic */ Validator.Action.RetryWhen<OrderPriceContext> $retryWhen;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C294121(Validator.Action.RetryWhen<? super OrderPriceContext> retryWhen, Continuation<? super C294121> continuation) {
            super(2, continuation);
            this.$retryWhen = retryWhen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294121 c294121 = new C294121(this.$retryWhen, continuation);
            c294121.L$0 = obj;
            return c294121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
            return ((C294121) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderPriceViewState.copy$default((OrderPriceViewState) this.L$0, null, null, null, null, null, null, this.$retryWhen, null, false, null, null, 1983, null);
        }
    }

    public final void setRetryWhen(Validator.Action.RetryWhen<? super OrderPriceContext> retryWhen) {
        Intrinsics.checkNotNullParameter(retryWhen, "retryWhen");
        applyMutation(new C294121(retryWhen, null));
    }

    public final void logMarketDataDialogAlert() {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(Screen.Name.EQUITY_ENTER_LIMIT_PRICE_PAGE, null, null, null, 14, null), new Component(Component.ComponentType.INFO_BANNER, MARKET_DATA_ALERT_BANNER_LOGGING_ID, null, 4, null), null, null, 25, null);
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$validatePriceInternal$1", m3645f = "OrderPriceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.OrderPriceDuxo$validatePriceInternal$1 */
    static final class C294151 extends ContinuationImpl7 implements Function2<OrderPriceViewState, Continuation<? super OrderPriceViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C294151(Continuation<? super C294151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C294151 c294151 = new C294151(continuation);
            c294151.L$0 = obj;
            return c294151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderPriceViewState orderPriceViewState, Continuation<? super OrderPriceViewState> continuation) {
            return ((C294151) create(orderPriceViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((OrderPriceViewState) this.L$0).validate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validatePriceInternal() {
        applyMutation(new C294151(null));
    }

    /* compiled from: OrderPriceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceDuxo;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/OrderPriceFragment$Args;", "<init>", "()V", "MARKET_DATA_ALERT_BANNER_LOGGING_ID", "", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OrderPriceDuxo, OrderPriceFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderPriceFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderPriceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OrderPriceFragment.Args getArgs(OrderPriceDuxo orderPriceDuxo) {
            return (OrderPriceFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, orderPriceDuxo);
        }
    }
}
