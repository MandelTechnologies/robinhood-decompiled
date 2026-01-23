package com.mux.stats.sdk.core.events.playback;

import com.mux.stats.sdk.core.events.BaseEvent;
import com.mux.stats.sdk.core.model.AdData;
import com.mux.stats.sdk.core.model.BandwidthMetricData;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;

/* loaded from: classes27.dex */
public class PlaybackEvent extends BaseEvent implements IPlaybackEvent {
    protected AdData adData;
    protected BandwidthMetricData bandwidthMetricData;
    protected boolean isSuppressed = false;
    protected PlayerData playerData;
    protected VideoData videoData;
    protected ViewData viewData;

    public PlaybackEvent(PlayerData playerData) {
        this.playerData = playerData;
    }

    @Override // com.mux.stats.sdk.core.events.playback.IPlaybackEvent
    public AdData getAdData() {
        return this.adData;
    }

    public BandwidthMetricData getBandwidthMetricData() {
        return this.bandwidthMetricData;
    }

    @Override // com.mux.stats.sdk.core.events.playback.IPlaybackEvent
    public PlayerData getPlayerData() {
        return this.playerData;
    }

    public VideoData getVideoData() {
        return this.videoData;
    }

    @Override // com.mux.stats.sdk.core.events.playback.IPlaybackEvent
    public ViewData getViewData() {
        return this.viewData;
    }

    public boolean isAd() {
        return false;
    }

    @Override // com.mux.stats.sdk.core.events.BaseEvent, com.mux.stats.sdk.core.events.IEvent
    public boolean isPlayback() {
        return true;
    }

    public boolean isSuppressed() {
        return this.isSuppressed;
    }

    @Override // com.mux.stats.sdk.core.events.playback.IPlaybackEvent
    public void setAdData(AdData adData) {
        this.adData = adData;
    }

    public void setBandwidthMetricData(BandwidthMetricData bandwidthMetricData) {
        this.bandwidthMetricData = bandwidthMetricData;
    }

    @Override // com.mux.stats.sdk.core.events.playback.IPlaybackEvent
    public void setVideoData(VideoData videoData) {
        this.videoData = videoData;
    }

    @Override // com.mux.stats.sdk.core.events.playback.IPlaybackEvent
    public void setViewData(ViewData viewData) {
        this.viewData = viewData;
    }
}
