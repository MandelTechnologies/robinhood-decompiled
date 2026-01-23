package com.robinhood.shared.crypto.transfer.selection;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.selection.ComposableSingletons$CryptoTransferSelectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSelectionComposable {
    public static final CryptoTransferSelectionComposable INSTANCE = new CryptoTransferSelectionComposable();

    /* renamed from: lambda$-730811344, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9425lambda$730811344 = ComposableLambda3.composableLambdaInstance(-730811344, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.selection.ComposableSingletons$CryptoTransferSelectionComposableKt$lambda$-730811344$1
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
                ComposerKt.traceEventStart(-730811344, i, -1, "com.robinhood.shared.crypto.transfer.selection.ComposableSingletons$CryptoTransferSelectionComposableKt.lambda$-730811344.<anonymous> (CryptoTransferSelectionComposable.kt:86)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_selection_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-730811344$feature_crypto_transfer_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25040getLambda$730811344$feature_crypto_transfer_externalDebug() {
        return f9425lambda$730811344;
    }
}
