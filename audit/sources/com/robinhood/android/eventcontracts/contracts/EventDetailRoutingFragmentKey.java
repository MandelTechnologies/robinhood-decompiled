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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventDetailRoutingFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "id", "Ljava/util/UUID;", "type", "Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;", "entryPoint", "", "isFromHubPill", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;Ljava/lang/String;Z)V", "getId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/android/eventcontracts/contracts/EcUuidType;", "getEntryPoint", "()Ljava/lang/String;", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventDetailRoutingFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<EventDetailRoutingFragmentKey> CREATOR = new Creator();
    private final String entryPoint;
    private final UUID id;
    private final boolean isFromHubPill;
    private final EcUuidType type;

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EventDetailRoutingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventDetailRoutingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventDetailRoutingFragmentKey((UUID) parcel.readSerializable(), EcUuidType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventDetailRoutingFragmentKey[] newArray(int i) {
            return new EventDetailRoutingFragmentKey[i];
        }
    }

    public static /* synthetic */ EventDetailRoutingFragmentKey copy$default(EventDetailRoutingFragmentKey eventDetailRoutingFragmentKey, UUID uuid, EcUuidType ecUuidType, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = eventDetailRoutingFragmentKey.id;
        }
        if ((i & 2) != 0) {
            ecUuidType = eventDetailRoutingFragmentKey.type;
        }
        if ((i & 4) != 0) {
            str = eventDetailRoutingFragmentKey.entryPoint;
        }
        if ((i & 8) != 0) {
            z = eventDetailRoutingFragmentKey.isFromHubPill;
        }
        return eventDetailRoutingFragmentKey.copy(uuid, ecUuidType, str, z);
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
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsFromHubPill() {
        return this.isFromHubPill;
    }

    public final EventDetailRoutingFragmentKey copy(UUID id, EcUuidType type2, String entryPoint, boolean isFromHubPill) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return new EventDetailRoutingFragmentKey(id, type2, entryPoint, isFromHubPill);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventDetailRoutingFragmentKey)) {
            return false;
        }
        EventDetailRoutingFragmentKey eventDetailRoutingFragmentKey = (EventDetailRoutingFragmentKey) other;
        return Intrinsics.areEqual(this.id, eventDetailRoutingFragmentKey.id) && this.type == eventDetailRoutingFragmentKey.type && Intrinsics.areEqual(this.entryPoint, eventDetailRoutingFragmentKey.entryPoint) && this.isFromHubPill == eventDetailRoutingFragmentKey.isFromHubPill;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.entryPoint.hashCode()) * 31) + Boolean.hashCode(this.isFromHubPill);
    }

    public String toString() {
        return "EventDetailRoutingFragmentKey(id=" + this.id + ", type=" + this.type + ", entryPoint=" + this.entryPoint + ", isFromHubPill=" + this.isFromHubPill + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.id);
        dest.writeString(this.type.name());
        dest.writeString(this.entryPoint);
        dest.writeInt(this.isFromHubPill ? 1 : 0);
    }

    public EventDetailRoutingFragmentKey(UUID id, EcUuidType type2, String entryPoint, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.id = id;
        this.type = type2;
        this.entryPoint = entryPoint;
        this.isFromHubPill = z;
    }

    public final UUID getId() {
        return this.id;
    }

    public final EcUuidType getType() {
        return this.type;
    }

    public /* synthetic */ EventDetailRoutingFragmentKey(UUID uuid, EcUuidType ecUuidType, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, ecUuidType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean isFromHubPill() {
        return this.isFromHubPill;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }
}
