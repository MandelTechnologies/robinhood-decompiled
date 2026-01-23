package com.robinhood.android.transfers.i18n;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: InternationalTransfersHubDataState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toAccountRow", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$AccountRow;", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.i18n.InternationalTransfersHubDataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternationalTransfersHubDataState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InternationalTransfersHubViewState.AccountRow toAccountRow(PaymentInstrumentV2 paymentInstrumentV2) {
        PaymentInstrumentDetailsV2 details = paymentInstrumentV2.getDetails();
        if (details instanceof PaymentInstrumentDetailsV2.I18nBankAccount) {
            PaymentInstrumentDetailsV2.I18nBankAccount i18nBankAccount = (PaymentInstrumentDetailsV2.I18nBankAccount) details;
            return new InternationalTransfersHubViewState.AccountRow(i18nBankAccount.getBankName() + " ••••" + i18nBankAccount.getLastFour(), CollectionsKt.joinToString$default(i18nBankAccount.getCurrencies(), null, null, null, 0, null, null, 63, null), null, ServerToBentoAssetMapper2.BANKING_24);
        }
        if (details instanceof PaymentInstrumentDetailsV2.UKBankAccount) {
            PaymentInstrumentDetailsV2.UKBankAccount uKBankAccount = (PaymentInstrumentDetailsV2.UKBankAccount) details;
            return InternationalTransfersHubViewState.AccountRow.INSTANCE.bankAccountDefault(uKBankAccount.getBankName(), uKBankAccount.getAccountNumberLastFour());
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Unsupported payment instrument details: " + details), false, null, 6, null);
        return null;
    }
}
