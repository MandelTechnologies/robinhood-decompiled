package com.mux.stats.sdk.core.events.playback;

import com.mux.stats.sdk.core.model.PlayerData;

/* loaded from: classes27.dex */
public class AdBreakEndEvent extends AdEvent {
    public AdBreakEndEvent(PlayerData playerData) {
        super(playerData);
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public String getType() {
        return "adbreakend";
    }
}
