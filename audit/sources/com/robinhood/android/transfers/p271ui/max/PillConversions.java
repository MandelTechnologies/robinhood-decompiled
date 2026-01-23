package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccount;
import com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccountStatus;
import com.robinhood.transfers.suggestions.pills.contracts.MicrogramTransferAccountType;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PillConversions.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m3636d2 = {"toMicrogramAccountType", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountType;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "toMicrogramAccountStatusType", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccountStatus;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountStatus;", "toMicrogramPillAccount", "Lcom/robinhood/transfers/suggestions/pills/contracts/MicrogramTransferAccount;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.PillConversionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PillConversions {
    public static final MicrogramTransferAccountType toMicrogramAccountType(ApiTransferAccount.TransferAccountType transferAccountType) {
        Intrinsics.checkNotNullParameter(transferAccountType, "<this>");
        return MicrogramTransferAccountType.INSTANCE.fromServerValue(transferAccountType.getServerValue());
    }

    public static final MicrogramTransferAccountStatus toMicrogramAccountStatusType(ApiTransferAccount.TransferAccountStatus transferAccountStatus) {
        Intrinsics.checkNotNullParameter(transferAccountStatus, "<this>");
        return MicrogramTransferAccountStatus.INSTANCE.fromServerValue(transferAccountStatus.getServerValue());
    }

    public static final MicrogramTransferAccount toMicrogramPillAccount(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        MicrogramTransferAccountType microgramAccountType = toMicrogramAccountType(transferAccount.getType());
        MicrogramTransferAccountStatus microgramAccountStatusType = toMicrogramAccountStatusType(transferAccount.getStatus());
        boolean zIsExternal = transferAccount.isExternal();
        String accountName = transferAccount.getAccountName();
        String accountNumber = transferAccount.getAccountNumber();
        String plainString = transferAccount.getTransferLimit().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        BigDecimal withdrawableCash = transferAccount.getWithdrawableCash();
        String plainString2 = withdrawableCash != null ? withdrawableCash.toPlainString() : null;
        BigDecimal ungrantedInstant = transferAccount.getUngrantedInstant();
        return new MicrogramTransferAccount(microgramAccountType, microgramAccountStatusType, zIsExternal, accountName, accountNumber, plainString, plainString2, ungrantedInstant != null ? ungrantedInstant.toPlainString() : null, transferAccount.getHasWithdrawalFee());
    }
}
