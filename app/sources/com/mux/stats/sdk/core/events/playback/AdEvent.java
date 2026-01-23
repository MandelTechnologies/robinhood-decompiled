package com.mux.stats.sdk.core.events.playback;

import com.mux.stats.sdk.core.model.PlayerData;

/* loaded from: classes27.dex */
public abstract class AdEvent extends PlaybackEvent {
    public AdEvent(PlayerData playerData) {
        super(playerData);
    }

    @Override // com.mux.stats.sdk.core.events.playback.PlaybackEvent
    public boolean isAd() {
        return true;
    }
}
