package com.robinhood.android.sweep.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/sweep/contracts/SweepOnboardingIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "accountNumber", "", "sourceScreenIdentifier", "canSkip", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getSourceScreenIdentifier", "getCanSkip", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SweepOnboardingIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<SweepOnboardingIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final boolean canSkip;
    private final String sourceScreenIdentifier;

    /* compiled from: SweepOnboardingIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<SweepOnboardingIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SweepOnboardingIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SweepOnboardingIntentKey(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SweepOnboardingIntentKey[] newArray(int i) {
            return new SweepOnboardingIntentKey[i];
        }
    }

    public SweepOnboardingIntentKey() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ SweepOnboardingIntentKey copy$default(SweepOnboardingIntentKey sweepOnboardingIntentKey, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sweepOnboardingIntentKey.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = sweepOnboardingIntentKey.sourceScreenIdentifier;
        }
        if ((i & 4) != 0) {
            z = sweepOnboardingIntentKey.canSkip;
        }
        return sweepOnboardingIntentKey.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanSkip() {
        return this.canSkip;
    }

    public final SweepOnboardingIntentKey copy(String accountNumber, String sourceScreenIdentifier, boolean canSkip) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        return new SweepOnboardingIntentKey(accountNumber, sourceScreenIdentifier, canSkip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepOnboardingIntentKey)) {
            return false;
        }
        SweepOnboardingIntentKey sweepOnboardingIntentKey = (SweepOnboardingIntentKey) other;
        return Intrinsics.areEqual(this.accountNumber, sweepOnboardingIntentKey.accountNumber) && Intrinsics.areEqual(this.sourceScreenIdentifier, sweepOnboardingIntentKey.sourceScreenIdentifier) && this.canSkip == sweepOnboardingIntentKey.canSkip;
    }

    public int hashCode() {
        String str = this.accountNumber;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.sourceScreenIdentifier.hashCode()) * 31) + Boolean.hashCode(this.canSkip);
    }

    public String toString() {
        return "SweepOnboardingIntentKey(accountNumber=" + this.accountNumber + ", sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", canSkip=" + this.canSkip + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountNumber);
        dest.writeString(this.sourceScreenIdentifier);
        dest.writeInt(this.canSkip ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public SweepOnboardingIntentKey(String str, String sourceScreenIdentifier, boolean z) {
        Intrinsics.checkNotNullParameter(sourceScreenIdentifier, "sourceScreenIdentifier");
        this.accountNumber = str;
        this.sourceScreenIdentifier = sourceScreenIdentifier;
        this.canSkip = z;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public /* synthetic */ SweepOnboardingIntentKey(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "unset" : str2, (i & 4) != 0 ? false : z);
    }

    public final String getSourceScreenIdentifier() {
        return this.sourceScreenIdentifier;
    }

    public final boolean getCanSkip() {
        return this.canSkip;
    }
}
