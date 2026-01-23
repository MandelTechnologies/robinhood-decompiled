package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.TrackableEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import java.util.HashSet;

/* loaded from: classes27.dex */
public class ExternalEventTracker extends BaseTracker {

    /* renamed from: a */
    private final HashSet<String> f1088a;

    public ExternalEventTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        HashSet<String> hashSet = new HashSet<>();
        this.f1088a = hashSet;
        hashSet.add("adbreakend");
        hashSet.add("adbreakstart");
        hashSet.add("adended");
        hashSet.add("aderror");
        hashSet.add("adfirstquartile");
        hashSet.add("admidpoint");
        hashSet.add("adpause");
        hashSet.add("adplay");
        hashSet.add("adplaying");
        hashSet.add("adrequest");
        hashSet.add("adresponse");
        hashSet.add("adthirdquartile");
        hashSet.add("ended");
        hashSet.add("error");
        hashSet.add("hb");
        hashSet.add("pageloadstart");
        hashSet.add("pause");
        hashSet.add("play");
        hashSet.add("playerready");
        hashSet.add("playing");
        hashSet.add("rebufferend");
        hashSet.add("rebufferstart");
        hashSet.add("sampling");
        hashSet.add("seeked");
        hashSet.add("seeking");
        hashSet.add("stalled");
        hashSet.add("videochange");
        hashSet.add("viewend");
        hashSet.add("viewstart");
        hashSet.add("waiting");
        hashSet.add("renditionchange");
        hashSet.add("orientationchange");
        hashSet.add("requestcompleted");
        hashSet.add("requestcanceled");
        hashSet.add("requestfailed");
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) {
        if (!this.f1088a.contains(playbackEvent.getType()) || playbackEvent.isSuppressed()) {
            return;
        }
        TrackableEvent trackableEvent = new TrackableEvent(playbackEvent.getType());
        if (playbackEvent.getBandwidthMetricData() != null) {
            trackableEvent.setBandwidthMetricData(playbackEvent.getBandwidthMetricData());
        }
        if (playbackEvent.getAdData() != null) {
            trackableEvent.setAdData(playbackEvent.getAdData());
        }
        dispatch(trackableEvent);
    }
}
