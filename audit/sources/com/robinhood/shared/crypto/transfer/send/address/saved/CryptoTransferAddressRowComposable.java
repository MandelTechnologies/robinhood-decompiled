package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferAddressRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferAddressRowComposable {
    public static final CryptoTransferAddressRowComposable INSTANCE = new CryptoTransferAddressRowComposable();
    private static Function2<Composer, Integer, Unit> lambda$2081670333 = ComposableLambda3.composableLambdaInstance(2081670333, false, CryptoTransferAddressRowComposable2.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$679149949 = ComposableLambda3.composableLambdaInstance(679149949, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt$lambda$679149949$1
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
                ComposerKt.traceEventStart(679149949, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.ComposableSingletons$CryptoTransferAddressRowComposableKt.lambda$679149949.<anonymous> (CryptoTransferAddressRowComposable.kt:292)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), CryptoTransferAddressRowComposable.INSTANCE.getLambda$2081670333$feature_crypto_transfer_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$2081670333$feature_crypto_transfer_externalDebug() {
        return lambda$2081670333;
    }

    public final Function2<Composer, Integer, Unit> getLambda$679149949$feature_crypto_transfer_externalDebug() {
        return lambda$679149949;
    }
}
