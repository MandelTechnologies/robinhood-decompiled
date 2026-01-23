package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import com.robinhood.models.crypto.p314db.fee.CryptoFeeTier;
import com.robinhood.shared.crypto.p375ui.feeTiers.FormatFeeRate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoFeeTiers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"feeRateText", "", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTier;", "getFeeRateText", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTier;)Ljava/lang/String;", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoFeeTiersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoFeeTiers {
    public static final String getFeeRateText(CryptoFeeTier cryptoFeeTier) {
        Intrinsics.checkNotNullParameter(cryptoFeeTier, "<this>");
        return FormatFeeRate.formatFeeRate(cryptoFeeTier.getFeeRatio());
    }
}
