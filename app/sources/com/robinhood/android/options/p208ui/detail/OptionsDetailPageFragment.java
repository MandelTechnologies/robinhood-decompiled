package com.robinhood.android.options.p208ui.detail;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.C22993R;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.p208ui.bottomsheet.LateCloseBottomSheetDialogFragment;
import com.robinhood.android.options.p208ui.chart.OptionHistoricalChartKt;
import com.robinhood.android.options.p208ui.detail.OptionRow;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageBodyState2;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageEvent;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageFragment;
import com.robinhood.android.options.p208ui.detail.OptionsDetailPageToolbarState;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: OptionsDetailPageFragment.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0003Z[\\B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\"\u001a\u00020#H\u0017¢\u0006\u0002\u0010$J\u001a\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0002J\u001c\u00100\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u0001022\b\b\u0002\u00103\u001a\u00020\u0015H\u0002J\u0012\u00104\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u0012\u00105\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020#2\u0006\u00108\u001a\u00020\u0015H\u0002J\u0012\u00109\u001a\u00020#2\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\b\u0010<\u001a\u00020#H\u0002J\u0010\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020EH\u0002J\u0010\u0010F\u001a\u00020#2\u0006\u0010D\u001a\u00020EH\u0002J\u0012\u0010G\u001a\u00020#2\b\u0010H\u001a\u0004\u0018\u000102H\u0002J\u000e\u0010I\u001a\u00020#2\u0006\u0010J\u001a\u00020KJ\b\u0010L\u001a\u00020#H\u0002J\b\u0010M\u001a\u00020#H\u0002J\u0010\u0010N\u001a\u00020#2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020#2\u0006\u0010R\u001a\u00020SH\u0002J\t\u0010T\u001a\u00020\u0015H\u0096\u0001R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]²\u0006\n\u0010^\u001a\u00020_X\u008a\u0084\u0002²\u0006\n\u0010`\u001a\u00020aX\u008a\u008e\u0002²\u0006\n\u0010b\u001a\u00020aX\u008a\u008e\u0002²\u0006\n\u0010c\u001a\u00020aX\u008a\u008e\u0002²\u0006\n\u0010d\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010e\u001a\u00020\u0015X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "callbacks", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "getDuxo", "()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "toolbarVisible", "getToolbarVisible", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onSpanChanged", "displaySpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onToolbarMenuItemTapped", "menuItemState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageToolbarState$MenuItemState;", "showFragment", "key", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "showInTab", "showFragmentInStandaloneActivity", "startActivity", "Lcom/robinhood/android/navigation/keys/IntentKey;", "onCandlestickSwitchClicked", "showCandlestick", "onLateCloseInfoClicked", "args", "Lcom/robinhood/android/options/ui/bottomsheet/LateCloseBottomSheetDialogFragment$Args;", "onLateCloseUpsellTapped", "onLateCloseUpsellDismissed", "chainId", "Ljava/util/UUID;", "onDisclosureTapped", "fullDisclosureContentfulId", "", "onOptionListRowTapped", "optionRow", "Lcom/robinhood/android/options/ui/detail/OptionRow;", "onHistoryRowTapped", "onShowAllHistoryClicked", "fragmentKey", "onTradebarHeightUpdated", "newHeight", "", "onWatchlistLearnMoreTapped", "onSimulatedReturnTooltipClicked", "onSimulatedReturnTooltipFirstAppear", "tooltipState", "Lcom/robinhood/android/options/ui/detail/OptionsSimulatedReturnTooltipState;", "recordSeenTooltip", "tooltip", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageCellTooltip;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-options-detail_externalDebug", "viewState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageViewState;", "viewport", "Landroidx/compose/ui/geometry/Rect;", "greekSectionBound", "optionSectionBound", "isGreekSectionVisible", "isOptionSectionVisible"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionsDetailPageFragment extends GenericComposeFragment implements RegionGated {
    public static final String CANVAS_TAG = "option_detail_page_canvas";
    public CrossSellLaunchManager crossSellLaunchManager;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionsDetailPageFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    private final SduiActionHandler<GenericAction> actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$actionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(GenericAction it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }
    };

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionsDetailPageDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* compiled from: OptionsDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Callbacks;", "", "onTradebarDataFetched", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$PassIn;", "setDirectionOverlay", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTradebarDataFetched(OptionsDetailPageTradebarDataState.DataFetchMode.PassIn data);

        void setDirectionOverlay(Direction pageDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(OptionsDetailPageFragment optionsDetailPageFragment, int i, Composer composer, int i2) {
        optionsDetailPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$23(OptionsDetailPageFragment optionsDetailPageFragment, int i, Composer composer, int i2) {
        optionsDetailPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionsDetailPageDuxo getDuxo() {
        return (OptionsDetailPageDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsDetailPageViewState ComposeContent$lambda$0(SnapshotState4<OptionsDetailPageViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect ComposeContent$lambda$10(SnapshotState<Rect> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect ComposeContent$lambda$13(SnapshotState<Rect> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$19(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect ComposeContent$lambda$7(SnapshotState<Rect> snapshotState) {
        return snapshotState.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    @SuppressLint({"InflateParams"})
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(735853862);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(735853862, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent (OptionsDetailPageFragment.kt:90)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            Integer currentPage = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrentPage();
            if (currentPage == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OptionsDetailPageFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            int iIntValue = currentPage.intValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(OptionsDetailPageFragment.ComposeContent$lambda$3$lambda$2(snapshotState4CollectAsStateWithLifecycle));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(iIntValue, 0.0f, (Function0) objRememberedValue, composerStartRestartGroup, 0, 2);
            Direction currentPageDirection = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrentPageDirection();
            if (currentPageDirection == null) {
                currentPageDirection = Direction.f5855UP;
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new OptionsDetailPageFragment$ComposeContent$1$1(pagerStateRememberPagerState, this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(pagerStateRememberPagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(currentPageDirection.ordinal());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new OptionsDetailPageFragment$ComposeContent$2$1(this, currentPageDirection, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(currentPageDirection, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            int currentPage2 = pagerStateRememberPagerState.getCurrentPage();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged3 = composerStartRestartGroup.changed(currentPage2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            int currentPage3 = pagerStateRememberPagerState.getCurrentPage();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged4 = composerStartRestartGroup.changed(currentPage3);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotState3.mutableStateOf$default(Rect.INSTANCE.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            int currentPage4 = pagerStateRememberPagerState.getCurrentPage();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged5 = composerStartRestartGroup.changed(currentPage4);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            int currentPage5 = pagerStateRememberPagerState.getCurrentPage();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged6 = composerStartRestartGroup.changed(currentPage5);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue8;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(ComposeContent$lambda$16(snapshotState4));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged7 = composerStartRestartGroup.changed(snapshotState4) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new OptionsDetailPageFragment$ComposeContent$3$1(this, snapshotState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 0);
            Boolean boolValueOf2 = Boolean.valueOf(ComposeContent$lambda$19(snapshotState5));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged8 = composerStartRestartGroup.changed(snapshotState5) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new OptionsDetailPageFragment$ComposeContent$4$1(this, snapshotState5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, 0);
            OptionsDetailPageLoggingState currentLoggingState = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrentLoggingState();
            Context eventContext = currentLoggingState != null ? currentLoggingState.getEventContext() : null;
            OptionsDetailPageLoggingState currentLoggingState2 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrentLoggingState();
            final Direction direction = currentPageDirection;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, currentLoggingState2 != null ? currentLoggingState2.getEventScreen() : null, null, eventContext, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-990312357, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-990312357, i3, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.<anonymous> (OptionsDetailPageFragment.kt:134)");
                    }
                    PagerState pagerState = pagerStateRememberPagerState;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(OptionsDetailPageFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getTradebarHeight()), 7, null);
                    Alignment.Vertical top = Alignment.INSTANCE.getTop();
                    final OptionsDetailPageFragment optionsDetailPageFragment = this;
                    final SnapshotState4<OptionsDetailPageViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                    final Direction direction2 = direction;
                    final SnapshotState<Boolean> snapshotState6 = snapshotState4;
                    final SnapshotState<Rect> snapshotState7 = snapshotState2;
                    final SnapshotState<Boolean> snapshotState8 = snapshotState5;
                    final SnapshotState<Rect> snapshotState9 = snapshotState3;
                    final SnapshotState<Rect> snapshotState10 = snapshotState;
                    PagerKt.m5301HorizontalPager8jOkeI(pagerState, modifierM5146paddingqDBjuR0$default, null, null, 0, 0.0f, top, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(-104464548, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.5.2
                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer3, Integer num2) {
                            invoke(pagerScope, num.intValue(), composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PagerScope HorizontalPager, int i4, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-104464548, i5, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.<anonymous>.<anonymous> (OptionsDetailPageFragment.kt:141)");
                            }
                            final OptionsDetailPageBodyState bodyState = OptionsDetailPageFragment.ComposeContent$lambda$0(snapshotState42).getPageStates().get(i4).getBodyState();
                            if (bodyState == null) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                            final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composer3, 0, 1);
                            Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(optionsDetailPageFragment.getScarletManager());
                            final Direction direction3 = direction2;
                            final OptionsDetailPageFragment optionsDetailPageFragment2 = optionsDetailPageFragment;
                            final SnapshotState4<OptionsDetailPageViewState> snapshotState43 = snapshotState42;
                            final SnapshotState<Boolean> snapshotState11 = snapshotState6;
                            final SnapshotState<Rect> snapshotState12 = snapshotState7;
                            final SnapshotState<Boolean> snapshotState13 = snapshotState8;
                            final SnapshotState<Rect> snapshotState14 = snapshotState9;
                            final SnapshotState<Rect> snapshotState15 = snapshotState10;
                            BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-1376894066, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.5.2.1

                                /* compiled from: OptionsDetailPageFragment.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$WhenMappings */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[Direction.values().length];
                                        try {
                                            iArr[Direction.f5855UP.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[Direction.DOWN.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    BentoTheme4 bentoTheme4;
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1376894066, i6, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (OptionsDetailPageFragment.kt:148)");
                                    }
                                    int i7 = WhenMappings.$EnumSwitchMapping$0[direction3.ordinal()];
                                    if (i7 == 1) {
                                        bentoTheme4 = BentoTheme4.POSITIVE;
                                    } else {
                                        if (i7 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bentoTheme4 = BentoTheme4.NEGATIVE;
                                    }
                                    final ScrollState scrollState = scrollStateRememberScrollState;
                                    final TopBarScrollState topBarScrollState = topBarScrollStateRememberTopBarScrollState;
                                    final OptionsDetailPageFragment optionsDetailPageFragment3 = optionsDetailPageFragment2;
                                    final SnapshotState4<OptionsDetailPageViewState> snapshotState44 = snapshotState43;
                                    final SnapshotState<Boolean> snapshotState16 = snapshotState11;
                                    final SnapshotState<Rect> snapshotState17 = snapshotState12;
                                    final SnapshotState<Boolean> snapshotState18 = snapshotState13;
                                    final SnapshotState<Rect> snapshotState19 = snapshotState14;
                                    final SnapshotState<Rect> snapshotState20 = snapshotState15;
                                    final OptionsDetailPageBodyState optionsDetailPageBodyState = bodyState;
                                    BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-435881560, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.5.2.1.1

                                        /* compiled from: OptionsDetailPageFragment.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$2, reason: invalid class name and collision with other inner class name */
                                        static final class C503752 implements Function3<PaddingValues, Composer, Integer, Unit> {
                                            final /* synthetic */ OptionsDetailPageBodyState $bodyState;
                                            final /* synthetic */ SnapshotState<Rect> $greekSectionBound$delegate;
                                            final /* synthetic */ SnapshotState<Boolean> $isGreekSectionVisible$delegate;
                                            final /* synthetic */ SnapshotState<Boolean> $isOptionSectionVisible$delegate;
                                            final /* synthetic */ SnapshotState<Rect> $optionSectionBound$delegate;
                                            final /* synthetic */ ScrollState $verticalScrollState;
                                            final /* synthetic */ SnapshotState4<OptionsDetailPageViewState> $viewState$delegate;
                                            final /* synthetic */ SnapshotState<Rect> $viewport$delegate;
                                            final /* synthetic */ OptionsDetailPageFragment this$0;

                                            C503752(ScrollState scrollState, SnapshotState<Boolean> snapshotState, SnapshotState<Rect> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Rect> snapshotState4, SnapshotState<Rect> snapshotState5, SnapshotState4<OptionsDetailPageViewState> snapshotState42, OptionsDetailPageBodyState optionsDetailPageBodyState, OptionsDetailPageFragment optionsDetailPageFragment) {
                                                this.$verticalScrollState = scrollState;
                                                this.$isGreekSectionVisible$delegate = snapshotState;
                                                this.$greekSectionBound$delegate = snapshotState2;
                                                this.$isOptionSectionVisible$delegate = snapshotState3;
                                                this.$optionSectionBound$delegate = snapshotState4;
                                                this.$viewport$delegate = snapshotState5;
                                                this.$viewState$delegate = snapshotState42;
                                                this.$bodyState = optionsDetailPageBodyState;
                                                this.this$0 = optionsDetailPageFragment;
                                            }

                                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                                OptionsDetailPageFragment optionsDetailPageFragment;
                                                boolean z;
                                                Composer composer2 = composer;
                                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                                int i2 = (i & 6) == 0 ? i | (composer2.changed(paddingValues) ? 4 : 2) : i;
                                                if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(504765753, i2, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsDetailPageFragment.kt:167)");
                                                }
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                                                ScrollState scrollState = this.$verticalScrollState;
                                                SnapshotState<Boolean> snapshotState = this.$isGreekSectionVisible$delegate;
                                                final SnapshotState<Rect> snapshotState2 = this.$greekSectionBound$delegate;
                                                SnapshotState<Boolean> snapshotState3 = this.$isOptionSectionVisible$delegate;
                                                final SnapshotState<Rect> snapshotState4 = this.$optionSectionBound$delegate;
                                                final SnapshotState<Rect> snapshotState5 = this.$viewport$delegate;
                                                SnapshotState4<OptionsDetailPageViewState> snapshotState42 = this.$viewState$delegate;
                                                OptionsDetailPageBodyState optionsDetailPageBodyState = this.$bodyState;
                                                OptionsDetailPageFragment optionsDetailPageFragment2 = this.this$0;
                                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                Integer numValueOf = Integer.valueOf(scrollState.getValue());
                                                Rect rectComposeContent$lambda$7 = OptionsDetailPageFragment.ComposeContent$lambda$7(snapshotState5);
                                                Rect rectComposeContent$lambda$10 = OptionsDetailPageFragment.ComposeContent$lambda$10(snapshotState2);
                                                composer2.startReplaceGroup(-1746271574);
                                                boolean zChanged = composer2.changed(snapshotState) | composer2.changed(snapshotState2);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$1$1(snapshotState2, snapshotState5, snapshotState, null);
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                composer2.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(numValueOf, rectComposeContent$lambda$7, rectComposeContent$lambda$10, (Function2) objRememberedValue, composer2, 0);
                                                Integer numValueOf2 = Integer.valueOf(scrollState.getValue());
                                                Rect rectComposeContent$lambda$72 = OptionsDetailPageFragment.ComposeContent$lambda$7(snapshotState5);
                                                Rect rectComposeContent$lambda$13 = OptionsDetailPageFragment.ComposeContent$lambda$13(snapshotState4);
                                                composer2.startReplaceGroup(-1746271574);
                                                boolean zChanged2 = composer2.changed(snapshotState3) | composer2.changed(snapshotState4);
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$2$1(snapshotState4, snapshotState5, snapshotState3, null);
                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer2.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(numValueOf2, rectComposeContent$lambda$72, rectComposeContent$lambda$13, (Function2) objRememberedValue2, composer2, 0);
                                                OptionsDetailPageFragment optionsDetailPageFragment3 = optionsDetailPageFragment2;
                                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(companion, scrollState, false, null, false, 14, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM(OptionsDetailPageFragment.ComposeContent$lambda$0(snapshotState42).getTradebarHeight()), 7, null);
                                                composer2.startReplaceGroup(5004770);
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return OptionsDetailPageFragment.C239765.AnonymousClass2.AnonymousClass1.C503731.C503752.invoke$lambda$28$lambda$4$lambda$3(snapshotState5, (LayoutCoordinates) obj);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer2.endReplaceGroup();
                                                Modifier modifierUpdateTooltipCanvas = ModifiersKt.updateTooltipCanvas(OnGloballyPositionedModifier3.onGloballyPositioned(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3), OptionsDetailPageFragment.CANVAS_TAG);
                                                boolean z2 = false;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer2, 0);
                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierUpdateTooltipCanvas);
                                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                if (composer2.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor2);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                composer2.startReplaceGroup(-2135551680);
                                                for (OptionsDetailPageBodyState2 optionsDetailPageBodyState2 : optionsDetailPageBodyState.getSections()) {
                                                    if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Banner) {
                                                        composer2.startReplaceGroup(-1133990453);
                                                        OptionsDetailPageFragment optionsDetailPageFragment4 = optionsDetailPageFragment3;
                                                        OptionsDetailPageBanner.OptionsDetailPageBanner((OptionsDetailPageBodyState2.Banner) optionsDetailPageBodyState2, optionsDetailPageFragment4.getNavigator(), optionsDetailPageFragment4.getDuxo(), null, composer2, 0, 8);
                                                        composer2.endReplaceGroup();
                                                        z = z2;
                                                        optionsDetailPageFragment = optionsDetailPageFragment4;
                                                    } else {
                                                        OptionsDetailPageFragment optionsDetailPageFragment5 = optionsDetailPageFragment3;
                                                        if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Chart) {
                                                            composer2.startReplaceGroup(-793602384);
                                                            OptionsDetailPageBodyState2.Chart chart = (OptionsDetailPageBodyState2.Chart) optionsDetailPageBodyState2;
                                                            SduiActionHandler sduiActionHandler = optionsDetailPageFragment5.actionHandler;
                                                            composer2.startReplaceGroup(5004770);
                                                            boolean zChangedInstance = composer2.changedInstance(optionsDetailPageFragment5);
                                                            Object objRememberedValue4 = composer2.rememberedValue();
                                                            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue4 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$1$1(optionsDetailPageFragment5);
                                                                composer2.updateRememberedValue(objRememberedValue4);
                                                            }
                                                            KFunction kFunction = (KFunction) objRememberedValue4;
                                                            composer2.endReplaceGroup();
                                                            composer2.startReplaceGroup(5004770);
                                                            boolean zChangedInstance2 = composer2.changedInstance(optionsDetailPageFragment5);
                                                            Object objRememberedValue5 = composer2.rememberedValue();
                                                            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue5 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$2$1(optionsDetailPageFragment5);
                                                                composer2.updateRememberedValue(objRememberedValue5);
                                                            }
                                                            Function1 function1 = (Function1) objRememberedValue5;
                                                            composer2.endReplaceGroup();
                                                            composer2.startReplaceGroup(5004770);
                                                            boolean zChangedInstance3 = composer2.changedInstance(optionsDetailPageFragment5);
                                                            Object objRememberedValue6 = composer2.rememberedValue();
                                                            if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue6 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$3$1(optionsDetailPageFragment5);
                                                                composer2.updateRememberedValue(objRememberedValue6);
                                                            }
                                                            KFunction kFunction2 = (KFunction) objRememberedValue6;
                                                            composer2.endReplaceGroup();
                                                            composer2.startReplaceGroup(5004770);
                                                            boolean zChangedInstance4 = composer2.changedInstance(optionsDetailPageFragment5);
                                                            Object objRememberedValue7 = composer2.rememberedValue();
                                                            if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue7 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$4$1(optionsDetailPageFragment5);
                                                                composer2.updateRememberedValue(objRememberedValue7);
                                                            }
                                                            KFunction kFunction3 = (KFunction) objRememberedValue7;
                                                            composer2.endReplaceGroup();
                                                            OptionsDetailPageDuxo duxo = optionsDetailPageFragment5.getDuxo();
                                                            composer2.startReplaceGroup(5004770);
                                                            boolean zChangedInstance5 = composer2.changedInstance(duxo);
                                                            Object objRememberedValue8 = composer2.rememberedValue();
                                                            if (zChangedInstance5 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue8 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$5$1(duxo);
                                                                composer2.updateRememberedValue(objRememberedValue8);
                                                            }
                                                            composer2.endReplaceGroup();
                                                            Composer composer3 = composer2;
                                                            optionsDetailPageFragment = optionsDetailPageFragment5;
                                                            OptionHistoricalChartKt.OptionHistoricalChart(chart, null, sduiActionHandler, (Function1) kFunction, (Function1) kFunction3, function1, (Function1) kFunction2, (Function1) ((KFunction) objRememberedValue8), composer3, 0, 2);
                                                            composer2 = composer3;
                                                            composer2.endReplaceGroup();
                                                        } else {
                                                            optionsDetailPageFragment = optionsDetailPageFragment5;
                                                            if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Disclosure) {
                                                                composer2.startReplaceGroup(-1133948990);
                                                                OptionsDetailPageBodyState2.Disclosure disclosure = (OptionsDetailPageBodyState2.Disclosure) optionsDetailPageBodyState2;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance6 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue9 = composer2.rememberedValue();
                                                                if (zChangedInstance6 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue9 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$6$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue9);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                z = false;
                                                                OptionsDetailPageDisclosure.OptionsDetailPageDisclosure(disclosure, (Function1) ((KFunction) objRememberedValue9), composer2, 0);
                                                                composer2.endReplaceGroup();
                                                            } else if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Stats) {
                                                                composer2.startReplaceGroup(-1133942745);
                                                                OptionsDetailPageStats.OptionsDetailPageStats((OptionsDetailPageBodyState2.Stats) optionsDetailPageBodyState2, composer2, 0);
                                                                composer2.endReplaceGroup();
                                                            } else if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Greeks) {
                                                                composer2.startReplaceGroup(-792306987);
                                                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChanged3 = composer2.changed(snapshotState2);
                                                                Object objRememberedValue10 = composer2.rememberedValue();
                                                                if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue10 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$$ExternalSyntheticLambda1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            return OptionsDetailPageFragment.C239765.AnonymousClass2.AnonymousClass1.C503731.C503752.invoke$lambda$28$lambda$27$lambda$26$lambda$12$lambda$11(snapshotState2, (LayoutCoordinates) obj);
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue10);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                OptionsDetailPageGreeks.OptionsDetailPageGreeks((OptionsDetailPageBodyState2.Greeks) optionsDetailPageBodyState2, OnGloballyPositionedModifier3.onGloballyPositioned(companion4, (Function1) objRememberedValue10), composer2, 0, 0);
                                                                composer2.endReplaceGroup();
                                                            } else if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Options) {
                                                                composer2.startReplaceGroup(-791778933);
                                                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChanged4 = composer2.changed(snapshotState4);
                                                                Object objRememberedValue11 = composer2.rememberedValue();
                                                                if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue11 = new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$$ExternalSyntheticLambda2
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Object invoke(Object obj) {
                                                                            return OptionsDetailPageFragment.C239765.AnonymousClass2.AnonymousClass1.C503731.C503752.invoke$lambda$28$lambda$27$lambda$26$lambda$14$lambda$13(snapshotState4, (LayoutCoordinates) obj);
                                                                        }
                                                                    };
                                                                    composer2.updateRememberedValue(objRememberedValue11);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion5, (Function1) objRememberedValue11);
                                                                OptionsDetailPageBodyState2.Options options = (OptionsDetailPageBodyState2.Options) optionsDetailPageBodyState2;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance7 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue12 = composer2.rememberedValue();
                                                                if (zChangedInstance7 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue12 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$9$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue12);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                OptionsDetailPageOptionList.OptionsDetailPageOptionList(options, modifierOnGloballyPositioned, (Function1) ((KFunction) objRememberedValue12), composer, 0, 0);
                                                                composer2 = composer;
                                                                composer2.endReplaceGroup();
                                                            } else if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.History) {
                                                                composer2.startReplaceGroup(-1133899745);
                                                                OptionsDetailPageBodyState2.History history = (OptionsDetailPageBodyState2.History) optionsDetailPageBodyState2;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance8 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue13 = composer2.rememberedValue();
                                                                if (zChangedInstance8 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue13 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$10$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue13);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function1 function12 = (Function1) ((KFunction) objRememberedValue13);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance9 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue14 = composer2.rememberedValue();
                                                                if (zChangedInstance9 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue14 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$11$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue14);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                OptionsDetailPageHistory.OptionsDetailPageHistory(history, function12, (Function1) ((KFunction) objRememberedValue14), composer2, 0);
                                                                composer2.endReplaceGroup();
                                                            } else if (optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Position) {
                                                                composer2.startReplaceGroup(-1133883769);
                                                                OptionsDetailPageBodyState2.Position position = (OptionsDetailPageBodyState2.Position) optionsDetailPageBodyState2;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance10 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue15 = composer2.rememberedValue();
                                                                if (zChangedInstance10 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue15 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$12$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue15);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function1 function13 = (Function1) ((KFunction) objRememberedValue15);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance11 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue16 = composer2.rememberedValue();
                                                                if (zChangedInstance11 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue16 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$13$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue16);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function2 function2 = (Function2) ((KFunction) objRememberedValue16);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance12 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue17 = composer2.rememberedValue();
                                                                if (zChangedInstance12 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue17 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$14$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue17);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function0 function0 = (Function0) ((KFunction) objRememberedValue17);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance13 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue18 = composer2.rememberedValue();
                                                                if (zChangedInstance13 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue18 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$15$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue18);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function1 function14 = (Function1) ((KFunction) objRememberedValue18);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance14 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue19 = composer2.rememberedValue();
                                                                if (zChangedInstance14 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue19 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$16$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue19);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function0 function02 = (Function0) ((KFunction) objRememberedValue19);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance15 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue20 = composer2.rememberedValue();
                                                                if (zChangedInstance15 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue20 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$17$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue20);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function1 function15 = (Function1) ((KFunction) objRememberedValue20);
                                                                Composer composer4 = composer2;
                                                                OptionsDetailPagePosition.OptionsDetailPagePosition(position, function13, function2, function0, function14, function02, function15, false, composer4, 0, 128);
                                                                composer2 = composer4;
                                                                composer2.endReplaceGroup();
                                                            } else {
                                                                if (!(optionsDetailPageBodyState2 instanceof OptionsDetailPageBodyState2.Upsell.LateClose)) {
                                                                    composer2.startReplaceGroup(-1133989292);
                                                                    composer2.endReplaceGroup();
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                composer2.startReplaceGroup(-1133852872);
                                                                OptionsDetailPageBodyState2.Upsell.LateClose lateClose = (OptionsDetailPageBodyState2.Upsell.LateClose) optionsDetailPageBodyState2;
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance16 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue21 = composer2.rememberedValue();
                                                                if (zChangedInstance16 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue21 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$18$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue21);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                Function0 function03 = (Function0) ((KFunction) objRememberedValue21);
                                                                composer2.startReplaceGroup(5004770);
                                                                boolean zChangedInstance17 = composer2.changedInstance(optionsDetailPageFragment);
                                                                Object objRememberedValue22 = composer2.rememberedValue();
                                                                if (zChangedInstance17 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                                                    objRememberedValue22 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$2$1$5$1$19$1(optionsDetailPageFragment);
                                                                    composer2.updateRememberedValue(objRememberedValue22);
                                                                }
                                                                composer2.endReplaceGroup();
                                                                z = false;
                                                                OptionsDetailPageLateCloseUpsell.OptionsDetailPageLateCloseUpsell(lateClose, function03, (Function1) ((KFunction) objRememberedValue22), composer2, 0);
                                                                composer2.endReplaceGroup();
                                                            }
                                                        }
                                                        z = false;
                                                    }
                                                    OptionsDetailPageFragment optionsDetailPageFragment6 = optionsDetailPageFragment;
                                                    z2 = z;
                                                    optionsDetailPageFragment3 = optionsDetailPageFragment6;
                                                }
                                                composer2.endReplaceGroup();
                                                composer2.endNode();
                                                composer2.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                                invoke(paddingValues, composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$28$lambda$4$lambda$3(SnapshotState snapshotState, LayoutCoordinates it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                OptionsDetailPageFragment.ComposeContent$lambda$8(snapshotState, LayoutCoordinates2.boundsInWindow(it));
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$28$lambda$27$lambda$26$lambda$12$lambda$11(SnapshotState snapshotState, LayoutCoordinates it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                OptionsDetailPageFragment.ComposeContent$lambda$11(snapshotState, LayoutCoordinates2.boundsInWindow(it));
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$28$lambda$27$lambda$26$lambda$14$lambda$13(SnapshotState snapshotState, LayoutCoordinates it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                OptionsDetailPageFragment.ComposeContent$lambda$14(snapshotState, LayoutCoordinates2.boundsInWindow(it));
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i8) {
                                            if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-435881560, i8, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsDetailPageFragment.kt:154)");
                                            }
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-1070471068, true, new C503741(scrollState, topBarScrollState, optionsDetailPageFragment3, snapshotState44), composer5, 54), null, null, null, 0, bentoTheme.getColors(composer5, i9).m21371getBg0d7_KjU(), bentoTheme.getColors(composer5, i9).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(504765753, true, new C503752(scrollState, snapshotState16, snapshotState17, snapshotState18, snapshotState19, snapshotState20, snapshotState44, optionsDetailPageBodyState, optionsDetailPageFragment3), composer5, 54), composer5, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* compiled from: OptionsDetailPageFragment.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C503741 implements Function2<Composer, Integer, Unit> {
                                            final /* synthetic */ TopBarScrollState $topBarScrollState;
                                            final /* synthetic */ ScrollState $verticalScrollState;
                                            final /* synthetic */ SnapshotState4<OptionsDetailPageViewState> $viewState$delegate;
                                            final /* synthetic */ OptionsDetailPageFragment this$0;

                                            C503741(ScrollState scrollState, TopBarScrollState topBarScrollState, OptionsDetailPageFragment optionsDetailPageFragment, SnapshotState4<OptionsDetailPageViewState> snapshotState4) {
                                                this.$verticalScrollState = scrollState;
                                                this.$topBarScrollState = topBarScrollState;
                                                this.this$0 = optionsDetailPageFragment;
                                                this.$viewState$delegate = snapshotState4;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                invoke(composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer, int i) {
                                                if ((i & 3) == 2 && composer.getSkipping()) {
                                                    composer.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1070471068, i, -1, "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionsDetailPageFragment.kt:158)");
                                                }
                                                OptionsDetailPageToolbarState currentToolbarState = OptionsDetailPageFragment.ComposeContent$lambda$0(this.$viewState$delegate).getCurrentToolbarState();
                                                ScrollState scrollState = this.$verticalScrollState;
                                                TopBarScrollState topBarScrollState = this.$topBarScrollState;
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance = composer.changedInstance(this.this$0);
                                                final OptionsDetailPageFragment optionsDetailPageFragment = this.this$0;
                                                Object objRememberedValue = composer.rememberedValue();
                                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$ComposeContent$5$2$1$1$1$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return OptionsDetailPageFragment.C239765.AnonymousClass2.AnonymousClass1.C503731.C503741.invoke$lambda$1$lambda$0(optionsDetailPageFragment);
                                                        }
                                                    };
                                                    composer.updateRememberedValue(objRememberedValue);
                                                }
                                                Function0 function0 = (Function0) objRememberedValue;
                                                composer.endReplaceGroup();
                                                OptionsDetailPageFragment optionsDetailPageFragment2 = this.this$0;
                                                composer.startReplaceGroup(5004770);
                                                boolean zChangedInstance2 = composer.changedInstance(optionsDetailPageFragment2);
                                                Object objRememberedValue2 = composer.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new OptionsDetailPageFragment$ComposeContent$5$2$1$1$1$2$1(optionsDetailPageFragment2);
                                                    composer.updateRememberedValue(objRememberedValue2);
                                                }
                                                composer.endReplaceGroup();
                                                OptionsDetailPageTopAppBar.OptionsDetailPageTopAppBar(currentToolbarState, scrollState, topBarScrollState, function0, (Function1) ((KFunction) objRememberedValue2), null, composer, TopBarScrollState.$stable << 6, 32);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$1$lambda$0(OptionsDetailPageFragment optionsDetailPageFragment) {
                                                optionsDetailPageFragment.requireBaseActivity().onBackPressed();
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }, composer4, 54), composer4, 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 384, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 1572864, 24576, 16316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDetailPageFragment.ComposeContent$lambda$23(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ComposeContent$lambda$3$lambda$2(SnapshotState4 snapshotState4) {
        return ComposeContent$lambda$0(snapshotState4).getPageStates().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$11(SnapshotState<Rect> snapshotState, Rect rect) {
        snapshotState.setValue(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$14(SnapshotState<Rect> snapshotState, Rect rect) {
        snapshotState.setValue(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$8(SnapshotState<Rect> snapshotState, Rect rect) {
        snapshotState.setValue(rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$20(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsDetailPageFragment.onViewCreated$lambda$24(this.f$0, (DayNightOverlay) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C239772(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$24(OptionsDetailPageFragment optionsDetailPageFragment, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        optionsDetailPageFragment.getDuxo().updateDayNightOverlay(dayNightOverlay == DayNightOverlay.DAY);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionsDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2", m3645f = "OptionsDetailPageFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2 */
    static final class C239772 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C239772(Continuation<? super C239772> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C239772 c239772 = OptionsDetailPageFragment.this.new C239772(continuation);
            c239772.L$0 = obj;
            return c239772;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C239772) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: OptionsDetailPageFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$1", m3645f = "OptionsDetailPageFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionsDetailPageFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OptionsDetailPageFragment optionsDetailPageFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageFragment;
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
                    final StateFlow<OptionsDetailPageViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<OptionsDetailPageTradebarDataState.PageSpecificDerivedData>() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super OptionsDetailPageTradebarDataState.PageSpecificDerivedData> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "OptionsDetailPageFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                    OptionsDetailPageTradebarDataState.PageSpecificDerivedData currentTradebarData = ((OptionsDetailPageViewState) obj).getCurrentTradebarData();
                                    if (currentTradebarData != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(currentTradebarData, anonymousClass1) == coroutine_suspended) {
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
                    final OptionsDetailPageFragment optionsDetailPageFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.onViewCreated.2.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((OptionsDetailPageTradebarDataState.PageSpecificDerivedData) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData, Continuation<? super Unit> continuation) {
                            optionsDetailPageFragment.getCallbacks().onTradebarDataFetched(new OptionsDetailPageTradebarDataState.DataFetchMode.PassIn(pageSpecificDerivedData, OptionsDetailPageDuxoKt.isLegContext((Args) OptionsDetailPageFragment.INSTANCE.getArgs((Fragment) optionsDetailPageFragment))));
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
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(OptionsDetailPageFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(OptionsDetailPageFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: OptionsDetailPageFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$2", m3645f = "OptionsDetailPageFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ OptionsDetailPageFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(OptionsDetailPageFragment optionsDetailPageFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = optionsDetailPageFragment;
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
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    final OptionsDetailPageFragment optionsDetailPageFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment.onViewCreated.2.2.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Event<OptionsDetailPageEvent>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(final Event<OptionsDetailPageEvent> event, Continuation<? super Unit> continuation) {
                            EventConsumer<OptionsDetailPageEvent> eventConsumerInvoke;
                            final OptionsDetailPageFragment optionsDetailPageFragment2 = optionsDetailPageFragment;
                            if ((event.getData() instanceof OptionsDetailPageEvent.IacBottomSheetEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.options.ui.detail.OptionsDetailPageFragment$onViewCreated$2$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m17069invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m17069invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        OptionsDetailPageEvent.IacBottomSheetEvent iacBottomSheetEvent = (OptionsDetailPageEvent.IacBottomSheetEvent) event.getData();
                                        CrossSellLaunchManager crossSellLaunchManager = optionsDetailPageFragment2.getCrossSellLaunchManager();
                                        FragmentManager childFragmentManager = optionsDetailPageFragment2.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        crossSellLaunchManager.processNavigationKey(childFragmentManager, iacBottomSheetEvent.getNavigationKey());
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSpanChanged(DisplaySpan displaySpan) {
        getDuxo().onSpanChanged(displaySpan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToolbarMenuItemTapped(OptionsDetailPageToolbarState.MenuItemState menuItemState) {
        if (menuItemState instanceof OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, ((OptionsDetailPageToolbarState.MenuItemState.ViewUnderlier) menuItemState).getUnderlyingFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return;
        }
        if (!(menuItemState instanceof OptionsDetailPageToolbarState.MenuItemState.PictureInPicture)) {
            throw new NoWhenBranchMatchedException();
        }
        Navigator navigator2 = getNavigator();
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext2, ((OptionsDetailPageToolbarState.MenuItemState.PictureInPicture) menuItemState).getNavigationKey(), null, false, null, null, 60, null);
    }

    static /* synthetic */ void showFragment$default(OptionsDetailPageFragment optionsDetailPageFragment, FragmentKey fragmentKey, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        optionsDetailPageFragment.showFragment(fragmentKey, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFragment(FragmentKey key, boolean showInTab) {
        if (key != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, key, false, showInTab, false, null, false, null, false, false, null, null, 4084, null);
        }
    }

    private final void showFragmentInStandaloneActivity(FragmentKey key) {
        if (key != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, key, false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startActivity(IntentKey key) {
        if (key != null) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, key, null, false, null, null, 60, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCandlestickSwitchClicked(boolean showCandlestick) {
        getDuxo().onCandlestickSwitchClicked(showCandlestick);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLateCloseInfoClicked(LateCloseBottomSheetDialogFragment.Args args) {
        if (args == null) {
            return;
        }
        getDuxo().logLateCloseInfoClicked();
        LateCloseBottomSheetDialogFragment lateCloseBottomSheetDialogFragment = (LateCloseBottomSheetDialogFragment) LateCloseBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) args);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        lateCloseBottomSheetDialogFragment.show(childFragmentManager, "late_close_info_tag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLateCloseUpsellTapped() {
        getDuxo().onLateCloseUpsellTapped();
        showFragment$default(this, CuratedListKey.INSTANCE.getLateClosingOptionsListKey(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLateCloseUpsellDismissed(UUID chainId) {
        getDuxo().onLateCloseUpsellDismissed(chainId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisclosureTapped(String fullDisclosureContentfulId) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RemoteDisclosureKey(fullDisclosureContentfulId, null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOptionListRowTapped(OptionRow optionRow) {
        if (optionRow.getShowFragmentInStandaloneActivity()) {
            showFragmentInStandaloneActivity(optionRow.getKey());
        } else {
            showFragment$default(this, optionRow.getKey(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onHistoryRowTapped(OptionRow optionRow) {
        if (optionRow.getOptionRowType() == OptionRow.OptionRowType.COMBO_ORDER) {
            getDuxo().onOptionHistoryRowClicked(optionRow);
        }
        if (optionRow.getShowFragmentInStandaloneActivity()) {
            showFragmentInStandaloneActivity(optionRow.getKey());
        } else {
            showFragment$default(this, optionRow.getKey(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowAllHistoryClicked(FragmentKey fragmentKey) {
        showFragmentInStandaloneActivity(fragmentKey);
    }

    public final void onTradebarHeightUpdated(int newHeight) {
        getDuxo().onTradebarHeightUpdated(newHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWatchlistLearnMoreTapped() {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, getString(C22993R.string.options_detail_page_watchlist_learn_more_bottom_sheet_title), null, getString(C22993R.string.options_detail_page_watchlist_learn_more_bottom_sheet_message), null, getString(C11048R.string.general_label_done), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "watchlist-position-learn-more-bottom-sheet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSimulatedReturnTooltipClicked() {
        getDuxo().onSimulatedReturnTooltipClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSimulatedReturnTooltipFirstAppear(OptionsSimulatedReturnTooltipState tooltipState) {
        getDuxo().onSimulatedReturnTooltipFirstAppear(tooltipState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordSeenTooltip(OptionsDetailPageDataCell2 tooltip) {
        getDuxo().recordSeenTooltip(tooltip);
    }

    /* compiled from: OptionsDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Args;", "Landroid/os/Parcelable;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "<init>", "(Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;)V", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionsDetailPageLaunchMode;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionsDetailPageLaunchMode launchMode;

        /* compiled from: OptionsDetailPageFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((OptionsDetailPageLaunchMode) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, OptionsDetailPageLaunchMode optionsDetailPageLaunchMode, int i, Object obj) {
            if ((i & 1) != 0) {
                optionsDetailPageLaunchMode = args.launchMode;
            }
            return args.copy(optionsDetailPageLaunchMode);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionsDetailPageLaunchMode getLaunchMode() {
            return this.launchMode;
        }

        public final Args copy(OptionsDetailPageLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return new Args(launchMode);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.launchMode, ((Args) other).launchMode);
        }

        public int hashCode() {
            return this.launchMode.hashCode();
        }

        public String toString() {
            return "Args(launchMode=" + this.launchMode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.launchMode, flags);
        }

        public Args(OptionsDetailPageLaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.launchMode = launchMode;
        }

        public final OptionsDetailPageLaunchMode getLaunchMode() {
            return this.launchMode;
        }
    }

    /* compiled from: OptionsDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment;", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageFragment$Args;", "<init>", "()V", "CANVAS_TAG", "", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionsDetailPageFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionsDetailPageFragment optionsDetailPageFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionsDetailPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionsDetailPageFragment newInstance(Args args) {
            return (OptionsDetailPageFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionsDetailPageFragment optionsDetailPageFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionsDetailPageFragment, args);
        }
    }
}
