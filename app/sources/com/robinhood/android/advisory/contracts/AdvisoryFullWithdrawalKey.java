package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFullWithdrawalKey.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryFullWithdrawalKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "managedAccountNumber", "", "sinkAccountId", "iraDistributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;)V", "getManagedAccountNumber", "()Ljava/lang/String;", "getSinkAccountId", "getIraDistributionData", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "getEntryPoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdvisoryFullWithdrawalKey implements TabFragmentKey {
    public static final Parcelable.Creator<AdvisoryFullWithdrawalKey> CREATOR = new Creator();
    private final MAXTransferContext.EntryPoint entryPoint;
    private final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData;
    private final String managedAccountNumber;
    private final String sinkAccountId;

    /* compiled from: AdvisoryFullWithdrawalKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvisoryFullWithdrawalKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryFullWithdrawalKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryFullWithdrawalKey(parcel.readString(), parcel.readString(), (ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData) parcel.readParcelable(AdvisoryFullWithdrawalKey.class.getClassLoader()), MAXTransferContext.EntryPoint.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryFullWithdrawalKey[] newArray(int i) {
            return new AdvisoryFullWithdrawalKey[i];
        }
    }

    public static /* synthetic */ AdvisoryFullWithdrawalKey copy$default(AdvisoryFullWithdrawalKey advisoryFullWithdrawalKey, String str, String str2, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, MAXTransferContext.EntryPoint entryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryFullWithdrawalKey.managedAccountNumber;
        }
        if ((i & 2) != 0) {
            str2 = advisoryFullWithdrawalKey.sinkAccountId;
        }
        if ((i & 4) != 0) {
            iraDistributionData = advisoryFullWithdrawalKey.iraDistributionData;
        }
        if ((i & 8) != 0) {
            entryPoint = advisoryFullWithdrawalKey.entryPoint;
        }
        return advisoryFullWithdrawalKey.copy(str, str2, iraDistributionData, entryPoint);
    }

    /* renamed from: component1, reason: from getter */
    public final String getManagedAccountNumber() {
        return this.managedAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    /* renamed from: component4, reason: from getter */
    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final AdvisoryFullWithdrawalKey copy(String managedAccountNumber, String sinkAccountId, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(managedAccountNumber, "managedAccountNumber");
        Intrinsics.checkNotNullParameter(sinkAccountId, "sinkAccountId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new AdvisoryFullWithdrawalKey(managedAccountNumber, sinkAccountId, iraDistributionData, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryFullWithdrawalKey)) {
            return false;
        }
        AdvisoryFullWithdrawalKey advisoryFullWithdrawalKey = (AdvisoryFullWithdrawalKey) other;
        return Intrinsics.areEqual(this.managedAccountNumber, advisoryFullWithdrawalKey.managedAccountNumber) && Intrinsics.areEqual(this.sinkAccountId, advisoryFullWithdrawalKey.sinkAccountId) && Intrinsics.areEqual(this.iraDistributionData, advisoryFullWithdrawalKey.iraDistributionData) && this.entryPoint == advisoryFullWithdrawalKey.entryPoint;
    }

    public int hashCode() {
        int iHashCode = ((this.managedAccountNumber.hashCode() * 31) + this.sinkAccountId.hashCode()) * 31;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData = this.iraDistributionData;
        return ((iHashCode + (iraDistributionData == null ? 0 : iraDistributionData.hashCode())) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "AdvisoryFullWithdrawalKey(managedAccountNumber=" + this.managedAccountNumber + ", sinkAccountId=" + this.sinkAccountId + ", iraDistributionData=" + this.iraDistributionData + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.managedAccountNumber);
        dest.writeString(this.sinkAccountId);
        dest.writeParcelable(this.iraDistributionData, flags);
        dest.writeString(this.entryPoint.name());
    }

    public AdvisoryFullWithdrawalKey(String managedAccountNumber, String sinkAccountId, ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData, MAXTransferContext.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(managedAccountNumber, "managedAccountNumber");
        Intrinsics.checkNotNullParameter(sinkAccountId, "sinkAccountId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.managedAccountNumber = managedAccountNumber;
        this.sinkAccountId = sinkAccountId;
        this.iraDistributionData = iraDistributionData;
        this.entryPoint = entryPoint;
    }

    public final String getManagedAccountNumber() {
        return this.managedAccountNumber;
    }

    public final String getSinkAccountId() {
        return this.sinkAccountId;
    }

    public final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData() {
        return this.iraDistributionData;
    }

    public final MAXTransferContext.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.SHOULD_NOT_BE_IN_TAB;
    }
}
