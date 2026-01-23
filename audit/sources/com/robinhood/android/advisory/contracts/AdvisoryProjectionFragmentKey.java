package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisoryProjectionFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "", "frequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;)V", "getAccountNumber", "()Ljava/lang/String;", "getFrequency", "()Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvisoryProjectionFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AdvisoryProjectionFragmentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final SimulateDepositFrequency frequency;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AdvisoryProjectionFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryProjectionFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisoryProjectionFragmentKey(parcel.readString(), SimulateDepositFrequency.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisoryProjectionFragmentKey[] newArray(int i) {
            return new AdvisoryProjectionFragmentKey[i];
        }
    }

    public static /* synthetic */ AdvisoryProjectionFragmentKey copy$default(AdvisoryProjectionFragmentKey advisoryProjectionFragmentKey, String str, SimulateDepositFrequency simulateDepositFrequency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisoryProjectionFragmentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            simulateDepositFrequency = advisoryProjectionFragmentKey.frequency;
        }
        return advisoryProjectionFragmentKey.copy(str, simulateDepositFrequency);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final SimulateDepositFrequency getFrequency() {
        return this.frequency;
    }

    public final AdvisoryProjectionFragmentKey copy(String accountNumber, SimulateDepositFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        return new AdvisoryProjectionFragmentKey(accountNumber, frequency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisoryProjectionFragmentKey)) {
            return false;
        }
        AdvisoryProjectionFragmentKey advisoryProjectionFragmentKey = (AdvisoryProjectionFragmentKey) other;
        return Intrinsics.areEqual(this.accountNumber, advisoryProjectionFragmentKey.accountNumber) && this.frequency == advisoryProjectionFragmentKey.frequency;
    }

    public int hashCode() {
        String str = this.accountNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.frequency.hashCode();
    }

    public String toString() {
        return "AdvisoryProjectionFragmentKey(accountNumber=" + this.accountNumber + ", frequency=" + this.frequency + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.frequency.name());
    }

    public AdvisoryProjectionFragmentKey(String str, SimulateDepositFrequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.accountNumber = str;
        this.frequency = frequency;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ AdvisoryProjectionFragmentKey(String str, SimulateDepositFrequency simulateDepositFrequency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? SimulateDepositFrequency.ONE_TIME : simulateDepositFrequency);
    }

    public final SimulateDepositFrequency getFrequency() {
        return this.frequency;
    }
}
