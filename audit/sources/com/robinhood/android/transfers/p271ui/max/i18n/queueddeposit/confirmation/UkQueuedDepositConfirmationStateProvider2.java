package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UkQueuedDepositConfirmationStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, m3636d2 = {"hasUkBankAccountDetails", "", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "getUkBankAccountDisplayName", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.UkQueuedDepositConfirmationStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositConfirmationStateProvider2 {
    public static final boolean hasUkBankAccountDetails(PaymentInstrumentV2 paymentInstrumentV2) {
        Intrinsics.checkNotNullParameter(paymentInstrumentV2, "<this>");
        PaymentInstrumentDetailsV2 details = paymentInstrumentV2.getDetails();
        PaymentInstrumentDetailsV2.UKBankAccount uKBankAccount = details instanceof PaymentInstrumentDetailsV2.UKBankAccount ? (PaymentInstrumentDetailsV2.UKBankAccount) details : null;
        if (uKBankAccount == null) {
            return false;
        }
        return uKBankAccount.getBankName().length() > 0 || uKBankAccount.getAccountNumberLastFour().length() > 0;
    }

    public static final String getUkBankAccountDisplayName(PaymentInstrumentV2 paymentInstrumentV2) {
        Intrinsics.checkNotNullParameter(paymentInstrumentV2, "<this>");
        PaymentInstrumentDetailsV2 details = paymentInstrumentV2.getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.models.paymentinstrument.db.PaymentInstrumentDetailsV2.UKBankAccount");
        PaymentInstrumentDetailsV2.UKBankAccount uKBankAccount = (PaymentInstrumentDetailsV2.UKBankAccount) details;
        StringBuilder sb = new StringBuilder(uKBankAccount.getBankName());
        if (uKBankAccount.getAccountNumberLastFour().length() > 0) {
            sb.append(" ···");
            sb.append(uKBankAccount.getAccountNumberLastFour());
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
