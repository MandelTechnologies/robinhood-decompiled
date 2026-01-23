package com.robinhood.android.retirement.onboarding.submit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementSignUpFlowSubmitContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$RetirementSignUpFlowSubmitContentKt {
    public static final ComposableSingletons$RetirementSignUpFlowSubmitContentKt INSTANCE = new ComposableSingletons$RetirementSignUpFlowSubmitContentKt();
    private static Function2<Composer, Integer, Unit> lambda$848896287 = ComposableLambda3.composableLambdaInstance(848896287, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.submit.ComposableSingletons$RetirementSignUpFlowSubmitContentKt$lambda$848896287$1
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
                ComposerKt.traceEventStart(848896287, i, -1, "com.robinhood.android.retirement.onboarding.submit.ComposableSingletons$RetirementSignUpFlowSubmitContentKt.lambda$848896287.<anonymous> (RetirementSignUpFlowSubmitContent.kt:76)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$848896287$feature_retirement_onboarding_externalDebug() {
        return lambda$848896287;
    }
}
