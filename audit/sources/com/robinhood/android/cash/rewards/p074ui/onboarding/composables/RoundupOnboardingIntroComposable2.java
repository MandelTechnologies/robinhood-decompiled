package com.robinhood.android.cash.rewards.p074ui.onboarding.composables;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rewards.p074ui.onboarding.OnboardingStep;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroBottomSheetFragment;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RoundupOnboardingIntroComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$OnboardingSteps$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class RoundupOnboardingIntroComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<RewardsOnboardingIntroBottomSheetFragment.Args, Unit> $launchBottomSheet;
    final /* synthetic */ OnboardingStep $valueProp;

    /* JADX WARN: Multi-variable type inference failed */
    RoundupOnboardingIntroComposable2(OnboardingStep onboardingStep, Function1<? super RewardsOnboardingIntroBottomSheetFragment.Args, Unit> function1) {
        this.$valueProp = onboardingStep;
        this.$launchBottomSheet = function1;
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
            ComposerKt.traceEventStart(-1300721426, i, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.OnboardingSteps.<anonymous>.<anonymous>.<anonymous> (RoundupOnboardingIntroComposable.kt:161)");
        }
        String strReplace$default = StringsKt.replace$default(this.$valueProp.getBody(), StringResources_androidKt.stringResource(this.$valueProp.getAction().getLinkTextRes(), composer, 0), "", false, 4, (Object) null);
        String strStringResource = StringResources_androidKt.stringResource(this.$valueProp.getAction().getLinkTextRes(), composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$launchBottomSheet) | composer.changedInstance(this.$valueProp);
        final Function1<RewardsOnboardingIntroBottomSheetFragment.Args, Unit> function1 = this.$launchBottomSheet;
        final OnboardingStep onboardingStep = this.$valueProp;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$OnboardingSteps$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RoundupOnboardingIntroComposable2.invoke$lambda$1$lambda$0(function1, onboardingStep);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strReplace$default, strStringResource, (Function0) objRememberedValue, null, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, bentoTheme.getTypography(composer, i2).getTextM(), 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, OnboardingStep onboardingStep) {
        function1.invoke(onboardingStep.getAction().getLinkArgs());
        return Unit.INSTANCE;
    }
}
