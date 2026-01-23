package com.robinhood.android.crypto.costbasis.details.entry;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CostBasisEntryArgs;", "Landroid/os/Parcelable;", "accountId", "Ljava/util/UUID;", "sourceId", "sourceType", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getAccountId", "()Ljava/util/UUID;", "getSourceId", "getSourceType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CostBasisEntryArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CostBasisEntryArgs> CREATOR = new Creator();
    private final UUID accountId;
    private final UUID sourceId;
    private final String sourceType;

    /* compiled from: CryptoCostBasisEntryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CostBasisEntryArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostBasisEntryArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CostBasisEntryArgs((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CostBasisEntryArgs[] newArray(int i) {
            return new CostBasisEntryArgs[i];
        }
    }

    public static /* synthetic */ CostBasisEntryArgs copy$default(CostBasisEntryArgs costBasisEntryArgs, UUID uuid, UUID uuid2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = costBasisEntryArgs.accountId;
        }
        if ((i & 2) != 0) {
            uuid2 = costBasisEntryArgs.sourceId;
        }
        if ((i & 4) != 0) {
            str = costBasisEntryArgs.sourceType;
        }
        return costBasisEntryArgs.copy(uuid, uuid2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    public final CostBasisEntryArgs copy(UUID accountId, UUID sourceId, String sourceType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return new CostBasisEntryArgs(accountId, sourceId, sourceType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostBasisEntryArgs)) {
            return false;
        }
        CostBasisEntryArgs costBasisEntryArgs = (CostBasisEntryArgs) other;
        return Intrinsics.areEqual(this.accountId, costBasisEntryArgs.accountId) && Intrinsics.areEqual(this.sourceId, costBasisEntryArgs.sourceId) && Intrinsics.areEqual(this.sourceType, costBasisEntryArgs.sourceType);
    }

    public int hashCode() {
        return (((this.accountId.hashCode() * 31) + this.sourceId.hashCode()) * 31) + this.sourceType.hashCode();
    }

    public String toString() {
        return "CostBasisEntryArgs(accountId=" + this.accountId + ", sourceId=" + this.sourceId + ", sourceType=" + this.sourceType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.accountId);
        dest.writeSerializable(this.sourceId);
        dest.writeString(this.sourceType);
    }

    public CostBasisEntryArgs(UUID accountId, UUID sourceId, String sourceType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.accountId = accountId;
        this.sourceId = sourceId;
        this.sourceType = sourceType;
    }

    public final UUID getAccountId() {
        return this.accountId;
    }

    public final UUID getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }
}
