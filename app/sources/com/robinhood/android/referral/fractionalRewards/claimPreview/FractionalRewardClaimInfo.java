package com.robinhood.android.referral.fractionalRewards.claimPreview;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FractionalRewardClaimInfo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/claimPreview/FractionalRewardClaimInfo;", "Landroid/os/Parcelable;", "rewardId", "Ljava/util/UUID;", "rewardAmount", "Ljava/math/BigDecimal;", "formattedRewardAmount", "", "instrumentId", "instrumentName", "marketPrice", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getRewardId", "()Ljava/util/UUID;", "getRewardAmount", "()Ljava/math/BigDecimal;", "getFormattedRewardAmount", "()Ljava/lang/String;", "getInstrumentId", "getInstrumentName", "getMarketPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FractionalRewardClaimInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FractionalRewardClaimInfo> CREATOR = new Creator();
    private final String formattedRewardAmount;
    private final UUID instrumentId;
    private final String instrumentName;
    private final BigDecimal marketPrice;
    private final BigDecimal rewardAmount;
    private final UUID rewardId;

    /* compiled from: FractionalRewardClaimInfo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<FractionalRewardClaimInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FractionalRewardClaimInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FractionalRewardClaimInfo((UUID) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FractionalRewardClaimInfo[] newArray(int i) {
            return new FractionalRewardClaimInfo[i];
        }
    }

    public static /* synthetic */ FractionalRewardClaimInfo copy$default(FractionalRewardClaimInfo fractionalRewardClaimInfo, UUID uuid, BigDecimal bigDecimal, String str, UUID uuid2, String str2, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = fractionalRewardClaimInfo.rewardId;
        }
        if ((i & 2) != 0) {
            bigDecimal = fractionalRewardClaimInfo.rewardAmount;
        }
        if ((i & 4) != 0) {
            str = fractionalRewardClaimInfo.formattedRewardAmount;
        }
        if ((i & 8) != 0) {
            uuid2 = fractionalRewardClaimInfo.instrumentId;
        }
        if ((i & 16) != 0) {
            str2 = fractionalRewardClaimInfo.instrumentName;
        }
        if ((i & 32) != 0) {
            bigDecimal2 = fractionalRewardClaimInfo.marketPrice;
        }
        String str3 = str2;
        BigDecimal bigDecimal3 = bigDecimal2;
        return fractionalRewardClaimInfo.copy(uuid, bigDecimal, str, uuid2, str3, bigDecimal3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getRewardId() {
        return this.rewardId;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getRewardAmount() {
        return this.rewardAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormattedRewardAmount() {
        return this.formattedRewardAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public final FractionalRewardClaimInfo copy(UUID rewardId, BigDecimal rewardAmount, String formattedRewardAmount, UUID instrumentId, String instrumentName, BigDecimal marketPrice) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        return new FractionalRewardClaimInfo(rewardId, rewardAmount, formattedRewardAmount, instrumentId, instrumentName, marketPrice);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionalRewardClaimInfo)) {
            return false;
        }
        FractionalRewardClaimInfo fractionalRewardClaimInfo = (FractionalRewardClaimInfo) other;
        return Intrinsics.areEqual(this.rewardId, fractionalRewardClaimInfo.rewardId) && Intrinsics.areEqual(this.rewardAmount, fractionalRewardClaimInfo.rewardAmount) && Intrinsics.areEqual(this.formattedRewardAmount, fractionalRewardClaimInfo.formattedRewardAmount) && Intrinsics.areEqual(this.instrumentId, fractionalRewardClaimInfo.instrumentId) && Intrinsics.areEqual(this.instrumentName, fractionalRewardClaimInfo.instrumentName) && Intrinsics.areEqual(this.marketPrice, fractionalRewardClaimInfo.marketPrice);
    }

    public int hashCode() {
        int iHashCode = ((this.rewardId.hashCode() * 31) + this.rewardAmount.hashCode()) * 31;
        String str = this.formattedRewardAmount;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.instrumentId.hashCode()) * 31) + this.instrumentName.hashCode()) * 31) + this.marketPrice.hashCode();
    }

    public String toString() {
        return "FractionalRewardClaimInfo(rewardId=" + this.rewardId + ", rewardAmount=" + this.rewardAmount + ", formattedRewardAmount=" + this.formattedRewardAmount + ", instrumentId=" + this.instrumentId + ", instrumentName=" + this.instrumentName + ", marketPrice=" + this.marketPrice + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.rewardId);
        dest.writeSerializable(this.rewardAmount);
        dest.writeString(this.formattedRewardAmount);
        dest.writeSerializable(this.instrumentId);
        dest.writeString(this.instrumentName);
        dest.writeSerializable(this.marketPrice);
    }

    public FractionalRewardClaimInfo(UUID rewardId, BigDecimal rewardAmount, String str, UUID instrumentId, String instrumentName, BigDecimal marketPrice) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
        Intrinsics.checkNotNullParameter(marketPrice, "marketPrice");
        this.rewardId = rewardId;
        this.rewardAmount = rewardAmount;
        this.formattedRewardAmount = str;
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.marketPrice = marketPrice;
    }

    public final UUID getRewardId() {
        return this.rewardId;
    }

    public final BigDecimal getRewardAmount() {
        return this.rewardAmount;
    }

    public final String getFormattedRewardAmount() {
        return this.formattedRewardAmount;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getInstrumentName() {
        return this.instrumentName;
    }

    public final BigDecimal getMarketPrice() {
        return this.marketPrice;
    }
}
