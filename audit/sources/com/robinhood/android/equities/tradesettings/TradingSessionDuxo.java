package com.robinhood.android.equities.tradesettings;

import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OrderMarketHours;
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
import p479j$.time.Clock;

/* compiled from: TradingSessionDuxo.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionViewState;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/experiments/ExperimentsProvider;", "experimentProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equities/tradesettings/TradingSessionStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lj$/time/Clock;Lcom/robinhood/experiments/ExperimentsProvider;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equities/tradesettings/TradingSessionStateProvider;)V", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentType", "Ljava/util/UUID;", "instrumentId", "", "accountNumber", "Lkotlinx/coroutines/Job;", "bind", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/util/UUID;Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/models/db/OrderMarketHours;", "tradingSession", "", "onTradingSessionChanged", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderMarketHours;)V", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Lj$/time/Clock;", "Lcom/robinhood/experiments/ExperimentsProvider;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TradingSessionDuxo extends BaseDuxo<TradingSessionDataState, TradingSessionViewState> {
    public static final int $stable = 8;
    private final AccountStore accountStore;
    private final Clock clock;
    private final ExperimentsProvider experimentProvider;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final TradeSettingsStore tradeSettingsStore;

    public /* synthetic */ TradingSessionDuxo(AccountStore accountStore, InstrumentStore instrumentStore, TraderMarketHoursManager traderMarketHoursManager, TradeSettingsStore tradeSettingsStore, Clock clock, ExperimentsProvider experimentsProvider, DuxoBundle duxoBundle, TradingSessionStateProvider tradingSessionStateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountStore, instrumentStore, traderMarketHoursManager, tradeSettingsStore, clock, experimentsProvider, duxoBundle, (i & 128) != 0 ? new TradingSessionStateProvider() : tradingSessionStateProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingSessionDuxo(AccountStore accountStore, InstrumentStore instrumentStore, TraderMarketHoursManager marketHoursManager, TradeSettingsStore tradeSettingsStore, Clock clock, ExperimentsProvider experimentProvider, DuxoBundle duxoBundle, TradingSessionStateProvider stateProvider) {
        super(new TradingSessionDataState(null, null, null, null, clock, null, 47, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountStore = accountStore;
        this.instrumentStore = instrumentStore;
        this.marketHoursManager = marketHoursManager;
        this.tradeSettingsStore = tradeSettingsStore;
        this.clock = clock;
        this.experimentProvider = experimentProvider;
    }

    /* compiled from: TradingSessionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1 */
    static final class C149951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ TradeSettingsStore3 $instrumentType;
        final /* synthetic */ TradeSettingsStore4 $locationType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149951(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, String str, Continuation<? super C149951> continuation) {
            super(2, continuation);
            this.$locationType = tradeSettingsStore4;
            this.$instrumentType = tradeSettingsStore3;
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149951 c149951 = TradingSessionDuxo.this.new C149951(this.$locationType, this.$instrumentType, this.$instrumentId, this.$accountNumber, continuation);
            c149951.L$0 = obj;
            return c149951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ TradeSettingsStore3 $instrumentType;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ TradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TradingSessionDuxo tradingSessionDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionDuxo;
                this.$locationType = tradeSettingsStore4;
                this.$instrumentType = tradeSettingsStore3;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$locationType, this.$instrumentType, this.$instrumentId, continuation);
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
                    Flow flowStreamTradingSession$default = TradeSettingsStore.streamTradingSession$default(this.this$0.tradeSettingsStore, this.$locationType, this.$instrumentType, this.$instrumentId, null, 8, null);
                    C499001 c499001 = new C499001(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTradingSession$default, c499001, this) == coroutine_suspended) {
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

            /* compiled from: TradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499001 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499001(TradingSessionDuxo tradingSessionDuxo, Continuation<? super C499001> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499001 c499001 = new C499001(this.this$0, continuation);
                    c499001.L$0 = obj;
                    return c499001;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((C499001) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$1$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499011 extends ContinuationImpl7 implements Function2<TradingSessionDataState, Continuation<? super TradingSessionDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499011(OrderMarketHours orderMarketHours, Continuation<? super C499011> continuation) {
                        super(2, continuation);
                        this.$it = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499011 c499011 = new C499011(this.$it, continuation);
                        c499011.L$0 = obj;
                        return c499011;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionDataState tradingSessionDataState, Continuation<? super TradingSessionDataState> continuation) {
                        return ((C499011) create(tradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionDataState.copy$default((TradingSessionDataState) this.L$0, this.$it, null, null, null, null, null, 62, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499011((OrderMarketHours) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TradingSessionDuxo.this, this.$locationType, this.$instrumentType, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TradingSessionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(TradingSessionDuxo.this, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(TradingSessionDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(TradingSessionDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$2", m3645f = "TradingSessionDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TradingSessionDuxo tradingSessionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
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

            /* compiled from: TradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$2$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionDuxo tradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionDuxo;
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

                /* compiled from: TradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$2$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499021 extends ContinuationImpl7 implements Function2<TradingSessionDataState, Continuation<? super TradingSessionDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499021(MarketHours marketHours, Continuation<? super C499021> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499021 c499021 = new C499021(this.$marketHours, continuation);
                        c499021.L$0 = obj;
                        return c499021;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionDataState tradingSessionDataState, Continuation<? super TradingSessionDataState> continuation) {
                        return ((C499021) create(tradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionDataState.copy$default((TradingSessionDataState) this.L$0, null, this.$marketHours, null, null, null, null, 61, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499021((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$3", m3645f = "TradingSessionDuxo.kt", m3646l = {70}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ TradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TradingSessionDuxo tradingSessionDuxo, UUID uuid, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$instrumentId, continuation);
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
                    this.this$0.instrumentStore.refresh(false, this.$instrumentId);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.instrumentStore.getInstrument(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null);
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

            /* compiled from: TradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$3$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionDuxo tradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Instrument instrument, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(instrument, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$3$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499031 extends ContinuationImpl7 implements Function2<TradingSessionDataState, Continuation<? super TradingSessionDataState>, Object> {
                    final /* synthetic */ Instrument $instrument;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499031(Instrument instrument, Continuation<? super C499031> continuation) {
                        super(2, continuation);
                        this.$instrument = instrument;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499031 c499031 = new C499031(this.$instrument, continuation);
                        c499031.L$0 = obj;
                        return c499031;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionDataState tradingSessionDataState, Continuation<? super TradingSessionDataState> continuation) {
                        return ((C499031) create(tradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionDataState.copy$default((TradingSessionDataState) this.L$0, null, null, this.$instrument, null, null, null, 59, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499031((Instrument) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$4", m3645f = "TradingSessionDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ TradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(TradingSessionDuxo tradingSessionDuxo, String str, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$4$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionDuxo tradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Account account, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(account, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$4$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499041 extends ContinuationImpl7 implements Function2<TradingSessionDataState, Continuation<? super TradingSessionDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499041(Account account, Continuation<? super C499041> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499041 c499041 = new C499041(this.$account, continuation);
                        c499041.L$0 = obj;
                        return c499041;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionDataState tradingSessionDataState, Continuation<? super TradingSessionDataState> continuation) {
                        return ((C499041) create(tradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionDataState.copy$default((TradingSessionDataState) this.L$0, null, null, null, this.$account, null, null, 55, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499041((Account) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountStore.streamAccount(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null);
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
        }

        /* compiled from: TradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$5", m3645f = "TradingSessionDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(TradingSessionDuxo tradingSessionDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionDuxo;
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
                    Flow flowCoStreamVariant = this.this$0.experimentProvider.coStreamVariant(TradingSessionSubtitleExperiment.INSTANCE, TradingSessionSubtitleExperiment.Variant.CONTROL, true);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCoStreamVariant, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: TradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$5$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradingSessionSubtitleExperiment.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionDuxo tradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TradingSessionSubtitleExperiment.Variant variant, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(variant, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$5$1$1", m3645f = "TradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionDuxo$bind$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499051 extends ContinuationImpl7 implements Function2<TradingSessionDataState, Continuation<? super TradingSessionDataState>, Object> {
                    final /* synthetic */ TradingSessionSubtitleExperiment.Variant $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499051(TradingSessionSubtitleExperiment.Variant variant, Continuation<? super C499051> continuation) {
                        super(2, continuation);
                        this.$it = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499051 c499051 = new C499051(this.$it, continuation);
                        c499051.L$0 = obj;
                        return c499051;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionDataState tradingSessionDataState, Continuation<? super TradingSessionDataState> continuation) {
                        return ((C499051) create(tradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionDataState.copy$default((TradingSessionDataState) this.L$0, null, null, null, null, null, this.$it, 31, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C499051((TradingSessionSubtitleExperiment.Variant) this.L$0, null));
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public final Job bind(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C149951(locationType, instrumentType, instrumentId, accountNumber, null), 3, null);
    }

    public final void onTradingSessionChanged(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderMarketHours tradingSession) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.tradeSettingsStore.setTradingSessionPref(locationType, instrumentType, tradingSession);
    }
}
