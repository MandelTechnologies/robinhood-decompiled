package com.robinhood.android.recommendations.retirement.p223ui.results.swipey;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RecsRetirementQuestionnaireResultsSwipiesContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recommendations.retirement.ui.results.swipey.ComposableSingletons$RecsRetirementQuestionnaireResultsSwipiesContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementQuestionnaireResultsSwipiesContent {
    public static final RecsRetirementQuestionnaireResultsSwipiesContent INSTANCE = new RecsRetirementQuestionnaireResultsSwipiesContent();

    /* renamed from: lambda$-735213167, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9189lambda$735213167 = ComposableLambda3.composableLambdaInstance(-735213167, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.results.swipey.ComposableSingletons$RecsRetirementQuestionnaireResultsSwipiesContentKt$lambda$-735213167$1
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
                ComposerKt.traceEventStart(-735213167, i, -1, "com.robinhood.android.recommendations.retirement.ui.results.swipey.ComposableSingletons$RecsRetirementQuestionnaireResultsSwipiesContentKt.lambda$-735213167.<anonymous> (RecsRetirementQuestionnaireResultsSwipiesContent.kt:127)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-735213167$feature_recommendations_for_retirement_externalDebug */
    public final Function2<Composer, Integer, Unit> m2393x75b104b9() {
        return f9189lambda$735213167;
    }
}
