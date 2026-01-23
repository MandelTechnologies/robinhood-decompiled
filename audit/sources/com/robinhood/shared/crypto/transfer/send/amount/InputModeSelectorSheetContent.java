package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InputModeSelectorSheetContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$InputModeSelectorSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InputModeSelectorSheetContent {
    public static final InputModeSelectorSheetContent INSTANCE = new InputModeSelectorSheetContent();

    /* renamed from: lambda$-1330673167, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9434lambda$1330673167 = ComposableLambda3.composableLambdaInstance(-1330673167, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$InputModeSelectorSheetContentKt$lambda$-1330673167$1
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
                ComposerKt.traceEventStart(-1330673167, i, -1, "com.robinhood.shared.crypto.transfer.send.amount.ComposableSingletons$InputModeSelectorSheetContentKt.lambda$-1330673167.<anonymous> (InputModeSelectorSheetContent.kt:69)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.QUANTITY_24), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1330673167$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25093getLambda$1330673167$feature_crypto_transfer_externalDebug() {
        return f9434lambda$1330673167;
    }
}
