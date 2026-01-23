package com.robinhood.android.lib.performancechart;

import androidx.lifecycle.ViewModel2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs3;
import com.robinhood.android.lib.performancechart.PerformanceChartDuxo;
import com.robinhood.android.models.portfolio.PerformanceChartBenchmarkV2;
import com.robinhood.android.models.portfolio.PerformanceChartModel;
import com.robinhood.android.models.portfolio.PerformanceChartSettingsV2;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.android.models.portfolio.api.PerformanceChartStyle;
import com.robinhood.android.models.portfolio.api.PerformanceChartType;
import com.robinhood.android.portfolio.privacy.PortfolioPrivacyPref;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.GbpRegionGate;
import com.robinhood.android.regiongate.McwCurrencySwitcherRegionGate;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartFeatureStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartSettingsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.BenchmarkIntroShownPrefState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.prefs.ChartHoursEnabledPrefState;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Some;
import dispatch.core.Launch;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.rxkotlin.disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import p479j$.time.Instant;
import p479j$.time.temporal.TemporalAmount;

/* compiled from: PerformanceChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B}\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010$\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010\"J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J3\u00104\u001a\u0002032\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00102\u001a\u00020\u0013¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u00010,¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020 ¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010@R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010AR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010BR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010CR \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/lib/performancechart/PerformanceChartDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartViewState;", "Lcom/robinhood/android/lib/performancechart/PerformanceChartStateProvider;", "stateProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "performanceChartStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "settingsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "chartFeatureStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "chartHoursEnabledPrefState", "benchmarkIntroShownPrefState", "Lcom/robinhood/prefs/BooleanPreference;", "portfolioPrivacyPref", "Lcom/robinhood/prefs/IntPreference;", "displayCurrencySelectionPref", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/lib/performancechart/PerformanceChartStateProvider;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/app/type/AppType;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "chartModel", "", "delayStaleChartModel", "(Lcom/robinhood/android/models/portfolio/PerformanceChartModel;)V", "t1", "t2", "performanceChartModelPrefetchDistinctCheck", "(Lcom/robinhood/android/models/portfolio/PerformanceChartModel;Lcom/robinhood/android/models/portfolio/PerformanceChartModel;)Z", "prefetchStaleAvailableSpans", "j$/time/Instant", "receivedAt", "checkIfDataIsStale", "(Lj$/time/Instant;)Z", "", "accountNumber", "Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;", "chartType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "marketValuesType", "allowFxTooltip", "Lio/reactivex/disposables/Disposable;", "bind", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PerformanceChartType;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Z)Lio/reactivex/disposables/Disposable;", "span", "onSpanSelected", "(Ljava/lang/String;)V", "onBigNumberClicked", "()V", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartSettingsV2Store;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartFeatureStore;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Lcom/robinhood/shared/app/type/AppType;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/prefs/BooleanPreference;", "Lcom/robinhood/prefs/IntPreference;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "requestChartSpanRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "previousPrefetchKey", "Lcom/robinhood/android/models/portfolio/PerformanceChartModel;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "cachedChartRequest", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartStore$PerformanceChartRequest;", "delayOldChartModel", "Z", "getDelayOldChartModel$lib_performance_chart_externalDebug", "()Z", "setDelayOldChartModel$lib_performance_chart_externalDebug", "(Z)V", "Lkotlinx/coroutines/Job;", "delayOldChartModelJob", "Lkotlinx/coroutines/Job;", "lib-performance-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PerformanceChartDuxo extends BaseDuxo<PerformanceChartDataState, PerformanceChartStateProvider3> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final AppType appType;
    private final StateFlow2<Boolean> benchmarkIntroShownPrefState;
    private PerformanceChartStore.PerformanceChartRequest cachedChartRequest;
    private final PerformanceChartFeatureStore chartFeatureStore;
    private final StateFlow2<Boolean> chartHoursEnabledPrefState;
    private boolean delayOldChartModel;
    private Job delayOldChartModelJob;
    private final IntPreference displayCurrencySelectionPref;
    private final PerformanceChartStore performanceChartStore;
    private final BooleanPreference portfolioPrivacyPref;
    private PerformanceChartModel previousPrefetchKey;
    private final RegionGateProvider regionGateProvider;
    private final BehaviorRelay<Optional<String>> requestChartSpanRelay;
    private final PerformanceChartSettingsV2Store settingsStore;

    /* compiled from: PerformanceChartDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceChartDuxo(PerformanceChartStateProvider stateProvider, AccountProvider accountProvider, PerformanceChartStore performanceChartStore, PerformanceChartSettingsV2Store settingsStore, PerformanceChartFeatureStore chartFeatureStore, RegionGateProvider regionGateProvider, AppType appType, @ChartHoursEnabledPrefState StateFlow2<Boolean> chartHoursEnabledPrefState, @BenchmarkIntroShownPrefState StateFlow2<Boolean> benchmarkIntroShownPrefState, @PortfolioPrivacyPref BooleanPreference portfolioPrivacyPref, @DisplayCurrencySelectionPrefs3 IntPreference displayCurrencySelectionPref, DuxoBundle duxoBundle) {
        super(new PerformanceChartDataState(null, null, null, null, false, null, false, false, false, false, false, false, false, null, 16383, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(performanceChartStore, "performanceChartStore");
        Intrinsics.checkNotNullParameter(settingsStore, "settingsStore");
        Intrinsics.checkNotNullParameter(chartFeatureStore, "chartFeatureStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(chartHoursEnabledPrefState, "chartHoursEnabledPrefState");
        Intrinsics.checkNotNullParameter(benchmarkIntroShownPrefState, "benchmarkIntroShownPrefState");
        Intrinsics.checkNotNullParameter(portfolioPrivacyPref, "portfolioPrivacyPref");
        Intrinsics.checkNotNullParameter(displayCurrencySelectionPref, "displayCurrencySelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.performanceChartStore = performanceChartStore;
        this.settingsStore = settingsStore;
        this.chartFeatureStore = chartFeatureStore;
        this.regionGateProvider = regionGateProvider;
        this.appType = appType;
        this.chartHoursEnabledPrefState = chartHoursEnabledPrefState;
        this.benchmarkIntroShownPrefState = benchmarkIntroShownPrefState;
        this.portfolioPrivacyPref = portfolioPrivacyPref;
        this.displayCurrencySelectionPref = displayCurrencySelectionPref;
        BehaviorRelay<Optional<String>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.requestChartSpanRelay = behaviorRelayCreateDefault;
        this.delayOldChartModel = true;
    }

    /* renamed from: getDelayOldChartModel$lib_performance_chart_externalDebug, reason: from getter */
    public final boolean getDelayOldChartModel() {
        return this.delayOldChartModel;
    }

    public final void setDelayOldChartModel$lib_performance_chart_externalDebug(boolean z) {
        this.delayOldChartModel = z;
    }

    public static /* synthetic */ Disposable bind$default(PerformanceChartDuxo performanceChartDuxo, String str, PerformanceChartType performanceChartType, AccountMarketValuesType accountMarketValuesType, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            accountMarketValuesType = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return performanceChartDuxo.bind(str, performanceChartType, accountMarketValuesType, z);
    }

    /* compiled from: PerformanceChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$1 */
    static final class C204811 extends ContinuationImpl7 implements Function2<PerformanceChartDataState, Continuation<? super PerformanceChartDataState>, Object> {
        final /* synthetic */ PerformanceChartType $chartType;
        final /* synthetic */ AccountMarketValuesType $marketValuesType;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PerformanceChartDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C204811(PerformanceChartType performanceChartType, AccountMarketValuesType accountMarketValuesType, PerformanceChartDuxo performanceChartDuxo, Continuation<? super C204811> continuation) {
            super(2, continuation);
            this.$chartType = performanceChartType;
            this.$marketValuesType = accountMarketValuesType;
            this.this$0 = performanceChartDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C204811 c204811 = new C204811(this.$chartType, this.$marketValuesType, this.this$0, continuation);
            c204811.L$0 = obj;
            return c204811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PerformanceChartDataState performanceChartDataState, Continuation<? super PerformanceChartDataState> continuation) {
            return ((C204811) create(performanceChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PerformanceChartDataState performanceChartDataState = (PerformanceChartDataState) this.L$0;
            return performanceChartDataState.copy((16127 & 1) != 0 ? performanceChartDataState.chartType : this.$chartType, (16127 & 2) != 0 ? performanceChartDataState.chartModel : null, (16127 & 4) != 0 ? performanceChartDataState.activeSpan : null, (16127 & 8) != 0 ? performanceChartDataState.marketValuesType : this.$marketValuesType, (16127 & 16) != 0 ? performanceChartDataState.showSettings : false, (16127 & 32) != 0 ? performanceChartDataState.chartSettings : null, (16127 & 64) != 0 ? performanceChartDataState.benchmarksEnabled : false, (16127 & 128) != 0 ? performanceChartDataState.showBenchmarksTooltip : false, (16127 & 256) != 0 ? performanceChartDataState.showFxTooltipButton : false, (16127 & 512) != 0 ? performanceChartDataState.isStale : false, (16127 & 1024) != 0 ? performanceChartDataState.isInCryptoRegionGate : false, (16127 & 2048) != 0 ? performanceChartDataState.isInEtfRegionGate : false, (16127 & 4096) != 0 ? performanceChartDataState.isInMcwRegionGate : false, (16127 & 8192) != 0 ? performanceChartDataState.appType : this.this$0.appType);
        }
    }

    public final Disposable bind(final String accountNumber, final PerformanceChartType chartType, final AccountMarketValuesType marketValuesType, boolean allowFxTooltip) {
        Observable<Boolean> observableJust;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        applyMutation(new C204811(chartType, marketValuesType, this, null));
        Observable<Account> observableDistinctUntilChanged = this.accountProvider.streamAccount(accountNumber).distinctUntilChanged((Function<? super Account, K>) new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$accountStream$1
            @Override // io.reactivex.functions.Function
            public final String apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                return account.getAccountNumber();
            }
        });
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Observable<Boolean> observableIsChartViewEnabled = this.chartFeatureStore.isChartViewEnabled(chartType);
        Observable<Boolean> observableIsAdtToggleEnabled = this.chartFeatureStore.isAdtToggleEnabled(chartType);
        if (chartType == PerformanceChartType.HISTORICAL_PORTFOLIO) {
            observableJust = this.chartFeatureStore.isBenchmarksEnabled(chartType);
        } else {
            observableJust = Observable.just(Boolean.FALSE);
            Intrinsics.checkNotNull(observableJust);
        }
        disposable.addTo(bind(observableJust, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        }), compositeDisposable);
        Observable observableCombineLatest = Observable.combineLatest(observableJust, asObservable(this.benchmarkIntroShownPrefState), new BiFunction() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo.bind.3
            @Override // io.reactivex.functions.BiFunction
            public final Boolean apply(Boolean isBenchmarkingEnabled, Boolean benchmarkIntroShown) {
                Intrinsics.checkNotNullParameter(isBenchmarkingEnabled, "isBenchmarkingEnabled");
                Intrinsics.checkNotNullParameter(benchmarkIntroShown, "benchmarkIntroShown");
                return Boolean.valueOf(isBenchmarkingEnabled.booleanValue() && !benchmarkIntroShown.booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        disposable.addTo(bind(observableCombineLatest, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$1(this.f$0, (Boolean) obj);
            }
        }), compositeDisposable);
        disposable.addTo(bind(this.chartFeatureStore.isConfigurable(chartType), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        }), compositeDisposable);
        Observable observableSwitchMap = Observable.combineLatest(observableIsChartViewEnabled, observableJust, new BiFunction() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo.bind.6
            @Override // io.reactivex.functions.BiFunction
            public final Boolean apply(Boolean isChartViewEnabled, Boolean isBenchmarkingEnabled) {
                Intrinsics.checkNotNullParameter(isChartViewEnabled, "isChartViewEnabled");
                Intrinsics.checkNotNullParameter(isBenchmarkingEnabled, "isBenchmarkingEnabled");
                return Boolean.valueOf(isChartViewEnabled.booleanValue() || isBenchmarkingEnabled.booleanValue());
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo.bind.7
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<PerformanceChartSettingsV2>> apply(Boolean isSettingsEnabled) {
                Intrinsics.checkNotNullParameter(isSettingsEnabled, "isSettingsEnabled");
                if (isSettingsEnabled.booleanValue()) {
                    PerformanceChartDuxo performanceChartDuxo = PerformanceChartDuxo.this;
                    final Flow<PerformanceChartSettingsV2> flowQuerySettings = performanceChartDuxo.settingsStore.querySettings(accountNumber, chartType);
                    return performanceChartDuxo.asObservable(new Flow<Optional<? extends PerformanceChartSettingsV2>>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$7$apply$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Optional<? extends PerformanceChartSettingsV2>> flowCollector, Continuation continuation) {
                            Object objCollect = flowQuerySettings.collect(new C204792(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$7$apply$$inlined$map$1$2 */
                        public static final class C204792<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$7$apply$$inlined$map$1$2", m3645f = "PerformanceChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$7$apply$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return C204792.this.emit(null, this);
                                }
                            }

                            public C204792(FlowCollector flowCollector) {
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
                                    Optional optionalAsOptional = Optional3.asOptional((PerformanceChartSettingsV2) obj);
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
                    });
                }
                Observable observableJust2 = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        disposable.addTo(bind(observableSwitchMap, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$3(this.f$0, (Optional) obj);
            }
        }), compositeDisposable);
        ObservableSource observableSourceSwitchMap = observableIsChartViewEnabled.switchMap(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartStyleStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<PerformanceChartStyle>> apply(Boolean isEnabled) {
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (isEnabled.booleanValue()) {
                    PerformanceChartDuxo performanceChartDuxo = this.this$0;
                    return performanceChartDuxo.asObservable(performanceChartDuxo.settingsStore.querySettings(accountNumber, chartType)).map(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartStyleStream$1.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<PerformanceChartStyle> apply(PerformanceChartSettingsV2 it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Optional3.asOptional(it.getChartStyle());
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap, "switchMap(...)");
        Observables observables = Observables.INSTANCE;
        Intrinsics.checkNotNull(observableDistinctUntilChanged);
        ObservableSource observableSourceSwitchMap2 = observableIsAdtToggleEnabled.switchMap(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartHoursEnabledStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Boolean>> apply(Boolean isEnabled) {
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (isEnabled.booleanValue()) {
                    PerformanceChartDuxo performanceChartDuxo = this.this$0;
                    final StateFlow2 stateFlow2 = performanceChartDuxo.chartHoursEnabledPrefState;
                    return performanceChartDuxo.asObservable(new Flow<Optional<? extends Boolean>>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartHoursEnabledStream$1$apply$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Optional<? extends Boolean>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartHoursEnabledStream$1$apply$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartHoursEnabledStream$1$apply$$inlined$map$1$2", m3645f = "PerformanceChartDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$chartHoursEnabledStream$1$apply$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Optional optionalAsOptional = Optional3.asOptional(boxing.boxBoolean(((Boolean) obj).booleanValue()));
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
                    });
                }
                Observable observableJust2 = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap2, "switchMap(...)");
        Observable observableCombineLatest2 = Observable.combineLatest(observableDistinctUntilChanged, observableSourceSwitchMap2, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                R r = (R) ((Optional) t2);
                int i = PerformanceChartDuxo.WhenMappings.$EnumSwitchMapping$0[((Account) t1).getManagementType().ordinal()];
                if (i == 1) {
                    return (R) new Some(Boolean.FALSE);
                }
                if (i == 2 || i == 3) {
                    return r;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest2, "Observable.combineLatest…ombineFunction(t1, t2) })");
        ObservableSource observableSourceSwitchMap3 = observableJust.switchMap(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$benchmarkIdsStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<List<String>>> apply(Boolean isEnabled) {
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (isEnabled.booleanValue()) {
                    PerformanceChartDuxo performanceChartDuxo = this.this$0;
                    return performanceChartDuxo.asObservable(performanceChartDuxo.settingsStore.querySettings(accountNumber, chartType)).map(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$benchmarkIdsStream$1.1
                        @Override // io.reactivex.functions.Function
                        public final List<String> apply(PerformanceChartSettingsV2 settings) {
                            Intrinsics.checkNotNullParameter(settings, "settings");
                            List<PerformanceChartBenchmarkV2> benchmarks = settings.getBenchmarks();
                            ArrayList arrayList = new ArrayList();
                            for (T t : benchmarks) {
                                if (((PerformanceChartBenchmarkV2) t).isSelected()) {
                                    arrayList.add(t);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator<T> it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((PerformanceChartBenchmarkV2) it.next()).getId());
                            }
                            return arrayList2;
                        }
                    }).map(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$benchmarkIdsStream$1.2
                        @Override // io.reactivex.functions.Function
                        public final Optional<List<String>> apply(List<String> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return Optional3.asOptional(it);
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap3, "switchMap(...)");
        Observable observableShare = Observable.combineLatest(this.requestChartSpanRelay, observableSourceSwitchMap, observableCombineLatest2, observableSourceSwitchMap3, this.portfolioPrivacyPref.getChanges(), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, McwCurrencySwitcherRegionGate.INSTANCE, false, 2, null).flatMap(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$displayCurrencyStream$1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends DisplayCurrency> apply(Boolean enabled) {
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    return DisplayCurrencyExtensions.displayCurrencyObservable(this.this$0.displayCurrencySelectionPref);
                }
                Observable observableJust2 = Observable.just(DisplayCurrency.USD);
                Intrinsics.checkNotNull(observableJust2);
                return observableJust2;
            }
        }), new Function6() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$performanceChartRequest$1
            @Override // io.reactivex.functions.Function6
            public final PerformanceChartStore.PerformanceChartRequest apply(Optional<String> optional, Optional<? extends PerformanceChartStyle> optional2, Optional<Boolean> optional3, Optional<? extends List<String>> optional4, Boolean isPrivacyEnabled, DisplayCurrency displayCurrency) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Intrinsics.checkNotNullParameter(optional2, "<destruct>");
                Intrinsics.checkNotNullParameter(optional3, "<destruct>");
                Intrinsics.checkNotNullParameter(optional4, "<destruct>");
                Intrinsics.checkNotNullParameter(isPrivacyEnabled, "isPrivacyEnabled");
                Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
                String strComponent1 = optional.component1();
                PerformanceChartStyle performanceChartStyleComponent1 = optional2.component1();
                Boolean boolComponent1 = optional3.component1();
                PerformanceChartStore.PerformanceChartRequest performanceChartRequest = new PerformanceChartStore.PerformanceChartRequest(accountNumber, chartType.getServerValue(), performanceChartStyleComponent1 != null ? performanceChartStyleComponent1.getServerValue() : null, strComponent1, false, optional4.component1(), boolComponent1, isPrivacyEnabled.booleanValue(), marketValuesType == null ? displayCurrency : null, 16, null);
                this.cachedChartRequest = performanceChartRequest;
                return performanceChartRequest;
            }
        }).switchMap(new Function() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$performanceChartRequest$2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends PerformanceChartModel> apply(PerformanceChartStore.PerformanceChartRequest request) {
                Intrinsics.checkNotNullParameter(request, "request");
                PerformanceChartDuxo performanceChartDuxo = this.this$0;
                return performanceChartDuxo.asObservable(performanceChartDuxo.performanceChartStore.chartQuery(request));
            }
        }).share();
        Intrinsics.checkNotNull(observableShare);
        disposable.addTo(bind(observableShare, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$5(this.f$0, (PerformanceChartModel) obj);
            }
        }), compositeDisposable);
        Observable observableDistinctUntilChanged2 = observableShare.skipWhile(new Predicate() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo.bind.10
            @Override // io.reactivex.functions.Predicate
            public final boolean test(PerformanceChartModel chartModel) {
                Intrinsics.checkNotNullParameter(chartModel, "chartModel");
                PerformanceChartDuxo performanceChartDuxo = PerformanceChartDuxo.this;
                return performanceChartDuxo.performanceChartModelPrefetchDistinctCheck(performanceChartDuxo.previousPrefetchKey, chartModel);
            }
        }).distinctUntilChanged(new BiPredicate() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo.bind.11
            @Override // io.reactivex.functions.BiPredicate
            public final boolean test(PerformanceChartModel t1, PerformanceChartModel t2) {
                Intrinsics.checkNotNullParameter(t1, "t1");
                Intrinsics.checkNotNullParameter(t2, "t2");
                return PerformanceChartDuxo.this.performanceChartModelPrefetchDistinctCheck(t1, t2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        disposable.addTo(bind(observableDistinctUntilChanged2, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$6(this.f$0, (PerformanceChartModel) obj);
            }
        }), compositeDisposable);
        if (allowFxTooltip) {
            Observable observableCombineLatest3 = Observable.combineLatest(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, GbpRegionGate.INSTANCE, false, 2, null), RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$bind$$inlined$combineLatest$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.BiFunction
                public final R apply(T1 t1, T2 t2) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    return (R) Boolean.valueOf(((Boolean) t1).booleanValue() && !((Boolean) t2).booleanValue());
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest3, "Observable.combineLatest…ombineFunction(t1, t2) })");
            disposable.addTo(bind(observableCombineLatest3, DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PerformanceChartDuxo.bind$lambda$8(this.f$0, ((Boolean) obj).booleanValue());
                }
            }), compositeDisposable);
        }
        disposable.addTo(bind(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, McwRegionGate.INSTANCE, false, 2, null), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$9(this.f$0, ((Boolean) obj).booleanValue());
            }
        }), compositeDisposable);
        disposable.addTo(bind(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, CryptoRegionGate.INSTANCE, false, 2, null), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$10(this.f$0, ((Boolean) obj).booleanValue());
            }
        }), compositeDisposable);
        disposable.addTo(bind(RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, EtfRegionGate.INSTANCE, false, 2, null), DuxosKt.getCOMPOSE_DUXO_TERMINAL_EVENT()).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PerformanceChartDuxo.bind$lambda$11(this.f$0, ((Boolean) obj).booleanValue());
            }
        }), compositeDisposable);
        return compositeDisposable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(PerformanceChartDuxo performanceChartDuxo, boolean z) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$2$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(PerformanceChartDuxo performanceChartDuxo, Boolean bool) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$4$1(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(PerformanceChartDuxo performanceChartDuxo, boolean z) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$5$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(PerformanceChartDuxo performanceChartDuxo, Optional optional) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$8$1((PerformanceChartSettingsV2) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(PerformanceChartDuxo performanceChartDuxo, PerformanceChartModel performanceChartModel) {
        boolean zCheckIfDataIsStale = performanceChartDuxo.checkIfDataIsStale(performanceChartModel.getReceivedAt());
        Job job = performanceChartDuxo.delayOldChartModelJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        if (performanceChartDuxo.delayOldChartModel && zCheckIfDataIsStale) {
            performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$9$1(null));
            Intrinsics.checkNotNull(performanceChartModel);
            performanceChartDuxo.delayStaleChartModel(performanceChartModel);
        } else {
            performanceChartDuxo.delayOldChartModel = false;
            performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$9$2(performanceChartModel, zCheckIfDataIsStale, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(PerformanceChartDuxo performanceChartDuxo, PerformanceChartModel performanceChartModel) {
        Intrinsics.checkNotNull(performanceChartModel);
        performanceChartDuxo.prefetchStaleAvailableSpans(performanceChartModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$8(PerformanceChartDuxo performanceChartDuxo, boolean z) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$14$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9(PerformanceChartDuxo performanceChartDuxo, boolean z) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$15$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10(PerformanceChartDuxo performanceChartDuxo, boolean z) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$16$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$11(PerformanceChartDuxo performanceChartDuxo, boolean z) {
        performanceChartDuxo.applyMutation(new PerformanceChartDuxo$bind$17$1(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: PerformanceChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$delayStaleChartModel$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {300}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$delayStaleChartModel$1 */
    static final class C204901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceChartModel $chartModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C204901(PerformanceChartModel performanceChartModel, Continuation<? super C204901> continuation) {
            super(2, continuation);
            this.$chartModel = performanceChartModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PerformanceChartDuxo.this.new C204901(this.$chartModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C204901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PerformanceChartDuxo.this.applyMutation(new AnonymousClass1(this.$chartModel, null));
            return Unit.INSTANCE;
        }

        /* compiled from: PerformanceChartDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$delayStaleChartModel$1$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$delayStaleChartModel$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PerformanceChartDataState, Continuation<? super PerformanceChartDataState>, Object> {
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
            public final Object invoke(PerformanceChartDataState performanceChartDataState, Continuation<? super PerformanceChartDataState> continuation) {
                return ((AnonymousClass1) create(performanceChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PerformanceChartDataState performanceChartDataState = (PerformanceChartDataState) this.L$0;
                return performanceChartDataState.copy((16127 & 1) != 0 ? performanceChartDataState.chartType : null, (16127 & 2) != 0 ? performanceChartDataState.chartModel : this.$chartModel, (16127 & 4) != 0 ? performanceChartDataState.activeSpan : this.$chartModel.getDisplaySpan(), (16127 & 8) != 0 ? performanceChartDataState.marketValuesType : null, (16127 & 16) != 0 ? performanceChartDataState.showSettings : false, (16127 & 32) != 0 ? performanceChartDataState.chartSettings : null, (16127 & 64) != 0 ? performanceChartDataState.benchmarksEnabled : false, (16127 & 128) != 0 ? performanceChartDataState.showBenchmarksTooltip : false, (16127 & 256) != 0 ? performanceChartDataState.showFxTooltipButton : false, (16127 & 512) != 0 ? performanceChartDataState.isStale : true, (16127 & 1024) != 0 ? performanceChartDataState.isInCryptoRegionGate : false, (16127 & 2048) != 0 ? performanceChartDataState.isInEtfRegionGate : false, (16127 & 4096) != 0 ? performanceChartDataState.isInMcwRegionGate : false, (16127 & 8192) != 0 ? performanceChartDataState.appType : null);
            }
        }
    }

    private final void delayStaleChartModel(PerformanceChartModel chartModel) {
        this.delayOldChartModel = false;
        this.delayOldChartModelJob = BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C204901(chartModel, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performanceChartModelPrefetchDistinctCheck(PerformanceChartModel t1, PerformanceChartModel t2) {
        if (!Intrinsics.areEqual(t1 != null ? t1.getIncludeAllHours() : null, t2 != null ? t2.getIncludeAllHours() : null)) {
            return false;
        }
        if (!Intrinsics.areEqual(t1 != null ? Boolean.valueOf(t1.isForWidget()) : null, t2 != null ? Boolean.valueOf(t2.isForWidget()) : null)) {
            return false;
        }
        if (!Intrinsics.areEqual(t1 != null ? Boolean.valueOf(t1.isPrivacyEnabled()) : null, t2 != null ? Boolean.valueOf(t2.isPrivacyEnabled()) : null)) {
            return false;
        }
        if (!Intrinsics.areEqual(t1 != null ? t1.getChartStyle() : null, t2 != null ? t2.getChartStyle() : null)) {
            return false;
        }
        if (!Intrinsics.areEqual(t1 != null ? t1.getChartType() : null, t2 != null ? t2.getChartType() : null)) {
            return false;
        }
        if (Intrinsics.areEqual(t1 != null ? t1.getAccountNumber() : null, t2 != null ? t2.getAccountNumber() : null)) {
            return Intrinsics.areEqual(t1 != null ? t1.getBenchmarkIds() : null, t2 != null ? t2.getBenchmarkIds() : null);
        }
        return false;
    }

    /* compiled from: PerformanceChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$prefetchStaleAvailableSpans$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$prefetchStaleAvailableSpans$1 */
    static final class C204921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PerformanceChartModel $chartModel;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PerformanceChartDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C204921(PerformanceChartModel performanceChartModel, PerformanceChartDuxo performanceChartDuxo, Continuation<? super C204921> continuation) {
            super(2, continuation);
            this.$chartModel = performanceChartModel;
            this.this$0 = performanceChartDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C204921(this.$chartModel, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C204921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
        
            if (r7.join(r22) == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ac -> B:24:0x00bd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ba -> B:24:0x00bd). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PerformanceChartModel performanceChartModel;
            PerformanceChartDuxo performanceChartDuxo;
            Iterator it;
            Object objRefreshChartIfStale;
            PerformanceChartModel performanceChartModel2;
            PerformanceChartDuxo performanceChartDuxo2;
            Job job;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<SpanOption> availableSpans = this.$chartModel.getSpans().getAvailableSpans();
                performanceChartModel = this.$chartModel;
                performanceChartDuxo = this.this$0;
                it = availableSpans.iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                it = (Iterator) this.L$2;
                performanceChartDuxo2 = (PerformanceChartDuxo) this.L$1;
                performanceChartModel2 = (PerformanceChartModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                objRefreshChartIfStale = obj;
                job = (Job) objRefreshChartIfStale;
                if (job != null) {
                }
                PerformanceChartModel performanceChartModel3 = performanceChartModel2;
                performanceChartDuxo = performanceChartDuxo2;
                performanceChartModel = performanceChartModel3;
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$2;
            performanceChartDuxo2 = (PerformanceChartDuxo) this.L$1;
            performanceChartModel2 = (PerformanceChartModel) this.L$0;
            ResultKt.throwOnFailure(obj);
            PerformanceChartModel performanceChartModel32 = performanceChartModel2;
            performanceChartDuxo = performanceChartDuxo2;
            performanceChartModel = performanceChartModel32;
            while (it.hasNext()) {
                SpanOption spanOption = (SpanOption) it.next();
                if (!Intrinsics.areEqual(spanOption.getQueryValue(), performanceChartModel.getDisplaySpan())) {
                    PerformanceChartStore performanceChartStore = performanceChartDuxo.performanceChartStore;
                    PerformanceChartStore.PerformanceChartRequest performanceChartRequest = new PerformanceChartStore.PerformanceChartRequest(performanceChartModel.getAccountNumber(), performanceChartModel.getChartType(), performanceChartModel.getChartStyle(), spanOption.getQueryValue(), false, CollectionsKt.emptyList(), performanceChartModel.getIncludeAllHours(), false, null, 400, null);
                    this.L$0 = performanceChartModel;
                    this.L$1 = performanceChartDuxo;
                    this.L$2 = it;
                    this.label = 1;
                    objRefreshChartIfStale = performanceChartStore.refreshChartIfStale(performanceChartRequest, this);
                    if (objRefreshChartIfStale != coroutine_suspended) {
                        PerformanceChartDuxo performanceChartDuxo3 = performanceChartDuxo;
                        performanceChartModel2 = performanceChartModel;
                        performanceChartDuxo2 = performanceChartDuxo3;
                        job = (Job) objRefreshChartIfStale;
                        if (job != null) {
                            this.L$0 = performanceChartModel2;
                            this.L$1 = performanceChartDuxo2;
                            this.L$2 = it;
                            this.label = 2;
                        }
                        PerformanceChartModel performanceChartModel322 = performanceChartModel2;
                        performanceChartDuxo = performanceChartDuxo2;
                        performanceChartModel = performanceChartModel322;
                        while (it.hasNext()) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void prefetchStaleAvailableSpans(PerformanceChartModel chartModel) {
        this.previousPrefetchKey = chartModel;
        Launch.launchIO$default(getLifecycleScope(), null, null, new C204921(chartModel, this, null), 3, null);
    }

    /* compiled from: PerformanceChartDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/performancechart/PerformanceChartDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartDuxo$onSpanSelected$1", m3645f = "PerformanceChartDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartDuxo$onSpanSelected$1 */
    static final class C204911 extends ContinuationImpl7 implements Function2<PerformanceChartDataState, Continuation<? super PerformanceChartDataState>, Object> {
        final /* synthetic */ String $span;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C204911(String str, Continuation<? super C204911> continuation) {
            super(2, continuation);
            this.$span = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C204911 c204911 = new C204911(this.$span, continuation);
            c204911.L$0 = obj;
            return c204911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PerformanceChartDataState performanceChartDataState, Continuation<? super PerformanceChartDataState> continuation) {
            return ((C204911) create(performanceChartDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PerformanceChartDataState performanceChartDataState = (PerformanceChartDataState) this.L$0;
            return performanceChartDataState.copy((16127 & 1) != 0 ? performanceChartDataState.chartType : null, (16127 & 2) != 0 ? performanceChartDataState.chartModel : null, (16127 & 4) != 0 ? performanceChartDataState.activeSpan : this.$span, (16127 & 8) != 0 ? performanceChartDataState.marketValuesType : null, (16127 & 16) != 0 ? performanceChartDataState.showSettings : false, (16127 & 32) != 0 ? performanceChartDataState.chartSettings : null, (16127 & 64) != 0 ? performanceChartDataState.benchmarksEnabled : false, (16127 & 128) != 0 ? performanceChartDataState.showBenchmarksTooltip : false, (16127 & 256) != 0 ? performanceChartDataState.showFxTooltipButton : false, (16127 & 512) != 0 ? performanceChartDataState.isStale : false, (16127 & 1024) != 0 ? performanceChartDataState.isInCryptoRegionGate : false, (16127 & 2048) != 0 ? performanceChartDataState.isInEtfRegionGate : false, (16127 & 4096) != 0 ? performanceChartDataState.isInMcwRegionGate : false, (16127 & 8192) != 0 ? performanceChartDataState.appType : null);
        }
    }

    public final void onSpanSelected(String span) {
        this.requestChartSpanRelay.accept(Optional3.asOptional(span));
        applyMutation(new C204911(span, null));
    }

    public final void onBigNumberClicked() {
        this.portfolioPrivacyPref.set(!r0.get());
        boolean z = this.portfolioPrivacyPref.get();
        PerformanceChartStore.PerformanceChartRequest performanceChartRequest = this.cachedChartRequest;
        if (performanceChartRequest != null) {
            this.performanceChartStore.refreshChart(PerformanceChartStore.PerformanceChartRequest.copy$default(performanceChartRequest, null, null, null, null, false, null, null, z, null, 383, null), true);
        }
    }

    private final boolean checkIfDataIsStale(Instant receivedAt) {
        return Instant.now().minus((TemporalAmount) p479j$.time.Duration.ofMinutes(5L)).isAfter(receivedAt);
    }
}
