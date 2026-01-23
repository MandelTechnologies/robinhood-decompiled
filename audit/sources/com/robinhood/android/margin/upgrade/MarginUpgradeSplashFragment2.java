package com.robinhood.android.margin.upgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginUpgradeSplashFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.ComposableSingletons$MarginUpgradeSplashFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeSplashFragment2 {
    public static final MarginUpgradeSplashFragment2 INSTANCE = new MarginUpgradeSplashFragment2();
    private static Function2<Composer, Integer, Unit> lambda$955972588 = ComposableLambda3.composableLambdaInstance(955972588, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.ComposableSingletons$MarginUpgradeSplashFragmentKt$lambda$955972588$1
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
                ComposerKt.traceEventStart(955972588, i, -1, "com.robinhood.android.margin.upgrade.ComposableSingletons$MarginUpgradeSplashFragmentKt.lambda$955972588.<anonymous> (MarginUpgradeSplashFragment.kt:161)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$955972588$feature_margin_upgrade_externalDebug() {
        return lambda$955972588;
    }
}
