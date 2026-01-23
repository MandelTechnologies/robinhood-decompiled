package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubNavBarEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarEvent;", "", "PushNewScreen", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarEvent$PushNewScreen;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface HubNavBarEvent {

    /* compiled from: HubNavBarEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarEvent$PushNewScreen;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarEvent;", "entryNodeId", "Ljava/util/UUID;", "entryPointIdentifier", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getEntryNodeId", "()Ljava/util/UUID;", "getEntryPointIdentifier", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PushNewScreen implements HubNavBarEvent {
        public static final int $stable = 8;
        private final UUID entryNodeId;
        private final String entryPointIdentifier;

        public static /* synthetic */ PushNewScreen copy$default(PushNewScreen pushNewScreen, UUID uuid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pushNewScreen.entryNodeId;
            }
            if ((i & 2) != 0) {
                str = pushNewScreen.entryPointIdentifier;
            }
            return pushNewScreen.copy(uuid, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEntryNodeId() {
            return this.entryNodeId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }

        public final PushNewScreen copy(UUID entryNodeId, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(entryNodeId, "entryNodeId");
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
            return new PushNewScreen(entryNodeId, entryPointIdentifier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushNewScreen)) {
                return false;
            }
            PushNewScreen pushNewScreen = (PushNewScreen) other;
            return Intrinsics.areEqual(this.entryNodeId, pushNewScreen.entryNodeId) && Intrinsics.areEqual(this.entryPointIdentifier, pushNewScreen.entryPointIdentifier);
        }

        public int hashCode() {
            return (this.entryNodeId.hashCode() * 31) + this.entryPointIdentifier.hashCode();
        }

        public String toString() {
            return "PushNewScreen(entryNodeId=" + this.entryNodeId + ", entryPointIdentifier=" + this.entryPointIdentifier + ")";
        }

        public PushNewScreen(UUID entryNodeId, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(entryNodeId, "entryNodeId");
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
            this.entryNodeId = entryNodeId;
            this.entryPointIdentifier = entryPointIdentifier;
        }

        public final UUID getEntryNodeId() {
            return this.entryNodeId;
        }

        public final String getEntryPointIdentifier() {
            return this.entryPointIdentifier;
        }
    }
}
