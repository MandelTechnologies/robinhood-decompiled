package com.robinhood.android.retirement.contributions;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.transfers.lib.Frequency3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class ContributionReviewModeKt$ContributionReviewMode$1$3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ ContributionReviewCallbacks $callbacks;
    final /* synthetic */ ContributionReviewModeState $state;

    ContributionReviewModeKt$ContributionReviewMode$1$3(ContributionReviewModeState contributionReviewModeState, ContributionReviewCallbacks contributionReviewCallbacks) {
        this.$state = contributionReviewModeState;
        this.$callbacks = contributionReviewCallbacks;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(936220162, i, -1, "com.robinhood.android.retirement.contributions.ContributionReviewMode.<anonymous>.<anonymous> (ContributionReviewMode.kt:158)");
        }
        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "frequency");
        String strStringResource = StringResources_androidKt.stringResource(C26981R.string.create_contribution_frequency_label, composer, 0);
        String strStringResource2 = StringResources_androidKt.stringResource(Frequency3.getTextRes(this.$state.getFrequency()), composer, 0);
        boolean z = !this.$state.isLoading();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$callbacks) | composer.changedInstance(this.$state);
        final ContributionReviewCallbacks contributionReviewCallbacks = this.$callbacks;
        final ContributionReviewModeState contributionReviewModeState = this.$state;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewModeKt$ContributionReviewMode$1$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ContributionReviewModeKt$ContributionReviewMode$1$3.invoke$lambda$1$lambda$0(contributionReviewCallbacks, contributionReviewModeState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ContributionReviewRow.ContributionReviewRow(modifierTestTag, strStringResource, strStringResource2, z, (Function0) objRememberedValue, false, false, composer, 6, 96);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ContributionReviewCallbacks contributionReviewCallbacks, ContributionReviewModeState contributionReviewModeState) {
        contributionReviewCallbacks.onFrequencyClicked(contributionReviewModeState.getFrequency());
        return Unit.INSTANCE;
    }
}
