package com.robinhood.android.gold.hub.boost;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.history.p082ui.HistoryRow3;
import com.robinhood.android.common.history.p082ui.HistoryRowCallbackExtensions;
import com.robinhood.android.common.history.p082ui.HistoryRowsCallbacks;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.gold.contracts.GoldDepositBoostHubFragmentKey;
import com.robinhood.android.gold.contracts.GoldHubFragmentKey4;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment;
import com.robinhood.android.gold.hub.boost.GoldDepositBoostHubViewState;
import com.robinhood.android.gold.lib.hub.api.GoldDepositBoostHubPayoutSection;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.GoldDepositBoostHubAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: GoldDepositBoostHubFragment.kt */
@Metadata(m3635d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002*\u0001\u001f\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\r\u0010%\u001a\u00020\"H\u0017¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0017H\u0002J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0019H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 ¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "duxo", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "depositHubActionHandler", "Lcom/robinhood/models/serverdriven/experimental/api/GoldDepositBoostHubAction;", "toolbarVisible", "", "getToolbarVisible", "()Z", "historyRowsCallbacks", "com/robinhood/android/gold/hub/boost/GoldDepositBoostHubFragment$historyRowsCallbacks$1", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubFragment$historyRowsCallbacks$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onAction", "action", "onDepositHubAction", "Companion", "feature-gold-hub_externalDebug", "viewState", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldDepositBoostHubFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public HistoryNavigator historyNavigator;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldDepositBoostHubDuxo.class);
    private final SduiActionHandler<GenericAction> actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$actionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(GenericAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return this.this$0.onAction(action);
        }
    };
    private final SduiActionHandler<GoldDepositBoostHubAction> depositHubActionHandler = new SduiActionHandler() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$depositHubActionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(GoldDepositBoostHubAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return this.this$0.onDepositHubAction(action);
        }
    };
    private final GoldDepositBoostHubFragment5 historyRowsCallbacks = new HistoryRowsCallbacks() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$historyRowsCallbacks$1
        @Override // com.robinhood.android.common.history.p082ui.HistoryRowsCallbacks
        public void onShowAllHistoryClicked() {
            Navigator navigator = this.this$0.getNavigator();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.GOLD_DEPOSIT_BOOST, null, null, false, null, 61, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }

        @Override // com.robinhood.android.common.history.p082ui.HistoryRow2
        public void onHistoryRowClicked(HistoryRow3 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Navigator navigator = this.this$0.getNavigator();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            HistoryNavigator historyNavigator = this.this$0.getHistoryNavigator();
            FragmentManager parentFragmentManager = this.this$0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            HistoryRowCallbackExtensions.handleHistoryRowClick$default(navigator, contextRequireContext, historyNavigator, parentFragmentManager, event, null, 16, null);
        }
    };

    /* compiled from: GoldDepositBoostHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(GoldDepositBoostHubFragment goldDepositBoostHubFragment, int i, Composer composer, int i2) {
        goldDepositBoostHubFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoldDepositBoostHubDuxo getDuxo() {
        return (GoldDepositBoostHubDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.NAME_UNSPECIFIED, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String tab = ((GoldDepositBoostHubFragmentKey) INSTANCE.getArgs((Fragment) this)).getTab();
        if (tab != null) {
            getDuxo().setInitialTab(GoldDepositBoostTab.INSTANCE.fromString(tab));
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(365300675);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(365300675, i2, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment.ComposeContent (GoldDepositBoostHubFragment.kt:77)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(-1793489035, true, new C178021(SnapshotStateKt.collectAsState(getDuxo().getStateFlow(), null, composerStartRestartGroup, 0, 1)), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDepositBoostHubFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldDepositBoostHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$ComposeContent$1 */
    static final class C178021 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<GoldDepositBoostHubViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C178021(SnapshotState4<? extends GoldDepositBoostHubViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(-1793489035, i, -1, "com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment.ComposeContent.<anonymous> (GoldDepositBoostHubFragment.kt:80)");
            }
            GoldDepositBoostHubViewState goldDepositBoostHubViewStateComposeContent$lambda$1 = GoldDepositBoostHubFragment.ComposeContent$lambda$1(this.$viewState$delegate);
            SduiActionHandler sduiActionHandler = GoldDepositBoostHubFragment.this.actionHandler;
            SduiActionHandler sduiActionHandler2 = GoldDepositBoostHubFragment.this.depositHubActionHandler;
            GoldDepositBoostHubFragment5 goldDepositBoostHubFragment5 = GoldDepositBoostHubFragment.this.historyRowsCallbacks;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(GoldDepositBoostHubFragment.this);
            final GoldDepositBoostHubFragment goldDepositBoostHubFragment = GoldDepositBoostHubFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.hub.boost.GoldDepositBoostHubFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldDepositBoostHubFragment.C178021.invoke$lambda$1$lambda$0(goldDepositBoostHubFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            GoldDepositBoostHubDuxo duxo = GoldDepositBoostHubFragment.this.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(duxo);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GoldDepositBoostHubFragment2(duxo);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GoldDepositBoostHubComposableKt.GoldDepositBoostHubComposable(goldDepositBoostHubViewStateComposeContent$lambda$1, sduiActionHandler, sduiActionHandler2, goldDepositBoostHubFragment5, function0, (Function1) ((KFunction) objRememberedValue2), null, composer, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GoldDepositBoostHubFragment goldDepositBoostHubFragment) {
            goldDepositBoostHubFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoldDepositBoostHubViewState ComposeContent$lambda$1(SnapshotState4<? extends GoldDepositBoostHubViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onAction(GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            return true;
        }
        if (action instanceof GenericAction.InfoAlert) {
            GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
            int i = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            sduiAlert.presentGenericAlertSheet(parentFragmentManager, infoAlert.getValue2().getAlert());
            return true;
        }
        if (!(action instanceof GenericAction.Dismiss)) {
            return false;
        }
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onDepositHubAction(GoldDepositBoostHubAction action) {
        GoldDepositBoostHubPayoutSection allPayoutsForCurrTab;
        if (!(action instanceof GoldDepositBoostHubAction.GoldDepositBoostUpcomingPayouts)) {
            return false;
        }
        GoldDepositBoostHubViewState value = getDuxo().getStateFlow().getValue();
        if (!(value instanceof GoldDepositBoostHubViewState.Loaded) || (allPayoutsForCurrTab = ((GoldDepositBoostHubViewState.Loaded) value).getAllPayoutsForCurrTab()) == null) {
            return true;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new GoldHubFragmentKey4(allPayoutsForCurrTab), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return true;
    }

    /* compiled from: GoldDepositBoostHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostHubFragment;", "Lcom/robinhood/android/gold/contracts/GoldDepositBoostHubFragmentKey;", "<init>", "()V", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<GoldDepositBoostHubFragment, GoldDepositBoostHubFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldDepositBoostHubFragmentKey goldDepositBoostHubFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, goldDepositBoostHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldDepositBoostHubFragmentKey getArgs(GoldDepositBoostHubFragment goldDepositBoostHubFragment) {
            return (GoldDepositBoostHubFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, goldDepositBoostHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldDepositBoostHubFragment newInstance(GoldDepositBoostHubFragmentKey goldDepositBoostHubFragmentKey) {
            return (GoldDepositBoostHubFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, goldDepositBoostHubFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldDepositBoostHubFragment goldDepositBoostHubFragment, GoldDepositBoostHubFragmentKey goldDepositBoostHubFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, goldDepositBoostHubFragment, goldDepositBoostHubFragmentKey);
        }
    }
}
