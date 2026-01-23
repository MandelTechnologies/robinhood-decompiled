package com.robinhood.android.trade.options;

import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.OptionTradeSettingsStore;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionOrderTradingSessionDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionViewState;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "optionTradeSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionStateProvider;", "<init>", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/OptionTradeSettingsStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/trade/options/OptionOrderTradingSessionStateProvider;)V", "onCreate", "", "bind", "Lkotlinx/coroutines/Job;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "onOrderTradingSessionChanged", "orderTradingSession", "Lcom/robinhood/models/db/OrderMarketHours;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class OptionOrderTradingSessionDuxo extends BaseDuxo<OptionOrderTradingSessionDataState, OptionOrderTradingSessionDuxo4> {
    public static final int $stable = 8;
    private final TraderMarketHoursManager marketHoursManager;
    private final OptionTradeSettingsStore optionTradeSettingsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionOrderTradingSessionDuxo(TraderMarketHoursManager marketHoursManager, OptionTradeSettingsStore optionTradeSettingsStore, DuxoBundle duxoBundle, OptionOrderTradingSessionDuxo3 stateProvider) {
        super(new OptionOrderTradingSessionDataState(null, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(optionTradeSettingsStore, "optionTradeSettingsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.marketHoursManager = marketHoursManager;
        this.optionTradeSettingsStore = optionTradeSettingsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C297441(null));
    }

    /* compiled from: OptionOrderTradingSessionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$onCreate$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$onCreate$1 */
    static final class C297441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C297441(Continuation<? super C297441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderTradingSessionDuxo.this.new C297441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(TraderMarketHoursManager.openMarketHoursObservable$default(OptionOrderTradingSessionDuxo.this.marketHoursManager, false, false, 3, null)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(OptionOrderTradingSessionDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: OptionOrderTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$onCreate$1$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OptionOrderTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderTradingSessionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarketHours marketHours, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(marketHours, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: OptionOrderTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$onCreate$1$1$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505871 extends ContinuationImpl7 implements Function2<OptionOrderTradingSessionDataState, Continuation<? super OptionOrderTradingSessionDataState>, Object> {
                final /* synthetic */ MarketHours $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505871(MarketHours marketHours, Continuation<? super C505871> continuation) {
                    super(2, continuation);
                    this.$it = marketHours;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505871 c505871 = new C505871(this.$it, continuation);
                    c505871.L$0 = obj;
                    return c505871;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderTradingSessionDataState optionOrderTradingSessionDataState, Continuation<? super OptionOrderTradingSessionDataState> continuation) {
                    return ((C505871) create(optionOrderTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderTradingSessionDataState.copy$default((OptionOrderTradingSessionDataState) this.L$0, null, this.$it, false, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505871((MarketHours) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: OptionOrderTradingSessionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1 */
    static final class C297431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OptionChain.UnderlyingType $underlyingType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C297431(OptionChain.UnderlyingType underlyingType, Continuation<? super C297431> continuation) {
            super(2, continuation);
            this.$underlyingType = underlyingType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C297431 c297431 = OptionOrderTradingSessionDuxo.this.new C297431(this.$underlyingType, continuation);
            c297431.L$0 = obj;
            return c297431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionOrderTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionChain.UnderlyingType $underlyingType;
            int label;
            final /* synthetic */ OptionOrderTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, OptionChain.UnderlyingType underlyingType, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderTradingSessionDuxo;
                this.$underlyingType = underlyingType;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$underlyingType, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<OrderMarketHours> flowStreamOptionOrderTradingSession = this.this$0.optionTradeSettingsStore.streamOptionOrderTradingSession(this.$underlyingType);
                    C505851 c505851 = new C505851(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamOptionOrderTradingSession, c505851, this) == coroutine_suspended) {
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

            /* compiled from: OptionOrderTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradingSession", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$1$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505851 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionOrderTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505851(OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, Continuation<? super C505851> continuation) {
                    super(2, continuation);
                    this.this$0 = optionOrderTradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505851 c505851 = new C505851(this.this$0, continuation);
                    c505851.L$0 = obj;
                    return c505851;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((C505851) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: OptionOrderTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$1$1$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C505861 extends ContinuationImpl7 implements Function2<OptionOrderTradingSessionDataState, Continuation<? super OptionOrderTradingSessionDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $tradingSession;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C505861(OrderMarketHours orderMarketHours, Continuation<? super C505861> continuation) {
                        super(2, continuation);
                        this.$tradingSession = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C505861 c505861 = new C505861(this.$tradingSession, continuation);
                        c505861.L$0 = obj;
                        return c505861;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(OptionOrderTradingSessionDataState optionOrderTradingSessionDataState, Continuation<? super OptionOrderTradingSessionDataState> continuation) {
                        return ((C505861) create(optionOrderTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return OptionOrderTradingSessionDataState.copy$default((OptionOrderTradingSessionDataState) this.L$0, this.$tradingSession, null, false, 6, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C505861((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionOrderTradingSessionDuxo.this, this.$underlyingType, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionOrderTradingSessionDuxo.this, this.$underlyingType, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionOrderTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$2", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OptionChain.UnderlyingType $underlyingType;
            int label;
            final /* synthetic */ OptionOrderTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionOrderTradingSessionDuxo optionOrderTradingSessionDuxo, OptionChain.UnderlyingType underlyingType, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionOrderTradingSessionDuxo;
                this.$underlyingType = underlyingType;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$underlyingType, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.optionTradeSettingsStore.shouldShowNewTagOnExtendedHours(this.$underlyingType)) {
                        this.this$0.applyMutation(new AnonymousClass1(null));
                        this.this$0.optionTradeSettingsStore.showedNewTagOnExtendedHours(this.$underlyingType);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: OptionOrderTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/options/OptionOrderTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$2$1", m3645f = "OptionOrderTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.options.OptionOrderTradingSessionDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OptionOrderTradingSessionDataState, Continuation<? super OptionOrderTradingSessionDataState>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OptionOrderTradingSessionDataState optionOrderTradingSessionDataState, Continuation<? super OptionOrderTradingSessionDataState> continuation) {
                    return ((AnonymousClass1) create(optionOrderTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return OptionOrderTradingSessionDataState.copy$default((OptionOrderTradingSessionDataState) this.L$0, null, null, true, 3, null);
                }
            }
        }
    }

    public final Job bind(OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297431(underlyingType, null), 3, null);
    }

    public final void onOrderTradingSessionChanged(OptionChain.UnderlyingType underlyingType, OrderMarketHours orderTradingSession) {
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(orderTradingSession, "orderTradingSession");
        this.optionTradeSettingsStore.setOptionOrderTradingSession(underlyingType, orderTradingSession);
    }
}
