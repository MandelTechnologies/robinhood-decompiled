package com.mux.stats.sdk.core.events.playback;

import com.mux.stats.sdk.core.model.PlayerData;

/* loaded from: classes27.dex */
public class SeekingEvent extends PlaybackEvent {
    public SeekingEvent(PlayerData playerData) {
        super(playerData);
        this.isSuppressed = true;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "seeking";
    }

    public void setIsSuppressed(boolean z) {
        this.isSuppressed = z;
    }
}
