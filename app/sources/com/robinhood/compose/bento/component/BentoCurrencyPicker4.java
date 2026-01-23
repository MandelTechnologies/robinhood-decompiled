package com.robinhood.compose.bento.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.util.BentoCurrency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoCurrencyPicker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt$lambda$-831885870$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoCurrencyPicker4 implements Function2<Composer, Integer, Unit> {
    public static final BentoCurrencyPicker4 INSTANCE = new BentoCurrencyPicker4();

    BentoCurrencyPicker4() {
    }

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
            ComposerKt.traceEventStart(-831885870, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt.lambda$-831885870.<anonymous> (BentoCurrencyPicker.kt:88)");
        }
        BentoCurrency bentoCurrency = BentoCurrency.SGD;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoCurrencyPickerKt$lambda$-831885870$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoCurrencyPicker.BentoCurrencyPicker(bentoCurrency, true, null, (Function0) objRememberedValue, "This is a description", composer, 27702, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
