package com.robinhood.android.rhyonboarding.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralOnboardingKey.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/contracts/RhyReferralOnboardingKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "referralCode", "", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReferralCode", "()Ljava/lang/String;", "getVariant", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RhyReferralOnboardingKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<RhyReferralOnboardingKey> CREATOR = new Creator();
    private final String referralCode;
    private final String variant;

    /* compiled from: RhyReferralOnboardingKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RhyReferralOnboardingKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyReferralOnboardingKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RhyReferralOnboardingKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyReferralOnboardingKey[] newArray(int i) {
            return new RhyReferralOnboardingKey[i];
        }
    }

    public static /* synthetic */ RhyReferralOnboardingKey copy$default(RhyReferralOnboardingKey rhyReferralOnboardingKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhyReferralOnboardingKey.referralCode;
        }
        if ((i & 2) != 0) {
            str2 = rhyReferralOnboardingKey.variant;
        }
        return rhyReferralOnboardingKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    public final RhyReferralOnboardingKey copy(String referralCode, String variant) {
        return new RhyReferralOnboardingKey(referralCode, variant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralOnboardingKey)) {
            return false;
        }
        RhyReferralOnboardingKey rhyReferralOnboardingKey = (RhyReferralOnboardingKey) other;
        return Intrinsics.areEqual(this.referralCode, rhyReferralOnboardingKey.referralCode) && Intrinsics.areEqual(this.variant, rhyReferralOnboardingKey.variant);
    }

    public int hashCode() {
        String str = this.referralCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variant;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RhyReferralOnboardingKey(referralCode=" + this.referralCode + ", variant=" + this.variant + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.referralCode);
        dest.writeString(this.variant);
    }

    public RhyReferralOnboardingKey(String str, String str2) {
        this.referralCode = str;
        this.variant = str2;
    }

    public final String getReferralCode() {
        return this.referralCode;
    }

    public final String getVariant() {
        return this.variant;
    }
}
