package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.IEventListener;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;

/* loaded from: classes27.dex */
public class BaseTracker implements IEventListener {

    /* renamed from: a */
    private int f1076a;
    protected IEventDispatcher dispatcher;

    public BaseTracker(IEventDispatcher iEventDispatcher) {
        this.dispatcher = iEventDispatcher;
    }

    protected void dispatch(IEvent iEvent) {
        this.dispatcher.dispatch(iEvent);
    }

    @Override // com.mux.stats.sdk.core.events.IEventListener
    public int getId() {
        return this.f1076a;
    }

    @Override // com.mux.stats.sdk.core.events.IEventListener
    public void handle(IEvent iEvent) {
        if (iEvent.isPlayback()) {
            handlePlaybackEvent((PlaybackEvent) iEvent);
        }
    }

    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) {
    }

    @Override // com.mux.stats.sdk.core.events.IEventListener
    public void setId(int i) {
        this.f1076a = i;
    }
}
