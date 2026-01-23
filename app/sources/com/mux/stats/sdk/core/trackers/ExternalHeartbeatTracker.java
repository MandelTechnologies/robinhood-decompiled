package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.IEventListener;
import com.mux.stats.sdk.core.events.playback.HeartbeatEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.util.CurrentTime;

/* loaded from: classes27.dex */
public class ExternalHeartbeatTracker extends BaseTracker implements IEventListener {

    /* renamed from: a */
    private long f1089a;

    /* renamed from: b */
    private CurrentTime f1090b;

    /* renamed from: c */
    private boolean f1091c;

    public ExternalHeartbeatTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1089a = 0L;
        this.f1091c = false;
        this.f1090b = new CurrentTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.mux.stats.sdk.core.trackers.BaseTracker, com.mux.stats.sdk.core.events.IEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handle(IEvent iEvent) {
        boolean z;
        if (iEvent.isTrackable()) {
            this.f1089a = now();
            return;
        }
        if (!iEvent.isPlayback()) {
            return;
        }
        if (iEvent.getType() != "internalheartbeat") {
            z = iEvent.getType() != "internalheartbeatend";
            if (this.f1091c) {
                return;
            }
            long j = this.f1089a;
            if (j <= 0 || j + 10000 >= now()) {
                return;
            }
            this.f1089a = now();
            dispatch(new HeartbeatEvent(((PlaybackEvent) iEvent).getPlayerData()));
            return;
        }
        if (!this.f1091c) {
            this.f1089a = 0L;
        }
        this.f1091c = z;
        if (this.f1091c) {
        }
    }

    public long now() {
        return this.f1090b.now();
    }
}
