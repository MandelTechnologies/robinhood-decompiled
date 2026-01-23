package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public class EventRateExceedTrackableEvent extends TrackableEvent {
    public EventRateExceedTrackableEvent(TrackableEvent trackableEvent) {
        super("eventrateexceeded");
        getQuery().update(trackableEvent.getQuery());
    }
}
