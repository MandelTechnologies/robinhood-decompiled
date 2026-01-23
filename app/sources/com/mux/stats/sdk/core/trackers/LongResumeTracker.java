package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.CoreView;
import com.mux.stats.sdk.core.events.data.DataEvent;
import com.mux.stats.sdk.core.events.playback.PlayEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.events.playback.PlayingEvent;
import com.mux.stats.sdk.core.events.playback.ViewInitEvent;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.util.CurrentTime;
import com.mux.stats.sdk.core.util.MuxLogger;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class LongResumeTracker extends BaseTracker {

    /* renamed from: a */
    private static final long f1093a = TimeUnit.HOURS.toMillis(1);

    /* renamed from: b */
    private final CurrentTime f1094b;

    /* renamed from: c */
    private final CoreView f1095c;

    /* renamed from: d */
    private long f1096d;

    /* renamed from: e */
    private boolean f1097e;

    public LongResumeTracker(CoreView coreView) {
        this(coreView, new CurrentTime());
    }

    private LongResumeTracker(CoreView coreView, CurrentTime currentTime) {
        super(coreView);
        this.f1094b = currentTime;
        this.f1095c = coreView;
        this.f1096d = currentTime.now();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        long j;
        long j2;
        ViewData viewData;
        boolean z;
        String type2 = playbackEvent.getType();
        type2.getClass();
        if (!type2.equals("internalheartbeat")) {
            z = type2.equals("internalheartbeatend") ? false : true;
            long jNow = this.f1094b.now();
            j = jNow - this.f1096d;
            j2 = f1093a;
            if (j >= j2 && !playbackEvent.getType().equals("viewinit")) {
                MuxLogger.m1117d("LongResumeTracker", "Event handled after " + j2 + "ms. That's a new view");
                DataEvent dataEvent = new DataEvent();
                dataEvent.setVideoData(this.f1095c.getVideoData());
                dataEvent.setCustomerVideoData(this.f1095c.getCustomerVideoData());
                dataEvent.setCustomData(this.f1095c.getCustomData());
                dataEvent.setCustomerViewData(this.f1095c.getCustomerViewData());
                dispatch(new ViewInitEvent(playbackEvent.getPlayerData()));
                dispatch(dataEvent);
                viewData = this.f1095c.getViewData();
                playbackEvent.setViewData(viewData);
                if (this.f1097e && (!"play".equals(playbackEvent.getType()) || !"adbreakstart".equals(playbackEvent.getType()))) {
                    PlayEvent playEvent = new PlayEvent(playbackEvent.getPlayerData());
                    playEvent.setViewData(viewData);
                    this.f1095c.dispatch(playEvent);
                    if (!"playing".equals(playbackEvent.getType())) {
                        PlayingEvent playingEvent = new PlayingEvent(playbackEvent.getPlayerData());
                        playingEvent.setViewData(viewData);
                        this.f1095c.dispatch(playingEvent);
                    }
                }
            }
            this.f1096d = jNow;
        }
        this.f1097e = z;
        long jNow2 = this.f1094b.now();
        j = jNow2 - this.f1096d;
        j2 = f1093a;
        if (j >= j2) {
            MuxLogger.m1117d("LongResumeTracker", "Event handled after " + j2 + "ms. That's a new view");
            DataEvent dataEvent2 = new DataEvent();
            dataEvent2.setVideoData(this.f1095c.getVideoData());
            dataEvent2.setCustomerVideoData(this.f1095c.getCustomerVideoData());
            dataEvent2.setCustomData(this.f1095c.getCustomData());
            dataEvent2.setCustomerViewData(this.f1095c.getCustomerViewData());
            dispatch(new ViewInitEvent(playbackEvent.getPlayerData()));
            dispatch(dataEvent2);
            viewData = this.f1095c.getViewData();
            playbackEvent.setViewData(viewData);
            if (this.f1097e) {
                PlayEvent playEvent2 = new PlayEvent(playbackEvent.getPlayerData());
                playEvent2.setViewData(viewData);
                this.f1095c.dispatch(playEvent2);
                if (!"playing".equals(playbackEvent.getType())) {
                }
            }
        }
        this.f1096d = jNow2;
    }
}
