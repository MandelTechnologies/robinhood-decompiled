package com.robinhood.android.jointaccounts.onboarding.outro.secondary;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.account.contracts.jointaccounts.JointAccountOnboardingSecondaryOutro;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable3;
import com.robinhood.android.jointaccounts.onboarding.UtilsKt;
import com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen;
import com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen2;
import com.robinhood.android.jointaccounts.onboarding.creation.InvitationState;
import com.robinhood.android.jointaccounts.onboarding.creation.JointAccountCreatedViewState;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.JointAccountsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JointAccountOnboardingSecondaryOutroFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0012\u001a\u00020\u0013H\u0017¢\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\t\u0010\u001e\u001a\u00020\u0007H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/jointaccounts/onboarding/creation/AccountCreationScreenCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDuxo;", "getDuxo", "()Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onContinueClicked", "invitationState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;", "deeplinkTemplate", "", "onRetryFetchingAccountClicked", "onRetryInitializationClicked", "onContactSupportClicked", "onCloseClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-joint-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/JointAccountCreatedViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountOnboardingSecondaryOutroFragment extends GenericComposeFragment implements RegionGated, AccountCreationScreen {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean toolbarVisible;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(JointAccountsRegionGate.INSTANCE);
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, JointAccountOnboardingSecondaryOutroDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(JointAccountOnboardingSecondaryOutroFragment jointAccountOnboardingSecondaryOutroFragment, int i, Composer composer, int i2) {
        jointAccountOnboardingSecondaryOutroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final JointAccountOnboardingSecondaryOutroDuxo getDuxo() {
        return (JointAccountOnboardingSecondaryOutroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2023171073);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2023171073, i2, -1, "com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroFragment.ComposeContent (JointAccountOnboardingSecondaryOutroFragment.kt:30)");
            }
            AccountCreationScreen2.AccountCreationScreen(ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), this, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.outro.secondary.JointAccountOnboardingSecondaryOutroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountOnboardingSecondaryOutroFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onContinueClicked(InvitationState invitationState, String deeplinkTemplate) {
        Intrinsics.checkNotNullParameter(invitationState, "invitationState");
        if (invitationState instanceof InvitationState.Complete) {
            String strApplyAccountNumberTemplate = deeplinkTemplate != null ? UtilsKt.applyAccountNumberTemplate(deeplinkTemplate, ((InvitationState.Complete) invitationState).getAccountNumber()) : null;
            if (strApplyAccountNumberTemplate != null) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(strApplyAccountNumberTemplate), null, null, false, null, 60, null);
            }
            requireBaseActivity().finish();
            return;
        }
        if (!(invitationState instanceof InvitationState.Incomplete)) {
            throw new NoWhenBranchMatchedException();
        }
        requireBaseActivity().finish();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onRetryFetchingAccountClicked() {
        getDuxo().retryFetchAccount();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onRetryInitializationClicked() {
        getDuxo().fetchOutro();
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onContactSupportClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(IsaTransferDetailComposable3.CONTACT_SUPPORT_DEEPLINK), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreen
    public void onCloseClicked() {
        requireBaseActivity().finish();
    }

    /* compiled from: JointAccountOnboardingSecondaryOutroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/jointaccounts/onboarding/outro/secondary/JointAccountOnboardingSecondaryOutroFragment;", "Lcom/robinhood/android/account/contracts/jointaccounts/JointAccountOnboardingSecondaryOutro;", "<init>", "()V", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<JointAccountOnboardingSecondaryOutroFragment, JointAccountOnboardingSecondaryOutro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(JointAccountOnboardingSecondaryOutro jointAccountOnboardingSecondaryOutro) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, jointAccountOnboardingSecondaryOutro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public JointAccountOnboardingSecondaryOutro getArgs(JointAccountOnboardingSecondaryOutroFragment jointAccountOnboardingSecondaryOutroFragment) {
            return (JointAccountOnboardingSecondaryOutro) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, jointAccountOnboardingSecondaryOutroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public JointAccountOnboardingSecondaryOutroFragment newInstance(JointAccountOnboardingSecondaryOutro jointAccountOnboardingSecondaryOutro) {
            return (JointAccountOnboardingSecondaryOutroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, jointAccountOnboardingSecondaryOutro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(JointAccountOnboardingSecondaryOutroFragment jointAccountOnboardingSecondaryOutroFragment, JointAccountOnboardingSecondaryOutro jointAccountOnboardingSecondaryOutro) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, jointAccountOnboardingSecondaryOutroFragment, jointAccountOnboardingSecondaryOutro);
        }
    }

    private static final JointAccountCreatedViewState ComposeContent$lambda$0(SnapshotState4<? extends JointAccountCreatedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
