package com.robinhood.android.equities.equityscreener.crud.create;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PresetScreenerCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.equityscreener.crud.create.ComposableSingletons$PresetScreenerCardKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PresetScreenerCard {
    public static final PresetScreenerCard INSTANCE = new PresetScreenerCard();

    /* renamed from: lambda$-995170406, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8880lambda$995170406 = ComposableLambda3.composableLambdaInstance(-995170406, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.ComposableSingletons$PresetScreenerCardKt$lambda$-995170406$1
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
                ComposerKt.traceEventStart(-995170406, i, -1, "com.robinhood.android.equities.equityscreener.crud.create.ComposableSingletons$PresetScreenerCardKt.lambda$-995170406.<anonymous> (PresetScreenerCard.kt:146)");
            }
            PresetScreenerCard4.PlaceholderPresetCard(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-464435858, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8879lambda$464435858 = ComposableLambda3.composableLambdaInstance(-464435858, false, PresetScreenerCard2.INSTANCE);

    /* renamed from: getLambda$-464435858$lib_equity_screener_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13538getLambda$464435858$lib_equity_screener_externalDebug() {
        return f8879lambda$464435858;
    }

    /* renamed from: getLambda$-995170406$lib_equity_screener_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13539getLambda$995170406$lib_equity_screener_externalDebug() {
        return f8880lambda$995170406;
    }
}
