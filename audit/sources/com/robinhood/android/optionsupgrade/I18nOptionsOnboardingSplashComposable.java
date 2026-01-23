package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: I18nOptionsOnboardingSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.ComposableSingletons$I18nOptionsOnboardingSplashComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class I18nOptionsOnboardingSplashComposable {
    public static final I18nOptionsOnboardingSplashComposable INSTANCE = new I18nOptionsOnboardingSplashComposable();

    /* renamed from: lambda$-1854898252, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9159lambda$1854898252 = ComposableLambda3.composableLambdaInstance(-1854898252, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$I18nOptionsOnboardingSplashComposableKt$lambda$-1854898252$1
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
                ComposerKt.traceEventStart(-1854898252, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$I18nOptionsOnboardingSplashComposableKt.lambda$-1854898252.<anonymous> (I18nOptionsOnboardingSplashComposable.kt:54)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1854898252$feature_options_upgrade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17386getLambda$1854898252$feature_options_upgrade_externalDebug() {
        return f9159lambda$1854898252;
    }
}
