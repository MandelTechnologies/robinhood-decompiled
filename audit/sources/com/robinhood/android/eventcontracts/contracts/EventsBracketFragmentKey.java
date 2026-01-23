package com.robinhood.android.eventcontracts.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractsNavigationKeys.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/contracts/EventsBracketFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "topicId", "Ljava/util/UUID;", "bracketId", "source", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;)V", "getTopicId", "()Ljava/util/UUID;", "getBracketId", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventsBracketFragmentKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<EventsBracketFragmentKey> CREATOR = new Creator();
    private final UUID bracketId;
    private final String source;
    private final UUID topicId;

    /* compiled from: EventContractsNavigationKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EventsBracketFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventsBracketFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EventsBracketFragmentKey((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventsBracketFragmentKey[] newArray(int i) {
            return new EventsBracketFragmentKey[i];
        }
    }

    public static /* synthetic */ EventsBracketFragmentKey copy$default(EventsBracketFragmentKey eventsBracketFragmentKey, UUID uuid, UUID uuid2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = eventsBracketFragmentKey.topicId;
        }
        if ((i & 2) != 0) {
            uuid2 = eventsBracketFragmentKey.bracketId;
        }
        if ((i & 4) != 0) {
            str = eventsBracketFragmentKey.source;
        }
        return eventsBracketFragmentKey.copy(uuid, uuid2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getTopicId() {
        return this.topicId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getBracketId() {
        return this.bracketId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final EventsBracketFragmentKey copy(UUID topicId, UUID bracketId, String source) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        return new EventsBracketFragmentKey(topicId, bracketId, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsBracketFragmentKey)) {
            return false;
        }
        EventsBracketFragmentKey eventsBracketFragmentKey = (EventsBracketFragmentKey) other;
        return Intrinsics.areEqual(this.topicId, eventsBracketFragmentKey.topicId) && Intrinsics.areEqual(this.bracketId, eventsBracketFragmentKey.bracketId) && Intrinsics.areEqual(this.source, eventsBracketFragmentKey.source);
    }

    public int hashCode() {
        UUID uuid = this.topicId;
        int iHashCode = (((uuid == null ? 0 : uuid.hashCode()) * 31) + this.bracketId.hashCode()) * 31;
        String str = this.source;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EventsBracketFragmentKey(topicId=" + this.topicId + ", bracketId=" + this.bracketId + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.topicId);
        dest.writeSerializable(this.bracketId);
        dest.writeString(this.source);
    }

    public EventsBracketFragmentKey(UUID uuid, UUID bracketId, String str) {
        Intrinsics.checkNotNullParameter(bracketId, "bracketId");
        this.topicId = uuid;
        this.bracketId = bracketId;
        this.source = str;
    }

    public /* synthetic */ EventsBracketFragmentKey(UUID uuid, UUID uuid2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, (i & 4) != 0 ? null : str);
    }

    public final UUID getTopicId() {
        return this.topicId;
    }

    public final UUID getBracketId() {
        return this.bracketId;
    }

    public final String getSource() {
        return this.source;
    }
}
