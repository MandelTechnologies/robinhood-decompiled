package com.robinhood.shared.crypto.transfer.history;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferHistoryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.history.ComposableSingletons$CryptoTransferHistoryFragmentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferHistoryFragment2 {
    public static final CryptoTransferHistoryFragment2 INSTANCE = new CryptoTransferHistoryFragment2();

    /* renamed from: lambda$-398820315, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9424lambda$398820315 = ComposableLambda3.composableLambdaInstance(-398820315, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.ComposableSingletons$CryptoTransferHistoryFragmentKt$lambda$-398820315$1
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
                ComposerKt.traceEventStart(-398820315, i, -1, "com.robinhood.shared.crypto.transfer.history.ComposableSingletons$CryptoTransferHistoryFragmentKt.lambda$-398820315.<anonymous> (CryptoTransferHistoryFragment.kt:28)");
            }
            CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-398820315$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25025getLambda$398820315$feature_crypto_transfer_externalDebug() {
        return f9424lambda$398820315;
    }
}
