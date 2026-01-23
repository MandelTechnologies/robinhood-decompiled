package com.robinhood.android.advisory.onboarding.questionnaire;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PortfolioQuestionnaireIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.questionnaire.ComposableSingletons$PortfolioQuestionnaireIntroScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioQuestionnaireIntroScreen {
    public static final PortfolioQuestionnaireIntroScreen INSTANCE = new PortfolioQuestionnaireIntroScreen();

    /* renamed from: lambda$-1205635592, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8642lambda$1205635592 = ComposableLambda3.composableLambdaInstance(-1205635592, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.questionnaire.ComposableSingletons$PortfolioQuestionnaireIntroScreenKt$lambda$-1205635592$1
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
                ComposerKt.traceEventStart(-1205635592, i, -1, "com.robinhood.android.advisory.onboarding.questionnaire.ComposableSingletons$PortfolioQuestionnaireIntroScreenKt.lambda$-1205635592.<anonymous> (PortfolioQuestionnaireIntroScreen.kt:126)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1205635592$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11113getLambda$1205635592$feature_advisory_onboarding_externalDebug() {
        return f8642lambda$1205635592;
    }
}
