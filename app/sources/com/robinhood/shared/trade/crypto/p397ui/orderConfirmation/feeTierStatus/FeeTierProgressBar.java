package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FeeTierProgressBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$FeeTierProgressBarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FeeTierProgressBar {
    public static final FeeTierProgressBar INSTANCE = new FeeTierProgressBar();
    private static Function2<Composer, Integer, Unit> lambda$896692092 = ComposableLambda3.composableLambdaInstance(896692092, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$FeeTierProgressBarKt$lambda$896692092$1
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
                ComposerKt.traceEventStart(896692092, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.feeTierStatus.ComposableSingletons$FeeTierProgressBarKt.lambda$896692092.<anonymous> (FeeTierProgressBar.kt:47)");
            }
            FeeTierProgressBar3.FeeTierProgressBar(0.6f, null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$896692092$feature_trade_crypto_externalDebug() {
        return lambda$896692092;
    }
}
