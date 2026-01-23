package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldDepositBoostHubQueryParams.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldDepositBoostHubQueryParams;", "Landroid/os/Parcelable;", "transferIds", "", "amountList", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransferIds", "()Ljava/lang/String;", "getAmountList", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldDepositBoostHubQueryParams implements Parcelable {
    public static final Parcelable.Creator<ApiGoldDepositBoostHubQueryParams> CREATOR = new Creator();
    private final String amountList;
    private final String transferIds;

    /* compiled from: ApiGoldDepositBoostHubQueryParams.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldDepositBoostHubQueryParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostHubQueryParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldDepositBoostHubQueryParams(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostHubQueryParams[] newArray(int i) {
            return new ApiGoldDepositBoostHubQueryParams[i];
        }
    }

    public static /* synthetic */ ApiGoldDepositBoostHubQueryParams copy$default(ApiGoldDepositBoostHubQueryParams apiGoldDepositBoostHubQueryParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldDepositBoostHubQueryParams.transferIds;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldDepositBoostHubQueryParams.amountList;
        }
        return apiGoldDepositBoostHubQueryParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferIds() {
        return this.transferIds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountList() {
        return this.amountList;
    }

    public final ApiGoldDepositBoostHubQueryParams copy(String transferIds, String amountList) {
        return new ApiGoldDepositBoostHubQueryParams(transferIds, amountList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldDepositBoostHubQueryParams)) {
            return false;
        }
        ApiGoldDepositBoostHubQueryParams apiGoldDepositBoostHubQueryParams = (ApiGoldDepositBoostHubQueryParams) other;
        return Intrinsics.areEqual(this.transferIds, apiGoldDepositBoostHubQueryParams.transferIds) && Intrinsics.areEqual(this.amountList, apiGoldDepositBoostHubQueryParams.amountList);
    }

    public int hashCode() {
        String str = this.transferIds;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amountList;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldDepositBoostHubQueryParams(transferIds=" + this.transferIds + ", amountList=" + this.amountList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.transferIds);
        dest.writeString(this.amountList);
    }

    public ApiGoldDepositBoostHubQueryParams(String str, String str2) {
        this.transferIds = str;
        this.amountList = str2;
    }

    public final String getTransferIds() {
        return this.transferIds;
    }

    public final String getAmountList() {
        return this.amountList;
    }
}
