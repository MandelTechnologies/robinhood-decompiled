package com.mux.stats.sdk.core.events.playback;

import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.model.AdData;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;

/* loaded from: classes27.dex */
public interface IPlaybackEvent extends IEvent {
    AdData getAdData();

    PlayerData getPlayerData();

    ViewData getViewData();

    void setAdData(AdData adData);

    void setVideoData(VideoData videoData);

    void setViewData(ViewData viewData);
}
