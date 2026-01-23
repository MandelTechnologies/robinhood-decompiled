package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnInfoFragmentKey.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnInfoFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "isPreTrade", "", "<init>", "(Z)V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnInfoFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<OptionsSimulatedReturnInfoFragmentKey> CREATOR = new Creator();
    private final boolean isPreTrade;

    /* compiled from: OptionsSimulatedReturnInfoFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionsSimulatedReturnInfoFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsSimulatedReturnInfoFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionsSimulatedReturnInfoFragmentKey(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsSimulatedReturnInfoFragmentKey[] newArray(int i) {
            return new OptionsSimulatedReturnInfoFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionsSimulatedReturnInfoFragmentKey copy$default(OptionsSimulatedReturnInfoFragmentKey optionsSimulatedReturnInfoFragmentKey, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionsSimulatedReturnInfoFragmentKey.isPreTrade;
        }
        return optionsSimulatedReturnInfoFragmentKey.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPreTrade() {
        return this.isPreTrade;
    }

    public final OptionsSimulatedReturnInfoFragmentKey copy(boolean isPreTrade) {
        return new OptionsSimulatedReturnInfoFragmentKey(isPreTrade);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionsSimulatedReturnInfoFragmentKey) && this.isPreTrade == ((OptionsSimulatedReturnInfoFragmentKey) other).isPreTrade;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPreTrade);
    }

    public String toString() {
        return "OptionsSimulatedReturnInfoFragmentKey(isPreTrade=" + this.isPreTrade + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isPreTrade ? 1 : 0);
    }

    public OptionsSimulatedReturnInfoFragmentKey(boolean z) {
        this.isPreTrade = z;
    }

    public final boolean isPreTrade() {
        return this.isPreTrade;
    }
}
