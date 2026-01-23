package com.robinhood.shared.education.order;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OrderTypeEducationDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u001aB9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/education/order/OrderTypeEducationDataState;", "Lcom/robinhood/shared/education/order/OrderTypeEducationViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo$InitArgs;", "stateProvider", "Lcom/robinhood/shared/education/order/OrderTypeEducationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/shared/education/order/OrderTypeEducationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/education/order/OrderTypeEducationManager;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onDismissClicked", "onContinueClicked", "InitArgs", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypeEducationDuxo extends BaseDuxo<OrderTypeEducationDataState, OrderTypeEducationViewState> implements HasArgs<InitArgs> {
    public static final int $stable = 8;
    private final CurrencyPairV2Store currencyPairV2Store;
    private final InstrumentStore instrumentStore;
    private final OrderTypeEducationManager orderTypeEducationManager;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderTypeEducationDuxo(OrderTypeEducationStateProvider stateProvider, DuxoBundle duxoBundle, OrderTypeEducationManager orderTypeEducationManager, CurrencyPairV2Store currencyPairV2Store, InstrumentStore instrumentStore, SavedStateHandle savedStateHandle) {
        boolean zHasSeenRecurringEducation;
        super(new OrderTypeEducationDataState(null, null, null, false, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.orderTypeEducationManager = orderTypeEducationManager;
        this.currencyPairV2Store = currencyPairV2Store;
        this.instrumentStore = instrumentStore;
        this.savedStateHandle = savedStateHandle;
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = ((InitArgs) getArgs(getSavedStateHandle())).getConfiguration();
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
            zHasSeenRecurringEducation = orderTypeEducationManager.hasSeenEducation(cryptoOrder.getOrderConfiguration(), cryptoOrder.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
            zHasSeenRecurringEducation = orderTypeEducationManager.hasSeenEducation(perpetualContract.getOrderConfiguration(), perpetualContract.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) configuration;
            zHasSeenRecurringEducation = orderTypeEducationManager.hasSeenEducation(tokenizedStocks.getOrderConfiguration(), tokenizedStocks.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder equityOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) configuration;
            zHasSeenRecurringEducation = orderTypeEducationManager.hasSeenEducation(equityOrder.getDirectOrder().getOrderConfiguration(), equityOrder.getSide());
        } else {
            if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
                throw new NoWhenBranchMatchedException();
            }
            zHasSeenRecurringEducation = orderTypeEducationManager.hasSeenRecurringEducation();
        }
        applyMutation(new C388031(zHasSeenRecurringEducation, null));
    }

    /* compiled from: OrderTypeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/education/order/OrderTypeEducationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationDuxo$1", m3645f = "OrderTypeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationDuxo$1 */
    static final class C388031 extends ContinuationImpl7 implements Function2<OrderTypeEducationDataState, Continuation<? super OrderTypeEducationDataState>, Object> {
        final /* synthetic */ boolean $hasSeenEducation;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C388031(boolean z, Continuation<? super C388031> continuation) {
            super(2, continuation);
            this.$hasSeenEducation = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C388031 c388031 = OrderTypeEducationDuxo.this.new C388031(this.$hasSeenEducation, continuation);
            c388031.L$0 = obj;
            return c388031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderTypeEducationDataState orderTypeEducationDataState, Continuation<? super OrderTypeEducationDataState> continuation) {
            return ((C388031) create(orderTypeEducationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OrderTypeEducationDataState orderTypeEducationDataState = (OrderTypeEducationDataState) this.L$0;
            OrderTypeEducationDuxo orderTypeEducationDuxo = OrderTypeEducationDuxo.this;
            return OrderTypeEducationDataState.copy$default(orderTypeEducationDataState, ((InitArgs) orderTypeEducationDuxo.getArgs(orderTypeEducationDuxo.getSavedStateHandle())).getConfiguration(), null, null, this.$hasSeenEducation, 6, null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = ((InitArgs) getArgs(getSavedStateHandle())).getConfiguration();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C388041(configuration, configuration.getInstrumentId(), this, null));
    }

    /* compiled from: OrderTypeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1", m3645f = "OrderTypeEducationDuxo.kt", m3646l = {89, 99}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1 */
    static final class C388041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration $configuration;
        final /* synthetic */ UUID $instrumentId;
        int label;
        final /* synthetic */ OrderTypeEducationDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C388041(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, UUID uuid, OrderTypeEducationDuxo orderTypeEducationDuxo, Continuation<? super C388041> continuation) {
            super(2, continuation);
            this.$configuration = orderTypeEducationConfiguration;
            this.$instrumentId = uuid;
            this.this$0 = orderTypeEducationDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C388041(this.$configuration, this.$instrumentId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C388041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration = this.$configuration;
                if ((orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) || (orderTypeEducationConfiguration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks)) {
                    if (this.$instrumentId != null) {
                        Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = this.this$0.currencyPairV2Store.streamCurrencyPairFlow(this.$instrumentId);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                    }
                } else if (this.$instrumentId != null) {
                    this.this$0.instrumentStore.refresh(false, this.$instrumentId);
                    Flow flowTake = FlowKt.take(Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null), 1);
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderTypeEducationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$1", m3645f = "OrderTypeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderTypeEducationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderTypeEducationDuxo orderTypeEducationDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderTypeEducationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderTypeEducationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/education/order/OrderTypeEducationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$1$1", m3645f = "OrderTypeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507261 extends ContinuationImpl7 implements Function2<OrderTypeEducationDataState, Continuation<? super OrderTypeEducationDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $currencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507261(UiCurrencyPair uiCurrencyPair, Continuation<? super C507261> continuation) {
                    super(2, continuation);
                    this.$currencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507261 c507261 = new C507261(this.$currencyPair, continuation);
                    c507261.L$0 = obj;
                    return c507261;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTypeEducationDataState orderTypeEducationDataState, Continuation<? super OrderTypeEducationDataState> continuation) {
                    return ((C507261) create(orderTypeEducationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OrderTypeEducationDataState.copy$default((OrderTypeEducationDataState) this.L$0, null, this.$currencyPair, null, false, 13, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507261((UiCurrencyPair) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: OrderTypeEducationDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$2", m3645f = "OrderTypeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderTypeEducationDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OrderTypeEducationDuxo orderTypeEducationDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = orderTypeEducationDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderTypeEducationDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/education/order/OrderTypeEducationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$2$1", m3645f = "OrderTypeEducationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.education.order.OrderTypeEducationDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTypeEducationDataState, Continuation<? super OrderTypeEducationDataState>, Object> {
                final /* synthetic */ Instrument $instrument;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Instrument instrument, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$instrument = instrument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$instrument, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTypeEducationDataState orderTypeEducationDataState, Continuation<? super OrderTypeEducationDataState> continuation) {
                    return ((AnonymousClass1) create(orderTypeEducationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OrderTypeEducationDataState.copy$default((OrderTypeEducationDataState) this.L$0, null, null, this.$instrument, false, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Instrument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void onDismissClicked() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = ((InitArgs) getArgs(getSavedStateHandle())).getConfiguration();
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
            this.orderTypeEducationManager.hideEducation(cryptoOrder.getOrderConfiguration(), cryptoOrder.getSide());
            return;
        }
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
            this.orderTypeEducationManager.hideEducation(perpetualContract.getOrderConfiguration(), perpetualContract.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) configuration;
            this.orderTypeEducationManager.hideEducation(tokenizedStocks.getOrderConfiguration(), tokenizedStocks.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder equityOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) configuration;
            this.orderTypeEducationManager.hideEducation(equityOrder.getDirectOrder().getOrderConfiguration(), equityOrder.getSide());
        } else {
            if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
                throw new NoWhenBranchMatchedException();
            }
            this.orderTypeEducationManager.hideRecurringEducation();
        }
    }

    public final void onContinueClicked() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration = ((InitArgs) getArgs(getSavedStateHandle())).getConfiguration();
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
            this.orderTypeEducationManager.hideEducation(cryptoOrder.getOrderConfiguration(), cryptoOrder.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract perpetualContract = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract) configuration;
            this.orderTypeEducationManager.hideEducation(perpetualContract.getOrderConfiguration(), perpetualContract.getSide());
        } else if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks tokenizedStocks = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.TokenizedStocks) configuration;
            this.orderTypeEducationManager.hideEducation(tokenizedStocks.getOrderConfiguration(), tokenizedStocks.getSide());
        } else if (!(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.EquityOrder) && !(configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: OrderTypeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo$InitArgs;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "<init>", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;)V", "getConfiguration", "()Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration;

        /* compiled from: OrderTypeEducationDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration) parcel.readParcelable(InitArgs.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration orderTypeEducationConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTypeEducationConfiguration = initArgs.configuration;
            }
            return initArgs.copy(orderTypeEducationConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
            return this.configuration;
        }

        public final InitArgs copy(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new InitArgs(configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.configuration, ((InitArgs) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "InitArgs(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
        }

        public InitArgs(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration getConfiguration() {
            return this.configuration;
        }
    }
}
