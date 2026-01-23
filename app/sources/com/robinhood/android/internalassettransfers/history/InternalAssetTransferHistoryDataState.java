package com.robinhood.android.internalassettransfers.history;

import com.robinhood.android.internalassettransfers.history.models.UiAssetTransferRecord;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.jointaccounts.api.users.ApiJointUsers;
import com.robinhood.models.p320db.Account;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferHistoryDataState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jo\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/history/InternalAssetTransferHistoryDataState;", "", "assetTransferUuid", "Ljava/util/UUID;", "assetTransferRecord", "Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;", "showDialog", "", "networkError", "", "viewAssetListLoading", "jointUsers", "Lcom/robinhood/models/jointaccounts/api/users/ApiJointUsers;", "currentUserId", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/Account;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;ZLjava/lang/Throwable;ZLcom/robinhood/models/jointaccounts/api/users/ApiJointUsers;Ljava/util/UUID;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Account;)V", "getAssetTransferUuid", "()Ljava/util/UUID;", "getAssetTransferRecord", "()Lcom/robinhood/android/internalassettransfers/history/models/UiAssetTransferRecord;", "getShowDialog", "()Z", "getNetworkError", "()Ljava/lang/Throwable;", "getViewAssetListLoading", "getJointUsers", "()Lcom/robinhood/models/jointaccounts/api/users/ApiJointUsers;", "getCurrentUserId", "getSourceAccount", "()Lcom/robinhood/models/db/Account;", "getSinkAccount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferHistoryDataState {
    public static final int $stable = 8;
    private final UiAssetTransferRecord assetTransferRecord;
    private final UUID assetTransferUuid;
    private final UUID currentUserId;
    private final ApiJointUsers jointUsers;
    private final Throwable networkError;
    private final boolean showDialog;
    private final Account sinkAccount;
    private final Account sourceAccount;
    private final boolean viewAssetListLoading;

    public static /* synthetic */ InternalAssetTransferHistoryDataState copy$default(InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState, UUID uuid, UiAssetTransferRecord uiAssetTransferRecord, boolean z, Throwable th, boolean z2, ApiJointUsers apiJointUsers, UUID uuid2, Account account, Account account2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = internalAssetTransferHistoryDataState.assetTransferUuid;
        }
        if ((i & 2) != 0) {
            uiAssetTransferRecord = internalAssetTransferHistoryDataState.assetTransferRecord;
        }
        if ((i & 4) != 0) {
            z = internalAssetTransferHistoryDataState.showDialog;
        }
        if ((i & 8) != 0) {
            th = internalAssetTransferHistoryDataState.networkError;
        }
        if ((i & 16) != 0) {
            z2 = internalAssetTransferHistoryDataState.viewAssetListLoading;
        }
        if ((i & 32) != 0) {
            apiJointUsers = internalAssetTransferHistoryDataState.jointUsers;
        }
        if ((i & 64) != 0) {
            uuid2 = internalAssetTransferHistoryDataState.currentUserId;
        }
        if ((i & 128) != 0) {
            account = internalAssetTransferHistoryDataState.sourceAccount;
        }
        if ((i & 256) != 0) {
            account2 = internalAssetTransferHistoryDataState.sinkAccount;
        }
        Account account3 = account;
        Account account4 = account2;
        ApiJointUsers apiJointUsers2 = apiJointUsers;
        UUID uuid3 = uuid2;
        boolean z3 = z2;
        boolean z4 = z;
        return internalAssetTransferHistoryDataState.copy(uuid, uiAssetTransferRecord, z4, th, z3, apiJointUsers2, uuid3, account3, account4);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getAssetTransferUuid() {
        return this.assetTransferUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final UiAssetTransferRecord getAssetTransferRecord() {
        return this.assetTransferRecord;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowDialog() {
        return this.showDialog;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getNetworkError() {
        return this.networkError;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getViewAssetListLoading() {
        return this.viewAssetListLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiJointUsers getJointUsers() {
        return this.jointUsers;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getCurrentUserId() {
        return this.currentUserId;
    }

    /* renamed from: component8, reason: from getter */
    public final Account getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component9, reason: from getter */
    public final Account getSinkAccount() {
        return this.sinkAccount;
    }

    public final InternalAssetTransferHistoryDataState copy(UUID assetTransferUuid, UiAssetTransferRecord assetTransferRecord, boolean showDialog, Throwable networkError, boolean viewAssetListLoading, ApiJointUsers jointUsers, UUID currentUserId, Account sourceAccount, Account sinkAccount) {
        Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
        return new InternalAssetTransferHistoryDataState(assetTransferUuid, assetTransferRecord, showDialog, networkError, viewAssetListLoading, jointUsers, currentUserId, sourceAccount, sinkAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferHistoryDataState)) {
            return false;
        }
        InternalAssetTransferHistoryDataState internalAssetTransferHistoryDataState = (InternalAssetTransferHistoryDataState) other;
        return Intrinsics.areEqual(this.assetTransferUuid, internalAssetTransferHistoryDataState.assetTransferUuid) && Intrinsics.areEqual(this.assetTransferRecord, internalAssetTransferHistoryDataState.assetTransferRecord) && this.showDialog == internalAssetTransferHistoryDataState.showDialog && Intrinsics.areEqual(this.networkError, internalAssetTransferHistoryDataState.networkError) && this.viewAssetListLoading == internalAssetTransferHistoryDataState.viewAssetListLoading && Intrinsics.areEqual(this.jointUsers, internalAssetTransferHistoryDataState.jointUsers) && Intrinsics.areEqual(this.currentUserId, internalAssetTransferHistoryDataState.currentUserId) && Intrinsics.areEqual(this.sourceAccount, internalAssetTransferHistoryDataState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, internalAssetTransferHistoryDataState.sinkAccount);
    }

    public int hashCode() {
        int iHashCode = this.assetTransferUuid.hashCode() * 31;
        UiAssetTransferRecord uiAssetTransferRecord = this.assetTransferRecord;
        int iHashCode2 = (((iHashCode + (uiAssetTransferRecord == null ? 0 : uiAssetTransferRecord.hashCode())) * 31) + Boolean.hashCode(this.showDialog)) * 31;
        Throwable th = this.networkError;
        int iHashCode3 = (((iHashCode2 + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.viewAssetListLoading)) * 31;
        ApiJointUsers apiJointUsers = this.jointUsers;
        int iHashCode4 = (iHashCode3 + (apiJointUsers == null ? 0 : apiJointUsers.hashCode())) * 31;
        UUID uuid = this.currentUserId;
        int iHashCode5 = (iHashCode4 + (uuid == null ? 0 : uuid.hashCode())) * 31;
        Account account = this.sourceAccount;
        int iHashCode6 = (iHashCode5 + (account == null ? 0 : account.hashCode())) * 31;
        Account account2 = this.sinkAccount;
        return iHashCode6 + (account2 != null ? account2.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransferHistoryDataState(assetTransferUuid=" + this.assetTransferUuid + ", assetTransferRecord=" + this.assetTransferRecord + ", showDialog=" + this.showDialog + ", networkError=" + this.networkError + ", viewAssetListLoading=" + this.viewAssetListLoading + ", jointUsers=" + this.jointUsers + ", currentUserId=" + this.currentUserId + ", sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ")";
    }

    public InternalAssetTransferHistoryDataState(UUID assetTransferUuid, UiAssetTransferRecord uiAssetTransferRecord, boolean z, Throwable th, boolean z2, ApiJointUsers apiJointUsers, UUID uuid, Account account, Account account2) {
        Intrinsics.checkNotNullParameter(assetTransferUuid, "assetTransferUuid");
        this.assetTransferUuid = assetTransferUuid;
        this.assetTransferRecord = uiAssetTransferRecord;
        this.showDialog = z;
        this.networkError = th;
        this.viewAssetListLoading = z2;
        this.jointUsers = apiJointUsers;
        this.currentUserId = uuid;
        this.sourceAccount = account;
        this.sinkAccount = account2;
    }

    public /* synthetic */ InternalAssetTransferHistoryDataState(UUID uuid, UiAssetTransferRecord uiAssetTransferRecord, boolean z, Throwable th, boolean z2, ApiJointUsers apiJointUsers, UUID uuid2, Account account, Account account2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : uiAssetTransferRecord, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : th, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : apiJointUsers, (i & 64) != 0 ? null : uuid2, (i & 128) != 0 ? null : account, (i & 256) != 0 ? null : account2);
    }

    public final UUID getAssetTransferUuid() {
        return this.assetTransferUuid;
    }

    public final UiAssetTransferRecord getAssetTransferRecord() {
        return this.assetTransferRecord;
    }

    public final boolean getShowDialog() {
        return this.showDialog;
    }

    public final Throwable getNetworkError() {
        return this.networkError;
    }

    public final boolean getViewAssetListLoading() {
        return this.viewAssetListLoading;
    }

    public final ApiJointUsers getJointUsers() {
        return this.jointUsers;
    }

    public final UUID getCurrentUserId() {
        return this.currentUserId;
    }

    public final Account getSourceAccount() {
        return this.sourceAccount;
    }

    public final Account getSinkAccount() {
        return this.sinkAccount;
    }
}
