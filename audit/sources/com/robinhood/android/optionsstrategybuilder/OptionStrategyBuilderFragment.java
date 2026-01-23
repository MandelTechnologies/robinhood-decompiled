package com.robinhood.android.optionsstrategybuilder;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ScrollableLayoutManager;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.EducationTourEntryPointView;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionchain.C22987R;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationErrorEvent;
import com.robinhood.android.optionchain.chainsettings.OptionChainCustomizationSnackbarHelper;
import com.robinhood.android.optionchain.tooltips.IndexOptionsTooltip;
import com.robinhood.android.optionchain.tooltips.OptionChainTooltipView;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderViewState;
import com.robinhood.android.optionsstrategybuilder.calculator.FilteredStrategiesListData;
import com.robinhood.android.optionsstrategybuilder.databinding.FragmentOptionStrategyBuilderBinding;
import com.robinhood.android.optionsstrategybuilder.extensions.OptionStrategyChainTemplates;
import com.robinhood.android.optionsstrategybuilder.pickers.DatePickerContainer;
import com.robinhood.android.optionsstrategybuilder.pickers.OptionStrategyBuilderSelectorBottomSheet;
import com.robinhood.android.optionsstrategybuilder.pills.PillAdapter;
import com.robinhood.android.optionsstrategybuilder.pills.PillView;
import com.robinhood.android.optionsstrategybuilder.pills.StrategyBuilderChip;
import com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iac.alertsheet.BaseFragmentExtensions;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyChainTemplate;
import com.robinhood.models.p320db.OptionTooltip;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionChains;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.api.bonfire.education.tour.EducationTourEntryPoint;
import com.robinhood.shared.models.p387db.bonfire.education.tour.EducationTour;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.datetime.format.ZonedDateTimeFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.reflect.KProperty;
import p479j$.time.Instant;
import p479j$.time.ZonedDateTime;

