package com.mux.stats.sdk.core;

import com.mux.stats.sdk.core.events.EventBus;
import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.RedispatchEventListener;
import com.mux.stats.sdk.core.events.SessionDataEvent;
import com.mux.stats.sdk.core.events.TrackableEvent;
import com.mux.stats.sdk.core.events.data.DataEvent;
import com.mux.stats.sdk.core.events.playback.IPlaybackEvent;
import com.mux.stats.sdk.core.events.playback.OrientationChangeEvent;
import com.mux.stats.sdk.core.model.CustomerPlayerData;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.model.ViewDeviceOrientationData;
import com.mux.stats.sdk.core.trackers.BeaconBatchTracker;
import com.mux.stats.sdk.core.util.MuxLogger;
import com.mux.stats.sdk.core.util.UUID;
import com.mux.stats.sdk.core.util.Util;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class CorePlayer extends EventBus {

    /* renamed from: a */
    private final PlayerData f984a;

    /* renamed from: b */
    private final CustomerPlayerData f985b;

    /* renamed from: c */
    private CoreView f986c;

    /* renamed from: d */
    private int f987d;

    /* renamed from: e */
    private final BeaconBatchTracker f988e;

    /* renamed from: com.mux.stats.sdk.core.CorePlayer$1 */
    static /* synthetic */ class C57281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f989a;

        static {
            int[] iArr = new int[MuxSDKViewOrientation.values().length];
            f989a = iArr;
            try {
                iArr[MuxSDKViewOrientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f989a[MuxSDKViewOrientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public CorePlayer(CustomOptions customOptions) throws JSONException {
        PlayerData playerData = new PlayerData();
        this.f984a = playerData;
        this.f985b = new CustomerPlayerData();
        this.f987d = 0;
        this.f988e = new BeaconBatchTracker(customOptions);
        playerData.setPlayerInstanceId(UUID.generateUUID());
    }

    public void allowLogcatOutput(boolean z, boolean z2) {
        MuxLogger.setAllowLogcat(z);
        this.f988e.setVerboseMode(z2);
    }

    @Override // com.mux.stats.sdk.core.events.EventBus, com.mux.stats.sdk.core.events.IEventDispatcher
    public synchronized void dispatch(IEvent iEvent) {
        if (iEvent.isTrackable()) {
            TrackableEvent trackableEvent = (TrackableEvent) iEvent;
            this.f984a.update(trackableEvent.getPlayerData());
            PlayerData playerData = this.f984a;
            int i = this.f987d + 1;
            this.f987d = i;
            playerData.setPlayerSequenceNumber(Integer.valueOf(i));
            trackableEvent.setPlayerData(this.f984a);
            trackableEvent.setCustomerPlayerData(this.f985b);
            super.dispatch(iEvent);
            return;
        }
        if (iEvent.isError()) {
            super.dispatch(iEvent);
            return;
        }
        if (iEvent.isPlayback() || iEvent.isData()) {
            if (iEvent.isSessionData()) {
                CustomerPlayerData customerPlayerData = ((SessionDataEvent) iEvent).getCustomerPlayerData();
                final CustomerPlayerData customerPlayerData2 = this.f985b;
                Objects.requireNonNull(customerPlayerData2);
                Util.let(customerPlayerData, new Util.Consumer() { // from class: com.mux.stats.sdk.core.CorePlayer$$ExternalSyntheticLambda0
                    @Override // com.mux.stats.sdk.core.util.Util.Consumer
                    public final void apply(Object obj) {
                        customerPlayerData2.update((CustomerPlayerData) obj);
                    }
                });
            } else if (iEvent.isPlayback()) {
                IPlaybackEvent iPlaybackEvent = (IPlaybackEvent) iEvent;
                this.f984a.update(iPlaybackEvent.getPlayerData());
                if (!iPlaybackEvent.getType().equalsIgnoreCase("error")) {
                    this.f984a.remove("percd");
                    this.f984a.remove("perme");
                    this.f984a.remove("percz");
                    this.f984a.remove("persy");
                    this.f984a.remove("perbzez");
                }
                if (Objects.equals(iPlaybackEvent.getType(), "viewinit")) {
                    CoreView coreView = this.f986c;
                    if (coreView != null) {
                        coreView.removeAllListeners();
                    }
                    CoreView coreView2 = new CoreView();
                    this.f986c = coreView2;
                    coreView2.addListener(new RedispatchEventListener(this));
                    this.f984a.setPlayerErrorCode(null);
                    this.f984a.setPlayerErrorMessage(null);
                }
            } else {
                this.f985b.update(((DataEvent) iEvent).getCustomerPlayerData());
            }
            CoreView coreView3 = this.f986c;
            if (coreView3 != null) {
                coreView3.dispatch(iEvent);
            }
        }
    }

    public void dispatchOrientationChange(MuxSDKViewOrientation muxSDKViewOrientation) throws JSONException {
        ViewDeviceOrientationData viewDeviceOrientationData = new ViewDeviceOrientationData();
        viewDeviceOrientationData.setOrientationX(0);
        viewDeviceOrientationData.setOrientationY(0);
        int i = C57281.f989a[muxSDKViewOrientation.ordinal()];
        if (i == 1) {
            viewDeviceOrientationData.setOrientationZ(90);
        } else if (i != 2) {
            return;
        } else {
            viewDeviceOrientationData.setOrientationZ(0);
        }
        ViewData viewData = new ViewData();
        viewData.setViewOrientationData(viewDeviceOrientationData);
        OrientationChangeEvent orientationChangeEvent = new OrientationChangeEvent(this.f984a);
        orientationChangeEvent.setViewData(viewData);
        dispatch(orientationChangeEvent);
    }

    public void flush() {
        this.f988e.flush();
        this.f988e.release();
    }

    public void handle(IEvent iEvent) throws JSONException {
        this.f988e.handle(iEvent);
    }
}
