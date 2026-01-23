package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import kotlin.Metadata;

/* compiled from: UkBankTransferDetailsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"displayTitle", "", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "getDisplayTitle", "(Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;)Ljava/lang/String;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkBankTransferDetailsStateProvider2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDisplayTitle(PaymentInstrumentV2 paymentInstrumentV2) {
        PaymentInstrumentDetailsV2 details = paymentInstrumentV2.getDetails();
        PaymentInstrumentDetailsV2.UKBankAccount uKBankAccount = details instanceof PaymentInstrumentDetailsV2.UKBankAccount ? (PaymentInstrumentDetailsV2.UKBankAccount) details : null;
        if (uKBankAccount == null) {
            return null;
        }
        return uKBankAccount.getBankName() + " ···" + uKBankAccount.getAccountNumberLastFour();
    }
}
