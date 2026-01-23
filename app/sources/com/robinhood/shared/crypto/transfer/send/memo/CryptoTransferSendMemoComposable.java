package com.robinhood.shared.crypto.transfer.send.memo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendMemoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.memo.ComposableSingletons$CryptoTransferSendMemoComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendMemoComposable {
    public static final CryptoTransferSendMemoComposable INSTANCE = new CryptoTransferSendMemoComposable();
    private static Function3<RhModalBottomSheet5, Composer, Integer, Unit> lambda$1675760004 = ComposableLambda3.composableLambdaInstance(1675760004, false, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.memo.ComposableSingletons$CryptoTransferSendMemoComposableKt$lambda$1675760004$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1675760004, i, -1, "com.robinhood.shared.crypto.transfer.send.memo.ComposableSingletons$CryptoTransferSendMemoComposableKt.lambda$1675760004.<anonymous> (CryptoTransferSendMemoComposable.kt:91)");
            }
            CryptoTransferSendMemoComposable3.MemoSheetContent(RhModalBottomSheet, null, composer, (i & 14) | RhModalBottomSheet5.$stable, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<RhModalBottomSheet5, Composer, Integer, Unit> getLambda$1675760004$feature_crypto_transfer_externalDebug() {
        return lambda$1675760004;
    }
}
