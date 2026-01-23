package com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated;

import android.content.Context;
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
import com.robinhood.android.account.contracts.jointaccounts.LoggedInJointAccountOnboardingSecondaryIntro;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.GenericSdFlowIntentKey;
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
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\t\u0010\u001f\u001a\u00020\rH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryUserIntroScreenCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountSecondaryIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onExitClick", "onContinueClick", "ineligibleBottomSheet", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onTryAgainClick", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment extends GenericActionHandlingFragment implements JointAccountOnboardingSecondaryUserIntroScreen5, RegionGated {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AuthenticatedJointAccountSecondaryIntroDuxo.class);
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment authenticatedJointAccountOnboardingSecondaryUserIntroFragment, int i, Composer composer, int i2) {
        authenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final AuthenticatedJointAccountSecondaryIntroDuxo getDuxo() {
        return (AuthenticatedJointAccountSecondaryIntroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1114221071);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1114221071, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent (AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.kt:36)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(882394108, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(882394108, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent.<anonymous> (AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.kt:39)");
                    }
                    final AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment authenticatedJointAccountOnboardingSecondaryUserIntroFragment = AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.this;
                    final SnapshotState4<JointAccountSecondaryIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ActionHandlingFragment2.ContentWithDialog(authenticatedJointAccountOnboardingSecondaryUserIntroFragment, ComposableLambda3.rememberComposableLambda(-1021512488, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(-1021512488, i4, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent.<anonymous>.<anonymous> (AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.kt:40)");
                            }
                            JointAccountOnboardingSecondaryUserIntroScreen.SecondaryUserIntroScreen(AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent$lambda$0(snapshotState4), authenticatedJointAccountOnboardingSecondaryUserIntroFragment, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.authenticated.AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5
    public void onExitClick() {
        getUserLeapManager().setPendingSurvey(Survey.JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT);
        requireActivity().finish();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5
    public void onContinueClick(AlertAction<? extends GenericAction> ineligibleBottomSheet) {
        if (ineligibleBottomSheet != null) {
            ActionHandlingFragment.handleAlert$default(this, ineligibleBottomSheet, null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            return;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GenericSdFlowIntentKey("joint_account_secondary_onboarding", false, null, null, MapsKt.mapOf(Tuples4.m3642to("joint_account_invitation_id", ((LoggedInJointAccountOnboardingSecondaryIntro) INSTANCE.getArgs((Fragment) this)).getInvitationId())), null, false, null, null, 494, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5
    public void onTryAgainClick() {
        getDuxo().retryFetchingData();
    }

    /* compiled from: AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/authenticated/AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment;", "Lcom/robinhood/android/account/contracts/jointaccounts/LoggedInJointAccountOnboardingSecondaryIntro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment, LoggedInJointAccountOnboardingSecondaryIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LoggedInJointAccountOnboardingSecondaryIntro loggedInJointAccountOnboardingSecondaryIntro) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, loggedInJointAccountOnboardingSecondaryIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LoggedInJointAccountOnboardingSecondaryIntro getArgs(AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment authenticatedJointAccountOnboardingSecondaryUserIntroFragment) {
            return (LoggedInJointAccountOnboardingSecondaryIntro) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, authenticatedJointAccountOnboardingSecondaryUserIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment newInstance(LoggedInJointAccountOnboardingSecondaryIntro loggedInJointAccountOnboardingSecondaryIntro) {
            return (AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, loggedInJointAccountOnboardingSecondaryIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AuthenticatedJointAccountOnboardingSecondaryUserIntroFragment authenticatedJointAccountOnboardingSecondaryUserIntroFragment, LoggedInJointAccountOnboardingSecondaryIntro loggedInJointAccountOnboardingSecondaryIntro) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, authenticatedJointAccountOnboardingSecondaryUserIntroFragment, loggedInJointAccountOnboardingSecondaryIntro);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JointAccountSecondaryIntroViewState ComposeContent$lambda$0(SnapshotState4<? extends JointAccountSecondaryIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
