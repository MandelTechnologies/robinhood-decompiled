package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.ViewData;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class RebufferTracker extends BaseAdTracker {

    /* renamed from: a */
    private boolean f1104a;

    /* renamed from: b */
    private int f1105b;

    /* renamed from: c */
    private double f1106c;

    /* renamed from: d */
    private long f1107d;

    /* renamed from: e */
    private double f1108e;

    /* renamed from: f */
    private double f1109f;

    /* renamed from: g */
    private Long f1110g;

    public RebufferTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1104a = false;
        this.f1105b = 0;
        this.f1106c = 0.0d;
        this.f1107d = 0L;
        this.f1108e = 0.0d;
        this.f1109f = 0.0d;
        this.f1110g = 0L;
    }

    /* renamed from: a */
    private void m1111a(PlaybackEvent playbackEvent) throws JSONException {
        ViewData viewData = new ViewData();
        Long viewerTime = playbackEvent.getViewData().getViewerTime();
        viewerTime.longValue();
        if (this.f1110g != null && viewerTime.longValue() - this.f1110g.longValue() > 0 && this.f1104a) {
            this.f1107d += viewerTime.longValue() - this.f1110g.longValue();
            this.f1110g = viewerTime;
        }
        viewData.setViewRebufferCount(Integer.valueOf(this.f1105b));
        viewData.setViewRebufferDuration(Long.valueOf(this.f1107d));
        if (playbackEvent.getViewData().getViewWatchTime() != null && playbackEvent.getViewData().getViewWatchTime().longValue() > 0) {
            double d = this.f1105b;
            double d2 = this.f1106c;
            double d3 = d / d2;
            this.f1108e = d3;
            this.f1109f = this.f1107d / d2;
            viewData.setViewRebufferFrequency(Double.valueOf(d3));
            viewData.setViewRebufferPercentage(Double.valueOf(this.f1109f));
        }
        dispatch(new ViewMetricEvent(viewData));
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseAdTracker, com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        String type2 = playbackEvent.getType();
        if (playbackEvent.getViewData() != null && playbackEvent.getViewData().getViewWatchTime() != null) {
            this.f1106c = playbackEvent.getViewData().getViewWatchTime().longValue();
        }
        if (!type2.equals("rebufferstart")) {
            if (type2.equals("rebufferend")) {
                m1111a(playbackEvent);
                this.f1104a = false;
                return;
            } else {
                if (type2.equals("internalheartbeat") || type2.equals("internalheartbeatend")) {
                    m1111a(playbackEvent);
                    return;
                }
                return;
            }
        }
        if (this.f1104a) {
            return;
        }
        this.f1104a = true;
        this.f1105b++;
        if (playbackEvent.getViewData().getViewerTime() != null) {
            Long viewerTime = playbackEvent.getViewData().getViewerTime();
            viewerTime.longValue();
            this.f1110g = viewerTime;
        }
        m1111a(playbackEvent);
    }
}
