package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.InternalHeartbeatEndEvent;
import com.mux.stats.sdk.core.events.playback.InternalHeartbeatEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.ViewData;

/* loaded from: classes27.dex */
public class InternalHeartbeatTracker extends BaseTracker {

    /* renamed from: a */
    private boolean f1092a;

    public InternalHeartbeatTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1092a = false;
    }

    /* renamed from: a */
    private void m1108a(PlayerData playerData, ViewData viewData) {
        if (this.f1092a) {
            this.f1092a = false;
            InternalHeartbeatEndEvent internalHeartbeatEndEvent = new InternalHeartbeatEndEvent(playerData);
            internalHeartbeatEndEvent.setViewData(viewData);
            dispatch(internalHeartbeatEndEvent);
        }
    }

    /* renamed from: b */
    private void m1109b(PlayerData playerData, ViewData viewData) {
        InternalHeartbeatEvent internalHeartbeatEvent = new InternalHeartbeatEvent(playerData);
        internalHeartbeatEvent.setViewData(viewData);
        dispatch(internalHeartbeatEvent);
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) {
        String type2 = playbackEvent.getType();
        type2.getClass();
        switch (type2) {
            case "adplaying":
            case "playing":
                this.f1092a = true;
                m1109b(playbackEvent.getPlayerData(), playbackEvent.getViewData());
                break;
            case "adplay":
            case "play":
            case "adbreakstart":
                PlayerData playerData = playbackEvent.getPlayerData();
                ViewData viewData = playbackEvent.getViewData();
                if (!this.f1092a) {
                    this.f1092a = true;
                    m1109b(playerData, viewData);
                    break;
                }
                break;
            case "rebufferend":
            case "rebufferstart":
            case "timeupdate":
                if (this.f1092a) {
                    m1109b(playbackEvent.getPlayerData(), playbackEvent.getViewData());
                    break;
                }
                break;
            case "adended":
            case "adpause":
            case "ended":
            case "pause":
            case "viewend":
            case "adbreakend":
                m1108a(playbackEvent.getPlayerData(), playbackEvent.getViewData());
                break;
            case "seeked":
                if (playbackEvent.getPlayerData().getPlayerIsPaused().booleanValue()) {
                    m1108a(playbackEvent.getPlayerData(), playbackEvent.getViewData());
                    break;
                }
                break;
        }
    }
}
