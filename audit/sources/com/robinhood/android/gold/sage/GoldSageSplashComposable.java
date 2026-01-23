package com.robinhood.android.gold.sage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldSageSplashComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.ComposableSingletons$GoldSageSplashComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageSplashComposable {
    public static final GoldSageSplashComposable INSTANCE = new GoldSageSplashComposable();

    /* renamed from: lambda$-666112459, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9021lambda$666112459 = ComposableLambda3.composableLambdaInstance(-666112459, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.ComposableSingletons$GoldSageSplashComposableKt$lambda$-666112459$1
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
                ComposerKt.traceEventStart(-666112459, i, -1, "com.robinhood.android.gold.sage.ComposableSingletons$GoldSageSplashComposableKt.lambda$-666112459.<anonymous> (GoldSageSplashComposable.kt:134)");
            }
            GoldSageSplashComposable3.Content("some/image/path", "Get one of the lowest mortgage rates", "Score a mortgage rate that’s at least 0.75% lower than the national average powered by Sage Home Loans—that could mean $100K+ in savings. Plus, get a $500 bonus.", composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-666112459$feature_gold_sage_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15068getLambda$666112459$feature_gold_sage_externalRelease() {
        return f9021lambda$666112459;
    }
}
