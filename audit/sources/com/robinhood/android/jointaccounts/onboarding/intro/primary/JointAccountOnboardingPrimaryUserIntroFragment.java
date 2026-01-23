package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import android.content.Context;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingPrimaryIntro;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabEmbeddedListStateProvider;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JointAccountOnboardingPrimaryUserIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u001a2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\t\u0010\"\u001a\u00020\u0013H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountOnboardingPrimaryUserIntroFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/PrimaryUserIntroScreenCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "shouldClearTop", "getShouldClearTop", "()Ljava/lang/Boolean;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onContinueClick", "ineligibleBottomSheet", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onExitClick", "onTryAgainClick", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountOnboardingPrimaryUserIntroFragment extends GenericActionHandlingFragment implements PrimaryUserIntroScreenCallbacks, RegionGated {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, JointAccountPrimaryIntroDuxo.class);
    private final boolean shouldClearTop;
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(JointAccountOnboardingPrimaryUserIntroFragment jointAccountOnboardingPrimaryUserIntroFragment, int i, Composer composer, int i2) {
        jointAccountOnboardingPrimaryUserIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final JointAccountPrimaryIntroDuxo getDuxo() {
        return (JointAccountPrimaryIntroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment
    public Boolean getShouldClearTop() {
        return Boolean.valueOf(this.shouldClearTop);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(857250096);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(857250096, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent (JointAccountOnboardingPrimaryUserIntroFragment.kt:40)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AccountTabEmbeddedListStateProvider.AccountTabEmbeddedListStateProvider(this, ((JointAccountOnboardingPrimaryIntro) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs(), (ScrollState) null, ComposableLambda3.rememberComposableLambda(-989036066, true, new Function4<ScrollState, NestedScrollModifier, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(ScrollState scrollState, NestedScrollModifier nestedScrollModifier, Composer composer2, Integer num) {
                    invoke(scrollState, nestedScrollModifier, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(final ScrollState scrollState, final NestedScrollModifier nestedScrollModifier, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(scrollState, "scrollState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-989036066, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent.<anonymous> (JointAccountOnboardingPrimaryUserIntroFragment.kt:47)");
                    }
                    final JointAccountOnboardingPrimaryUserIntroFragment jointAccountOnboardingPrimaryUserIntroFragment = JointAccountOnboardingPrimaryUserIntroFragment.this;
                    final SnapshotState4<JointAccountPrimaryIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1092988365, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1092988365, i4, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroFragment.kt:48)");
                            }
                            final JointAccountOnboardingPrimaryUserIntroFragment jointAccountOnboardingPrimaryUserIntroFragment2 = jointAccountOnboardingPrimaryUserIntroFragment;
                            final NestedScrollModifier nestedScrollModifier2 = nestedScrollModifier;
                            final ScrollState scrollState2 = scrollState;
                            final SnapshotState4<JointAccountPrimaryIntroViewState> snapshotState42 = snapshotState4;
                            ActionHandlingFragment2.ContentWithDialog(jointAccountOnboardingPrimaryUserIntroFragment2, ComposableLambda3.rememberComposableLambda(-126123817, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i5) {
                                    Modifier modifierNestedScroll$default;
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-126123817, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroFragment.kt:49)");
                                    }
                                    JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewStateComposeContent$lambda$0 = JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent$lambda$0(snapshotState42);
                                    AccountSelectorTabArgs accountSelectorTabArgs = ((JointAccountOnboardingPrimaryIntro) JointAccountOnboardingPrimaryUserIntroFragment.INSTANCE.getArgs((Fragment) jointAccountOnboardingPrimaryUserIntroFragment2)).getAccountSelectorTabArgs();
                                    boolean z = accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded();
                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    NestedScrollModifier nestedScrollModifier3 = nestedScrollModifier2;
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen(jointAccountPrimaryIntroViewStateComposeContent$lambda$0, jointAccountOnboardingPrimaryUserIntroFragment2, (nestedScrollModifier3 == null || (modifierNestedScroll$default = NestedScrollModifier7.nestedScroll$default(modifierFillMaxSize$default, nestedScrollModifier3, null, 2, null)) == null) ? modifierFillMaxSize$default : modifierNestedScroll$default, scrollState2, z, composer4, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 3072, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountOnboardingPrimaryUserIntroFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreenCallbacks
    public void onContinueClick(AlertAction<? extends GenericAction> ineligibleBottomSheet) {
        if (ineligibleBottomSheet != null) {
            ActionHandlingFragment.handleAlert$default(this, ineligibleBottomSheet, null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey("joint_account_primary_onboarding", false, null, null, null, null, false, null, null, 510, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreenCallbacks
    public void onExitClick() {
        getUserLeapManager().setPendingSurvey(Survey.JOINT_ACCOUNTS_PRIMARY_VALUE_PROPS_EXIT);
        requireActivity().finish();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreenCallbacks
    public void onTryAgainClick() {
        getDuxo().retryFetchingData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JointAccountPrimaryIntroViewState ComposeContent$lambda$0(SnapshotState4<? extends JointAccountPrimaryIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: JointAccountOnboardingPrimaryUserIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountOnboardingPrimaryUserIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountOnboardingPrimaryUserIntroFragment;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingPrimaryIntro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<JointAccountOnboardingPrimaryUserIntroFragment, JointAccountOnboardingPrimaryIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(JointAccountOnboardingPrimaryIntro jointAccountOnboardingPrimaryIntro) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, jointAccountOnboardingPrimaryIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public JointAccountOnboardingPrimaryIntro getArgs(JointAccountOnboardingPrimaryUserIntroFragment jointAccountOnboardingPrimaryUserIntroFragment) {
            return (JointAccountOnboardingPrimaryIntro) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, jointAccountOnboardingPrimaryUserIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public JointAccountOnboardingPrimaryUserIntroFragment newInstance(JointAccountOnboardingPrimaryIntro jointAccountOnboardingPrimaryIntro) {
            return (JointAccountOnboardingPrimaryUserIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, jointAccountOnboardingPrimaryIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(JointAccountOnboardingPrimaryUserIntroFragment jointAccountOnboardingPrimaryUserIntroFragment, JointAccountOnboardingPrimaryIntro jointAccountOnboardingPrimaryIntro) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, jointAccountOnboardingPrimaryUserIntroFragment, jointAccountOnboardingPrimaryIntro);
        }
    }
}
