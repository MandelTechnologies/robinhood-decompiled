package com.robinhood.android.transfers.international.p266ui.util;

import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentInstrument.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"accountNameAndNumber", "", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentDetailsV2$I18nBankAccount;", "getAccountNameAndNumber", "(Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentDetailsV2$I18nBankAccount;)Ljava/lang/String;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.util.PaymentInstrumentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PaymentInstrument2 {
    public static final String getAccountNameAndNumber(PaymentInstrumentDetailsV2.I18nBankAccount i18nBankAccount) {
        Intrinsics.checkNotNullParameter(i18nBankAccount, "<this>");
        return i18nBankAccount.getBankName() + " ••••" + i18nBankAccount.getLastFour();
    }
}
