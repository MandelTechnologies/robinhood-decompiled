package com.robinhood.equities.history.extensions;

import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentTransfers.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"earlyAccessAmount", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getEarlyAccessAmount", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;)Lcom/robinhood/models/util/Money;", "lib-equity-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.equities.history.extensions.PaymentTransfersKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PaymentTransfers4 {
    public static final Money getEarlyAccessAmount(PaymentTransfer paymentTransfer) {
        BigDecimal early_access_amount;
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        ApiPaymentTransferDetails details = paymentTransfer.getDetails();
        ApiPaymentTransferDetails.ApiAchTransfer apiAchTransfer = details instanceof ApiPaymentTransferDetails.ApiAchTransfer ? (ApiPaymentTransferDetails.ApiAchTransfer) details : null;
        if (apiAchTransfer == null || (early_access_amount = apiAchTransfer.getEarly_access_amount()) == null) {
            return null;
        }
        return Money3.toMoney$default(early_access_amount, null, 1, null);
    }
}
