package com.robinhood.shared.unverifiedaccountrecovery.phone;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.pathfinder.input.FlowState;
import com.robinhood.models.p355ui.pathfinder.contexts.SmsMfaEnrollOtpContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.lib.challenge.BackupCodeVerificationResult;
import com.robinhood.shared.lib.challenge.BackupCodeVerificationResultContract;
import com.robinhood.shared.security.contracts.BackupCodeVerificationInput;
import com.robinhood.shared.security.contracts.BackupCodeVerificationIntentKey;
import com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpViewState;
import com.robinhood.shared.user.contracts.auth.Login;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: PathfinderSmsMfaEnrollOtpFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\r\u0010\u0013\u001a\u00020\u0010H\u0017¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "launchReEnrollment", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationIntentKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "showLoginActivity", "Companion", "feature-unverified-account-recovery_externalDebug", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PathfinderSmsMfaEnrollOtpFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, PathfinderSmsMfaEnrollOtpDuxo.class);
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<BackupCodeVerificationIntentKey>> launchReEnrollment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(PathfinderSmsMfaEnrollOtpFragment pathfinderSmsMfaEnrollOtpFragment, int i, Composer composer, int i2) {
        pathfinderSmsMfaEnrollOtpFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public PathfinderSmsMfaEnrollOtpFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<BackupCodeVerificationIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new BackupCodeVerificationResultContract(new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment$launchReEnrollment$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(final BackupCodeVerificationResult backupCodeVerificationResult) {
                Handler handler = new Handler(Looper.getMainLooper());
                final PathfinderSmsMfaEnrollOtpFragment pathfinderSmsMfaEnrollOtpFragment = this.this$0;
                handler.post(new Runnable() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment$launchReEnrollment$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PathfinderSmsMfaEnrollOtpDuxo duxo = pathfinderSmsMfaEnrollOtpFragment.getDuxo();
                        BackupCodeVerificationResult backupCodeVerificationResult2 = backupCodeVerificationResult;
                        duxo.sendInput((backupCodeVerificationResult2 != null ? backupCodeVerificationResult2.getChallengeId() : null) != null ? FlowState.SUCCESS : FlowState.BAD_SHERIFF_RESPONSE);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.launchReEnrollment = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderSmsMfaEnrollOtpDuxo getDuxo() {
        return (PathfinderSmsMfaEnrollOtpDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            SmsMfaEnrollOtpContext context = ((UserViewStatePageContext.SmsMfaEnrollOtp) ((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
            if (context.getSuccess() || context.getUpdateFailed()) {
                return;
            }
            NavigationActivityResultContract3.launch$default(this.launchReEnrollment, new BackupCodeVerificationIntentKey(new BackupCodeVerificationInput(Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_SMS_MFA.getId(), context.getChallengeId(), null, null, context.getEnrollmentToken(), context.getPhoneNumber(), 12, null)), null, false, 6, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1572381558);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572381558, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment.ComposeContent (PathfinderSmsMfaEnrollOtpFragment.kt:56)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new PathfinderSmsMfaEnrollOtpViewState(((UserViewStatePageContext.SmsMfaEnrollOtp) ((LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext(), null, 2, null), composerStartRestartGroup, 0);
            SmsMfaEnrollOtpContext context = ComposeContent$lambda$1(snapshotState4SubscribeAsState).getContext();
            PathfinderSmsMfaEnrollOtpViewState.InputState inputState = ComposeContent$lambda$1(snapshotState4SubscribeAsState).getInputState();
            PathfinderSmsMfaEnrollOtpDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new PathfinderSmsMfaEnrollOtpFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new PathfinderSmsMfaEnrollOtpFragment3(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new PathfinderSmsMfaEnrollOtpFragment4(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) objRememberedValue3);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PathfinderSmsMfaEnrollOtpFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            PathfinderSmsMfaEnrollOtpComposable.PathfinderSmsMfaEnrollOtpComposable(context, inputState, function1, function0, function02, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.phone.PathfinderSmsMfaEnrollOtpFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderSmsMfaEnrollOtpFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(PathfinderSmsMfaEnrollOtpFragment pathfinderSmsMfaEnrollOtpFragment) {
        pathfinderSmsMfaEnrollOtpFragment.getDuxo().sendInput(FlowState.CONTACT_SUPPORT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoginActivity() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Login(null, null, false, 7, null), null, true, null, null, 52, null);
    }

    /* compiled from: PathfinderSmsMfaEnrollOtpFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/phone/PathfinderSmsMfaEnrollOtpFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderSmsMfaEnrollOtp;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PathfinderSmsMfaEnrollOtpFragment, LegacyFragmentKey.PathfinderSmsMfaEnrollOtp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderSmsMfaEnrollOtp pathfinderSmsMfaEnrollOtp) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderSmsMfaEnrollOtp);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderSmsMfaEnrollOtp getArgs(PathfinderSmsMfaEnrollOtpFragment pathfinderSmsMfaEnrollOtpFragment) {
            return (LegacyFragmentKey.PathfinderSmsMfaEnrollOtp) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderSmsMfaEnrollOtpFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderSmsMfaEnrollOtpFragment newInstance(LegacyFragmentKey.PathfinderSmsMfaEnrollOtp pathfinderSmsMfaEnrollOtp) {
            return (PathfinderSmsMfaEnrollOtpFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderSmsMfaEnrollOtp);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderSmsMfaEnrollOtpFragment pathfinderSmsMfaEnrollOtpFragment, LegacyFragmentKey.PathfinderSmsMfaEnrollOtp pathfinderSmsMfaEnrollOtp) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderSmsMfaEnrollOtpFragment, pathfinderSmsMfaEnrollOtp);
        }
    }

    private static final PathfinderSmsMfaEnrollOtpViewState ComposeContent$lambda$1(SnapshotState4<PathfinderSmsMfaEnrollOtpViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
