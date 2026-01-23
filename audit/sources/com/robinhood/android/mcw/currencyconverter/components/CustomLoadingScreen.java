package com.robinhood.android.mcw.currencyconverter.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CustomLoadingScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.components.ComposableSingletons$CustomLoadingScreenKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CustomLoadingScreen {
    public static final CustomLoadingScreen INSTANCE = new CustomLoadingScreen();
    private static Function2<Composer, Integer, Unit> lambda$814054401 = ComposableLambda3.composableLambdaInstance(814054401, false, CustomLoadingScreen3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1786896604 = ComposableLambda3.composableLambdaInstance(1786896604, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.currencyconverter.components.ComposableSingletons$CustomLoadingScreenKt$lambda$1786896604$1
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
                ComposerKt.traceEventStart(1786896604, i, -1, "com.robinhood.android.mcw.currencyconverter.components.ComposableSingletons$CustomLoadingScreenKt.lambda$1786896604.<anonymous> (CustomLoadingScreen.kt:88)");
            }
            CustomLoadingScreen4.CustomLoadingScreen(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$1786896604$feature_mcw_currency_converter_externalDebug */
    public final Function2<Composer, Integer, Unit> m2177x568ff136() {
        return lambda$1786896604;
    }

    public final Function2<Composer, Integer, Unit> getLambda$814054401$feature_mcw_currency_converter_externalDebug() {
        return lambda$814054401;
    }
}
