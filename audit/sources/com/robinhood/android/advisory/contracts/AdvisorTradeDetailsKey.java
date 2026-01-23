package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorTradeDetailsKey.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/AdvisorTradeDetailsKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "id", "Ljava/util/UUID;", "fromDeepLink", "", "<init>", "(Ljava/util/UUID;Z)V", "getId", "()Ljava/util/UUID;", "getFromDeepLink", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvisorTradeDetailsKey implements FragmentKey {
    public static final Parcelable.Creator<AdvisorTradeDetailsKey> CREATOR = new Creator();
    private final boolean fromDeepLink;
    private final UUID id;

    /* compiled from: AdvisorTradeDetailsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AdvisorTradeDetailsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisorTradeDetailsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvisorTradeDetailsKey((UUID) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvisorTradeDetailsKey[] newArray(int i) {
            return new AdvisorTradeDetailsKey[i];
        }
    }

    public static /* synthetic */ AdvisorTradeDetailsKey copy$default(AdvisorTradeDetailsKey advisorTradeDetailsKey, UUID uuid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = advisorTradeDetailsKey.id;
        }
        if ((i & 2) != 0) {
            z = advisorTradeDetailsKey.fromDeepLink;
        }
        return advisorTradeDetailsKey.copy(uuid, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }

    public final AdvisorTradeDetailsKey copy(UUID id, boolean fromDeepLink) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new AdvisorTradeDetailsKey(id, fromDeepLink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvisorTradeDetailsKey)) {
            return false;
        }
        AdvisorTradeDetailsKey advisorTradeDetailsKey = (AdvisorTradeDetailsKey) other;
        return Intrinsics.areEqual(this.id, advisorTradeDetailsKey.id) && this.fromDeepLink == advisorTradeDetailsKey.fromDeepLink;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + Boolean.hashCode(this.fromDeepLink);
    }

    public String toString() {
        return "AdvisorTradeDetailsKey(id=" + this.id + ", fromDeepLink=" + this.fromDeepLink + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeInt(this.fromDeepLink ? 1 : 0);
    }

    public AdvisorTradeDetailsKey(UUID id, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.fromDeepLink = z;
    }

    public /* synthetic */ AdvisorTradeDetailsKey(UUID uuid, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? false : z);
    }

    public final UUID getId() {
        return this.id;
    }

    public final boolean getFromDeepLink() {
        return this.fromDeepLink;
    }
}
