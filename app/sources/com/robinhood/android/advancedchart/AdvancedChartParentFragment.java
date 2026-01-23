package com.robinhood.android.advancedchart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorTypes;
import com.robinhood.android.advancedchart.AdvancedChartEvent;
import com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter;
import com.robinhood.android.advancedchart.AdvancedChartView;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartParentBinding;
import com.robinhood.android.charts.models.p080db.AdvancedChartModel;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DesignSystemOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.education.contracts.AdvancedAlert;
import com.robinhood.android.equities.contracts.InstrumentChartIntervalsKey;
import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartView;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ShowAdvancedChartTooltipPref;
import com.robinhood.android.equitydetail.p123ui.chartsettings.ShownAdvancedChartDisclosureTooltipPref;
import com.robinhood.android.equitydetail.p123ui.tradebar.AnalyticsData;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.AdvancedChartZoomKeys;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.alert.AdvancedAlertEntryPoint;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartIndicatorListFragmentKey;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.shared.iac.infobanner.InfoBannerComponentView;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.Either2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.Ranges3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AdvancedChartParentFragment.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001]B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u0002002\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u001a\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020<2\b\u00104\u001a\u0004\u0018\u000105H\u0017J\u0010\u0010=\u001a\u0002002\u0006\u0010>\u001a\u00020?H\u0016J\u0018\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0014J\u0010\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020GH\u0016J\u001a\u0010H\u001a\u00020\u00072\u0006\u0010I\u001a\u00020&2\b\u0010J\u001a\u0004\u0018\u000105H\u0016J \u0010K\u001a\u0002002\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020&2\u0006\u0010O\u001a\u00020\u0007H\u0016J\u0010\u0010P\u001a\u0002002\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010Q\u001a\u0002002\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010R\u001a\u000200H\u0016J\b\u0010S\u001a\u000200H\u0016J\b\u0010T\u001a\u00020\u0007H\u0016J\"\u0010U\u001a\u0002002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\b\u0010\\\u001a\u000200H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00106\u001a\u0002078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "Lcom/robinhood/android/advancedchart/AdvancedChartIndicatorsAdapter$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "showAdvancedChartTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowAdvancedChartTooltipPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowAdvancedChartTooltipPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "shownAdvancedChartDisclosureTooltipPref", "getShownAdvancedChartDisclosureTooltipPref", "setShownAdvancedChartDisclosureTooltipPref", "binding", "Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartParentBinding;", "getBinding", "()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartParentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advancedchart/AdvancedChartDuxo;", "getDuxo", "()Lcom/robinhood/android/advancedchart/AdvancedChartDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "directionRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/designsystem/style/DirectionOverlay;", "footerHeightSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "tradeBarFragment", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "getTradeBarFragment", "()Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onViewCreated", "view", "Landroid/view/View;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onLearnMoreActionClicked", "dialogId", "passthroughArgs", "onIndicatorTapped", "indicatorState", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "position", "isScrollEnabled", "onInfoIconTapped", "onSettingsIconTapped", "onAddPlusButtonTapped", "onEmptyStateAddDataButtonTapped", "onBackPressed", "onInitiateOrder", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "onAnalystReportHintClicked", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartParentFragment extends BaseFragment implements InstrumentDetailTradeBarFragment.Callbacks, AdvancedChartIndicatorsAdapter.Callbacks {
    private static final String TAG_CHART_SETTINGS = "TAG_CHART_SETTINGS";
    private static final String TAG_TRADE_BAR = "TAG_TRADE_BAR";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    private final BehaviorRelay<DirectionOverlay> directionRelay;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final BehaviorSubject<Integer> footerHeightSubject;

    @ShowAdvancedChartTooltipPref
    public BooleanPreference showAdvancedChartTooltipPref;

    @ShownAdvancedChartDisclosureTooltipPref
    public BooleanPreference shownAdvancedChartDisclosureTooltipPref;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedChartParentFragment.class, "binding", "getBinding()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartParentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onAnalystReportHintClicked() {
    }

    public AdvancedChartParentFragment() {
        super(C8502R.layout.fragment_advanced_chart_parent);
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, AdvancedChartParentFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AdvancedChartDuxo.class);
        BehaviorRelay<DirectionOverlay> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.directionRelay = behaviorRelayCreate;
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.footerHeightSubject = behaviorSubjectCreate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    public final BooleanPreference getShowAdvancedChartTooltipPref() {
        BooleanPreference booleanPreference = this.showAdvancedChartTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showAdvancedChartTooltipPref");
        return null;
    }

    public final void setShowAdvancedChartTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showAdvancedChartTooltipPref = booleanPreference;
    }

    public final BooleanPreference getShownAdvancedChartDisclosureTooltipPref() {
        BooleanPreference booleanPreference = this.shownAdvancedChartDisclosureTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shownAdvancedChartDisclosureTooltipPref");
        return null;
    }

    public final void setShownAdvancedChartDisclosureTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shownAdvancedChartDisclosureTooltipPref = booleanPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAdvancedChartParentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAdvancedChartParentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedChartDuxo getDuxo() {
        return (AdvancedChartDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TooltipManager getTooltipManager() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.tooltips.TooltipActivity");
        return ((TooltipActivity) componentRequireActivity).getTooltipManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstrumentDetailTradeBarFragment getTradeBarFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("TAG_TRADE_BAR");
        Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment");
        return (InstrumentDetailTradeBarFragment) fragmentFindFragmentByTag;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        final ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), DesignSystemOverlay.INSTANCE, null, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartParentFragment.onAttach$lambda$2$lambda$0(scarletContextWrapper, (DayNightOverlay) obj);
            }
        });
        Observable<DirectionOverlay> observableDistinctUntilChanged = this.directionRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartParentFragment.onAttach$lambda$2$lambda$1(scarletContextWrapper, (DirectionOverlay) obj);
            }
        });
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$0(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        int i = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i == 1) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AdvancedChartOverlay.INSTANCE, null, 2, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AdvancedChartOverlay2.INSTANCE, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$2$lambda$1(ScarletContextWrapper scarletContextWrapper, DirectionOverlay directionOverlay) {
        ScarletManager scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper);
        Intrinsics.checkNotNull(directionOverlay);
        ScarletManager.putOverlay$default(scarletManager, directionOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(C8502R.id.trade_bar_container, (InstrumentDetailTradeBarFragment) InstrumentDetailTradeBarFragment.INSTANCE.newInstance((Parcelable) new InstrumentDetailTradeBarFragment.Args(((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), true)), "TAG_TRADE_BAR").commit();
        }
        if (((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) this)).getBackToStockDetailPage()) {
            getShowAdvancedChartTooltipPref().set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getScreen() {
        Screen.Name name = Screen.Name.EQUITY_ADVANCED_CHARTS;
        String string2 = ((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ConstraintLayout chartLayout = getBinding().chartLayout;
            Intrinsics.checkNotNullExpressionValue(chartLayout, "chartLayout");
            ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(chartLayout, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        if (!getShownAdvancedChartDisclosureTooltipPref().get()) {
            View decorView = requireActivity().getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new AdvancedChartParentFragment4(this, decorView));
        }
        InfoBannerComponentView.bind$default(getBinding().infoBannerView, ((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), IacInfoBannerLocation.INFO_BANNER_STOCK_DETAIL_ADVANCED_TOP_LEVEL, null, 4, null);
        final AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter = new AdvancedChartIndicatorsAdapter(this);
        getBinding().indicatorRecyclerView.setAdapter(advancedChartIndicatorsAdapter);
        getBinding().indicatorRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        LinearLayoutCompat indicatorListView = getBinding().indicatorListView;
        Intrinsics.checkNotNullExpressionValue(indicatorListView, "indicatorListView");
        if (!indicatorListView.isLaidOut() || indicatorListView.isLayoutRequested()) {
            indicatorListView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    this.this$0.getDuxo().setIndicatorListViewHeight(view2.getHeight());
                }
            });
        } else {
            getDuxo().setIndicatorListViewHeight(indicatorListView.getHeight());
        }
        InstrumentSpanSelectorView instrumentSpanSelectorView = getBinding().spanSelector;
        instrumentSpanSelectorView.setOnSpanSelected(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartParentFragment.onViewCreated$lambda$8$lambda$4(this.f$0, (String) obj);
            }
        });
        instrumentSpanSelectorView.setOnOpenCustomIntervals(new Function2() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedChartParentFragment.onViewCreated$lambda$8$lambda$5(this.f$0, (String) obj, (String) obj2);
            }
        });
        instrumentSpanSelectorView.setOnChartSettingsClicked(new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartParentFragment.onViewCreated$lambda$8$lambda$6(this.f$0);
            }
        });
        instrumentSpanSelectorView.setOnCustomIntervalTooltipDismissed(new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartParentFragment.onViewCreated$lambda$8$lambda$7(this.f$0);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new AdvancedChartParentFragment3(this, instrumentSpanSelectorView, null), 1, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartParentFragment.onViewCreated$lambda$9(advancedChartIndicatorsAdapter, (DayNightOverlay) obj);
            }
        });
        getBinding().advancedChartView.setCallback(new AdvancedChartView.Callbacks() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.4
            @Override // com.robinhood.android.advancedchart.AdvancedChartView.Callbacks
            public void onXAxisZoomed(Ranges3<Float> newXAxisZoomRange) {
                Intrinsics.checkNotNullParameter(newXAxisZoomRange, "newXAxisZoomRange");
                AdvancedChartParentFragment.this.getDuxo().onXAxisZoomed(newXAxisZoomRange);
            }

            @Override // com.robinhood.android.advancedchart.AdvancedChartView.Callbacks
            public void onXAxisZoomEnd() {
                AdvancedChartParentFragment.this.getDuxo().onXAxisZoomEnd();
            }
        });
        Observable<Integer> observableDistinctUntilChanged = this.footerHeightSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartParentFragment.onViewCreated$lambda$10(this.f$0, (Integer) obj);
            }
        });
        Observable<Boolean> observableDistinctUntilChanged2 = getBinding().advancedChartView.getScrubbingModeObs().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartParentFragment.onViewCreated$lambda$11(this.f$0, (Boolean) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C84937(advancedChartIndicatorsAdapter, null), 1, null);
        collectDuxoState(Lifecycle.State.RESUMED, new C84948(null));
        BaseFragment.collectDuxoState$default(this, null, new C84959(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$4(AdvancedChartParentFragment advancedChartParentFragment, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartParentFragment.getDuxo().onSpanSelected(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$5(AdvancedChartParentFragment advancedChartParentFragment, String instrumentId, String spanId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        advancedChartParentFragment.getDuxo().onOpenCustomIntervalsTooltipDismissed(instrumentId, spanId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$6(AdvancedChartParentFragment advancedChartParentFragment) {
        Navigator navigator = advancedChartParentFragment.getNavigator();
        Screen screen = advancedChartParentFragment.getScreen();
        AdvancedChartFragmentKey.AlertArgs alertArgs = ((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) advancedChartParentFragment)).getAlertArgs();
        Navigator.DefaultImpls.createDialogFragment$default(navigator, new LegacyDialogFragmentKey.ChartSettings(screen, alertArgs != null ? Boolean.valueOf(alertArgs.getHideExtendedHours()) : null), null, 2, null).show(advancedChartParentFragment.getChildFragmentManager(), TAG_CHART_SETTINGS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$8$lambda$7(AdvancedChartParentFragment advancedChartParentFragment) {
        advancedChartParentFragment.getDuxo().onCustomIntervalsTooltipDismissed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        advancedChartIndicatorsAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(AdvancedChartParentFragment advancedChartParentFragment, Integer num) {
        Guideline guideline = advancedChartParentFragment.getBinding().intervalBottomGuideline;
        Intrinsics.checkNotNull(num);
        guideline.setGuidelineEnd(num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(AdvancedChartParentFragment advancedChartParentFragment, Boolean bool) {
        AdvancedChartDuxo duxo = advancedChartParentFragment.getDuxo();
        Intrinsics.checkNotNull(bool);
        duxo.logScrubbingModeUpdate(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7", m3645f = "AdvancedChartParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7 */
    static final class C84937 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AdvancedChartIndicatorsAdapter $adapter;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C84937(AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter, Continuation<? super C84937> continuation) {
            super(2, continuation);
            this.$adapter = advancedChartIndicatorsAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84937 c84937 = AdvancedChartParentFragment.this.new C84937(this.$adapter, continuation);
            c84937.L$0 = obj;
            return c84937;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84937) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$1", m3645f = "AdvancedChartParentFragment.kt", m3646l = {316}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AdvancedChartIndicatorsAdapter $adapter;
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvancedChartParentFragment advancedChartParentFragment, AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
                this.$adapter = advancedChartIndicatorsAdapter;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$adapter, continuation);
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends AdvancedChartIndicatorsAdapter2>>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super List<? extends AdvancedChartIndicatorsAdapter2>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$1$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    List<AdvancedChartIndicatorsAdapter2> indicatorsWithHeaders = ((AdvancedChartViewState) obj).getIndicatorsWithHeaders();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(indicatorsWithHeaders, anonymousClass1) == coroutine_suspended) {
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
                    final AdvancedChartIndicatorsAdapter advancedChartIndicatorsAdapter = this.$adapter;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.7.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<? extends AdvancedChartIndicatorsAdapter2>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<? extends AdvancedChartIndicatorsAdapter2> list, Continuation<? super Unit> continuation) {
                            advancedChartIndicatorsAdapter.submitList(list);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvancedChartParentFragment.this, this.$adapter, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvancedChartParentFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdvancedChartParentFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Tuples2<? extends Tuples2<? extends ChartGroup<? extends GenericAction>, ? extends AdvancedChartZoomKeys>, ? extends AdvancedChartGroupState>>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Tuples2<? extends Tuples2<? extends ChartGroup<? extends GenericAction>, ? extends AdvancedChartZoomKeys>, ? extends AdvancedChartGroupState>> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$2$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    AdvancedChartViewState advancedChartViewState = (AdvancedChartViewState) obj;
                                    Tuples2 tuples2M3642to = Tuples4.m3642to(advancedChartViewState.getChartGroupWithZoomKeys(), advancedChartViewState.getAdvancedChartGroupState());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                    final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.7.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Tuples2<? extends Tuples2<? extends ChartGroup<? extends GenericAction>, AdvancedChartZoomKeys>, AdvancedChartGroupState>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Tuples2<? extends Tuples2<? extends ChartGroup<? extends GenericAction>, AdvancedChartZoomKeys>, AdvancedChartGroupState> tuples2, Continuation<? super Unit> continuation) {
                            Tuples2<? extends ChartGroup<? extends GenericAction>, AdvancedChartZoomKeys> tuples2Component1 = tuples2.component1();
                            AdvancedChartGroupState advancedChartGroupStateComponent2 = tuples2.component2();
                            AdvancedChartView advancedChartView = advancedChartParentFragment.getBinding().advancedChartView;
                            if (tuples2Component1 != null) {
                                advancedChartView.setData(tuples2Component1, advancedChartGroupStateComponent2);
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$3", m3645f = "AdvancedChartParentFragment.kt", m3646l = {337}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Boolean>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$3$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$3$invokeSuspend$$inlined$map$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$7$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    Boolean boolBoxBoolean = boxing.boxBoolean(((AdvancedChartViewState) obj).isLoading());
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boolBoxBoolean, anonymousClass1) == coroutine_suspended) {
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
                    final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.7.3.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                            RhToolbar rhToolbar = advancedChartParentFragment.getRhToolbar();
                            if (rhToolbar != null) {
                                rhToolbar.setLoadingViewVisible(z);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8", m3645f = "AdvancedChartParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8 */
    static final class C84948 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C84948(Continuation<? super C84948> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C84948 c84948 = AdvancedChartParentFragment.this.new C84948(continuation);
            c84948.L$0 = obj;
            return c84948;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84948) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1", m3645f = "AdvancedChartParentFragment.kt", m3646l = {348}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<AdvancedChartModel>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AdvancedChartModel> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    AdvancedChartModel advancedChart = ((AdvancedChartViewState) obj).getAdvancedChart();
                                    if (advancedChart != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(advancedChart, anonymousClass1) == coroutine_suspended) {
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
                    final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.8.1.2

                        /* compiled from: AdvancedChartParentFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[Direction.values().length];
                                try {
                                    iArr[Direction.f5855UP.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((AdvancedChartModel) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(AdvancedChartModel advancedChartModel, Continuation<? super Unit> continuation) {
                            DirectionOverlay directionOverlay;
                            Direction pageDirection = advancedChartModel.getPageDirection();
                            BehaviorRelay behaviorRelay = advancedChartParentFragment.directionRelay;
                            if (WhenMappings.$EnumSwitchMapping$0[pageDirection.ordinal()] == 1) {
                                directionOverlay = DirectionOverlay.POSITIVE;
                            } else {
                                directionOverlay = DirectionOverlay.NEGATIVE;
                            }
                            behaviorRelay.accept(directionOverlay);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvancedChartParentFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvancedChartParentFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AdvancedChartParentFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(AdvancedChartParentFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {363}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Quote>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$2$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Quote> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    Quote quote = ((AdvancedChartViewState) obj).getQuote();
                                    if (quote != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(quote, anonymousClass1) == coroutine_suspended) {
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
                    final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.8.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Quote) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Quote quote, Continuation<? super Unit> continuation) {
                            RhToolbar rhToolbar = advancedChartParentFragment.getRhToolbar();
                            if (rhToolbar != null) {
                                rhToolbar.setSubtitle(Money.format$default(quote.getLastTradePrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3", m3645f = "AdvancedChartParentFragment.kt", m3646l = {372}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Instrument>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Instrument> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    Instrument instrument = ((AdvancedChartViewState) obj).getInstrument();
                                    if (instrument != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(instrument, anonymousClass1) == coroutine_suspended) {
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
                    final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.8.3.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Instrument) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Instrument instrument, Continuation<? super Unit> continuation) {
                            RhToolbar rhToolbar = advancedChartParentFragment.getRhToolbar();
                            if (rhToolbar != null) {
                                rhToolbar.setTitle(instrument.getSymbol());
                            }
                            advancedChartParentFragment.getTradeBarFragment().bindInstrument(instrument);
                            AdvancedChartParentFragment advancedChartParentFragment2 = advancedChartParentFragment;
                            LifecycleHost.DefaultImpls.bind$default(advancedChartParentFragment2, advancedChartParentFragment2.getTradeBarFragment().footerHeight(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AnonymousClass1(advancedChartParentFragment.footerHeightSubject));
                            return Unit.INSTANCE;
                        }

                        /* compiled from: AdvancedChartParentFragment.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$3$2$1, reason: invalid class name */
                        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
                            AnonymousClass1(Object obj) {
                                super(1, obj, BehaviorSubject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke2(num);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Integer p0) {
                                Intrinsics.checkNotNullParameter(p0, "p0");
                                ((BehaviorSubject) this.receiver).onNext(p0);
                            }
                        }
                    };
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

        /* compiled from: AdvancedChartParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$4", m3645f = "AdvancedChartParentFragment.kt", m3646l = {384}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedChartParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AdvancedChartParentFragment advancedChartParentFragment, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = advancedChartParentFragment;
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
                    final StateFlow<AdvancedChartViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    final AdvancedChartParentFragment advancedChartParentFragment = this.this$0;
                    Flow<AdvancedChartAnalyticsCommonData> flow = new Flow<AdvancedChartAnalyticsCommonData>() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$4$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AdvancedChartAnalyticsCommonData> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector, advancedChartParentFragment), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$4$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AdvancedChartParentFragment this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$4$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AdvancedChartParentFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$8$4$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                            public AnonymousClass2(FlowCollector flowCollector, AdvancedChartParentFragment advancedChartParentFragment) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = advancedChartParentFragment;
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
                                    AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData$default = AdvancedChartDuxo.getAdvancedChartAnalyticsCommonData$default(this.this$0.getDuxo(), (AdvancedChartViewState) obj, null, null, 6, null);
                                    if (advancedChartAnalyticsCommonData$default != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(advancedChartAnalyticsCommonData$default, anonymousClass1) == coroutine_suspended) {
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
                    };
                    final AdvancedChartParentFragment advancedChartParentFragment2 = this.this$0;
                    FlowCollector<? super AdvancedChartAnalyticsCommonData> flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.8.4.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((AdvancedChartAnalyticsCommonData) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(AdvancedChartAnalyticsCommonData advancedChartAnalyticsCommonData, Continuation<? super Unit> continuation) {
                            advancedChartParentFragment2.getTradeBarFragment().setAnalyticsData(new AnalyticsData(advancedChartAnalyticsCommonData.getAnalyticsContext(), advancedChartAnalyticsCommonData.getAnalyticsScreen()));
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9", m3645f = "AdvancedChartParentFragment.kt", m3646l = {395}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9 */
    static final class C84959 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C84959(Continuation<? super C84959> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedChartParentFragment.this.new C84959(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C84959) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(AdvancedChartParentFragment.this.getDuxo().getEventFlow());
                final AdvancedChartParentFragment advancedChartParentFragment = AdvancedChartParentFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment.onViewCreated.9.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AdvancedChartEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AdvancedChartEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AdvancedChartEvent> eventConsumerInvoke;
                        EventConsumer<AdvancedChartEvent> eventConsumerInvoke2;
                        EventConsumer<AdvancedChartEvent> eventConsumerInvoke3;
                        EventConsumer<AdvancedChartEvent> eventConsumerInvoke4;
                        EventConsumer<AdvancedChartEvent> eventConsumerInvoke5;
                        final AdvancedChartParentFragment advancedChartParentFragment2 = advancedChartParentFragment;
                        if ((event.getData() instanceof AdvancedChartEvent.ShowZoomNux) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m10956invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10956invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AdvancedChartZoomNuxBottomSheetDialogFragment advancedChartZoomNuxBottomSheetDialogFragment = new AdvancedChartZoomNuxBottomSheetDialogFragment();
                                    FragmentManager parentFragmentManager = advancedChartParentFragment2.getParentFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                                    advancedChartZoomNuxBottomSheetDialogFragment.show(parentFragmentManager, "advancedChartZoomNux");
                                }
                            });
                        }
                        final AdvancedChartParentFragment advancedChartParentFragment3 = advancedChartParentFragment;
                        if ((event.getData() instanceof AdvancedChartEvent.LaunchAdvancedAlert) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m10957invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10957invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AdvancedChartEvent.LaunchAdvancedAlert launchAdvancedAlert = (AdvancedChartEvent.LaunchAdvancedAlert) event.getData();
                                    AdvancedChartParentFragment advancedChartParentFragment4 = advancedChartParentFragment3;
                                    Navigator navigator = advancedChartParentFragment4.getNavigator();
                                    Context contextRequireContext = advancedChartParentFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    advancedChartParentFragment4.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AdvancedAlert(Either2.asLeft(launchAdvancedAlert.getInstrument()), false, launchAdvancedAlert.getActiveChartInterval(), AdvancedAlertEntryPoint.ACP_NAV_BAR_BUTTON), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
                                }
                            });
                        }
                        final AdvancedChartParentFragment advancedChartParentFragment4 = advancedChartParentFragment;
                        if ((event.getData() instanceof AdvancedChartEvent.LaunchRemoteDisclosure) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m10958invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10958invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AdvancedChartEvent.LaunchRemoteDisclosure launchRemoteDisclosure = (AdvancedChartEvent.LaunchRemoteDisclosure) event.getData();
                                    Navigator navigator = advancedChartParentFragment4.getNavigator();
                                    Context contextRequireContext = advancedChartParentFragment4.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RemoteDisclosureKey(launchRemoteDisclosure.getDisclosureId(), null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
                                }
                            });
                        }
                        final AdvancedChartParentFragment advancedChartParentFragment5 = advancedChartParentFragment;
                        if ((event.getData() instanceof AdvancedChartEvent.LaunchInstrumentIntervalsDialog) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9$1$emit$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m10959invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10959invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AdvancedChartEvent.LaunchInstrumentIntervalsDialog launchInstrumentIntervalsDialog = (AdvancedChartEvent.LaunchInstrumentIntervalsDialog) event.getData();
                                    Navigator.DefaultImpls.createDialogFragment$default(advancedChartParentFragment5.getNavigator(), new InstrumentChartIntervalsKey(advancedChartParentFragment5.getScreen(), launchInstrumentIntervalsDialog.getInstrumentId(), launchInstrumentIntervalsDialog.getSpanId(), launchInstrumentIntervalsDialog.getShowCandlesticks()), null, 2, null).show(advancedChartParentFragment5.getChildFragmentManager(), "chart_intervals");
                                }
                            });
                        }
                        final AdvancedChartParentFragment advancedChartParentFragment6 = advancedChartParentFragment;
                        if ((event.getData() instanceof AdvancedChartEvent.ShowError) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartParentFragment$onViewCreated$9$1$emit$$inlined$consumeIfType$5
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m10960invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m10960invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    AbsErrorHandler.handleError$default(advancedChartParentFragment6.getActivityErrorHandler(), ((AdvancedChartEvent.ShowError) event.getData()).getThrowable(), false, 2, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C8502R.menu.menu_advanced_chart, menu);
        menu.findItem(C8502R.id.action_alert).setVisible(true);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C8502R.id.action_advanced_chart_learn_more) {
            getDuxo().onChartLearnMoreClick();
            return true;
        }
        if (itemId == C8502R.id.action_advanced_chart_search) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new SearchSelector(new SearchSelectorLaunchMode.AdvancedChart(false, true, false, false, 8, null), null, null, 6, null), false, false, false, null, false, null, false, false, null, null, 4088, null);
            return true;
        }
        if (itemId == C8502R.id.action_alert) {
            getDuxo().onAlertClick();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onLearnMoreActionClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId != C8502R.id.dialog_id_advanced_chart_info_bottom_sheet) {
            return true;
        }
        String string2 = getString(C8502R.string.advanced_chart_learn_more_url);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
        return true;
    }

    @Override // com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter.Callbacks
    public void onIndicatorTapped(IndicatorState indicatorState, int position, boolean isScrollEnabled) {
        Context context;
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        if (isScrollEnabled && (context = getContext()) != null) {
            CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(context, 0.0f, 2, null);
            centerSmoothScroller.setTargetPosition(position);
            RecyclerView.LayoutManager layoutManager = getBinding().indicatorRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(centerSmoothScroller);
            }
        }
        AdvancedChartDuxo duxo = getDuxo();
        String id = indicatorState.getId();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        duxo.onIndicatorTapped(id, indicatorState.getShortenedTitle(resources));
    }

    @Override // com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter.Callbacks
    public void onInfoIconTapped(IndicatorState indicatorState) {
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C8502R.id.dialog_id_advanced_chart_info_bottom_sheet, getString(IndicatorTypes.getFullNameResId(indicatorState.getApiTechnicalIndicator().getType())), null, getString(IndicatorTypes.getInfoContentResId(indicatorState.getApiTechnicalIndicator().getType())), null, getString(C11048R.string.general_label_done), null, null, null, true, false, null, null, null, false, true, false, false, null, null, null, 2063828, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "info-bottom-sheet");
    }

    @Override // com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter.Callbacks
    public void onSettingsIconTapped(IndicatorState indicatorState) {
        Intrinsics.checkNotNullParameter(indicatorState, "indicatorState");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AdvancedChartEditIndicatorFragmentKey(((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId(), new AdvancedChartEditIndicatorLaunchMode.Editing(indicatorState.getApiTechnicalIndicator())), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter.Callbacks
    public void onAddPlusButtonTapped() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AdvancedChartIndicatorListFragmentKey(((AdvancedChartFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.advancedchart.AdvancedChartIndicatorsAdapter.Callbacks
    public void onEmptyStateAddDataButtonTapped() {
        onAddPlusButtonTapped();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra(InstrumentChartView.ADVANCED_CHART_SELECTED_SPAN_EXTRA, getBinding().spanSelector.getDisplaySpan());
        requireActivity().setResult(-1, intent);
        requireActivity().finish();
        Companion companion = INSTANCE;
        if (!((AdvancedChartFragmentKey) companion.getArgs((Fragment) this)).getBackToStockDetailPage()) {
            return true;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(((AdvancedChartFragmentKey) companion.getArgs((Fragment) this)).getInstrumentId(), null, null, InstrumentDetailSource.ADVANCED_CHART, false, 22, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return true;
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onInitiateOrder(UUID instrumentId, EquityOrderSide side, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(side, "side");
        Navigator navigator = getNavigator();
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        Navigator.DefaultImpls.startActivity$default(navigator, baseActivity, new EquityOrderActivityIntentKey.WithId(instrumentId, side, EquityOrderFlowSource.ADVANCED_CHART, null, accountNumber, null, null, false, false, 488, null), null, false, null, null, 60, null);
    }

    /* compiled from: AdvancedChartParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advancedchart/AdvancedChartParentFragment;", "<init>", "()V", AdvancedChartParentFragment.TAG_CHART_SETTINGS, "", "TAG_TRADE_BAR", "createFragment", "key", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AdvancedChartFragmentKey>, FragmentWithArgsCompanion<AdvancedChartParentFragment, AdvancedChartFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvancedChartFragmentKey getArgs(AdvancedChartParentFragment advancedChartParentFragment) {
            return (AdvancedChartFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advancedChartParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvancedChartParentFragment newInstance(AdvancedChartFragmentKey advancedChartFragmentKey) {
            return (AdvancedChartParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, advancedChartFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvancedChartParentFragment advancedChartParentFragment, AdvancedChartFragmentKey advancedChartFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advancedChartParentFragment, advancedChartFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AdvancedChartParentFragment createFragment(AdvancedChartFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AdvancedChartParentFragment) AdvancedChartParentFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
