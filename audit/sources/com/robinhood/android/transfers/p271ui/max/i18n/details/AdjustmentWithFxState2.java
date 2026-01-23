package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.android.transfers.p271ui.max.i18n.details.AdjustmentWithFxState;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.ApiPaymentTransferDetails;
import com.robinhood.transfers.api.p405uk.ApiPaymentTransferFxConversion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdjustmentWithFxState.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"adjustmentWithFxState", "Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState;", "Lcom/robinhood/models/db/bonfire/PaymentTransfer;", "getAdjustmentWithFxState", "(Lcom/robinhood/models/db/bonfire/PaymentTransfer;)Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.AdjustmentWithFxStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AdjustmentWithFxState2 {
    public static final AdjustmentWithFxState getAdjustmentWithFxState(PaymentTransfer paymentTransfer) {
        Intrinsics.checkNotNullParameter(paymentTransfer, "<this>");
        ApiPaymentTransferDetails details = paymentTransfer.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.transfers.api.ApiPaymentTransferDetails.ApiUkBankTransfer");
        ApiPaymentTransferFxConversion fx = ((ApiPaymentTransferDetails.ApiUkBankTransfer) details).getFx();
        if (paymentTransfer.isError()) {
            return new AdjustmentWithFxState.Finalized(paymentTransfer.getAdjustment());
        }
        if (fx.getActual_target_amount() != null) {
            return new AdjustmentWithFxState.Finalized(paymentTransfer.getAdjustment());
        }
        return new AdjustmentWithFxState.Pending(paymentTransfer.getAdjustment());
    }
}
