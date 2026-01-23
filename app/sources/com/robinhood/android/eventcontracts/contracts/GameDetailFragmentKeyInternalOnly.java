package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/GameDetailFragmentKeyInternalOnly;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "id", "Ljava/util/UUID;", "type", "Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;", "supportCombos", "", "entryPoint", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;ZLjava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;", "getSupportCombos", "()Z", "getEntryPoint", "()Ljava/lang/String;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailFragmentKeyInternalOnly implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<GameDetailFragmentKeyInternalOnly> CREATOR = new Creator();
    private final String entryPoint;
    private final UUID id;
    private final boolean supportCombos;
    private final EcUuidType type;

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GameDetailFragmentKeyInternalOnly> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GameDetailFragmentKeyInternalOnly createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GameDetailFragmentKeyInternalOnly((UUID) parcel.readSerializable(), EcUuidType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GameDetailFragmentKeyInternalOnly[] newArray(int i) {
            return new GameDetailFragmentKeyInternalOnly[i];
        }
    }

    public static /* synthetic */ GameDetailFragmentKeyInternalOnly copy$default(GameDetailFragmentKeyInternalOnly gameDetailFragmentKeyInternalOnly, UUID uuid, EcUuidType ecUuidType, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = gameDetailFragmentKeyInternalOnly.id;
        }
        if ((i & 2) != 0) {
            ecUuidType = gameDetailFragmentKeyInternalOnly.type;
        }
        if ((i & 4) != 0) {
            z = gameDetailFragmentKeyInternalOnly.supportCombos;
        }
        if ((i & 8) != 0) {
            str = gameDetailFragmentKeyInternalOnly.entryPoint;
        }
        return gameDetailFragmentKeyInternalOnly.copy(uuid, ecUuidType, z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final EcUuidType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSupportCombos() {
        return this.supportCombos;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final GameDetailFragmentKeyInternalOnly copy(UUID id, EcUuidType type2, boolean supportCombos, String entryPoint) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new GameDetailFragmentKeyInternalOnly(id, type2, supportCombos, entryPoint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailFragmentKeyInternalOnly)) {
            return false;
        }
        GameDetailFragmentKeyInternalOnly gameDetailFragmentKeyInternalOnly = (GameDetailFragmentKeyInternalOnly) other;
        return Intrinsics.areEqual(this.id, gameDetailFragmentKeyInternalOnly.id) && this.type == gameDetailFragmentKeyInternalOnly.type && this.supportCombos == gameDetailFragmentKeyInternalOnly.supportCombos && Intrinsics.areEqual(this.entryPoint, gameDetailFragmentKeyInternalOnly.entryPoint);
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.supportCombos)) * 31) + this.entryPoint.hashCode();
    }

    public String toString() {
        return "GameDetailFragmentKeyInternalOnly(id=" + this.id + ", type=" + this.type + ", supportCombos=" + this.supportCombos + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeString(this.type.name());
        dest.writeInt(this.supportCombos ? 1 : 0);
        dest.writeString(this.entryPoint);
    }

    public GameDetailFragmentKeyInternalOnly(UUID id, EcUuidType type2, boolean z, String entryPoint) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.id = id;
        this.type = type2;
        this.supportCombos = z;
        this.entryPoint = entryPoint;
    }

    public final UUID getId() {
        return this.id;
    }

    public final EcUuidType getType() {
        return this.type;
    }

    public final boolean getSupportCombos() {
        return this.supportCombos;
    }

    public /* synthetic */ GameDetailFragmentKeyInternalOnly(UUID uuid, EcUuidType ecUuidType, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, ecUuidType, z, (i & 8) != 0 ? "" : str);
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }
}
