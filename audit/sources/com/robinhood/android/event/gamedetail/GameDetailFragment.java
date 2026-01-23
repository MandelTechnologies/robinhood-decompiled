package com.robinhood.android.event.gamedetail;

import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.event.gamedetail.GameDetailFragment;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks;
import com.robinhood.android.event.gamedetail.p130ui.GameDetailScreen;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventAttestationFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventContractConstants;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityResultContract;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import com.robinhood.android.eventcontracts.contracts.GameDetailFragmentKeyInternalOnly;
import com.robinhood.android.futures.contracts.FuturesOnboardingActivityKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.regiongate.EventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import com.robinhood.shared.pictureinpicture.pipsupport.PictureInPictureStore;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GameDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002DEB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010)\u001a\u00020*H\u0017¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020.H\u0016J&\u0010/\u001a\u00020*2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u000201032\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020*H\u0016J\u0012\u00107\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010<\u001a\u00020*2\u0006\u00100\u001a\u000201H\u0016J\b\u0010=\u001a\u00020*H\u0016J\t\u0010>\u001a\u00020\u0014H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR/\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020' (*\n\u0012\u0004\u0012\u00020'\u0018\u00010&0&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/event/gamedetail/callbacks/GameDetailScreenCallbacks;", "<init>", "()V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "pipSupportStore", "Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "getPipSupportStore", "()Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;", "setPipSupportStore", "(Lcom/robinhood/shared/pictureinpicture/pipsupport/PictureInPictureStore;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "<set-?>", "Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;", "orderSubmittedEvent", "getOrderSubmittedEvent", "()Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;", "setOrderSubmittedEvent", "(Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;)V", "orderSubmittedEvent$delegate", "Landroidx/compose/runtime/MutableState;", "eventTradeLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityKey;", "kotlin.jvm.PlatformType", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStartTrade", "orderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "onStartPipMode", "eventId", "Ljava/util/UUID;", "contractIds", "", "span", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "onEventFaqClick", "onStartOnboarding", "onShowAttestation", "attestationType", "", "redirectOrderContext", "onPollBottomSheet", "onComingBackFromOrderSubmittedHandled", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "OrderSubmittedEvent", "Companion", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class GameDetailFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment, GameDetailScreenCallbacks {
    public CrossSellLaunchManager crossSellLaunchManager;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EventTradeActivityKey>> eventTradeLauncher;
    public PictureInPictureStore pipSupportStore;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(EventContractsRegionGate.INSTANCE);

    /* renamed from: orderSubmittedEvent$delegate, reason: from kotlin metadata */
    private final SnapshotState orderSubmittedEvent = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* compiled from: GameDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcUuidType.values().length];
            try {
                iArr[EcUuidType.EVENT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EcUuidType.CONTRACT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(GameDetailFragment gameDetailFragment, int i, Composer composer, int i2) {
        gameDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public GameDetailFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<EventTradeActivityKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new EventTradeActivityResultContract(new Function0() { // from class: com.robinhood.android.event.gamedetail.GameDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.android.event.gamedetail.GameDetailFragment$eventTradeLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(EventTradeActivityResultContract.Result result) {
                if (result != null) {
                    this.this$0.setOrderSubmittedEvent(new GameDetailFragment.OrderSubmittedEvent(result));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.eventTradeLauncher = activityResultLauncherRegisterForActivityResult;
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
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        String str;
        Screen.Name name = Screen.Name.GAME_DETAIL_PAGE;
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((GameDetailFragmentKeyInternalOnly) companion.getArgs((Fragment) this)).getType().ordinal()];
        if (i == 1) {
            str = "EventId: " + ((GameDetailFragmentKeyInternalOnly) companion.getArgs((Fragment) this)).getId();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ContractId: " + ((GameDetailFragmentKeyInternalOnly) companion.getArgs((Fragment) this)).getId();
        }
        return new Screen(name, null, str, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final OrderSubmittedEvent getOrderSubmittedEvent() {
        return (OrderSubmittedEvent) this.orderSubmittedEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOrderSubmittedEvent(OrderSubmittedEvent orderSubmittedEvent) {
        this.orderSubmittedEvent.setValue(orderSubmittedEvent);
    }

    /* compiled from: GameDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.event.gamedetail.GameDetailFragment$ComposeContent$1 */
    static final class C162811 implements Function2<Composer, Integer, Unit> {
        C162811() {
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
                ComposerKt.traceEventStart(1809577295, i, -1, "com.robinhood.android.event.gamedetail.GameDetailFragment.ComposeContent.<anonymous> (GameDetailFragment.kt:69)");
            }
            GameDetailFragment gameDetailFragment = GameDetailFragment.this;
            OrderSubmittedEvent orderSubmittedEvent = gameDetailFragment.getOrderSubmittedEvent();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(GameDetailFragment.this);
            final GameDetailFragment gameDetailFragment2 = GameDetailFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.GameDetailFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GameDetailFragment.C162811.invoke$lambda$1$lambda$0(gameDetailFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GameDetailScreen.GameDetailScreen(gameDetailFragment, orderSubmittedEvent, (Function0) objRememberedValue, WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GameDetailFragment gameDetailFragment) {
            BaseActivity baseActivity = gameDetailFragment.getBaseActivity();
            if (baseActivity != null) {
                baseActivity.onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1315810108);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1315810108, i2, -1, "com.robinhood.android.event.gamedetail.GameDetailFragment.ComposeContent (GameDetailFragment.kt:67)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1809577295, true, new C162811(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.GameDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartTrade(EventTradeOrderContext orderContext) {
        Intrinsics.checkNotNullParameter(orderContext, "orderContext");
        NavigationActivityResultContract3.launch$default(this.eventTradeLauncher, new EventTradeActivityKey(orderContext, getEventScreen(), "GAME_DETAIL_PAGE"), null, false, 6, null);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartPipMode(UUID eventId, List<UUID> contractIds, DisplaySpan span) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(contractIds, "contractIds");
        Intrinsics.checkNotNullParameter(span, "span");
        getPipSupportStore().launchPipMode(requireBaseActivity(), new PictureInPictureKey.Event(eventId, contractIds, span));
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onEventFaqClick() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new OtherMarkdownFragmentKey(EventContractConstants.EDP_FAQ_CONTENTFUL_ID, null, null, 6, null), false, true, false, false, null, false, null, null, 1012, null);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onStartOnboarding(UUID eventId) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        Navigator.DefaultImpls.startActivity$default(getNavigator(), context, new FuturesOnboardingActivityKey("GAME_DETAIL_PAGE", true, eventId != null ? new FuturesOnboardingActivityKey.PostOnboardingNavigation.RouteToEdpByEventId(eventId) : null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onShowAttestation(String attestationType, EventTradeOrderContext redirectOrderContext) {
        Intrinsics.checkNotNullParameter(attestationType, "attestationType");
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), context, new EventAttestationFragmentKey(attestationType, redirectOrderContext), false, false, false, false, null, false, null, null, 1020, null);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onPollBottomSheet(UUID eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, IacAlertSheetLocation.EVENT_CONTRACT_EVENT_DETAIL_PAGE, null, null, null, null, null, eventId, ((GameDetailFragmentKeyInternalOnly) INSTANCE.getArgs((Fragment) this)).getEntryPoint(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
    }

    @Override // com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks
    public void onComingBackFromOrderSubmittedHandled() {
        setOrderSubmittedEvent(null);
    }

    /* compiled from: GameDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailFragment$OrderSubmittedEvent;", "", "result", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result;", "<init>", "(Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result;)V", "getResult", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityResultContract$Result;", "consumed", "", "consume", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OrderSubmittedEvent {
        public static final int $stable = 8;
        private boolean consumed;
        private final EventTradeActivityResultContract.Result result;

        public OrderSubmittedEvent(EventTradeActivityResultContract.Result result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public final EventTradeActivityResultContract.Result getResult() {
            return this.result;
        }

        public final boolean consume() {
            if (this.consumed) {
                return false;
            }
            this.consumed = true;
            return true;
        }
    }

    /* compiled from: GameDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/GameDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/event/gamedetail/GameDetailFragment;", "Lcom/robinhood/android/eventcontracts/contracts/GameDetailFragmentKeyInternalOnly;", "<init>", "()V", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<GameDetailFragment, GameDetailFragmentKeyInternalOnly> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GameDetailFragmentKeyInternalOnly gameDetailFragmentKeyInternalOnly) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, gameDetailFragmentKeyInternalOnly);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GameDetailFragmentKeyInternalOnly getArgs(GameDetailFragment gameDetailFragment) {
            return (GameDetailFragmentKeyInternalOnly) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, gameDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GameDetailFragment newInstance(GameDetailFragmentKeyInternalOnly gameDetailFragmentKeyInternalOnly) {
            return (GameDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, gameDetailFragmentKeyInternalOnly);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GameDetailFragment gameDetailFragment, GameDetailFragmentKeyInternalOnly gameDetailFragmentKeyInternalOnly) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, gameDetailFragment, gameDetailFragmentKeyInternalOnly);
        }
    }
}
