package com.robinhood.android.trade.equity.activity;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.buysell.BuySellData;
import com.robinhood.android.common.buysell.BuySellStore;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.equity.ShareBasedMarketBuysRegionGate;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.trade.equity.activity.EquityOrderActivityEvent;
import com.robinhood.android.trade.equity.util.Orders;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.trading.contracts.EquitiesSubzeroKillswitchV2;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.EquityOrderDefaultStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.models.p320db.DefaultableOrderConfiguration;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.shared.equities.store.subzero.SubzeroKillswitchStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import timber.log.Timber;

/* compiled from: EquityOrderActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00016By\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\u001a\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u000e\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/J\u0014\u00100\u001a\u00020&2\n\b\u0002\u00101\u001a\u0004\u0018\u00010,H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020&H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "equityOrderDefaultStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "buySellStore", "Lcom/robinhood/android/common/buysell/BuySellStore;", "subzeroKillswitchStore", "Lcom/robinhood/shared/equities/store/subzero/SubzeroKillswitchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/librobinhood/data/store/EquityOrderDefaultStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/android/common/buysell/BuySellStore;Lcom/robinhood/shared/equities/store/subzero/SubzeroKillswitchStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "startStores", "instrumentId", "Ljava/util/UUID;", "initialAccountNumber", "", "setOrderConfiguration", "equityOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "submitQuoteFetchErrorEvent", "accountNum", "logFlowSource", "equityOrderFlowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "resolveEffectiveSide", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EquityOrderActivityDuxo extends BaseDuxo5<EquityOrderActivityViewState, EquityOrderActivityEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final BuySellStore buySellStore;
    private final EquityOrderDefaultStore equityOrderDefaultStore;
    private final ExperimentsStore experimentsStore;
    private final InstrumentStore instrumentStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final NbboSummaryStore nbboSummaryStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final SubzeroKillswitchStore subzeroKillswitchStore;
    private final TaxLotsCachedService taxLotsCachedService;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EquityOrderActivityDuxo(InstrumentStore instrumentStore, PositionStore positionStore, AccountProvider accountProvider, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, QuoteStore quoteStore, TraderMarketHoursManager marketHoursManager, NbboSummaryStore nbboSummaryStore, EquityOrderDefaultStore equityOrderDefaultStore, SavedStateHandle savedStateHandle, TaxLotsCachedService taxLotsCachedService, BuySellStore buySellStore, SubzeroKillswitchStore subzeroKillswitchStore, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(equityOrderDefaultStore, "equityOrderDefaultStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(buySellStore, "buySellStore");
        Intrinsics.checkNotNullParameter(subzeroKillswitchStore, "subzeroKillswitchStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        DefaultableOrderConfiguration defaultOrderConfiguration = equityOrderDefaultStore.getDefaultOrderConfiguration();
        Companion companion = INSTANCE;
        UUID instrumentId = ((EquityOrderActivityIntentKey) companion.getExtras(savedStateHandle)).getInstrumentId();
        String completionUrl = ((EquityOrderActivityIntentKey) companion.getExtras(savedStateHandle)).getCompletionUrl();
        boolean isPreIpo = ((EquityOrderActivityIntentKey) companion.getExtras(savedStateHandle)).getIsPreIpo();
        Instrument instrument = null;
        EquityOrderSide equityOrderSide = null;
        Boolean bool = null;
        boolean z = false;
        String str = null;
        Position position = null;
        TradingSession tradingSession = null;
        EquityOrderConfiguration equityOrderConfiguration = null;
        super(new EquityOrderActivityViewState(instrumentId, instrument, equityOrderSide, completionUrl, Boolean.valueOf(isPreIpo), bool, z, str, ((EquityOrderActivityIntentKey) companion.getExtras(savedStateHandle)).getAccountNumber(), position, tradingSession, equityOrderConfiguration, ((EquityOrderActivityIntentKey) companion.getExtras(savedStateHandle)).getFlowSource(), defaultOrderConfiguration, false, false, 52966, null), duxoBundle);
        this.instrumentStore = instrumentStore;
        this.positionStore = positionStore;
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.quoteStore = quoteStore;
        this.marketHoursManager = marketHoursManager;
        this.nbboSummaryStore = nbboSummaryStore;
        this.equityOrderDefaultStore = equityOrderDefaultStore;
        this.savedStateHandle = savedStateHandle;
        this.taxLotsCachedService = taxLotsCachedService;
        this.buySellStore = buySellStore;
        this.subzeroKillswitchStore = subzeroKillswitchStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        resolveEffectiveSide();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C293721(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C293732(null));
        applyMutation(new C293743(null));
        Companion companion = INSTANCE;
        startStores(((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) this)).getInstrumentId(), ((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) this)).getAccountNumber());
        logFlowSource(((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) this)).getFlowSource());
        this.instrumentStore.refresh(false, ((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) this)).getInstrumentId());
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$1 */
    static final class C293721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C293721(Continuation<? super C293721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivityDuxo.this.new C293721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TaxLotsCachedService taxLotsCachedService = EquityOrderActivityDuxo.this.taxLotsCachedService;
                this.label = 1;
                if (taxLotsCachedService.retainUntilCanceled(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$2", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {93}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$2 */
    static final class C293732 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C293732(Continuation<? super C293732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivityDuxo.this.new C293732(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293732) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(ExperimentsKt.streamWithExperiment(EquityOrderActivityDuxo.this.regionGateProvider, EquityOrderActivityDuxo.this.experimentsStore, SubzeroRegionGate.INSTANCE, EquitiesSubzero.INSTANCE, false)), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(EquityOrderActivityDuxo.this, null);
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

        /* compiled from: EquityOrderActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$2$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityOrderActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityOrderActivityDuxo equityOrderActivityDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderActivityDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: EquityOrderActivityDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$2$1$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505711 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
                final /* synthetic */ boolean $enabled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505711(boolean z, Continuation<? super C505711> continuation) {
                    super(2, continuation);
                    this.$enabled = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505711 c505711 = new C505711(this.$enabled, continuation);
                    c505711.L$0 = obj;
                    return c505711;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
                    return ((C505711) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
                    return equityOrderActivityViewState.copy((32767 & 1) != 0 ? equityOrderActivityViewState.instrumentId : null, (32767 & 2) != 0 ? equityOrderActivityViewState.instrument : null, (32767 & 4) != 0 ? equityOrderActivityViewState.side : null, (32767 & 8) != 0 ? equityOrderActivityViewState.completionUrl : null, (32767 & 16) != 0 ? equityOrderActivityViewState.isPreIpo : null, (32767 & 32) != 0 ? equityOrderActivityViewState.isOtc : null, (32767 & 64) != 0 ? equityOrderActivityViewState.isTwentyFourHourMarketSession : false, (32767 & 128) != 0 ? equityOrderActivityViewState.individualAccountNumber : null, (32767 & 256) != 0 ? equityOrderActivityViewState.providedAccountNumber : null, (32767 & 512) != 0 ? equityOrderActivityViewState.accountPosition : null, (32767 & 1024) != 0 ? equityOrderActivityViewState.tradingSession : null, (32767 & 2048) != 0 ? equityOrderActivityViewState.orderConfiguration : null, (32767 & 4096) != 0 ? equityOrderActivityViewState.equityOrderFlowSource : null, (32767 & 8192) != 0 ? equityOrderActivityViewState.defaultableOrderConfiguration : null, (32767 & 16384) != 0 ? equityOrderActivityViewState.isMarketBuysEnabled : false, (32767 & 32768) != 0 ? equityOrderActivityViewState.buyToCloseExperimentEnabled : this.$enabled);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505711(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$3", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onCreate$3 */
    static final class C293743 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C293743(Continuation<? super C293743> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C293743 c293743 = EquityOrderActivityDuxo.this.new C293743(continuation);
            c293743.L$0 = obj;
            return c293743;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
            return ((C293743) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
            Companion companion = EquityOrderActivityDuxo.INSTANCE;
            EquityOrderConfiguration overrideLaunchOrderConfiguration = ((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) EquityOrderActivityDuxo.this)).getOverrideLaunchOrderConfiguration();
            if (overrideLaunchOrderConfiguration == null) {
                Order orderToModify = ((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) EquityOrderActivityDuxo.this)).getOrderToModify();
                overrideLaunchOrderConfiguration = orderToModify != null ? Orders.extend(orderToModify) : null;
                if (overrideLaunchOrderConfiguration == null) {
                    overrideLaunchOrderConfiguration = equityOrderActivityViewState.getOrderConfiguration();
                }
            }
            return equityOrderActivityViewState.copy((32767 & 1) != 0 ? equityOrderActivityViewState.instrumentId : null, (32767 & 2) != 0 ? equityOrderActivityViewState.instrument : null, (32767 & 4) != 0 ? equityOrderActivityViewState.side : null, (32767 & 8) != 0 ? equityOrderActivityViewState.completionUrl : null, (32767 & 16) != 0 ? equityOrderActivityViewState.isPreIpo : null, (32767 & 32) != 0 ? equityOrderActivityViewState.isOtc : null, (32767 & 64) != 0 ? equityOrderActivityViewState.isTwentyFourHourMarketSession : false, (32767 & 128) != 0 ? equityOrderActivityViewState.individualAccountNumber : null, (32767 & 256) != 0 ? equityOrderActivityViewState.providedAccountNumber : null, (32767 & 512) != 0 ? equityOrderActivityViewState.accountPosition : null, (32767 & 1024) != 0 ? equityOrderActivityViewState.tradingSession : null, (32767 & 2048) != 0 ? equityOrderActivityViewState.orderConfiguration : overrideLaunchOrderConfiguration, (32767 & 4096) != 0 ? equityOrderActivityViewState.equityOrderFlowSource : null, (32767 & 8192) != 0 ? equityOrderActivityViewState.defaultableOrderConfiguration : null, (32767 & 16384) != 0 ? equityOrderActivityViewState.isMarketBuysEnabled : false, (32767 & 32768) != 0 ? equityOrderActivityViewState.buyToCloseExperimentEnabled : false);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.marketHoursManager.streamIsAdtHours(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderActivityDuxo.onResume$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C293752(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(EquityOrderActivityDuxo equityOrderActivityDuxo, boolean z) {
        equityOrderActivityDuxo.applyMutation(new EquityOrderActivityDuxo2(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onResume$2", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onResume$2 */
    static final class C293752 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C293752(Continuation<? super C293752> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivityDuxo.this.new C293752(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293752) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityOrderActivityDuxo equityOrderActivityDuxo = EquityOrderActivityDuxo.this;
            equityOrderActivityDuxo.applyMutation(new AnonymousClass1(equityOrderActivityDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityOrderActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onResume$2$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$onResume$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
            int I$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ EquityOrderActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityOrderActivityDuxo equityOrderActivityDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderActivityDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
                return ((AnonymousClass1) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EquityOrderActivityViewState equityOrderActivityViewState;
                Object objFirst;
                int i;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
                    Flow<TradingSession> currentTradingSession = this.this$0.marketHoursManager.getCurrentTradingSession();
                    this.L$0 = equityOrderActivityViewState;
                    this.I$0 = 0;
                    this.label = 1;
                    objFirst = FlowKt.first(currentTradingSession, this);
                    if (objFirst == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 0;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    objFirst = obj;
                }
                EquityOrderActivityViewState equityOrderActivityViewState2 = equityOrderActivityViewState;
                return equityOrderActivityViewState2.copy((32767 & 1) != 0 ? equityOrderActivityViewState2.instrumentId : null, (32767 & 2) != 0 ? equityOrderActivityViewState2.instrument : null, (32767 & 4) != 0 ? equityOrderActivityViewState2.side : null, (32767 & 8) != 0 ? equityOrderActivityViewState2.completionUrl : null, (32767 & 16) != 0 ? equityOrderActivityViewState2.isPreIpo : null, (32767 & 32) != 0 ? equityOrderActivityViewState2.isOtc : null, (32767 & 64) != 0 ? equityOrderActivityViewState2.isTwentyFourHourMarketSession : i != 0, (32767 & 128) != 0 ? equityOrderActivityViewState2.individualAccountNumber : null, (32767 & 256) != 0 ? equityOrderActivityViewState2.providedAccountNumber : null, (32767 & 512) != 0 ? equityOrderActivityViewState2.accountPosition : null, (32767 & 1024) != 0 ? equityOrderActivityViewState2.tradingSession : (TradingSession) objFirst, (32767 & 2048) != 0 ? equityOrderActivityViewState2.orderConfiguration : null, (32767 & 4096) != 0 ? equityOrderActivityViewState2.equityOrderFlowSource : null, (32767 & 8192) != 0 ? equityOrderActivityViewState2.defaultableOrderConfiguration : null, (32767 & 16384) != 0 ? equityOrderActivityViewState2.isMarketBuysEnabled : false, (32767 & 32768) != 0 ? equityOrderActivityViewState2.buyToCloseExperimentEnabled : false);
            }
        }
    }

    private final void startStores(final UUID instrumentId, String initialAccountNumber) {
        LifecycleHost.DefaultImpls.bind$default(this, this.instrumentStore.getInstrument(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderActivityDuxo.startStores$lambda$1(this.f$0, (Instrument) obj);
            }
        });
        if (initialAccountNumber == null) {
            LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.getIndividualAccountNumber(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderActivityDuxo.startStores$lambda$2(this.f$0, (Optional) obj);
                }
            });
            Single<R> singleFlatMap = this.accountProvider.getIndividualAccountNumber().flatMap(new Function() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo.startStores.3
                @Override // io.reactivex.functions.Function
                public final SingleSource<? extends Optional<Position>> apply(Optional<String> optional) {
                    Intrinsics.checkNotNullParameter(optional, "<destruct>");
                    String strComponent1 = optional.component1();
                    if (strComponent1 == null) {
                        Single singleJust = Single.just(Optional2.INSTANCE);
                        Intrinsics.checkNotNull(singleJust);
                        return singleJust;
                    }
                    Single<T> singleTimeout = PositionStore.getPositionForAccountOptional$default(EquityOrderActivityDuxo.this.positionStore, instrumentId, strComponent1, false, 4, null).firstOrError().timeout(3000L, TimeUnit.MILLISECONDS, Single.just(Optional2.INSTANCE));
                    Intrinsics.checkNotNull(singleTimeout);
                    return singleTimeout;
                }
            });
            Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleFlatMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderActivityDuxo.startStores$lambda$3(this.f$0, (Optional) obj);
                }
            });
            Observable observableTake = this.accountProvider.getIndividualAccountNumber().flatMapObservable(new Function() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo.startStores.5
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Quote> apply(Optional<String> optional) {
                    Intrinsics.checkNotNullParameter(optional, "<destruct>");
                    final String strComponent1 = optional.component1();
                    Observable<Quote> observableAsObservable = EquityOrderActivityDuxo.this.quoteStore.getStreamQuote().asObservable(instrumentId);
                    final EquityOrderActivityDuxo equityOrderActivityDuxo = EquityOrderActivityDuxo.this;
                    return observableAsObservable.doOnError(new Consumer() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo.startStores.5.1
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Throwable th) {
                            equityOrderActivityDuxo.submitQuoteFetchErrorEvent(strComponent1);
                        }
                    });
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            ScopedObservable.subscribe$default(LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null), null, new Consumer() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo.startStores.6
                @Override // io.reactivex.functions.Consumer
                public final void accept(Throwable th) {
                }
            }, null, 5, null);
        } else {
            Observable<Quote> observableTake2 = this.quoteStore.getStreamQuote().asObservable(instrumentId).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableTake2, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderActivityDuxo.startStores$lambda$4((Quote) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderActivityDuxo.startStores$lambda$5(this.f$0, (Throwable) obj);
                }
            }, null, null, 12, null);
            Single singleTimeout = PositionStore.getPositionForAccountOptional$default(this.positionStore, instrumentId, initialAccountNumber, false, 4, null).firstOrError().timeout(3000L, TimeUnit.MILLISECONDS, Single.just(Optional2.INSTANCE));
            Intrinsics.checkNotNullExpressionValue(singleTimeout, "timeout(...)");
            LifecycleHost.DefaultImpls.bind$default(this, singleTimeout, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EquityOrderActivityDuxo.startStores$lambda$6(this.f$0, (Optional) obj);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, this.nbboSummaryStore.refresh(instrumentId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, ShareBasedMarketBuysRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderActivityDuxo.startStores$lambda$7(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C2937911(instrumentId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$1(EquityOrderActivityDuxo equityOrderActivityDuxo, Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        equityOrderActivityDuxo.applyMutation(new EquityOrderActivityDuxo4(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$2(EquityOrderActivityDuxo equityOrderActivityDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        String str = (String) optional.component1();
        if (str != null) {
            equityOrderActivityDuxo.applyMutation(new EquityOrderActivityDuxo6(str, null));
        } else {
            equityOrderActivityDuxo.submit(EquityOrderActivityEvent.AccountNotApproved.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$3(EquityOrderActivityDuxo equityOrderActivityDuxo, Optional optional) {
        equityOrderActivityDuxo.applyMutation(new EquityOrderActivityDuxo7((Position) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$4(Quote quote) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$5(EquityOrderActivityDuxo equityOrderActivityDuxo, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<unused var>");
        submitQuoteFetchErrorEvent$default(equityOrderActivityDuxo, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$6(EquityOrderActivityDuxo equityOrderActivityDuxo, Optional optional) {
        equityOrderActivityDuxo.applyMutation(new EquityOrderActivityDuxo8((Position) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startStores$lambda$7(EquityOrderActivityDuxo equityOrderActivityDuxo, boolean z) {
        equityOrderActivityDuxo.applyMutation(new EquityOrderActivityDuxo5(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$startStores$11", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$startStores$11 */
    static final class C2937911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $instrumentId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2937911(UUID uuid, Continuation<? super C2937911> continuation) {
            super(2, continuation);
            this.$instrumentId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivityDuxo.this.new C2937911(this.$instrumentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2937911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(Operators.connectWhen$default(Context7.buffer$default(RxConvert.asFlow(EquityOrderActivityDuxo.this.instrumentStore.getInstrument(this.$instrumentId)), Integer.MAX_VALUE, null, 2, null), ExperimentsProvider.DefaultImpls.streamStateFlow$default(EquityOrderActivityDuxo.this.experimentsStore, new Experiment[]{EquitiesSubzeroKillswitchV2.INSTANCE}, false, null, 6, null), null, 2, null), new C29371x4d9aa4aa(null, EquityOrderActivityDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(EquityOrderActivityDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: EquityOrderActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$startStores$11$2", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$startStores$11$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ EquityOrderActivityDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(EquityOrderActivityDuxo equityOrderActivityDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = equityOrderActivityDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.Z$0) {
                    this.this$0.submit(EquityOrderActivityEvent.SubzeroKillswitchEvent.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void setOrderConfiguration(EquityOrderConfiguration equityOrderConfiguration) {
        Intrinsics.checkNotNullParameter(equityOrderConfiguration, "equityOrderConfiguration");
        DefaultableOrderConfiguration orderAmountType = equityOrderConfiguration.getOrderAmountType();
        if (orderAmountType != null) {
            this.equityOrderDefaultStore.setDefaultOrderConfiguration(orderAmountType);
        }
        applyMutation(new C293782(equityOrderConfiguration, null));
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$setOrderConfiguration$2", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$setOrderConfiguration$2 */
    static final class C293782 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
        final /* synthetic */ EquityOrderConfiguration $equityOrderConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C293782(EquityOrderConfiguration equityOrderConfiguration, Continuation<? super C293782> continuation) {
            super(2, continuation);
            this.$equityOrderConfiguration = equityOrderConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C293782 c293782 = new C293782(this.$equityOrderConfiguration, continuation);
            c293782.L$0 = obj;
            return c293782;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
            return ((C293782) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
            EquityOrderConfiguration equityOrderConfiguration = this.$equityOrderConfiguration;
            DefaultableOrderConfiguration orderAmountType = equityOrderConfiguration.getOrderAmountType();
            if (orderAmountType == null) {
                orderAmountType = equityOrderActivityViewState.getDefaultableOrderConfiguration();
            }
            return equityOrderActivityViewState.copy((32767 & 1) != 0 ? equityOrderActivityViewState.instrumentId : null, (32767 & 2) != 0 ? equityOrderActivityViewState.instrument : null, (32767 & 4) != 0 ? equityOrderActivityViewState.side : null, (32767 & 8) != 0 ? equityOrderActivityViewState.completionUrl : null, (32767 & 16) != 0 ? equityOrderActivityViewState.isPreIpo : null, (32767 & 32) != 0 ? equityOrderActivityViewState.isOtc : null, (32767 & 64) != 0 ? equityOrderActivityViewState.isTwentyFourHourMarketSession : false, (32767 & 128) != 0 ? equityOrderActivityViewState.individualAccountNumber : null, (32767 & 256) != 0 ? equityOrderActivityViewState.providedAccountNumber : null, (32767 & 512) != 0 ? equityOrderActivityViewState.accountPosition : null, (32767 & 1024) != 0 ? equityOrderActivityViewState.tradingSession : null, (32767 & 2048) != 0 ? equityOrderActivityViewState.orderConfiguration : equityOrderConfiguration, (32767 & 4096) != 0 ? equityOrderActivityViewState.equityOrderFlowSource : null, (32767 & 8192) != 0 ? equityOrderActivityViewState.defaultableOrderConfiguration : orderAmountType, (32767 & 16384) != 0 ? equityOrderActivityViewState.isMarketBuysEnabled : false, (32767 & 32768) != 0 ? equityOrderActivityViewState.buyToCloseExperimentEnabled : false);
        }
    }

    static /* synthetic */ void submitQuoteFetchErrorEvent$default(EquityOrderActivityDuxo equityOrderActivityDuxo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        equityOrderActivityDuxo.submitQuoteFetchErrorEvent(str);
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$submitQuoteFetchErrorEvent$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$submitQuoteFetchErrorEvent$1 */
    static final class C293831 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
        final /* synthetic */ String $accountNum;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EquityOrderActivityDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C293831(String str, EquityOrderActivityDuxo equityOrderActivityDuxo, Continuation<? super C293831> continuation) {
            super(2, continuation);
            this.$accountNum = str;
            this.this$0 = equityOrderActivityDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C293831 c293831 = new C293831(this.$accountNum, this.this$0, continuation);
            c293831.L$0 = obj;
            return c293831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
            return ((C293831) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
            String accountNumber = this.$accountNum;
            if (accountNumber == null) {
                accountNumber = equityOrderActivityViewState.getAccountNumber();
            }
            if (accountNumber != null) {
                this.this$0.submit(new EquityOrderActivityEvent.QuoteFetchError(accountNumber));
            }
            return equityOrderActivityViewState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitQuoteFetchErrorEvent(String accountNum) {
        applyMutation(new C293831(accountNum, this, null));
    }

    private final void logFlowSource(EquityOrderFlowSource equityOrderFlowSource) {
        Timber.INSTANCE.mo3356i("EquityOrderActivityDuxo started with EquityOrderFlowSource: " + equityOrderFlowSource.getLoggingValue(), new Object[0]);
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1 */
    static final class C293761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: EquityOrderActivityDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C293761(Continuation<? super C293761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EquityOrderActivityDuxo.this.new C293761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C293761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            EquityOrderSide side;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Companion companion = EquityOrderActivityDuxo.INSTANCE;
                int i2 = WhenMappings.$EnumSwitchMapping$0[((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) EquityOrderActivityDuxo.this)).getSide().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    side = ((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) EquityOrderActivityDuxo.this)).getSide();
                    EquityOrderActivityDuxo.this.applyMutation(new AnonymousClass1(side, null));
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Flow flowFilterNotNull = FlowKt.filterNotNull(EquityOrderActivityDuxo.this.buySellStore.getBuySellData(((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) EquityOrderActivityDuxo.this)).getInstrumentId(), ((EquityOrderActivityIntentKey) companion.getExtras((HasSavedState) EquityOrderActivityDuxo.this)).getAccountNumber()));
                EquityOrderActivityDuxo3 equityOrderActivityDuxo3 = new EquityOrderActivityDuxo3(null);
                this.label = 1;
                obj = FlowKt.first(flowFilterNotNull, equityOrderActivityDuxo3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuySellData buySellData = (BuySellData) obj;
            if (buySellData.getIsSellToOpenEnabled()) {
                side = EquityOrderSide.SELL_SHORT;
            } else {
                if (!buySellData.getIsSellToCloseEnabled()) {
                    CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("Both STC and STO are not allowed"), false, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
                }
                side = EquityOrderSide.SELL;
            }
            EquityOrderActivityDuxo.this.applyMutation(new AnonymousClass1(side, null));
            return Unit.INSTANCE;
        }

        /* compiled from: EquityOrderActivityDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
            final /* synthetic */ EquityOrderSide $resolvedSide;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(EquityOrderSide equityOrderSide, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$resolvedSide = equityOrderSide;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resolvedSide, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
                return ((AnonymousClass1) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
                return equityOrderActivityViewState.copy((32767 & 1) != 0 ? equityOrderActivityViewState.instrumentId : null, (32767 & 2) != 0 ? equityOrderActivityViewState.instrument : null, (32767 & 4) != 0 ? equityOrderActivityViewState.side : this.$resolvedSide, (32767 & 8) != 0 ? equityOrderActivityViewState.completionUrl : null, (32767 & 16) != 0 ? equityOrderActivityViewState.isPreIpo : null, (32767 & 32) != 0 ? equityOrderActivityViewState.isOtc : null, (32767 & 64) != 0 ? equityOrderActivityViewState.isTwentyFourHourMarketSession : false, (32767 & 128) != 0 ? equityOrderActivityViewState.individualAccountNumber : null, (32767 & 256) != 0 ? equityOrderActivityViewState.providedAccountNumber : null, (32767 & 512) != 0 ? equityOrderActivityViewState.accountPosition : null, (32767 & 1024) != 0 ? equityOrderActivityViewState.tradingSession : null, (32767 & 2048) != 0 ? equityOrderActivityViewState.orderConfiguration : null, (32767 & 4096) != 0 ? equityOrderActivityViewState.equityOrderFlowSource : null, (32767 & 8192) != 0 ? equityOrderActivityViewState.defaultableOrderConfiguration : null, (32767 & 16384) != 0 ? equityOrderActivityViewState.isMarketBuysEnabled : false, (32767 & 32768) != 0 ? equityOrderActivityViewState.buyToCloseExperimentEnabled : false);
            }
        }
    }

    private final void resolveEffectiveSide() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C293761(null));
    }

    /* compiled from: EquityOrderActivityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityDuxo;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "<init>", "()V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<EquityOrderActivityDuxo, EquityOrderActivityIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public EquityOrderActivityIntentKey getExtras(SavedStateHandle savedStateHandle) {
            return (EquityOrderActivityIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public EquityOrderActivityIntentKey getExtras(EquityOrderActivityDuxo equityOrderActivityDuxo) {
            return (EquityOrderActivityIntentKey) DuxoCompanion2.DefaultImpls.getExtras(this, equityOrderActivityDuxo);
        }
    }
}
