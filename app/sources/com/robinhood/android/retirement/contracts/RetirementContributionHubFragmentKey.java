package com.robinhood.android.retirement.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementFragmentKeys.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/RetirementContributionHubFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "placement", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RetirementContributionHubFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<RetirementContributionHubFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final String placement;

    /* compiled from: RetirementFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<RetirementContributionHubFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementContributionHubFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RetirementContributionHubFragmentKey(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetirementContributionHubFragmentKey[] newArray(int i) {
            return new RetirementContributionHubFragmentKey[i];
        }
    }

    public static /* synthetic */ RetirementContributionHubFragmentKey copy$default(RetirementContributionHubFragmentKey retirementContributionHubFragmentKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementContributionHubFragmentKey.placement;
        }
        if ((i & 2) != 0) {
            str2 = retirementContributionHubFragmentKey.accountNumber;
        }
        return retirementContributionHubFragmentKey.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final RetirementContributionHubFragmentKey copy(String placement, String accountNumber) {
        return new RetirementContributionHubFragmentKey(placement, accountNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementContributionHubFragmentKey)) {
            return false;
        }
        RetirementContributionHubFragmentKey retirementContributionHubFragmentKey = (RetirementContributionHubFragmentKey) other;
        return Intrinsics.areEqual(this.placement, retirementContributionHubFragmentKey.placement) && Intrinsics.areEqual(this.accountNumber, retirementContributionHubFragmentKey.accountNumber);
    }

    public int hashCode() {
        String str = this.placement;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountNumber;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RetirementContributionHubFragmentKey(placement=" + this.placement + ", accountNumber=" + this.accountNumber + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.placement);
        dest.writeString(this.accountNumber);
    }

    public RetirementContributionHubFragmentKey(String str, String str2) {
        this.placement = str;
        this.accountNumber = str2;
    }

    public /* synthetic */ RetirementContributionHubFragmentKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }
}
