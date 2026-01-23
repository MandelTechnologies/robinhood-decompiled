package com.robinhood.store.event;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventGameDataContext.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/store/event/EventGameDataContext;", "", "eventId", "Ljava/util/UUID;", "homeId", "awayId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)V", "getEventId", "()Ljava/util/UUID;", "getHomeId", "getAwayId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EventGameDataContext {
    private final UUID awayId;
    private final UUID eventId;
    private final UUID homeId;

    public static /* synthetic */ EventGameDataContext copy$default(EventGameDataContext eventGameDataContext, UUID uuid, UUID uuid2, UUID uuid3, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = eventGameDataContext.eventId;
        }
        if ((i & 2) != 0) {
            uuid2 = eventGameDataContext.homeId;
        }
        if ((i & 4) != 0) {
            uuid3 = eventGameDataContext.awayId;
        }
        return eventGameDataContext.copy(uuid, uuid2, uuid3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getHomeId() {
        return this.homeId;
    }

    /* renamed from: component3, reason: from getter */
    public final UUID getAwayId() {
        return this.awayId;
    }

    public final EventGameDataContext copy(UUID eventId, UUID homeId, UUID awayId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(homeId, "homeId");
        Intrinsics.checkNotNullParameter(awayId, "awayId");
        return new EventGameDataContext(eventId, homeId, awayId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventGameDataContext)) {
            return false;
        }
        EventGameDataContext eventGameDataContext = (EventGameDataContext) other;
        return Intrinsics.areEqual(this.eventId, eventGameDataContext.eventId) && Intrinsics.areEqual(this.homeId, eventGameDataContext.homeId) && Intrinsics.areEqual(this.awayId, eventGameDataContext.awayId);
    }

    public int hashCode() {
        return (((this.eventId.hashCode() * 31) + this.homeId.hashCode()) * 31) + this.awayId.hashCode();
    }

    public String toString() {
        return "EventGameDataContext(eventId=" + this.eventId + ", homeId=" + this.homeId + ", awayId=" + this.awayId + ")";
    }

    public EventGameDataContext(UUID eventId, UUID homeId, UUID awayId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(homeId, "homeId");
        Intrinsics.checkNotNullParameter(awayId, "awayId");
        this.eventId = eventId;
        this.homeId = homeId;
        this.awayId = awayId;
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final UUID getHomeId() {
        return this.homeId;
    }

    public final UUID getAwayId() {
        return this.awayId;
    }
}
