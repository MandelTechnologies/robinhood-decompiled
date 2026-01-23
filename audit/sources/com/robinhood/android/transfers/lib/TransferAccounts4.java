package com.robinhood.android.transfers.lib;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiManagementInfo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002¨\u0006\u0007"}, m3636d2 = {"getLabelText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "toConfigurationAccount", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "toRequestModel", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.lib.TransferAccountsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAccounts4 {
    public static final StringResource getLabelText(TransferAccount transferAccount) {
        String displayTitle;
        StringResource stringResourceInvoke;
        return (transferAccount == null || (displayTitle = transferAccount.getDisplayTitle()) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(displayTitle)) == null) ? StringResource.INSTANCE.invoke(C30383R.string.transfer_account_selection_row_title, new Object[0]) : stringResourceInvoke;
    }

    public static final TransferConfiguration.TransferAccountSelection toConfigurationAccount(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        return new TransferConfiguration.TransferAccountSelection(transferAccount.getAccountId(), false, transferAccount.getType(), 2, null);
    }

    public static final ApiCreateTransferRequest.ApiTransferAccount toRequestModel(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        String accountId = transferAccount.getAccountId();
        ApiTransferAccount.TransferAccountType type2 = transferAccount.getType();
        ManagementInfo managementInfo = transferAccount.getManagementInfo();
        return new ApiCreateTransferRequest.ApiTransferAccount(accountId, type2, null, managementInfo != null ? new ApiManagementInfo(managementInfo.getManagement_type()) : null, 4, null);
    }
}
