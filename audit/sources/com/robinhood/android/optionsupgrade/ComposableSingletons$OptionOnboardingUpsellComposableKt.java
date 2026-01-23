package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOnboardingUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$OptionOnboardingUpsellComposableKt {
    public static final ComposableSingletons$OptionOnboardingUpsellComposableKt INSTANCE = new ComposableSingletons$OptionOnboardingUpsellComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$1137369696 = ComposableLambda3.composableLambdaInstance(1137369696, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingUpsellComposableKt$lambda$1137369696$1
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
                ComposerKt.traceEventStart(1137369696, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingUpsellComposableKt.lambda$1137369696.<anonymous> (OptionOnboardingUpsellComposable.kt:77)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2087535610 = ComposableLambda3.composableLambdaInstance(2087535610, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingUpsellComposableKt$lambda$2087535610$1
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
                ComposerKt.traceEventStart(2087535610, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingUpsellComposableKt.lambda$2087535610.<anonymous> (OptionOnboardingUpsellComposable.kt:145)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1271411315, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9161lambda$1271411315 = ComposableLambda3.composableLambdaInstance(-1271411315, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingUpsellComposableKt$lambda$-1271411315$1
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
                ComposerKt.traceEventStart(-1271411315, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$OptionOnboardingUpsellComposableKt.lambda$-1271411315.<anonymous> (OptionOnboardingUpsellComposable.kt:145)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$OptionOnboardingUpsellComposableKt.INSTANCE.getLambda$2087535610$feature_options_upgrade_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer, 6, 0, 2046);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1271411315$feature_options_upgrade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17389getLambda$1271411315$feature_options_upgrade_externalDebug() {
        return f9161lambda$1271411315;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1137369696$feature_options_upgrade_externalDebug() {
        return lambda$1137369696;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2087535610$feature_options_upgrade_externalDebug() {
        return lambda$2087535610;
    }
}
