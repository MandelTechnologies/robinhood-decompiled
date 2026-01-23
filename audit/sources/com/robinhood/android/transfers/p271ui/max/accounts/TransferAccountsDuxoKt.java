package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toApiMatchaSpecificRhyTransferType", "Lcom/robinhood/transfers/api/TransferType;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TransferAccountsDuxoKt {
    public static final TransferType toApiMatchaSpecificRhyTransferType(ApiTransferAccount.TransferAccountType transferAccountType) {
        Intrinsics.checkNotNullParameter(transferAccountType, "<this>");
        if (transferAccountType == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            return TransferType.DEBIT_CARD_TRANSFER;
        }
        return TransferType.INSTANT_BANK_TRANSFER;
    }
}
