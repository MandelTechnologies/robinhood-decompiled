package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toApiAccount", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "lib-store-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountsKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class TransferAccounts7 {
    public static final ApiCreateTransferRequest.ApiTransferAccount toApiAccount(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        return new ApiCreateTransferRequest.ApiTransferAccount(transferAccount.getAccountId(), transferAccount.getType(), null, null, 12, null);
    }
}
