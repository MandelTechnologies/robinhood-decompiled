package com.mux.stats.sdk.core.trackers;

import com.mux.stats.sdk.core.events.IEventDispatcher;
import com.mux.stats.sdk.core.events.ViewMetricEvent;
import com.mux.stats.sdk.core.events.playback.PlaybackEvent;
import com.mux.stats.sdk.core.model.PlayerData;
import com.mux.stats.sdk.core.model.VideoData;
import com.mux.stats.sdk.core.model.ViewData;
import java.util.HashSet;
import org.json.JSONException;

/* loaded from: classes27.dex */
public class ScalingTracker extends BaseAdTracker {

    /* renamed from: a */
    private Long f1111a;

    /* renamed from: b */
    private Integer f1112b;

    /* renamed from: c */
    private Integer f1113c;

    /* renamed from: d */
    private Integer f1114d;

    /* renamed from: e */
    private Integer f1115e;

    /* renamed from: f */
    private final HashSet<String> f1116f;

    /* renamed from: g */
    private final HashSet<String> f1117g;

    /* renamed from: h */
    private long f1118h;

    /* renamed from: i */
    private double f1119i;

    /* renamed from: j */
    private double f1120j;

    /* renamed from: k */
    private double f1121k;

    /* renamed from: l */
    private double f1122l;

    public ScalingTracker(IEventDispatcher iEventDispatcher) {
        super(iEventDispatcher);
        this.f1118h = 0L;
        this.f1119i = 0.0d;
        this.f1120j = 0.0d;
        this.f1121k = 0.0d;
        this.f1122l = 0.0d;
        HashSet<String> hashSet = new HashSet<>();
        this.f1116f = hashSet;
        hashSet.add("pause");
        hashSet.add("rebufferstart");
        hashSet.add("seeking");
        hashSet.add("adbreakstart");
        hashSet.add("timeupdate");
        hashSet.add("viewend");
        hashSet.add("error");
        HashSet<String> hashSet2 = new HashSet<>();
        this.f1117g = hashSet2;
        hashSet2.add("playing");
        hashSet2.add("timeupdate");
    }

    @Override // com.mux.stats.sdk.core.trackers.BaseAdTracker, com.mux.stats.sdk.core.trackers.BaseTracker
    protected void handlePlaybackEvent(PlaybackEvent playbackEvent) throws JSONException {
        Long playerPlayheadTime;
        Integer num;
        super.handlePlaybackEvent(playbackEvent);
        if (this.f1116f.contains(playbackEvent.getType()) && (playerPlayheadTime = playbackEvent.getPlayerData().getPlayerPlayheadTime()) != null) {
            long jLongValue = playerPlayheadTime.longValue();
            if (!this.isAdBreak && this.f1111a != null && (num = this.f1112b) != null && this.f1113c != null && this.f1114d != null && this.f1115e != null && num.intValue() > 0 && this.f1113c.intValue() > 0 && this.f1114d.intValue() > 0 && this.f1115e.intValue() > 0) {
                long jLongValue2 = jLongValue - this.f1111a.longValue();
                if (jLongValue2 >= 0) {
                    double dMin = Math.min(this.f1112b.intValue() / this.f1114d.intValue(), this.f1113c.intValue() / this.f1115e.intValue());
                    double dMax = Math.max(0.0d, dMin - 1.0d);
                    double dMax2 = Math.max(0.0d, 1.0d - dMin);
                    this.f1119i = Math.max(this.f1119i, dMax);
                    this.f1120j = Math.max(this.f1120j, dMax2);
                    this.f1118h += jLongValue2;
                    double d = jLongValue2;
                    this.f1121k += dMax * d;
                    this.f1122l += dMax2 * d;
                    ViewData viewData = new ViewData();
                    viewData.setViewMaxUpscalePercentage(Double.valueOf(this.f1119i));
                    viewData.setViewMaxDownscalePercentage(Double.valueOf(this.f1120j));
                    viewData.setViewTotalContentPlaybackTime(Long.valueOf(this.f1118h));
                    viewData.setViewTotalUpscaling(Double.valueOf(this.f1121k));
                    viewData.setViewTotalDownscaling(Double.valueOf(this.f1122l));
                    dispatch(new ViewMetricEvent(viewData));
                }
            }
            this.f1111a = null;
        }
        if (this.f1117g.contains(playbackEvent.getType())) {
            PlayerData playerData = playbackEvent.getPlayerData();
            this.f1111a = playerData.getPlayerPlayheadTime();
            this.f1112b = playerData.getPlayerWidth();
            this.f1113c = playerData.getPlayerHeight();
            VideoData videoData = playbackEvent.getVideoData();
            this.f1114d = videoData.getVideoSourceWidth();
            this.f1115e = videoData.getVideoSourceHeight();
        }
    }
}
