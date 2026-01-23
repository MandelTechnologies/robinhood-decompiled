package com.robinhood.shared.crypto.transfer.send.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.transfer.model.NetworkFeeData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoTransferSendReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.review.ComposableSingletons$CryptoTransferSendReviewComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferSendReviewComposable {
    public static final CryptoTransferSendReviewComposable INSTANCE = new CryptoTransferSendReviewComposable();
    private static Function2<Composer, Integer, Unit> lambda$1725464469 = ComposableLambda3.composableLambdaInstance(1725464469, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.review.ComposableSingletons$CryptoTransferSendReviewComposableKt$lambda$1725464469$1
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
                ComposerKt.traceEventStart(1725464469, i, -1, "com.robinhood.shared.crypto.transfer.send.review.ComposableSingletons$CryptoTransferSendReviewComposableKt.lambda$1725464469.<anonymous> (CryptoTransferSendReviewComposable.kt:286)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            CryptoTransferSendReviewComposable3.ReviewDetails(new ReviewDetailsState(ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, companion.invoke("$25.00\n of Bitcoin"), companion.invoke("0.00102554 BTC"), true, "mfYZh...9amMd", "Bitcoin network", "Bitcoin on chain network", new NetworkFeeData.GoldRefund.Review("$2.44", "$0"), new NetworkFeeData.Default("0.0001 BTC"), new NetworkFeeSheetContentState(AppType.RHC), "$27.44", "0.00112564 BTC", true, companion.invoke("1234566")), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1725464469$feature_crypto_transfer_externalDebug() {
        return lambda$1725464469;
    }
}
