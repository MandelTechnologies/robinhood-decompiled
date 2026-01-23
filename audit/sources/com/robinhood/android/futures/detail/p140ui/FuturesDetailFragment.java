package com.robinhood.android.futures.detail.p140ui;

import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.futures.contracts.FuturesDetailFragmentKey;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartDuxo4;
import com.robinhood.android.futures.detail.p140ui.chart.FuturesDetailChartViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailDuxo;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.sharedfuturesui.contextualbar.LadderFtuxManager;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.FuturesContractContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FuturesDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001`B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u00106\u001a\u00020)H\u0016J\b\u00107\u001a\u00020)H\u0002J\r\u00108\u001a\u00020)H\u0017¢\u0006\u0002\u00109J\u0018\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000eH\u0016J\u0018\u0010>\u001a\u00020)2\u0006\u0010;\u001a\u00020<2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020)H\u0016J\u0018\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u00020)H\u0016J\u001a\u0010G\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u00020)H\u0016J\u0018\u0010K\u001a\u00020)2\u0006\u0010;\u001a\u00020<2\u0006\u0010L\u001a\u00020\u000eH\u0016J\b\u0010M\u001a\u00020)H\u0016J\u0010\u0010N\u001a\u00020)2\u0006\u0010O\u001a\u00020\u000eH\u0016J\b\u0010P\u001a\u00020)H\u0016J\u0010\u0010Q\u001a\u00020)2\u0006\u0010;\u001a\u00020<H\u0016J\u0018\u0010R\u001a\u00020)2\u0006\u0010;\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010S\u001a\u00020)2\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020)H\u0016J\b\u0010W\u001a\u00020)H\u0016J\b\u0010X\u001a\u00020)H\u0016J\u0010\u0010Y\u001a\u00020)2\u0006\u0010;\u001a\u00020<H\u0016J\t\u0010Z\u001a\u00020\u000eH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010R\u0014\u0010&\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0010R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00102\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0018\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a²\u0006\n\u0010b\u001a\u00020cX\u008a\u0084\u0002²\u0006\n\u0010d\u001a\u00020eX\u008a\u0084\u0002²\u0006\n\u0010f\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010g\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/FuturesDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/futures/detail/ui/FuturesDetailScreenCallbacks;", "<init>", "()V", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "getPipSupportStore", "()Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "setPipSupportStore", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "duxo", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "chartDuxo", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo;", "getChartDuxo", "()Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartDuxo;", "chartDuxo$delegate", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "hasBottomBar", "getHasBottomBar", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ladderFtuxManager", "Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "getLadderFtuxManager", "()Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;", "setLadderFtuxManager", "(Lcom/robinhood/android/futures/sharedfuturesui/contextualbar/LadderFtuxManager;)V", "curatedListQuickAddFragment", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "onStart", "ensureCuratedListQuickAddFragment", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showPictureInPicture", "contractId", "Ljava/util/UUID;", "isContinuous", "setSelectedContractId", "viewMode", "Lcom/robinhood/android/futures/detail/ui/chart/ChartViewMode;", "onBackClicked", "addToWatchlist", "isContractInUserLists", "futuresContract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "exitFtux", "navigateToOnboarding", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "onOpenContractsSelector", "onContractSelected", "isViewingProductOnly", "onContractSelectorDismissed", "prefetchLadderFtuxLottieIfNeeded", "isTradeBarExpanded", "hideLadderButtonTooltip", "onContractTradeLadderClicked", "onContractTradeOrderFormClicked", "onError", "t", "", "goToNextFtuxState", "goToPreviousFtuxState", "onFlattenClick", "onOpenAdvancedChart", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-futures-detail_externalDebug", "state", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState;", "chartState", "Lcom/robinhood/android/futures/detail/ui/chart/FuturesDetailChartViewState;", "waitForChartData", "isChartDataLoadingForChartEducationFtuxState"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesDetailFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated, FuturesDetailScreenCallbacks {
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    public LadderFtuxManager ladderFtuxManager;
    public PictureInPictureStore pipSupportStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesDetailDuxo.class);

    /* renamed from: chartDuxo$delegate, reason: from kotlin metadata */
    private final Lazy chartDuxo = DuxosKt.duxo(this, FuturesDetailChartDuxo.class);
    private final boolean childFragmentsShouldNotConfigureToolbar = true;
    private final boolean hasBottomBar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(FuturesDetailFragment futuresDetailFragment, int i, Composer composer, int i2) {
        futuresDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onTradeBarExpanded(boolean z) {
        FuturesDetailScreenCallbacks.DefaultImpls.onTradeBarExpanded(this, z);
    }

    public final PictureInPictureStore getPipSupportStore() {
        PictureInPictureStore pictureInPictureStore = this.pipSupportStore;
        if (pictureInPictureStore != null) {
            return pictureInPictureStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pipSupportStore");
        return null;
    }

    public final void setPipSupportStore(PictureInPictureStore pictureInPictureStore) {
        Intrinsics.checkNotNullParameter(pictureInPictureStore, "<set-?>");
        this.pipSupportStore = pictureInPictureStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        String str;
        Screen.Name name = Screen.Name.FUTURES_DETAIL_SCREEN;
        FuturesDetailFragmentKey futuresDetailFragmentKey = (FuturesDetailFragmentKey) INSTANCE.getArgs((Fragment) this);
        if (futuresDetailFragmentKey instanceof FuturesDetailFragmentKey.ByContractId) {
            str = "contractId: " + ((FuturesDetailFragmentKey.ByContractId) futuresDetailFragmentKey).getFuturesContractId();
        } else {
            if (!(futuresDetailFragmentKey instanceof FuturesDetailFragmentKey.ByProductId)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "productId: " + ((FuturesDetailFragmentKey.ByProductId) futuresDetailFragmentKey).getFuturesProductId();
        }
        return new Screen(name, null, str, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        String string2;
        UUID futuresContractId;
        Companion companion = INSTANCE;
        Parcelable args = companion.getArgs((Fragment) this);
        FuturesDetailFragmentKey.ByContractId byContractId = args instanceof FuturesDetailFragmentKey.ByContractId ? (FuturesDetailFragmentKey.ByContractId) args : null;
        if (byContractId == null || (futuresContractId = byContractId.getFuturesContractId()) == null || (string2 = futuresContractId.toString()) == null) {
            string2 = "";
        }
        FuturesContractContext futuresContractContext = new FuturesContractContext(string2, null, null, null, 14, null);
        Screen sourceScreen = ((FuturesDetailFragmentKey) companion.getArgs((Fragment) this)).getSourceScreen();
        String entryPoint = ((FuturesDetailFragmentKey) companion.getArgs((Fragment) this)).getEntryPoint();
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, entryPoint == null ? "" : entryPoint, null, sourceScreen, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, futuresContractContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5121, -1, -1, -1, -1, -17, 16383, null);
    }

    private final FuturesDetailDuxo getDuxo() {
        return (FuturesDetailDuxo) this.duxo.getValue();
    }

    private final FuturesDetailChartDuxo getChartDuxo() {
        return (FuturesDetailChartDuxo) this.chartDuxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    public final LadderFtuxManager getLadderFtuxManager() {
        LadderFtuxManager ladderFtuxManager = this.ladderFtuxManager;
        if (ladderFtuxManager != null) {
            return ladderFtuxManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ladderFtuxManager");
        return null;
    }

    public final void setLadderFtuxManager(LadderFtuxManager ladderFtuxManager) {
        Intrinsics.checkNotNullParameter(ladderFtuxManager, "<set-?>");
        this.ladderFtuxManager = ladderFtuxManager;
    }

    private static final FuturesDetailViewState ComposeContent$lambda$0(SnapshotState4<FuturesDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final FuturesDetailChartViewState ComposeContent$lambda$1(SnapshotState4<FuturesDetailChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean ComposeContent$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ComposeContent$lambda$7(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("quickAddFragment");
        if (fragmentFindFragmentByTag instanceof CuratedListQuickAddFragment) {
            return (CuratedListQuickAddFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ensureCuratedListQuickAddFragment();
    }

    private final void ensureCuratedListQuickAddFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (getCuratedListQuickAddFragment() != null || childFragmentManager.isStateSaved()) {
            return;
        }
        childFragmentManager.beginTransaction().add(CuratedListQuickAddFragment.Companion.newInstance$default(CuratedListQuickAddFragment.INSTANCE, false, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), 1, null), "quickAddFragment").commit();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-869352354);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-869352354, i2, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailFragment.ComposeContent (FuturesDetailFragment.kt:105)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getChartDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(FuturesDetailFragment.ComposeContent$lambda$6$lambda$5(snapshotState4CollectAsStateWithLifecycle, snapshotState4CollectAsStateWithLifecycle2));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FuturesDetailFragment2(snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            FuturesDetailScreenKt.FuturesDetailScreen(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2).isContinuousChart(), ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2).getThemeDirection(), ComposeContent$lambda$3(snapshotState) && ComposeContent$lambda$7(snapshotState4), this, getChartDuxo(), composer2, (i2 << 12) & 57344);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesDetailFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeContent$lambda$6$lambda$5(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42) {
        return FuturesDetailScreenKt.showLoadingForDetailScreen(ComposeContent$lambda$0(snapshotState4), ComposeContent$lambda$1(snapshotState42));
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void showPictureInPicture(UUID contractId, boolean isContinuous) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        getPipSupportStore().launchPipMode(requireBaseActivity(), new PictureInPictureKey.FuturesOutright(contractId, isContinuous));
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void setSelectedContractId(UUID contractId, FuturesDetailChartDuxo4 viewMode) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        getChartDuxo().setSelectedContractId(contractId, viewMode);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onBackClicked() {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            baseActivity.onBackPressed();
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void addToWatchlist(boolean isContractInUserLists, FuturesContract futuresContract) {
        Intrinsics.checkNotNullParameter(futuresContract, "futuresContract");
        CuratedListQuickAddFragment curatedListQuickAddFragment = getCuratedListQuickAddFragment();
        Intrinsics.checkNotNull(curatedListQuickAddFragment);
        curatedListQuickAddFragment.addSelectedItemToCuratedList(isContractInUserLists, futuresContract);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void exitFtux() {
        getDuxo().exitFtux();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void navigateToOnboarding(UUID contractId, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(side, "side");
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new FuturesOnboardingActivityKey("FUTURES_DETAIL_SCREEN", false, contractId != null ? new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToFuturesOrderForm(contractId, side, null, false, 12, null) : null, 2, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onOpenContractsSelector() {
        getDuxo().onOpenContractSelector();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractSelected(UUID contractId, boolean isViewingProductOnly) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        getDuxo().onContractSelected(contractId, isViewingProductOnly);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractSelectorDismissed() {
        getDuxo().onContractSelectorDismissed();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void prefetchLadderFtuxLottieIfNeeded(boolean isTradeBarExpanded) {
        if (isTradeBarExpanded) {
            getLadderFtuxManager().prefetchFirstLottie(getContext(), DayNightChanges.isDay(getScarletManager()));
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void hideLadderButtonTooltip() {
        getDuxo().hideLadderButtonTooltip();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractTradeLadderClicked(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        android.content.Context context = getContext();
        if (context != null) {
            getDuxo().onContractTradeLadderClicked(context, contractId);
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onContractTradeOrderFormClicked(UUID contractId, FuturesOrderSide side) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(side, "side");
        android.content.Context context = getContext();
        if (context != null) {
            getDuxo().onContractTradeOrderFormClicked(context, contractId, side);
        }
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onError(Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        getActivityErrorHandler().accept(t);
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void goToNextFtuxState() {
        getDuxo().goToNextFtuxState();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void goToPreviousFtuxState() {
        getDuxo().goToPreviousFtuxState();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onFlattenClick() {
        getDuxo().onFlattenOrders();
    }

    @Override // com.robinhood.android.futures.detail.p140ui.FuturesDetailScreenCallbacks
    public void onOpenAdvancedChart(UUID contractId) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        android.content.Context context = getContext();
        if (context != null) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), context, new BlackWidowAdvancedChartFragmentKey(contractId, BlackWidowAdvancedChartFragmentKey2.FUTURES_CONTRACT, "fdp", false, 8, null), false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    /* compiled from: FuturesDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/FuturesDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/futures/detail/ui/FuturesDetailFragment;", "Lcom/robinhood/android/futures/contracts/FuturesDetailFragmentKey;", "<init>", "()V", "QUICK_ADD_TAG", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<FuturesDetailFragment, FuturesDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(FuturesDetailFragmentKey futuresDetailFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, futuresDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public FuturesDetailFragmentKey getArgs(FuturesDetailFragment futuresDetailFragment) {
            return (FuturesDetailFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, futuresDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FuturesDetailFragment newInstance(FuturesDetailFragmentKey futuresDetailFragmentKey) {
            return (FuturesDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, futuresDetailFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FuturesDetailFragment futuresDetailFragment, FuturesDetailFragmentKey futuresDetailFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, futuresDetailFragment, futuresDetailFragmentKey);
        }
    }
}
