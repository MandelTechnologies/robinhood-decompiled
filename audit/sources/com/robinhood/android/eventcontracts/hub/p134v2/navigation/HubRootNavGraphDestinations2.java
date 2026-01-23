package com.robinhood.android.eventcontracts.hub.p134v2.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubRootNavGraphDestinations.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;", "<init>", "()V", "Args", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.navigation.HubMainDest, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubRootNavGraphDestinations2 extends ComposableDestinationWithArgs<Args> {
    public static final HubRootNavGraphDestinations2 INSTANCE = new HubRootNavGraphDestinations2();
    public static final int $stable = ComposableDestinationWithArgs.$stable;

    private HubRootNavGraphDestinations2() {
        super("hub_main_dest", Args.class, null, null, null, 28, null);
    }

    /* compiled from: HubRootNavGraphDestinations.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/navigation/HubMainDest$Args;", "Landroid/os/Parcelable;", "entryPointIdentifier", "", "entryNavNodeId", "Ljava/util/UUID;", "defaultSelectedNodeId", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)V", "getEntryPointIdentifier", "()Ljava/lang/String;", "getEntryNavNodeId", "()Ljava/util/UUID;", "getDefaultSelectedNodeId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.navigation.HubMainDest$Args, reason: from toString */
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID defaultSelectedNodeId;
        private final UUID entryNavNodeId;
        private final String entryPointIdentifier;

        /* compiled from: HubRootNavGraphDestinations.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.eventcontracts.hub.v2.navigation.HubMainDest$Args$Creator */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), (UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.entryPointIdentifier;
            }
            if ((i & 2) != 0) {
                uuid = args.entryNavNodeId;
            }
            if ((i & 4) != 0) {
                uuid2 = args.defaultSelectedNodeId;
            }
            return args.copy(str, uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getEntryNavNodeId() {
            return this.entryNavNodeId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getDefaultSelectedNodeId() {
            return this.defaultSelectedNodeId;
        }

        public final Args copy(String entryPointIdentifier, UUID entryNavNodeId, UUID defaultSelectedNodeId) {
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
            return new Args(entryPointIdentifier, entryNavNodeId, defaultSelectedNodeId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.entryPointIdentifier, args.entryPointIdentifier) && Intrinsics.areEqual(this.entryNavNodeId, args.entryNavNodeId) && Intrinsics.areEqual(this.defaultSelectedNodeId, args.defaultSelectedNodeId);
        }

        public int hashCode() {
            int iHashCode = this.entryPointIdentifier.hashCode() * 31;
            UUID uuid = this.entryNavNodeId;
            int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
            UUID uuid2 = this.defaultSelectedNodeId;
            return iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0);
        }

        public String toString() {
            return "Args(entryPointIdentifier=" + this.entryPointIdentifier + ", entryNavNodeId=" + this.entryNavNodeId + ", defaultSelectedNodeId=" + this.defaultSelectedNodeId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.entryPointIdentifier);
            dest.writeSerializable(this.entryNavNodeId);
            dest.writeSerializable(this.defaultSelectedNodeId);
        }

        public Args(String entryPointIdentifier, UUID uuid, UUID uuid2) {
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
            this.entryPointIdentifier = entryPointIdentifier;
            this.entryNavNodeId = uuid;
            this.defaultSelectedNodeId = uuid2;
        }

        public /* synthetic */ Args(String str, UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, uuid, (i & 4) != 0 ? null : uuid2);
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final UUID getEntryNavNodeId() {
            return this.entryNavNodeId;
        }

        public final UUID getDefaultSelectedNodeId() {
            return this.defaultSelectedNodeId;
        }
    }
}
