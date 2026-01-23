package com.robinhood.shared.unverifiedaccountrecovery.email;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathfinderEmailChallengeComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"PathfinderEmailChallengeComposable", "", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState;", "onClickTryAgain", "Lkotlin/Function1;", "Lcom/robinhood/models/api/pathfinder/UserViewInput;", "(Lcom/robinhood/shared/unverifiedaccountrecovery/email/PathfinderEmailChallengeViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class PathfinderEmailChallengeComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderEmailChallengeComposable$lambda$2(PathfinderEmailChallengeViewState pathfinderEmailChallengeViewState, Function1 function1, int i, Composer composer, int i2) {
        PathfinderEmailChallengeComposable(pathfinderEmailChallengeViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void PathfinderEmailChallengeComposable(final PathfinderEmailChallengeViewState viewState, final Function1<? super UserViewInput, Unit> onClickTryAgain, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onClickTryAgain, "onClickTryAgain");
        Composer composerStartRestartGroup = composer.startRestartGroup(4302284);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickTryAgain) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(4302284, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeComposable (PathfinderEmailChallengeComposable.kt:11)");
            }
            final PathfinderEmailChallengeViewState.State state = viewState.getState();
            if (state instanceof PathfinderEmailChallengeViewState.State.SubmittingChallenge) {
                composerStartRestartGroup.startReplaceGroup(-679400706);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else if (!(state instanceof PathfinderEmailChallengeViewState.State.SubmitChallengeNetworkError)) {
                if (!Intrinsics.areEqual(state, PathfinderEmailChallengeViewState.State.VerifyingEmail.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-160466668);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-679099820);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-679260555);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged = composerStartRestartGroup.changed(state) | ((i2 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PathfinderEmailChallengeComposable.PathfinderEmailChallengeComposable$lambda$1$lambda$0(onClickTryAgain, state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.PathfinderEmailChallengeComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PathfinderEmailChallengeComposable.PathfinderEmailChallengeComposable$lambda$2(viewState, onClickTryAgain, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PathfinderEmailChallengeComposable$lambda$1$lambda$0(Function1 function1, PathfinderEmailChallengeViewState.State state) {
        function1.invoke(((PathfinderEmailChallengeViewState.State.SubmitChallengeNetworkError) state).getInput());
        return Unit.INSTANCE;
    }
}
