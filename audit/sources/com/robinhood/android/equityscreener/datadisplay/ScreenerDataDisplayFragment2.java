package com.robinhood.android.equityscreener.datadisplay;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerDataDisplayFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.datadisplay.ComposableSingletons$ScreenerDataDisplayFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerDataDisplayFragment2 {
    public static final ScreenerDataDisplayFragment2 INSTANCE = new ScreenerDataDisplayFragment2();

    /* renamed from: lambda$-1629049331, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8917lambda$1629049331 = ComposableLambda3.composableLambdaInstance(-1629049331, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ComposableSingletons$ScreenerDataDisplayFragmentKt$lambda$-1629049331$1
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
                ComposerKt.traceEventStart(-1629049331, i, -1, "com.robinhood.android.equityscreener.datadisplay.ComposableSingletons$ScreenerDataDisplayFragmentKt.lambda$-1629049331.<anonymous> (ScreenerDataDisplayFragment.kt:69)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1302434814, reason: not valid java name */
    private static Function3<Row5, Composer, Integer, Unit> f8916lambda$1302434814 = ComposableLambda3.composableLambdaInstance(-1302434814, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.datadisplay.ComposableSingletons$ScreenerDataDisplayFragmentKt$lambda$-1302434814$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1302434814, i, -1, "com.robinhood.android.equityscreener.datadisplay.ComposableSingletons$ScreenerDataDisplayFragmentKt.lambda$-1302434814.<anonymous> (ScreenerDataDisplayFragment.kt:70)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1302434814$feature_equity_screener_externalDebug, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m13944getLambda$1302434814$feature_equity_screener_externalDebug() {
        return f8916lambda$1302434814;
    }

    /* renamed from: getLambda$-1629049331$feature_equity_screener_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13945getLambda$1629049331$feature_equity_screener_externalDebug() {
        return f8917lambda$1629049331;
    }
}
