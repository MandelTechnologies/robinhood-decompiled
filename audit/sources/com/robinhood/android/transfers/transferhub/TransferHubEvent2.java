package com.robinhood.android.transfers.transferhub;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import kotlin.Metadata;

/* compiled from: TransferHubEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/transferhub/PrefillTransferInfo;", "", "sourceType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "sinkType", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)V", "getSourceType", "()Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getSinkType", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.transferhub.PrefillTransferInfo, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferHubEvent2 {
    public static final int $stable = 0;
    private final ApiTransferAccount.TransferAccountType sinkType;
    private final ApiTransferAccount.TransferAccountType sourceType;

    public TransferHubEvent2(ApiTransferAccount.TransferAccountType transferAccountType, ApiTransferAccount.TransferAccountType transferAccountType2) {
        this.sourceType = transferAccountType;
        this.sinkType = transferAccountType2;
    }

    public final ApiTransferAccount.TransferAccountType getSourceType() {
        return this.sourceType;
    }

    public final ApiTransferAccount.TransferAccountType getSinkType() {
        return this.sinkType;
    }
}
