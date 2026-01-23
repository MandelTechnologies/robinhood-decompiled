package com.robinhood.android.equities.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdrFeeDetailKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/equities/contracts/AdrFeeDetailKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "adrFeeId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getAdrFeeId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdrFeeDetailKey implements FragmentKey {
    public static final Parcelable.Creator<AdrFeeDetailKey> CREATOR = new Creator();
    private final UUID adrFeeId;

    /* compiled from: AdrFeeDetailKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<AdrFeeDetailKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdrFeeDetailKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdrFeeDetailKey((UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdrFeeDetailKey[] newArray(int i) {
            return new AdrFeeDetailKey[i];
        }
    }

    public static /* synthetic */ AdrFeeDetailKey copy$default(AdrFeeDetailKey adrFeeDetailKey, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = adrFeeDetailKey.adrFeeId;
        }
        return adrFeeDetailKey.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getAdrFeeId() {
        return this.adrFeeId;
    }

    public final AdrFeeDetailKey copy(UUID adrFeeId) {
        Intrinsics.checkNotNullParameter(adrFeeId, "adrFeeId");
        return new AdrFeeDetailKey(adrFeeId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdrFeeDetailKey) && Intrinsics.areEqual(this.adrFeeId, ((AdrFeeDetailKey) other).adrFeeId);
    }

    public int hashCode() {
        return this.adrFeeId.hashCode();
    }

    public String toString() {
        return "AdrFeeDetailKey(adrFeeId=" + this.adrFeeId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.adrFeeId);
    }

    public AdrFeeDetailKey(UUID adrFeeId) {
        Intrinsics.checkNotNullParameter(adrFeeId, "adrFeeId");
        this.adrFeeId = adrFeeId;
    }

    public final UUID getAdrFeeId() {
        return this.adrFeeId;
    }
}
