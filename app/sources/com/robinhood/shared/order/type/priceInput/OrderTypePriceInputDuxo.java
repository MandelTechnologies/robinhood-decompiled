package com.robinhood.shared.order.type.priceInput;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.compose.NavTransition;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract;
import com.robinhood.crypto.perpetuals.store.PerpetualContractStore;
import com.robinhood.crypto.perpetuals.store.PerpetualsOrderPriceValidationStore;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.contracts.orderType.CryptoOrderTypeFragmentKey2;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.order.type.OrderTypeDestinations;
import com.robinhood.shared.order.type.OrderTypeDestinations3;
import com.robinhood.shared.order.type.OrderTypeDestinations5;
import com.robinhood.shared.order.type.priceInput.EditableOrderPrice;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputEvent;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.shared.order.type.timeInForce.TimeInForceOrderPrice2;
import crypto_perpetuals.common.p435v1.QuoteDto;
import crypto_perpetuals.order.p438v1.ValidatePriceDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import md_server_proxy.service.p483v1.CurrencyCodeDto;
import md_server_proxy.service.p483v1.QuoteDetailDataDto;

/* compiled from: OrderTypePriceInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001 B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\u001aj\u0002`\u001bJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "marketDataStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "orderPriceValidationStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsOrderPriceValidationStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;Lcom/robinhood/crypto/perpetuals/store/PerpetualsOrderPriceValidationStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onKeyPress", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onContinue", "continueArgs", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputViewState$ContinueArgs;", "onLaunchEducation", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class OrderTypePriceInputDuxo extends BaseDuxo3<OrderTypePriceInputDataState, OrderTypePriceInputViewState, OrderTypePriceInputEvent> implements HasSavedState {
    private final PerpetualContractStore contractStore;
    private final MarketDataProxyStore marketDataStore;
    private final PerpetualsOrderPriceValidationStore orderPriceValidationStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoOrderTypeFragmentKey2.values().length];
            try {
                iArr[CryptoOrderTypeFragmentKey2.PERPETUAL_CONTRACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderTypeFragmentKey2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ OrderTypePriceInputDuxo(DuxoBundle duxoBundle, OrderTypePriceInputDuxo2 orderTypePriceInputDuxo2, SavedStateHandle savedStateHandle, PerpetualContractStore perpetualContractStore, MarketDataProxyStore marketDataProxyStore, PerpetualsOrderPriceValidationStore perpetualsOrderPriceValidationStore, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(duxoBundle, (i & 2) != 0 ? new OrderTypePriceInputDuxo2() : orderTypePriceInputDuxo2, savedStateHandle, perpetualContractStore, marketDataProxyStore, perpetualsOrderPriceValidationStore);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OrderTypePriceInputDuxo(DuxoBundle duxoBundle, OrderTypePriceInputDuxo2 stateProvider, SavedStateHandle savedStateHandle, PerpetualContractStore contractStore, MarketDataProxyStore marketDataStore, PerpetualsOrderPriceValidationStore orderPriceValidationStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(contractStore, "contractStore");
        Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
        Intrinsics.checkNotNullParameter(orderPriceValidationStore, "orderPriceValidationStore");
        Companion companion = INSTANCE;
        super(new OrderTypePriceInputDataState(((OrderTypeDestinations3.Args) companion.getArgs(savedStateHandle)).getOrderSide(), ((OrderTypeDestinations3.Args) companion.getArgs(savedStateHandle)).getEditableOrderPrice(), ((OrderTypeDestinations3.Args) companion.getArgs(savedStateHandle)).isEditingPrice(), null, null, null, null, 0, false, 504, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.contractStore = contractStore;
        this.marketDataStore = marketDataStore;
        this.orderPriceValidationStore = orderPriceValidationStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C393081(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C393092(null));
    }

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1 */
    static final class C393081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: OrderTypePriceInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoOrderTypeFragmentKey2.values().length];
                try {
                    iArr[CryptoOrderTypeFragmentKey2.PERPETUAL_CONTRACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoOrderTypeFragmentKey2.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C393081(Continuation<? super C393081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderTypePriceInputDuxo.this.new C393081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C393081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = OrderTypePriceInputDuxo.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) OrderTypePriceInputDuxo.this)).getInstrumentType().ordinal()];
                if (i2 == 1) {
                    Flow<PerpetualContract> perpetualContract = OrderTypePriceInputDuxo.this.contractStore.getPerpetualContract(((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) OrderTypePriceInputDuxo.this)).getInstrumentId());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderTypePriceInputDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(perpetualContract, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: OrderTypePriceInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "perpetualContract", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualContract;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PerpetualContract, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderTypePriceInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderTypePriceInputDuxo orderTypePriceInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderTypePriceInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PerpetualContract perpetualContract, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(perpetualContract, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderTypePriceInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1$1$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507331 extends ContinuationImpl7 implements Function2<OrderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState>, Object> {
                final /* synthetic */ PerpetualContract $perpetualContract;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507331(PerpetualContract perpetualContract, Continuation<? super C507331> continuation) {
                    super(2, continuation);
                    this.$perpetualContract = perpetualContract;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507331 c507331 = new C507331(this.$perpetualContract, continuation);
                    c507331.L$0 = obj;
                    return c507331;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTypePriceInputDataState orderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState> continuation) {
                    return ((C507331) create(orderTypePriceInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((OrderTypePriceInputDataState) this.L$0).mutateWith(this.$perpetualContract);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507331((PerpetualContract) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2 */
    static final class C393092 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: OrderTypePriceInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoOrderTypeFragmentKey2.values().length];
                try {
                    iArr[CryptoOrderTypeFragmentKey2.PERPETUAL_CONTRACT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoOrderTypeFragmentKey2.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C393092(Continuation<? super C393092> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderTypePriceInputDuxo.this.new C393092(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C393092) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CurrencyCodeDto currencyCodeDto;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MarketDataProxyStore marketDataProxyStore = OrderTypePriceInputDuxo.this.marketDataStore;
                Companion companion = OrderTypePriceInputDuxo.INSTANCE;
                UUID instrumentId = ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) OrderTypePriceInputDuxo.this)).getInstrumentId();
                int i2 = WhenMappings.$EnumSwitchMapping$0[((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) OrderTypePriceInputDuxo.this)).getInstrumentType().ordinal()];
                if (i2 == 1) {
                    currencyCodeDto = CurrencyCodeDto.USD;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    currencyCodeDto = CurrencyCodeDto.EUR;
                }
                Flow<QuoteDetailDataDto> flowPollQuote = marketDataProxyStore.pollQuote(instrumentId, currencyCodeDto);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OrderTypePriceInputDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollQuote, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OrderTypePriceInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmd_server_proxy/service/v1/QuoteDetailDataDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<QuoteDetailDataDto, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OrderTypePriceInputDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OrderTypePriceInputDuxo orderTypePriceInputDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = orderTypePriceInputDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(QuoteDetailDataDto quoteDetailDataDto, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(quoteDetailDataDto, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OrderTypePriceInputDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2$1$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507341 extends ContinuationImpl7 implements Function2<OrderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState>, Object> {
                final /* synthetic */ QuoteDetailDataDto $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507341(QuoteDetailDataDto quoteDetailDataDto, Continuation<? super C507341> continuation) {
                    super(2, continuation);
                    this.$it = quoteDetailDataDto;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507341 c507341 = new C507341(this.$it, continuation);
                    c507341.L$0 = obj;
                    return c507341;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTypePriceInputDataState orderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState> continuation) {
                    return ((C507341) create(orderTypePriceInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OrderTypePriceInputDataState.copy$default((OrderTypePriceInputDataState) this.L$0, null, null, false, null, null, this.$it, null, 0, false, 479, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507341((QuoteDetailDataDto) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onKeyPress$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onKeyPress$1 */
    static final class C393101 extends ContinuationImpl7 implements Function2<OrderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C393101(KeyEvent keyEvent, Continuation<? super C393101> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C393101 c393101 = new C393101(this.$keyEvent, continuation);
            c393101.L$0 = obj;
            return c393101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderTypePriceInputDataState orderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState> continuation) {
            return ((C393101) create(orderTypePriceInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((OrderTypePriceInputDataState) this.L$0).mutateWith(this.$keyEvent);
        }
    }

    public final void onKeyPress(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C393101(keyEvent, null));
    }

    public final void onContinue(OrderTypePriceInputViewState.ContinueArgs continueArgs) {
        Intrinsics.checkNotNullParameter(continueArgs, "continueArgs");
        int i = WhenMappings.$EnumSwitchMapping$0[((OrderTypeDestinations3.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentType().ordinal()];
        if (i == 1) {
            applyMutation(new C393061(null));
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C393072(continueArgs, null), 3, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new OrderTypePriceInputEvent.Navigate(ComposableDestinationWithArgs.composeNav$default(OrderTypeDestinations5.INSTANCE, new OrderTypeDestinations5.Args(TimeInForceOrderPrice2.toTimeInForceOrderPrice(continueArgs.getNewEditableOrderPrice())), null, null, 6, null)));
        }
    }

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$1", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$1 */
    static final class C393061 extends ContinuationImpl7 implements Function2<OrderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C393061(Continuation<? super C393061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C393061 c393061 = new C393061(continuation);
            c393061.L$0 = obj;
            return c393061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OrderTypePriceInputDataState orderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState> continuation) {
            return ((C393061) create(orderTypePriceInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return OrderTypePriceInputDataState.copy$default((OrderTypePriceInputDataState) this.L$0, null, null, false, null, null, null, null, 0, true, 255, null);
        }
    }

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$2", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$2 */
    static final class C393072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OrderTypePriceInputViewState.ContinueArgs $continueArgs;
        int label;

        /* compiled from: OrderTypePriceInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C393072(OrderTypePriceInputViewState.ContinueArgs continueArgs, Continuation<? super C393072> continuation) {
            super(2, continuation);
            this.$continueArgs = continueArgs;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderTypePriceInputDuxo.this.new C393072(this.$continueArgs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C393072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            com.robinhood.crypto.models.perpetuals.p288db.OrderSide orderSide;
            C393072 c393072;
            Object objM22243validateOrderPriceyxL6bBk;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PerpetualsOrderPriceValidationStore perpetualsOrderPriceValidationStore = OrderTypePriceInputDuxo.this.orderPriceValidationStore;
                Companion companion = OrderTypePriceInputDuxo.INSTANCE;
                UUID instrumentId = ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) OrderTypePriceInputDuxo.this)).getInstrumentId();
                int i2 = WhenMappings.$EnumSwitchMapping$0[((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) OrderTypePriceInputDuxo.this)).getOrderSide().ordinal()];
                if (i2 == 1) {
                    orderSide = com.robinhood.crypto.models.perpetuals.p288db.OrderSide.LONG;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    orderSide = com.robinhood.crypto.models.perpetuals.p288db.OrderSide.SHORT;
                }
                com.robinhood.crypto.models.perpetuals.p288db.OrderSide orderSide2 = orderSide;
                QuoteDto quoteDto = new QuoteDto(IdlDecimal2.toIdlDecimal(this.$continueArgs.getAskPrice()), IdlDecimal2.toIdlDecimal(this.$continueArgs.getBidPrice()), IdlDecimal2.toIdlDecimal(this.$continueArgs.getMidPrice()));
                ValidatePriceDto validatePrice = EditableOrderPrice2.toValidatePrice(this.$continueArgs.getNewEditableOrderPrice());
                this.label = 1;
                c393072 = this;
                objM22243validateOrderPriceyxL6bBk = perpetualsOrderPriceValidationStore.m22243validateOrderPriceyxL6bBk(instrumentId, orderSide2, quoteDto, validatePrice, c393072);
                if (objM22243validateOrderPriceyxL6bBk == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM22243validateOrderPriceyxL6bBk = ((Result) obj).getValue();
                c393072 = this;
            }
            OrderTypePriceInputViewState.ContinueArgs continueArgs = c393072.$continueArgs;
            OrderTypePriceInputDuxo orderTypePriceInputDuxo = OrderTypePriceInputDuxo.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM22243validateOrderPriceyxL6bBk);
            if (thM28553exceptionOrNullimpl == null) {
                orderTypePriceInputDuxo.submit(new OrderTypePriceInputEvent.Navigate(ComposableDestinationWithArgs.composeNav$default(OrderTypeDestinations5.INSTANCE, new OrderTypeDestinations5.Args(TimeInForceOrderPrice2.toTimeInForceOrderPrice(continueArgs.getNewEditableOrderPrice())), null, null, 6, null)));
            } else {
                orderTypePriceInputDuxo.submit(new OrderTypePriceInputEvent.HandlePerpetualsError(thM28553exceptionOrNullimpl));
            }
            OrderTypePriceInputDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: OrderTypePriceInputDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$2$3", m3645f = "OrderTypePriceInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.order.type.priceInput.OrderTypePriceInputDuxo$onContinue$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<OrderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(OrderTypePriceInputDataState orderTypePriceInputDataState, Continuation<? super OrderTypePriceInputDataState> continuation) {
                return ((AnonymousClass3) create(orderTypePriceInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return OrderTypePriceInputDataState.copy$default((OrderTypePriceInputDataState) this.L$0, null, null, false, null, null, null, null, 0, false, 255, null);
            }
        }
    }

    public final void onLaunchEducation() {
        OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration perpetualContract;
        OrderTypeDestinations orderTypeDestinations = OrderTypeDestinations.INSTANCE;
        Companion companion = INSTANCE;
        OrderTypeDestinations3.Args args = (OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this);
        int i = WhenMappings.$EnumSwitchMapping$0[((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getInstrumentType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getEditableOrderPrice() instanceof EditableOrderPrice.Limit) {
                perpetualContract = new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder(Order.Configuration.LIMIT, ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getOrderSide(), ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getOrderId(), true, OrderTypeEducationFragmentKey.NavIconType.CLOSE_BUTTON, false, 64, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getEditableOrderPrice() instanceof EditableOrderPrice.Limit) {
            perpetualContract = new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.PerpetualContract(Order.Configuration.LIMIT, ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getOrderSide(), ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getInstrumentId(), ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getOrderId(), true, OrderTypeEducationFragmentKey.NavIconType.CLOSE_BUTTON, ((OrderTypeDestinations3.Args) companion.getArgs((HasSavedState) this)).getInstrumentSymbol());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        submit(new OrderTypePriceInputEvent.Navigate(ComposableDestinationWithArgs.composeNav$default(orderTypeDestinations, new OrderTypeDestinations.Args(args, perpetualContract, true), NavTransition.SLIDE_VERTICAL, null, 4, null)));
    }

    /* compiled from: OrderTypePriceInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo;", "Lcom/robinhood/shared/order/type/OrderTypePriceInputDest$Args;", "<init>", "()V", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<OrderTypePriceInputDuxo, OrderTypeDestinations3.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public OrderTypeDestinations3.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderTypeDestinations3.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public OrderTypeDestinations3.Args getArgs(OrderTypePriceInputDuxo orderTypePriceInputDuxo) {
            return (OrderTypeDestinations3.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, orderTypePriceInputDuxo);
        }
    }
}
