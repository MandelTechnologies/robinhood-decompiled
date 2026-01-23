package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.entries;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.event.ParticipantChangedOperation;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParticipantChangedEntry.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantChangedEntry;", "", "participant", "Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "operation", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/ParticipantChangedOperation;", "displayName", "", "menuMetadata", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/ParticipantChangedOperation;Ljava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;)V", "getParticipant", "()Lcom/salesforce/android/smi/network/data/domain/participant/CoreParticipant;", "getOperation", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/ParticipantChangedOperation;", "getDisplayName", "()Ljava/lang/String;", "getMenuMetadata", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/event/entries/ParticipantClientMenu;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ParticipantChangedEntry {
    private final String displayName;
    private final ParticipantClientMenu menuMetadata;
    private final ParticipantChangedOperation operation;
    private final CoreParticipant participant;

    public static /* synthetic */ ParticipantChangedEntry copy$default(ParticipantChangedEntry participantChangedEntry, CoreParticipant coreParticipant, ParticipantChangedOperation participantChangedOperation, String str, ParticipantClientMenu participantClientMenu, int i, Object obj) {
        if ((i & 1) != 0) {
            coreParticipant = participantChangedEntry.participant;
        }
        if ((i & 2) != 0) {
            participantChangedOperation = participantChangedEntry.operation;
        }
        if ((i & 4) != 0) {
            str = participantChangedEntry.displayName;
        }
        if ((i & 8) != 0) {
            participantClientMenu = participantChangedEntry.menuMetadata;
        }
        return participantChangedEntry.copy(coreParticipant, participantChangedOperation, str, participantClientMenu);
    }

    /* renamed from: component1, reason: from getter */
    public final CoreParticipant getParticipant() {
        return this.participant;
    }

    /* renamed from: component2, reason: from getter */
    public final ParticipantChangedOperation getOperation() {
        return this.operation;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final ParticipantClientMenu getMenuMetadata() {
        return this.menuMetadata;
    }

    public final ParticipantChangedEntry copy(CoreParticipant participant, ParticipantChangedOperation operation2, String displayName, ParticipantClientMenu menuMetadata) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        Intrinsics.checkNotNullParameter(operation2, "operation");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        return new ParticipantChangedEntry(participant, operation2, displayName, menuMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParticipantChangedEntry)) {
            return false;
        }
        ParticipantChangedEntry participantChangedEntry = (ParticipantChangedEntry) other;
        return Intrinsics.areEqual(this.participant, participantChangedEntry.participant) && this.operation == participantChangedEntry.operation && Intrinsics.areEqual(this.displayName, participantChangedEntry.displayName) && Intrinsics.areEqual(this.menuMetadata, participantChangedEntry.menuMetadata);
    }

    public int hashCode() {
        int iHashCode = ((((this.participant.hashCode() * 31) + this.operation.hashCode()) * 31) + this.displayName.hashCode()) * 31;
        ParticipantClientMenu participantClientMenu = this.menuMetadata;
        return iHashCode + (participantClientMenu == null ? 0 : participantClientMenu.hashCode());
    }

    public String toString() {
        return "ParticipantChangedEntry(participant=" + this.participant + ", operation=" + this.operation + ", displayName=" + this.displayName + ", menuMetadata=" + this.menuMetadata + ")";
    }

    public ParticipantChangedEntry(CoreParticipant participant, ParticipantChangedOperation operation2, String displayName, ParticipantClientMenu participantClientMenu) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        Intrinsics.checkNotNullParameter(operation2, "operation");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.participant = participant;
        this.operation = operation2;
        this.displayName = displayName;
        this.menuMetadata = participantClientMenu;
    }

    public /* synthetic */ ParticipantChangedEntry(CoreParticipant coreParticipant, ParticipantChangedOperation participantChangedOperation, String str, ParticipantClientMenu participantClientMenu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coreParticipant, participantChangedOperation, str, (i & 8) != 0 ? null : participantClientMenu);
    }

    public final CoreParticipant getParticipant() {
        return this.participant;
    }

    public final ParticipantChangedOperation getOperation() {
        return this.operation;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final ParticipantClientMenu getMenuMetadata() {
        return this.menuMetadata;
    }
}
