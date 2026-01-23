package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.util.MuxLogger;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class TimeToFirstFrameTracker extends BaseTracker {

    /* renamed from: a */
    private boolean f1128a;

    public TimeToFirstFrameTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1128a = false;
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        ViewData viewData = playbackEvent.getViewData();
        if (viewData.getViewProgramChanged().booleanValue()) {
            MuxLogger.m1117d("TimeToFirstFrameTracker", "Skipping Time to first frame calculation, this is a program change view");
            return;
        }
        String type2 = playbackEvent.getType();
        type2.getClass();
        if ((type2.equals("adplaying") || type2.equals("playing")) && !this.f1128a) {
            this.f1128a = true;
            Long viewWatchTime = viewData.getViewWatchTime();
            viewWatchTime.longValue();
            ViewData viewData2 = new ViewData();
            viewData2.setViewTimeToFirstFrame(viewWatchTime);
            this.dispatcher.dispatch(new ViewMetricEvent(viewData2));
        }
    }
}
