package com.robinhood.compose.bento.component.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BentoTickerText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.text.ComposableSingletons$BentoTickerTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTickerText2 {
    public static final BentoTickerText2 INSTANCE = new BentoTickerText2();
    private static Function2<Composer, Integer, Unit> lambda$2106968300 = ComposableLambda3.composableLambdaInstance(2106968300, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.ComposableSingletons$BentoTickerTextKt$lambda$2106968300$1
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
                ComposerKt.traceEventStart(2106968300, i, -1, "com.robinhood.compose.bento.component.text.ComposableSingletons$BentoTickerTextKt.lambda$2106968300.<anonymous> (BentoTickerText.kt:130)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            BentoTickerText.BentoTickerText(new BentoTickerText6("$1,234.56", bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getTypography(composer, 6).getBookCoverCapsuleMedium(), BentoTickerText4.MONEY, true, null, 0.0f, null, 224, null), null, null, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2106968300$lib_compose_bento_externalRelease() {
        return lambda$2106968300;
    }
}
