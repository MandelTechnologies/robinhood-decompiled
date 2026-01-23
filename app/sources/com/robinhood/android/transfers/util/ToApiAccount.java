package com.robinhood.android.transfers.util;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiManagementInfo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToApiAccount.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"toApiAccount", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "toApiManagementInfo", "Lcom/robinhood/models/api/bonfire/ApiManagementInfo;", "Lcom/robinhood/models/db/bonfire/ManagementInfo;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.ToApiAccountKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ToApiAccount {
    public static final ApiCreateTransferRequest.ApiTransferAccount toApiAccount(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        String accountId = transferAccount.getAccountId();
        ApiTransferAccount.TransferAccountType type2 = transferAccount.getType();
        ManagementInfo managementInfo = transferAccount.getManagementInfo();
        return new ApiCreateTransferRequest.ApiTransferAccount(accountId, type2, null, managementInfo != null ? toApiManagementInfo(managementInfo) : null, 4, null);
    }

    public static final ApiManagementInfo toApiManagementInfo(ManagementInfo managementInfo) {
        Intrinsics.checkNotNullParameter(managementInfo, "<this>");
        return new ApiManagementInfo(managementInfo.getManagement_type());
    }
}
