package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;

/* loaded from: classes27.dex */
public class BaseAdTracker extends BaseTracker {
    protected boolean isAdBreak;

    public BaseAdTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.isAdBreak = false;
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) {
        String type2 = playbackEvent.getType();
        type2.getClass();
        switch (type2) {
            case "playing":
            case "play":
            case "viewend":
            case "seeking":
                this.isAdBreak = false;
                break;
            case "adbreakstart":
                this.isAdBreak = true;
                break;
        }
    }
}
