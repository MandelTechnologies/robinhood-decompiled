package com.robinhood.android.optionsexercise;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.equity.ExperimentsKt;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.optionsexercise.OptionExerciseDuxo;
import com.robinhood.android.optionsexercise.OptionExerciseFragment;
import com.robinhood.android.optionsexercise.validation.OptionExerciseValidationFailureResolver;
import com.robinhood.android.optionsexercise.validation.OptionExerciseValidator;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.SubzeroRegionGate;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionExerciseStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionUnderlier;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionExerciseDuxo.kt */
@Metadata(m3635d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002BCB\u0099\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0004\b(\u0010)J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u000201J\u000e\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020-2\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u00020-J\u0006\u00109\u001a\u00020-J\u0018\u0010:\u001a\u00020-2\u0010\u0010;\u001a\f\u0012\u0004\u0012\u00020=0<j\u0002`>J\u000e\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020AR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionsexercise/OptionExerciseViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "dayTradeStore", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "exerciseManager", "Lcom/robinhood/android/optionsexercise/OptionExerciseManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "optionExerciseStore", "Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "sweepEnrollmentStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "validator", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/optionsexercise/OptionExerciseManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/OptionExerciseStore;Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidator;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onResume", "setQuantity", "quantity", "Ljava/math/BigDecimal;", "setRefId", "refId", "Ljava/util/UUID;", "setFormState", "formState", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "overrideDayTradeChecks", "validateAndReviewOrder", "handleFailureResolution", "action", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "Lcom/robinhood/android/optionsexercise/validation/OptionExerciseValidationAction;", "submit", "exerciseRequest", "Lcom/robinhood/models/api/ApiOptionExerciseRequest;", "OptionInstrumentContext", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionExerciseDuxo extends OldBaseDuxo<OptionExerciseViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final AnalyticsLogger analytics;
    private final TraderDayTradeStore dayTradeStore;
    private final InstrumentStore equityInstrumentStore;
    private final OptionExerciseManager exerciseManager;
    private final ExperimentsStore experimentsStore;
    private final InstrumentBuyingPowerStore instrumentBuyingPowerStore;
    private final TraderMarketHoursManager marketHoursManager;
    private final OptionExerciseStore optionExerciseStore;
    private final OptionInstrumentStore optionInstrumentStore;
    private final TraderPortfolioStore portfolioStore;
    private final PositionStore positionStore;
    private final QuoteStore quoteStore;
    private final RegionGateProvider regionGateProvider;
    private final SavedStateHandle savedStateHandle;
    private final ShortingInfoStore shortingInfoStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final OptionExerciseValidator validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionExerciseDuxo(AccountProvider accountProvider, AnalyticsLogger analytics, TraderDayTradeStore dayTradeStore, InstrumentStore equityInstrumentStore, OptionExerciseManager exerciseManager, ExperimentsStore experimentsStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, TraderMarketHoursManager marketHoursManager, OptionExerciseStore optionExerciseStore, OptionInstrumentStore optionInstrumentStore, TraderPortfolioStore portfolioStore, PositionStore positionStore, QuoteStore quoteStore, RegionGateProvider regionGateProvider, ShortingInfoStore shortingInfoStore, SweepEnrollmentStore sweepEnrollmentStore, OptionExerciseValidator validator, SavedStateHandle savedStateHandle) {
        super(new OptionExerciseViewState(null, null, null, null, null, null, null, null, null, null, null, null, false, null, ((OptionExerciseFragment.Args) INSTANCE.getArgs(savedStateHandle)).getReason(), null, null, null, null, null, false, null, false, 8372223, null), null, 2, null);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(dayTradeStore, "dayTradeStore");
        Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
        Intrinsics.checkNotNullParameter(exerciseManager, "exerciseManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(optionExerciseStore, "optionExerciseStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.dayTradeStore = dayTradeStore;
        this.equityInstrumentStore = equityInstrumentStore;
        this.exerciseManager = exerciseManager;
        this.experimentsStore = experimentsStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.marketHoursManager = marketHoursManager;
        this.optionExerciseStore = optionExerciseStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.portfolioStore = portfolioStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.regionGateProvider = regionGateProvider;
        this.shortingInfoStore = shortingInfoStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.validator = validator;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C246721(null));
    }

    /* compiled from: OptionExerciseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1", m3645f = "OptionExerciseDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1 */
    static final class C246721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C246721(Continuation<? super C246721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246721 c246721 = OptionExerciseDuxo.this.new C246721(continuation);
            c246721.L$0 = obj;
            return c246721;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C246721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionExerciseDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$1", m3645f = "OptionExerciseDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionExerciseDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionExerciseDuxo optionExerciseDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionExerciseDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(ExperimentsKt.streamWithExperiment(this.this$0.regionGateProvider, this.this$0.experimentsStore, SubzeroRegionGate.INSTANCE, Experiments.OptionsShortSellingExercise.INSTANCE, true)), Integer.MAX_VALUE, null, 2, null));
                    C504251 c504251 = new C504251(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c504251, this) == coroutine_suspended) {
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

            /* compiled from: OptionExerciseDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "enabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$1$1", m3645f = "OptionExerciseDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504251 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionExerciseDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C504251(OptionExerciseDuxo optionExerciseDuxo, Continuation<? super C504251> continuation) {
                    super(2, continuation);
                    this.this$0 = optionExerciseDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504251 c504251 = new C504251(this.this$0, continuation);
                    c504251.Z$0 = ((Boolean) obj).booleanValue();
                    return c504251;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C504251) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final boolean z = this.Z$0;
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionExerciseDuxo.C246721.AnonymousClass1.C504251.invokeSuspend$lambda$0(z, (OptionExerciseViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionExerciseViewState invokeSuspend$lambda$0(boolean z, OptionExerciseViewState optionExerciseViewState) {
                    return OptionExerciseViewState.copy$default(optionExerciseViewState, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, z, null, false, 7340031, null);
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionExerciseDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionExerciseDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(OptionExerciseDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionExerciseDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2", m3645f = "OptionExerciseDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionExerciseDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionExerciseDuxo optionExerciseDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionExerciseDuxo;
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
                    final StateFlow<OptionExerciseViewState> statesFlow = this.this$0.getStatesFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<UUID>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionExerciseDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                Instrument equityInstrument;
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
                                    OptionExerciseViewState optionExerciseViewState = (OptionExerciseViewState) obj;
                                    UUID id = null;
                                    if (optionExerciseViewState.isShortSellingExerciseEnabled() && (equityInstrument = optionExerciseViewState.getEquityInstrument()) != null) {
                                        id = equityInstrument.getId();
                                    }
                                    if (id != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(id, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
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
                            Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C24670x986733d9(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: OptionExerciseDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$3", m3645f = "OptionExerciseDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ShortingInfo, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ OptionExerciseDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(OptionExerciseDuxo optionExerciseDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = optionExerciseDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ShortingInfo shortingInfo, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(shortingInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final ShortingInfo shortingInfo = (ShortingInfo) this.L$0;
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$2$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionExerciseDuxo.C246721.AnonymousClass2.AnonymousClass3.invokeSuspend$lambda$0(shortingInfo, (OptionExerciseViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionExerciseViewState invokeSuspend$lambda$0(ShortingInfo shortingInfo, OptionExerciseViewState optionExerciseViewState) {
                    return OptionExerciseViewState.copy$default(optionExerciseViewState, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, shortingInfo, false, 6291455, null);
                }
            }
        }

        /* compiled from: OptionExerciseDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$3", m3645f = "OptionExerciseDuxo.kt", m3646l = {117}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionExerciseDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(OptionExerciseDuxo optionExerciseDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = optionExerciseDuxo;
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
                    Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamRegionGateStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: OptionExerciseDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$3$1", m3645f = "OptionExerciseDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ OptionExerciseDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionExerciseDuxo optionExerciseDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionExerciseDuxo;
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

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    final boolean z = this.Z$0;
                    this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onCreate$1$3$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return OptionExerciseDuxo.C246721.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(z, (OptionExerciseViewState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final OptionExerciseViewState invokeSuspend$lambda$0(boolean z, OptionExerciseViewState optionExerciseViewState) {
                    return OptionExerciseViewState.copy$default(optionExerciseViewState, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, z, 4194303, null);
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        Observable<Account> observableStreamIndividualAccount;
        super.onResume();
        Observable observableSwitchMap = getStates().map(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.1
            @Override // io.reactivex.functions.Function
            public final Tuples2<Instrument, Account> apply(OptionExerciseViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it.getEquityInstrument(), it.getAccount());
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<Instrument, Account> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (it.getFirst() == null || it.getSecond() == null) ? false : true;
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends InstrumentBuyingPower> apply(Tuples2<Instrument, Account> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Instrument instrumentComponent1 = tuples2.component1();
                Account accountComponent2 = tuples2.component2();
                Intrinsics.checkNotNull(instrumentComponent1);
                UUID id = instrumentComponent1.getId();
                Intrinsics.checkNotNull(accountComponent2);
                String accountNumber = accountComponent2.getAccountNumber();
                OptionExerciseDuxo.this.instrumentBuyingPowerStore.refreshSelectedAccount(false, id, accountNumber);
                return OptionExerciseDuxo.this.instrumentBuyingPowerStore.getStreamSelectedAccountBuyingPowerForInstrument().asObservable(Tuples4.m3642to(id, accountNumber));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$1(this.f$0, (InstrumentBuyingPower) obj);
            }
        });
        this.accountProvider.refresh(false);
        Observable<List<Account>> observableDistinctUntilChanged = this.accountProvider.streamAllSelfDirectedAccounts().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$3(this.f$0, (List) obj);
            }
        });
        Companion companion = INSTANCE;
        String accountNumber = ((OptionExerciseFragment.Args) companion.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber != null) {
            observableStreamIndividualAccount = this.accountProvider.streamAccount(accountNumber);
        } else {
            observableStreamIndividualAccount = this.accountProvider.streamIndividualAccount();
        }
        Observable<Account> observableRefCount = observableStreamIndividualAccount.distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$5(this.f$0, (Account) obj);
            }
        });
        Observable<R> observableFlatMapSingle = observableRefCount.flatMapSingle(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.7

            /* compiled from: OptionExerciseDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$7$1", m3645f = "OptionExerciseDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$7$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends ApiOptionExerciseChecks>>, Object> {
                final /* synthetic */ Account $account;
                int label;
                final /* synthetic */ OptionExerciseDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(OptionExerciseDuxo optionExerciseDuxo, Account account, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = optionExerciseDuxo;
                    this.$account = account;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$account, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends ApiOptionExerciseChecks>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Optional<ApiOptionExerciseChecks>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<ApiOptionExerciseChecks>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Endpoint<Tuples2<String, UUID>, ApiOptionExerciseChecks> getOptionExerciseChecks = this.this$0.optionExerciseStore.getGetOptionExerciseChecks();
                        Tuples2<String, UUID> tuples2M3642to = Tuples4.m3642to(this.$account.getAccountNumber(), ((OptionExerciseFragment.Args) OptionExerciseDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getOptionInstrumentId());
                        this.label = 1;
                        obj = getOptionExerciseChecks.raw(tuples2M3642to, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Optional3.asOptional(obj);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiOptionExerciseChecks>> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                OptionExerciseDuxo optionExerciseDuxo = OptionExerciseDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(optionExerciseDuxo, null, new AnonymousClass1(optionExerciseDuxo, account, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.ignoreNetworkExceptions(observableFlatMapSingle), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$7(this.f$0, (Optional) obj);
            }
        });
        final MarketHours currentMarketHours = this.marketHoursManager.getCurrentMarketHours();
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$8(currentMarketHours, (OptionExerciseViewState) obj);
            }
        });
        Endpoint.DefaultImpls.refresh$default(this.optionInstrumentStore.getGetOptionInstrument(), ((OptionExerciseFragment.Args) companion.getArgs((HasSavedState) this)).getOptionInstrumentId(), true, null, 4, null);
        Observable observableDistinctUntilChanged2 = this.optionInstrumentStore.getStreamUiOptionInstrument().asObservable(((OptionExerciseFragment.Args) companion.getArgs((HasSavedState) this)).getOptionInstrumentId()).switchMap(new C2467410(observableRefCount)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$11(this.f$0, (OptionExerciseDuxo.OptionInstrumentContext) obj);
            }
        });
        Observable observableSwitchMap2 = observableRefCount.map(new OptionExerciseDuxo6(new PropertyReference1Impl() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.12
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Account) obj).getAccountNumber();
            }
        })).switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.13
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Portfolio> apply(String accountNumber2) {
                Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                OptionExerciseDuxo.this.portfolioStore.refreshPortfolio(accountNumber2, false);
                return OptionExerciseDuxo.this.portfolioStore.getPortfolio(accountNumber2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$13(this.f$0, (Portfolio) obj);
            }
        });
        Observable<R> map = getStates().map(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Account account = ((OptionExerciseViewState) it).getAccount();
                return Optional3.asOptional(account != null ? account.getAccountNumber() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionExerciseDuxo$onResume$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Observable observableSwitchMap3 = observableDistinctUntilChanged3.switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo.onResume.16
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiSweepEnrollment> apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OptionExerciseDuxo.this.sweepEnrollmentStore.getSweepEnrollmentObservable(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        Observable observableDistinctUntilChanged4 = observableSwitchMap3.map(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((ApiSweepEnrollment) it).getSweepEnrolled());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$17(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(OptionExerciseDuxo optionExerciseDuxo, final InstrumentBuyingPower instrumentBuyingPower) {
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$1$lambda$0(instrumentBuyingPower, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$1$lambda$0(InstrumentBuyingPower instrumentBuyingPower, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, instrumentBuyingPower, null, false, null, null, null, null, null, null, null, false, null, false, 8387583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(OptionExerciseDuxo optionExerciseDuxo, final List list) {
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$3$lambda$2(list, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$3$lambda$2(List list, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return OptionExerciseViewState.copy$default(applyMutation, null, list, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388605, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(OptionExerciseDuxo optionExerciseDuxo, final Account account) {
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$5$lambda$4(account, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$5$lambda$4(Account account, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, account, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388606, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(OptionExerciseDuxo optionExerciseDuxo, Optional optional) {
        final ApiOptionExerciseChecks apiOptionExerciseChecks = (ApiOptionExerciseChecks) optional.component1();
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$7$lambda$6(apiOptionExerciseChecks, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$7$lambda$6(ApiOptionExerciseChecks apiOptionExerciseChecks, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, apiOptionExerciseChecks, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388095, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$8(MarketHours marketHours, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, marketHours, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388603, null);
    }

    /* compiled from: OptionExerciseDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10 */
    static final class C2467410<T, R> implements Function {
        final /* synthetic */ Observable<Account> $accountObs;

        C2467410(Observable<Account> observable) {
            this.$accountObs = observable;
        }

        @Override // io.reactivex.functions.Function
        public final ObservableSource<? extends OptionInstrumentContext> apply(final UiOptionInstrument uiOptionInstrument) {
            Intrinsics.checkNotNullParameter(uiOptionInstrument, "uiOptionInstrument");
            OptionExerciseDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionExerciseDuxo.C2467410.apply$lambda$0(uiOptionInstrument, (OptionExerciseViewState) obj);
                }
            });
            if (uiOptionInstrument.getOptionUnderliers().size() != 1) {
                OptionExerciseDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionExerciseDuxo.C2467410.apply$lambda$1((OptionExerciseViewState) obj);
                    }
                });
                return Observable.just(new OptionInstrumentContext(null, null, null, null));
            }
            final UUID instrumentId = ((OptionUnderlier) CollectionsKt.first((List) uiOptionInstrument.getOptionUnderliers())).getInstrumentId();
            OptionExerciseDuxo.this.equityInstrumentStore.refresh(false, instrumentId);
            Observable<Instrument> instrument = OptionExerciseDuxo.this.equityInstrumentStore.getInstrument(instrumentId);
            OptionExerciseDuxo.this.quoteStore.refresh(false, instrumentId);
            Observable<Quote> observableAsObservable = OptionExerciseDuxo.this.quoteStore.getStreamQuote().asObservable(instrumentId);
            Observable<R> map = this.$accountObs.map(new OptionExerciseDuxo6(new PropertyReference1Impl() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$positionObs$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((Account) obj).getAccountNumber();
                }
            }));
            final OptionExerciseDuxo optionExerciseDuxo = OptionExerciseDuxo.this;
            Observable<R> observableSwitchMap = map.switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$positionObs$2
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends Optional<Position>> apply(String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    optionExerciseDuxo.positionStore.refreshAccount(accountNumber, false);
                    return optionExerciseDuxo.positionStore.getPositionForAccountOptional(instrumentId, accountNumber, true);
                }
            });
            Observable<R> map2 = this.$accountObs.map(new OptionExerciseDuxo6(new PropertyReference1Impl() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$dayTradeObs$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                public Object get(Object obj) {
                    return ((Account) obj).getAccountNumber();
                }
            }));
            final OptionExerciseDuxo optionExerciseDuxo2 = OptionExerciseDuxo.this;
            Observable<R> observableSwitchMap2 = map2.switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$dayTradeObs$2
                @Override // io.reactivex.functions.Function
                public final ObservableSource<? extends TraderDayTradeStore.DayTradeCheckState> apply(String accountNumber) {
                    Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                    optionExerciseDuxo2.dayTradeStore.refresh(accountNumber, false);
                    return optionExerciseDuxo2.dayTradeStore.getDayTradeCheck(accountNumber, instrumentId);
                }
            });
            Observables observables = Observables.INSTANCE;
            Intrinsics.checkNotNull(observableSwitchMap2);
            Intrinsics.checkNotNull(observableSwitchMap);
            Observable observableCombineLatest = Observable.combineLatest(observableSwitchMap2, instrument, observableSwitchMap, observableAsObservable, new Function4<T1, T2, T3, T4, R>() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$onResume$10$apply$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function4
                public final R apply(T1 t1, T2 t2, T3 t3, T4 t4) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    Intrinsics.checkParameterIsNotNull(t3, "t3");
                    Intrinsics.checkParameterIsNotNull(t4, "t4");
                    return (R) new OptionExerciseDuxo.OptionInstrumentContext((TraderDayTradeStore.DayTradeCheckState) t1, (Instrument) t2, (Position) ((Optional) t3).component1(), (Quote) t4);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
            return observableCombineLatest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionExerciseViewState apply$lambda$0(UiOptionInstrument uiOptionInstrument, OptionExerciseViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, uiOptionInstrument, null, null, false, null, false, 8257535, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionExerciseViewState apply$lambda$1(OptionExerciseViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, new UiEvent(Boolean.TRUE), false, null, null, null, null, null, null, null, false, null, false, 8386559, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(OptionExerciseDuxo optionExerciseDuxo, final OptionInstrumentContext optionInstrumentContext) {
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$11$lambda$10(optionInstrumentContext, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$11$lambda$10(OptionInstrumentContext optionInstrumentContext, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, optionInstrumentContext.getDayTradeCheck(), optionInstrumentContext.getEquityInstrument(), null, optionInstrumentContext.getPosition(), optionInstrumentContext.getQuote(), null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388175, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$13(OptionExerciseDuxo optionExerciseDuxo, final Portfolio portfolio) {
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$13$lambda$12(portfolio, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$13$lambda$12(Portfolio portfolio, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, portfolio, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388543, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$17(OptionExerciseDuxo optionExerciseDuxo, final boolean z) {
        optionExerciseDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.onResume$lambda$17$lambda$16(z, (OptionExerciseViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState onResume$lambda$17$lambda$16(boolean z, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8388599, null);
    }

    public final void setQuantity(final BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.setQuantity$lambda$18(quantity, (OptionExerciseViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState setQuantity$lambda$18(BigDecimal bigDecimal, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, false, bigDecimal, null, null, null, null, null, null, false, null, false, 8380415, null);
    }

    public final void setRefId(final UUID refId) {
        Intrinsics.checkNotNullParameter(refId, "refId");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.setRefId$lambda$19(refId, (OptionExerciseViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState setRefId$lambda$19(UUID uuid, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, uuid, null, null, null, null, false, null, false, 8355839, null);
    }

    public final void setFormState(final DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.setFormState$lambda$20(formState, (OptionExerciseViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState setFormState$lambda$20(DefaultOrderState defaultOrderState, OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, defaultOrderState, null, null, null, false, null, false, 8323071, null);
    }

    public final void overrideDayTradeChecks() {
        applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.overrideDayTradeChecks$lambda$21((OptionExerciseViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState overrideDayTradeChecks$lambda$21(OptionExerciseViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionExerciseViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, false, null, false, 8384511, null);
    }

    public final void validateAndReviewOrder() {
        mutate(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.validateAndReviewOrder$lambda$22(this.f$0, (OptionExerciseViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState validateAndReviewOrder$lambda$22(OptionExerciseDuxo optionExerciseDuxo, OptionExerciseViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        OptionExerciseContext exerciseContext = state.getExerciseContext();
        if (exerciseContext == null) {
            return state;
        }
        Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> validationContext = state.getValidationContext();
        if (validationContext == null) {
            validationContext = optionExerciseDuxo.validator.validateWithContext(exerciseContext);
        }
        Validator.Failure<OptionExerciseContext, OptionExerciseValidationFailureResolver> failure = validationContext.getFailure();
        if (failure == null) {
            return OptionExerciseViewState.copy$default(state, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, DefaultOrderState.REVIEWING, null, null, null, false, null, false, 8060927, null);
        }
        optionExerciseDuxo.analytics.logError(AnalyticsStrings.ERROR_OPTION_EXERCISE, failure.getCheckIdentifier());
        return OptionExerciseViewState.copy$default(state, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, validationContext, new UiEvent(validationContext), false, null, false, 7602175, null);
    }

    public final void handleFailureResolution(final Validator.Action<? super OptionExerciseContext> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        mutate(new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionExerciseDuxo.handleFailureResolution$lambda$23(action, (OptionExerciseViewState) obj);
            }
        });
        if (action instanceof Validator.Action.Skip) {
            validateAndReviewOrder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionExerciseViewState handleFailureResolution$lambda$23(Validator.Action action, OptionExerciseViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (action instanceof Validator.Action.Abort) {
            return OptionExerciseViewState.copy$default(state, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, false, 8126463, null);
        }
        if (action instanceof Validator.Action.Skip) {
            Validator.ValidationContext<OptionExerciseContext, OptionExerciseValidationFailureResolver> validationContext = state.getValidationContext();
            return OptionExerciseViewState.copy$default(state, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, validationContext != null ? validationContext.skipCurrentFailure() : null, null, false, null, false, 8126463, null);
        }
        if (!(action instanceof Validator.Action.RetryWhen)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("retry when is not supported for option exercise");
    }

    public final void submit(ApiOptionExerciseRequest exerciseRequest) {
        Intrinsics.checkNotNullParameter(exerciseRequest, "exerciseRequest");
        OrderSubmissionManager.submit$default(this.exerciseManager, exerciseRequest, null, false, 6, null);
    }

    /* compiled from: OptionExerciseDuxo.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseDuxo$OptionInstrumentContext;", "", "dayTradeCheck", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "equityInstrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/db/Quote;)V", "getDayTradeCheck", "()Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "getEquityInstrument", "()Lcom/robinhood/models/db/Instrument;", "getPosition", "()Lcom/robinhood/models/db/Position;", "getQuote", "()Lcom/robinhood/models/db/Quote;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionInstrumentContext {
        public static final int $stable = 8;
        private final TraderDayTradeStore.DayTradeCheckState dayTradeCheck;
        private final Instrument equityInstrument;
        private final Position position;
        private final Quote quote;

        public static /* synthetic */ OptionInstrumentContext copy$default(OptionInstrumentContext optionInstrumentContext, TraderDayTradeStore.DayTradeCheckState dayTradeCheckState, Instrument instrument, Position position, Quote quote, int i, Object obj) {
            if ((i & 1) != 0) {
                dayTradeCheckState = optionInstrumentContext.dayTradeCheck;
            }
            if ((i & 2) != 0) {
                instrument = optionInstrumentContext.equityInstrument;
            }
            if ((i & 4) != 0) {
                position = optionInstrumentContext.position;
            }
            if ((i & 8) != 0) {
                quote = optionInstrumentContext.quote;
            }
            return optionInstrumentContext.copy(dayTradeCheckState, instrument, position, quote);
        }

        /* renamed from: component1, reason: from getter */
        public final TraderDayTradeStore.DayTradeCheckState getDayTradeCheck() {
            return this.dayTradeCheck;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getEquityInstrument() {
            return this.equityInstrument;
        }

        /* renamed from: component3, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component4, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        public final OptionInstrumentContext copy(TraderDayTradeStore.DayTradeCheckState dayTradeCheck, Instrument equityInstrument, Position position, Quote quote) {
            return new OptionInstrumentContext(dayTradeCheck, equityInstrument, position, quote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OptionInstrumentContext)) {
                return false;
            }
            OptionInstrumentContext optionInstrumentContext = (OptionInstrumentContext) other;
            return Intrinsics.areEqual(this.dayTradeCheck, optionInstrumentContext.dayTradeCheck) && Intrinsics.areEqual(this.equityInstrument, optionInstrumentContext.equityInstrument) && Intrinsics.areEqual(this.position, optionInstrumentContext.position) && Intrinsics.areEqual(this.quote, optionInstrumentContext.quote);
        }

        public int hashCode() {
            TraderDayTradeStore.DayTradeCheckState dayTradeCheckState = this.dayTradeCheck;
            int iHashCode = (dayTradeCheckState == null ? 0 : dayTradeCheckState.hashCode()) * 31;
            Instrument instrument = this.equityInstrument;
            int iHashCode2 = (iHashCode + (instrument == null ? 0 : instrument.hashCode())) * 31;
            Position position = this.position;
            int iHashCode3 = (iHashCode2 + (position == null ? 0 : position.hashCode())) * 31;
            Quote quote = this.quote;
            return iHashCode3 + (quote != null ? quote.hashCode() : 0);
        }

        public String toString() {
            return "OptionInstrumentContext(dayTradeCheck=" + this.dayTradeCheck + ", equityInstrument=" + this.equityInstrument + ", position=" + this.position + ", quote=" + this.quote + ")";
        }

        public OptionInstrumentContext(TraderDayTradeStore.DayTradeCheckState dayTradeCheckState, Instrument instrument, Position position, Quote quote) {
            this.dayTradeCheck = dayTradeCheckState;
            this.equityInstrument = instrument;
            this.position = position;
            this.quote = quote;
        }

        public final TraderDayTradeStore.DayTradeCheckState getDayTradeCheck() {
            return this.dayTradeCheck;
        }

        public final Instrument getEquityInstrument() {
            return this.equityInstrument;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final Quote getQuote() {
            return this.quote;
        }
    }

    /* compiled from: OptionExerciseDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsexercise/OptionExerciseDuxo;", "Lcom/robinhood/android/optionsexercise/OptionExerciseFragment$Args;", "<init>", "()V", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionExerciseDuxo, OptionExerciseFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionExerciseFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OptionExerciseFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionExerciseFragment.Args getArgs(OptionExerciseDuxo optionExerciseDuxo) {
            return (OptionExerciseFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, optionExerciseDuxo);
        }
    }
}
