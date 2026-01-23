package com.robinhood.android.engagement.goldevent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.gold_live_event.proto.p490v1.GetEventConfigurationResponse;

/* compiled from: LiveEventStreamViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/engagement/goldevent/LiveEventStreamViewState;", "", "eventConfiguration", "Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponse;", "playbackState", "Lcom/robinhood/android/engagement/goldevent/PlaybackState;", "<init>", "(Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponse;Lcom/robinhood/android/engagement/goldevent/PlaybackState;)V", "getEventConfiguration", "()Lmicrogram/contracts/gold_live_event/proto/v1/GetEventConfigurationResponse;", "getPlaybackState", "()Lcom/robinhood/android/engagement/goldevent/PlaybackState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-live-event-stream_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LiveEventStreamViewState {
    public static final int $stable = 8;
    private final GetEventConfigurationResponse eventConfiguration;
    private final LiveEventStreamViewState3 playbackState;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveEventStreamViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LiveEventStreamViewState copy$default(LiveEventStreamViewState liveEventStreamViewState, GetEventConfigurationResponse getEventConfigurationResponse, LiveEventStreamViewState3 liveEventStreamViewState3, int i, Object obj) {
        if ((i & 1) != 0) {
            getEventConfigurationResponse = liveEventStreamViewState.eventConfiguration;
        }
        if ((i & 2) != 0) {
            liveEventStreamViewState3 = liveEventStreamViewState.playbackState;
        }
        return liveEventStreamViewState.copy(getEventConfigurationResponse, liveEventStreamViewState3);
    }

    /* renamed from: component1, reason: from getter */
    public final GetEventConfigurationResponse getEventConfiguration() {
        return this.eventConfiguration;
    }

    /* renamed from: component2, reason: from getter */
    public final LiveEventStreamViewState3 getPlaybackState() {
        return this.playbackState;
    }

    public final LiveEventStreamViewState copy(GetEventConfigurationResponse eventConfiguration, LiveEventStreamViewState3 playbackState) {
        Intrinsics.checkNotNullParameter(eventConfiguration, "eventConfiguration");
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        return new LiveEventStreamViewState(eventConfiguration, playbackState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveEventStreamViewState)) {
            return false;
        }
        LiveEventStreamViewState liveEventStreamViewState = (LiveEventStreamViewState) other;
        return Intrinsics.areEqual(this.eventConfiguration, liveEventStreamViewState.eventConfiguration) && this.playbackState == liveEventStreamViewState.playbackState;
    }

    public int hashCode() {
        return (this.eventConfiguration.hashCode() * 31) + this.playbackState.hashCode();
    }

    public String toString() {
        return "LiveEventStreamViewState(eventConfiguration=" + this.eventConfiguration + ", playbackState=" + this.playbackState + ")";
    }

    public LiveEventStreamViewState(GetEventConfigurationResponse eventConfiguration, LiveEventStreamViewState3 playbackState) {
        Intrinsics.checkNotNullParameter(eventConfiguration, "eventConfiguration");
        Intrinsics.checkNotNullParameter(playbackState, "playbackState");
        this.eventConfiguration = eventConfiguration;
        this.playbackState = playbackState;
    }

    public /* synthetic */ LiveEventStreamViewState(GetEventConfigurationResponse getEventConfigurationResponse, LiveEventStreamViewState3 liveEventStreamViewState3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GetEventConfigurationResponse(null, false, null, null, null, null, 63, null) : getEventConfigurationResponse, (i & 2) != 0 ? LiveEventStreamViewState3.INITIALIZING : liveEventStreamViewState3);
    }

    public final GetEventConfigurationResponse getEventConfiguration() {
        return this.eventConfiguration;
    }

    public final LiveEventStreamViewState3 getPlaybackState() {
        return this.playbackState;
    }
}
