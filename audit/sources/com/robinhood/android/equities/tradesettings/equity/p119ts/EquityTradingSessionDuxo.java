package com.robinhood.android.equities.tradesettings.equity.p119ts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.equities.tradesettings.experiments.TradingSessionSubtitleExperiment;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore3;
import com.robinhood.android.equities.tradesettings.store.TradeSettingsStore4;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.trading.contracts.ExperimentsKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityPositionType;
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
import kotlin.coroutines.jvm.internal.boxing;
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

/* compiled from: EquityTradingSessionDuxo.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BS\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionViewState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/common/buysell/BuySellStore;", "buySellStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "tradeSettingsStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionStateProvider;", "stateProvider", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionStateProvider;)V", "Lcom/robinhood/android/equities/tradesettings/store/LocationType;", "locationType", "Ljava/util/UUID;", "instrumentId", "", "accountNumber", "Lkotlinx/coroutines/Job;", "bind", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Ljava/util/UUID;Ljava/lang/String;)Lkotlinx/coroutines/Job;", "Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;", "instrumentType", "Lcom/robinhood/models/db/OrderMarketHours;", "tradingSession", "", "onTradingSessionChanged", "(Lcom/robinhood/android/equities/tradesettings/store/LocationType;Lcom/robinhood/android/equities/tradesettings/store/InstrumentType;Lcom/robinhood/models/db/OrderMarketHours;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/common/buysell/BuySellStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/android/equities/tradesettings/store/TradeSettingsStore;", "Lj$/time/Clock;", "lib-trade-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityTradingSessionDuxo extends BaseDuxo<EquityTradingSessionDataState, EquityTradingSessionViewState> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final BuySellStore buySellStore;
    private final Clock clock;
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final TradeSettingsStore tradeSettingsStore;

    public /* synthetic */ EquityTradingSessionDuxo(AccountProvider accountProvider, BuySellStore buySellStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, TraderMarketHoursManager traderMarketHoursManager, TradeSettingsStore tradeSettingsStore, Clock clock, DuxoBundle duxoBundle, EquityTradingSessionStateProvider equityTradingSessionStateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accountProvider, buySellStore, experimentsStore, instrumentStore, traderMarketHoursManager, tradeSettingsStore, clock, duxoBundle, (i & 256) != 0 ? new EquityTradingSessionStateProvider() : equityTradingSessionStateProvider);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityTradingSessionDuxo(AccountProvider accountProvider, BuySellStore buySellStore, ExperimentsStore experimentsStore, InstrumentStore instrumentStore, TraderMarketHoursManager marketHoursManager, TradeSettingsStore tradeSettingsStore, Clock clock, DuxoBundle duxoBundle, EquityTradingSessionStateProvider stateProvider) {
        super(new EquityTradingSessionDataState(null, null, null, null, null, null, null, clock, null, 383, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(tradeSettingsStore, "tradeSettingsStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.accountProvider = accountProvider;
        this.buySellStore = buySellStore;
        this.experimentsStore = experimentsStore;
        this.instrumentStore = instrumentStore;
        this.marketHoursManager = marketHoursManager;
        this.tradeSettingsStore = tradeSettingsStore;
        this.clock = clock;
    }

    /* compiled from: EquityTradingSessionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1 */
    static final class C150331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $instrumentId;
        final /* synthetic */ TradeSettingsStore4 $locationType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C150331(TradeSettingsStore4 tradeSettingsStore4, UUID uuid, String str, Continuation<? super C150331> continuation) {
            super(2, continuation);
            this.$locationType = tradeSettingsStore4;
            this.$instrumentId = uuid;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C150331 c150331 = EquityTradingSessionDuxo.this.new C150331(this.$locationType, this.$instrumentId, this.$accountNumber, continuation);
            c150331.L$0 = obj;
            return c150331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C150331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C499161 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C499161(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super C499161> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C499161 c499161 = new C499161(this.this$0, continuation);
                    c499161.Z$0 = ((Boolean) obj).booleanValue();
                    return c499161;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C499161) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$1$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499171 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ boolean $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499171(boolean z, Continuation<? super C499171> continuation) {
                        super(2, continuation);
                        this.$it = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499171 c499171 = new C499171(this.$it, continuation);
                        c499171.L$0 = obj;
                        return c499171;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499171) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, null, boxing.boxBoolean(this.$it), null, null, null, null, null, null, 507, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499171(this.Z$0, null));
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
                    Flow flowIsShortingEnabled$default = ExperimentsKt.isShortingEnabled$default(this.this$0.experimentsStore, false, 1, null);
                    C499161 c499161 = new C499161(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowIsShortingEnabled$default, c499161, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(EquityTradingSessionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(EquityTradingSessionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(EquityTradingSessionDuxo.this, this.$locationType, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(EquityTradingSessionDuxo.this, this.$locationType, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(EquityTradingSessionDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(EquityTradingSessionDuxo.this, this.$instrumentId, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(EquityTradingSessionDuxo.this, this.$accountNumber, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(EquityTradingSessionDuxo.this, this.$instrumentId, this.$accountNumber, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$2", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
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

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/equities/tradesettings/experiments/TradingSessionSubtitleExperiment$Variant;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$2$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TradingSessionSubtitleExperiment.Variant, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
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

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$2$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499181 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ TradingSessionSubtitleExperiment.Variant $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499181(TradingSessionSubtitleExperiment.Variant variant, Continuation<? super C499181> continuation) {
                        super(2, continuation);
                        this.$it = variant;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499181 c499181 = new C499181(this.$it, continuation);
                        c499181.L$0 = obj;
                        return c499181;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499181) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, null, null, null, null, null, null, null, this.$it, 255, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499181((TradingSessionSubtitleExperiment.Variant) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$3", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(EquityTradingSessionDuxo equityTradingSessionDuxo, TradeSettingsStore4 tradeSettingsStore4, UUID uuid, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
                this.$locationType = tradeSettingsStore4;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$locationType, this.$instrumentId, continuation);
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
                    Flow flowStreamTradingSession$default = TradeSettingsStore.streamTradingSession$default(this.this$0.tradeSettingsStore, this.$locationType, new TradeSettingsStore3.Equity(EquityPositionType.LONG), this.$instrumentId, null, 8, null);
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

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$3$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
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

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$3$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499191 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499191(OrderMarketHours orderMarketHours, Continuation<? super C499191> continuation) {
                        super(2, continuation);
                        this.$it = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499191 c499191 = new C499191(this.$it, continuation);
                        c499191.L$0 = obj;
                        return c499191;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499191) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, this.$it, null, null, null, null, null, null, null, null, 510, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499191((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$4", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {83}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            final /* synthetic */ TradeSettingsStore4 $locationType;
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(EquityTradingSessionDuxo equityTradingSessionDuxo, TradeSettingsStore4 tradeSettingsStore4, UUID uuid, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
                this.$locationType = tradeSettingsStore4;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$locationType, this.$instrumentId, continuation);
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
                    Flow flowStreamTradingSession$default = TradeSettingsStore.streamTradingSession$default(this.this$0.tradeSettingsStore, this.$locationType, new TradeSettingsStore3.Equity(EquityPositionType.SHORT), this.$instrumentId, null, 8, null);
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

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/db/OrderMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$4$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<OrderMarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
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

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$4$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$4$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499201 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ OrderMarketHours $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499201(OrderMarketHours orderMarketHours, Continuation<? super C499201> continuation) {
                        super(2, continuation);
                        this.$it = orderMarketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499201 c499201 = new C499201(this.$it, continuation);
                        c499201.L$0 = obj;
                        return c499201;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499201) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, this.$it, null, null, null, null, null, null, null, 509, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499201((OrderMarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$5", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
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

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marketHours", "Lcom/robinhood/models/db/MarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$5$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarketHours, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
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

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$5$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$5$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499211 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ MarketHours $marketHours;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499211(MarketHours marketHours, Continuation<? super C499211> continuation) {
                        super(2, continuation);
                        this.$marketHours = marketHours;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499211 c499211 = new C499211(this.$marketHours, continuation);
                        c499211.L$0 = obj;
                        return c499211;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499211) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, null, null, this.$marketHours, null, null, null, null, null, 503, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499211((MarketHours) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$6", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(EquityTradingSessionDuxo equityTradingSessionDuxo, UUID uuid, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
                this.$instrumentId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, this.$instrumentId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "instrument", "Lcom/robinhood/models/db/Instrument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$6$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Instrument, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
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

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$6$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$6$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499221 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ Instrument $instrument;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499221(Instrument instrument, Continuation<? super C499221> continuation) {
                        super(2, continuation);
                        this.$instrument = instrument;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499221 c499221 = new C499221(this.$instrument, continuation);
                        c499221.L$0 = obj;
                        return c499221;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499221) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, null, null, null, this.$instrument, null, null, null, null, 495, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499221((Instrument) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$7", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {110}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(EquityTradingSessionDuxo equityTradingSessionDuxo, String str, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "account", "Lcom/robinhood/models/db/Account;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$7$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Account, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
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

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$7$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$7$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499231 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ Account $account;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499231(Account account, Continuation<? super C499231> continuation) {
                        super(2, continuation);
                        this.$account = account;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499231 c499231 = new C499231(this.$account, continuation);
                        c499231.L$0 = obj;
                        return c499231;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499231) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, null, null, null, null, this.$account, null, null, null, 479, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499231((Account) this.L$0, null));
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
                    Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.accountProvider.streamAccount(this.$accountNumber)), Integer.MAX_VALUE, null, 2, null);
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

        /* compiled from: EquityTradingSessionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$8", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {116}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $accountNumber;
            final /* synthetic */ UUID $instrumentId;
            int label;
            final /* synthetic */ EquityTradingSessionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(EquityTradingSessionDuxo equityTradingSessionDuxo, UUID uuid, String str, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = equityTradingSessionDuxo;
                this.$instrumentId = uuid;
                this.$accountNumber = str;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, this.$instrumentId, this.$accountNumber, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityTradingSessionDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "buySellData", "Lcom/robinhood/android/common/buysell/BuySellData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$8$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BuySellData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ EquityTradingSessionDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(EquityTradingSessionDuxo equityTradingSessionDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = equityTradingSessionDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BuySellData buySellData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(buySellData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: EquityTradingSessionDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/tradesettings/equity/ts/EquityTradingSessionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$8$1$1", m3645f = "EquityTradingSessionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.equities.tradesettings.equity.ts.EquityTradingSessionDuxo$bind$1$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C499241 extends ContinuationImpl7 implements Function2<EquityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState>, Object> {
                    final /* synthetic */ BuySellData $buySellData;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C499241(BuySellData buySellData, Continuation<? super C499241> continuation) {
                        super(2, continuation);
                        this.$buySellData = buySellData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C499241 c499241 = new C499241(this.$buySellData, continuation);
                        c499241.L$0 = obj;
                        return c499241;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(EquityTradingSessionDataState equityTradingSessionDataState, Continuation<? super EquityTradingSessionDataState> continuation) {
                        return ((C499241) create(equityTradingSessionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return EquityTradingSessionDataState.copy$default((EquityTradingSessionDataState) this.L$0, null, null, null, null, null, null, this.$buySellData, null, null, 447, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C499241((BuySellData) this.L$0, null));
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
                    Flow<BuySellData> buySellData = this.this$0.buySellStore.getBuySellData(this.$instrumentId, this.$accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(buySellData, anonymousClass1, this) == coroutine_suspended) {
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

    public final Job bind(TradeSettingsStore4 locationType, UUID instrumentId, String accountNumber) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C150331(locationType, instrumentId, accountNumber, null), 3, null);
    }

    public final void onTradingSessionChanged(TradeSettingsStore4 locationType, TradeSettingsStore3 instrumentType, OrderMarketHours tradingSession) {
        Intrinsics.checkNotNullParameter(locationType, "locationType");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(tradingSession, "tradingSession");
        this.tradeSettingsStore.setTradingSessionPref(locationType, instrumentType, tradingSession);
    }
}
