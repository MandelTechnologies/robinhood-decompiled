package com.robinhood.shared.history.formatters.legacy;

import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;

/* compiled from: UkOpenBankingTransferFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"displayName", "", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "getDisplayName", "(Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;)Ljava/lang/String;", "lib-history-formatters-legacy_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.formatters.legacy.UkOpenBankingTransferFormatterKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UkOpenBankingTransferFormatter2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDisplayName(PaymentInstrumentV2 paymentInstrumentV2) {
        PaymentInstrumentDetailsV2 details = paymentInstrumentV2.getDetails();
        PaymentInstrumentDetailsV2.UKBankAccount uKBankAccount = details instanceof PaymentInstrumentDetailsV2.UKBankAccount ? (PaymentInstrumentDetailsV2.UKBankAccount) details : null;
        if (uKBankAccount == null) {
            return null;
        }
        return uKBankAccount.getBankName() + " ···" + uKBankAccount.getAccountNumberLastFour();
    }
}
