package com.robinhood.android.shareholderexperience.intro;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareholderExperienceIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroViewState;", "", "isLoading", "", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroViewState$Event;", "<init>", "(ZLcom/robinhood/udf/UiEvent;)V", "()Z", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Event", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShareholderExperienceIntroViewState {
    public static final int $stable = 8;
    private final UiEvent<Event> event;
    private final boolean isLoading;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareholderExperienceIntroViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareholderExperienceIntroViewState copy$default(ShareholderExperienceIntroViewState shareholderExperienceIntroViewState, boolean z, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shareholderExperienceIntroViewState.isLoading;
        }
        if ((i & 2) != 0) {
            uiEvent = shareholderExperienceIntroViewState.event;
        }
        return shareholderExperienceIntroViewState.copy(z, uiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final UiEvent<Event> component2() {
        return this.event;
    }

    public final ShareholderExperienceIntroViewState copy(boolean isLoading, UiEvent<Event> event) {
        return new ShareholderExperienceIntroViewState(isLoading, event);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareholderExperienceIntroViewState)) {
            return false;
        }
        ShareholderExperienceIntroViewState shareholderExperienceIntroViewState = (ShareholderExperienceIntroViewState) other;
        return this.isLoading == shareholderExperienceIntroViewState.isLoading && Intrinsics.areEqual(this.event, shareholderExperienceIntroViewState.event);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        UiEvent<Event> uiEvent = this.event;
        return iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode());
    }

    public String toString() {
        return "ShareholderExperienceIntroViewState(isLoading=" + this.isLoading + ", event=" + this.event + ")";
    }

    public ShareholderExperienceIntroViewState(boolean z, UiEvent<Event> uiEvent) {
        this.isLoading = z;
        this.event = uiEvent;
    }

    public /* synthetic */ ShareholderExperienceIntroViewState(boolean z, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : uiEvent);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UiEvent<Event> getEvent() {
        return this.event;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderExperienceIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/intro/ShareholderExperienceIntroViewState$Event;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "ERROR", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Event {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event ACCEPTED = new Event("ACCEPTED", 0);
        public static final Event ERROR = new Event("ERROR", 1);

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{ACCEPTED, ERROR};
        }

        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        private Event(String str, int i) {
        }

        static {
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventArr$values);
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }
}
