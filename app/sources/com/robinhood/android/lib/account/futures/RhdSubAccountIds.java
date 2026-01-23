package com.robinhood.android.lib.account.futures;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesAccountProvider.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/account/futures/RhdSubAccountIds;", "Landroid/os/Parcelable;", "futuresSubAccountId", "Ljava/util/UUID;", "eventContractSwapsAccountId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getFuturesSubAccountId", "()Ljava/util/UUID;", "getEventContractSwapsAccountId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-account-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RhdSubAccountIds implements Parcelable {
    public static final Parcelable.Creator<RhdSubAccountIds> CREATOR = new Creator();
    private final UUID eventContractSwapsAccountId;
    private final UUID futuresSubAccountId;

    /* compiled from: FuturesAccountProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RhdSubAccountIds> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhdSubAccountIds createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RhdSubAccountIds((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhdSubAccountIds[] newArray(int i) {
            return new RhdSubAccountIds[i];
        }
    }

    public static /* synthetic */ RhdSubAccountIds copy$default(RhdSubAccountIds rhdSubAccountIds, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = rhdSubAccountIds.futuresSubAccountId;
        }
        if ((i & 2) != 0) {
            uuid2 = rhdSubAccountIds.eventContractSwapsAccountId;
        }
        return rhdSubAccountIds.copy(uuid, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getFuturesSubAccountId() {
        return this.futuresSubAccountId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getEventContractSwapsAccountId() {
        return this.eventContractSwapsAccountId;
    }

    public final RhdSubAccountIds copy(UUID futuresSubAccountId, UUID eventContractSwapsAccountId) {
        Intrinsics.checkNotNullParameter(futuresSubAccountId, "futuresSubAccountId");
        Intrinsics.checkNotNullParameter(eventContractSwapsAccountId, "eventContractSwapsAccountId");
        return new RhdSubAccountIds(futuresSubAccountId, eventContractSwapsAccountId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhdSubAccountIds)) {
            return false;
        }
        RhdSubAccountIds rhdSubAccountIds = (RhdSubAccountIds) other;
        return Intrinsics.areEqual(this.futuresSubAccountId, rhdSubAccountIds.futuresSubAccountId) && Intrinsics.areEqual(this.eventContractSwapsAccountId, rhdSubAccountIds.eventContractSwapsAccountId);
    }

    public int hashCode() {
        return (this.futuresSubAccountId.hashCode() * 31) + this.eventContractSwapsAccountId.hashCode();
    }

    public String toString() {
        return "RhdSubAccountIds(futuresSubAccountId=" + this.futuresSubAccountId + ", eventContractSwapsAccountId=" + this.eventContractSwapsAccountId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.futuresSubAccountId);
        dest.writeSerializable(this.eventContractSwapsAccountId);
    }

    public RhdSubAccountIds(UUID futuresSubAccountId, UUID eventContractSwapsAccountId) {
        Intrinsics.checkNotNullParameter(futuresSubAccountId, "futuresSubAccountId");
        Intrinsics.checkNotNullParameter(eventContractSwapsAccountId, "eventContractSwapsAccountId");
        this.futuresSubAccountId = futuresSubAccountId;
        this.eventContractSwapsAccountId = eventContractSwapsAccountId;
    }

    public final UUID getFuturesSubAccountId() {
        return this.futuresSubAccountId;
    }

    public final UUID getEventContractSwapsAccountId() {
        return this.eventContractSwapsAccountId;
    }
}
