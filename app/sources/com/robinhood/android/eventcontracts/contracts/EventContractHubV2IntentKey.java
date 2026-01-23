package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventContractHubV2IntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "initialNodeId", "Ljava/util/UUID;", "source", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getInitialNodeId", "()Ljava/util/UUID;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventContractHubV2IntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<EventContractHubV2IntentKey> CREATOR = new Creator();
    private final UUID initialNodeId;
    private final String source;

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EventContractHubV2IntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContractHubV2IntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventContractHubV2IntentKey((UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventContractHubV2IntentKey[] newArray(int i) {
            return new EventContractHubV2IntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventContractHubV2IntentKey() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EventContractHubV2IntentKey copy$default(EventContractHubV2IntentKey eventContractHubV2IntentKey, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = eventContractHubV2IntentKey.initialNodeId;
        }
        if ((i & 2) != 0) {
            str = eventContractHubV2IntentKey.source;
        }
        return eventContractHubV2IntentKey.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInitialNodeId() {
        return this.initialNodeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final EventContractHubV2IntentKey copy(UUID initialNodeId, String source) {
        return new EventContractHubV2IntentKey(initialNodeId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventContractHubV2IntentKey)) {
            return false;
        }
        EventContractHubV2IntentKey eventContractHubV2IntentKey = (EventContractHubV2IntentKey) other;
        return Intrinsics.areEqual(this.initialNodeId, eventContractHubV2IntentKey.initialNodeId) && Intrinsics.areEqual(this.source, eventContractHubV2IntentKey.source);
    }

    public int hashCode() {
        UUID uuid = this.initialNodeId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EventContractHubV2IntentKey(initialNodeId=" + this.initialNodeId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.initialNodeId);
        dest.writeString(this.source);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public EventContractHubV2IntentKey(UUID uuid, String str) {
        this.initialNodeId = uuid;
        this.source = str;
    }

    public /* synthetic */ EventContractHubV2IntentKey(UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, (i & 2) != 0 ? null : str);
    }

    public final UUID getInitialNodeId() {
        return this.initialNodeId;
    }

    public final String getSource() {
        return this.source;
    }
}
