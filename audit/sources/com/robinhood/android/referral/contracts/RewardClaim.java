package com.robinhood.android.referral.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardClaim.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/referral/contracts/RewardClaim;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "rewardType", "", "rewardId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getRewardType", "()Ljava/lang/String;", "getRewardId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RewardClaim implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RewardClaim> CREATOR = new Creator();
    private final UUID rewardId;
    private final String rewardType;

    /* compiled from: RewardClaim.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardClaim> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardClaim createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardClaim(parcel.readString(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardClaim[] newArray(int i) {
            return new RewardClaim[i];
        }
    }

    public static /* synthetic */ RewardClaim copy$default(RewardClaim rewardClaim, String str, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardClaim.rewardType;
        }
        if ((i & 2) != 0) {
            uuid = rewardClaim.rewardId;
        }
        return rewardClaim.copy(str, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getRewardId() {
        return this.rewardId;
    }

    public final RewardClaim copy(String rewardType, UUID rewardId) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        return new RewardClaim(rewardType, rewardId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardClaim)) {
            return false;
        }
        RewardClaim rewardClaim = (RewardClaim) other;
        return Intrinsics.areEqual(this.rewardType, rewardClaim.rewardType) && Intrinsics.areEqual(this.rewardId, rewardClaim.rewardId);
    }

    public int hashCode() {
        return (this.rewardType.hashCode() * 31) + this.rewardId.hashCode();
    }

    public String toString() {
        return "RewardClaim(rewardType=" + this.rewardType + ", rewardId=" + this.rewardId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rewardType);
        dest.writeSerializable(this.rewardId);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RewardClaim(String rewardType, UUID rewardId) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        this.rewardType = rewardType;
        this.rewardId = rewardId;
    }

    public final String getRewardType() {
        return this.rewardType;
    }

    public final UUID getRewardId() {
        return this.rewardId;
    }
}
