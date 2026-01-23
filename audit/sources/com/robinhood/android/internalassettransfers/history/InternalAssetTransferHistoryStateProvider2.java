package com.robinhood.android.internalassettransfers.history;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.jointaccounts.api.users.ApiJointUserInfo;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferHistoryStateProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r\u001a<\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u0013"}, m3636d2 = {"getSourceAccountName", "Lcom/robinhood/utils/resource/StringResource;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/Account;", "isSourceOwner", "", "sourceBrokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "sourceManagementType", "Lcom/robinhood/models/api/ManagementType;", "jointUsers", "Lcom/robinhood/models/jointaccounts/api/users/ApiJointUsers;", "currentUserId", "Ljava/util/UUID;", "getSinkAccountName", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "isSinkOwner", "sinkBrokerageAccountType", "sinkManagementType", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.history.InternalAssetTransferHistoryStateProviderKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferHistoryStateProvider2 {
    public static final StringResource getSourceAccountName(Account account, boolean z, BrokerageAccountType sourceBrokerageAccountType, ManagementType sourceManagementType, ApiJointUsers apiJointUsers, UUID uuid) {
        StringResource title;
        ApiJointUserInfo coOwnerUser;
        Intrinsics.checkNotNullParameter(sourceBrokerageAccountType, "sourceBrokerageAccountType");
        Intrinsics.checkNotNullParameter(sourceManagementType, "sourceManagementType");
        String first_name = null;
        if (account == null || (title = AccountDisplayNames.nicknameDotFormat(account)) == null) {
            title = AccountDisplayNames.getDisplayName$default(sourceBrokerageAccountType, sourceManagementType, null, 4, null).getShort().getTitle();
        }
        if (z) {
            return title;
        }
        if (uuid != null && apiJointUsers != null && (coOwnerUser = apiJointUsers.getCoOwnerUser(uuid)) != null) {
            first_name = coOwnerUser.getFirst_name();
        }
        if (first_name != null) {
            return StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_history_non_owned_with_name, first_name, title);
        }
        return StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_history_non_owned_no_name, title);
    }

    public static final StringResource getSinkAccountName(Account account, boolean z, BrokerageAccountType sinkBrokerageAccountType, ManagementType sinkManagementType, ApiJointUsers apiJointUsers, UUID uuid) {
        StringResource title;
        ApiJointUserInfo coOwnerUser;
        Intrinsics.checkNotNullParameter(sinkBrokerageAccountType, "sinkBrokerageAccountType");
        Intrinsics.checkNotNullParameter(sinkManagementType, "sinkManagementType");
        String first_name = null;
        if (account == null || (title = AccountDisplayNames.nicknameDotFormat(account)) == null) {
            title = AccountDisplayNames.getDisplayName$default(sinkBrokerageAccountType, sinkManagementType, null, 4, null).getShort().getTitle();
        }
        if (z) {
            return title;
        }
        if (uuid != null && apiJointUsers != null && (coOwnerUser = apiJointUsers.getCoOwnerUser(uuid)) != null) {
            first_name = coOwnerUser.getFirst_name();
        }
        if (first_name != null) {
            return StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_history_non_owned_with_name, first_name, title);
        }
        return StringResource.INSTANCE.invoke(C18977R.string.internal_asset_transfer_history_non_owned_no_name, title);
    }
}
