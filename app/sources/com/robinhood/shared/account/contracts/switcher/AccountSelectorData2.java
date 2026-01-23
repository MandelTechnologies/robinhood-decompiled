package com.robinhood.shared.account.contracts.switcher;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorData.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m3636d2 = {"toAccountSelectorRowData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "Lcom/robinhood/models/db/Account;", "secondaryText", "Lcom/robinhood/utils/resource/StringResource;", "endIcon24", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "endIconContentDescription", "enabled", "", "loggingIdentifier", "", "contracts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.account.contracts.switcher.AccountSelectorDataKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class AccountSelectorData2 {
    public static /* synthetic */ AccountSelectorRowData toAccountSelectorRowData$default(Account account, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource2, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = null;
        }
        if ((i & 2) != 0) {
            serverToBentoAssetMapper2 = null;
        }
        if ((i & 4) != 0) {
            stringResource2 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        return toAccountSelectorRowData(account, stringResource, serverToBentoAssetMapper2, stringResource2, z, str);
    }

    public static final AccountSelectorRowData toAccountSelectorRowData(Account account, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, StringResource stringResource2, boolean z, String str) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        return new AccountSelectorRowData(account.getBrokerageAccountType(), account.getManagementType(), account.getCreatedAt(), str, account.getAccountNumber(), AccountDisplayNames.getDisplayName(account).getWithInvesting().getTitle(), stringResource, AccountDisplayIcons.getDisplayIcon(account), serverToBentoAssetMapper2, stringResource2, z);
    }
}
