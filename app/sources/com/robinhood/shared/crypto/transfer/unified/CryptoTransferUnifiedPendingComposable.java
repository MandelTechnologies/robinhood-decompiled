package com.robinhood.shared.crypto.transfer.unified;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferUnifiedPendingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.unified.ComposableSingletons$CryptoTransferUnifiedPendingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferUnifiedPendingComposable {
    public static final CryptoTransferUnifiedPendingComposable INSTANCE = new CryptoTransferUnifiedPendingComposable();
    private static Function2<Composer, Integer, Unit> lambda$798741814 = ComposableLambda3.composableLambdaInstance(798741814, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.ComposableSingletons$CryptoTransferUnifiedPendingComposableKt$lambda$798741814$1
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
                ComposerKt.traceEventStart(798741814, i, -1, "com.robinhood.shared.crypto.transfer.unified.ComposableSingletons$CryptoTransferUnifiedPendingComposableKt.lambda$798741814.<anonymous> (CryptoTransferUnifiedPendingComposable.kt:88)");
            }
            CryptoTransferUnifiedPendingComposable3.CryptoTransferUnifiedPendingComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$798741814$feature_crypto_transfer_externalDebug() {
        return lambda$798741814;
    }
}
