package com.robinhood.shared.support.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeOnboardingFragmentKey.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/support/contracts/ConciergeOnboardingFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "hasEligibilityCheck", "", "<init>", "(Z)V", "getHasEligibilityCheck", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ConciergeOnboardingFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<ConciergeOnboardingFragmentKey> CREATOR = new Creator();
    private final boolean hasEligibilityCheck;

    /* compiled from: ConciergeOnboardingFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ConciergeOnboardingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConciergeOnboardingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConciergeOnboardingFragmentKey(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConciergeOnboardingFragmentKey[] newArray(int i) {
            return new ConciergeOnboardingFragmentKey[i];
        }
    }

    public ConciergeOnboardingFragmentKey() {
        this(false, 1, null);
    }

    public static /* synthetic */ ConciergeOnboardingFragmentKey copy$default(ConciergeOnboardingFragmentKey conciergeOnboardingFragmentKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conciergeOnboardingFragmentKey.hasEligibilityCheck;
        }
        return conciergeOnboardingFragmentKey.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasEligibilityCheck() {
        return this.hasEligibilityCheck;
    }

    public final ConciergeOnboardingFragmentKey copy(boolean hasEligibilityCheck) {
        return new ConciergeOnboardingFragmentKey(hasEligibilityCheck);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConciergeOnboardingFragmentKey) && this.hasEligibilityCheck == ((ConciergeOnboardingFragmentKey) other).hasEligibilityCheck;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasEligibilityCheck);
    }

    public String toString() {
        return "ConciergeOnboardingFragmentKey(hasEligibilityCheck=" + this.hasEligibilityCheck + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.hasEligibilityCheck ? 1 : 0);
    }

    public ConciergeOnboardingFragmentKey(boolean z) {
        this.hasEligibilityCheck = z;
    }

    public /* synthetic */ ConciergeOnboardingFragmentKey(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean getHasEligibilityCheck() {
        return this.hasEligibilityCheck;
    }
}
