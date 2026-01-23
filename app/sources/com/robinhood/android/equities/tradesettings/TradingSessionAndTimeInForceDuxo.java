package com.robinhood.android.equities.tradesettings;

import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.api.ApiOrderExpireDate;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
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
import p479j$.time.Clock;

/* compiled from: TradingSessionAndTimeInForceDuxo.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BS\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J%\u0010*\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceViewState;", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "accountStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "orderExpireDateStore", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/librobinhood/data/store/AccountStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceStateProvider;)V", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "locationType", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentType", "Ljava/util/UUID;", "instrumentId", "", "accountNumber", "Lkotlinx/coroutines/Job;", "bind", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Ljava/util/UUID;Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/models/db/OrderMarketHours;", "tradingSession", "", "onTradingSessionChanged", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderMarketHours;)V", "Lcom/robinhood/models/db/OrderTimeInForce;", "tif", "onTimeInForceChanged", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderTimeInForce;)V", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lj$/time/Clock;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TradingSessionAndTimeInForceDuxo extends BaseDuxo<TradingSessionAndTimeInForceDataState, TradingSessionAndTimeInForceViewState> {
    public static final int $stable = 8;
    private final AccountStore accountStore;
    private final Clock clock;
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final EquityOrderExpireDateStore orderExpireDateStore;
    private final TradeSettingsStore tradeSettingsStore;

    public /* synthetic */ TradingSessionAndTimeInForceDuxo(AccountStore accountStore, InstrumentStore instrumentStore, TraderMarketHoursManager traderMarketHoursManager, EquityOrderExpireDateStore equityOrderExpireDateStore, TradeSettingsStore tradeSettingsStore, ExperimentsStore experimentsStore, Clock clock, DuxoBundle duxoBundle, TradingSessionAndTimeInForceStateProvider tradingSessionAndTimeInForceStateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountStore, instrumentStore, traderMarketHoursManager, equityOrderExpireDateStore, tradeSettingsStore, experimentsStore, clock, duxoBundle, (i & 256) != 0 ? new TradingSessionAndTimeInForceStateProvider() : tradingSessionAndTimeInForceStateProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingSessionAndTimeInForceDuxo(AccountStore accountStore, InstrumentStore instrumentStore, TraderMarketHoursManager marketHoursManager, EquityOrderExpireDateStore orderExpireDateStore, TradeSettingsStore tradeSettingsStore, ExperimentsStore experimentsStore, Clock clock, DuxoBundle duxoBundle, TradingSessionAndTimeInForceStateProvider stateProvider) {
        super(new TradingSessionAndTimeInForceDataState(null, null, null, null, null, null, null, null, null, clock, 511, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountStore = accountStore;
        this.instrumentStore = instrumentStore;
        this.marketHoursManager = marketHoursManager;
        this.orderExpireDateStore = orderExpireDateStore;
        this.tradeSettingsStore = tradeSettingsStore;
        this.experimentsStore = experimentsStore;
        this.clock = clock;
    }

    /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$1 */
    static final class C149921 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
        final /* synthetic */ TradeSettingsStore3 $instrumentType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149921(TradeSettingsStore3 tradeSettingsStore3, Continuation<? super C149921> continuation) {
            super(2, continuation);
            this.$instrumentType = tradeSettingsStore3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149921 c149921 = new C149921(this.$instrumentType, continuation);
            c149921.L$0 = obj;
            return c149921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
            return ((C149921) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState = (TradingSessionAndTimeInForceDataState) this.L$0;
            TradeSettingsStore3 tradeSettingsStore3 = this.$instrumentType;
            TradeSettingsStore3.Equity equity = tradeSettingsStore3 instanceof TradeSettingsStore3.Equity ? (TradeSettingsStore3.Equity) tradeSettingsStore3 : null;
            return TradingSessionAndTimeInForceDataState.copy$default(tradingSessionAndTimeInForceDataState, null, null, null, null, null, null, null, equity != null ? equity.getPositionType() : null, null, null, 895, null);
        }
    }

    public final Job bind(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C149921(instrumentType, null));
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C149932(locationType, instrumentType, instrumentId, accountNumber, null), 3, null);
    }

    /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2 */
    static final class C149932 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ TradeSettingsStore3 $instrumentType;
        final /* synthetic */ TradeSettingsStore4 $locationType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C149932(TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, String str, Continuation<? super C149932> continuation) {
            super(2, continuation);
            this.$locationType = tradeSettingsStore4;
            this.$instrumentType = tradeSettingsStore3;
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C149932 c149932 = TradingSessionAndTimeInForceDuxo.this.new C149932(this.$locationType, this.$instrumentType, this.$instrumentId, this.$accountNumber, continuation);
            c149932.L$0 = obj;
            return c149932;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C149932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ TradeSettingsStore3 $instrumentType;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
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
                    C498921 c498921 = new C498921(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTradingSession$default, c498921, this) == coroutine_suspended) {
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498921 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498921(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super C498921> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C498921 c498921 = new C498921(this.this$0, continuation);
                    c498921.L$0 = obj;
                    return c498921;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderMarketHours orderMarketHours, Continuation<? super Unit> continuation) {
                    return ((C498921) create(orderMarketHours, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$1$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498931 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498931(OrderMarketHours orderMarketHours, Continuation<? super C498931> continuation) {
                        super(2, continuation);
                        this.$it = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498931 c498931 = new C498931(this.$it, continuation);
                        c498931.L$0 = obj;
                        return c498931;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498931) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, this.$it, null, null, null, null, null, null, null, null, null, 1022, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498931((OrderMarketHours) this.L$0, null));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(TradingSessionAndTimeInForceDuxo.this, this.$locationType, this.$instrumentType, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(TradingSessionAndTimeInForceDuxo.this, this.$locationType, this.$instrumentType, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(TradingSessionAndTimeInForceDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(TradingSessionAndTimeInForceDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(TradingSessionAndTimeInForceDuxo.this, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(TradingSessionAndTimeInForceDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(TradingSessionAndTimeInForceDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(TradingSessionAndTimeInForceDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$2", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TradeSettingsStore3 $instrumentType;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, TradeSettingsStore4 tradeSettingsStore4, TradeSettingsStore3 tradeSettingsStore3, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
                this.$locationType = tradeSettingsStore4;
                this.$instrumentType = tradeSettingsStore3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$locationType, this.$instrumentType, continuation);
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
                    Flow flowStreamTimeInForce$default = TradeSettingsStore.streamTimeInForce$default(this.this$0.tradeSettingsStore, this.$locationType, this.$instrumentType, null, 4, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamTimeInForce$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderTimeInForce;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$2$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderTimeInForce, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(OrderTimeInForce orderTimeInForce, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(orderTimeInForce, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$2$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498941 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ OrderTimeInForce $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498941(OrderTimeInForce orderTimeInForce, Continuation<? super C498941> continuation) {
                        super(2, continuation);
                        this.$it = orderTimeInForce;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498941 c498941 = new C498941(this.$it, continuation);
                        c498941.L$0 = obj;
                        return c498941;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498941) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, null, null, null, this.$it, null, null, null, null, null, ErrorCodes.IO_EXCEPTION, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498941((OrderTimeInForce) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$3", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$3$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
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

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$3$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498951 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498951(MarketHours marketHours, Continuation<? super C498951> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498951 c498951 = new C498951(this.$marketHours, continuation);
                        c498951.L$0 = obj;
                        return c498951;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498951) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, this.$marketHours, null, null, null, null, null, null, null, null, 1021, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498951((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$4", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$4$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
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

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$4$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498961 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498961(MarketHours marketHours, Continuation<? super C498961> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498961 c498961 = new C498961(this.$marketHours, continuation);
                        c498961.L$0 = obj;
                        return c498961;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498961) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, null, null, null, null, this.$marketHours, null, null, null, null, 991, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498961((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$5", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {100}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, UUID uuid, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, this.$instrumentId, continuation);
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$5$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
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

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$5$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498971 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ Instrument $instrument;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498971(Instrument instrument, Continuation<? super C498971> continuation) {
                        super(2, continuation);
                        this.$instrument = instrument;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498971 c498971 = new C498971(this.$instrument, continuation);
                        c498971.L$0 = obj;
                        return c498971;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498971) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, null, this.$instrument, null, null, null, null, null, null, null, 1019, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498971((Instrument) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$6", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, String str, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$6$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
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

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$6$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498981 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498981(Account account, Continuation<? super C498981> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498981 c498981 = new C498981(this.$account, continuation);
                        c498981.L$0 = obj;
                        return c498981;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498981) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, null, null, this.$account, null, null, null, null, null, null, 1015, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498981((Account) this.L$0, null));
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

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$7", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {114}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$7$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
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
                public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                    return ((AnonymousClass1) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, null, null, null, null, null, this.$orderExpStr, null, null, null, 959, null);
                }
            }
        }

        /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$8", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = tradingSessionAndTimeInForceDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCoStreamVariant = this.this$0.experimentsStore.coStreamVariant(TradingSessionSubtitleExperiment.INSTANCE, TradingSessionSubtitleExperiment.Variant.CONTROL, true);
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

            /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "variant", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$8$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradingSessionSubtitleExperiment.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TradingSessionAndTimeInForceDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TradingSessionAndTimeInForceDuxo tradingSessionAndTimeInForceDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = tradingSessionAndTimeInForceDuxo;
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

                /* compiled from: TradingSessionAndTimeInForceDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/TradingSessionAndTimeInForceDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$8$1$1", m3645f = "TradingSessionAndTimeInForceDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.TradingSessionAndTimeInForceDuxo$bind$2$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C498991 extends ContinuationImpl7 implements Function2<TradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState>, Object> {
                    final /* synthetic */ TradingSessionSubtitleExperiment.Variant $variant;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C498991(TradingSessionSubtitleExperiment.Variant variant, Continuation<? super C498991> continuation) {
                        super(2, continuation);
                        this.$variant = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C498991 c498991 = new C498991(this.$variant, continuation);
                        c498991.L$0 = obj;
                        return c498991;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(TradingSessionAndTimeInForceDataState tradingSessionAndTimeInForceDataState, Continuation<? super TradingSessionAndTimeInForceDataState> continuation) {
                        return ((C498991) create(tradingSessionAndTimeInForceDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return TradingSessionAndTimeInForceDataState.copy$default((TradingSessionAndTimeInForceDataState) this.L$0, null, null, null, null, null, null, null, null, this.$variant, null, 767, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C498991((TradingSessionSubtitleExperiment.Variant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onTradingSessionChanged(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderMarketHours tradingSession) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.tradeSettingsStore.setTradingSessionPref(locationType, instrumentType, tradingSession);
    }

    public final void onTimeInForceChanged(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderTimeInForce tif) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tif, "tif");
        this.tradeSettingsStore.setTimeInForcePref(locationType, instrumentType, tif);
    }
}
