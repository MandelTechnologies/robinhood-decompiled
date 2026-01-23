package com.robinhood.shared.stepupverification.loggedinchallenge;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.security.contracts.PathfinderLoggedInChallengeFragmentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.pathfinder.contexts.LoggedInChallengeContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoggedInChallengeFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDialogDismissed", "id", "", "Companion", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LoggedInChallengeFragment extends GenericComposeFragment {
    public AppType appType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(LoggedInChallengeFragment loggedInChallengeFragment, int i, Composer composer, int i2) {
        loggedInChallengeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    /* compiled from: LoggedInChallengeFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeFragment$ComposeContent$1 */
    static final class C398951 implements Function2<Composer, Integer, Unit> {
        C398951() {
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
                ComposerKt.traceEventStart(143854968, i, -1, "com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeFragment.ComposeContent.<anonymous> (LoggedInChallengeFragment.kt:20)");
            }
            LoggedInChallengeContext context = ((UserViewStatePageContext.LoggedInChallenge) ((PathfinderLoggedInChallengeFragmentKey) LoggedInChallengeFragment.INSTANCE.getArgs((Fragment) LoggedInChallengeFragment.this)).getUserViewState().getTypeContext()).getContext();
            AppType appType = LoggedInChallengeFragment.this.getAppType();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(LoggedInChallengeFragment.this);
            final LoggedInChallengeFragment loggedInChallengeFragment = LoggedInChallengeFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LoggedInChallengeFragment.C398951.invoke$lambda$1$lambda$0(loggedInChallengeFragment, (Throwable) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LoggedInChallengeComposable.LoggedInChallengeComposable(context, appType, (Function1) objRememberedValue, null, null, composer, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LoggedInChallengeFragment loggedInChallengeFragment, Throwable it) throws Throwable {
            Intrinsics.checkNotNullParameter(it, "it");
            ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = loggedInChallengeFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, it, true, false, 0, null, 56, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964429149);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1964429149, i2, -1, "com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeFragment.ComposeContent (LoggedInChallengeFragment.kt:18)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(143854968, true, new C398951(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoggedInChallengeFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().onBackPressed();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: LoggedInChallengeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeFragment;", "Lcom/robinhood/android/security/contracts/PathfinderLoggedInChallengeFragmentKey;", "<init>", "()V", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<LoggedInChallengeFragment, PathfinderLoggedInChallengeFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(PathfinderLoggedInChallengeFragmentKey pathfinderLoggedInChallengeFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, pathfinderLoggedInChallengeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PathfinderLoggedInChallengeFragmentKey getArgs(LoggedInChallengeFragment loggedInChallengeFragment) {
            return (PathfinderLoggedInChallengeFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, loggedInChallengeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LoggedInChallengeFragment newInstance(PathfinderLoggedInChallengeFragmentKey pathfinderLoggedInChallengeFragmentKey) {
            return (LoggedInChallengeFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, pathfinderLoggedInChallengeFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LoggedInChallengeFragment loggedInChallengeFragment, PathfinderLoggedInChallengeFragmentKey pathfinderLoggedInChallengeFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, loggedInChallengeFragment, pathfinderLoggedInChallengeFragmentKey);
        }
    }
}
