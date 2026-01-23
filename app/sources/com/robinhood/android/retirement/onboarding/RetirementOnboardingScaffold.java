package com.robinhood.android.retirement.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementOnboardingScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.ComposableSingletons$RetirementOnboardingScaffoldKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementOnboardingScaffold {
    public static final RetirementOnboardingScaffold INSTANCE = new RetirementOnboardingScaffold();
    private static Function2<Composer, Integer, Unit> lambda$2064167241 = ComposableLambda3.composableLambdaInstance(2064167241, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.ComposableSingletons$RetirementOnboardingScaffoldKt$lambda$2064167241$1
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
                ComposerKt.traceEventStart(2064167241, i, -1, "com.robinhood.android.retirement.onboarding.ComposableSingletons$RetirementOnboardingScaffoldKt.lambda$2064167241.<anonymous> (RetirementOnboardingScaffold.kt:29)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2064167241$feature_retirement_onboarding_externalDebug() {
        return lambda$2064167241;
    }
}
