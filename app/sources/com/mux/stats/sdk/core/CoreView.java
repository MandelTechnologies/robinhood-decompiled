package com.mux.stats.sdk.core;

import com.mux.stats.sdk.core.events.EventBus;
import com.mux.stats.sdk.core.events.IEvent;
import com.mux.stats.sdk.core.events.SessionDataEvent;
import com.mux.stats.sdk.core.events.TrackableEvent;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.data.DataEvent;
import com.mux.stats.sdk.core.events.playback.IPlaybackEvent;
import com.mux.stats.sdk.core.model.AdData;
import com.mux.stats.sdk.core.model.CustomData;
import com.mux.stats.sdk.core.model.CustomerVideoData;
import com.mux.stats.sdk.core.model.CustomerViewData;
import com.mux.stats.sdk.core.model.CustomerViewerData;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;
import com.mux.stats.sdk.core.trackers.AdTracker;
import com.mux.stats.sdk.core.trackers.ErrorTracker;
import com.mux.stats.sdk.core.trackers.ExternalEventTracker;
import com.mux.stats.sdk.core.trackers.ExternalHeartbeatTracker;
import com.mux.stats.sdk.core.trackers.InternalHeartbeatTracker;
import com.mux.stats.sdk.core.trackers.LongResumeTracker;
import com.mux.stats.sdk.core.trackers.PlaybackTimeTracker;
import com.mux.stats.sdk.core.trackers.RebufferTracker;
import com.mux.stats.sdk.core.trackers.RequestMetricsTracker;
import com.mux.stats.sdk.core.trackers.ScalingTracker;
import com.mux.stats.sdk.core.trackers.SeekingTracker;
import com.mux.stats.sdk.core.trackers.TimeToFirstFrameTracker;
import com.mux.stats.sdk.core.trackers.ViewStateTracker;
import com.mux.stats.sdk.core.trackers.ViewerTimeTracker;
import com.mux.stats.sdk.core.trackers.WatchTimeTracker;
import com.mux.stats.sdk.core.util.UUID;
import com.mux.stats.sdk.core.util.Util;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class CoreView extends EventBus {

    /* renamed from: a */
    private ViewData f990a;

    /* renamed from: b */
    private VideoData f991b;

    /* renamed from: c */
    private CustomerVideoData f992c;

    /* renamed from: d */
    private CustomerViewData f993d;

    /* renamed from: e */
    private CustomerViewerData f994e;

    /* renamed from: f */
    private AdData f995f;

    /* renamed from: g */
    private CustomData f996g = new CustomData();

    /* renamed from: h */
    private int f997h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1074a(CustomData customData) {
        this.f996g.update(customData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1075a(CustomerVideoData customerVideoData) {
        this.f992c.update(customerVideoData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1076a(CustomerViewData customerViewData) {
        this.f993d.update(customerViewData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1077a(CustomerViewerData customerViewerData) {
        this.f994e.update(customerViewerData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1078a(VideoData videoData) {
        this.f991b.update(videoData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m1079a(ViewData viewData) {
        this.f990a.update(viewData);
    }

    @Override // com.mux.stats.sdk.core.events.EventBus, com.mux.stats.sdk.core.events.IEventDispatcher
    public void dispatch(IEvent iEvent) throws JSONException {
        if (iEvent.isTrackable()) {
            TrackableEvent trackableEvent = (TrackableEvent) iEvent;
            this.f990a.update(trackableEvent.getViewData());
            ViewData viewData = this.f990a;
            int i = this.f997h + 1;
            this.f997h = i;
            viewData.setViewSequenceNumber(Integer.valueOf(i));
            trackableEvent.setViewData(this.f990a);
            trackableEvent.setVideoData(this.f991b);
            trackableEvent.setCustomerVideoData(this.f992c);
            trackableEvent.setCustomerViewData(this.f993d);
            trackableEvent.setCustomerViewerData(this.f994e);
            trackableEvent.setCustomData(this.f996g);
            trackableEvent.setAdData(this.f995f);
            if (Util.oneOf(trackableEvent.getEventType(), "adbreakend", "adended")) {
                this.f995f.clear();
            }
        } else if (iEvent.isPlayback()) {
            IPlaybackEvent iPlaybackEvent = (IPlaybackEvent) iEvent;
            if (iPlaybackEvent.getType().equals("viewinit")) {
                ViewData viewData2 = new ViewData();
                this.f990a = viewData2;
                viewData2.setViewId(UUID.generateUUID());
                this.f991b = new VideoData();
                this.f992c = new CustomerVideoData();
                this.f993d = new CustomerViewData();
                this.f994e = new CustomerViewerData();
                this.f995f = new AdData();
                this.f997h = 0;
                addListener(new LongResumeTracker(this));
                addListener(new ViewerTimeTracker(this));
                addListener(new ScalingTracker(this));
                addListener(new SeekingTracker(this));
                addListener(new ErrorTracker(this));
                addListener(new InternalHeartbeatTracker(this));
                addListener(new PlaybackTimeTracker(this));
                addListener(new WatchTimeTracker(this));
                addListener(new TimeToFirstFrameTracker(this));
                addListener(new RebufferTracker(this));
                addListener(new ViewStateTracker(this));
                addListener(new RequestMetricsTracker(this));
                addListener(new AdTracker(this));
                addListener(new ExternalEventTracker(this));
                addListener(new ExternalHeartbeatTracker(this));
            }
            if (iPlaybackEvent.getViewData() != null) {
                this.f990a.update(iPlaybackEvent.getViewData());
            }
            if (iPlaybackEvent.getAdData() != null) {
                this.f995f.update(iPlaybackEvent.getAdData());
            }
            iPlaybackEvent.setViewData(this.f990a);
            iPlaybackEvent.setAdData(this.f995f);
            iPlaybackEvent.setVideoData(this.f991b);
        }
        if (iEvent.isViewMetric()) {
            this.f990a.update(((ViewMetricEvent) iEvent).getViewData());
            return;
        }
        if (iEvent.isSessionData()) {
            SessionDataEvent sessionDataEvent = (SessionDataEvent) iEvent;
            Util.let(sessionDataEvent.getViewData(), new Util.Consumer() { // from class: com.mux.stats.sdk.core.CoreView$$ExternalSyntheticLambda0
                @Override // com.mux.stats.sdk.core.util.Util.Consumer
                public final void apply(Object obj) {
                    this.f$0.m1079a((ViewData) obj);
                }
            });
            Util.let(sessionDataEvent.getVideoData(), new Util.Consumer() { // from class: com.mux.stats.sdk.core.CoreView$$ExternalSyntheticLambda1
                @Override // com.mux.stats.sdk.core.util.Util.Consumer
                public final void apply(Object obj) {
                    this.f$0.m1078a((VideoData) obj);
                }
            });
            Util.let(sessionDataEvent.getCustomerVideoData(), new Util.Consumer() { // from class: com.mux.stats.sdk.core.CoreView$$ExternalSyntheticLambda2
                @Override // com.mux.stats.sdk.core.util.Util.Consumer
                public final void apply(Object obj) {
                    this.f$0.m1075a((CustomerVideoData) obj);
                }
            });
            Util.let(sessionDataEvent.getCustomerViewData(), new Util.Consumer() { // from class: com.mux.stats.sdk.core.CoreView$$ExternalSyntheticLambda3
                @Override // com.mux.stats.sdk.core.util.Util.Consumer
                public final void apply(Object obj) {
                    this.f$0.m1076a((CustomerViewData) obj);
                }
            });
            Util.let(sessionDataEvent.getCustomerViewerData(), new Util.Consumer() { // from class: com.mux.stats.sdk.core.CoreView$$ExternalSyntheticLambda4
                @Override // com.mux.stats.sdk.core.util.Util.Consumer
                public final void apply(Object obj) {
                    this.f$0.m1077a((CustomerViewerData) obj);
                }
            });
            Util.let(sessionDataEvent.getCustomData(), new Util.Consumer() { // from class: com.mux.stats.sdk.core.CoreView$$ExternalSyntheticLambda5
                @Override // com.mux.stats.sdk.core.util.Util.Consumer
                public final void apply(Object obj) {
                    this.f$0.m1074a((CustomData) obj);
                }
            });
            return;
        }
        if (!iEvent.isData()) {
            super.dispatch(iEvent);
            return;
        }
        DataEvent dataEvent = (DataEvent) iEvent;
        VideoData videoData = this.f991b;
        if (videoData == null || this.f992c == null) {
            return;
        }
        videoData.update(dataEvent.getVideoData());
        this.f992c.update(dataEvent.getCustomerVideoData());
        this.f993d.update(dataEvent.getCustomerViewData());
        this.f994e.update(dataEvent.getCustomerViewerData());
        this.f996g.update(dataEvent.getCustomData());
    }

    public CustomData getCustomData() {
        return this.f996g;
    }

    public CustomerVideoData getCustomerVideoData() {
        return this.f992c;
    }

    public CustomerViewData getCustomerViewData() {
        return this.f993d;
    }

    public VideoData getVideoData() {
        return this.f991b;
    }

    public ViewData getViewData() {
        return this.f990a;
    }
}
