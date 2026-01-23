package com.mux.stats.sdk.muxstats;

import com.mux.stats.sdk.core.Core;
import com.mux.stats.sdk.core.CorePlayer;
import com.mux.stats.sdk.core.CustomOptions;
import com.mux.stats.sdk.core.MuxSDKViewOrientation;
import com.mux.stats.sdk.core.events.BaseEventListener;
import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.InternalErrorEvent;
import com.mux.stats.sdk.core.events.SessionDataEvent;
import com.mux.stats.sdk.core.events.data.DataEvent;
import com.mux.stats.sdk.core.events.playback.AdBreakEndEvent;
import com.mux.stats.sdk.core.events.playback.AdBreakStartEvent;
import com.mux.stats.sdk.core.events.playback.AdEndedEvent;
import com.mux.stats.sdk.core.events.playback.AdErrorEvent;
import com.mux.stats.sdk.core.events.playback.AdEvent;
import com.mux.stats.sdk.core.events.playback.AdFirstQuartileEvent;
import com.mux.stats.sdk.core.events.playback.AdMidpointEvent;
import com.mux.stats.sdk.core.events.playback.AdPauseEvent;
import com.mux.stats.sdk.core.events.playback.AdPlayEvent;
import com.mux.stats.sdk.core.events.playback.AdPlayingEvent;
import com.mux.stats.sdk.core.events.playback.AdRequestEvent;
import com.mux.stats.sdk.core.events.playback.AdResponseEvent;
import com.mux.stats.sdk.core.events.playback.AdThirdQuartileEvent;
import com.mux.stats.sdk.core.events.playback.EndedEvent;
import com.mux.stats.sdk.core.events.playback.ErrorEvent;
import com.mux.stats.sdk.core.events.playback.PauseEvent;
import com.mux.stats.sdk.core.events.playback.PlayEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.events.playback.PlayerReadyEvent;
import com.mux.stats.sdk.core.events.playback.PlayingEvent;
import com.mux.stats.sdk.core.events.playback.RebufferEndEvent;
import com.mux.stats.sdk.core.events.playback.RebufferStartEvent;
import com.mux.stats.sdk.core.events.playback.RenditionChangeEvent;
import com.mux.stats.sdk.core.events.playback.RequestCanceled;
import com.mux.stats.sdk.core.events.playback.RequestCompleted;
import com.mux.stats.sdk.core.events.playback.RequestFailed;
import com.mux.stats.sdk.core.events.playback.Sampling;
import com.mux.stats.sdk.core.events.playback.SeekedEvent;
import com.mux.stats.sdk.core.events.playback.SeekingEvent;
import com.mux.stats.sdk.core.events.playback.TimeUpdateEvent;
import com.mux.stats.sdk.core.events.playback.ViewEndEvent;
import com.mux.stats.sdk.core.events.playback.ViewInitEvent;
import com.mux.stats.sdk.core.model.CustomerData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.EnvironmentData;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.SessionTag;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.model.ViewerData;
import com.mux.stats.sdk.core.util.MuxLogger;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class MuxStats extends BaseEventListener {

    /* renamed from: u */
    private static IDevice f1154u;

    /* renamed from: v */
    private static INetworkRequest f1155v;

    /* renamed from: a */
    private Timer f1156a;

    /* renamed from: b */
    private String f1157b;

    /* renamed from: c */
    private CustomerData f1158c;

    /* renamed from: d */
    private Integer f1159d;

    /* renamed from: e */
    private Integer f1160e;

    /* renamed from: f */
    private Integer f1161f;

    /* renamed from: g */
    private Integer f1162g;

    /* renamed from: i */
    private VideoData f1164i;

    /* renamed from: j */
    private long f1165j;

    /* renamed from: l */
    private MuxSDKViewPresentation f1167l;

    /* renamed from: n */
    private String f1168n;

    /* renamed from: o */
    private String f1169o;

    /* renamed from: p */
    private String f1170p;

    /* renamed from: r */
    private CustomOptions f1172r;

    /* renamed from: s */
    private CorePlayer f1173s;

    /* renamed from: t */
    private IPlayerListener f1174t;

    /* renamed from: q */
    private boolean f1171q = true;

    /* renamed from: k */
    private boolean f1166k = false;

    /* renamed from: h */
    private boolean f1163h = true;

    /* renamed from: com.mux.stats.sdk.muxstats.MuxStats$a */
    private static class C5745a extends TimerTask {

        /* renamed from: a */
        private final WeakReference<MuxStats> f1175a;

        /* renamed from: b */
        private final WeakReference<Timer> f1176b;

        public C5745a(MuxStats muxStats, Timer timer) {
            this.f1175a = new WeakReference<>(muxStats);
            this.f1176b = new WeakReference<>(timer);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            MuxStats muxStats = this.f1175a.get();
            if (muxStats == null) {
                Timer timer = this.f1176b.get();
                if (timer != null) {
                    timer.cancel();
                    timer.purge();
                    return;
                }
                return;
            }
            try {
                if (muxStats.f1174t.isPaused()) {
                    return;
                }
                MuxStats.m1127b(muxStats);
            } catch (Throwable th) {
                MuxLogger.exception(th, "MuxStats", "Exception terminated timer task", muxStats.f1158c);
                muxStats.release();
            }
        }
    }

    public MuxStats(IPlayerListener iPlayerListener, String str, CustomerData customerData, CustomOptions customOptions) throws JSONException {
        this.f1164i = new VideoData();
        this.f1158c = customerData;
        this.f1157b = str;
        this.f1172r = customOptions;
        if (customOptions == null) {
            throw new IllegalArgumentException("customOptions cannot be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("playerName cannot be null");
        }
        if (customerData == null || customerData.getCustomerPlayerData() == null) {
            throw new IllegalArgumentException("customerPlayerData cannot be null");
        }
        this.f1173s = Core.createPlayer(this.f1157b, this.f1172r);
        this.f1165j = 0L;
        this.f1174t = iPlayerListener;
        m1123a();
        PlayerData playerData = getPlayerData();
        m1124a(new ViewInitEvent(playerData));
        Timer timer = new Timer();
        this.f1156a = timer;
        timer.scheduleAtFixedRate(new C5745a(this, this.f1156a), 0L, 100L);
        this.f1164i = new VideoData();
        DataEvent dataEvent = new DataEvent();
        CustomerData customerData2 = this.f1158c;
        if (customerData2 != null && customerData2.getCustomerPlayerData() != null) {
            dataEvent.setCustomerPlayerData(this.f1158c.getCustomerPlayerData());
        }
        CustomerData customerData3 = this.f1158c;
        if (customerData3 != null && customerData3.getCustomerVideoData() != null) {
            dataEvent.setCustomerVideoData(this.f1158c.getCustomerVideoData());
        }
        CustomerData customerData4 = this.f1158c;
        if (customerData4 != null && customerData4.getCustomerViewData() != null) {
            dataEvent.setCustomerViewData(this.f1158c.getCustomerViewData());
        }
        CustomerData customerData5 = this.f1158c;
        if (customerData5 != null && customerData5.getCustomData() != null) {
            dataEvent.setCustomData(this.f1158c.getCustomData());
        }
        CustomerData customerData6 = this.f1158c;
        if (customerData6 != null && customerData6.getCustomerViewerData() != null) {
            dataEvent.setCustomerViewerData(this.f1158c.getCustomerViewerData());
        }
        CustomerData customerData7 = this.f1158c;
        if (customerData7 != null && (customerData7.getCustomerPlayerData() != null || this.f1158c.getCustomerVideoData() != null || this.f1158c.getCustomerViewData() != null || this.f1158c.getCustomData() != null || this.f1158c.getCustomerViewerData() != null)) {
            m1124a(dataEvent);
        }
        m1124a(new PlayerReadyEvent(playerData));
    }

    /* renamed from: a */
    private static int m1121a(int i, int i2, int i3) {
        if (i > 1048576) {
            return 1048576;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    private void m1123a() {
        try {
            EnvironmentData environmentData = new EnvironmentData();
            IDevice iDevice = f1154u;
            if (iDevice != null) {
                this.f1168n = iDevice.getDeviceId();
                this.f1169o = f1154u.getAppName();
                this.f1170p = f1154u.getAppVersion();
            }
            String str = this.f1168n;
            if (str != null) {
                environmentData.setMuxViewerId(str);
            }
            ViewerData viewerData = new ViewerData();
            IDevice iDevice2 = f1154u;
            if (iDevice2 != null) {
                viewerData.setViewerOsFamily(iDevice2.getOSFamily());
                viewerData.setViewerOsArchitecture(f1154u.getHardwareArchitecture());
                viewerData.setViewerOsVersion(f1154u.getOSVersion());
                viewerData.setViewerDeviceManufacturer(f1154u.getManufacturer());
                viewerData.setViewerDeviceModel(f1154u.getModelName());
                viewerData.setViewerDeviceName(f1154u.getDeviceName());
                viewerData.setViewerDeviceCategory(f1154u.getDeviceCategory());
                viewerData.setViewerConnectionType(f1154u.getNetworkConnectionType());
            }
            String str2 = this.f1169o;
            if (str2 != null) {
                viewerData.setViewerApplicationName(str2);
            }
            String str3 = this.f1170p;
            if (str3 != null) {
                viewerData.setViewerApplicationVersion(str3);
            }
            DataEvent dataEvent = new DataEvent();
            dataEvent.setEnvironmentData(environmentData);
            dataEvent.setViewerData(viewerData);
            Core.dispatchDataEvent(dataEvent);
        } catch (Throwable th) {
            MuxLogger.exception(th, "MuxStats", "Exception caught preparing environment", this.f1158c);
        }
    }

    /* renamed from: a */
    private void m1124a(IEvent iEvent) {
        if (this.f1163h) {
            try {
                iEvent.getType().equalsIgnoreCase("error");
                if (iEvent.isPlayback()) {
                    ViewData viewData = ((PlaybackEvent) iEvent).getViewData();
                    if (viewData == null) {
                        viewData = new ViewData();
                    }
                    viewData.setViewDroppedFrames(Long.valueOf(this.f1165j));
                    ((PlaybackEvent) iEvent).setViewData(viewData);
                }
                Core.dispatchEventForPlayer(this.f1157b, iEvent);
            } catch (Throwable th) {
                MuxLogger.exception(th, "MuxStats", "Failed to dispatch event: " + iEvent + ", for player name: " + this.f1157b);
                CustomerData customerData = this.f1158c;
                if (customerData == null || customerData.getCustomerPlayerData() == null) {
                    return;
                }
                MuxLogger.exception(th, "MuxStats", "Failed to dispatch player event: " + iEvent);
            }
        }
    }

    /* renamed from: a */
    private void m1125a(CustomerData customerData) {
        m1124a(new ViewInitEvent(getPlayerData()));
        this.f1158c = customerData;
        DataEvent dataEvent = new DataEvent();
        if (this.f1158c.getCustomerVideoData() != null) {
            dataEvent.setCustomerVideoData(this.f1158c.getCustomerVideoData());
        }
        if (this.f1158c.getCustomData() != null) {
            dataEvent.setCustomData(this.f1158c.getCustomData());
        }
        if (this.f1158c.getCustomerViewData() != null) {
            dataEvent.setCustomerViewData(this.f1158c.getCustomerViewData());
        }
        VideoData videoData = new VideoData();
        this.f1164i = videoData;
        dataEvent.setVideoData(videoData);
        m1124a(dataEvent);
    }

    /* renamed from: b */
    private void m1126b() throws JSONException {
        boolean z;
        IPlayerListener iPlayerListener = this.f1174t;
        if (iPlayerListener == null) {
            return;
        }
        if (iPlayerListener.getVideoHoldback() != null && this.f1174t.getVideoHoldback().longValue() != -1) {
            this.f1164i.setVideoHoldback(this.f1174t.getVideoHoldback());
        }
        if (this.f1174t.getVideoPartHoldback() != null && this.f1174t.getVideoPartHoldback().longValue() != -1) {
            this.f1164i.setVideoPartHoldback(this.f1174t.getVideoPartHoldback());
        }
        if (this.f1174t.getVideoPartTargetDuration() != null && this.f1174t.getVideoPartTargetDuration().longValue() != -1) {
            this.f1164i.setVideoPartTargetDuration(this.f1174t.getVideoPartTargetDuration());
        }
        if (this.f1174t.getVideoTargetDuration() != null && this.f1174t.getVideoTargetDuration().longValue() != -1) {
            this.f1164i.setVideoTargetDuration(this.f1174t.getVideoTargetDuration());
        }
        boolean z2 = true;
        if (this.f1174t.getSourceWidth() == null || this.f1164i.getVideoSourceWidth() == this.f1174t.getSourceWidth()) {
            z = false;
        } else {
            this.f1164i.setVideoSourceWidth(this.f1174t.getSourceWidth());
            z = true;
        }
        if (this.f1174t.getSourceHeight() != null && this.f1164i.getVideoSourceHeight() != this.f1174t.getSourceHeight()) {
            this.f1164i.setVideoSourceHeight(this.f1174t.getSourceHeight());
            z = true;
        }
        if (this.f1174t.getMimeType() != null && this.f1164i.getVideoSourceMimeType() != this.f1174t.getMimeType()) {
            this.f1164i.setVideoSourceMimeType(this.f1174t.getMimeType());
            z = true;
        }
        if (this.f1174t.getSourceDuration() != null && this.f1164i.getVideoSourceDuration() != this.f1174t.getSourceDuration()) {
            this.f1164i.setVideoSourceDuration(this.f1174t.getSourceDuration());
            z = true;
        }
        if (this.f1174t.getSourceAdvertisedBitrate() != null && this.f1164i.getVideoSourceAdvertisedBitrate() != this.f1174t.getSourceAdvertisedBitrate()) {
            this.f1164i.setVideoSourceAdvertisedBitrate(this.f1174t.getSourceAdvertisedBitrate());
            z = true;
        }
        if (this.f1174t.getSourceAdvertisedFramerate() != null && this.f1164i.getVideoSourceAdvertisedFramerate() != this.f1174t.getSourceAdvertisedFramerate()) {
            this.f1164i.setVideoSourceAdvertisedFramerate(this.f1174t.getSourceAdvertisedFramerate());
            z = true;
        }
        if (this.f1174t.getSourceCodec() == null || this.f1164i.getVideoSourceCodec() == this.f1174t.getSourceCodec()) {
            z2 = z;
        } else {
            this.f1164i.setVideoSourceCodec(this.f1174t.getSourceCodec());
        }
        if (z2) {
            DataEvent dataEvent = new DataEvent();
            dataEvent.setVideoData(this.f1164i);
            m1124a(dataEvent);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m1127b(MuxStats muxStats) {
        muxStats.handle(new TimeUpdateEvent(null));
    }

    public static IDevice getHostDevice() {
        return f1154u;
    }

    public static INetworkRequest getHostNetworkApi() {
        return f1155v;
    }

    public static void setHostDevice(IDevice iDevice) {
        f1154u = iDevice;
    }

    public static void setHostNetworkApi(INetworkRequest iNetworkRequest) {
        f1155v = iNetworkRequest;
    }

    public void allowLogcatOutput(boolean z, boolean z2) {
        Core.allowLogcatOutputForPlayer(this.f1157b, z, z2);
    }

    protected PlayerData getPlayerData() throws JSONException {
        PlayerData playerData = new PlayerData();
        IDevice hostDevice = getHostDevice();
        if (hostDevice != null) {
            playerData.setPlayerMuxPluginName(hostDevice.getMuxPluginName());
            playerData.setPlayerMuxPluginVersion(hostDevice.getMuxPluginVersion());
            playerData.setPlayerSoftwareName(hostDevice.getPlayerSoftware());
        }
        IDevice iDevice = f1154u;
        if (iDevice != null) {
            playerData.setPlayerSoftwareVersion(iDevice.getPlayerVersion());
        }
        IPlayerListener iPlayerListener = this.f1174t;
        if (iPlayerListener != null) {
            playerData.setPlayerIsPaused(Boolean.valueOf(iPlayerListener.isPaused()));
            playerData.setPlayerPlayheadTime(Long.valueOf(this.f1174t.getCurrentPosition()));
            if (this.f1174t.getPlayerProgramTime() != null && this.f1174t.getPlayerProgramTime().longValue() != -1) {
                playerData.setPlayerProgramTime(this.f1174t.getPlayerProgramTime());
            }
            if (this.f1174t.getPlayerManifestNewestTime() != null && this.f1174t.getPlayerManifestNewestTime().longValue() != -1) {
                playerData.setPlayerManifestNewestProgramTime(this.f1174t.getPlayerManifestNewestTime());
            }
            if (!this.f1166k) {
                this.f1159d = Integer.valueOf(m1121a(this.f1174t.getPlayerViewWidth(), 0, 1048576));
                this.f1160e = Integer.valueOf(m1121a(this.f1174t.getPlayerViewHeight(), 0, 1048576));
            }
            MuxSDKViewPresentation muxSDKViewPresentation = this.f1167l;
            if (muxSDKViewPresentation == null) {
                Integer num = this.f1160e;
                if (num != null && this.f1159d != null) {
                    playerData.setPlayerHeight(num);
                    playerData.setPlayerWidth(this.f1159d);
                    Integer num2 = this.f1162g;
                    if (num2 != null && this.f1161f != null) {
                        if ((num2.intValue() > this.f1160e.intValue() || this.f1161f.intValue() > this.f1159d.intValue()) && (this.f1161f.intValue() > this.f1160e.intValue() || this.f1162g.intValue() > this.f1159d.intValue())) {
                            playerData.setPlayerIsFullscreen("false");
                            return playerData;
                        }
                        playerData.setPlayerIsFullscreen("true");
                        return playerData;
                    }
                }
            } else {
                playerData.setPlayerIsFullscreen(String.valueOf(muxSDKViewPresentation == MuxSDKViewPresentation.FULLSCREEN));
                Integer num3 = this.f1160e;
                if (num3 != null && this.f1159d != null) {
                    playerData.setPlayerHeight(num3);
                    playerData.setPlayerWidth(this.f1159d);
                }
            }
        }
        return playerData;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0214  */
    @Override // com.mux.stats.sdk.core.events.IEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void handle(IEvent iEvent) {
        char c;
        IEvent errorEvent;
        PlaybackEvent timeUpdateEvent;
        if (!iEvent.isPlayback() && !iEvent.isError()) {
            MuxLogger.m1117d("MuxStats", "unexpected internal event");
            return;
        }
        if (iEvent.isError() && !this.f1171q) {
            MuxLogger.m1117d("MuxStats", "error detected, but automatic error reporting is disabled");
            return;
        }
        String type2 = iEvent.getType();
        char c2 = '\b';
        switch (type2.hashCode()) {
            case -1893763032:
                if (!type2.equals("requestcanceled")) {
                    c = 65535;
                    break;
                } else {
                    c = '\r';
                    break;
                }
            case -1535613269:
                if (type2.equals("adplaying")) {
                    c = 24;
                    break;
                }
                break;
            case -1519101404:
                if (type2.equals("renditionchange")) {
                    c = 15;
                    break;
                }
                break;
            case -1422144041:
                if (type2.equals("adplay")) {
                    c = 23;
                    break;
                }
                break;
            case -1300510776:
                if (type2.equals("rebufferend")) {
                    c = '\b';
                    break;
                }
                break;
            case -1146889097:
                if (type2.equals("adended")) {
                    c = 18;
                    break;
                }
                break;
            case -1146756155:
                if (type2.equals("aderror")) {
                    c = 19;
                    break;
                }
                break;
            case -1137100877:
                if (type2.equals("adpause")) {
                    c = 22;
                    break;
                }
                break;
            case -906224361:
                if (type2.equals("seeked")) {
                    c = 6;
                    break;
                }
                break;
            case -493563858:
                if (type2.equals("playing")) {
                    c = 3;
                    break;
                }
                break;
            case -456624996:
                if (type2.equals("requestcompleted")) {
                    c = '\f';
                    break;
                }
                break;
            case -215092057:
                if (type2.equals("adthirdquartile")) {
                    c = 27;
                    break;
                }
                break;
            case 3443508:
                if (type2.equals("play")) {
                    c = 2;
                    break;
                }
                break;
            case 53643532:
                if (type2.equals("adrequest")) {
                    c = 25;
                    break;
                }
                break;
            case 57736207:
                if (type2.equals("rebufferstart")) {
                    c = 7;
                    break;
                }
                break;
            case 96651962:
                if (type2.equals("ended")) {
                    c = '\n';
                    break;
                }
                break;
            case 96784904:
                if (type2.equals("error")) {
                    c = 0;
                    break;
                }
                break;
            case 106440182:
                if (type2.equals("pause")) {
                    c = '\t';
                    break;
                }
                break;
            case 417371499:
                if (type2.equals("admidpoint")) {
                    c = 21;
                    break;
                }
                break;
            case 1651552038:
                if (type2.equals("adbreakstart")) {
                    c = 16;
                    break;
                }
                break;
            case 1682958576:
                if (type2.equals("adfirstquartile")) {
                    c = 20;
                    break;
                }
                break;
            case 1715883364:
                if (type2.equals("adresponse")) {
                    c = 26;
                    break;
                }
                break;
            case 1762557398:
                if (type2.equals("timeupdate")) {
                    c = 1;
                    break;
                }
                break;
            case 1832171883:
                if (type2.equals("internalerror")) {
                    c = 11;
                    break;
                }
                break;
            case 1929584524:
                if (type2.equals("requestfailed")) {
                    c = 14;
                    break;
                }
                break;
            case 1971820138:
                if (type2.equals("seeking")) {
                    c = 5;
                    break;
                }
                break;
            case 1975570407:
                if (type2.equals("sampling")) {
                    c = 4;
                    break;
                }
                break;
            case 2133546143:
                if (type2.equals("adbreakend")) {
                    c = 17;
                    break;
                }
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                m1126b();
                PlayerData playerData = new PlayerData();
                playerData.update(getPlayerData());
                playerData.update(((PlaybackEvent) iEvent).getPlayerData());
                errorEvent = new ErrorEvent(playerData);
                m1124a(errorEvent);
                break;
            case 1:
                m1126b();
                timeUpdateEvent = new TimeUpdateEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 2:
                m1126b();
                timeUpdateEvent = new PlayEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 3:
                m1126b();
                errorEvent = new PlayingEvent(getPlayerData());
                m1124a(errorEvent);
                break;
            case 4:
                timeUpdateEvent = new Sampling(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 5:
                m1126b();
                timeUpdateEvent = new SeekingEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 6:
                m1126b();
                timeUpdateEvent = new SeekedEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 7:
                m1126b();
                timeUpdateEvent = new RebufferStartEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case '\b':
                m1126b();
                timeUpdateEvent = new RebufferEndEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case '\t':
                m1126b();
                timeUpdateEvent = new PauseEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case '\n':
                m1126b();
                timeUpdateEvent = new EndedEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 11:
                InternalErrorEvent internalErrorEvent = (InternalErrorEvent) iEvent;
                PlayerData playerData2 = getPlayerData();
                playerData2.setPlayerErrorMessage(internalErrorEvent.getErrorMessage());
                playerData2.setPlayerErrorCode(String.valueOf(internalErrorEvent.getErrorCode()));
                playerData2.setPlayerErrorContext(internalErrorEvent.getErrorContext());
                MuxLogger.m1117d("MuxStats", "internal error: " + internalErrorEvent.getErrorMessage());
                m1126b();
                timeUpdateEvent = new ErrorEvent(playerData2);
                m1124a(timeUpdateEvent);
                break;
            case '\f':
                m1126b();
                timeUpdateEvent = new RequestCompleted(getPlayerData());
                timeUpdateEvent.setBandwidthMetricData(((PlaybackEvent) iEvent).getBandwidthMetricData());
                m1124a(timeUpdateEvent);
                break;
            case '\r':
                m1126b();
                timeUpdateEvent = new RequestCanceled(getPlayerData());
                timeUpdateEvent.setBandwidthMetricData(((PlaybackEvent) iEvent).getBandwidthMetricData());
                m1124a(timeUpdateEvent);
                break;
            case 14:
                m1126b();
                timeUpdateEvent = new RequestFailed(getPlayerData());
                timeUpdateEvent.setBandwidthMetricData(((PlaybackEvent) iEvent).getBandwidthMetricData());
                m1124a(timeUpdateEvent);
                break;
            case 15:
                m1126b();
                timeUpdateEvent = new RenditionChangeEvent(getPlayerData());
                m1124a(timeUpdateEvent);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                String type3 = iEvent.getType();
                switch (type3.hashCode()) {
                    case -1535613269:
                        if (!type3.equals("adplaying")) {
                            c2 = 65535;
                            break;
                        } else {
                            break;
                        }
                    case -1422144041:
                        if (type3.equals("adplay")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -1146889097:
                        if (type3.equals("adended")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1146756155:
                        if (type3.equals("aderror")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1137100877:
                        if (type3.equals("adpause")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -215092057:
                        if (type3.equals("adthirdquartile")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case 53643532:
                        if (type3.equals("adrequest")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 417371499:
                        if (type3.equals("admidpoint")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1651552038:
                        if (type3.equals("adbreakstart")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1682958576:
                        if (type3.equals("adfirstquartile")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1715883364:
                        if (type3.equals("adresponse")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case 2133546143:
                        if (type3.equals("adbreakend")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        timeUpdateEvent = new AdBreakStartEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 1:
                        timeUpdateEvent = new AdBreakEndEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 2:
                        timeUpdateEvent = new AdEndedEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 3:
                        timeUpdateEvent = new AdErrorEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 4:
                        timeUpdateEvent = new AdFirstQuartileEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 5:
                        timeUpdateEvent = new AdMidpointEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 6:
                        timeUpdateEvent = new AdPauseEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 7:
                        timeUpdateEvent = new AdPlayEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case '\b':
                        timeUpdateEvent = new AdPlayingEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case '\t':
                        timeUpdateEvent = new AdRequestEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case '\n':
                        timeUpdateEvent = new AdResponseEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                    case 11:
                        timeUpdateEvent = new AdThirdQuartileEvent(getPlayerData());
                        timeUpdateEvent.setViewData(((PlaybackEvent) iEvent).getViewData());
                        timeUpdateEvent.setAdData(((AdEvent) iEvent).getAdData());
                        m1124a(timeUpdateEvent);
                        break;
                }
        }
        if (this.f1174t != null) {
            new Date().getTime();
            this.f1174t.getCurrentPosition();
        }
    }

    public void orientationChange(MuxSDKViewOrientation muxSDKViewOrientation) {
        Core.orientationChangeForPlayer(this.f1157b, muxSDKViewOrientation);
    }

    public void presentationChange(MuxSDKViewPresentation muxSDKViewPresentation) {
        this.f1167l = muxSDKViewPresentation;
    }

    public void release() {
        Timer timer = this.f1156a;
        if (timer != null) {
            timer.cancel();
            this.f1156a.purge();
            this.f1156a = null;
        }
        if (this.f1157b != null) {
            m1124a(new ViewEndEvent(getPlayerData()));
            Core.destroyPlayer(this.f1157b);
        }
        this.f1174t = null;
        this.f1173s = null;
    }

    public void setCustomerData(CustomerData customerData) {
        if (customerData == null || customerData.getCustomerPlayerData() == null) {
            throw new IllegalArgumentException("customerPlayerData cannot be null");
        }
        DataEvent dataEvent = new DataEvent();
        if (customerData.getCustomerViewData() != null) {
            dataEvent.setCustomerViewData(customerData.getCustomerViewData());
        }
        if (customerData.getCustomerPlayerData() != null) {
            dataEvent.setCustomerPlayerData(customerData.getCustomerPlayerData());
        }
        if (customerData.getCustomerVideoData() != null) {
            dataEvent.setCustomerVideoData(customerData.getCustomerVideoData());
        }
        if (customerData.getCustomData() != null) {
            dataEvent.setCustomData(customerData.getCustomData());
        }
        if (customerData.getCustomerViewerData() != null) {
            dataEvent.setCustomerViewerData(customerData.getCustomerViewerData());
        }
        this.f1158c = customerData;
        m1124a(dataEvent);
    }

    public void setSessionData(List<SessionTag> list) {
        if (this.f1163h) {
            Core.dispatchEventForPlayer(this.f1157b, new SessionDataEvent(list));
        }
    }

    public void videoChange(CustomerData customerData) {
        m1124a(new ViewEndEvent(getPlayerData()));
        m1125a(customerData);
    }

    public void videoChange(CustomerVideoData customerVideoData) {
        this.f1158c.setCustomerVideoData(customerVideoData);
        videoChange(this.f1158c);
        this.f1165j = 0L;
    }

    public void videoDataChange(VideoData videoData) {
        if (this.f1163h) {
            DataEvent dataEvent = new DataEvent();
            dataEvent.setVideoData(videoData);
            Core.dispatchEventForPlayer(this.f1157b, dataEvent);
        }
    }
}
