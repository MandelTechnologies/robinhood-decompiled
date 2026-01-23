package com.robinhood.shared.crypto.transfer.unified;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferQrScannerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.unified.ComposableSingletons$CryptoTransferQrScannerComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferQrScannerComposable {
    public static final CryptoTransferQrScannerComposable INSTANCE = new CryptoTransferQrScannerComposable();
    private static Function2<Composer, Integer, Unit> lambda$1033478041 = ComposableLambda3.composableLambdaInstance(1033478041, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.ComposableSingletons$CryptoTransferQrScannerComposableKt$lambda$1033478041$1
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
                ComposerKt.traceEventStart(1033478041, i, -1, "com.robinhood.shared.crypto.transfer.unified.ComposableSingletons$CryptoTransferQrScannerComposableKt.lambda$1033478041.<anonymous> (CryptoTransferQrScannerComposable.kt:140)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1033478041$feature_crypto_transfer_externalDebug() {
        return lambda$1033478041;
    }
}
