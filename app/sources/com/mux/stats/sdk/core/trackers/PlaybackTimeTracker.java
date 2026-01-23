package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.AdEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.util.CurrentTime;
import com.mux.stats.sdk.core.util.MuxLogger;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class PlaybackTimeTracker extends BaseTracker {

    /* renamed from: a */
    private long f1098a;

    /* renamed from: b */
    private long f1099b;

    /* renamed from: c */
    private long f1100c;

    /* renamed from: d */
    private long f1101d;

    /* renamed from: e */
    private final CurrentTime f1102e;

    /* renamed from: f */
    private boolean f1103f;

    public PlaybackTimeTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1098a = -1L;
        this.f1099b = 0L;
        this.f1100c = -1L;
        this.f1101d = -1L;
        this.f1102e = new CurrentTime();
    }

    /* renamed from: a */
    private void m1110a(long j) throws JSONException {
        long jNow = this.f1102e.now();
        boolean z = this.f1103f;
        long j2 = z ? jNow - this.f1101d : j - this.f1098a;
        long j3 = this.f1098a;
        if ((j3 >= 0 && j > j3) || z) {
            if (j2 <= 1000) {
                this.f1099b += j2;
                ViewData viewData = new ViewData();
                viewData.setViewContentPlaybackTime(Long.valueOf(this.f1099b));
                long j4 = this.f1100c;
                if (j4 > -1) {
                    viewData.setViewMaxPlayheadPosition(Long.valueOf(j4));
                }
                dispatch(new ViewMetricEvent(viewData));
            } else {
                MuxLogger.m1117d("PlaybackTimeTracker", "Playhead position jump of over 1 seconds detected.");
            }
        }
        this.f1101d = jNow;
        this.f1098a = j;
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        Long playerPlayheadTime = playbackEvent.getPlayerData().getPlayerPlayheadTime();
        if (playerPlayheadTime == null) {
            return;
        }
        String type2 = playbackEvent.getType();
        if (playerPlayheadTime.longValue() > this.f1100c) {
            this.f1100c = playerPlayheadTime.longValue();
        }
        if (playbackEvent.isAd()) {
            String type3 = ((AdEvent) playbackEvent).getType();
            type3.getClass();
            switch (type3) {
                case "adplaying":
                    this.f1103f = true;
                    break;
                case "adplay":
                case "adended":
                case "adpause":
                case "adbreakstart":
                case "adbreakend":
                    this.f1103f = false;
                    this.f1101d = 0L;
                    break;
            }
        }
        if (type2 == "internalheartbeat") {
            m1110a(playerPlayheadTime.longValue());
            return;
        }
        if (type2 == "internalheartbeatend" || type2 == "seeking") {
            m1110a(playerPlayheadTime.longValue());
            this.f1098a = -1L;
            this.f1101d = -1L;
        } else if (type2 == "seeked") {
            this.f1098a = playerPlayheadTime.longValue();
        }
    }
}
