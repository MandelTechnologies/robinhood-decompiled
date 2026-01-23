package com.robinhood.shared.crypto.transfer.send.address.base;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSendAddressComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.base.ComposableSingletons$CryptoTransferSendAddressComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendAddressComposable {
    public static final CryptoTransferSendAddressComposable INSTANCE = new CryptoTransferSendAddressComposable();

    /* renamed from: lambda$-1117188989, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9430lambda$1117188989 = ComposableLambda3.composableLambdaInstance(-1117188989, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.base.ComposableSingletons$CryptoTransferSendAddressComposableKt$lambda$-1117188989$1
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
                ComposerKt.traceEventStart(-1117188989, i, -1, "com.robinhood.shared.crypto.transfer.send.address.base.ComposableSingletons$CryptoTransferSendAddressComposableKt.lambda$-1117188989.<anonymous> (CryptoTransferSendAddressComposable.kt:214)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1117188989$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25054getLambda$1117188989$feature_crypto_transfer_externalDebug() {
        return f9430lambda$1117188989;
    }
}
