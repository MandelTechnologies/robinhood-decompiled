package com.robinhood.android.mcw.currencyconverter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CurrencyConverterComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.ComposableSingletons$CurrencyConverterComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CurrencyConverterComposable {
    public static final CurrencyConverterComposable INSTANCE = new CurrencyConverterComposable();

    /* renamed from: lambda$-1642060862, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9117lambda$1642060862 = ComposableLambda3.composableLambdaInstance(-1642060862, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.ComposableSingletons$CurrencyConverterComposableKt$lambda$-1642060862$1
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
                ComposerKt.traceEventStart(-1642060862, i, -1, "com.robinhood.android.mcw.currencyconverter.ComposableSingletons$CurrencyConverterComposableKt.lambda$-1642060862.<anonymous> (CurrencyConverterComposable.kt:92)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1642060862$feature_mcw_currency_converter_externalDebug */
    public final Function2<Composer, Integer, Unit> m2175xcfbe42d3() {
        return f9117lambda$1642060862;
    }
}
