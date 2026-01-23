package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroState3;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndividualAccountOutroScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"IndividualAccountOutroScreen", "", "viewState", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;", "callbacks", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-individual-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndividualAccountOutroScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IndividualAccountOutroScreen$lambda$2(IndividualAccountOutroState3 individualAccountOutroState3, IndividualAccountOutroScreen individualAccountOutroScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IndividualAccountOutroScreen(individualAccountOutroState3, individualAccountOutroScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void IndividualAccountOutroScreen(final IndividualAccountOutroState3 viewState, final IndividualAccountOutroScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1271055848);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1271055848, i3, -1, "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreen (IndividualAccountOutroScreen.kt:27)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return IndividualAccountOutroScreen2.IndividualAccountOutroScreen$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(viewState, null, (Function1) objRememberedValue, null, "individual_account_outro_screen_transition", null, ComposableLambda3.rememberComposableLambda(1996031832, true, new Function4<AnimatedContentScope, IndividualAccountOutroState3, Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreenKt.IndividualAccountOutroScreen.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, IndividualAccountOutroState3 individualAccountOutroState3, Composer composer2, Integer num) {
                    invoke(animatedContentScope, individualAccountOutroState3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, IndividualAccountOutroState3 currentState, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(currentState, "currentState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1996031832, i5, -1, "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreen.<anonymous> (IndividualAccountOutroScreen.kt:35)");
                    }
                    if (currentState instanceof IndividualAccountOutroState3.LoadingAccount) {
                        composer2.startReplaceGroup(-1663786995);
                        LoadingAccountScreen3.LoadingAccountScreen((IndividualAccountOutroState3.LoadingAccount) currentState, callbacks, modifier3, composer2, StringResource.$stable, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(currentState instanceof IndividualAccountOutroState3.AccountConfirmed)) {
                            composer2.startReplaceGroup(-1663789462);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1663780017);
                        AccountConfirmedScreen.AccountConfirmedScreen((IndividualAccountOutroState3.AccountConfirmed) currentState, callbacks, modifier3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndividualAccountOutroScreen2.IndividualAccountOutroScreen$lambda$2(viewState, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform IndividualAccountOutroScreen$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }
}
