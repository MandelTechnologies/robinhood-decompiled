package com.robinhood.android.crypto.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoReferralsUpsellIntentKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/crypto/contracts/CryptoReferralsUpsellIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "rewardProgram", "", "referralCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRewardProgram", "()Ljava/lang/String;", "getReferralCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CryptoReferralsUpsellIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<CryptoReferralsUpsellIntentKey> CREATOR = new Creator();
    private final String referralCode;
    private final String rewardProgram;

    /* compiled from: CryptoReferralsUpsellIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CryptoReferralsUpsellIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoReferralsUpsellIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoReferralsUpsellIntentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoReferralsUpsellIntentKey[] newArray(int i) {
            return new CryptoReferralsUpsellIntentKey[i];
        }
    }

    public static /* synthetic */ CryptoReferralsUpsellIntentKey copy$default(CryptoReferralsUpsellIntentKey cryptoReferralsUpsellIntentKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoReferralsUpsellIntentKey.rewardProgram;
        }
        if ((i & 2) != 0) {
            str2 = cryptoReferralsUpsellIntentKey.referralCode;
        }
        return cryptoReferralsUpsellIntentKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    public final CryptoReferralsUpsellIntentKey copy(String rewardProgram, String referralCode) {
        Intrinsics.checkNotNullParameter(rewardProgram, "rewardProgram");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        return new CryptoReferralsUpsellIntentKey(rewardProgram, referralCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoReferralsUpsellIntentKey)) {
            return false;
        }
        CryptoReferralsUpsellIntentKey cryptoReferralsUpsellIntentKey = (CryptoReferralsUpsellIntentKey) other;
        return Intrinsics.areEqual(this.rewardProgram, cryptoReferralsUpsellIntentKey.rewardProgram) && Intrinsics.areEqual(this.referralCode, cryptoReferralsUpsellIntentKey.referralCode);
    }

    public int hashCode() {
        return (this.rewardProgram.hashCode() * 31) + this.referralCode.hashCode();
    }

    public String toString() {
        return "CryptoReferralsUpsellIntentKey(rewardProgram=" + this.rewardProgram + ", referralCode=" + this.referralCode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.rewardProgram);
        dest.writeString(this.referralCode);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public CryptoReferralsUpsellIntentKey(String rewardProgram, String referralCode) {
        Intrinsics.checkNotNullParameter(rewardProgram, "rewardProgram");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        this.rewardProgram = rewardProgram;
        this.referralCode = referralCode;
    }

    public final String getRewardProgram() {
        return this.rewardProgram;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }
}
