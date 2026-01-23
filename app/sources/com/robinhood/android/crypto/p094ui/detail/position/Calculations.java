package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.models.crypto.p315ui.UiCryptoHolding;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Calculations.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getEquity", "Ljava/math/BigDecimal;", "markPrice", "uiCryptoHolding", "Lcom/robinhood/models/crypto/ui/UiCryptoHolding;", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.position.CalculationsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Calculations {
    public static final BigDecimal getEquity(BigDecimal markPrice, UiCryptoHolding uiCryptoHolding) {
        Intrinsics.checkNotNullParameter(markPrice, "markPrice");
        Intrinsics.checkNotNullParameter(uiCryptoHolding, "uiCryptoHolding");
        BigDecimal bigDecimalMultiply = uiCryptoHolding.getQuantity().multiply(markPrice);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }
}
