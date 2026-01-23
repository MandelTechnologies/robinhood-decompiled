package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoQuickTradeInputContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeInputContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeInputContent {
    public static final CryptoQuickTradeInputContent INSTANCE = new CryptoQuickTradeInputContent();

    /* renamed from: lambda$-280055872, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9490lambda$280055872 = ComposableLambda3.composableLambdaInstance(-280055872, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeInputContentKt$lambda$-280055872$1
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
                ComposerKt.traceEventStart(-280055872, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.ComposableSingletons$CryptoQuickTradeInputContentKt.lambda$-280055872.<anonymous> (CryptoQuickTradeInputContent.kt:228)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain("-------------------"), new BentoBaseRowState.Text.Plain("--------------"), new BentoBaseRowState.Meta.SingleLine(new AnnotatedString("---------", null, 2, null)), null, false, false, 113, null), false, false, false, 0L, null, composer, BentoBaseRowState.$stable << 3, 125);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-280055872$feature_trade_crypto_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25944getLambda$280055872$feature_trade_crypto_externalDebug() {
        return f9490lambda$280055872;
    }
}
