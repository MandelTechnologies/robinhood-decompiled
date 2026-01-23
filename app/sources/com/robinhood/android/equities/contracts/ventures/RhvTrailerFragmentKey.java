package com.robinhood.android.equities.contracts.ventures;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhvTrailerFragmentKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/ventures/RhvTrailerFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RhvTrailerFragmentKey implements FragmentKey {
    public static final RhvTrailerFragmentKey INSTANCE = new RhvTrailerFragmentKey();
    public static final Parcelable.Creator<RhvTrailerFragmentKey> CREATOR = new Creator();

    /* compiled from: RhvTrailerFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RhvTrailerFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhvTrailerFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return RhvTrailerFragmentKey.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhvTrailerFragmentKey[] newArray(int i) {
            return new RhvTrailerFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof RhvTrailerFragmentKey);
    }

    public int hashCode() {
        return 1520768530;
    }

    public String toString() {
        return "RhvTrailerFragmentKey";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private RhvTrailerFragmentKey() {
    }
}
