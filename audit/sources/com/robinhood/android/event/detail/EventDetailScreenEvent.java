package com.robinhood.android.event.detail;

import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailScreenEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "", "StartTrade", "ShowAttestation", "StartOnboarding", "ShowEventFaq", "ShowViewAll", "PollBottomSheet", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent$PollBottomSheet;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent$ShowAttestation;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent$ShowEventFaq;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent$ShowViewAll;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent$StartOnboarding;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent$StartTrade;", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EventDetailScreenEvent {

    /* compiled from: EventDetailScreenEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent$StartTrade;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "eventTradeOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "<init>", "(Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", "getEventTradeOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartTrade implements EventDetailScreenEvent {
        public static final int $stable = 8;
        private final EventTradeOrderContext eventTradeOrderContext;

        public static /* synthetic */ StartTrade copy$default(StartTrade startTrade, EventTradeOrderContext eventTradeOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                eventTradeOrderContext = startTrade.eventTradeOrderContext;
            }
            return startTrade.copy(eventTradeOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final EventTradeOrderContext getEventTradeOrderContext() {
            return this.eventTradeOrderContext;
        }

        public final StartTrade copy(EventTradeOrderContext eventTradeOrderContext) {
            Intrinsics.checkNotNullParameter(eventTradeOrderContext, "eventTradeOrderContext");
            return new StartTrade(eventTradeOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartTrade) && Intrinsics.areEqual(this.eventTradeOrderContext, ((StartTrade) other).eventTradeOrderContext);
        }

        public int hashCode() {
            return this.eventTradeOrderContext.hashCode();
        }

        public String toString() {
            return "StartTrade(eventTradeOrderContext=" + this.eventTradeOrderContext + ")";
        }

        public StartTrade(EventTradeOrderContext eventTradeOrderContext) {
            Intrinsics.checkNotNullParameter(eventTradeOrderContext, "eventTradeOrderContext");
            this.eventTradeOrderContext = eventTradeOrderContext;
        }

        public final EventTradeOrderContext getEventTradeOrderContext() {
            return this.eventTradeOrderContext;
        }
    }

    /* compiled from: EventDetailScreenEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent$ShowAttestation;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "attestationType", "", "redirectOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", "getAttestationType", "()Ljava/lang/String;", "getRedirectOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAttestation implements EventDetailScreenEvent {
        public static final int $stable = 8;
        private final String attestationType;
        private final EventTradeOrderContext redirectOrderContext;

        public static /* synthetic */ ShowAttestation copy$default(ShowAttestation showAttestation, String str, EventTradeOrderContext eventTradeOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showAttestation.attestationType;
            }
            if ((i & 2) != 0) {
                eventTradeOrderContext = showAttestation.redirectOrderContext;
            }
            return showAttestation.copy(str, eventTradeOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAttestationType() {
            return this.attestationType;
        }

        /* renamed from: component2, reason: from getter */
        public final EventTradeOrderContext getRedirectOrderContext() {
            return this.redirectOrderContext;
        }

        public final ShowAttestation copy(String attestationType, EventTradeOrderContext redirectOrderContext) {
            Intrinsics.checkNotNullParameter(attestationType, "attestationType");
            return new ShowAttestation(attestationType, redirectOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAttestation)) {
                return false;
            }
            ShowAttestation showAttestation = (ShowAttestation) other;
            return Intrinsics.areEqual(this.attestationType, showAttestation.attestationType) && Intrinsics.areEqual(this.redirectOrderContext, showAttestation.redirectOrderContext);
        }

        public int hashCode() {
            int iHashCode = this.attestationType.hashCode() * 31;
            EventTradeOrderContext eventTradeOrderContext = this.redirectOrderContext;
            return iHashCode + (eventTradeOrderContext == null ? 0 : eventTradeOrderContext.hashCode());
        }

        public String toString() {
            return "ShowAttestation(attestationType=" + this.attestationType + ", redirectOrderContext=" + this.redirectOrderContext + ")";
        }

        public ShowAttestation(String attestationType, EventTradeOrderContext eventTradeOrderContext) {
            Intrinsics.checkNotNullParameter(attestationType, "attestationType");
            this.attestationType = attestationType;
            this.redirectOrderContext = eventTradeOrderContext;
        }

        public final String getAttestationType() {
            return this.attestationType;
        }

        public final EventTradeOrderContext getRedirectOrderContext() {
            return this.redirectOrderContext;
        }
    }

    /* compiled from: EventDetailScreenEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent$StartOnboarding;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "eventId", "Ljava/util/UUID;", "redirectOrderContext", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", "getEventId", "()Ljava/util/UUID;", "getRedirectOrderContext", "()Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StartOnboarding implements EventDetailScreenEvent {
        public static final int $stable = 8;
        private final UUID eventId;
        private final EventTradeOrderContext redirectOrderContext;

        public static /* synthetic */ StartOnboarding copy$default(StartOnboarding startOnboarding, UUID uuid, EventTradeOrderContext eventTradeOrderContext, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = startOnboarding.eventId;
            }
            if ((i & 2) != 0) {
                eventTradeOrderContext = startOnboarding.redirectOrderContext;
            }
            return startOnboarding.copy(uuid, eventTradeOrderContext);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final EventTradeOrderContext getRedirectOrderContext() {
            return this.redirectOrderContext;
        }

        public final StartOnboarding copy(UUID eventId, EventTradeOrderContext redirectOrderContext) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new StartOnboarding(eventId, redirectOrderContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartOnboarding)) {
                return false;
            }
            StartOnboarding startOnboarding = (StartOnboarding) other;
            return Intrinsics.areEqual(this.eventId, startOnboarding.eventId) && Intrinsics.areEqual(this.redirectOrderContext, startOnboarding.redirectOrderContext);
        }

        public int hashCode() {
            int iHashCode = this.eventId.hashCode() * 31;
            EventTradeOrderContext eventTradeOrderContext = this.redirectOrderContext;
            return iHashCode + (eventTradeOrderContext == null ? 0 : eventTradeOrderContext.hashCode());
        }

        public String toString() {
            return "StartOnboarding(eventId=" + this.eventId + ", redirectOrderContext=" + this.redirectOrderContext + ")";
        }

        public StartOnboarding(UUID eventId, EventTradeOrderContext eventTradeOrderContext) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.eventId = eventId;
            this.redirectOrderContext = eventTradeOrderContext;
        }

        public /* synthetic */ StartOnboarding(UUID uuid, EventTradeOrderContext eventTradeOrderContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, (i & 2) != 0 ? null : eventTradeOrderContext);
        }

        public final UUID getEventId() {
            return this.eventId;
        }

        public final EventTradeOrderContext getRedirectOrderContext() {
            return this.redirectOrderContext;
        }
    }

    /* compiled from: EventDetailScreenEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent$ShowEventFaq;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowEventFaq implements EventDetailScreenEvent {
        public static final int $stable = 0;
        public static final ShowEventFaq INSTANCE = new ShowEventFaq();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowEventFaq);
        }

        public int hashCode() {
            return -966220721;
        }

        public String toString() {
            return "ShowEventFaq";
        }

        private ShowEventFaq() {
        }
    }

    /* compiled from: EventDetailScreenEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent$ShowViewAll;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "eventId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getEventId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowViewAll implements EventDetailScreenEvent {
        public static final int $stable = 8;
        private final UUID eventId;

        public static /* synthetic */ ShowViewAll copy$default(ShowViewAll showViewAll, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = showViewAll.eventId;
            }
            return showViewAll.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEventId() {
            return this.eventId;
        }

        public final ShowViewAll copy(UUID eventId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new ShowViewAll(eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowViewAll) && Intrinsics.areEqual(this.eventId, ((ShowViewAll) other).eventId);
        }

        public int hashCode() {
            return this.eventId.hashCode();
        }

        public String toString() {
            return "ShowViewAll(eventId=" + this.eventId + ")";
        }

        public ShowViewAll(UUID eventId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.eventId = eventId;
        }

        public final UUID getEventId() {
            return this.eventId;
        }
    }

    /* compiled from: EventDetailScreenEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/event/detail/EventDetailScreenEvent$PollBottomSheet;", "Lcom/robinhood/android/event/detail/EventDetailScreenEvent;", "eventId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getEventId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-event-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PollBottomSheet implements EventDetailScreenEvent {
        public static final int $stable = 8;
        private final UUID eventId;

        public static /* synthetic */ PollBottomSheet copy$default(PollBottomSheet pollBottomSheet, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pollBottomSheet.eventId;
            }
            return pollBottomSheet.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getEventId() {
            return this.eventId;
        }

        public final PollBottomSheet copy(UUID eventId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new PollBottomSheet(eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PollBottomSheet) && Intrinsics.areEqual(this.eventId, ((PollBottomSheet) other).eventId);
        }

        public int hashCode() {
            return this.eventId.hashCode();
        }

        public String toString() {
            return "PollBottomSheet(eventId=" + this.eventId + ")";
        }

        public PollBottomSheet(UUID eventId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.eventId = eventId;
        }

        public final UUID getEventId() {
            return this.eventId;
        }
    }
}
