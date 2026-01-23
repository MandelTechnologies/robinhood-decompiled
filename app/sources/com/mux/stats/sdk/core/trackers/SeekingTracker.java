package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.events.playback.SeekingEvent;
import com.mux.stats.sdk.core.model.ViewData;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class SeekingTracker extends BaseTracker {

    /* renamed from: a */
    private long f1123a;

    /* renamed from: b */
    private boolean f1124b;

    /* renamed from: c */
    private int f1125c;

    /* renamed from: d */
    private long f1126d;

    /* renamed from: e */
    private long f1127e;

    public SeekingTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1123a = 0L;
        this.f1124b = false;
        this.f1125c = 0;
        this.f1126d = 0L;
        this.f1127e = 0L;
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        String type2 = playbackEvent.getType();
        if (type2 == "seeking") {
            Long viewerTime = playbackEvent.getViewData().getViewerTime();
            if (!this.f1124b) {
                this.f1124b = true;
                SeekingEvent seekingEvent = new SeekingEvent(playbackEvent.getPlayerData());
                seekingEvent.setIsSuppressed(false);
                seekingEvent.setViewData(playbackEvent.getViewData());
                dispatch(seekingEvent);
            }
            this.f1123a = viewerTime.longValue();
            return;
        }
        if (type2 != "seeked") {
            if (type2 == "viewend") {
                this.f1124b = false;
                return;
            }
            return;
        }
        Long viewerTime2 = playbackEvent.getViewData().getViewerTime();
        if (this.f1123a > 0) {
            this.f1125c++;
            long jLongValue = viewerTime2.longValue() - this.f1123a;
            this.f1126d += jLongValue;
            if (jLongValue > this.f1127e) {
                this.f1127e = jLongValue;
            }
            ViewData viewData = new ViewData();
            viewData.setViewSeekCount(Integer.valueOf(this.f1125c));
            viewData.setViewSeekDuration(Long.valueOf(this.f1126d));
            viewData.setViewMaxSeekTime(Long.valueOf(this.f1127e));
            dispatch(new ViewMetricEvent(viewData));
        }
        this.f1124b = false;
        this.f1123a = 0L;
    }
}
