package com.robinhood.android.equityscreener.intro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenerIntroComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.intro.ComposableSingletons$ScreenerIntroComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerIntroComposable {
    public static final ScreenerIntroComposable INSTANCE = new ScreenerIntroComposable();

    /* renamed from: lambda$-175820847, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8919lambda$175820847 = ComposableLambda3.composableLambdaInstance(-175820847, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.intro.ComposableSingletons$ScreenerIntroComposableKt$lambda$-175820847$1
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
                ComposerKt.traceEventStart(-175820847, i, -1, "com.robinhood.android.equityscreener.intro.ComposableSingletons$ScreenerIntroComposableKt.lambda$-175820847.<anonymous> (ScreenerIntroComposable.kt:166)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$625505225 = ComposableLambda3.composableLambdaInstance(625505225, false, ScreenerIntroComposable5.INSTANCE);

    /* renamed from: lambda$-1379277650, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8918lambda$1379277650 = ComposableLambda3.composableLambdaInstance(-1379277650, false, ScreenerIntroComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1100758339 = ComposableLambda3.composableLambdaInstance(1100758339, false, ScreenerIntroComposable4.INSTANCE);

    /* renamed from: getLambda$-1379277650$feature_equity_screener_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13986getLambda$1379277650$feature_equity_screener_externalDebug() {
        return f8918lambda$1379277650;
    }

    /* renamed from: getLambda$-175820847$feature_equity_screener_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13987getLambda$175820847$feature_equity_screener_externalDebug() {
        return f8919lambda$175820847;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1100758339$feature_equity_screener_externalDebug() {
        return lambda$1100758339;
    }

    public final Function2<Composer, Integer, Unit> getLambda$625505225$feature_equity_screener_externalDebug() {
        return lambda$625505225;
    }
}
