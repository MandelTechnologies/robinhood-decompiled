package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSendAmountComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CryptoTransferSendAmountComposableKt {
    public static final ComposableSingletons$CryptoTransferSendAmountComposableKt INSTANCE = new ComposableSingletons$CryptoTransferSendAmountComposableKt();

    /* renamed from: lambda$-1029232543, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9433lambda$1029232543 = ComposableLambda3.composableLambdaInstance(-1029232543, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$CryptoTransferSendAmountComposableKt$lambda$-1029232543$1
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
                ComposerKt.traceEventStart(-1029232543, i, -1, "com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$CryptoTransferSendAmountComposableKt.lambda$-1029232543.<anonymous> (CryptoTransferSendAmountComposable.kt:96)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1029232543$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25092getLambda$1029232543$feature_crypto_transfer_externalDebug() {
        return f9433lambda$1029232543;
    }
}
