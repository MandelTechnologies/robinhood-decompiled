package com.robinhood.android.retirement.p239ui.signup.rewards;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.models.retirement.api.rewards.ApiRetirementLearnAndEarnRewardResponse;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementLearnAndEarnRewardContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContentKt$RewardLoaded$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RetirementLearnAndEarnRewardContent4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onClickContinue;
    final /* synthetic */ ApiRetirementLearnAndEarnRewardResponse $result;

    /* JADX WARN: Multi-variable type inference failed */
    RetirementLearnAndEarnRewardContent4(Function1<? super String, Unit> function1, ApiRetirementLearnAndEarnRewardResponse apiRetirementLearnAndEarnRewardResponse) {
        this.$onClickContinue = function1;
        this.$result = apiRetirementLearnAndEarnRewardResponse;
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
            ComposerKt.traceEventStart(1435525713, i, -1, "com.robinhood.android.retirement.ui.signup.rewards.RewardLoaded.<anonymous>.<anonymous> (RetirementLearnAndEarnRewardContent.kt:78)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$onClickContinue) | composer.changedInstance(this.$result);
        final Function1<String, Unit> function1 = this.$onClickContinue;
        final ApiRetirementLearnAndEarnRewardResponse apiRetirementLearnAndEarnRewardResponse = this.$result;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.signup.rewards.RetirementLearnAndEarnRewardContentKt$RewardLoaded$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RetirementLearnAndEarnRewardContent4.invoke$lambda$1$lambda$0(function1, apiRetirementLearnAndEarnRewardResponse);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        String title = this.$result.getConfirmation_view_model().getCta().getTitle();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoButtonKt.m20586BentoButtonEikTQX8(function0, title, ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 7, null), null, false, false, false, true, false, null, 111, null), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ApiRetirementLearnAndEarnRewardResponse apiRetirementLearnAndEarnRewardResponse) {
        function1.invoke(apiRetirementLearnAndEarnRewardResponse.getConfirmation_view_model().getCta().getDeeplink_url());
        return Unit.INSTANCE;
    }
}
