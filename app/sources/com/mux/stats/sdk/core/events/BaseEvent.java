package com.mux.stats.sdk.core.events;

/* loaded from: classes27.dex */
public class BaseEvent implements IEvent {
    @Override // com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "BaseEvent";
    }

    @Override // com.mux.stats.sdk.core.events.IEvent
    public boolean isData() {
        return false;
    }

    @Override // com.mux.stats.sdk.core.events.IEvent
    public boolean isError() {
        return false;
    }

    @Override // com.mux.stats.sdk.core.events.IEvent
    public boolean isPlayback() {
        return false;
    }

    @Override // com.mux.stats.sdk.core.events.IEvent
    public boolean isSessionData() {
        return false;
    }

    @Override // com.mux.stats.sdk.core.events.IEvent
    public boolean isTrackable() {
        return false;
    }

    @Override // com.mux.stats.sdk.core.events.IEvent
    public boolean isViewMetric() {
        return false;
    }
}
