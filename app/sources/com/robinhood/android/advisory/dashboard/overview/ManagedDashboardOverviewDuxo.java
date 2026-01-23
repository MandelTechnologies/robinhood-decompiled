package com.robinhood.android.advisory.dashboard.overview;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.portfolio.privacy.PortfolioPrivacyPref;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.advisory.p304db.portfolio.ManagedPortfolioSummary;
import com.robinhood.models.advisory.p304db.returns.ReturnsBreakdown;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.CursorData;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.store.advisory.AdvisoryPortfolioBreakdownStore;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: ManagedDashboardOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.BE\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001d0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bH\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0017J\u000e\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0015J\u000e\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0015J\u0006\u0010)\u001a\u00020!J\u0010\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010,J\u0006\u0010-\u001a\u00020!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "portfolioStore", "Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/BooleanPreference;", "returnsChartPref", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/advisory/AdvisoryPortfolioBreakdownStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/userleap/UserLeapManager;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "accountNumberFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "activeCursorDataFlow", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;", "performanceChartSpanFlow", "returnsChartSpanFlow", "flatMapToPerformanceChartRequest", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "Lkotlin/Pair;", "privacyFlow", "", "onStart", "", "onCursorDataChanged", "activeCursorData", "onPerformanceChartSpanSelected", "span", "onReturnsChartSpanSelected", "setAccountNumber", "accountNumber", "onTogglePrivacy", "onReturnsChartBarSelected", PlaceTypes.BAR, "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "onReturnsChartShown", "Companion", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ManagedDashboardOverviewDuxo extends BaseDuxo<ManagedDashboardOverviewDataState, ManagedDashboardOverviewViewState> {
    public static final String DEFAULT_SPAN_PERFORMANCE = "day";
    public static final String DEFAULT_SPAN_RETURNS = "month";
    private final StateFlow2<String> accountNumberFlow;
    private final AccountProvider accountProvider;
    private final StateFlow2<CursorData> activeCursorDataFlow;
    private final StateFlow2<String> performanceChartSpanFlow;
    private final PerformanceChartStore performanceChartStore;
    private final BooleanPreference portfolioPrivacyPref;
    private final AdvisoryPortfolioBreakdownStore portfolioStore;
    private final BooleanPreference returnsChartPref;
    private final StateFlow2<String> returnsChartSpanFlow;
    private final SurveyManager3 userLeapManager;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedDashboardOverviewDuxo(AccountProvider accountProvider, AdvisoryPortfolioBreakdownStore portfolioStore, PerformanceChartStore performanceChartStore, SurveyManager3 userLeapManager, @PortfolioPrivacyPref BooleanPreference portfolioPrivacyPref, @AdvisoryReturnsChartImpressionsPref BooleanPreference returnsChartPref, DuxoBundle duxoBundle) {
        super(new ManagedDashboardOverviewDataState(null, null, null, null, null, null, null, portfolioPrivacyPref.get(), null, null, null, null, false, 8063, null), ManagedDashboardOverviewDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(returnsChartPref, "returnsChartPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.portfolioStore = portfolioStore;
        this.performanceChartStore = performanceChartStore;
        this.userLeapManager = userLeapManager;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.returnsChartPref = returnsChartPref;
        this.accountNumberFlow = StateFlow4.MutableStateFlow(null);
        this.activeCursorDataFlow = StateFlow4.MutableStateFlow(null);
        this.performanceChartSpanFlow = StateFlow4.MutableStateFlow("day");
        this.returnsChartSpanFlow = StateFlow4.MutableStateFlow(DEFAULT_SPAN_RETURNS);
    }

    /* compiled from: ManagedDashboardOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "accountNumberAndSpan", "Lkotlin/Pair;", "", "privacyEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$flatMapToPerformanceChartRequest$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$flatMapToPerformanceChartRequest$1 */
    static final class C86931 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends String>, Boolean, Continuation<? super PerformanceChartStore.PerformanceChartRequest>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        C86931(Continuation<? super C86931> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Boolean bool, Continuation<? super PerformanceChartStore.PerformanceChartRequest> continuation) {
            return invoke((Tuples2<String, String>) tuples2, bool.booleanValue(), continuation);
        }

        public final Object invoke(Tuples2<String, String> tuples2, boolean z, Continuation<? super PerformanceChartStore.PerformanceChartRequest> continuation) {
            C86931 c86931 = new C86931(continuation);
            c86931.L$0 = tuples2;
            c86931.Z$0 = z;
            return c86931.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            boolean z = this.Z$0;
            return new PerformanceChartStore.PerformanceChartRequest((String) tuples2.component1(), PerformanceChartType.HISTORICAL_PORTFOLIO.getServerValue(), PerformanceChartStyle.CONTRIBUTION.getServerValue(), (String) tuples2.component2(), false, null, boxing.boxBoolean(false), z, null, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<PerformanceChartStore.PerformanceChartRequest> flatMapToPerformanceChartRequest(Flow<Tuples2<String, String>> flow, Flow<Boolean> flow2) {
        return FlowKt.flowCombine(flow, flow2, new C86931(null));
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Flow flowFilterNotNull = FlowKt.filterNotNull(this.accountNumberFlow);
        Flow flowCombine = Operators.combine(flowFilterNotNull, this.performanceChartSpanFlow);
        Flow flowCombine2 = Operators.combine(flowFilterNotNull, this.returnsChartSpanFlow);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C86951(flowFilterNotNull, this, flowCombine, FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.portfolioPrivacyPref.getChanges()), Integer.MAX_VALUE, null, 2, null)), flowCombine2, null));
    }

    /* compiled from: ManagedDashboardOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1 */
    static final class C86951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<Tuples2<String, String>> $accountNumberAndPerformanceChartSpanFlow;
        final /* synthetic */ Flow<Tuples2<String, String>> $accountNumberAndReturnsChartSpanFlow;
        final /* synthetic */ Flow<String> $accountNumberStream;
        final /* synthetic */ Flow<Boolean> $privacyFlow;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C86951(Flow<String> flow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Flow<Tuples2<String, String>> flow2, Flow<Boolean> flow3, Flow<Tuples2<String, String>> flow4, Continuation<? super C86951> continuation) {
            super(2, continuation);
            this.$accountNumberStream = flow;
            this.this$0 = managedDashboardOverviewDuxo;
            this.$accountNumberAndPerformanceChartSpanFlow = flow2;
            this.$privacyFlow = flow3;
            this.$accountNumberAndReturnsChartSpanFlow = flow4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C86951 c86951 = new C86951(this.$accountNumberStream, this.this$0, this.$accountNumberAndPerformanceChartSpanFlow, this.$privacyFlow, this.$accountNumberAndReturnsChartSpanFlow, continuation);
            c86951.L$0 = obj;
            return c86951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C86951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberStream, new C8689xb94d65dc(null, this.this$0.portfolioStore));
            SharingStarted.Companion companion = SharingStarted.INSTANCE;
            final SharedFlow sharedFlowShareIn = FlowKt.shareIn(flowTransformLatest, coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            SharedFlow sharedFlowShareIn2 = FlowKt.shareIn(FlowKt.transformLatest(this.$accountNumberStream, new C8690xb94d65dd(null, this.this$0)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            Flow<ManagedAccountState> flow = new Flow<ManagedAccountState>() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$invokeSuspend$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super ManagedAccountState> flowCollector, Continuation continuation) {
                    Object objCollect = sharedFlowShareIn.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$invokeSuspend$$inlined$map$1$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                            ManagedAccountState accountState = ((ManagedPortfolioSummary) obj).getAccountState();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountState, anonymousClass1) == coroutine_suspended) {
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
            };
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedFlowShareIn, this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.this$0, this.$accountNumberAndPerformanceChartSpanFlow, this.$privacyFlow, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.$accountNumberAndPerformanceChartSpanFlow, this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(this.$accountNumberAndReturnsChartSpanFlow, this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(this.this$0, this.$accountNumberAndReturnsChartSpanFlow, this.$privacyFlow, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(sharedFlowShareIn2, this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(flow, sharedFlowShareIn2, this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(this.$privacyFlow, this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(this.this$0, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass12(this.this$0, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {120}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<ManagedPortfolioSummary> $managedPortfolioStream;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SharedFlow<ManagedPortfolioSummary> sharedFlow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$managedPortfolioStream = sharedFlow;
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$managedPortfolioStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "managedPortfolio", "Lcom/robinhood/models/advisory/db/portfolio/ManagedPortfolioSummary;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495501 extends ContinuationImpl7 implements Function2<ManagedPortfolioSummary, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495501(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super C495501> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495501 c495501 = new C495501(this.this$0, continuation);
                    c495501.L$0 = obj;
                    return c495501;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ManagedPortfolioSummary managedPortfolioSummary, Continuation<? super Unit> continuation) {
                    return ((C495501) create(managedPortfolioSummary, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$1$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495511 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ ManagedPortfolioSummary $managedPortfolio;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495511(ManagedPortfolioSummary managedPortfolioSummary, Continuation<? super C495511> continuation) {
                        super(2, continuation);
                        this.$managedPortfolio = managedPortfolioSummary;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495511 c495511 = new C495511(this.$managedPortfolio, continuation);
                        c495511.L$0 = obj;
                        return c495511;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495511) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, this.$managedPortfolio, null, null, null, null, null, false, null, null, null, null, false, 8189, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495511((ManagedPortfolioSummary) this.L$0, null));
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
                    SharedFlow<ManagedPortfolioSummary> sharedFlow = this.$managedPortfolioStream;
                    C495501 c495501 = new C495501(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c495501, this) == coroutine_suspended) {
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

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {128}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "span", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$2$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$2$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495551 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ String $span;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495551(String str, Continuation<? super C495551> continuation) {
                        super(2, continuation);
                        this.$span = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495551 c495551 = new C495551(this.$span, continuation);
                        c495551.L$0 = obj;
                        return c495551;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495551) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, this.$span, null, null, null, false, null, null, null, null, false, 8183, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495551((String) this.L$0, null));
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
                    StateFlow2 stateFlow2 = this.this$0.performanceChartSpanFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow2, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$3", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "span", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$3$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$3$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495561 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ String $span;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495561(String str, Continuation<? super C495561> continuation) {
                        super(2, continuation);
                        this.$span = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495561 c495561 = new C495561(this.$span, continuation);
                        c495561.L$0 = obj;
                        return c495561;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495561) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, this.$span, null, null, false, null, null, null, null, false, 8175, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495561((String) this.L$0, null));
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
                    StateFlow2 stateFlow2 = this.this$0.returnsChartSpanFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow2, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$4", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {151}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<String, String>> $accountNumberAndPerformanceChartSpanFlow;
            final /* synthetic */ Flow<Boolean> $privacyFlow;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Flow<Tuples2<String, String>> flow, Flow<Boolean> flow2, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = managedDashboardOverviewDuxo;
                this.$accountNumberAndPerformanceChartSpanFlow = flow;
                this.$privacyFlow = flow2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$accountNumberAndPerformanceChartSpanFlow, this.$privacyFlow, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.flatMapToPerformanceChartRequest(this.$accountNumberAndPerformanceChartSpanFlow, this.$privacyFlow), new C8683xf01537cc(null, this.this$0.performanceChartStore));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$4$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PerformanceChartModel, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartModel performanceChartModel, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(performanceChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$4$2$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$4$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ PerformanceChartModel $chartModel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PerformanceChartModel performanceChartModel, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$chartModel = performanceChartModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartModel, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((AnonymousClass1) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, this.$chartModel, null, null, null, null, false, null, null, null, null, false, 8187, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((PerformanceChartModel) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$5", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$5, reason: invalid class name */
        static final class AnonymousClass5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<String, String>> $accountNumberAndPerformanceChartSpanFlow;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(Flow<Tuples2<String, String>> flow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$accountNumberAndPerformanceChartSpanFlow = flow;
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$accountNumberAndPerformanceChartSpanFlow, this.this$0, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.$accountNumberAndPerformanceChartSpanFlow, new C8684x473328ab(null, this.this$0));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "returnsBreakdown", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$5$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ReturnsBreakdown, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ReturnsBreakdown returnsBreakdown, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(returnsBreakdown, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$5$2$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$5$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ ReturnsBreakdown $returnsBreakdown;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ReturnsBreakdown returnsBreakdown, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$returnsBreakdown = returnsBreakdown;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$returnsBreakdown, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((AnonymousClass1) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, this.$returnsBreakdown, null, false, null, null, null, null, false, 8159, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ReturnsBreakdown) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {182}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6, reason: invalid class name */
        static final class AnonymousClass6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<String, String>> $accountNumberAndReturnsChartSpanFlow;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(Flow<Tuples2<String, String>> flow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.$accountNumberAndReturnsChartSpanFlow = flow;
                this.this$0 = managedDashboardOverviewDuxo;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final long invokeSuspend$lambda$1(ReturnsBreakdown returnsBreakdown) {
                return 300L;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass6(this.$accountNumberAndReturnsChartSpanFlow, this.this$0, continuation);
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
                    Flow flowDebounce = FlowKt.debounce(FlowKt.transformLatest(this.$accountNumberAndReturnsChartSpanFlow, new C8686x9e51198a(null, this.this$0)), new Function1() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Long.valueOf(ManagedDashboardOverviewDuxo.C86951.AnonymousClass6.invokeSuspend$lambda$1((ReturnsBreakdown) obj2));
                        }
                    });
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDebounce, anonymousClass3, this) == coroutine_suspended) {
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "returnsBreakdown", "Lcom/robinhood/models/advisory/db/returns/ReturnsBreakdown;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6$3", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ReturnsBreakdown, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ReturnsBreakdown returnsBreakdown, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(returnsBreakdown, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6$3$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$6$3$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ ReturnsBreakdown $returnsBreakdown;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ReturnsBreakdown returnsBreakdown, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$returnsBreakdown = returnsBreakdown;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$returnsBreakdown, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((AnonymousClass1) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, null, this.$returnsBreakdown, false, null, null, null, null, false, 8127, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((ReturnsBreakdown) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$7", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$7, reason: invalid class name */
        static final class AnonymousClass7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Tuples2<String, String>> $accountNumberAndReturnsChartSpanFlow;
            final /* synthetic */ Flow<Boolean> $privacyFlow;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Flow<Tuples2<String, String>> flow, Flow<Boolean> flow2, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = managedDashboardOverviewDuxo;
                this.$accountNumberAndReturnsChartSpanFlow = flow;
                this.$privacyFlow = flow2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, this.$accountNumberAndReturnsChartSpanFlow, this.$privacyFlow, continuation);
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
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.flatMapToPerformanceChartRequest(this.$accountNumberAndReturnsChartSpanFlow, this.$privacyFlow), new C8687xf56f0a69(null, this.this$0.performanceChartStore));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chartModel", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$7$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$7$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PerformanceChartModel, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PerformanceChartModel performanceChartModel, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(performanceChartModel, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$7$2$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$7$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ PerformanceChartModel $chartModel;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(PerformanceChartModel performanceChartModel, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$chartModel = performanceChartModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chartModel, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((AnonymousClass1) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, this.$chartModel.getDefaultDisplay(), this.$chartModel.getPageDirection(), false, 5119, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new AnonymousClass1((PerformanceChartModel) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$8", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$8, reason: invalid class name */
        static final class AnonymousClass8 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ SharedFlow<BrokerageAccountType> $accountTypeStream;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass8(SharedFlow<? extends BrokerageAccountType> sharedFlow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$accountTypeStream = sharedFlow;
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$accountTypeStream, this.this$0, continuation);
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
                    SharedFlow<BrokerageAccountType> sharedFlow = this.$accountTypeStream;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$8$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BrokerageAccountType, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BrokerageAccountType brokerageAccountType, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(brokerageAccountType, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$8$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$8$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495571 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ BrokerageAccountType $brokerageAccountType;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495571(BrokerageAccountType brokerageAccountType, Continuation<? super C495571> continuation) {
                        super(2, continuation);
                        this.$brokerageAccountType = brokerageAccountType;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495571 c495571 = new C495571(this.$brokerageAccountType, continuation);
                        c495571.L$0 = obj;
                        return c495571;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495571) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, this.$brokerageAccountType, null, null, null, null, null, null, false, null, null, null, null, false, 8190, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495571((BrokerageAccountType) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9, reason: invalid class name */
        static final class AnonymousClass9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<ManagedAccountState> $accountStateStream;
            final /* synthetic */ SharedFlow<BrokerageAccountType> $accountTypeStream;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass9(Flow<? extends ManagedAccountState> flow, SharedFlow<? extends BrokerageAccountType> sharedFlow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$accountStateStream = flow;
                this.$accountTypeStream = sharedFlow;
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$accountStateStream, this.$accountTypeStream, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowCombine = Operators.combine(this.$accountStateStream, this.$accountTypeStream);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<TrackingEvent>() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super TrackingEvent> flowCollector, Continuation continuation) {
                            Object objCollect = flowCombine.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    Tuples2 tuples2 = (Tuples2) obj;
                                    TrackingEvent trackingEventMapAccountDataToSurveyEvent = SurveyHelper.mapAccountDataToSurveyEvent((ManagedAccountState) tuples2.component1(), (BrokerageAccountType) tuples2.component2());
                                    if (trackingEventMapAccountDataToSurveyEvent != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(trackingEventMapAccountDataToSurveyEvent, anonymousClass1) == coroutine_suspended) {
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
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/userleap/survey/TrackingEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9$2", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$9$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TrackingEvent, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TrackingEvent trackingEvent, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(trackingEvent, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.userLeapManager.track((TrackingEvent) this.L$0);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$10", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$10, reason: invalid class name */
        static final class AnonymousClass10 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow<Boolean> $privacyFlow;
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(Flow<Boolean> flow, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$privacyFlow = flow;
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$privacyFlow, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "privacyEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$10$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$10$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
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

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$10$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$10$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495521 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ boolean $privacyEnabled;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495521(boolean z, Continuation<? super C495521> continuation) {
                        super(2, continuation);
                        this.$privacyEnabled = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495521 c495521 = new C495521(this.$privacyEnabled, continuation);
                        c495521.L$0 = obj;
                        return c495521;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495521) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, null, null, this.$privacyEnabled, null, null, null, null, false, 8063, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495521(this.Z$0, null));
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
                    Flow<Boolean> flow = this.$privacyFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$11", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$11, reason: invalid class name */
        static final class AnonymousClass11 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass11(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "activeCursorData", "Lcom/robinhood/models/serverdriven/experimental/api/CursorData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$11$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$11$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CursorData, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CursorData cursorData, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(cursorData, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$11$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$11$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495531 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ CursorData $activeCursorData;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495531(CursorData cursorData, Continuation<? super C495531> continuation) {
                        super(2, continuation);
                        this.$activeCursorData = cursorData;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495531 c495531 = new C495531(this.$activeCursorData, continuation);
                        c495531.L$0 = obj;
                        return c495531;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495531) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, null, null, false, this.$activeCursorData, null, null, null, false, 7935, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495531((CursorData) this.L$0, null));
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
                    StateFlow2 stateFlow2 = this.this$0.activeCursorDataFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow2, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ManagedDashboardOverviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$12", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$12, reason: invalid class name */
        static final class AnonymousClass12 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass12(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = managedDashboardOverviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(Context7.buffer$default(RxConvert.asFlow(this.this$0.returnsChartPref.getChanges()), Integer.MAX_VALUE, null, 2, null));
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: ManagedDashboardOverviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "hasReturnsChartShown", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$12$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$12$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ ManagedDashboardOverviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = managedDashboardOverviewDuxo;
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

                /* compiled from: ManagedDashboardOverviewDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$12$1$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onStart$1$12$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495541 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
                    final /* synthetic */ boolean $hasReturnsChartShown;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495541(boolean z, Continuation<? super C495541> continuation) {
                        super(2, continuation);
                        this.$hasReturnsChartShown = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495541 c495541 = new C495541(this.$hasReturnsChartShown, continuation);
                        c495541.L$0 = obj;
                        return c495541;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
                        return ((C495541) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, null, null, false, null, null, null, null, !this.$hasReturnsChartShown, 4095, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495541(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void onCursorDataChanged(CursorData activeCursorData) {
        StateFlow2<CursorData> stateFlow2 = this.activeCursorDataFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), activeCursorData)) {
        }
    }

    public final void onPerformanceChartSpanSelected(String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        StateFlow2<String> stateFlow2 = this.performanceChartSpanFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), span)) {
        }
    }

    public final void onReturnsChartSpanSelected(String span) {
        Intrinsics.checkNotNullParameter(span, "span");
        StateFlow2<String> stateFlow2 = this.returnsChartSpanFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), span)) {
        }
    }

    public final void setAccountNumber(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        StateFlow2<String> stateFlow2 = this.accountNumberFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), accountNumber)) {
        }
    }

    public final void onTogglePrivacy() {
        this.portfolioPrivacyPref.set(!this.portfolioPrivacyPref.get());
    }

    /* compiled from: ManagedDashboardOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onReturnsChartBarSelected$1", m3645f = "ManagedDashboardOverviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDuxo$onReturnsChartBarSelected$1 */
    static final class C86941 extends ContinuationImpl7 implements Function2<ManagedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState>, Object> {
        final /* synthetic */ ManagedReturnsChartState.ReturnsBar $bar;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C86941(ManagedReturnsChartState.ReturnsBar returnsBar, Continuation<? super C86941> continuation) {
            super(2, continuation);
            this.$bar = returnsBar;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C86941 c86941 = new C86941(this.$bar, continuation);
            c86941.L$0 = obj;
            return c86941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ManagedDashboardOverviewDataState managedDashboardOverviewDataState, Continuation<? super ManagedDashboardOverviewDataState> continuation) {
            return ((C86941) create(managedDashboardOverviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ManagedDashboardOverviewDataState.copy$default((ManagedDashboardOverviewDataState) this.L$0, null, null, null, null, null, null, null, false, null, this.$bar, null, null, false, 7679, null);
        }
    }

    public final void onReturnsChartBarSelected(ManagedReturnsChartState.ReturnsBar bar) {
        applyMutation(new C86941(bar, null));
    }

    public final void onReturnsChartShown() {
        this.returnsChartPref.set(true);
    }
}
