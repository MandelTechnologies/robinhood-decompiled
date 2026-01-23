package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.IEventListener;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.util.CurrentTime;
import java.util.HashSet;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class ViewerTimeTracker extends BaseTracker implements IEventListener {

    /* renamed from: a */
    private final HashSet<String> f1133a;

    /* renamed from: b */
    private CurrentTime f1134b;

    public ViewerTimeTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        HashSet<String> hashSet = new HashSet<>();
        this.f1133a = hashSet;
        hashSet.add("internalheartbeat");
        hashSet.add("internalheartbeatend");
        setCurrentTime(new CurrentTime());
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        if (this.f1133a.contains(playbackEvent.getType())) {
            return;
        }
        ViewData viewData = new ViewData();
        viewData.setViewerTime(Long.valueOf(now()));
        dispatch(new ViewMetricEvent(viewData));
    }

    public long now() {
        return this.f1134b.now();
    }

    public void setCurrentTime(CurrentTime currentTime) {
        this.f1134b = currentTime;
    }
}
