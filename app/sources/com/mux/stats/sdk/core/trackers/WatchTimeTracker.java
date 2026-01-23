package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.ViewData;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class WatchTimeTracker extends BaseTracker {

    /* renamed from: a */
    private long f1135a;

    /* renamed from: b */
    private long f1136b;

    public WatchTimeTracker(IEventDispatcher iEventDispatcher) throws JSONException {
        super(iEventDispatcher);
        this.f1135a = 0L;
        this.f1136b = 0L;
        ViewData viewData = new ViewData();
        viewData.setViewWatchTime(0L);
        dispatch(new ViewMetricEvent(viewData));
    }

    /* renamed from: a */
    private void m1112a(long j) throws JSONException {
        long j2 = this.f1135a;
        if (j2 > 0) {
            this.f1136b += j - j2;
            ViewData viewData = new ViewData();
            viewData.setViewWatchTime(Long.valueOf(this.f1136b));
            dispatch(new ViewMetricEvent(viewData));
        }
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        long jLongValue;
        String type2 = playbackEvent.getType();
        if (type2 == "internalheartbeat") {
            jLongValue = playbackEvent.getViewData().getViewerTime().longValue();
            m1112a(jLongValue);
        } else {
            if (type2 != "internalheartbeatend") {
                return;
            }
            m1112a(playbackEvent.getViewData().getViewerTime().longValue());
            jLongValue = 0;
        }
        this.f1135a = jLongValue;
    }
}
