package com.robinhood.shared.documents.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrismFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/documents/contracts/PrismFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "verifyResult", "", "documentRequestId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "getVerifyResult", "()Z", "getDocumentRequestId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrismFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<PrismFragmentKey> CREATOR = new Creator();
    private final UUID documentRequestId;
    private final boolean verifyResult;

    /* compiled from: PrismFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<PrismFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrismFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PrismFragmentKey(parcel.readInt() != 0, (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrismFragmentKey[] newArray(int i) {
            return new PrismFragmentKey[i];
        }
    }

    public static /* synthetic */ PrismFragmentKey copy$default(PrismFragmentKey prismFragmentKey, boolean z, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            z = prismFragmentKey.verifyResult;
        }
        if ((i & 2) != 0) {
            uuid = prismFragmentKey.documentRequestId;
        }
        return prismFragmentKey.copy(z, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVerifyResult() {
        return this.verifyResult;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getDocumentRequestId() {
        return this.documentRequestId;
    }

    public final PrismFragmentKey copy(boolean verifyResult, UUID documentRequestId) {
        return new PrismFragmentKey(verifyResult, documentRequestId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrismFragmentKey)) {
            return false;
        }
        PrismFragmentKey prismFragmentKey = (PrismFragmentKey) other;
        return this.verifyResult == prismFragmentKey.verifyResult && Intrinsics.areEqual(this.documentRequestId, prismFragmentKey.documentRequestId);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.verifyResult) * 31;
        UUID uuid = this.documentRequestId;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "PrismFragmentKey(verifyResult=" + this.verifyResult + ", documentRequestId=" + this.documentRequestId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.verifyResult ? 1 : 0);
        dest.writeSerializable(this.documentRequestId);
    }

    public PrismFragmentKey(boolean z, UUID uuid) {
        this.verifyResult = z;
        this.documentRequestId = uuid;
    }

    public /* synthetic */ PrismFragmentKey(boolean z, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : uuid);
    }

    public final boolean getVerifyResult() {
        return this.verifyResult;
    }

    public final UUID getDocumentRequestId() {
        return this.documentRequestId;
    }
}
