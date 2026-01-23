package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOnboardingImprovementSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingImprovementSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingImprovementSplashComposable {
    public static final OptionOnboardingImprovementSplashComposable INSTANCE = new OptionOnboardingImprovementSplashComposable();
    private static Function2<Composer, Integer, Unit> lambda$62189605 = ComposableLambda3.composableLambdaInstance(62189605, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingImprovementSplashComposableKt$lambda$62189605$1
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
                ComposerKt.traceEventStart(62189605, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingImprovementSplashComposableKt.lambda$62189605.<anonymous> (OptionOnboardingImprovementSplashComposable.kt:127)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$62189605$feature_options_upgrade_externalDebug() {
        return lambda$62189605;
    }
}
