package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.util.BentoCurrency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BentoCurrencyPicker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCurrencyPicker2 {
    public static final BentoCurrencyPicker2 INSTANCE = new BentoCurrencyPicker2();
    private static Function2<Composer, Integer, Unit> lambda$1167566292 = ComposableLambda3.composableLambdaInstance(1167566292, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt$lambda$1167566292$1
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
                ComposerKt.traceEventStart(1167566292, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt.lambda$1167566292.<anonymous> (BentoCurrencyPicker.kt:75)");
            }
            BentoCurrencyPicker.BentoCurrencyPicker(BentoCurrency.USD, true, null, null, null, composer, 27702, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-831885870, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9324lambda$831885870 = ComposableLambda3.composableLambdaInstance(-831885870, false, BentoCurrencyPicker4.INSTANCE);

    /* renamed from: lambda$-1226604637, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9323lambda$1226604637 = ComposableLambda3.composableLambdaInstance(-1226604637, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt$lambda$-1226604637$1
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
                ComposerKt.traceEventStart(-1226604637, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt.lambda$-1226604637.<anonymous> (BentoCurrencyPicker.kt:101)");
            }
            BentoCurrencyPicker.BentoCurrencyPicker(BentoCurrency.GBP, false, null, null, null, composer, 27702, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1529249379 = ComposableLambda3.composableLambdaInstance(1529249379, false, BentoCurrencyPicker6.INSTANCE);

    /* renamed from: getLambda$-1226604637$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20783getLambda$1226604637$lib_compose_bento_externalRelease() {
        return f9323lambda$1226604637;
    }

    /* renamed from: getLambda$-831885870$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20784getLambda$831885870$lib_compose_bento_externalRelease() {
        return f9324lambda$831885870;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1167566292$lib_compose_bento_externalRelease() {
        return lambda$1167566292;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1529249379$lib_compose_bento_externalRelease() {
        return lambda$1529249379;
    }
}
