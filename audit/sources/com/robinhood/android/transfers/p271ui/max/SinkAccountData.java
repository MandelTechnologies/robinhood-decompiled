package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SinkAccountData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/SinkAccountData;", "", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "iraContributionInfo", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "wireRoutingDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Lcom/robinhood/models/api/bonfire/wires/RecipientType;Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;)V", "getAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getIraContributionInfo", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getOutgoingWireRecipientType", "()Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "getWireRoutingDetails", "()Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SinkAccountData {
    public static final int $stable = 8;
    private final TransferAccount account;
    private final IraContributionQuestionnaireResult.IraContribution iraContributionInfo;
    private final RecipientType outgoingWireRecipientType;
    private final WireRoutingDetailsInputActivityResultContract3.Success wireRoutingDetails;

    public static /* synthetic */ SinkAccountData copy$default(SinkAccountData sinkAccountData, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccount = sinkAccountData.account;
        }
        if ((i & 2) != 0) {
            iraContribution = sinkAccountData.iraContributionInfo;
        }
        if ((i & 4) != 0) {
            recipientType = sinkAccountData.outgoingWireRecipientType;
        }
        if ((i & 8) != 0) {
            success = sinkAccountData.wireRoutingDetails;
        }
        return sinkAccountData.copy(transferAccount, iraContribution, recipientType, success);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccount getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final IraContributionQuestionnaireResult.IraContribution getIraContributionInfo() {
        return this.iraContributionInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final RecipientType getOutgoingWireRecipientType() {
        return this.outgoingWireRecipientType;
    }

    /* renamed from: component4, reason: from getter */
    public final WireRoutingDetailsInputActivityResultContract3.Success getWireRoutingDetails() {
        return this.wireRoutingDetails;
    }

    public final SinkAccountData copy(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContributionInfo, RecipientType outgoingWireRecipientType, WireRoutingDetailsInputActivityResultContract3.Success wireRoutingDetails) {
        return new SinkAccountData(account, iraContributionInfo, outgoingWireRecipientType, wireRoutingDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SinkAccountData)) {
            return false;
        }
        SinkAccountData sinkAccountData = (SinkAccountData) other;
        return Intrinsics.areEqual(this.account, sinkAccountData.account) && Intrinsics.areEqual(this.iraContributionInfo, sinkAccountData.iraContributionInfo) && this.outgoingWireRecipientType == sinkAccountData.outgoingWireRecipientType && Intrinsics.areEqual(this.wireRoutingDetails, sinkAccountData.wireRoutingDetails);
    }

    public int hashCode() {
        TransferAccount transferAccount = this.account;
        int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
        IraContributionQuestionnaireResult.IraContribution iraContribution = this.iraContributionInfo;
        int iHashCode2 = (iHashCode + (iraContribution == null ? 0 : iraContribution.hashCode())) * 31;
        RecipientType recipientType = this.outgoingWireRecipientType;
        int iHashCode3 = (iHashCode2 + (recipientType == null ? 0 : recipientType.hashCode())) * 31;
        WireRoutingDetailsInputActivityResultContract3.Success success = this.wireRoutingDetails;
        return iHashCode3 + (success != null ? success.hashCode() : 0);
    }

    public String toString() {
        return "SinkAccountData(account=" + this.account + ", iraContributionInfo=" + this.iraContributionInfo + ", outgoingWireRecipientType=" + this.outgoingWireRecipientType + ", wireRoutingDetails=" + this.wireRoutingDetails + ")";
    }

    public SinkAccountData(TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success) {
        this.account = transferAccount;
        this.iraContributionInfo = iraContribution;
        this.outgoingWireRecipientType = recipientType;
        this.wireRoutingDetails = success;
    }

    public final TransferAccount getAccount() {
        return this.account;
    }

    public final IraContributionQuestionnaireResult.IraContribution getIraContributionInfo() {
        return this.iraContributionInfo;
    }

    public final RecipientType getOutgoingWireRecipientType() {
        return this.outgoingWireRecipientType;
    }

    public final WireRoutingDetailsInputActivityResultContract3.Success getWireRoutingDetails() {
        return this.wireRoutingDetails;
    }
}
