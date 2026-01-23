package com.robinhood.android.equities.tradesettings;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.models.api.ApiOrderExpireDate;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: TimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TimeInForceDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;", "Lcom/robinhood/android/equities/tradesettings/TimeInForceViewState;", "tradeSettingsStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/equities/tradesettings/TimeInForceStateProvider;", "<init>", "(Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equities/tradesettings/TimeInForceStateProvider;)V", "bind", "Lkotlinx/coroutines/Job;", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "instrumentType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentId", "Ljava/util/UUID;", "onTimeInForceChanged", "", "tif", "Lcom/robinhood/models/db/OrderTimeInForce;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TimeInForceDuxo extends BaseDuxo<TimeInForceDataState, TimeInForceViewState> {
    public static final int $stable = 8;
    private final TraderMarketHoursManager marketHoursManager;
    private final EquityOrderExpireDateStore orderExpireDateStore;
    private final TradeSettingsStore tradeSettingsStore;

    public /* synthetic */ TimeInForceDuxo(TradeSettingsStore tradeSettingsStore, TraderMarketHoursManager traderMarketHoursManager, EquityOrderExpireDateStore equityOrderExpireDateStore, DuxoBundle duxoBundle, TimeInForceStateProvider timeInForceStateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeSettingsStore, traderMarketHoursManager, equityOrderExpireDateStore, duxoBundle, (i & 16) != 0 ? new TimeInForceStateProvider() : timeInForceStateProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeInForceDuxo(TradeSettingsStore tradeSettingsStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, DuxoBundle duxoBundle, TimeInForceStateProvider stateProvider) {
        super(new TimeInForceDataState(null, null, null, null, null, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.tradeSettingsStore = tradeSettingsStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
    }

    /* compiled from: TimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1 */
    static final class C149911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ TradeSettingsStore3 $instrumentType;
        final /* synthetic */ TradeSettingsStore4 $locationType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149911(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, Continuation<? super C149911> continuation) {
            super(2, continuation);
            this.$locationType = tradeSettingsStore4;
            this.$instrumentType = tradeSettingsStore3;
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149911 c149911 = TimeInForceDuxo.this.new C149911(this.$locationType, this.$instrumentType, this.$instrumentId, continuation);
            c149911.L$0 = obj;
            return c149911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$1", m3645f = "TimeInForceDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TradeSettingsStore3 $instrumentType;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ TimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TimeInForceDuxo timeInForceDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = timeInForceDuxo;
                this.$locationType = tradeSettingsStore4;
                this.$instrumentType = tradeSettingsStore3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$locationType, this.$instrumentType, continuation);
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
                    Flow flowStreamTimeInForce$default = TradeSettingsStore.streamTimeInForce$default(this.this$0.tradeSettingsStore, this.$locationType, this.$instrumentType, null, 4, null);
                    C498871 c498871 = new C498871(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTimeInForce$default, c498871, this) == coroutine_suspended) {
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

            /* compiled from: TimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderTimeInForce;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$1$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498871 extends ContinuationImpl7 implements Function2<OrderTimeInForce, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498871(TimeInForceDuxo timeInForceDuxo, Continuation<? super C498871> continuation) {
                    super(2, continuation);
                    this.this$0 = timeInForceDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498871 c498871 = new C498871(this.this$0, continuation);
                    c498871.L$0 = obj;
                    return c498871;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTimeInForce orderTimeInForce, Continuation<? super Unit> continuation) {
                    return ((C498871) create(orderTimeInForce, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$1$1$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498881 extends ContinuationImpl7 implements Function2<TimeInForceDataState, Continuation<? super TimeInForceDataState>, Object> {
                    final /* synthetic */ OrderTimeInForce $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498881(OrderTimeInForce orderTimeInForce, Continuation<? super C498881> continuation) {
                        super(2, continuation);
                        this.$it = orderTimeInForce;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498881 c498881 = new C498881(this.$it, continuation);
                        c498881.L$0 = obj;
                        return c498881;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TimeInForceDataState timeInForceDataState, Continuation<? super TimeInForceDataState> continuation) {
                        return ((C498881) create(timeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TimeInForceDataState.copy$default((TimeInForceDataState) this.L$0, this.$it, null, null, null, null, 30, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498881((OrderTimeInForce) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TimeInForceDuxo.this, this.$locationType, this.$instrumentType, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TimeInForceDuxo.this, this.$locationType, this.$instrumentType, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(TimeInForceDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(TimeInForceDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(TimeInForceDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$2", m3645f = "TimeInForceDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ TradeSettingsStore3 $instrumentType;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ TimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TimeInForceDuxo timeInForceDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = timeInForceDuxo;
                this.$locationType = tradeSettingsStore4;
                this.$instrumentType = tradeSettingsStore3;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$locationType, this.$instrumentType, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamTradingSession$default = TradeSettingsStore.streamTradingSession$default(this.this$0.tradeSettingsStore, this.$locationType, this.$instrumentType, this.$instrumentId, null, 8, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTradingSession$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: TimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$2$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TimeInForceDuxo timeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = timeInForceDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$2$1$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498891 extends ContinuationImpl7 implements Function2<TimeInForceDataState, Continuation<? super TimeInForceDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498891(OrderMarketHours orderMarketHours, Continuation<? super C498891> continuation) {
                        super(2, continuation);
                        this.$it = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498891 c498891 = new C498891(this.$it, continuation);
                        c498891.L$0 = obj;
                        return c498891;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TimeInForceDataState timeInForceDataState, Continuation<? super TimeInForceDataState> continuation) {
                        return ((C498891) create(timeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TimeInForceDataState.copy$default((TimeInForceDataState) this.L$0, null, this.$it, null, null, null, 29, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498891((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$3", m3645f = "TimeInForceDuxo.kt", m3646l = {62}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TimeInForceDuxo timeInForceDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = timeInForceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(TraderMarketHoursManager.openMarketHoursObservable$default(this.this$0.marketHoursManager, false, false, 3, null)), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: TimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$3$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TimeInForceDuxo timeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = timeInForceDuxo;
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

                /* compiled from: TimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$3$1$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498901 extends ContinuationImpl7 implements Function2<TimeInForceDataState, Continuation<? super TimeInForceDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498901(MarketHours marketHours, Continuation<? super C498901> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498901 c498901 = new C498901(this.$marketHours, continuation);
                        c498901.L$0 = obj;
                        return c498901;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TimeInForceDataState timeInForceDataState, Continuation<? super TimeInForceDataState> continuation) {
                        return ((C498901) create(timeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TimeInForceDataState.copy$default((TimeInForceDataState) this.L$0, null, null, this.$marketHours, null, null, 27, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498901((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$4", m3645f = "TimeInForceDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(TimeInForceDuxo timeInForceDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = timeInForceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.marketHoursManager.nextOpenMarketHoursObservable()), Integer.MAX_VALUE, null, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

            /* compiled from: TimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$4$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TimeInForceDuxo timeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = timeInForceDuxo;
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

                /* compiled from: TimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$4$1$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498911 extends ContinuationImpl7 implements Function2<TimeInForceDataState, Continuation<? super TimeInForceDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498911(MarketHours marketHours, Continuation<? super C498911> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498911 c498911 = new C498911(this.$marketHours, continuation);
                        c498911.L$0 = obj;
                        return c498911;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TimeInForceDataState timeInForceDataState, Continuation<? super TimeInForceDataState> continuation) {
                        return ((C498911) create(timeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TimeInForceDataState.copy$default((TimeInForceDataState) this.L$0, null, null, null, this.$marketHours, null, 23, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498911((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$5", m3645f = "TimeInForceDuxo.kt", m3646l = {80}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(TimeInForceDuxo timeInForceDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = timeInForceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EquityOrderExpireDateStore equityOrderExpireDateStore = this.this$0.orderExpireDateStore;
                    this.label = 1;
                    obj = equityOrderExpireDateStore.getExpireDate(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new AnonymousClass1(((ApiOrderExpireDate) obj).getGtc_expire_datetime(), null));
                return Unit.INSTANCE;
            }

            /* compiled from: TimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$5$1", m3645f = "TimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TimeInForceDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TimeInForceDataState, Continuation<? super TimeInForceDataState>, Object> {
                final /* synthetic */ String $orderExpStr;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$orderExpStr = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$orderExpStr, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TimeInForceDataState timeInForceDataState, Continuation<? super TimeInForceDataState> continuation) {
                    return ((AnonymousClass1) create(timeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return TimeInForceDataState.copy$default((TimeInForceDataState) this.L$0, null, null, null, null, this.$orderExpStr, 15, null);
                }
            }
        }
    }

    public final Job bind(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C149911(locationType, instrumentType, instrumentId, null), 3, null);
    }

    public final void onTimeInForceChanged(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderTimeInForce tif) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tif, "tif");
        this.tradeSettingsStore.setTimeInForcePref(locationType, instrumentType, tif);
    }
}
