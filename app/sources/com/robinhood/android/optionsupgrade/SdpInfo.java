package com.robinhood.android.optionsupgrade;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingStates.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SdpInfo;", "Landroid/os/Parcelable;", "symbol", "", "uuid", "Ljava/util/UUID;", "chainUuid", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)V", "getSymbol", "()Ljava/lang/String;", "getUuid", "()Ljava/util/UUID;", "getChainUuid", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SdpInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SdpInfo> CREATOR = new Creator();
    private final UUID chainUuid;
    private final String symbol;
    private final UUID uuid;

    /* compiled from: OptionOnboardingStates.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<SdpInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdpInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SdpInfo(parcel.readString(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdpInfo[] newArray(int i) {
            return new SdpInfo[i];
        }
    }

    public static /* synthetic */ SdpInfo copy$default(SdpInfo sdpInfo, String str, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdpInfo.symbol;
        }
        if ((i & 2) != 0) {
            uuid = sdpInfo.uuid;
        }
        if ((i & 4) != 0) {
            uuid2 = sdpInfo.chainUuid;
        }
        return sdpInfo.copy(str, uuid, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getChainUuid() {
        return this.chainUuid;
    }

    public final SdpInfo copy(String symbol, UUID uuid, UUID chainUuid) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new SdpInfo(symbol, uuid, chainUuid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdpInfo)) {
            return false;
        }
        SdpInfo sdpInfo = (SdpInfo) other;
        return Intrinsics.areEqual(this.symbol, sdpInfo.symbol) && Intrinsics.areEqual(this.uuid, sdpInfo.uuid) && Intrinsics.areEqual(this.chainUuid, sdpInfo.chainUuid);
    }

    public int hashCode() {
        int iHashCode = ((this.symbol.hashCode() * 31) + this.uuid.hashCode()) * 31;
        UUID uuid = this.chainUuid;
        return iHashCode + (uuid == null ? 0 : uuid.hashCode());
    }

    public String toString() {
        return "SdpInfo(symbol=" + this.symbol + ", uuid=" + this.uuid + ", chainUuid=" + this.chainUuid + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeSerializable(this.uuid);
        dest.writeSerializable(this.chainUuid);
    }

    public SdpInfo(String symbol, UUID uuid, UUID uuid2) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.symbol = symbol;
        this.uuid = uuid;
        this.chainUuid = uuid2;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public final UUID getChainUuid() {
        return this.chainUuid;
    }
}
