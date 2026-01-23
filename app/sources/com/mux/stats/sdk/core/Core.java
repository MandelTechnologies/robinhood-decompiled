package com.mux.stats.sdk.core;

import com.mux.stats.sdk.core.events.BaseEventListener;
import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.IEventListener;
import com.mux.stats.sdk.core.events.TrackableEvent;
import com.mux.stats.sdk.core.events.data.DataEvent;
import com.mux.stats.sdk.core.model.EnvironmentData;
import com.mux.stats.sdk.core.model.ViewerData;
import com.mux.stats.sdk.core.util.MuxLogger;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class Core {

    /* renamed from: b */
    private static IEventListener f978b;

    /* renamed from: a */
    private static final ConcurrentHashMap<String, CorePlayer> f977a = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final EnvironmentData f979c = new EnvironmentData();

    /* renamed from: d */
    private static final ViewerData f980d = new ViewerData();

    /* renamed from: e */
    private static final Session f981e = new Session();

    /* renamed from: f */
    private static boolean f982f = false;

    /* renamed from: com.mux.stats.sdk.core.Core$a */
    static class C5727a extends BaseEventListener {

        /* renamed from: a */
        private final String f983a;

        public C5727a(String str) {
            this.f983a = str;
        }

        @Override // com.mux.stats.sdk.core.events.IEventListener
        public final void handle(IEvent iEvent) throws JSONException {
            if (iEvent.isTrackable()) {
                TrackableEvent trackableEvent = (TrackableEvent) iEvent;
                trackableEvent.setEnvironmentData(Core.f979c);
                trackableEvent.setViewerData(Core.f980d);
                if (Core.f978b != null) {
                    Core.f978b.handle(iEvent);
                    return;
                }
                CorePlayer corePlayer = (CorePlayer) Core.f977a.get(this.f983a);
                if (corePlayer != null) {
                    corePlayer.handle(iEvent);
                    return;
                }
                MuxLogger.m1117d("MuxCore", "Failed to handle event: " + iEvent.getType() + ",player not found for playerId: " + this.f983a);
            }
        }
    }

    public static void allowLogcatOutputForPlayer(String str, boolean z, boolean z2) {
        CorePlayer corePlayer = f977a.get(str);
        if (corePlayer != null) {
            corePlayer.allowLogcatOutput(z, z2);
        }
    }

    public static CorePlayer createPlayer(String str, CustomOptions customOptions) throws JSONException {
        if (!f982f) {
            f981e.startSession();
            EnvironmentData environmentData = f979c;
            environmentData.setMuxApiVersion("2.1");
            environmentData.setMuxEmbedVersion("8.1.0");
            environmentData.setMuxEmbed("mux-stats-sdk-java");
            f982f = true;
        }
        CorePlayer corePlayer = new CorePlayer(customOptions);
        corePlayer.addListener(new C5727a(str));
        f977a.put(str, corePlayer);
        return corePlayer;
    }

    public static void destroyPlayer(String str) {
        CorePlayer corePlayerRemove = f977a.remove(str);
        if (corePlayerRemove != null) {
            corePlayerRemove.flush();
        }
    }

    public static void dispatchDataEvent(DataEvent dataEvent) {
        f979c.update(dataEvent.getEnvironmentData());
        f980d.update(dataEvent.getViewerData());
    }

    public static void dispatchEventForPlayer(String str, IEvent iEvent) {
        CorePlayer corePlayer = f977a.get(str);
        if (corePlayer != null) {
            f981e.updateEnvironmentData(f979c);
            corePlayer.dispatch(iEvent);
        }
    }

    public static void orientationChangeForPlayer(String str, MuxSDKViewOrientation muxSDKViewOrientation) {
        CorePlayer corePlayer = f977a.get(str);
        if (corePlayer != null) {
            corePlayer.dispatchOrientationChange(muxSDKViewOrientation);
        }
    }
}
