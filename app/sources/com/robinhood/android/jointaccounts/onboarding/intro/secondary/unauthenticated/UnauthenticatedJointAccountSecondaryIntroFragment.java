package com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated;

import android.content.Context;
import android.net.Uri;
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
import com.robinhood.android.account.contracts.jointaccounts.UnauthenticatedJointAccountOnboardingSecondaryIntro;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.shared.user.contracts.auth.UserCreation;
import com.robinhood.shared.user.contracts.auth.UserCreationFlow;
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

/* compiled from: UnauthenticatedJointAccountSecondaryIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/unauthenticated/UnauthenticatedJointAccountSecondaryIntroFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/unauthenticated/UnauthenticatedJointAccountSecondaryIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/unauthenticated/UnauthenticatedJointAccountSecondaryIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "userCreationKey", "Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "getUserCreationKey", "()Lcom/robinhood/shared/user/contracts/auth/UserCreation;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UnauthenticatedJointAccountSecondaryIntroFragment extends GenericActionHandlingFragment implements RegionGated {
    private static final String JOINT_ACCOUNT_INVITE_QUERY_PARAM_KEY = "joint_account_invitation_id";
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UnauthenticatedJointAccountSecondaryIntroDuxo.class);
    private final boolean toolbarVisible;
    public SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(UnauthenticatedJointAccountSecondaryIntroFragment unauthenticatedJointAccountSecondaryIntroFragment, int i, Composer composer, int i2) {
        unauthenticatedJointAccountSecondaryIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final UnauthenticatedJointAccountSecondaryIntroDuxo getDuxo() {
        return (UnauthenticatedJointAccountSecondaryIntroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserCreation getUserCreationKey() {
        Companion companion = INSTANCE;
        return new UserCreation(null, null, Uri.parse("robinhood://accept_joint_account_invite?invitation_id=" + ((UnauthenticatedJointAccountOnboardingSecondaryIntro) companion.getArgs((Fragment) this)).getInvitationId()), UserCreationFlow.TRADER, MapsKt.mapOf(Tuples4.m3642to(JOINT_ACCOUNT_INVITE_QUERY_PARAM_KEY, ((UnauthenticatedJointAccountOnboardingSecondaryIntro) companion.getArgs((Fragment) this)).getInvitationId())), false, 35, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1774605110);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1774605110, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent (UnauthenticatedJointAccountSecondaryIntroFragment.kt:53)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(669627669, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(669627669, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent.<anonymous> (UnauthenticatedJointAccountSecondaryIntroFragment.kt:56)");
                    }
                    final UnauthenticatedJointAccountSecondaryIntroFragment unauthenticatedJointAccountSecondaryIntroFragment = UnauthenticatedJointAccountSecondaryIntroFragment.this;
                    final SnapshotState4<JointAccountSecondaryIntroViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    ActionHandlingFragment2.ContentWithDialog(unauthenticatedJointAccountSecondaryIntroFragment, ComposableLambda3.rememberComposableLambda(631927537, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent.1.1
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
                                ComposerKt.traceEventStart(631927537, i4, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent.<anonymous>.<anonymous> (UnauthenticatedJointAccountSecondaryIntroFragment.kt:57)");
                            }
                            JointAccountSecondaryIntroViewState jointAccountSecondaryIntroViewStateComposeContent$lambda$0 = UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent$lambda$0(snapshotState4);
                            final UnauthenticatedJointAccountSecondaryIntroFragment unauthenticatedJointAccountSecondaryIntroFragment2 = unauthenticatedJointAccountSecondaryIntroFragment;
                            JointAccountOnboardingSecondaryUserIntroScreen.SecondaryUserIntroScreen(jointAccountSecondaryIntroViewStateComposeContent$lambda$0, new JointAccountOnboardingSecondaryUserIntroScreen5() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent.1.1.1
                                @Override // com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5
                                public void onExitClick() {
                                    unauthenticatedJointAccountSecondaryIntroFragment2.getUserLeapManager().setPendingSurvey(Survey.JOINT_ACCOUNTS_SECONDARY_VALUE_PROPS_EXIT);
                                    unauthenticatedJointAccountSecondaryIntroFragment2.requireActivity().finish();
                                }

                                @Override // com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5
                                public void onContinueClick(AlertAction<? extends GenericAction> ineligibleBottomSheet) {
                                    Navigator navigator = unauthenticatedJointAccountSecondaryIntroFragment2.getNavigator();
                                    Context contextRequireContext = unauthenticatedJointAccountSecondaryIntroFragment2.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, unauthenticatedJointAccountSecondaryIntroFragment2.getUserCreationKey(), null, false, null, null, 60, null);
                                }

                                @Override // com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen5
                                public void onTryAgainClick() {
                                    unauthenticatedJointAccountSecondaryIntroFragment2.getDuxo().fetchData();
                                }
                            }, composer3, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.unauthenticated.UnauthenticatedJointAccountSecondaryIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnauthenticatedJointAccountSecondaryIntroFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UnauthenticatedJointAccountSecondaryIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/unauthenticated/UnauthenticatedJointAccountSecondaryIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/unauthenticated/UnauthenticatedJointAccountSecondaryIntroFragment;", "Lcom/robinhood/android/account/contracts/jointaccounts/UnauthenticatedJointAccountOnboardingSecondaryIntro;", "<init>", "()V", "JOINT_ACCOUNT_INVITE_QUERY_PARAM_KEY", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UnauthenticatedJointAccountSecondaryIntroFragment, UnauthenticatedJointAccountOnboardingSecondaryIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(UnauthenticatedJointAccountOnboardingSecondaryIntro unauthenticatedJointAccountOnboardingSecondaryIntro) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, unauthenticatedJointAccountOnboardingSecondaryIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UnauthenticatedJointAccountOnboardingSecondaryIntro getArgs(UnauthenticatedJointAccountSecondaryIntroFragment unauthenticatedJointAccountSecondaryIntroFragment) {
            return (UnauthenticatedJointAccountOnboardingSecondaryIntro) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, unauthenticatedJointAccountSecondaryIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UnauthenticatedJointAccountSecondaryIntroFragment newInstance(UnauthenticatedJointAccountOnboardingSecondaryIntro unauthenticatedJointAccountOnboardingSecondaryIntro) {
            return (UnauthenticatedJointAccountSecondaryIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, unauthenticatedJointAccountOnboardingSecondaryIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UnauthenticatedJointAccountSecondaryIntroFragment unauthenticatedJointAccountSecondaryIntroFragment, UnauthenticatedJointAccountOnboardingSecondaryIntro unauthenticatedJointAccountOnboardingSecondaryIntro) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, unauthenticatedJointAccountSecondaryIntroFragment, unauthenticatedJointAccountOnboardingSecondaryIntro);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JointAccountSecondaryIntroViewState ComposeContent$lambda$0(SnapshotState4<? extends JointAccountSecondaryIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
