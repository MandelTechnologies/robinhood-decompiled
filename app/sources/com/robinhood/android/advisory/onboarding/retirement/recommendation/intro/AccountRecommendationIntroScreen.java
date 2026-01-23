package com.robinhood.android.advisory.onboarding.retirement.recommendation.intro;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountRecommendationIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"toIntroViewState", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/intro/AccountRecommendationIntroViewState;", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "AccountRecommendationIntroScreen", "", "state", "onCtaClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/intro/AccountRecommendationIntroViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AccountRecommendationIntroScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRecommendationIntroScreen$lambda$2(AccountRecommendationIntroViewState accountRecommendationIntroScreen2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountRecommendationIntroScreen(accountRecommendationIntroScreen2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final AccountRecommendationIntroViewState toIntroViewState(ApiAccountTypeRecommendationIntroViewModel.IntroViewModel introViewModel) {
        Intrinsics.checkNotNullParameter(introViewModel, "<this>");
        return new AccountRecommendationIntroViewState(extensions2.toImmutableList(introViewModel.getContent()), extensions2.toImmutableList(introViewModel.getFooter()), introViewModel.getCta());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountRecommendationIntroScreen(final AccountRecommendationIntroViewState state, final Function0<Unit> onCtaClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCtaClicked, "onCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(420102533);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCtaClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(420102533, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreen (AccountRecommendationIntroScreen.kt:33)");
                }
                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountRecommendationIntroScreen.AccountRecommendationIntroScreen$lambda$1$lambda$0(state, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                UtilsKt.m11125StickyFooterLazyColumnmxsUjTo((Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-301578111, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreenKt.AccountRecommendationIntroScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-301578111, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreen.<anonymous> (AccountRecommendationIntroScreen.kt:40)");
                        }
                        UtilsKt.RetirementOnboardingFooter(state.getCta().getLabel(), state.getCta().getIdentifier(), onCtaClicked, null, state.getFooter(), false, composer2, 0, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifierLogScreenTransitions$default, null, 0L, false, null, null, null, composerStartRestartGroup, 48, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountRecommendationIntroScreen.AccountRecommendationIntroScreen$lambda$2(state, onCtaClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(state);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountRecommendationIntroScreen.AccountRecommendationIntroScreen$lambda$1$lambda$0(state, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                UtilsKt.m11125StickyFooterLazyColumnmxsUjTo((Function1) objRememberedValue, ComposableLambda3.rememberComposableLambda(-301578111, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreenKt.AccountRecommendationIntroScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-301578111, i5, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.intro.AccountRecommendationIntroScreen.<anonymous> (AccountRecommendationIntroScreen.kt:40)");
                        }
                        UtilsKt.RetirementOnboardingFooter(state.getCta().getLabel(), state.getCta().getIdentifier(), onCtaClicked, null, state.getFooter(), false, composer2, 0, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), modifierLogScreenTransitions$default2, null, 0L, false, null, null, null, composerStartRestartGroup, 48, 504);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRecommendationIntroScreen$lambda$1$lambda$0(AccountRecommendationIntroViewState accountRecommendationIntroScreen2, LazyListScope StickyFooterLazyColumn) {
        Intrinsics.checkNotNullParameter(StickyFooterLazyColumn, "$this$StickyFooterLazyColumn");
        SduiColumns.sduiItems(StickyFooterLazyColumn, accountRecommendationIntroScreen2.getContent(), GenericAction.class, null, null, HorizontalPadding.Default);
        return Unit.INSTANCE;
    }
}