/* compiled from: OptionStrategyBuilderFragment.kt */
@Metadata(m3635d1 = {"\u0000Ã\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001#\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002TUB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u00020*H\u0016J\b\u0010?\u001a\u00020*H\u0016J\u0018\u0010@\u001a\u00020*2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010A\u001a\u00020BH\u0002J\u001c\u0010J\u001a\u00020*2\b\b\u0002\u0010K\u001a\u0002062\b\b\u0002\u0010L\u001a\u00020DH\u0002J\b\u0010M\u001a\u00020*H\u0002J\t\u0010N\u001a\u000206H\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010 0 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PX\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/optionsstrategybuilder/pickers/OptionStrategyBuilderSelectorBottomSheet$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "bindings", "Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentOptionStrategyBuilderBinding;", "getBindings", "()Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentOptionStrategyBuilderBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "selloutSnackbar", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "duxo", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "scrollableLayoutManager", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "getScrollableLayoutManager", "()Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "scrollableLayoutManager$delegate", "optionOrderLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "strategyChainListCallbacks", "com/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$strategyChainListCallbacks$1", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$strategyChainListCallbacks$1;", "strategyChainListAdapter", "Lcom/robinhood/android/optionsstrategybuilder/StrategyChainListAdapter;", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "onAttach", "", "context", "Landroid/content/Context;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onPause", "onChoiceSelected", "selectorArgs", "Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;", "selectedIndex", "", "launchOrderForm", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "generateSwipeCallbacks", "Lcom/robinhood/android/optionsstrategybuilder/rows/NotViewPagerRecyclerView$Callbacks;", "doScroll", "smoothScroll", "position", "showCustomizationPage", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionStrategyBuilderFragment extends BaseFragment implements OptionStrategyBuilderSelectorBottomSheet.Callbacks, RegionGated, AutoLoggableFragment {
    private static final String OPTION_STRATEGY_SPREAD_BOTTOM_SHEET = "optionStrategySpreadBottomSheet";
    private static final String SELECTOR_DIALOG_TAG = "selector_dialog";
    private static final int SNACK_DURATION_BEFORE_SELLOUT_SEC = 7200;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private OptionDefaultPricingState defaultPricingState;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ActivityResultLauncher<Intent> optionOrderLauncher;

    /* renamed from: scrollableLayoutManager$delegate, reason: from kotlin metadata */
    private final Lazy scrollableLayoutManager;
    private RdsSnackbar selloutSnackbar;
    private final StrategyChainListAdapter strategyChainListAdapter;
    private final OptionStrategyBuilderFragment$strategyChainListCallbacks$1 strategyChainListCallbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyBuilderFragment.class, "bindings", "getBindings()Lcom/robinhood/android/optionsstrategybuilder/databinding/FragmentOptionStrategyBuilderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public OptionStrategyBuilderFragment() {
        super(C24876R.layout.fragment_option_strategy_builder);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.bindings = ViewBinding5.viewBinding(this, OptionStrategyBuilderFragment$bindings$2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionStrategyBuilderDuxo.class);
        this.scrollableLayoutManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderFragment.scrollableLayoutManager_delegate$lambda$1(this.f$0);
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$optionOrderLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    fragmentActivityRequireActivity.setResult(-1);
                    fragmentActivityRequireActivity.finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.optionOrderLauncher = activityResultLauncherRegisterForActivityResult;
        OptionStrategyBuilderFragment$strategyChainListCallbacks$1 optionStrategyBuilderFragment$strategyChainListCallbacks$1 = new OptionStrategyBuilderFragment$strategyChainListCallbacks$1(this);
        this.strategyChainListCallbacks = optionStrategyBuilderFragment$strategyChainListCallbacks$1;
        this.strategyChainListAdapter = new StrategyChainListAdapter(optionStrategyBuilderFragment$strategyChainListCallbacks$1);
        this.defaultPricingState = OptionDefaultPricingState.NOT_AVAILABLE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.OPTION_STRATEGY_BUILDER, null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentOptionStrategyBuilderBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentOptionStrategyBuilderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionStrategyBuilderDuxo getDuxo() {
        return (OptionStrategyBuilderDuxo) this.duxo.getValue();
    }

    private final ScrollableLayoutManager getScrollableLayoutManager() {
        return (ScrollableLayoutManager) this.scrollableLayoutManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollableLayoutManager scrollableLayoutManager_delegate$lambda$1(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
        android.content.Context contextRequireContext = optionStrategyBuilderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ScrollableLayoutManager scrollableLayoutManager = new ScrollableLayoutManager(contextRequireContext);
        scrollableLayoutManager.setSnapMode(ScrollableLayoutManager.SnapMode.CENTER);
        return scrollableLayoutManager;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        boolean z = ((Args) INSTANCE.getArgs((Fragment) this)).getTemplate().getReferenceManualTopic() != null;
        inflater.inflate(C24876R.menu.menu_options_strategy_builder, menu);
        MenuItem menuItemFindItem = menu.findItem(C24876R.id.education_item);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(z);
            MenuItemCompat.setContentDescription(menuItemFindItem, getString(C24876R.string.options_strategy_builder_education_item_content_description));
        }
        MenuItem menuItemFindItem2 = menu.findItem(C24876R.id.action_option_chain_customization_settings);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(true);
            menuItemFindItem2.setIcon(C20690R.drawable.ic_rds_settings_24dp);
            MenuItemCompat.setContentDescription(menuItemFindItem2, getString(C24876R.string.options_strategy_builder_customization_content_description));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setUseDesignSystemTheme(true);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == C24876R.id.education_item) {
            String referenceManualTopic = ((Args) INSTANCE.getArgs((Fragment) this)).getTemplate().getReferenceManualTopic();
            if (referenceManualTopic == null) {
                return super.onOptionsItemSelected(item);
            }
            getDuxo().logDisclosureItemTap();
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ReferenceManual.Anonymous(referenceManualTopic, null, 2, null), null, false, null, null, 60, null);
            return true;
        }
        if (itemId == C24876R.id.action_option_chain_customization_settings) {
            Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onOptionsItemSelected$$inlined$mapNotNull$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public final Optional<R> apply(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getChainCustomizationFragmentKey());
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return apply((C24845x57634ab0<T, R>) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionStrategyBuilderFragment.onOptionsItemSelected$lambda$5(this.f$0, (FragmentKey) obj);
                }
            });
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onOptionsItemSelected$lambda$5(OptionStrategyBuilderFragment optionStrategyBuilderFragment, FragmentKey fragmentKey) {
        Navigator navigator = optionStrategyBuilderFragment.getNavigator();
        android.content.Context contextRequireContext = optionStrategyBuilderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(fragmentKey);
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, fragmentKey, false, false, false, false, null, false, null, null, 1012, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBindings().strategyChainList.setLayoutManager(getScrollableLayoutManager());
        TextView optionsStrategyBuilderHeader = getBindings().optionsStrategyBuilderHeader;
        Intrinsics.checkNotNullExpressionValue(optionsStrategyBuilderHeader, "optionsStrategyBuilderHeader");
        Companion companion = INSTANCE;
        TextViewsKt.setVisibilityText(optionsStrategyBuilderHeader, ((Args) companion.getArgs((Fragment) this)).getTemplate().getChainHeader());
        ConstraintLayout root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewsKt.setEducationTourScreenName(root, EducationTourScreenNames.STRATEGY_BUILDER_PAGE_SCREEN);
        View optionsStrategyBuilderTourAnchor = getBindings().optionsStrategyBuilderTourAnchor;
        Intrinsics.checkNotNullExpressionValue(optionsStrategyBuilderTourAnchor, "optionsStrategyBuilderTourAnchor");
        ViewsKt.setEducationTourId(optionsStrategyBuilderTourAnchor, EducationTourElementIds.STRATEGY_SCROLL_ELEMENT);
        TextView optionsStrategyBuilderHeader2 = getBindings().optionsStrategyBuilderHeader;
        Intrinsics.checkNotNullExpressionValue(optionsStrategyBuilderHeader2, "optionsStrategyBuilderHeader");
        ViewsKt.setEducationTourId(optionsStrategyBuilderHeader2, EducationTourElementIds.STRATEGY_TITLE);
        getBindings().loadingView.setContent(ComposableSingletons$OptionStrategyBuilderFragmentKt.INSTANCE.m2355xce56a589());
        OptionStrategyChainTemplate.Filter singleNearDateFilter = OptionStrategyChainTemplates.getSingleNearDateFilter(((Args) companion.getArgs((Fragment) this)).getTemplate());
        if (singleNearDateFilter != null) {
            DatePickerContainer datePickerContainer = getBindings().datePickerContainer;
            Intrinsics.checkNotNullExpressionValue(datePickerContainer, "datePickerContainer");
            ViewsKt.setEducationTourId(datePickerContainer, singleNearDateFilter.getFilterType().getServerValue());
            RecyclerView strategyFiltersRecyclerview = getBindings().strategyFiltersRecyclerview;
            Intrinsics.checkNotNullExpressionValue(strategyFiltersRecyclerview, "strategyFiltersRecyclerview");
            strategyFiltersRecyclerview.setVisibility(4);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(getBindings().getRoot());
            constraintSet.connect(getBindings().datePickerContainer.getId(), 3, getBindings().optionsStrategyBuilderHeader.getId(), 4, 0);
            constraintSet.applyTo(getBindings().getRoot());
        }
        getDuxo().logStrategyChainAppear();
        getDuxo().logPerformanceBeginStrategyChain();
        final PillAdapter pillAdapter = new PillAdapter(new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        getBindings().strategyFiltersRecyclerview.setAdapter(pillAdapter);
        getBindings().strategyFiltersRecyclerview.setItemAnimator(null);
        Observable<OptionStrategyBuilderViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged((Function<? super OptionStrategyBuilderViewState, K>) new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$showSelloutSnackbarObs$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionStrategyBuilderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(state.getFilterChoicesData().getHasStrategies());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable<R> map = observableDistinctUntilChanged.map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionStrategyBuilderViewState optionStrategyBuilderViewState = (OptionStrategyBuilderViewState) it;
                Instant selloutTime = optionStrategyBuilderViewState.getFilterChoicesData().getSelloutTime();
                return Optional3.asOptional(selloutTime == null ? null : Tuples4.m3642to(optionStrategyBuilderViewState, selloutTime));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24854xd4430367<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableRefCount = ObservablesKt.filterIsPresent(map).filter(new Predicate() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$showSelloutSnackbarObs$3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<OptionStrategyBuilderViewState, Instant> tuples2) {
                RdsSnackbar rdsSnackbar;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                OptionStrategyBuilderViewState optionStrategyBuilderViewStateComponent1 = tuples2.component1();
                Instant instantComponent2 = tuples2.component2();
                boolean z = UiOptionChains.getUnderlyingType(optionStrategyBuilderViewStateComponent1.getUiOptionChains()) == OptionChain.UnderlyingType.EQUITY;
                boolean hasStrategies = optionStrategyBuilderViewStateComponent1.getFilterChoicesData().getHasStrategies();
                long epochSecond = instantComponent2.getEpochSecond() - Instant.now().getEpochSecond();
                return z && ((rdsSnackbar = this.this$0.selloutSnackbar) == null || !rdsSnackbar.isShown()) && hasStrategies && ((epochSecond > 7200L ? 1 : (epochSecond == 7200L ? 0 : -1)) <= 0) && !((epochSecond > 0L ? 1 : (epochSecond == 0L ? 0 : -1)) < 0);
            }
        }).take(1L).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableFlatMap = observableRefCount.flatMap(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.onViewCreated.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instant> apply(Tuples2<OptionStrategyBuilderViewState, Instant> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                final Instant instantComponent2 = tuples2.component2();
                return Observable.timer(instantComponent2.getEpochSecond() - Instant.now().getEpochSecond(), TimeUnit.SECONDS).map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.onViewCreated.2.1
                    @Override // io.reactivex.functions.Function
                    public final Instant apply(Long it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return instantComponent2;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableFlatMap), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$11(this.f$0, (Instant) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableRefCount), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$14(this.f$0, view, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionStrategyBuilderViewState) it).getDefaultPricingState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$16(this.f$0, (OptionDefaultPricingState) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionStrategyBuilderViewState) it).getIsExpiringToday());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$18(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<OptionStrategyBuilderViewState> observableDistinctUntilChanged4 = getDuxo().getStates().distinctUntilChanged((Function<? super OptionStrategyBuilderViewState, K>) new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.onViewCreated.9
            @Override // io.reactivex.functions.Function
            public final FilteredStrategiesListData apply(OptionStrategyBuilderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getFilteredStrategiesListData();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged5 = observableDistinctUntilChanged4.map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final OptionStrategyBuilderViewState optionStrategyBuilderViewState = (OptionStrategyBuilderViewState) it;
                FilteredStrategiesListData filteredStrategiesListData = optionStrategyBuilderViewState.getFilteredStrategiesListData();
                final OptionStrategyBuilderFragment optionStrategyBuilderFragment = this.this$0;
                return (R) filteredStrategiesListData.getPillAdapterItems(new Function2<StrategyBuilderChip, PillView.SelectorArgs, Unit>() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$10$1

                    /* compiled from: OptionStrategyBuilderFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[OptionStrategyChainTemplate.FilterType.values().length];
                            try {
                                iArr[OptionStrategyChainTemplate.FilterType.STRIKE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[OptionStrategyChainTemplate.FilterType.SPREAD_WIDTH.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[OptionStrategyChainTemplate.FilterType.NEAR_DATE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[OptionStrategyChainTemplate.FilterType.FAR_DATE.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[OptionStrategyChainTemplate.FilterType.UNKNOWN.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(StrategyBuilderChip strategyBuilderChip, PillView.SelectorArgs selectorArgs) {
                        invoke2(strategyBuilderChip, selectorArgs);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(StrategyBuilderChip getPillAdapterItems, PillView.SelectorArgs selectorArgs) {
                        Intrinsics.checkNotNullParameter(getPillAdapterItems, "$this$getPillAdapterItems");
                        Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
                        int i = WhenMappings.$EnumSwitchMapping$0[selectorArgs.getFilter().getFilterType().ordinal()];
                        if (i == 1 || i == 2) {
                            getPillAdapterItems.performHapticFeedback(1);
                            OptionStrategyBuilderSelectorBottomSheet optionStrategyBuilderSelectorBottomSheet = (OptionStrategyBuilderSelectorBottomSheet) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(OptionStrategyBuilderSelectorBottomSheet.INSTANCE, new OptionStrategyBuilderSelectorBottomSheet.Args(selectorArgs, optionStrategyBuilderViewState.getUnderlyingQuote()), optionStrategyBuilderFragment, 0, 4, null);
                            FragmentManager parentFragmentManager = optionStrategyBuilderFragment.getParentFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                            optionStrategyBuilderSelectorBottomSheet.show(parentFragmentManager, "selector_dialog");
                            return;
                        }
                        if (i == 3 || i == 4) {
                            getPillAdapterItems.performHapticFeedback(1);
                            optionStrategyBuilderFragment.getBindings().datePickerContainer.onChipTapped(selectorArgs, getPillAdapterItems, new C248631(optionStrategyBuilderFragment.getDuxo()));
                        } else if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }

                    /* compiled from: OptionStrategyBuilderFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$10$1$1 */
                    /* synthetic */ class C248631 extends FunctionReferenceImpl implements Function2<PillView.SelectorArgs, Integer, Unit> {
                        C248631(Object obj) {
                            super(2, obj, OptionStrategyBuilderDuxo.class, "updateFilter", "updateFilter(Lcom/robinhood/android/optionsstrategybuilder/pills/PillView$SelectorArgs;I)V", 0);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PillView.SelectorArgs selectorArgs, Integer num) {
                            invoke(selectorArgs, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PillView.SelectorArgs p0, int i) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            ((OptionStrategyBuilderDuxo) this.receiver).updateFilter(p0, i);
                        }
                    }
                });
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$21(pillAdapter, this, (List) obj);
            }
        });
        Observable<OptionStrategyBuilderViewState> observableDistinctUntilChanged6 = getDuxo().getStates().distinctUntilChanged((Function<? super OptionStrategyBuilderViewState, K>) new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.onViewCreated.12
            @Override // io.reactivex.functions.Function
            public final OptionStrategyBuilderViewState.StrategyChainAdapterState apply(OptionStrategyBuilderViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return state.getStrategyChainAdapterState();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$23(this.f$0, (OptionStrategyBuilderViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) ((OptionStrategyBuilderViewState) it).getUnderlyingQuoteIndicatorText(resources);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$25(this.f$0, (String) obj);
            }
        });
        this.strategyChainListAdapter.setHasStableIds(true);
        Observable observableDistinctUntilChanged8 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionStrategyBuilderViewState) it).getFilteredStrategiesListData().getScrollDefaultPosition());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged8), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$29(this.f$0, (Optional) obj);
            }
        });
        getBindings().strategyChainList.setAdapter(this.strategyChainListAdapter);
        NotViewPagerRecyclerView notViewPagerRecyclerView = getBindings().strategyChainList;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        notViewPagerRecyclerView.setItemAnimator(defaultItemAnimator);
        getBindings().strategyChainList.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.onViewCreated.19
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                RecyclerView.LayoutManager layoutManager = OptionStrategyBuilderFragment.this.getBindings().strategyChainList.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int quotePosition = OptionStrategyBuilderFragment.this.strategyChainListAdapter.getQuotePosition();
                if (quotePosition == -1 || iFindFirstCompletelyVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition == -1) {
                    return;
                }
                LinearLayout root2 = OptionStrategyBuilderFragment.this.getBindings().strategyChainScrollIndicatorTop.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                root2.setVisibility(quotePosition < iFindFirstCompletelyVisibleItemPosition ? 0 : 8);
                LinearLayout root3 = OptionStrategyBuilderFragment.this.getBindings().strategyChainScrollIndicatorBottom.getRoot();
                Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
                root3.setVisibility(quotePosition > iFindLastCompletelyVisibleItemPosition ? 0 : 8);
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getEducationTour());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24855xd4430368<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map2).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$34(this.f$0, (EducationTour) obj);
            }
        });
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                List<OptionStrategyBuilderViewState.Strategy> filteredStrategies = ((OptionStrategyBuilderViewState) it).getFilteredStrategiesListData().getFilteredStrategies();
                if (filteredStrategies.isEmpty()) {
                    filteredStrategies = null;
                }
                return Optional3.asOptional(filteredStrategies);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24856xd4430369<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableTake2 = ObservablesKt.filterIsPresent(map3).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake2, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$37(this.f$0, (List) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getIacAlertSheet());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24853x69b6afcb<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged9 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        Observable observableTake3 = observableDistinctUntilChanged9.take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake3, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$39(this.f$0, (IacAlertSheet) obj);
            }
        });
        Observable observableDistinctUntilChanged10 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionStrategyBuilderViewState) it).getTooltip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged10, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged10), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$43(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged11 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$$inlined$mapDistinct$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Optional3.asOptional(((OptionStrategyBuilderViewState) it).getIndexOptionsTooltip());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged11, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged11), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$45(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(OptionStrategyBuilderFragment optionStrategyBuilderFragment, Instant instant) {
        RdsSnackbar rdsSnackbar = optionStrategyBuilderFragment.selloutSnackbar;
        if (rdsSnackbar != null) {
            rdsSnackbar.dismiss();
        }
        optionStrategyBuilderFragment.selloutSnackbar = null;
        OptionStrategyBuilderDuxo duxo = optionStrategyBuilderFragment.getDuxo();
        Intrinsics.checkNotNull(instant);
        duxo.refreshTradability(instant);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14(final OptionStrategyBuilderFragment optionStrategyBuilderFragment, View view, Tuples2 tuples2) {
        ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant((Instant) tuples2.component2(), ZoneIds.INSTANCE.getNEW_YORK());
        ZonedDateTimeFormatter zonedDateTimeFormatter = ZonedDateTimeFormatter.TIME_WITH_ZONE_NO_LEADING_ZERO;
        Intrinsics.checkNotNull(zonedDateTimeOfInstant);
        String str = zonedDateTimeFormatter.format(zonedDateTimeOfInstant);
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        String string2 = optionStrategyBuilderFragment.getString(C22987R.string.friday_trading_sellout_alert_snackbar, str);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RdsSnackbar rdsSnackbarMake = companion.make(view, string2, -2);
        RdsSnackbar.setAction$default(rdsSnackbarMake, optionStrategyBuilderFragment.getString(C11048R.string.general_label_dismiss), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$14$lambda$13$lambda$12(this.f$0);
            }
        }, 14, (Object) null);
        rdsSnackbarMake.show();
        optionStrategyBuilderFragment.selloutSnackbar = rdsSnackbarMake;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$13$lambda$12(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
        optionStrategyBuilderFragment.selloutSnackbar = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(OptionStrategyBuilderFragment optionStrategyBuilderFragment, OptionDefaultPricingState defaultPricingState) {
        Intrinsics.checkNotNullParameter(defaultPricingState, "defaultPricingState");
        optionStrategyBuilderFragment.defaultPricingState = defaultPricingState;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(OptionStrategyBuilderFragment optionStrategyBuilderFragment, boolean z) {
        RdsSnackbar rdsSnackbar = optionStrategyBuilderFragment.selloutSnackbar;
        if (rdsSnackbar == null) {
            return Unit.INSTANCE;
        }
        if (z) {
            rdsSnackbar.show();
        } else {
            rdsSnackbar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$21(PillAdapter pillAdapter, OptionStrategyBuilderFragment optionStrategyBuilderFragment, List strategyList) {
        PillView.SelectorArgs nearDateSelectorArgs;
        Intrinsics.checkNotNullParameter(strategyList, "strategyList");
        pillAdapter.submitList(strategyList);
        Iterator it = strategyList.iterator();
        while (true) {
            if (!it.hasNext()) {
                nearDateSelectorArgs = null;
                break;
            }
            nearDateSelectorArgs = ((PillAdapter.Item) it.next()).getNearDateSelectorArgs();
            if (nearDateSelectorArgs != null) {
                break;
            }
        }
        optionStrategyBuilderFragment.getBindings().strategyChainList.setCallbacks(nearDateSelectorArgs != null ? optionStrategyBuilderFragment.generateSwipeCallbacks(nearDateSelectorArgs) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$23(OptionStrategyBuilderFragment optionStrategyBuilderFragment, OptionStrategyBuilderViewState optionStrategyBuilderViewState) {
        OptionStrategyBuilderViewState.StrategyChainAdapterState strategyChainAdapterState = optionStrategyBuilderViewState.getStrategyChainAdapterState();
        ComposeView loadingView = optionStrategyBuilderFragment.getBindings().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(8);
        if (optionStrategyBuilderViewState.getFilteredStrategiesListData().getStrategyListChanged()) {
            optionStrategyBuilderFragment.getDuxo().logPerformanceEndForFilters();
        }
        Integer scrollPosition = strategyChainAdapterState.getScrollPosition();
        optionStrategyBuilderFragment.strategyChainListAdapter.submitList(strategyChainAdapterState.getRows(), scrollPosition != null ? new RunnableC24865x3e6a5f57(optionStrategyBuilderFragment, scrollPosition.intValue(), optionStrategyBuilderViewState, strategyChainAdapterState) : null);
        if (strategyChainAdapterState.getQuotePosition() != null) {
            optionStrategyBuilderFragment.strategyChainListAdapter.setQuotePosition(strategyChainAdapterState.getQuotePosition().intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$25(OptionStrategyBuilderFragment optionStrategyBuilderFragment, String indicatorText) {
        Intrinsics.checkNotNullParameter(indicatorText, "indicatorText");
        optionStrategyBuilderFragment.getBindings().strategyChainScrollIndicatorTop.sectionHeaderTxt.setText(indicatorText);
        optionStrategyBuilderFragment.getBindings().strategyChainScrollIndicatorBottom.sectionHeaderTxt.setText(indicatorText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$29(final OptionStrategyBuilderFragment optionStrategyBuilderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionStrategyChainTemplate.ScrollDefaultPosition scrollDefaultPosition = (OptionStrategyChainTemplate.ScrollDefaultPosition) optional.component1();
        if ((scrollDefaultPosition instanceof OptionStrategyChainTemplate.ScrollDefaultPosition.StrikePriceScrollDefaultPosition) || (scrollDefaultPosition instanceof OptionStrategyChainTemplate.ScrollDefaultPosition.SpreadWidthScrollDefaultPosition)) {
            LinearLayout root = optionStrategyBuilderFragment.getBindings().strategyChainScrollIndicatorTop.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            OnClickListeners.onClick(root, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionStrategyBuilderFragment.onViewCreated$lambda$29$lambda$27(this.f$0);
                }
            });
            LinearLayout root2 = optionStrategyBuilderFragment.getBindings().strategyChainScrollIndicatorBottom.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            OnClickListeners.onClick(root2, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionStrategyBuilderFragment.onViewCreated$lambda$29$lambda$28(this.f$0);
                }
            });
        } else {
            if (!(scrollDefaultPosition instanceof OptionStrategyChainTemplate.ScrollDefaultPosition.Unsupported) && scrollDefaultPosition != null) {
                throw new NoWhenBranchMatchedException();
            }
            optionStrategyBuilderFragment.getBindings().strategyChainScrollIndicatorTop.getRoot().setOnClickListener(null);
            optionStrategyBuilderFragment.getBindings().strategyChainScrollIndicatorBottom.getRoot().setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$29$lambda$27(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
        doScroll$default(optionStrategyBuilderFragment, true, 0, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$29$lambda$28(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
        doScroll$default(optionStrategyBuilderFragment, true, 0, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$34(final OptionStrategyBuilderFragment optionStrategyBuilderFragment, final EducationTour educationTour) {
        final String strategyId = ((Args) INSTANCE.getArgs((Fragment) optionStrategyBuilderFragment)).getTemplate().getStrategyId();
        EducationTourEntryPointView educationTourEntryPointView = optionStrategyBuilderFragment.getBindings().educationTourEntryPoint;
        EducationTourEntryPoint entryPoint = educationTour.getEntryPoint();
        String ctaText = entryPoint != null ? entryPoint.getCtaText() : null;
        if (ctaText == null) {
            ctaText = "";
        }
        Function0 function0 = new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$34$lambda$32(this.f$0, strategyId);
            }
        };
        Function0 function02 = new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$34$lambda$33(this.f$0, educationTour);
            }
        };
        EducationTourEntryPoint entryPoint2 = educationTour.getEntryPoint();
        String message = entryPoint2 != null ? entryPoint2.getMessage() : null;
        educationTourEntryPointView.bind(new EducationTourEntryPointView.Data(ctaText, function0, function02, message == null ? "" : message, EducationTourScreenNames.STRATEGY_BUILDER_PAGE_SCREEN, strategyId));
        EducationTourEntryPointView educationTourEntryPoint = optionStrategyBuilderFragment.getBindings().educationTourEntryPoint;
        Intrinsics.checkNotNullExpressionValue(educationTourEntryPoint, "educationTourEntryPoint");
        educationTourEntryPoint.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$34$lambda$32(OptionStrategyBuilderFragment optionStrategyBuilderFragment, String str) {
        optionStrategyBuilderFragment.getDuxo().updateShouldShowStrategyBuilderTour(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$34$lambda$33(OptionStrategyBuilderFragment optionStrategyBuilderFragment, EducationTour educationTour) {
        optionStrategyBuilderFragment.getDuxo().logShowEducationTour(educationTour.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$37(OptionStrategyBuilderFragment optionStrategyBuilderFragment, List list) {
        optionStrategyBuilderFragment.getDuxo().logPerformanceEnd();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$39(OptionStrategyBuilderFragment optionStrategyBuilderFragment, IacAlertSheet iacAlertSheet) {
        Intrinsics.checkNotNull(iacAlertSheet);
        BaseFragmentExtensions.displayIacAlertSheet(optionStrategyBuilderFragment, iacAlertSheet, new Screen(Screen.Name.OPTION_STRATEGY_BUILDER, null, null, null, 14, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$43(final OptionStrategyBuilderFragment optionStrategyBuilderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionTooltip optionTooltip = (OptionTooltip) optional.component1();
        RdsTooltipView rdsTooltipView = optionStrategyBuilderFragment.getBindings().chainCustomizationTooltip;
        rdsTooltipView.setText(optionTooltip != null ? optionTooltip.getContent() : null);
        Intrinsics.checkNotNull(rdsTooltipView);
        rdsTooltipView.setVisibility(optionTooltip != null ? 0 : 8);
        OnClickListeners.onClick(rdsTooltipView, new Function0() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBuilderFragment.onViewCreated$lambda$43$lambda$42$lambda$41(this.f$0);
            }
        });
        if (optionTooltip != null) {
            optionStrategyBuilderFragment.getDuxo().setTooltipSeen(optionTooltip);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$43$lambda$42$lambda$41(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
        optionStrategyBuilderFragment.getDuxo().setTooltipTapped();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$45(final OptionStrategyBuilderFragment optionStrategyBuilderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        IndexOptionsTooltip.SettleOnOpenTooltip settleOnOpenTooltip = (IndexOptionsTooltip.SettleOnOpenTooltip) optional.component1();
        if (settleOnOpenTooltip != null) {
            OptionChainTooltipView chainSettleOnOpenTooltip = optionStrategyBuilderFragment.getBindings().chainSettleOnOpenTooltip;
            Intrinsics.checkNotNullExpressionValue(chainSettleOnOpenTooltip, "chainSettleOnOpenTooltip");
            chainSettleOnOpenTooltip.setVisibility(0);
            optionStrategyBuilderFragment.getBindings().chainSettleOnOpenTooltip.bind(new OptionChainTooltipView.Args(settleOnOpenTooltip.getNibHorizontalBias(), settleOnOpenTooltip.getTextRes(), settleOnOpenTooltip.getLinkTextRes(), settleOnOpenTooltip.getLinkRes()), new OptionChainTooltipView.Callbacks() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onViewCreated$29$1
                @Override // com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.Callbacks
                public void setTooltipSeen() {
                    this.this$0.getDuxo().setSettleOnOpenTooltipSeen();
                }

                @Override // com.robinhood.android.optionchain.tooltips.OptionChainTooltipView.Callbacks
                public void onTooltipClicked() {
                    this.this$0.getDuxo().dismissSettleOnOpenTooltip();
                }
            });
        } else {
            OptionChainTooltipView chainSettleOnOpenTooltip2 = optionStrategyBuilderFragment.getBindings().chainSettleOnOpenTooltip;
            Intrinsics.checkNotNullExpressionValue(chainSettleOnOpenTooltip2, "chainSettleOnOpenTooltip");
            chainSettleOnOpenTooltip2.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getChainCustomizationErrorEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionStrategyBuilderFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onStart$lambda$49(this.f$0, (UiEvent) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Tuples2<String, String> apply(OptionStrategyBuilderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(it.getToolbarTitle(), it.getToolbarSubtitle());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.onStart$lambda$51(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$49(final OptionStrategyBuilderFragment optionStrategyBuilderFragment, UiEvent uiEvent) {
        OptionChainCustomizationErrorEvent optionChainCustomizationErrorEvent;
        if (uiEvent != null && (optionChainCustomizationErrorEvent = (OptionChainCustomizationErrorEvent) uiEvent.consume()) != null) {
            ConstraintLayout root = optionStrategyBuilderFragment.getBindings().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            OptionChainCustomizationSnackbarHelper.showCustomizationSnackbar(root, optionChainCustomizationErrorEvent, new OptionStrategyBuilderFragment$onStart$2$1$1(optionStrategyBuilderFragment), new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OptionStrategyBuilderFragment.onStart$lambda$49$lambda$48$lambda$47(this.f$0, (Throwable) obj));
                }
            });
            optionStrategyBuilderFragment.getDuxo().logCustomizationSnackbar(optionChainCustomizationErrorEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onStart$lambda$49$lambda$48$lambda$47(OptionStrategyBuilderFragment optionStrategyBuilderFragment, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return AbsErrorHandler.handleError$default(optionStrategyBuilderFragment.getActivityErrorHandler(), error, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$51(OptionStrategyBuilderFragment optionStrategyBuilderFragment, Tuples2 tuples2) {
        String str = (String) tuples2.component1();
        String str2 = (String) tuples2.component2();
        RhToolbar rhToolbarRequireToolbar = optionStrategyBuilderFragment.requireToolbar();
        rhToolbarRequireToolbar.setTitle(str);
        rhToolbarRequireToolbar.setSubtitle(str2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getDuxo().abortLogs();
    }

    @Override // com.robinhood.android.optionsstrategybuilder.pickers.OptionStrategyBuilderSelectorBottomSheet.Callbacks
    public void onChoiceSelected(PillView.SelectorArgs selectorArgs, int selectedIndex) {
        Intrinsics.checkNotNullParameter(selectorArgs, "selectorArgs");
        getDuxo().updateFilter(selectorArgs, selectedIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchOrderForm(OptionOrderIntentKey optionOrderIntentKey) {
        ActivityResultLauncher<Intent> activityResultLauncher = this.optionOrderLauncher;
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, optionOrderIntentKey, null, false, 12, null));
    }

    private final NotViewPagerRecyclerView.Callbacks generateSwipeCallbacks(final PillView.SelectorArgs selectorArgs) {
        return new NotViewPagerRecyclerView.Callbacks() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment.generateSwipeCallbacks.1

            /* compiled from: OptionStrategyBuilderFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$generateSwipeCallbacks$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PillView.DisabledMode.values().length];
                    try {
                        iArr[PillView.DisabledMode.FIRST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PillView.DisabledMode.LAST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView.Callbacks
            public Integer getCurrentIndex() {
                Integer numValueOf = Integer.valueOf(CollectionsKt.indexOf((List<? extends OptionStrategyBuilderViewState.Choice>) selectorArgs.getChoices(), selectorArgs.getSelectedChoice()));
                if (numValueOf.intValue() != -1) {
                    return numValueOf;
                }
                return null;
            }

            @Override // com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView.Callbacks
            public boolean canSwipeToIndex(int index) {
                if (index < 0 || index >= selectorArgs.getChoices().size()) {
                    return false;
                }
                PillView.DisabledMode disabledIndex = selectorArgs.getDisabledIndex();
                int i = disabledIndex == null ? -1 : WhenMappings.$EnumSwitchMapping$0[disabledIndex.ordinal()];
                if (i == -1) {
                    return true;
                }
                if (i == 1) {
                    return index != 0;
                }
                if (i == 2) {
                    return index != CollectionsKt.getLastIndex(selectorArgs.getChoices());
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView.Callbacks
            public void updateTabLayout(int newIndex) {
                TabLayout.Tab tabAt;
                Tuples2<OptionStrategyChainTemplate.FilterType, TabLayout> currentlyOpenTabLayout = this.getBindings().datePickerContainer.getCurrentlyOpenTabLayout();
                if (currentlyOpenTabLayout == null) {
                    return;
                }
                OptionStrategyChainTemplate.FilterType filterTypeComponent1 = currentlyOpenTabLayout.component1();
                TabLayout tabLayoutComponent2 = currentlyOpenTabLayout.component2();
                Integer num = selectorArgs.getSelectedIndexes(newIndex).get(filterTypeComponent1);
                if (num == null || (tabAt = tabLayoutComponent2.getTabAt(num.intValue())) == null) {
                    return;
                }
                tabAt.select();
            }

            @Override // com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView.Callbacks
            public void updateRows(int newIndex) {
                this.getDuxo().updateFilter(selectorArgs, newIndex);
            }
        };
    }

    static /* synthetic */ void doScroll$default(OptionStrategyBuilderFragment optionStrategyBuilderFragment, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = optionStrategyBuilderFragment.strategyChainListAdapter.getScrollPosition();
        }
        optionStrategyBuilderFragment.doScroll(z, i);
    }

    private final void doScroll(boolean smoothScroll, int position) {
        if (position == -1) {
            return;
        }
        getScrollableLayoutManager().scrollToPositionWithOffset(position, null, smoothScroll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCustomizationPage() {
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$showCustomizationPage$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionStrategyBuilderViewState) it).getChainCustomizationFragmentKey());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C24858x7bd2f008<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsstrategybuilder.OptionStrategyBuilderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBuilderFragment.showCustomizationPage$lambda$53(this.f$0, (FragmentKey) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCustomizationPage$lambda$53(OptionStrategyBuilderFragment optionStrategyBuilderFragment, FragmentKey fragmentKey) {
        Navigator navigator = optionStrategyBuilderFragment.getNavigator();
        android.content.Context contextRequireContext = optionStrategyBuilderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(fragmentKey);
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, fragmentKey, false, false, false, false, null, false, null, null, 1012, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionStrategyBuilderFragment.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$Args;", "Landroid/os/Parcelable;", "initialAccountNumber", "", "strategyId", "template", "Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "uiOptionChains", "", "Lcom/robinhood/models/ui/UiOptionChain;", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/OptionStrategyChainTemplate;Ljava/util/List;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;)V", "getInitialAccountNumber", "()Ljava/lang/String;", "getStrategyId", "getTemplate", "()Lcom/robinhood/models/db/OptionStrategyChainTemplate;", "getUiOptionChains", "()Ljava/util/List;", "getTradeOnExpirationSettings", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
        private final String initialAccountNumber;
        private final String strategyId;
        private final OptionStrategyChainTemplate template;
        private final OptionSettings.TradingOnExpirationState tradeOnExpirationSettings;
        private final List<UiOptionChain> uiOptionChains;

        /* compiled from: OptionStrategyBuilderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                OptionStrategyChainTemplate optionStrategyChainTemplate = (OptionStrategyChainTemplate) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(string2, string3, optionStrategyChainTemplate, arrayList, OptionSettings.TradingOnExpirationState.valueOf(parcel.readString()), (OptionCurrentOrNextMarketDates) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, OptionStrategyChainTemplate optionStrategyChainTemplate, List list, OptionSettings.TradingOnExpirationState tradingOnExpirationState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.initialAccountNumber;
            }
            if ((i & 2) != 0) {
                str2 = args.strategyId;
            }
            if ((i & 4) != 0) {
                optionStrategyChainTemplate = args.template;
            }
            if ((i & 8) != 0) {
                list = args.uiOptionChains;
            }
            if ((i & 16) != 0) {
                tradingOnExpirationState = args.tradeOnExpirationSettings;
            }
            if ((i & 32) != 0) {
                optionCurrentOrNextMarketDates = args.currentOrNextMarketDates;
            }
            OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = tradingOnExpirationState;
            OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2 = optionCurrentOrNextMarketDates;
            return args.copy(str, str2, optionStrategyChainTemplate, list, tradingOnExpirationState2, optionCurrentOrNextMarketDates2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStrategyId() {
            return this.strategyId;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionStrategyChainTemplate getTemplate() {
            return this.template;
        }

        public final List<UiOptionChain> component4() {
            return this.uiOptionChains;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
            return this.tradeOnExpirationSettings;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
            return this.currentOrNextMarketDates;
        }

        public final Args copy(String initialAccountNumber, String strategyId, OptionStrategyChainTemplate template, List<UiOptionChain> uiOptionChains, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates) {
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(strategyId, "strategyId");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
            Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
            Intrinsics.checkNotNullParameter(currentOrNextMarketDates, "currentOrNextMarketDates");
            return new Args(initialAccountNumber, strategyId, template, uiOptionChains, tradeOnExpirationSettings, currentOrNextMarketDates);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.initialAccountNumber, args.initialAccountNumber) && Intrinsics.areEqual(this.strategyId, args.strategyId) && Intrinsics.areEqual(this.template, args.template) && Intrinsics.areEqual(this.uiOptionChains, args.uiOptionChains) && this.tradeOnExpirationSettings == args.tradeOnExpirationSettings && Intrinsics.areEqual(this.currentOrNextMarketDates, args.currentOrNextMarketDates);
        }

        public int hashCode() {
            return (((((((((this.initialAccountNumber.hashCode() * 31) + this.strategyId.hashCode()) * 31) + this.template.hashCode()) * 31) + this.uiOptionChains.hashCode()) * 31) + this.tradeOnExpirationSettings.hashCode()) * 31) + this.currentOrNextMarketDates.hashCode();
        }

        public String toString() {
            return "Args(initialAccountNumber=" + this.initialAccountNumber + ", strategyId=" + this.strategyId + ", template=" + this.template + ", uiOptionChains=" + this.uiOptionChains + ", tradeOnExpirationSettings=" + this.tradeOnExpirationSettings + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.initialAccountNumber);
            dest.writeString(this.strategyId);
            dest.writeParcelable(this.template, flags);
            List<UiOptionChain> list = this.uiOptionChains;
            dest.writeInt(list.size());
            Iterator<UiOptionChain> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.tradeOnExpirationSettings.name());
            dest.writeParcelable(this.currentOrNextMarketDates, flags);
        }

        public Args(String initialAccountNumber, String strategyId, OptionStrategyChainTemplate template, List<UiOptionChain> uiOptionChains, OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates) {
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(strategyId, "strategyId");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(uiOptionChains, "uiOptionChains");
            Intrinsics.checkNotNullParameter(tradeOnExpirationSettings, "tradeOnExpirationSettings");
            Intrinsics.checkNotNullParameter(currentOrNextMarketDates, "currentOrNextMarketDates");
            this.initialAccountNumber = initialAccountNumber;
            this.strategyId = strategyId;
            this.template = template;
            this.uiOptionChains = uiOptionChains;
            this.tradeOnExpirationSettings = tradeOnExpirationSettings;
            this.currentOrNextMarketDates = currentOrNextMarketDates;
        }

        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        public final String getStrategyId() {
            return this.strategyId;
        }

        public final OptionStrategyChainTemplate getTemplate() {
            return this.template;
        }

        public final List<UiOptionChain> getUiOptionChains() {
            return this.uiOptionChains;
        }

        public final OptionSettings.TradingOnExpirationState getTradeOnExpirationSettings() {
            return this.tradeOnExpirationSettings;
        }

        public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
            return this.currentOrNextMarketDates;
        }
    }

    /* compiled from: OptionStrategyBuilderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment;", "Lcom/robinhood/android/optionsstrategybuilder/OptionStrategyBuilderFragment$Args;", "<init>", "()V", "OPTION_STRATEGY_SPREAD_BOTTOM_SHEET", "", "SELECTOR_DIALOG_TAG", "SNACK_DURATION_BEFORE_SELLOUT_SEC", "", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionStrategyBuilderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionStrategyBuilderFragment optionStrategyBuilderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionStrategyBuilderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionStrategyBuilderFragment newInstance(Args args) {
            return (OptionStrategyBuilderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionStrategyBuilderFragment optionStrategyBuilderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionStrategyBuilderFragment, args);
        }
    }
}
