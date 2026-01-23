package com.robinhood.android.futures.eventbrackets.screen.tournament.switcher;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: EventsTournamentSwitcherData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData;", "", "eventTopics", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData$EventTopic;", "selectedTopicId", "Ljava/util/UUID;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/util/UUID;)V", "getEventTopics", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedTopicId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "EventTopic", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EventsTournamentSwitcherData {
    public static final int $stable = 8;
    private final ImmutableList<EventTopic> eventTopics;
    private final UUID selectedTopicId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventsTournamentSwitcherData copy$default(EventsTournamentSwitcherData eventsTournamentSwitcherData, ImmutableList immutableList, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = eventsTournamentSwitcherData.eventTopics;
        }
        if ((i & 2) != 0) {
            uuid = eventsTournamentSwitcherData.selectedTopicId;
        }
        return eventsTournamentSwitcherData.copy(immutableList, uuid);
    }

    public final ImmutableList<EventTopic> component1() {
        return this.eventTopics;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getSelectedTopicId() {
        return this.selectedTopicId;
    }

    public final EventsTournamentSwitcherData copy(ImmutableList<EventTopic> eventTopics, UUID selectedTopicId) {
        Intrinsics.checkNotNullParameter(eventTopics, "eventTopics");
        Intrinsics.checkNotNullParameter(selectedTopicId, "selectedTopicId");
        return new EventsTournamentSwitcherData(eventTopics, selectedTopicId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsTournamentSwitcherData)) {
            return false;
        }
        EventsTournamentSwitcherData eventsTournamentSwitcherData = (EventsTournamentSwitcherData) other;
        return Intrinsics.areEqual(this.eventTopics, eventsTournamentSwitcherData.eventTopics) && Intrinsics.areEqual(this.selectedTopicId, eventsTournamentSwitcherData.selectedTopicId);
    }

    public int hashCode() {
        return (this.eventTopics.hashCode() * 31) + this.selectedTopicId.hashCode();
    }

    public String toString() {
        return "EventsTournamentSwitcherData(eventTopics=" + this.eventTopics + ", selectedTopicId=" + this.selectedTopicId + ")";
    }

    public EventsTournamentSwitcherData(ImmutableList<EventTopic> eventTopics, UUID selectedTopicId) {
        Intrinsics.checkNotNullParameter(eventTopics, "eventTopics");
        Intrinsics.checkNotNullParameter(selectedTopicId, "selectedTopicId");
        this.eventTopics = eventTopics;
        this.selectedTopicId = selectedTopicId;
    }

    public final ImmutableList<EventTopic> getEventTopics() {
        return this.eventTopics;
    }

    public final UUID getSelectedTopicId() {
        return this.selectedTopicId;
    }

    /* compiled from: EventsTournamentSwitcherData.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/futures/eventbrackets/screen/tournament/switcher/EventsTournamentSwitcherData$EventTopic;", "", "name", "Lcom/robinhood/utils/resource/StringResource;", "topicId", "Ljava/util/UUID;", "bracketId", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/UUID;Ljava/util/UUID;)V", "getName", "()Lcom/robinhood/utils/resource/StringResource;", "getTopicId", "()Ljava/util/UUID;", "getBracketId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-event-brackets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EventTopic {
        public static final int $stable = 8;
        private final UUID bracketId;
        private final StringResource name;
        private final UUID topicId;

        public static /* synthetic */ EventTopic copy$default(EventTopic eventTopic, StringResource stringResource, UUID uuid, UUID uuid2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = eventTopic.name;
            }
            if ((i & 2) != 0) {
                uuid = eventTopic.topicId;
            }
            if ((i & 4) != 0) {
                uuid2 = eventTopic.bracketId;
            }
            return eventTopic.copy(stringResource, uuid, uuid2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getTopicId() {
            return this.topicId;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getBracketId() {
            return this.bracketId;
        }

        public final EventTopic copy(StringResource name, UUID topicId, UUID bracketId) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(topicId, "topicId");
            Intrinsics.checkNotNullParameter(bracketId, "bracketId");
            return new EventTopic(name, topicId, bracketId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventTopic)) {
                return false;
            }
            EventTopic eventTopic = (EventTopic) other;
            return Intrinsics.areEqual(this.name, eventTopic.name) && Intrinsics.areEqual(this.topicId, eventTopic.topicId) && Intrinsics.areEqual(this.bracketId, eventTopic.bracketId);
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.topicId.hashCode()) * 31) + this.bracketId.hashCode();
        }

        public String toString() {
            return "EventTopic(name=" + this.name + ", topicId=" + this.topicId + ", bracketId=" + this.bracketId + ")";
        }

        public EventTopic(StringResource name, UUID topicId, UUID bracketId) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(topicId, "topicId");
            Intrinsics.checkNotNullParameter(bracketId, "bracketId");
            this.name = name;
            this.topicId = topicId;
            this.bracketId = bracketId;
        }

        public final StringResource getName() {
            return this.name;
        }

        public final UUID getTopicId() {
            return this.topicId;
        }

        public final UUID getBracketId() {
            return this.bracketId;
        }
    }
}
