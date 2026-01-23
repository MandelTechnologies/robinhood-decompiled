package com.robinhood.android.transfers.international.p266ui.actions;

import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.models.api.bonfire.paymentinstruments.TransferType;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentDetailsV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectedAction.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0002¨\u0006\u0004"}, m3636d2 = {"getSupportedTransferTypes", "", "Lcom/robinhood/models/api/bonfire/paymentinstruments/TransferType;", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount$External;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.actions.AccountSelectedActionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AccountSelectedAction2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<TransferType> getSupportedTransferTypes(MultiCurrencyAccount.External external) {
        PaymentInstrumentDetailsV2 details = external.getInstrument().getDetails();
        Intrinsics.checkNotNull(details, "null cannot be cast to non-null type com.robinhood.models.paymentinstrument.db.PaymentInstrumentDetailsV2.I18nBankAccount");
        List<TransferType> list = ((PaymentInstrumentDetailsV2.I18nBankAccount) details).getTransferTypesByCurrency().get(external.getCurrency());
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
