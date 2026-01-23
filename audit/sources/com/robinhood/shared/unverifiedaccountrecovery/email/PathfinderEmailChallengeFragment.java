package com.robinhood.shared.unverifiedaccountrecovery.email;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResultContract;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathfinderEmailChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\r\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001aR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0013 \u0014*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "getPathfinderStore", "()Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "setPathfinderStore", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;)V", "challengeLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/shared/security/contracts/ChallengeVerificationIntentKey;", "kotlin.jvm.PlatformType", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-unverified-account-recovery_externalDebug", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class PathfinderEmailChallengeFragment extends GenericComposeFragment {
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> challengeLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, PathfinderEmailChallengeDuxo.class);
    public PathfinderStore pathfinderStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(PathfinderEmailChallengeFragment pathfinderEmailChallengeFragment, int i, Composer composer, int i2) {
        pathfinderEmailChallengeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public PathfinderEmailChallengeFragment() {
        ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ChallengeVerificationIntentKey>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ChallengeVerificationResultContract(new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment$challengeLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(final ChallengeVerificationResult challengeVerificationResult) {
                Handler handler = new Handler(Looper.getMainLooper());
                final PathfinderEmailChallengeFragment pathfinderEmailChallengeFragment = this.this$0;
                handler.post(new Runnable() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment$challengeLauncher$2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PathfinderEmailChallengeDuxo duxo = pathfinderEmailChallengeFragment.getDuxo();
                        ChallengeVerificationResult challengeVerificationResult2 = challengeVerificationResult;
                        ChallengeVerificationResult.Completed completed = challengeVerificationResult2 instanceof ChallengeVerificationResult.Completed ? (ChallengeVerificationResult.Completed) challengeVerificationResult2 : null;
                        duxo.submitChallengeResult(completed != null ? completed.getChallengeId() : null);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.challengeLauncher = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderEmailChallengeDuxo getDuxo() {
        return (PathfinderEmailChallengeDuxo) this.duxo.getValue();
    }

    public final PathfinderStore getPathfinderStore() {
        PathfinderStore pathfinderStore = this.pathfinderStore;
        if (pathfinderStore != null) {
            return pathfinderStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pathfinderStore");
        return null;
    }

    public final void setPathfinderStore(PathfinderStore pathfinderStore) {
        Intrinsics.checkNotNullParameter(pathfinderStore, "<set-?>");
        this.pathfinderStore = pathfinderStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            NavigationActivityResultContract3.launch$default(this.challengeLauncher, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(Challenge.Flow.UNVERIFIED_ACCOUNT_RECOVERY_SMS_MFA.getId(), true, null, null, ((UserViewStatePageContext.EmailChallenge) ((LegacyFragmentKey.PathfinderEmailChallenge) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext().getUserUuid(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, null)), null, false, 6, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1644155188);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1644155188, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment.ComposeContent (PathfinderEmailChallengeFragment.kt:56)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1865903105, true, new C411551(RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new PathfinderEmailChallengeViewState(null, 1, null), composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderEmailChallengeFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PathfinderEmailChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment$ComposeContent$1 */
    static final class C411551 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<PathfinderEmailChallengeViewState> $viewState$delegate;

        C411551(SnapshotState4<PathfinderEmailChallengeViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(-1865903105, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment.ComposeContent.<anonymous> (PathfinderEmailChallengeFragment.kt:60)");
            }
            PathfinderEmailChallengeViewState pathfinderEmailChallengeViewStateComposeContent$lambda$1 = PathfinderEmailChallengeFragment.ComposeContent$lambda$1(this.$viewState$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(PathfinderEmailChallengeFragment.this);
            final PathfinderEmailChallengeFragment pathfinderEmailChallengeFragment = PathfinderEmailChallengeFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PathfinderEmailChallengeFragment.C411551.invoke$lambda$1$lambda$0(pathfinderEmailChallengeFragment, (UserViewInput) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PathfinderEmailChallengeComposable.PathfinderEmailChallengeComposable(pathfinderEmailChallengeViewStateComposeContent$lambda$1, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PathfinderEmailChallengeFragment pathfinderEmailChallengeFragment, UserViewInput it) {
            Intrinsics.checkNotNullParameter(it, "it");
            pathfinderEmailChallengeFragment.getDuxo().submitChallengeResult(it);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PathfinderEmailChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$PathfinderEmailChallenge;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<PathfinderEmailChallengeFragment, LegacyFragmentKey.PathfinderEmailChallenge> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.PathfinderEmailChallenge pathfinderEmailChallenge) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderEmailChallenge);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.PathfinderEmailChallenge getArgs(PathfinderEmailChallengeFragment pathfinderEmailChallengeFragment) {
            return (LegacyFragmentKey.PathfinderEmailChallenge) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, pathfinderEmailChallengeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PathfinderEmailChallengeFragment newInstance(LegacyFragmentKey.PathfinderEmailChallenge pathfinderEmailChallenge) {
            return (PathfinderEmailChallengeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderEmailChallenge);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PathfinderEmailChallengeFragment pathfinderEmailChallengeFragment, LegacyFragmentKey.PathfinderEmailChallenge pathfinderEmailChallenge) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, pathfinderEmailChallengeFragment, pathfinderEmailChallenge);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathfinderEmailChallengeViewState ComposeContent$lambda$1(SnapshotState4<PathfinderEmailChallengeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
