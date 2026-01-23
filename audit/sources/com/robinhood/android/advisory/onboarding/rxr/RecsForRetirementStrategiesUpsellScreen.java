package com.robinhood.android.advisory.onboarding.rxr;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsForRetirementStrategiesUpsellScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RecsForRetirementStrategiesUpsellScreen {
    public static final RecsForRetirementStrategiesUpsellScreen INSTANCE = new RecsForRetirementStrategiesUpsellScreen();
    private static Function2<Composer, Integer, Unit> lambda$63372903 = ComposableLambda3.composableLambdaInstance(63372903, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt$lambda$63372903$1
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
                ComposerKt.traceEventStart(63372903, i, -1, "com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt.lambda$63372903.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:123)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1915601898 = ComposableLambda3.composableLambdaInstance(1915601898, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt$lambda$1915601898$1
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
                ComposerKt.traceEventStart(1915601898, i, -1, "com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt.lambda$1915601898.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:192)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$295982066 = ComposableLambda3.composableLambdaInstance(295982066, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt$lambda$295982066$1
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
                ComposerKt.traceEventStart(295982066, i, -1, "com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt.lambda$295982066.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:223)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$1409961296 = ComposableLambda3.composableLambdaInstance(1409961296, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt$lambda$1409961296$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409961296, i, -1, "com.robinhood.android.advisory.onboarding.rxr.ComposableSingletons$RecsForRetirementStrategiesUpsellScreenKt.lambda$1409961296.<anonymous> (RecsForRetirementStrategiesUpsellScreen.kt:232)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, true, true, composer, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$1409961296$feature_advisory_onboarding_externalDebug() {
        return lambda$1409961296;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1915601898$feature_advisory_onboarding_externalDebug() {
        return lambda$1915601898;
    }

    public final Function2<Composer, Integer, Unit> getLambda$295982066$feature_advisory_onboarding_externalDebug() {
        return lambda$295982066;
    }

    public final Function2<Composer, Integer, Unit> getLambda$63372903$feature_advisory_onboarding_externalDebug() {
        return lambda$63372903;
    }
}
