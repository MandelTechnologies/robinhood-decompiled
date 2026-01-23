package com.robinhood.android.equity.validation;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.EquityOrderRequestInputs;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: EquityOrderContextStore.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJl\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010&0\u0014\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\b\u0012\u0004\u0012\u00028\u00000\u001427\u0010%\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140$\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0002¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0014¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00105¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/equity/validation/EquityOrderContextStore;", "", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/OrderStore;Lj$/time/Clock;)V", "Lkotlinx/coroutines/flow/Flow;", "", "accountNumberStream", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs$StaticInputs;", "staticInputsStream", "Ljava/util/UUID;", "orderToReplaceIdStream", "Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;", "inflateRequestContext", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "T", "R", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "transform", "Lkotlin/Result;", "flatMapLoad", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "inputFlow", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "inflate", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "Lj$/time/Clock;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityOrderContextStore {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final Clock clock;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final OrderStore orderStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;

    public EquityOrderContextStore(AccountProvider accountProvider, InstrumentStore instrumentStore, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, TraderMarketHoursManager marketHoursManager, OrderStore orderStore, Clock clock) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.accountProvider = accountProvider;
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.marketHoursManager = marketHoursManager;
        this.orderStore = orderStore;
        this.clock = clock;
    }

    /* compiled from: EquityOrderContextStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/equity/validation/EquityOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1", m3645f = "EquityOrderContextStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1 */
    static final class C151391 extends ContinuationImpl7 implements Function2<Produce4<? super EquityOrderContext>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<EquityOrderRequestInputs> $inputFlow;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityOrderContextStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151391(Flow<EquityOrderRequestInputs> flow, EquityOrderContextStore equityOrderContextStore, Continuation<? super C151391> continuation) {
            super(2, continuation);
            this.$inputFlow = flow;
            this.this$0 = equityOrderContextStore;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151391 c151391 = new C151391(this.$inputFlow, this.this$0, continuation);
            c151391.L$0 = obj;
            return c151391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super EquityOrderContext> produce4, Continuation<? super Unit> continuation) {
            return ((C151391) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                final Flow<EquityOrderRequestInputs> flow = this.$inputFlow;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C151332<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$1$2", m3645f = "EquityOrderContextStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C151332.this.emit(null, this);
                            }
                        }

                        public C151332(FlowCollector flowCollector) {
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
                                String accountNumber = ((EquityOrderRequestInputs) obj).getAccountNumber();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new C151332(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                final Flow<EquityOrderRequestInputs> flow2 = this.$inputFlow;
                Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<EquityOrderRequestInputs.StaticInputs>() { // from class: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$2

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$2$2 */
                    public static final class C151342<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$2$2", m3645f = "EquityOrderContextStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                return C151342.this.emit(null, this);
                            }
                        }

                        public C151342(FlowCollector flowCollector) {
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
                                EquityOrderRequestInputs.StaticInputs staticInputs = ((EquityOrderRequestInputs) obj).getStaticInputs();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(staticInputs, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super EquityOrderRequestInputs.StaticInputs> flowCollector, Continuation continuation) {
                        Object objCollect = flow2.collect(new C151342(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                final Flow<EquityOrderRequestInputs> flow3 = this.$inputFlow;
                Flow flowDistinctUntilChanged3 = FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$3

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$3$2 */
                    public static final class C151352<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$3$2", m3645f = "EquityOrderContextStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$invokeSuspend$$inlined$map$3$2$1, reason: invalid class name */
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
                                return C151352.this.emit(null, this);
                            }
                        }

                        public C151352(FlowCollector flowCollector) {
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
                                UUID orderToReplaceId = ((EquityOrderRequestInputs) obj).getOrderToReplaceId();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(orderToReplaceId, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = flow3.collect(new C151352(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                Flow flowCombine = FlowKt.combine(FlowKt.distinctUntilChanged(this.$inputFlow), FlowKt.filterNotNull(this.this$0.inflateRequestContext(flowDistinctUntilChanged, flowDistinctUntilChanged2, flowDistinctUntilChanged3)), this.this$0.marketHoursManager.getCurrentTradingSession(), FlowKt.transformLatest(flowDistinctUntilChanged3, new C15132xb0637913(null, this.this$0)), new AnonymousClass2(this.this$0, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(produce4, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/validation/EquityOrderContext;", "inputs", "Lcom/robinhood/android/equity/validation/EquityOrderRequestInputs;", "requestContext", "Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;", "tradingSession", "Lcom/robinhood/models/db/TradingSession;", "orderToReplace", "Lcom/robinhood/models/db/Order;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$2", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function5<EquityOrderRequestInputs, EquityOrderContext.RequestContext, TradingSession, Order, Continuation<? super EquityOrderContext>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass2> continuation) {
                super(5, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(EquityOrderRequestInputs equityOrderRequestInputs, EquityOrderContext.RequestContext requestContext, TradingSession tradingSession, Order order, Continuation<? super EquityOrderContext> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = equityOrderRequestInputs;
                anonymousClass2.L$1 = requestContext;
                anonymousClass2.L$2 = tradingSession;
                anonymousClass2.L$3 = order;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityOrderRequestInputs equityOrderRequestInputs = (EquityOrderRequestInputs) this.L$0;
                EquityOrderContext.RequestContext requestContext = (EquityOrderContext.RequestContext) this.L$1;
                TradingSession tradingSession = (TradingSession) this.L$2;
                Order order = (Order) this.L$3;
                EquityOrderContextFactory equityOrderContextFactory = EquityOrderContextFactory.INSTANCE;
                Account account = requestContext.getAccount();
                Instrument instrument = requestContext.getInstrument();
                Position position = requestContext.getPosition();
                Quote quote = requestContext.getQuote();
                Instant instant = this.this$0.clock.instant();
                Intrinsics.checkNotNullExpressionValue(instant, "instant(...)");
                return equityOrderContextFactory.create(account, instrument, tradingSession, position, quote, equityOrderRequestInputs, instant, requestContext.getInstrumentBuyingPower(), order);
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equity/validation/EquityOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$3", m3645f = "EquityOrderContextStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<EquityOrderContext, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<EquityOrderContext> $$this$channelFlow;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Produce4<? super EquityOrderContext> produce4, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$$this$channelFlow = produce4;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$$this$channelFlow, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityOrderContext equityOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(equityOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EquityOrderContext equityOrderContext = (EquityOrderContext) this.L$0;
                    Produce4<EquityOrderContext> produce4 = this.$$this$channelFlow;
                    this.label = 1;
                    if (produce4.send(equityOrderContext, this) == coroutine_suspended) {
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
    }

    public final Flow<EquityOrderContext> inflate(Flow<EquityOrderRequestInputs> inputFlow) {
        Intrinsics.checkNotNullParameter(inputFlow, "inputFlow");
        return FlowKt.channelFlow(new C151391(inputFlow, this, null));
    }

    /* compiled from: EquityOrderContextStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1", m3645f = "EquityOrderContextStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1 */
    static final class C151401 extends ContinuationImpl7 implements Function2<Produce4<? super EquityOrderContext.RequestContext>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $accountNumberStream;
        final /* synthetic */ Flow<UUID> $orderToReplaceIdStream;
        final /* synthetic */ Flow<EquityOrderRequestInputs.StaticInputs> $staticInputsStream;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityOrderContextStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C151401(Flow<EquityOrderRequestInputs.StaticInputs> flow, EquityOrderContextStore equityOrderContextStore, Flow<String> flow2, Flow<UUID> flow3, Continuation<? super C151401> continuation) {
            super(2, continuation);
            this.$staticInputsStream = flow;
            this.this$0 = equityOrderContextStore;
            this.$accountNumberStream = flow2;
            this.$orderToReplaceIdStream = flow3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151401 c151401 = new C151401(this.$staticInputsStream, this.this$0, this.$accountNumberStream, this.$orderToReplaceIdStream, continuation);
            c151401.L$0 = obj;
            return c151401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super EquityOrderContext.RequestContext> produce4, Continuation<? super Unit> continuation) {
            return ((C151401) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Produce4 produce4 = (Produce4) this.L$0;
                final Flow<EquityOrderRequestInputs.StaticInputs> flow = this.$staticInputsStream;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$1$2", m3645f = "EquityOrderContextStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                UUID instrumentId = ((EquityOrderRequestInputs.StaticInputs) obj).getInstrumentId();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(instrumentId, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super UUID> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                final Flow<EquityOrderRequestInputs.StaticInputs> flow2 = this.$staticInputsStream;
                Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(new Flow<EquityOrderFlowSource>() { // from class: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$2

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$2$2", m3645f = "EquityOrderContextStore.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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
                                EquityOrderFlowSource flowSource = ((EquityOrderRequestInputs.StaticInputs) obj).getFlowSource();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(flowSource, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super EquityOrderFlowSource> flowCollector, Continuation continuation) {
                        Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                EquityOrderContextStore equityOrderContextStore = this.this$0;
                Flow flowFlatMapLoad = equityOrderContextStore.flatMapLoad(this.$accountNumberStream, new AnonymousClass1(equityOrderContextStore, null));
                EquityOrderContextStore equityOrderContextStore2 = this.this$0;
                Flow flowFlatMapLoad2 = equityOrderContextStore2.flatMapLoad(flowDistinctUntilChanged, new AnonymousClass2(equityOrderContextStore2, null));
                EquityOrderContextStore equityOrderContextStore3 = this.this$0;
                Flow flowOnStart = FlowKt.onStart(equityOrderContextStore3.flatMapLoad(FlowKt.flowCombine(FlowKt.onEach(this.$accountNumberStream, new AnonymousClass3(equityOrderContextStore3, null)), flowDistinctUntilChanged, new AnonymousClass4(this.this$0, null)), new AnonymousClass5(null)), new AnonymousClass6(null));
                EquityOrderContextStore equityOrderContextStore4 = this.this$0;
                Flow flowFlatMapLoad3 = equityOrderContextStore4.flatMapLoad(flowDistinctUntilChanged, new AnonymousClass7(equityOrderContextStore4, null));
                EquityOrderContextStore equityOrderContextStore5 = this.this$0;
                Flow flowCombine = FlowKt.combine(flowFlatMapLoad, flowFlatMapLoad2, flowOnStart, flowFlatMapLoad3, equityOrderContextStore5.flatMapLoad(FlowKt.combine(flowDistinctUntilChanged, this.$accountNumberStream, this.$orderToReplaceIdStream, flowDistinctUntilChanged2, new AnonymousClass8(equityOrderContextStore5, null)), new AnonymousClass9(null)), new AnonymousClass10(null));
                AnonymousClass11 anonymousClass11 = new AnonymousClass11(produce4, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass11, this) == coroutine_suspended) {
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

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Account;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$1", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Flow<? extends Account>>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Flow<? extends Account>> continuation) {
                return invoke2(str, (Continuation<? super Flow<Account>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, Continuation<? super Flow<Account>> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccount((String) this.L$0)), Integer.MAX_VALUE, null, 2, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Instrument;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$2", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Flow<? extends Instrument>>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Flow<? extends Instrument>> continuation) {
                return invoke2(uuid, (Continuation<? super Flow<Instrument>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(UUID uuid, Continuation<? super Flow<Instrument>> continuation) {
                return ((AnonymousClass2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    return Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument((UUID) this.L$0)), Integer.MAX_VALUE, null, 2, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$3", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.positionStore.refreshAccount((String) this.L$0, false);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Position;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$4", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function3<String, UUID, Continuation<? super Flow<? extends Position>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass4> continuation) {
                super(3, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(String str, UUID uuid, Continuation<? super Flow<? extends Position>> continuation) {
                return invoke2(str, uuid, (Continuation<? super Flow<Position>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(String str, UUID uuid, Continuation<? super Flow<Position>> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = str;
                anonymousClass4.L$1 = uuid;
                return anonymousClass4.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    return Context7.buffer$default(RxConvert.asFlow(PositionStore.getPositionForAccount$default(this.this$0.positionStore, (UUID) this.L$1, str, false, 4, null)), Integer.MAX_VALUE, null, 2, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/Position;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$5", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<Flow<? extends Position>, Continuation<? super Flow<? extends Position>>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.L$0 = obj;
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Flow<? extends Position> flow, Continuation<? super Flow<? extends Position>> continuation) {
                return invoke2((Flow<Position>) flow, (Continuation<? super Flow<Position>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Flow<Position> flow, Continuation<? super Flow<Position>> continuation) {
                return ((AnonymousClass5) create(flow, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (Flow) this.L$0;
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Result;", "Lcom/robinhood/models/db/Position;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$6", m3645f = "EquityOrderContextStore.kt", m3646l = {101}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<FlowCollector<? super Result<? extends Position>>, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass6(Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(continuation);
                anonymousClass6.L$0 = obj;
                return anonymousClass6;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends Position>> flowCollector, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Result<Position>>) flowCollector, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Result<Position>> flowCollector, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    this.label = 1;
                    if (flowCollector.emit(null, this) == coroutine_suspended) {
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

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Quote;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$7", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Flow<? extends Optional<? extends Quote>>>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
                anonymousClass7.L$0 = obj;
                return anonymousClass7;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Flow<? extends Optional<? extends Quote>>> continuation) {
                return invoke2(uuid, (Continuation<? super Flow<? extends Optional<Quote>>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(UUID uuid, Continuation<? super Flow<? extends Optional<Quote>>> continuation) {
                return ((AnonymousClass7) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow<Quote> flowStreamQuote = this.this$0.quoteStore.streamQuote((UUID) this.L$0);
                    return new Flow<Optional<? extends Quote>>() { // from class: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$7$invokeSuspend$$inlined$map$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$7$invokeSuspend$$inlined$map$1$2", m3645f = "EquityOrderContextStore.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Optional optionalAsOptional = Optional3.asOptional((Quote) obj);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
                        public Object collect(FlowCollector<? super Optional<? extends Quote>> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamQuote.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "orderToReplaceId", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$8", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function5<UUID, String, UUID, EquityOrderFlowSource, Continuation<? super Flow<? extends InstrumentBuyingPower>>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            int label;
            final /* synthetic */ EquityOrderContextStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(EquityOrderContextStore equityOrderContextStore, Continuation<? super AnonymousClass8> continuation) {
                super(5, continuation);
                this.this$0 = equityOrderContextStore;
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(UUID uuid, String str, UUID uuid2, EquityOrderFlowSource equityOrderFlowSource, Continuation<? super Flow<? extends InstrumentBuyingPower>> continuation) {
                return invoke2(uuid, str, uuid2, equityOrderFlowSource, (Continuation<? super Flow<InstrumentBuyingPower>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(UUID uuid, String str, UUID uuid2, EquityOrderFlowSource equityOrderFlowSource, Continuation<? super Flow<InstrumentBuyingPower>> continuation) {
                AnonymousClass8 anonymousClass8 = new AnonymousClass8(this.this$0, continuation);
                anonymousClass8.L$0 = uuid;
                anonymousClass8.L$1 = str;
                anonymousClass8.L$2 = uuid2;
                return anonymousClass8.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UUID uuid = (UUID) this.L$0;
                String str = (String) this.L$1;
                UUID uuid2 = (UUID) this.L$2;
                if (uuid2 != null) {
                    return this.this$0.instrumentBuyingPowerStore.streamSelectedAccountBuyingPowerForInstrumentReplace(uuid, str, uuid2);
                }
                this.this$0.instrumentBuyingPowerStore.refreshSelectedAccount(true, uuid, str);
                return this.this$0.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument().asFlow(Tuples4.m3642to(uuid, str));
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$9", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<Flow<? extends InstrumentBuyingPower>, Continuation<? super Flow<? extends InstrumentBuyingPower>>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass9(Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(continuation);
                anonymousClass9.L$0 = obj;
                return anonymousClass9;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Flow<? extends InstrumentBuyingPower> flow, Continuation<? super Flow<? extends InstrumentBuyingPower>> continuation) {
                return invoke2((Flow<InstrumentBuyingPower>) flow, (Continuation<? super Flow<InstrumentBuyingPower>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Flow<InstrumentBuyingPower> flow, Continuation<? super Flow<InstrumentBuyingPower>> continuation) {
                return ((AnonymousClass9) create(flow, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (Flow) this.L$0;
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;", "account", "Lkotlin/Result;", "Lcom/robinhood/models/db/Account;", "instrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/Quote;", "buyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$10", m3645f = "EquityOrderContextStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function6<Result<? extends Account>, Result<? extends Instrument>, Result<? extends Position>, Result<? extends Optional<? extends Quote>>, Result<? extends InstrumentBuyingPower>, Continuation<? super EquityOrderContext.RequestContext>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ Object L$2;
            /* synthetic */ Object L$3;
            /* synthetic */ Object L$4;
            int label;

            AnonymousClass10(Continuation<? super AnonymousClass10> continuation) {
                super(6, continuation);
            }

            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Object invoke(Result<? extends Account> result, Result<? extends Instrument> result2, Result<? extends Position> result3, Result<? extends Optional<? extends Quote>> result4, Result<? extends InstrumentBuyingPower> result5, Continuation<? super EquityOrderContext.RequestContext> continuation) {
                return invoke2((Result<Account>) result, (Result<Instrument>) result2, (Result<Position>) result3, (Result<? extends Optional<Quote>>) result4, (Result<InstrumentBuyingPower>) result5, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Result<Account> result, Result<Instrument> result2, Result<Position> result3, Result<? extends Optional<Quote>> result4, Result<InstrumentBuyingPower> result5, Continuation<? super EquityOrderContext.RequestContext> continuation) {
                AnonymousClass10 anonymousClass10 = new AnonymousClass10(continuation);
                anonymousClass10.L$0 = result;
                anonymousClass10.L$1 = result2;
                anonymousClass10.L$2 = result3;
                anonymousClass10.L$3 = result4;
                anonymousClass10.L$4 = result5;
                return anonymousClass10.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Position position;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Result result = (Result) this.L$0;
                Result result2 = (Result) this.L$1;
                Result result3 = (Result) this.L$2;
                Result result4 = (Result) this.L$3;
                Result result5 = (Result) this.L$4;
                if (result != null) {
                    Object value = result.getValue();
                    if (Result.m28555isFailureimpl(value)) {
                        value = null;
                    }
                    Account account = (Account) value;
                    if (account != null && result2 != null) {
                        Object value2 = result2.getValue();
                        if (Result.m28555isFailureimpl(value2)) {
                            value2 = null;
                        }
                        Instrument instrument = (Instrument) value2;
                        if (instrument != null) {
                            if (result3 != null) {
                                Object value3 = result3.getValue();
                                if (Result.m28555isFailureimpl(value3)) {
                                    value3 = null;
                                }
                                position = (Position) value3;
                            } else {
                                position = null;
                            }
                            if (result4 != null) {
                                Object value4 = result4.getValue();
                                if (Result.m28555isFailureimpl(value4)) {
                                    value4 = null;
                                }
                                Optional optional = (Optional) value4;
                                if (optional != null) {
                                    Quote quote = (Quote) optional.getOrNull();
                                    if (result5 != null) {
                                        Object value5 = result5.getValue();
                                        if (Result.m28555isFailureimpl(value5)) {
                                            value5 = null;
                                        }
                                        InstrumentBuyingPower instrumentBuyingPower = (InstrumentBuyingPower) value5;
                                        if (instrumentBuyingPower != null) {
                                            return new EquityOrderContext.RequestContext(account, instrument, position, quote, instrumentBuyingPower, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* compiled from: EquityOrderContextStore.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equity/validation/EquityOrderContext$RequestContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$11", m3645f = "EquityOrderContextStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equity.validation.EquityOrderContextStore$inflateRequestContext$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<EquityOrderContext.RequestContext, Continuation<? super Unit>, Object> {
            final /* synthetic */ Produce4<EquityOrderContext.RequestContext> $$this$channelFlow;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass11(Produce4<? super EquityOrderContext.RequestContext> produce4, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$$this$channelFlow = produce4;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.$$this$channelFlow, continuation);
                anonymousClass11.L$0 = obj;
                return anonymousClass11;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityOrderContext.RequestContext requestContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(requestContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EquityOrderContext.RequestContext requestContext = (EquityOrderContext.RequestContext) this.L$0;
                    Produce4<EquityOrderContext.RequestContext> produce4 = this.$$this$channelFlow;
                    this.label = 1;
                    if (produce4.send(requestContext, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<EquityOrderContext.RequestContext> inflateRequestContext(Flow<String> accountNumberStream, Flow<EquityOrderRequestInputs.StaticInputs> staticInputsStream, Flow<UUID> orderToReplaceIdStream) {
        return FlowKt.channelFlow(new C151401(staticInputsStream, this, accountNumberStream, orderToReplaceIdStream, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T, R> Flow<Result<R>> flatMapLoad(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> function2) {
        return FlowKt.transformLatest(flow, new EquityOrderContextStore$flatMapLoad$$inlined$flatMapLatest$1(null, function2));
    }
}
