package com.robinhood.android.transfers.contracts;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferV2.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m3636d2 = {"toTransferV2IntentKey", "Lcom/robinhood/android/transfers/contracts/TransferV2;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "direction", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "deepLinkMetadata", "Lcom/robinhood/android/transfers/contracts/TransfersDeepLinkMetadata;", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.contracts.TransferV2Kt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferV22 {
    public static final TransferV2 toTransferV2IntentKey(TransferConfiguration transferConfiguration, TransferDirectionV2 transferDirectionV2, TransfersDeepLinkMetadata transfersDeepLinkMetadata) {
        ApiTransferAccount.TransferAccountType type2;
        ApiTransferAccount.TransferAccountType type3;
        ApiTransferAccount.TransferAccountType type4;
        Intrinsics.checkNotNullParameter(transferConfiguration, "<this>");
        if (transferDirectionV2 == null) {
            if (transferConfiguration.getFrom() == null && transferConfiguration.getTo() == null) {
                transferDirectionV2 = TransferDirectionV2.DEPOSIT;
            } else {
                TransferConfiguration.TransferAccountSelection from = transferConfiguration.getFrom();
                if (from != null && (type4 = from.getType()) != null && type4.isExternal()) {
                    transferDirectionV2 = TransferDirectionV2.DEPOSIT;
                } else {
                    TransferConfiguration.TransferAccountSelection to = transferConfiguration.getTo();
                    if (to != null && (type3 = to.getType()) != null && type3.isExternal()) {
                        transferDirectionV2 = TransferDirectionV2.WITHDRAW;
                    } else {
                        TransferConfiguration.TransferAccountSelection from2 = transferConfiguration.getFrom();
                        if (from2 != null && (type2 = from2.getType()) != null && !type2.isExternal()) {
                            transferDirectionV2 = TransferDirectionV2.WITHDRAW;
                        } else {
                            transferDirectionV2 = TransferDirectionV2.DEPOSIT;
                        }
                    }
                }
            }
        }
        return new TransferV2(transferDirectionV2, transferConfiguration, transfersDeepLinkMetadata);
    }
}
