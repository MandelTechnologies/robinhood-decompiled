package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.events.playback.ViewStartEvent;

/* loaded from: classes27.dex */
public class ViewStateTracker extends BaseTracker {

    /* renamed from: a */
    private EnumC5731a f1129a;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.mux.stats.sdk.core.trackers.ViewStateTracker$a */
    private static final class EnumC5731a {

        /* renamed from: a */
        public static final EnumC5731a f1130a = new EnumC5731a("STATE_UNKNOWN", 0);

        /* renamed from: b */
        public static final EnumC5731a f1131b = new EnumC5731a("STATE_INIT", 1);

        /* renamed from: c */
        public static final EnumC5731a f1132c = new EnumC5731a("STATE_PLAY", 2);

        private EnumC5731a(String str, int i) {
        }
    }

    public ViewStateTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1129a = EnumC5731a.f1130a;
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) {
        String type2 = playbackEvent.getType();
        type2.getClass();
        switch (type2) {
            case "play":
            case "adbreakstart":
                if (this.f1129a == EnumC5731a.f1131b) {
                    this.f1129a = EnumC5731a.f1132c;
                    dispatch(new ViewStartEvent(playbackEvent.getPlayerData()));
                    break;
                }
                break;
            case "viewinit":
                this.f1129a = EnumC5731a.f1131b;
                break;
        }
    }
}
