package com.robinhood.android.rollover401k.steps.interstitial;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InterstitialScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.interstitial.ComposableSingletons$InterstitialScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InterstitialScreen {
    public static final InterstitialScreen INSTANCE = new InterstitialScreen();

    /* renamed from: lambda$-1507168813, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9238lambda$1507168813 = ComposableLambda3.composableLambdaInstance(-1507168813, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.interstitial.ComposableSingletons$InterstitialScreenKt$lambda$-1507168813$1
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
                ComposerKt.traceEventStart(-1507168813, i, -1, "com.robinhood.android.rollover401k.steps.interstitial.ComposableSingletons$InterstitialScreenKt.lambda$-1507168813.<anonymous> (InterstitialScreen.kt:55)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1507168813$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18449getLambda$1507168813$feature_rollover_401k_externalDebug() {
        return f9238lambda$1507168813;
    }
}
