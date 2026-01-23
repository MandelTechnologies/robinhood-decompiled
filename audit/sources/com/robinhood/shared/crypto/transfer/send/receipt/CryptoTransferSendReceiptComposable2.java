package com.robinhood.shared.crypto.transfer.send.receipt;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferSendReceiptComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.receipt.ComposableSingletons$CryptoTransferSendReceiptComposableKt$lambda$1812240376$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendReceiptComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoTransferSendReceiptComposable2 INSTANCE = new CryptoTransferSendReceiptComposable2();

    CryptoTransferSendReceiptComposable2() {
    }

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
            ComposerKt.traceEventStart(1812240376, i, -1, "com.robinhood.shared.crypto.transfer.send.receipt.ComposableSingletons$CryptoTransferSendReceiptComposableKt.lambda$1812240376.<anonymous> (CryptoTransferSendReceiptComposable.kt:185)");
        }
        NetworkFeeData.GoldRefund.Receipt receipt = new NetworkFeeData.GoldRefund.Receipt("$0.24", "$1.00");
        String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypt_send_review_total_row_label, composer, 0);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.ComposableSingletons$CryptoTransferSendReceiptComposableKt$lambda$1812240376$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.receipt.ComposableSingletons$CryptoTransferSendReceiptComposableKt$lambda$1812240376$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoTransferSendReceiptComposable3.CryptoTransferSendReceiptComposable("$10.23 \nof Bitcoin", "0.00013 BTC", "1A2b3...3m4n5", null, "Polygon (MATIC)", receipt, "$10.24", strStringResource, "You entered $10.23 and sent 0.00014 Bitcoin on network. The network fee was added to this amount. ", "Done", function0, (Function0) objRememberedValue2, composer, 806907318, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
