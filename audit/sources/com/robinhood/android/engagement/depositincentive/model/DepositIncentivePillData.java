package com.robinhood.android.engagement.depositincentive.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.api.bonfire.transfer.rewarddetail.ApiTransferRewardDetailResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositIncentivePillData.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;", "Landroid/os/Parcelable;", "rewardText", "", "rewardIcon", "loggingIdentifier", "rewardType", "Lcom/robinhood/models/api/bonfire/transfer/rewarddetail/ApiTransferRewardDetailResponse$Pill$RewardPillType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/transfer/rewarddetail/ApiTransferRewardDetailResponse$Pill$RewardPillType;)V", "getRewardText", "()Ljava/lang/String;", "getRewardIcon", "getLoggingIdentifier", "getRewardType", "()Lcom/robinhood/models/api/bonfire/transfer/rewarddetail/ApiTransferRewardDetailResponse$Pill$RewardPillType;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-deposit-incentive_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DepositIncentivePillData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DepositIncentivePillData> CREATOR = new Creator();
    private final String loggingIdentifier;
    private final String rewardIcon;
    private final String rewardText;
    private final ApiTransferRewardDetailResponse.Pill.RewardPillType rewardType;

    /* compiled from: DepositIncentivePillData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DepositIncentivePillData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositIncentivePillData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DepositIncentivePillData(parcel.readString(), parcel.readString(), parcel.readString(), ApiTransferRewardDetailResponse.Pill.RewardPillType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositIncentivePillData[] newArray(int i) {
            return new DepositIncentivePillData[i];
        }
    }

    public static /* synthetic */ DepositIncentivePillData copy$default(DepositIncentivePillData depositIncentivePillData, String str, String str2, String str3, ApiTransferRewardDetailResponse.Pill.RewardPillType rewardPillType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositIncentivePillData.rewardText;
        }
        if ((i & 2) != 0) {
            str2 = depositIncentivePillData.rewardIcon;
        }
        if ((i & 4) != 0) {
            str3 = depositIncentivePillData.loggingIdentifier;
        }
        if ((i & 8) != 0) {
            rewardPillType = depositIncentivePillData.rewardType;
        }
        return depositIncentivePillData.copy(str, str2, str3, rewardPillType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRewardText() {
        return this.rewardText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRewardIcon() {
        return this.rewardIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiTransferRewardDetailResponse.Pill.RewardPillType getRewardType() {
        return this.rewardType;
    }

    public final DepositIncentivePillData copy(String rewardText, String rewardIcon, String loggingIdentifier, ApiTransferRewardDetailResponse.Pill.RewardPillType rewardType) {
        Intrinsics.checkNotNullParameter(rewardText, "rewardText");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        return new DepositIncentivePillData(rewardText, rewardIcon, loggingIdentifier, rewardType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepositIncentivePillData)) {
            return false;
        }
        DepositIncentivePillData depositIncentivePillData = (DepositIncentivePillData) other;
        return Intrinsics.areEqual(this.rewardText, depositIncentivePillData.rewardText) && Intrinsics.areEqual(this.rewardIcon, depositIncentivePillData.rewardIcon) && Intrinsics.areEqual(this.loggingIdentifier, depositIncentivePillData.loggingIdentifier) && this.rewardType == depositIncentivePillData.rewardType;
    }

    public int hashCode() {
        int iHashCode = this.rewardText.hashCode() * 31;
        String str = this.rewardIcon;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.loggingIdentifier.hashCode()) * 31) + this.rewardType.hashCode();
    }

    public String toString() {
        return "DepositIncentivePillData(rewardText=" + this.rewardText + ", rewardIcon=" + this.rewardIcon + ", loggingIdentifier=" + this.loggingIdentifier + ", rewardType=" + this.rewardType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rewardText);
        dest.writeString(this.rewardIcon);
        dest.writeString(this.loggingIdentifier);
        dest.writeString(this.rewardType.name());
    }

    public DepositIncentivePillData(String rewardText, String str, String loggingIdentifier, ApiTransferRewardDetailResponse.Pill.RewardPillType rewardType) {
        Intrinsics.checkNotNullParameter(rewardText, "rewardText");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.rewardText = rewardText;
        this.rewardIcon = str;
        this.loggingIdentifier = loggingIdentifier;
        this.rewardType = rewardType;
    }

    public final String getRewardText() {
        return this.rewardText;
    }

    public final String getRewardIcon() {
        return this.rewardIcon;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public /* synthetic */ DepositIncentivePillData(String str, String str2, String str3, ApiTransferRewardDetailResponse.Pill.RewardPillType rewardPillType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? ApiTransferRewardDetailResponse.Pill.RewardPillType.INCENTIVES_PILL : rewardPillType);
    }

    public final ApiTransferRewardDetailResponse.Pill.RewardPillType getRewardType() {
        return this.rewardType;
    }
}
