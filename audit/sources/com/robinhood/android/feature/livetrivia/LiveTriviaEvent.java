package com.robinhood.android.feature.livetrivia;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: LiveTriviaEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent;", "", "<init>", "()V", "DismissView", "PlaybackCatchupEvent", "SetTriviaEventReminder", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$DismissView;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$PlaybackCatchupEvent;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$SetTriviaEventReminder;", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public abstract class LiveTriviaEvent {
    public static final int $stable = 0;

    public /* synthetic */ LiveTriviaEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: LiveTriviaEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$DismissView;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissView extends LiveTriviaEvent {
        public static final int $stable = 0;
        public static final DismissView INSTANCE = new DismissView();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissView);
        }

        public int hashCode() {
            return 1399477305;
        }

        public String toString() {
            return "DismissView";
        }

        private DismissView() {
            super(null);
        }
    }

    private LiveTriviaEvent() {
    }

    /* compiled from: LiveTriviaEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$PlaybackCatchupEvent;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent;", "seekToMs", "", "<init>", "(J)V", "getSeekToMs", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PlaybackCatchupEvent extends LiveTriviaEvent {
        public static final int $stable = 0;
        private final long seekToMs;

        public static /* synthetic */ PlaybackCatchupEvent copy$default(PlaybackCatchupEvent playbackCatchupEvent, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = playbackCatchupEvent.seekToMs;
            }
            return playbackCatchupEvent.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getSeekToMs() {
            return this.seekToMs;
        }

        public final PlaybackCatchupEvent copy(long seekToMs) {
            return new PlaybackCatchupEvent(seekToMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PlaybackCatchupEvent) && this.seekToMs == ((PlaybackCatchupEvent) other).seekToMs;
        }

        public int hashCode() {
            return Long.hashCode(this.seekToMs);
        }

        public String toString() {
            return "PlaybackCatchupEvent(seekToMs=" + this.seekToMs + ")";
        }

        public PlaybackCatchupEvent(long j) {
            super(null);
            this.seekToMs = j;
        }

        public final long getSeekToMs() {
            return this.seekToMs;
        }
    }

    /* compiled from: LiveTriviaEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$SetTriviaEventReminder;", "Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent;", "", "title", "description", "eventUrl", "j$/time/Instant", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lj$/time/Instant;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/android/feature/livetrivia/LiveTriviaEvent$SetTriviaEventReminder;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getEventUrl", "Lj$/time/Instant;", "getStartTime", "getEndTime", "feature-live-trivia_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SetTriviaEventReminder extends LiveTriviaEvent {
        public static final int $stable = 8;
        private final String description;
        private final Instant endTime;
        private final String eventUrl;
        private final Instant startTime;
        private final String title;

        public static /* synthetic */ SetTriviaEventReminder copy$default(SetTriviaEventReminder setTriviaEventReminder, String str, String str2, String str3, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setTriviaEventReminder.title;
            }
            if ((i & 2) != 0) {
                str2 = setTriviaEventReminder.description;
            }
            if ((i & 4) != 0) {
                str3 = setTriviaEventReminder.eventUrl;
            }
            if ((i & 8) != 0) {
                instant = setTriviaEventReminder.startTime;
            }
            if ((i & 16) != 0) {
                instant2 = setTriviaEventReminder.endTime;
            }
            Instant instant3 = instant2;
            String str4 = str3;
            return setTriviaEventReminder.copy(str, str2, str4, instant, instant3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEventUrl() {
            return this.eventUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final Instant getStartTime() {
            return this.startTime;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getEndTime() {
            return this.endTime;
        }

        public final SetTriviaEventReminder copy(String title, String description, String eventUrl, Instant startTime, Instant endTime) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new SetTriviaEventReminder(title, description, eventUrl, startTime, endTime);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetTriviaEventReminder)) {
                return false;
            }
            SetTriviaEventReminder setTriviaEventReminder = (SetTriviaEventReminder) other;
            return Intrinsics.areEqual(this.title, setTriviaEventReminder.title) && Intrinsics.areEqual(this.description, setTriviaEventReminder.description) && Intrinsics.areEqual(this.eventUrl, setTriviaEventReminder.eventUrl) && Intrinsics.areEqual(this.startTime, setTriviaEventReminder.startTime) && Intrinsics.areEqual(this.endTime, setTriviaEventReminder.endTime);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.description.hashCode()) * 31;
            String str = this.eventUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Instant instant = this.startTime;
            int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
            Instant instant2 = this.endTime;
            return iHashCode3 + (instant2 != null ? instant2.hashCode() : 0);
        }

        public String toString() {
            return "SetTriviaEventReminder(title=" + this.title + ", description=" + this.description + ", eventUrl=" + this.eventUrl + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getEventUrl() {
            return this.eventUrl;
        }

        public final Instant getStartTime() {
            return this.startTime;
        }

        public final Instant getEndTime() {
            return this.endTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetTriviaEventReminder(String title, String description, String str, Instant instant, Instant instant2) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
            this.eventUrl = str;
            this.startTime = instant;
            this.endTime = instant2;
        }
    }
}
